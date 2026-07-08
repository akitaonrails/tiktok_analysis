package X;

/* JADX INFO: renamed from: X.0PbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648050PbP {
    public static final boolean LIZ;

    static {
        new C648050PbP();
        LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_hotspot_auto_play_refactor_disabled", true) == 1;
    }

    public static final boolean LIZ(String str) {
        if (LIZ) {
            C649470Pdh.LIZ.getClass();
            if (C649470Pdh.LJIIZILJ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
