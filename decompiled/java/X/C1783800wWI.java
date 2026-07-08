package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.scheduler.IMCameraCoreScheduler$updateTiming$1", f = "IMCameraCoreScheduler.kt", l = {41}, m = "invokeSuspend")
public final class C1783800wWI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1783850wWN LLILLJJLI;
    public final /* synthetic */ C0N6K LLILLL;
    public final /* synthetic */ EnumC1778630wNx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783800wWI(C1783850wWN c1783850wWN, C0N6K c0n6k, EnumC1778630wNx enumC1778630wNx, InterfaceC1364105Vn<? super C1783800wWI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1783850wWN;
        this.LLILLL = c0n6k;
        this.LLILZ = enumC1778630wNx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783800wWI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMCameraCoreScheduler@e2e2.updateTiming$1");
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
            C1783850wWN c1783850wWN = this.LLILLJJLI;
            C0N6K c0n6k = this.LLILLL;
            this.LL = 1;
            obj = c1783850wWN.LIZ(c0n6k, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.updateTiming$1");
                return objLJFF;
            }
        }
        ((C05XL) obj).LJIIZILJ(this.LLILZ);
        C1783840wWM c1783840wWM = this.LLILLJJLI.LIZIZ;
        C23250099c.LIZLLL(c1783840wWM.LIZ, null, null, new C1783790wWH(c1783840wWM, this.LLILLL, this.LLILZ, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.updateTiming$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
