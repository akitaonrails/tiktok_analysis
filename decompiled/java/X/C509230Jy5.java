package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import avg.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.subscribe.model.BannerBackground;
import com.bytedance.android.livesdk.subscribe.model.SubLiveBanner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0Jy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C509230Jy5 {
    public static final void LIZ(float f, final SubLiveBanner subLiveBanner, final C509550Jyb c509550Jyb, C19R6 c19r6, final C16F5 c16f5, LiveIconView liveIconView, Function0<Unit> function0, final Function0<Unit> function02) {
        boolean z;
        String str;
        BannerBackground bannerBackground;
        String str2;
        BannerBackground bannerBackground2;
        ImageModel imageModel;
        List<String> listLIZ;
        String str3;
        BannerBackground bannerBackground3;
        String str4;
        ImageModel imageModel2;
        List<String> listLIZ2;
        List<String> listLIZ3;
        if (subLiveBanner == null) {
            return;
        }
        ImageModel imageModel3 = subLiveBanner.image;
        if (imageModel3 != null && (listLIZ3 = C842240X2g.LIZ(imageModel3)) != null && (!listLIZ3.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BannerBackground bannerBackground4 = subLiveBanner.bannerBackground;
            if (bannerBackground4 == null || (str3 = bannerBackground4.leftBackgroundColor) == null || str3.length() == 0 || (bannerBackground3 = subLiveBanner.bannerBackground) == null || (str4 = bannerBackground3.leftBackgroundColor) == null || str4.length() == 0 || (imageModel2 = subLiveBanner.image) == null || (listLIZ2 = C842240X2g.LIZ(imageModel2)) == null || listLIZ2.isEmpty()) {
                return;
            }
        } else {
            BannerBackground bannerBackground5 = subLiveBanner.bannerBackground;
            if (bannerBackground5 == null || (str = bannerBackground5.leftBackgroundColor) == null || str.length() == 0 || (bannerBackground = subLiveBanner.bannerBackground) == null || (str2 = bannerBackground.leftBackgroundColor) == null || str2.length() == 0 || (bannerBackground2 = subLiveBanner.bannerBackground) == null || (imageModel = bannerBackground2.backgroundImage) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || listLIZ.isEmpty()) {
                return;
            }
        }
        function0.invoke();
        if (c509550Jyb != null) {
            C500260Jjc.LLFFF(c509550Jyb);
        }
        C1819620xS4.LIZ().LJIIIZ(subLiveBanner.image).LJJI(c19r6);
        int iLIZIZ = (int) C497740JfY.LIZIZ(f);
        if (C497740JfY.LJJ()) {
            if (c19r6 != null) {
                c19r6.LIZJ(iLIZIZ, iLIZIZ, 0, 0);
            }
        } else if (c19r6 != null) {
            c19r6.LIZJ(0, 0, iLIZIZ, iLIZIZ);
        }
        if (subLiveBanner.title.length() == 0) {
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
            }
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 8);
            }
        } else if (c16f5 != null) {
            c16f5.setText(subLiveBanner.title);
        }
        try {
            String strLIZLLL = subLiveBanner.textColor;
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            if (strLIZLLL.length() == 9) {
                strLIZLLL = C0JS0.LIZLLL(strLIZLLL);
            }
            int iLIZJ = C0JS0.LIZJ(strLIZLLL);
            if (c16f5 != null) {
                c16f5.setTextColor(iLIZJ);
            }
            if (liveIconView != null) {
                liveIconView.setIconTint(iLIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (c16f5 != null) {
            final int currentTextColor = c16f5.getCurrentTextColor();
            HandlerHook.viewPost(c16f5, new Runnable() { // from class: X.0DTQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BindSubFestBannerKt@456f.adjustFontSizeForTitleIfNeeded$1$1");
                    try {
                        c16f5.invalidate();
                        if (c16f5.getLineCount() > 1) {
                            C1119920fFW.LJFF(c16f5, 8, OppoPermissionPopupMaskDelayExp.DEFAULT);
                            c16f5.setTextColor(currentTextColor);
                            c16f5.setMaxLines(1);
                            c16f5.setEllipsize(TextUtils.TruncateAt.END);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BindSubFestBannerKt@456f.adjustFontSizeForTitleIfNeeded$1$1");
                }
            });
        }
        if (c509550Jyb != null) {
            C786410Ut5.LJLLLLLL(0, c509550Jyb);
        }
        EnumC509250Jy7 enumC509250Jy7 = EnumC509250Jy7.HOST_SUBSCRIPTION_PANEL;
        String str5 = subLiveBanner.activityName;
        String strValueOf = String.valueOf(subLiveBanner.id);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_campaign_container_show");
        c474500IjALIZ.LJJII(enumC509250Jy7.getValue(), "event_page");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str5, "activity_name");
        if (strValueOf != null) {
            c474500IjALIZ.LJJII(strValueOf, "banner_id");
        }
        c474500IjALIZ.LIZ();
        if (c509550Jyb == null) {
            return;
        }
        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0Jy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str6;
                C0K8F c0k8f = C0K8F.LIZ;
                Context context = c509550Jyb.getContext();
                SubLiveBanner subLiveBanner2 = subLiveBanner;
                String str7 = subLiveBanner2.schemaUrl;
                Pair[] pairArr = new Pair[1];
                if (subLiveBanner2.hideNavigationBar) {
                    str6 = "1";
                } else {
                    str6 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[0] = new Pair("hide_nav_bar", str6);
                HashMap mapLJI = C2097608Jq.LJI(pairArr);
                c0k8f.getClass();
                C0K8F.LJII(context, str7, mapLJI);
                function02.invoke();
            }
        };
        if (C1848410yCV.LIZ) {
            fVar = new f(fVar);
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c509550Jyb);
        }
        c509550Jyb.setOnClickListener(aVar);
        c509550Jyb.setBackground(subLiveBanner.bannerBackground);
    }
}
