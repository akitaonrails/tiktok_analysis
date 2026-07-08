package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0caQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017560caQ implements InterfaceC988770bpz {
    public static final C1017560caQ LIZ = new C1017560caQ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1017590caT());
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"card", "link", "egg"});

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1017570caR r13) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017560caQ.LJFF(X.0caR):void");
    }

    @Override // X.InterfaceC988770bpz
    public final void LIZ(List<? extends Aweme> list) {
        Long creativeId;
        String logExtra;
        UrlModel redImageUrl;
        List<String> urlList;
        Long creativeId2;
        String logExtra2;
        AwemeRawAd awemeRawAd;
        if (list != null) {
            ArrayList<Aweme> arrayList = new ArrayList();
            for (Aweme aweme : list) {
                Aweme aweme2 = aweme;
                if (AwemeExtKt.isAdTraffic(aweme2) && (awemeRawAd = aweme2.getAwemeRawAd()) != null && awemeRawAd.getCardInfos() != null) {
                    arrayList.add(aweme);
                }
            }
            for (Aweme aweme3 : arrayList) {
                AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    creativeId2 = awemeRawAd2.getCreativeId();
                } else {
                    creativeId2 = null;
                }
                AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                if (awemeRawAd3 != null) {
                    logExtra2 = awemeRawAd3.getLogExtra();
                } else {
                    logExtra2 = null;
                }
                LJ(-1, creativeId2, "card", "data_received", logExtra2, aweme3.getAid());
            }
            ArrayList<Aweme> arrayList2 = new ArrayList();
            for (Aweme aweme4 : list) {
                AwemeRawAd awemeRawAd4 = aweme4.getAwemeRawAd();
                if (awemeRawAd4 != null && Intrinsics.LJFF(awemeRawAd4.getType(), "redpacket") && (redImageUrl = awemeRawAd4.getRedImageUrl()) != null && (urlList = redImageUrl.getUrlList()) != null && (!urlList.isEmpty())) {
                    arrayList2.add(aweme4);
                }
            }
            for (Aweme aweme5 : arrayList2) {
                AwemeRawAd awemeRawAd5 = aweme5.getAwemeRawAd();
                if (awemeRawAd5 != null) {
                    creativeId = awemeRawAd5.getCreativeId();
                } else {
                    creativeId = null;
                }
                AwemeRawAd awemeRawAd6 = aweme5.getAwemeRawAd();
                if (awemeRawAd6 != null) {
                    logExtra = awemeRawAd6.getLogExtra();
                } else {
                    logExtra = null;
                }
                LJ(-1, creativeId, "redpacket", "data_received", logExtra, aweme5.getAid());
            }
        }
    }

    public static void LIZLLL(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            LJ(i, awemeRawAd.getCreativeId(), "redpacket", "preload_result", awemeRawAd.getLogExtra(), aweme.getAid());
        }
    }

    @Override // X.InterfaceC988770bpz
    public final void LIZIZ(Aweme aweme, LinkData linkData) {
        if (aweme != null && linkData != null) {
            String str = linkData.creativeId;
            String str2 = linkData.logExtra;
            String aid = aweme.getAid();
            C1017570caR c1017570caR = new C1017570caR("link", "show_result", 0, System.currentTimeMillis());
            c1017570caR.LJ = aid;
            c1017570caR.LJFF = str;
            c1017570caR.LJI = str2;
            LJFF(c1017570caR);
        }
    }

    public static String LIZJ(String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        sbLIZ.append('_');
        sbLIZ.append(str3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(int i, Long l, String str, String str2, String str3, String str4) {
        String string;
        if (l == null || (string = l.toString()) == null) {
            string = "-1";
        }
        C1017570caR c1017570caR = new C1017570caR(str, str2, i, System.currentTimeMillis());
        c1017570caR.LJ = str4;
        c1017570caR.LJFF = string;
        c1017570caR.LJI = str3;
        LJFF(c1017570caR);
    }
}
