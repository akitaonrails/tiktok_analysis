package X;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPostModeService;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.List;

/* JADX INFO: renamed from: X.0T1R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T1R {
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r2
      0x001c: PHI (r2v1 int) = (r2v0 int), (r2v3 int) binds: [B:12:0x0019, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(X.C0RJN r3) {
        /*
            if (r3 == 0) goto L18
            X.1An6 r0 = r3.LIZJ
            if (r0 == 0) goto L18
            int r2 = r0.getPageType()
        La:
            X.1An6 r0 = r3.LIZJ
            if (r0 == 0) goto L1c
            java.lang.String r1 = r0.getEventType()
        L12:
            r0 = 1
            java.lang.String r0 = X.C735610StL.LIZ(r2, r1, r0)
            return r0
        L18:
            r2 = 0
            if (r3 == 0) goto L1c
            goto La
        L1c:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0T1R.LIZ(X.0RJN):java.lang.String");
    }

    public static final IFeedPanelPlatformAbility LIZJ(Fragment fragment) {
        InterfaceC665370Q7z interfaceC665370Q7zLJ = C1578630rBN.LJ(fragment);
        if (interfaceC665370Q7zLJ == null) {
            return null;
        }
        return (IFeedPanelPlatformAbility) C1558520qew.LIZ(interfaceC665370Q7zLJ, IFeedPanelPlatformAbility.class, null);
    }

    public static final IViewPagerComponentAbility LIZLLL(Fragment fragment) {
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ = LIZJ(fragment);
        if (iFeedPanelPlatformAbilityLIZJ != null) {
            return iFeedPanelPlatformAbilityLIZJ.Mb();
        }
        return null;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme != null) {
            if (AwemeExtKt.isAdTraffic(aweme) || C1017070cZd.LLIZLLLIL(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJFF(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        IPostModeService iPostModeService = (IPostModeService) ServiceManager.get().getService(IPostModeService.class);
        if (aweme == null || aweme.getAwemeType() != 150 || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.size() <= 0 || C0B1V.LIZ() || !iPostModeService.LJIJJLI() || AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        return true;
    }

    @InterfaceC1294060jmO
    public static final boolean LJI(String str) {
        if (!TextUtils.equals(str, "homepage_hot") && !C2277711EDh.LIZIZ.LIZJ(str)) {
            return false;
        }
        return true;
    }

    public static final int LIZIZ(Activity activity, Fragment fragment) {
        Fragment fragmentLIZLLL;
        if (fragment != null) {
            IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
            if (iDetailFeedSafService != null) {
                fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment);
            } else {
                fragmentLIZLLL = null;
            }
            if (fragmentLIZLLL instanceof InterfaceC1058480deQ) {
                return 2;
            }
        }
        if (activity != null) {
            if (activity instanceof InterfaceC1603190roz) {
                return 1;
            }
            if (activity instanceof InterfaceC1058480deQ) {
                return 2;
            }
            return -1;
        }
        return -1;
    }

    public static final void LJII(C2189821An6 c2189821An6, String str) {
        String from;
        String str2;
        String str3;
        String str4;
        String hotEnterMethod = null;
        if (c2189821An6 != null) {
            from = c2189821An6.getFrom();
            hotEnterMethod = c2189821An6.getHotEnterMethod();
        } else {
            from = null;
        }
        try {
            C0T1S.LIZ.getClass();
            if (C0T1S.LIZIZ(from, hotEnterMethod, "", "") && !C0T1S.LJIIIZ) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZLLL(jCurrentTimeMillis - C0T1S.LIZIZ, "duration");
                c2344009Gk.LIZJ(C0T1S.LIZJ, "page_size");
                c2344009Gk.LJIIIIZZ("card_status", C0T1S.LIZLLL);
                c2344009Gk.LJIIIIZZ("click_area", C0T1S.LJ);
                String str5 = "1";
                if (C0T1S.LJI) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("detail_page_created", str2);
                if (C0T1S.LJIIIIZZ) {
                    str3 = "1";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("video_view_cell_created", str3);
                if (C0T1S.LJII) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("try_play", str4);
                if (!C0T1S.LJIIJ) {
                    str5 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("render_first_frame", str5);
                c2344009Gk.LIZJ(C0T1S.LJFF, "single_player");
                c2344009Gk.LJIIIIZZ("enter_from", hotEnterMethod);
                c2344009Gk.LJIIIIZZ("error_msg", str);
                C20684815ws.LJIILLIIL("rd_tiktokec_mall_video_page_exited", c2344009Gk.LIZ);
                C0T1S.LJIIIZ = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
