package X;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0mrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412390mrF {
    public static final C1412390mrF LIZIZ = new C1412390mrF("mv_page");
    public static final C1412390mrF LIZJ = new C1412390mrF("autocut_anchor");
    public static final C1412390mrF LIZLLL = new C1412390mrF("ugc_template");
    public static final C1412390mrF LJ = new C1412390mrF("pugc_template");
    public static final C1412390mrF LJFF = new C1412390mrF("eoy_anchor");
    public static final C1412390mrF LJI = new C1412390mrF("mv");
    public static final C1412390mrF LJII = new C1412390mrF("mv_search");
    public static final C1412390mrF LJIIIIZZ = new C1412390mrF("pugc_create");
    public static final C1412390mrF LJIIIZ = new C1412390mrF("ugc_create");
    public static final C1412390mrF LJIIJ = new C1412390mrF("autocut");
    public static final C1412390mrF LJIIJJI = new C1412390mrF("autocut_mix_editing");
    public static final C1412390mrF LJIIL = new C1412390mrF("autocut_editor_tab");
    public static final C1412390mrF LJIILIIL = new C1412390mrF("autocut_upload_page");
    public static final C1412390mrF LJIILJJIL = new C1412390mrF("autocut_edit_page");
    public static final C1412390mrF LJIILL = new C1412390mrF("mdp_square");
    public static final C1412390mrF LJIILLIIL = new C1412390mrF("schema_event");
    public static final C1412390mrF LJIIZILJ = new C1412390mrF("eoy");
    public static final C1412390mrF LJIJ = new C1412390mrF("autocut_aipick_panel");
    public static final C1412390mrF LJIJI = new C1412390mrF("ai_agent");
    public static final C1412390mrF LJIJJ = new C1412390mrF("lyric_create");
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1412390mrF) && Intrinsics.LJFF(this.LIZ, ((C1412390mrF) obj).LIZ);
    }

    public final boolean LIZIZ() {
        String str = this.LIZ;
        return Intrinsics.LJFF(str, "mv_page") || Intrinsics.LJFF(str, "autocut_anchor") || Intrinsics.LJFF(str, "ugc_template") || Intrinsics.LJFF(str, "pugc_template") || Intrinsics.LJFF(str, "eoy_anchor") || (C298890Bnb.LIZ() && str != null && u.LJIIZILJ(str, "_anchor", false));
    }

    public final C1412390mrF LIZLLL() {
        if (Intrinsics.LJFF(this, LIZIZ)) {
            return new C1412390mrF("mv_anchor");
        }
        if (Intrinsics.LJFF(this, LIZLLL)) {
            return new C1412390mrF("ugc_anchor");
        }
        if (Intrinsics.LJFF(this, LJ)) {
            return new C1412390mrF("pugc_anchor");
        }
        if (u.LJIIZILJ(this.LIZ, "_anchor", false)) {
            return this;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append("_anchor");
        return new C1412390mrF(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZ() {
        return C298890Bnb.LIZ() ? u.LJJIIJZLJL(this.LIZ, "autocut", false) : Intrinsics.LJFF(this, LJIIJ) || Intrinsics.LJFF(this, LIZJ) || Intrinsics.LJFF(this, LJIIJJI) || Intrinsics.LJFF(this, LJIIL) || Intrinsics.LJFF(this, LJIILIIL) || Intrinsics.LJFF(this, LJIILJJIL);
    }

    public final boolean LIZJ() {
        return C298890Bnb.LIZ() ? u.LJJIIJZLJL(this.LIZ, "mv", false) : Intrinsics.LJFF(this, LJI) || Intrinsics.LJFF(this, LIZIZ) || Intrinsics.LJFF(this, LJII);
    }

    public C1412390mrF(String str) {
        this.LIZ = str;
    }
}
