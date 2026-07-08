package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0vQ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741470vQ1 {
    public static final C1741470vQ1 LIZ = new C1741470vQ1();

    public static C1740600vOc LIZ(Fragment fragment, int i, BcmParams bcmParams) {
        String strLIZIZ;
        String strLIZIZ2;
        if (C7879035x.LIZLLL()) {
            if (fragment != null) {
                if (i != 1) {
                    if (i != 3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(EnumC1741460vQ0.NO_ANCHOR_VIDEO_GUIDE.getCCode());
                        sbLIZ.append('.');
                        sbLIZ.append(EnumC1741490vQ3.NO_ANCHOR_VIDEO_GUIDE_BUTTON.getDCode());
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(EnumC1741460vQ0.ANCHOR_VIDEO_GUIDE_BOTTOM_BTN.getCCode());
                        sbLIZ2.append('.');
                        sbLIZ2.append(EnumC1741490vQ3.ANCHOR_VIDEO_GUIDE_BOTTOM_BTN.getDCode());
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(EnumC1741460vQ0.ANCHOR_VIDEO_GUIDE.getCCode());
                    sbLIZ3.append('.');
                    sbLIZ3.append(EnumC1741490vQ3.ANCHOR_VIDEO_GUIDE_BUTTON.getDCode());
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                }
                C21244318Bt c21244318Bt = new C21244318Bt();
                c21244318Bt.LIZ = strLIZIZ2;
                c21244318Bt.LIZIZ = PageFinder.via(fragment);
                c21244318Bt.LIZJ = bcmParams;
                return new C1740600vOc(c21244318Bt, null);
            }
            IEcUgBtmService iEcUgBtmService = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
            if (iEcUgBtmService == null) {
                return null;
            }
            iEcUgBtmService.LIZIZ(EnumC1741430vPx.VIDEO_GUIDE, EnumC1741440vPy.VIDEO_GUIDE_BUTTON, EnumC683940QsC.FRAGMENT_NULL.getMsg());
            return null;
        }
        try {
            if (fragment != null) {
                if (i != 1) {
                    if (i == 3) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(EnumC1741460vQ0.ANCHOR_VIDEO_GUIDE_BOTTOM_BTN.getCCode());
                        sbLIZ4.append('.');
                        sbLIZ4.append(EnumC1741490vQ3.ANCHOR_VIDEO_GUIDE_BOTTOM_BTN.getDCode());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(EnumC1741460vQ0.NO_ANCHOR_VIDEO_GUIDE.getCCode());
                        sbLIZ5.append('.');
                        sbLIZ5.append(EnumC1741490vQ3.NO_ANCHOR_VIDEO_GUIDE_BUTTON.getDCode());
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    }
                } else {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(EnumC1741460vQ0.ANCHOR_VIDEO_GUIDE.getCCode());
                    sbLIZ6.append('.');
                    sbLIZ6.append(EnumC1741490vQ3.ANCHOR_VIDEO_GUIDE_BUTTON.getDCode());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                }
                C21244318Bt c21244318Bt2 = new C21244318Bt();
                c21244318Bt2.LIZ = strLIZIZ;
                c21244318Bt2.LIZIZ = PageFinder.via(fragment);
                c21244318Bt2.LIZJ = bcmParams;
                return new C1740600vOc(c21244318Bt2, null);
            }
            IEcUgBtmService iEcUgBtmService2 = (IEcUgBtmService) PluggableExtentionKt.pluggableSpi$default(IEcUgBtmService.class, false, false, false, 14, null);
            if (iEcUgBtmService2 == null) {
                return null;
            }
            iEcUgBtmService2.LIZIZ(EnumC1741430vPx.VIDEO_GUIDE, EnumC1741440vPy.VIDEO_GUIDE_BUTTON, EnumC683940QsC.FRAGMENT_NULL.getMsg());
            return null;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
