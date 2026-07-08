package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09TA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TA {
    public static final String LIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSProcessHelper ");
        LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZ(String str) {
        Keva keva = SpeakerCenter.LIZ;
        String string = keva.getString("setLastSpeakerId", "");
        String string2 = keva.getString("setLastStreamSpeakerId", "");
        if (!Intrinsics.LJFF(str, string) || TextUtils.isEmpty(string2)) {
            return "";
        }
        return string2;
    }

    public static int LIZIZ(String str) {
        if (C123100dR.LIZ(str) && C09T0.LIZ()) {
            return 1;
        }
        return 0;
    }

    public static void LIZJ(C09TF c09tf, C09TG c09tg) {
        if (c09tf == null) {
            return;
        }
        c09tg.LIZIZ(c09tf.LIZ, c09tf.LIZIZ);
        C09TF c09tf2 = c09tg.LIZ;
        if (c09tf2 == null) {
            c09tg.LIZJ(c09tf);
            return;
        }
        int iLIZIZ = LIZIZ(c09tf2.LIZJ);
        if (LIZIZ(c09tf.LIZJ) == 0 && iLIZIZ == 1) {
            C09T7 c09t7 = C09T7.LIZ;
            C23250099c.LIZLLL(C09T7.LIZIZ(), null, null, new C2376709Sz(0L, null, null, null, null), 3);
            C11YP c11yp = C11YP.LIZIZ;
            String str = LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preTask is stream mark streamSpeakerId: ");
            sbLIZ.append(c09tf2.LIZJ);
            sbLIZ.append(" ,speakId:");
            sbLIZ.append(c09tf2.LIZ);
            C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        }
        c09tf2.LJ = Boolean.FALSE;
        c09tg.LIZJ(c09tf);
    }
}
