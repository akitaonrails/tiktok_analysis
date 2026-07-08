package X;

import com.ss.android.ugc.gamora.editor.sticker.read.SpeakerCenter;

/* JADX INFO: renamed from: X.0FWS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FWS {
    static {
        C196909122h.LJFF = LIZ() == 1;
    }

    public static final int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "text_reading_timbre_expr", true);
    }

    public static final boolean LIZIZ(boolean z) {
        if (LIZ() == 2) {
            return true;
        }
        if (LIZ() != 3 && LIZ() != 4) {
            return !SpeakerCenter.LJFF();
        }
        return !z;
    }
}
