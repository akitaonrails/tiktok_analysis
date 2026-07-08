package X;

/* JADX INFO: renamed from: X.0lO5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355870lO5 {
    public long LIZ = -1;
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public long LJFF = -1;
    public long LJI = -1;

    public final void LIZ() {
        if (this.LIZ <= 0 || this.LIZIZ <= 0 || this.LIZJ <= 0 || this.LIZLLL <= 0 || this.LJ <= 0 || this.LJFF <= 0 || this.LJI <= 0) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(this.LIZIZ - this.LIZ, "on_activity_create");
        c2344009Gk.LIZLLL(this.LIZJ - this.LIZ, "on_post_fragment_create");
        c2344009Gk.LIZLLL(this.LIZLLL - this.LIZ, "on_comment_fragment_create");
        c2344009Gk.LIZLLL(this.LJ - this.LIZ, "on_view_created");
        c2344009Gk.LIZLLL(this.LJFF - this.LIZ, "on_layout_complete");
        c2344009Gk.LIZLLL(this.LJI - this.LIZ, "enter_anim_end");
        C20684815ws.LJIILLIIL("enter_lemon8_detail_duration", c2344009Gk.LIZ);
    }
}
