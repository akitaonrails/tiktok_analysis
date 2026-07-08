package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0kzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340520kzK {
    public static Boolean LIZ;
    public static long LIZIZ = -1;
    public static int LIZJ = -1;
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(497));

    public static boolean LIZ() {
        if (LIZ == null) {
            LIZ = Boolean.valueOf(LIZJ().getBoolean("key_audio_comment_ever_played", false));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isEverAudioCommentPlayed init from keva: ");
            sbLIZ.append(LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Boolean bool = LIZ;
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        if (LIZIZ == -1) {
            LIZIZ = LIZJ().getLong("audio_comment_play_tip_show_time", 0L);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getAudioCommentPlayTipShowTimeStamp init from keva: ");
            sbLIZ2.append(LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        long j = LIZIZ;
        if (System.currentTimeMillis() - j < 1209600000) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("canShowAudioCommentPlayTip: false, last show time: ");
            sbLIZ3.append(j);
            sbLIZ3.append(", less than 7 days");
            C2188811AlT.LIZIZ(sbLIZ3);
            return false;
        }
        int iLIZIZ = LIZIZ();
        if (iLIZIZ < 2) {
            return true;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("canShowAudioCommentPlayTip: false, show count: ");
        sbLIZ4.append(iLIZIZ);
        sbLIZ4.append(", limit reached");
        C2188811AlT.LIZIZ(sbLIZ4);
        return false;
    }

    public static int LIZIZ() {
        if (LIZJ == -1) {
            LIZJ = LIZJ().getInt("key_audio_comment_play_tip_show_count", 0);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAudioCommentPlayTipShowCount init from keva: ");
            sbLIZ.append(LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return LIZJ;
    }

    public static Keva LIZJ() {
        return (Keva) LIZLLL.getValue();
    }
}
