package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CT5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager$executeWriteTaskAsync$1", f = "BulletinTaskManager.kt", l = {60}, m = "invokeSuspend")
public final class C0CT5 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0CT6 LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<Object>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CT5(C0CT6 c0ct6, Function1<? super InterfaceC1364105Vn<Object>, ? extends Object> function1, InterfaceC1364105Vn<? super C0CT5> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c0ct6;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CT5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinTaskManager@936c.executeWriteTaskAsync$1");
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
            C0CT6 c0ct6 = this.LLILLJJLI;
            Function1<InterfaceC1364105Vn<Object>, Object> function1 = this.LLILLL;
            this.LL = 1;
            if (c0ct6.LIZIZ(this, function1) == objLJFF) {
                C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTaskAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTaskAsync$1");
        return unit;
    }
}
