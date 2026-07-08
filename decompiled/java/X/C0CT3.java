package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CT3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager$executeReadTask$2$1", f = "BulletinTaskManager.kt", l = {77, 78}, m = "invokeSuspend")
public final class C0CT3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ C0CT6 LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CT3(C0CT6 c0ct6, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C0CT3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ct6;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CT3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinTaskManager@936c.executeReadTask$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2$1");
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
                C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2$1");
                return objLJFF;
            }
        }
        Function1<InterfaceC1364105Vn<Object>, Object> function1 = this.LLILLL;
        this.LL = 2;
        obj = function1.invoke(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeReadTask$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
