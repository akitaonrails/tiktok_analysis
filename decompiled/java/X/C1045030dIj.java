package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vast.model.AdVerification;
import com.ss.android.ugc.aweme.commercialize.model.AdNodeTrackUrl;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS251S0000000_16;
import kotlin.jvm.internal.AwS67S1000000_16;
import kotlin.sequences.Sequence;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0dIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045030dIj {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new Regex("(\\d+)%");
        new Regex("(\\d{2}):(\\d{2}):(\\d{2})");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.vast.model.AdVerification LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = 0
            if (r2 == 0) goto La
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r2)
            if (r0 != 0) goto Lf
            r1 = 1
        La:
            r0 = 0
            if (r1 != 0) goto L17
            if (r2 == 0) goto L13
        Lf:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
        L13:
            com.bytedance.vast.model.AdVerification r0 = LIZIZ(r0)
        L17:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1045030dIj.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.bytedance.vast.model.AdVerification");
    }

    public static final AdVerification LIZIZ(AwemeRawAd awemeRawAd) {
        List<AdVerification> list;
        C1045270dJ7 c1045270dJ7;
        List<AdVerification> list2;
        AdVerification adVerification;
        C1045270dJ7 c1045270dJ72;
        List<AdVerification> list3;
        OmVast omVast;
        boolean z = false;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            z = true;
        }
        if (z) {
            OmVast omVast2 = awemeRawAd.getOmVast();
            if (omVast2 == null || (c1045270dJ72 = omVast2.vast) == null || (list3 = c1045270dJ72.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) C13LP.LJJJLL(list3);
        }
        if (awemeRawAd == null) {
            return null;
        }
        OmVast omVast3 = awemeRawAd.getOmVast();
        if (omVast3 != null && (c1045270dJ7 = omVast3.vast) != null && (list2 = c1045270dJ7.adVerificationList) != null && (adVerification = (AdVerification) C13LP.LJJJLL(list2)) != null) {
            return adVerification;
        }
        OmVast omVast4 = awemeRawAd.getOmVast();
        if (omVast4 == null || (list = omVast4.adVerificationList) == null) {
            return null;
        }
        return (AdVerification) C13LP.LJJJLL(list);
    }

    public static final boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getOmVast() != null && LIZIZ(awemeRawAd) != null) {
            try {
                if (!C0CLW.LIZIZ.LIZ.getDisableOmSdk().booleanValue()) {
                    return true;
                }
                return false;
            } catch (C316660CbA e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return false;
            }
        }
        return false;
    }

    public static final List<String> LIZJ(int i, AwemeRawAd awemeRawAd) {
        List<AdNodeTrackUrl> adNodeTrackUrlList = awemeRawAd.getAdNodeTrackUrlList();
        if (adNodeTrackUrlList != null && !adNodeTrackUrlList.isEmpty()) {
            for (AdNodeTrackUrl adNodeTrackUrl : adNodeTrackUrlList) {
                if (adNodeTrackUrl.percent == i) {
                    List<String> list = adNodeTrackUrl.urlList;
                    if (list == null) {
                        return C13BV.INSTANCE;
                    }
                    return list;
                }
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    public static final void LJ(final AwemeRawAd awemeRawAd, String str, final String str2) {
        Sequence sequenceLIZJ;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        OmVast omVast2 = null;
        if (awemeRawAd != null) {
            omVast2 = awemeRawAd.getOmVast();
        }
        if (omVast2 != null && omVast2.providerType == 3) {
            if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
                sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(6));
            } else {
                sequenceLIZJ = C09R4.LIZJ();
            }
            C0XJ2.LIZ(new C0XJ4() { // from class: X.0cl5
                @Override // X.C0XJ4
                public final void LIZ(long j, String str3, String str4) {
                    int i = C1045030dIj.LIZ;
                    String str5 = str2;
                    AwemeRawAd awemeRawAd2 = awemeRawAd;
                    if (str5 != null) {
                        C1024100cky c1024100ckyLIZIZ = C1024150cl3.LIZIZ(j, str3, str4);
                        c1024100ckyLIZIZ.LJFF = "track_url";
                        c1024100ckyLIZIZ.LIZ = "track_ad";
                        c1024100ckyLIZIZ.LJ.LIZ("track_label", str5);
                        c1024100ckyLIZIZ.LJFF(awemeRawAd2);
                        c1024100ckyLIZIZ.LJIIJ();
                    }
                }
            }, C09RB.LJJIII(new C08LY(C09RB.LJIIJJI(new C08LY(C09RB.LJIIIZ(sequenceLIZJ, new AwS67S1000000_16(str, 24)), AFwS252S0000000_16.get$arr$(453))), AFwS252S0000000_16.get$arr$(452))), false);
        }
    }
}
