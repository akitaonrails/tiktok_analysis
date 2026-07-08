package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostGiftTrayLayoutFixEnableSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082910eHp {
    public static int LIZ(C956380azk c956380azk, AbstractC1080560eE2 abstractC1080560eE2) {
        int dimensionPixelSize;
        if (c956380azk.LIZ != 0) {
            return 0;
        }
        boolean z = c956380azk.LJIIIIZZ;
        boolean z2 = true;
        if (z) {
            IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
            if (iInteractService.cw1() == 1) {
                if (C497740JfY.LJJ()) {
                    dimensionPixelSize = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajm);
                } else {
                    dimensionPixelSize = abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajl);
                }
                if (iInteractService.PU()) {
                    return dimensionPixelSize - abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajl);
                }
                return dimensionPixelSize;
            }
            if (iInteractService.cw1() == 2) {
                if (C497740JfY.LJJ()) {
                    return abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajo);
                }
                return abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajn);
            }
            return abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajk);
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70().size() < 3) {
            z2 = false;
        }
        if (LiveCohostGiftTrayLayoutFixEnableSetting.INSTANCE.isEnable() && z2) {
            try {
                return abstractC1080560eE2.getContext().getResources().getDimensionPixelSize(R.dimen.ajk);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1546210qL5.LIZ.getClass();
                int iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(30));
                C20441214yg.LJFF("HorizontalVideoResolver", "resolveContentHeightInStream", e);
                return iLIZIZ;
            }
        }
        if (C497740JfY.LJJ()) {
            C1546210qL5.LIZ.getClass();
            return C814420VxA.LIZIZ(C1546210qL5.LIZ(30));
        }
        C1546210qL5.LIZ.getClass();
        return C814420VxA.LIZIZ(C1546210qL5.LIZ(0));
    }
}
