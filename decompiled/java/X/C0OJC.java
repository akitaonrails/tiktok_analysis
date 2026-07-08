package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OJC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJC {
    public String LIZ = "";
    public int LIZIZ = -1;
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public int LJI = -1;
    public int LJII = -1;
    public String LJIIIIZZ = "";
    public String LJIIIZ = "";
    public String LJIIJ = "";
    public String LJIIJJI = "";
    public String LJIIL = "";
    public String LJIILIIL = "";
    public String LJIILJJIL = "";

    public final void LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "bulletin_board_page");
        c2344009Gk.LJIIIIZZ("entrance_page", this.LIZ);
        c2344009Gk.LJIIIIZZ("message_type", "bulletin");
        c2344009Gk.LIZJ(this.LIZIZ, "is_author");
        c2344009Gk.LJIIIIZZ("message_id", this.LIZJ);
        c2344009Gk.LJIIIIZZ("channel_id", this.LIZLLL);
        c2344009Gk.LJIIIIZZ("channel_status", this.LJ);
        c2344009Gk.LJIIIIZZ("from_user_id", this.LJFF);
        c2344009Gk.LJIIIIZZ("content_type", this.LJIIIIZZ);
        c2344009Gk.LJIIIIZZ("click_type", this.LJIIJ);
        if (Intrinsics.LJFF(this.LJIIJ, "click_post")) {
            c2344009Gk.LJFF("group_id", this.LJIIIZ);
        }
        if (Intrinsics.LJFF(this.LJIIJ, "click_link") || Intrinsics.LJFF(this.LJIIJ, "click_preview_link")) {
            c2344009Gk.LIZJ(this.LJII, "is_link");
        }
        if (this.LIZIZ == 0) {
            c2344009Gk.LIZJ(this.LJI, "is_subscribed");
        }
        if (this.LJIIJJI.length() > 0) {
            c2344009Gk.LJFF("total_comment", this.LJIIJJI);
        }
        if (this.LJIIL.length() > 0) {
            c2344009Gk.LJFF("preview_comment", this.LJIIL);
        }
        if (this.LJIILIIL.length() > 0) {
            c2344009Gk.LJFF("is_link_preview", this.LJIILIIL);
        }
        if (this.LJIILJJIL.length() > 0) {
            c2344009Gk.LJFF("total_duration", this.LJIILJJIL);
        }
        C20684815ws.LJIILLIIL("click_bulletin_message", c2344009Gk.LIZ);
    }
}
