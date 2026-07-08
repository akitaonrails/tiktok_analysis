package X;

/* JADX INFO: renamed from: X.0rro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1604940rro {
    public final int LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF = "";

    public C1604940rro(int i) {
        this.LIZ = i;
    }

    public final void LIZ(int i, String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(this.LIZ, "feed_source");
        c0lab.LJFF("is_chunk_api", this.LIZJ);
        c0lab.LIZ(this.LIZLLL, "is_decode_fail");
        c0lab.LIZ(this.LJ, "is_vid_get");
        c0lab.LIZ(i, "is_success");
        c0lab.LJ("reason", str);
        if (C1533950q1J.LJ(this.LJFF)) {
            c0lab.LJ("error_message", this.LJFF);
        }
        c0lab.LIZIZ(System.currentTimeMillis() - this.LIZIZ, "duration");
        C20684815ws.LJIILLIIL("event_carry_video_request", c0lab.LIZ);
    }
}
