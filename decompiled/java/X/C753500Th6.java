package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Th6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.uikit.remoteimage.GeckoRemoteImage$loader$1$start$1", f = "GeckoRemoteImage.kt", l = {29}, m = "invokeSuspend")
public final class C753500Th6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C753510Th7 LLILLJJLI;
    public final /* synthetic */ C753520Th8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753500Th6(C753510Th7 c753510Th7, C753520Th8 c753520Th8, InterfaceC1364105Vn<? super C753500Th6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c753510Th7;
        this.LLILLL = c753520Th8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753500Th6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC753540ThA interfaceC753540ThA;
        C1C7U.LIZ("GeckoRemoteImage@869c.loader$1$start$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Drawable drawable = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C753490Th5 c753490Th5 = new C753490Th5(this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c753490Th5);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GeckoRemoteImage@869c.loader$1$start$1");
                    return objLJFF;
                }
            }
            drawable = (Drawable) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZ(e.getMessage());
        }
        if (this.LLILLJJLI.LIZIZ && (interfaceC753540ThA = this.LLILLL.LIZ) != null) {
            interfaceC753540ThA.LIZ(drawable);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GeckoRemoteImage@869c.loader$1$start$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
