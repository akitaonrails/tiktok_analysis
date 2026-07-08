package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.15IE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IE {
    public static final void LIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("creation_id", C15IK.LJ);
        c2344009Gk.LJIIIIZZ("shoot_way", C15IK.LJIIJJI);
        String str = C15IK.LIZ;
        if (str == null) {
            str = "";
        }
        if (a0.LJJIIZI(str, "shoot", false)) {
            str = "shoot_page_upload_song";
        } else if (a0.LJJIIZI(str, "edit", false)) {
            str = "edit_page_upload_song";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
    }
}
