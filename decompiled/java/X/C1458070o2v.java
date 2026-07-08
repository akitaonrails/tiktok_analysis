package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0o2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458070o2v {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5065));

    public static int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static int LIZLLL() {
        return ((Number) C267150AdV.LIZ.getValue()).intValue();
    }

    public static boolean LIZ() {
        return LIZJ() > 0 && LIZJ() == 1;
    }

    public static boolean LIZIZ() {
        return C1399570mWZ.LIZIZ() || LIZJ() > 0;
    }

    public static boolean LJFF() {
        return C1399570mWZ.LIZIZ() || LIZJ() == 2;
    }

    public static boolean LJ(MusicBuzModel musicBuzModel) {
        if (!C1399570mWZ.LIZIZ() && !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_music_auto_repeat_enabled", true, false)) {
            if (C1654360t9W.LIZ && LJFF() && musicBuzModel.shouldMusicLoop) {
                return true;
            }
            return false;
        }
        if (C1654360t9W.LIZ) {
            if (LJFF() && musicBuzModel.shouldMusicLoop) {
                return true;
            }
            return false;
        }
        return LJFF();
    }
}
