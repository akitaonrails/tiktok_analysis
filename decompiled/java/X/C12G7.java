package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.12G7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12G7 {
    public final ImageAlbumData LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final C375830EoP<Integer> LIZJ;
    public final C375830EoP<List<C12GP>> LIZLLL;
    public final C375830EoP<Pair<Integer, String>> LJ;
    public final C375830EoP<Pair<Integer, String>> LJFF;
    public final C375830EoP<Pair<Integer, String>> LJI;
    public final C375830EoP<Integer> LJII;
    public final C375830EoP<Pair<Integer, String>> LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final Boolean LJIIJ;
    public final C375830EoP<Pair<Unit, Boolean>> LJIIJJI;
    public final C375830EoP<Boolean> LJIIL;
    public final C375830EoP<Boolean> LJIILIIL;
    public final C375830EoP<Boolean> LJIILJJIL;

    public static C12G7 LIZ(C12G7 c12g7, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, C375830EoP c375830EoP5, C375830EoP c375830EoP6, C375830EoP c375830EoP7, Boolean bool, Boolean bool2, C375830EoP c375830EoP8, C375830EoP c375830EoP9, int i) {
        ImageAlbumData imageAlbumData;
        VideoPublishEditModel videoPublishEditModel;
        C375830EoP<Boolean> c375830EoP10;
        C375830EoP c375830EoP11 = c375830EoP9;
        C375830EoP c375830EoP12 = c375830EoP8;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        C375830EoP c375830EoP13 = c375830EoP7;
        C375830EoP c375830EoP14 = c375830EoP6;
        C375830EoP c375830EoP15 = c375830EoP5;
        C375830EoP c375830EoP16 = c375830EoP4;
        C375830EoP c375830EoP17 = c375830EoP3;
        C375830EoP c375830EoP18 = c375830EoP2;
        C375830EoP c375830EoP19 = c375830EoP;
        C375830EoP<Boolean> c375830EoP20 = null;
        if ((i & 1) != 0) {
            imageAlbumData = c12g7.LIZ;
        } else {
            imageAlbumData = null;
        }
        if ((i & 2) != 0) {
            videoPublishEditModel = c12g7.LIZIZ;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 4) != 0) {
            c375830EoP19 = c12g7.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP18 = c12g7.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP17 = c12g7.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP16 = c12g7.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP15 = c12g7.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP14 = c12g7.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP13 = c12g7.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            bool4 = c12g7.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            bool3 = c12g7.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c375830EoP12 = c12g7.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c375830EoP11 = c12g7.LJIIL;
        }
        if ((i & 8192) != 0) {
            c375830EoP10 = c12g7.LJIILIIL;
        } else {
            c375830EoP10 = null;
        }
        if ((i & 16384) != 0) {
            c375830EoP20 = c12g7.LJIILJJIL;
        }
        c12g7.getClass();
        return new C12G7(imageAlbumData, videoPublishEditModel, c375830EoP19, c375830EoP18, c375830EoP17, c375830EoP16, c375830EoP15, c375830EoP14, c375830EoP13, bool4, bool3, c375830EoP12, c375830EoP11, c375830EoP10, c375830EoP20);
    }

    public C12G7(ImageAlbumData imageAlbumData, VideoPublishEditModel videoPublishEditModel, C375830EoP<Integer> c375830EoP, C375830EoP<List<C12GP>> c375830EoP2, C375830EoP<Pair<Integer, String>> c375830EoP3, C375830EoP<Pair<Integer, String>> c375830EoP4, C375830EoP<Pair<Integer, String>> c375830EoP5, C375830EoP<Integer> c375830EoP6, C375830EoP<Pair<Integer, String>> c375830EoP7, Boolean bool, Boolean bool2, C375830EoP<Pair<Unit, Boolean>> c375830EoP8, C375830EoP<Boolean> c375830EoP9, C375830EoP<Boolean> c375830EoP10, C375830EoP<Boolean> c375830EoP11) {
        this.LIZ = imageAlbumData;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c375830EoP4;
        this.LJI = c375830EoP5;
        this.LJII = c375830EoP6;
        this.LJIIIIZZ = c375830EoP7;
        this.LJIIIZ = bool;
        this.LJIIJ = bool2;
        this.LJIIJJI = c375830EoP8;
        this.LJIIL = c375830EoP9;
        this.LJIILIIL = c375830EoP10;
        this.LJIILJJIL = c375830EoP11;
    }
}
