package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244940iVA {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(BaseSharePackage baseSharePackage) {
        String str;
        SharePackage sharePackage;
        Integer numValueOf;
        if (C1250860iei.LIZ(baseSharePackage)) {
            SharePackage sharePackage2 = null;
            if (baseSharePackage != null) {
                str = baseSharePackage.itemType;
            } else {
                str = null;
            }
            ShareService shareService = C621180OYa.LIZ;
            boolean z = baseSharePackage instanceof SharePackage;
            if (z) {
                sharePackage = (SharePackage) baseSharePackage;
            } else {
                sharePackage = null;
            }
            Aweme awemeLJJIJIL = shareService.LJJIJIL(sharePackage);
            if (awemeLJJIJIL != null) {
                numValueOf = Integer.valueOf(awemeLJJIJIL.getAwemeType());
            } else {
                numValueOf = null;
            }
            if ((numValueOf == null || (numValueOf.intValue() != 501 && numValueOf.intValue() != 502)) && (Intrinsics.LJFF(str, "aweme") || Intrinsics.LJFF(str, "aweme_photo"))) {
                ShareService shareService2 = C621180OYa.LIZ;
                if (z) {
                    sharePackage2 = (SharePackage) baseSharePackage;
                }
                Aweme awemeLJJIJIL2 = shareService2.LJJIJIL(sharePackage2);
                if (awemeLJJIJIL2 != null && AwemeExtKt.isPrivate(awemeLJJIJIL2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
