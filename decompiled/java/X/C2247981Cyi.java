package X;

import android.graphics.drawable.Drawable;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.1Cyi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247981Cyi {
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Drawable LJ;
    public Drawable LJFF;
    public Drawable LJI;
    public Drawable LJII;
    public boolean LJIIIIZZ;
    public final CharSequence LJIIIZ;
    public final Integer LJIIJ;
    public final Integer LJIIJJI;
    public final Integer LJIIL;
    public final Integer LJIILIIL;
    public final Integer LJIILJJIL;
    public final Integer LJIILL;
    public final Integer LJIILLIIL;
    public final Integer LJIIZILJ;

    public C2247981Cyi(Integer num, Integer num2, Integer num3, Integer num4, CharSequence charSequence, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i) {
        Integer num13 = num2;
        Integer num14 = num3;
        Integer num15 = num4;
        String str = charSequence;
        Integer num16 = num5;
        Integer num17 = num6;
        Integer num18 = num7;
        Integer num19 = num8;
        Integer num20 = num9;
        Integer num21 = num10;
        Integer num22 = num11;
        Integer num23 = num12;
        Integer num24 = (i & 1) != 0 ? null : num;
        num13 = (i & 2) != 0 ? null : num13;
        num14 = (i & 4) != 0 ? null : num14;
        num15 = (i & 8) != 0 ? null : num15;
        str = (i & 512) != 0 ? "" : str;
        num16 = (i & 1024) != 0 ? null : num16;
        num17 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num17;
        num18 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : num18;
        num19 = (i & 8192) != 0 ? null : num19;
        num20 = (i & 16384) != 0 ? null : num20;
        num21 = (32768 & i) != 0 ? null : num21;
        num22 = (65536 & i) != 0 ? null : num22;
        num23 = (i & 131072) != 0 ? null : num23;
        this.LIZ = num24;
        this.LIZIZ = num13;
        this.LIZJ = num14;
        this.LIZLLL = num15;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = false;
        this.LJIIIZ = str;
        this.LJIIJ = num16;
        this.LJIIJJI = num17;
        this.LJIIL = num18;
        this.LJIILIIL = num19;
        this.LJIILJJIL = num20;
        this.LJIILL = num21;
        this.LJIILLIIL = num22;
        this.LJIIZILJ = num23;
    }
}
