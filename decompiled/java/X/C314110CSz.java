package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager$executeWriteTask$2$1", f = "BulletinTaskManager.kt", l = {44, 45}, m = "invokeSuspend")
public final class C314110CSz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ C0CT6 LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C314110CSz(C0CT6 c0ct6, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C314110CSz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ct6;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314110CSz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinTaskManager@936c.executeWriteTask$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLIZLLL = this.LLILLJJLI.LIZLLL();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2$1");
                return objLJFF;
            }
        }
        Function1<InterfaceC1364105Vn<Object>, Object> function1 = this.LLILLL;
        this.LL = 2;
        obj = function1.invoke(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
