package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CT0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager$executeWriteTask$2", f = "BulletinTaskManager.kt", l = {43}, m = "invokeSuspend")
public final class C0CT0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public int LL;
    public final /* synthetic */ C0CT6 LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CT0(C0CT6 c0ct6, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C0CT0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ct6;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CT0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BulletinTaskManager@936c.executeWriteTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC2252651DEx abstractC2252651DExLIZ = this.LLILLJJLI.LIZ.LIZ();
            C314110CSz c314110CSz = new C314110CSz(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2252651DExLIZ, c314110CSz);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
