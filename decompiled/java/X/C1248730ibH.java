package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248730ibH {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3964));

    public static boolean LIZIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(boolean z, String str, List list, ProfileComponents profileComponents, boolean z2, int i) {
        ProfileComponents profileComponents2;
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            profileComponents = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if (str != null && !Intrinsics.LJFF(str, "advanced_feature_base_item")) {
            if (list != null && (profileComponents2 = (ProfileComponents) C13LP.LJJJLL(list)) != null) {
                profileComponents = profileComponents2;
            } else if (profileComponents == null) {
                return z;
            }
            if (Intrinsics.LJFF(profileComponents.componentId, "user_account_base_item") && C268330AfP.LIZLLL()) {
                if (!z || !z2) {
                    return false;
                }
            } else {
                String str2 = profileComponents.componentId;
                if (str2 == null) {
                    return z;
                }
                if (z) {
                    if (Intrinsics.LJFF(str2, str)) {
                        return z;
                    }
                    return false;
                }
                if (!Intrinsics.LJFF(profileComponents.componentId, str)) {
                    return z;
                }
            }
            return true;
        }
        return z;
    }
}
