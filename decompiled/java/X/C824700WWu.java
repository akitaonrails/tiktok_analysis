package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: X.0WWu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "androidx.room.RoomDatabaseKt$withTransaction$2", f = "RoomDatabase.kt", l = {58}, m = "invokeSuspend")
public final class C824700WWu<R> extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super R>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC796540VMm LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super R>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C824700WWu(AbstractC796540VMm abstractC796540VMm, Function1<? super InterfaceC1364105Vn<? super R>, ? extends Object> function1, InterfaceC1364105Vn<? super C824700WWu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC796540VMm;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C824700WWu c824700WWu = new C824700WWu(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c824700WWu.LLILLJJLI = obj;
        return c824700WWu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C824900WXo c824900WXo;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c824900WXo = (C824900WXo) this.LLILLJJLI;
                    try {
                        C155000ia.LIZIZ(obj);
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LLILLL.endTransaction();
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c824900WXo = (C824900WXo) ((InterfaceC497601wk) this.LLILLJJLI).getCoroutineContext().get(C824900WXo.LLILZ);
                c824900WXo.LLILLL.incrementAndGet();
                this.LLILLL.beginTransaction();
                try {
                    Function1<InterfaceC1364105Vn<? super R>, Object> function1 = this.LLILZ;
                    this.LLILLJJLI = c824900WXo;
                    this.LL = 1;
                    obj = function1.invoke(this);
                    if (obj == objLJFF) {
                        return objLJFF;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLL.endTransaction();
                        throw th;
                    }
                }
            }
            this.LLILLL.setTransactionSuccessful();
            try {
                this.LLILLL.endTransaction();
                int iDecrementAndGet = c824900WXo.LLILLL.decrementAndGet();
                if (iDecrementAndGet >= 0) {
                    if (iDecrementAndGet == 0) {
                        c824900WXo.LL.LIZIZ(null);
                    }
                    return obj;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
                int iDecrementAndGet2 = c824900WXo.LLILLL.decrementAndGet();
                if (iDecrementAndGet2 >= 0) {
                    if (iDecrementAndGet2 == 0) {
                        c824900WXo.LL.LIZIZ(null);
                    }
                    throw th;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Object obj) {
        return ((a) create(interfaceC497601wk, (InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }
}
