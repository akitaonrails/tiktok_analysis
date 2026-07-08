package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.00vf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C236100vf {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public String LJ;

    public final void LIZ(boolean z) {
        if (this.LIZLLL == 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_gift_record_duration");
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
        c474500IjALIZ.LJJII(this.LIZJ, "event_page");
        c474500IjALIZ.LJJII(this.LJ, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_send_gift");
        c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - this.LIZLLL) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
        c474500IjALIZ.LIZ();
        this.LIZLLL = 0L;
    }

    public final void LIZIZ(String str, boolean z) {
        if (this.LIZLLL != 0) {
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
        this.LJ = str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_gift_record_show");
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
        c474500IjALIZ.LJJII(this.LIZJ, "event_page");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_send_gift");
        c474500IjALIZ.LIZ();
    }

    public C236100vf(String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = str2;
    }
}
