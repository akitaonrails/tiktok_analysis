package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FUH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FUH {
    public final String LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final List<C0FFO> LJIIIZ;
    public final EnumC391400FWg LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;

    public C0FUH() {
        this(null, null, 0, null, null, false, false, false, false, null, null, false, false, false, 0, false, 524287);
    }

    public C0FUH(String str, Integer num, int i, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, List list, EnumC391400FWg enumC391400FWg, boolean z5, boolean z6, boolean z7, int i2, boolean z8, int i3) {
        Integer num4 = num2;
        int i4 = i;
        Integer num5 = num;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        boolean z13 = z6;
        boolean z14 = z5;
        EnumC391400FWg enumC391400FWg2 = enumC391400FWg;
        List arrayList = list;
        boolean z15 = z8;
        int i5 = i2;
        boolean z16 = z7;
        String str2 = (i3 & 4) != 0 ? "" : str;
        num5 = (i3 & 8) != 0 ? null : num5;
        i4 = (i3 & 16) != 0 ? 164 : i4;
        num4 = (i3 & 32) != 0 ? null : num4;
        Integer num6 = (i3 & 64) == 0 ? num3 : null;
        z12 = (i3 & 128) != 0 ? false : z12;
        z11 = (i3 & 256) != 0 ? false : z11;
        z10 = (i3 & 512) != 0 ? true : z10;
        z9 = (i3 & 1024) != 0 ? false : z9;
        arrayList = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new ArrayList() : arrayList;
        enumC391400FWg2 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? EnumC391400FWg.VIDEO_EDIT : enumC391400FWg2;
        z14 = (i3 & 8192) != 0 ? false : z14;
        z13 = (i3 & 16384) != 0 ? true : z13;
        z16 = (32768 & i3) != 0 ? false : z16;
        i5 = (65536 & i3) != 0 ? 0 : i5;
        z15 = (i3 & 131072) != 0 ? false : z15;
        this.LIZ = str2;
        this.LIZIZ = num5;
        this.LIZJ = i4;
        this.LIZLLL = num4;
        this.LJ = num6;
        this.LJFF = z12;
        this.LJI = z11;
        this.LJII = z10;
        this.LJIIIIZZ = z9;
        this.LJIIIZ = arrayList;
        this.LJIIJ = enumC391400FWg2;
        this.LJIIJJI = z14;
        this.LJIIL = z13;
        this.LJIILIIL = z16;
        this.LJIILJJIL = i5;
        this.LJIILL = z15;
        this.LJIILLIIL = false;
    }
}
