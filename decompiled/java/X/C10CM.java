package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.pns.screen.serviceimpl.PnSDigitalWellbeingSDKServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10CM, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CM extends C09AY implements Function0<InterfaceC1519050pdH> {
    public final /* synthetic */ PnSDigitalWellbeingSDKServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10CM(PnSDigitalWellbeingSDKServiceImpl pnSDigitalWellbeingSDKServiceImpl) {
        super(0);
        this.LL = pnSDigitalWellbeingSDKServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1519050pdH invoke() {
        try {
            return C100C.LIZ.LJFF().LIZIZ(this.LL.LLJI);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
