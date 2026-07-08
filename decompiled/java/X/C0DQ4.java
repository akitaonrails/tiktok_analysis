package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0DQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DQ4 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, long j, long j2, String str4, int i, String str5) {
        String str6;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("conversation_id", str);
        pairArr[1] = new Pair("media_key", str2);
        pairArr[2] = new Pair("media_type", str3);
        pairArr[3] = new Pair("bytes_uploaded", String.valueOf(j));
        pairArr[4] = new Pair("elapsed_ms", String.valueOf(j2));
        pairArr[5] = new Pair("terminal_state", str4);
        pairArr[6] = new Pair("retry_index", String.valueOf(i));
        pairArr[7] = new Pair("network_type", str5);
        pairArr[8] = new Pair("experiment_group", String.valueOf(C0BK0.LIZ()));
        int iIntValue = ((Number) C258390AAr.LIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                str6 = "ic";
            } else {
                str6 = "fi_v2";
            }
        } else {
            str6 = "fi_v1";
        }
        pairArr[9] = new Pair("album_panel", str6);
        C20684815ws.LJIILLIIL("dm_media_preupload_lifecycle", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
