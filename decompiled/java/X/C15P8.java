package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostSubtitleConfig;

/* JADX INFO: renamed from: X.15P8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15P8 {
    public final boolean LIZ;
    public boolean LIZIZ = true;
    public final int LIZJ;
    public final C19994613Lc LIZLLL;

    public C15P8(boolean z) {
        this.LIZ = z;
        LiveCoHostSubtitleConfig liveCoHostSubtitleConfig = LiveCoHostSubtitleConfig.INSTANCE;
        liveCoHostSubtitleConfig.getValue();
        int i = liveCoHostSubtitleConfig.getValue().monitorDisplaySampleDivisor;
        this.LIZJ = i;
        this.LIZLLL = C19994513Lb.LIZ(i);
    }

    public final void LIZ(C15PC c15pc) {
        AbstractC962030b8r c955610ayV;
        C15PA c15pa = c15pc.LIZLLL;
        if (c15pa.LJIIIZ) {
            return;
        }
        c15pa.LJIIIZ = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = c15pa.LJFF;
        long j2 = c15pa.LJ;
        long j3 = j - j2;
        long j4 = jCurrentTimeMillis - j;
        long j5 = jCurrentTimeMillis - j2;
        long j6 = jCurrentTimeMillis - c15pa.LIZLLL;
        if (this.LIZLLL.nextInt() % this.LIZJ == 0) {
            if (this.LIZ) {
                c955610ayV = new C955440ayE();
            } else {
                c955610ayV = new C955610ayV();
            }
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZJ, "send_to_receive_cost", Long.valueOf(j3), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "send_to_receive_cost", Long.valueOf(j3), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZJ, "receive_to_show_cost", Long.valueOf(j4), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "receive_to_show_cost", Long.valueOf(j4), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZJ, "send_to_show_cost", Long.valueOf(j5), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "send_to_show_cost", Long.valueOf(j5), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZJ, "speak_to_show_cost", Long.valueOf(j6), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "speak_to_show_cost", Long.valueOf(j6), true);
            c955610ayV.LJIIL(c15pa.LIZ, "linkmic_id", true);
            c955610ayV.LJIIL(c15pa.LJI, "target_lang", true);
            c955610ayV.LJIIL(c15pa.LJII, "source_lang", true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "round_id", Long.valueOf(c15pa.LIZIZ), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "sequence", Long.valueOf(c15pa.LIZJ), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "speak_timestamp", Long.valueOf(c15pa.LIZLLL), true);
            AbstractC962030b8r.LJIIJ(c955610ayV.LIZLLL, "message_list_count", Integer.valueOf(c15pa.LJIIIIZZ), true);
            c955610ayV.LJIJJLI("cohost_subtitle_display");
        }
    }
}
