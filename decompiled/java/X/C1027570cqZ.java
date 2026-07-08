package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0cqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027570cqZ {
    public static final void LIZ(C1031260cwW c1031260cwW) {
        c1031260cwW.LLILZ = false;
        for (C1027830cqz c1027830cqz : c1031260cwW.LLILZIL) {
            c1031260cwW.trackOMSDK(c1027830cqz.LIZ, c1027830cqz.LIZIZ, c1027830cqz.LIZJ);
        }
        Iterator<Context> it2 = c1031260cwW.LLILZLL.iterator();
        while (it2.hasNext()) {
            c1031260cwW.LIZLLL(it2.next());
        }
        ((ArrayList) c1031260cwW.LLILZIL).clear();
        ((ArrayList) c1031260cwW.LLILZLL).clear();
    }

    public static final void LIZIZ(String str, AwemeRawAd awemeRawAd, final Context context, String str2, InterfaceC1021920chS interfaceC1021920chS) {
        long jLongValue;
        String webUrl;
        int i;
        String str3;
        List list;
        List<String> list2;
        C1027580cqa c1027580cqa = new C1027580cqa();
        c1027580cqa.LIZLLL(str);
        c1027580cqa.LJ(awemeRawAd);
        c1027580cqa.LIZIZ(String.valueOf(awemeRawAd.getAdType()));
        c1027580cqa.LJJIJL("draw_ad");
        c1027580cqa.LJJIJ(str2);
        Long creativeId = awemeRawAd.getCreativeId();
        long jLongValue2 = 0;
        if (creativeId != null) {
            jLongValue = creativeId.longValue();
        } else {
            jLongValue = 0;
        }
        c1027580cqa.LJI(jLongValue);
        c1027580cqa.LJIJJ(awemeRawAd.getLogExtra());
        Long groupId = awemeRawAd.getGroupId();
        if (groupId != null) {
            jLongValue2 = groupId.longValue();
        }
        c1027580cqa.LJIILIIL(jLongValue2);
        NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig == null || (webUrl = nativeSiteConfig.lynxScheme) == null) {
            webUrl = awemeRawAd.getWebUrl();
        }
        c1027580cqa.LJJJIL(webUrl);
        boolean zBooleanValue = true;
        c1027580cqa.LJJII(true);
        String json = GsonProtectorUtils.toJson(C09C2.LIZ(), awemeRawAd.getBrowserConfig());
        String str4 = "";
        if (json == null) {
            json = "";
        }
        c1027580cqa.LJFF(json);
        c1027580cqa.LJJJ(awemeRawAd.getWebTitle());
        c1027580cqa.LJJIJIL(awemeRawAd.isReportEnable());
        Boolean useOrdinaryWeb_ = awemeRawAd.getUseOrdinaryWeb_();
        if (useOrdinaryWeb_ != null) {
            zBooleanValue = useOrdinaryWeb_.booleanValue();
        }
        c1027580cqa.LJJIJLIJ(zBooleanValue);
        c1027580cqa.LJJJI(awemeRawAd.getWebType());
        c1027580cqa.LIZ.LIZIZ.LJIILJJIL = System.currentTimeMillis();
        String landingPageInfo = awemeRawAd.getLandingPageInfo();
        if (landingPageInfo == null) {
            landingPageInfo = "";
        }
        c1027580cqa.LJIIZILJ(landingPageInfo);
        awemeRawAd.getNativeSiteConfig();
        c1027580cqa.LJJIJIIJI();
        String nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
        if (nativeSiteCustomData == null) {
            nativeSiteCustomData = "";
        }
        c1027580cqa.LJJIFFI(nativeSiteCustomData);
        String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
        if (nativeSiteAdInfo == null) {
            nativeSiteAdInfo = "";
        }
        c1027580cqa.LJJ(nativeSiteAdInfo);
        String appData = awemeRawAd.getAppData();
        if (appData == null) {
            appData = "";
        }
        c1027580cqa.LJJI(appData);
        NativeSiteConfig nativeSiteConfig2 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig2 != null) {
            i = nativeSiteConfig2.lynxLandingStyle;
        } else {
            i = 0;
        }
        c1027580cqa.LJIL(i);
        NativeSiteConfig nativeSiteConfig3 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig3 == null || (list2 = nativeSiteConfig3.geckoChannel) == null || (str3 = (String) C13LP.LJJJLZIJ(0, list2)) == null) {
            str3 = "";
        }
        c1027580cqa.LJIJJLI(str3);
        c1027580cqa.LJJIIJZLJL(awemeRawAd.getPreloadWeb());
        c1027580cqa.LIZ.LIZIZ.LJIIIZ = awemeRawAd.getPreloadWebNew();
        String channelName = awemeRawAd.getChannelName();
        if (channelName != null) {
            str4 = channelName;
        }
        c1027580cqa.LJJIZ(str4);
        NativeSiteConfig nativeSiteConfig4 = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig4 == null || (list = nativeSiteConfig4.secondPageGeckoChannel) == null) {
            list = C13BV.INSTANCE;
        }
        c1027580cqa.LJJIJIIJIL(list);
        c1027580cqa.LJJIIZ(awemeRawAd.getPreloadWebSecondPage());
        c1027580cqa.LJJIII(awemeRawAd.getOpenUrl());
        c1027580cqa.LJIIJ(awemeRawAd.getDownloadUrl());
        c1027580cqa.LJJIIZI(awemeRawAd.getQuickAppUrl());
        c1027580cqa.LJIIIZ(awemeRawAd.getOpenUrl());
        c1027580cqa.LJIIL(awemeRawAd.getWebUrl());
        c1027580cqa.LJIIJJI(awemeRawAd.getWebTitle());
        c1027580cqa.LJJIIJ(awemeRawAd.getPackageName());
        c1027580cqa.LIZJ(awemeRawAd.getAppName());
        c1027580cqa.LJII(awemeRawAd.isDisableDownloadDialog());
        c1027580cqa.LJIIIIZZ(awemeRawAd.getDownloadMode());
        c1027580cqa.LJIJI(awemeRawAd.getLinkMode());
        c1027580cqa.LJIILL(awemeRawAd.isSupportMultiple());
        C1027480cqQ c1027480cqQ = c1027580cqa.LIZ;
        C1027490cqR c1027490cqR = new C1027490cqR();
        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
        c1027490cqR.LIZIZ(context);
        c1027490cqR.LIZ(new C1027260cq4());
        c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqX
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                C1027410cqJ.LJ(context, z, c1027480cqQ2);
            }
        });
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
        c1027490cqR.LIZ(new C1027270cq5());
        c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(new AwS382S0200000_16(interfaceC1021920chS, c1027480cqQ, 25)));
        c1027490cqR.LIZ.LIZ();
    }
}
