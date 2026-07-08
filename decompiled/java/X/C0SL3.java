package X;

import android.graphics.Rect;
import android.widget.ImageView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;

/* JADX INFO: renamed from: X.0SL3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL3 {
    public final ImageView.ScaleType LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Rect LJ;
    public final float LJFF;
    public final Rect LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final C0SL3 LJIIL;
    public final Map<String, String> LJIILIIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C0SL3() {
        float f = 0.0f;
        int i = 0;
        this(null, f, i, i, 0 == true ? 1 : 0, f, 0 == true ? 1 : 0, f, f, i, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383);
    }

    public static C0SL3 LIZ(C0SL3 c0sl3, ImageView.ScaleType scaleType, float f, int i, Rect rect, Rect rect2, C0SL3 c0sl32, int i2) {
        int i3;
        float f2;
        float f3;
        int i4;
        String str;
        C0SL3 c0sl33 = c0sl32;
        Rect rect3 = rect2;
        int i5 = i;
        Rect rect4 = rect;
        float f4 = f;
        ImageView.ScaleType scaleType2 = scaleType;
        if ((i2 & 1) != 0) {
            scaleType2 = c0sl3.LIZ;
        }
        if ((i2 & 2) != 0) {
            f4 = c0sl3.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i5 = c0sl3.LIZJ;
        }
        int i6 = 0;
        if ((i2 & 8) != 0) {
            i3 = c0sl3.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            rect4 = c0sl3.LJ;
        }
        float f5 = 0.0f;
        if ((i2 & 32) != 0) {
            f2 = c0sl3.LJFF;
        } else {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            rect3 = c0sl3.LJI;
        }
        if ((i2 & 128) != 0) {
            f3 = c0sl3.LJII;
        } else {
            f3 = 0.0f;
        }
        if ((i2 & 256) != 0) {
            f5 = c0sl3.LJIIIIZZ;
        }
        if ((i2 & 512) != 0) {
            i4 = c0sl3.LJIIIZ;
        } else {
            i4 = 0;
        }
        if ((i2 & 1024) != 0) {
            i6 = c0sl3.LJIIJ;
        }
        Map<String, String> map = null;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str = c0sl3.LJIIJJI;
        } else {
            str = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c0sl33 = c0sl3.LJIIL;
        }
        if ((i2 & 8192) != 0) {
            map = c0sl3.LJIILIIL;
        }
        c0sl3.getClass();
        return new C0SL3(scaleType2, f4, i5, i3, rect4, f2, rect3, f3, f5, i4, i6, str, c0sl33, map);
    }

    public /* synthetic */ C0SL3(ImageView.ScaleType scaleType, float f, int i, int i2, Rect rect, float f2, Rect rect2, float f3, float f4, int i3, String str, Map map, int i4) {
        this((i4 & 1) != 0 ? ImageView.ScaleType.FIT_CENTER : scaleType, (i4 & 2) != 0 ? 1.0f : f, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? null : rect, (i4 & 32) != 0 ? 1.0f : f2, (i4 & 64) != 0 ? null : rect2, (i4 & 128) != 0 ? 0.0f : f3, (i4 & 256) == 0 ? f4 : 0.0f, (i4 & 512) != 0 ? 0 : i3, 0, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "" : str, null, (i4 & 8192) == 0 ? map : null);
    }

    public C0SL3(ImageView.ScaleType scaleType, float f, int i, int i2, Rect rect, float f2, Rect rect2, float f3, float f4, int i3, int i4, String str, C0SL3 c0sl3, Map<String, String> map) {
        this.LIZ = scaleType;
        this.LIZIZ = f;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = rect;
        this.LJFF = f2;
        this.LJI = rect2;
        this.LJII = f3;
        this.LJIIIIZZ = f4;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
        this.LJIIJJI = str;
        this.LJIIL = c0sl3;
        this.LJIILIIL = map;
    }
}
