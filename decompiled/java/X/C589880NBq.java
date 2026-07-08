package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0NBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589880NBq {
    public long LIZIZ;
    public C2344009Gk LIZ = new C2344009Gk();
    public Pair<Integer, String> LIZJ = new Pair<>(0, "");
    public String LIZLLL = "";

    public final void LIZ() {
        if (this.LIZIZ == 0) {
            return;
        }
        this.LIZ.LIZJ(this.LIZJ.getFirst().intValue(), "error_code");
        this.LIZ.LJFF("error_msg", this.LIZJ.getSecond());
        this.LIZ.LIZLLL(System.currentTimeMillis() - this.LIZIZ, "total_duration");
        this.LIZ.LJFF("log_id", this.LIZLLL);
        this.LIZIZ = 0L;
        C20684815ws.LJIILLIIL("request_similar_music_for_offline_music", this.LIZ.LIZ);
    }
}
