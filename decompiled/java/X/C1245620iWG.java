package X;

import com.ss.android.ugc.profile.platform.exp.CampusFypAnchor;

/* JADX INFO: renamed from: X.0iWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245620iWG {
    public static final CampusFypAnchor LIZ = new CampusFypAnchor(false, false, false);

    public static boolean LIZ() {
        if (!C289690BXb.LIZ()) {
            return false;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        CampusFypAnchor campusFypAnchor = LIZ;
        CampusFypAnchor campusFypAnchor2 = (CampusFypAnchor) c0c64LJIILLIIL.LJJII(CampusFypAnchor.class, campusFypAnchor, "campus_fyp_anchor", false);
        if (campusFypAnchor2 != null) {
            campusFypAnchor = campusFypAnchor2;
        }
        return campusFypAnchor.enabled;
    }
}
