package X;

import android.os.SystemClock;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0yGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851070yGn {
    public final String LIZ;
    public final String LIZIZ;
    public volatile boolean LJI;
    public volatile long LIZJ = -1;
    public volatile long LIZLLL = -1;
    public volatile long LJ = -1;
    public volatile long LJFF = -1;
    public volatile EnumC1782850wUl LJII = EnumC1782850wUl.UNKNOWN;
    public volatile String LJIIIIZZ = "";

    public final void LIZ(String str) {
        this.LJII = EnumC1782850wUl.INITIALIZED;
        this.LIZLLL = SystemClock.elapsedRealtime();
        if (str == null) {
            str = "";
        }
        this.LJIIIIZZ = str;
    }

    public C1851070yGn(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final void LIZIZ(EnumC1782850wUl enumC1782850wUl, String str, Integer num, String str2) {
        long jMax;
        long jMax2;
        long jMax3;
        String strValueOf;
        int iIntValue;
        String str3 = str2;
        String str4 = str;
        if (this.LJI) {
            return;
        }
        this.LJI = true;
        this.LJII = enumC1782850wUl;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax4 = -1;
        if (this.LIZJ < 0) {
            str4 = "illegal";
            jMax = -1;
            jMax2 = -1;
            jMax3 = -1;
        } else {
            jMax = Math.max(this.LIZLLL - this.LIZJ, -1L);
            jMax2 = Math.max(this.LJFF - this.LIZJ, -1L);
            jMax3 = Math.max(this.LJ - this.LIZJ, -1L);
            jMax4 = Math.max(jElapsedRealtime - this.LIZJ, -1L);
        }
        C0X4L c0x4lLIZ = C0X2L.LIZ();
        int i = c0x4lLIZ.LIZIZ;
        String strValueOf2 = "unknown";
        if (i == -1) {
            strValueOf = "unknown";
        } else {
            strValueOf = String.valueOf(i);
        }
        int i2 = c0x4lLIZ.LIZJ;
        if (i2 != -1) {
            strValueOf2 = String.valueOf(i2);
        }
        Pair[] pairArr = new Pair[14];
        pairArr[0] = new Pair("room_id", this.LIZ);
        pairArr[1] = new Pair("steam_state", Integer.valueOf(enumC1782850wUl.ordinal()));
        pairArr[2] = new Pair("stream_player_page_scene", this.LIZIZ);
        pairArr[3] = new Pair("stream_player_current_page", "home");
        pairArr[4] = new Pair("steam_player_report_scene", str4);
        pairArr[5] = new Pair("stream_player_initialized_duration", Long.valueOf(jMax));
        pairArr[6] = new Pair("stream_player_prepared_duration", Long.valueOf(jMax2));
        pairArr[7] = new Pair("stream_player_start_play_duration", Long.valueOf(jMax3));
        pairArr[8] = new Pair("steam_player_completed_duration", Long.valueOf(jMax4));
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        pairArr[9] = new Pair("stream_player_error_code", Integer.valueOf(iIntValue));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[10] = new Pair("stream_player_error_msg", str3);
        pairArr[11] = new Pair("default_quality", this.LJIIIIZZ);
        pairArr[12] = new Pair("network_quality", strValueOf);
        pairArr[13] = new Pair("downstream_kbps", strValueOf2);
        C1018703yb.LJ("rd_tiktokec_live_play_v2", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
