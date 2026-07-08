package X;

import com.ss.android.ugc.ur.socialavatar.SocialAvatarAccess;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lTB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359030lTB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(642));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(641));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        if (((SocialAvatarAccess) LIZIZ.getValue()).LIZLLL()) {
            return LIZ() == 1 || LIZ() == 2;
        }
        return false;
    }
}
