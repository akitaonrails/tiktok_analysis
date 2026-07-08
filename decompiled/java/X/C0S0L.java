package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S0L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S0L {
    public static final C0S0L LIZ = new C0S0L();

    public static boolean LIZ(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            int[] iArr = C0S0P.LIZ;
            int[] iArr2 = (int[]) c0c64LJIILLIIL.LJJII(int[].class, iArr, "commerce_view_holder_support_list", true);
            if (iArr2 != null) {
                iArr = iArr2;
            }
            if (C13LQ.LJJIJ(aweme.getAwemeType(), iArr) >= 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(C690870R8b c690870R8b) {
        if (!Intrinsics.LJFF(c690870R8b.LIZ(), "cell_commerce") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_revamp_label_commerce") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_commerce_detail") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_photos") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_multi_content_horizon_card")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(X.C711340RvI r18) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S0L.LIZJ(X.0RvI):boolean");
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 104 && LJII(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        CardInsertInfo cardInsertInfo;
        if (aweme != null && aweme.getAwemeType() == 104 && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 47) {
            AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ != null && awemeRawAdLJJIJLIJ.getGalleryCardType() == 1) {
                return true;
            }
            AwemeRawAd awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme);
            if (awemeRawAdLJJIJLIJ2 != null && awemeRawAdLJJIJLIJ2.getGalleryCardType() == 2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJFF(C690870R8b c690870R8b) {
        boolean z;
        if (!Intrinsics.LJFF(c690870R8b.LIZ(), "cell_feed") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_detail") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_follow")) {
            z = false;
        } else {
            z = true;
        }
        if (LIZIZ(c690870R8b) || !z) {
            return false;
        }
        return true;
    }

    public static boolean LJI(C690870R8b c690870R8b) {
        if (!LIZIZ(c690870R8b) && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_mid_roll") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_photos") && !Intrinsics.LJFF(c690870R8b.LIZ(), "cell_multi_content_horizon_card")) {
            return false;
        }
        return true;
    }

    public static boolean LJII(Aweme aweme) {
        CardInsertInfo cardInsertInfo;
        if (aweme != null && (cardInsertInfo = aweme.getCardInsertInfo()) != null && cardInsertInfo.getCardType() == 59) {
            return true;
        }
        return false;
    }
}
