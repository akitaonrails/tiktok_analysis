package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.scheduler.IMCameraCoreScheduler$resetTiming$1", f = "IMCameraCoreScheduler.kt", l = {49, 122}, m = "invokeSuspend")
public final class C1783810wWJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C1783850wWN LLILLJJLI;
    public C0N6K LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1783850wWN LLILZIL;
    public final /* synthetic */ C0N6K LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783810wWJ(C1783850wWN c1783850wWN, C0N6K c0n6k, InterfaceC1364105Vn<? super C1783810wWJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1783850wWN;
        this.LLILZLL = c0n6k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783810wWJ(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1783850wWN c1783850wWN;
        C1DEV c1dev;
        C0N6K c0n6k;
        C1C7U.LIZ("IMCameraCoreScheduler@e2e2.resetTiming$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c0n6k = this.LLILLL;
                        c1783850wWN = this.LLILLJJLI;
                        c1dev = this.LL;
                        C155000ia.LIZIZ(obj);
                        c1783850wWN.LIZLLL.remove(c0n6k);
                        C1783840wWM c1783840wWM = c1783850wWN.LIZIZ;
                        C23250099c.LIZLLL(c1783840wWM.LIZ, null, null, new C1783790wWH(c1783840wWM, c0n6k, EnumC1778630wNx.INITIAL, null), 3);
                        c1dev.LIZIZ(null);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.resetTiming$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1783850wWN c1783850wWN2 = this.LLILZIL;
                C0N6K c0n6k2 = this.LLILZLL;
                this.LLILZ = 1;
                obj = c1783850wWN2.LIZ(c0n6k2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.resetTiming$1");
                    return objLJFF;
                }
            }
            c1783850wWN.LIZLLL.remove(c0n6k);
            C1783840wWM c1783840wWM2 = c1783850wWN.LIZIZ;
            C23250099c.LIZLLL(c1783840wWM2.LIZ, null, null, new C1783790wWH(c1783840wWM2, c0n6k, EnumC1778630wNx.INITIAL, null), 3);
            c1dev.LIZIZ(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.resetTiming$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
        ((C09AE) obj).LIZIZ(null);
        c1783850wWN = this.LLILZIL;
        c1dev = c1783850wWN.LIZJ;
        c0n6k = this.LLILZLL;
        this.LL = c1dev;
        this.LLILLJJLI = c1783850wWN;
        this.LLILLL = c0n6k;
        this.LLILZ = 2;
        if (c1dev.LIZLLL(null, this) == objLJFF) {
            C1C7U.LIZIZ("IMCameraCoreScheduler@e2e2.resetTiming$1");
            return objLJFF;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
