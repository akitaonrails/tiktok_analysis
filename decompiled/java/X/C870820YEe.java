package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.metric.ImSDKMonitorHelper$switchToForeground$1", f = "ImSDKMonitorHelper.kt", l = {}, m = "invokeSuspend")
public final class C870820YEe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C870880YEk LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C870820YEe(C870880YEk c870880YEk, boolean z, InterfaceC1364105Vn<? super C870820YEe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c870880YEk;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C870820YEe(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImSDKMonitorHelper@d970.switchToForeground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LIZIZ.get()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ImSDKMonitorHelper@d970.switchToForeground$1");
            return unit;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToForeground coroutine start isWsConnected ");
        sbLIZ.append(this.LL.LIZ.LJ().LIZ().isWsConnected());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "ImSDKMonitorHelper", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LL.LIZ.LJIIIZ().LJJIJLIJ && this.LL.LIZ.isLogin() && this.LLILLJJLI && (this.LL.LIZ.LJIIIZ().LJJLIIIIJ.LIZ.LIZ || SystemClock.uptimeMillis() - this.LL.LIZJ > Mp4ScreenVideoLoadTimeout.CONTROL)) {
            this.LL.LIZ.LJIIZILJ().getDomain().LIZJ().LLIIJLIL(-2, 10, null, null, false);
            this.LL.LIZJ = SystemClock.uptimeMillis();
        }
        if (this.LL.LIZ.LJIIIZ().LJJJ.LIZ && !this.LL.LIZ.LJ().LIZ().isWsConnected()) {
            this.LL.LIZ.LJIIZILJ().LJ().LIZIZ().LIZLLL();
        }
        this.LL.LIZLLL.getDomain().LIZJ().LJJ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImSDKMonitorHelper@d970.switchToForeground$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
