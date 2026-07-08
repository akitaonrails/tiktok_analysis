package X;

import android.graphics.Color;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;

/* JADX INFO: renamed from: X.0jbd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287390jbd {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public List<Float> LIZLLL;
    public List<Float> LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1287390jbd(float f, float f2, List list, List list2, int i, int i2, int i3, int i4, int i5, float f3, float f4, int i6) {
        float f5 = f3;
        float f6 = f4;
        int i7 = i4;
        List list3 = list2;
        int i8 = i3;
        int i9 = i2;
        int i10 = i;
        float f7 = f;
        int i11 = i5;
        List list4 = list;
        float f8 = f2;
        int i12 = i6 & 1;
        Float fValueOf = Float.valueOf(1.0f);
        this(i12 != 0 ? 1.0f : f7, 0.0f, (i6 & 4) != 0 ? 0.0f : f8, (List<Float>) ((i6 & 8) != 0 ? C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f)) : list4), (List<Float>) ((i6 & 16) != 0 ? C1697810uHb.LJIIJJI(fValueOf, fValueOf) : list3), (i6 & 32) != 0 ? Color.rgb(255, 92, 133) : i10, (i6 & 64) != 0 ? Color.rgb(255, 135, 105) : i9, (i6 & 128) != 0 ? Color.rgb(255, 135, 105) : i8, (i6 & 256) != 0 ? Color.rgb(255, 92, 133) : i7, (i6 & 512) != 0 ? Color.rgb(0, 0, 0) : i11, (i6 & 1024) != 0 ? 1.0f : f5, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0.0f : f6);
    }

    public C1287390jbd(float f, float f2, float f3, List<Float> list, List<Float> list2, int i, int i2, int i3, int i4, int i5, float f4, float f5) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = list;
        this.LJ = list2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = f4;
        this.LJIIJJI = f5;
    }
}
