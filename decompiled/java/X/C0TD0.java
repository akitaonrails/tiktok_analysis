package X;

/* JADX INFO: renamed from: X.0TD0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TD0 {
    public final String LIZ;
    public final long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJ;

    public final boolean LIZ() {
        if (this.LIZLLL <= 0) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        if (jCurrentTimeMillis > 0) {
            this.LIZJ += jCurrentTimeMillis;
        }
        this.LIZLLL = 0L;
        return true;
    }

    public C0TD0(String str, long j) {
        this.LIZ = str;
        this.LIZIZ = j;
    }

    public final void LIZIZ(int i, boolean z) {
        String str;
        String str2;
        boolean zLIZ = LIZ();
        if (this.LIZJ <= 0) {
            return;
        }
        if (!zLIZ) {
            str = "disconnect";
            i = this.LJ;
        } else {
            str = "no_stream";
        }
        if (z) {
            str2 = "splice";
        } else {
            str2 = "embed";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_apply_duration");
        c474500IjALIZ.LJJII(this.LIZ, "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "room_id");
        c474500IjALIZ.LJJII(str, "end_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZJ), "duration");
        c474500IjALIZ.LJJII(str2, "position_type");
        c474500IjALIZ.LIZ();
        this.LIZJ = -1L;
    }
}
