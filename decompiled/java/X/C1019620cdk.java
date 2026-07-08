package X;

import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS251S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: X.0cdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019620cdk {
    public static final C1045070dIn LIZJ(Aweme aweme) {
        return LIZLLL(aweme, "icon");
    }

    public static final boolean LIZ(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.loaded == z) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == i) {
            return true;
        }
        return false;
    }

    public static final C1045070dIn LIZLLL(Aweme aweme, String str) {
        Sequence sequenceLIZJ;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C1045270dJ7 c1045270dJ7;
        List<C1045260dJ6> list;
        Object obj = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c1045270dJ7 = omVast.vast) != null && (list = c1045270dJ7.creativeList) != null) {
            sequenceLIZJ = C09RB.LJIILIIL(new C1939607ik(list), new AwS251S0000000_16(2));
        } else {
            sequenceLIZJ = C09R4.LIZJ();
        }
        Iterator it2 = sequenceLIZJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C1045070dIn) next).program, str)) {
                obj = next;
                break;
            }
        }
        return (C1045070dIn) obj;
    }

    public static final boolean LJ(Aweme aweme, C430210Gtv c430210Gtv) {
        C1045070dIn c1045070dInLIZJ;
        Set<String> set;
        Object next;
        if (LIZIZ(3, aweme) && (c1045070dInLIZJ = LIZJ(aweme)) != null && (set = c1045070dInLIZJ.staticResource) != null) {
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((String) next).length() > 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(c430210Gtv);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
                return true;
            }
        }
        return false;
    }
}
