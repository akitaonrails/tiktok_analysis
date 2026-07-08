package X;

import android.graphics.Typeface;
import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.18qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21408418qI extends C689280R1y {
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final int LJIILJJIL;
    public final InterfaceC1860300yVg LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final Typeface LJIJI;
    public final Typeface LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final int LJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21408418qI(C689270R1x c689270R1x, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, int i7, C1860120yVO c1860120yVO, int i8, boolean z, boolean z2, Typeface typeface, Typeface typeface2, int i9, int i10, int i11) {
        super(c689270R1x);
        float f5 = f3;
        float f6 = f;
        int i12 = i5;
        int i13 = i4;
        float f7 = f2;
        int i14 = i10;
        int i15 = i9;
        Typeface typeface3 = typeface2;
        Typeface typeface4 = typeface;
        boolean z3 = z2;
        boolean z4 = z;
        int i16 = i8;
        C1860120yVO c1860120yVO2 = c1860120yVO;
        int i17 = i7;
        int i18 = (i11 & 16) != 0 ? -1 : i3;
        i13 = (i11 & 32) != 0 ? -1 : i13;
        i12 = (i11 & 64) != 0 ? -1 : i12;
        int i19 = (i11 & 128) == 0 ? i6 : -1;
        f6 = (i11 & 512) != 0 ? -1.0f : f6;
        f7 = (i11 & 1024) != 0 ? 0.0f : f7;
        f5 = (i11 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0.0f : f5;
        float f8 = (i11 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? f4 : 0.0f;
        i17 = (i11 & 8192) != 0 ? -16777216 : i17;
        c1860120yVO2 = (i11 & 16384) != 0 ? null : c1860120yVO2;
        i16 = (32768 & i11) != 0 ? 0 : i16;
        z4 = (65536 & i11) != 0 ? false : z4;
        z3 = (131072 & i11) != 0 ? false : z3;
        typeface4 = (262144 & i11) != 0 ? null : typeface4;
        typeface3 = (524288 & i11) != 0 ? null : typeface3;
        i15 = (1048576 & i11) != 0 ? 0 : i15;
        i14 = (i11 & 2097152) != 0 ? 0 : i14;
        this.LJ = i;
        this.LJFF = 0;
        this.LJI = i2;
        this.LJII = i12;
        this.LJIIIIZZ = i19;
        this.LJIIIZ = 0;
        this.LJIIJ = f6;
        this.LJIIJJI = f7;
        this.LJIIL = f5;
        this.LJIILIIL = f8;
        this.LJIILJJIL = i17;
        this.LJIILL = c1860120yVO2;
        this.LJIILLIIL = i16;
        this.LJIIZILJ = z4;
        this.LJIJ = z3;
        this.LJIJI = typeface4;
        this.LJIJJ = typeface3;
        this.LJIJJLI = i15;
        this.LJIL = i14;
        this.LJJ = i18 < 0 ? 0 : i18;
        i13 = i13 < 0 ? 0 : i13;
        this.LJJI = i13;
        if (i13 * 2 <= i2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Padding(");
        sbLIZ.append(0);
        sbLIZ.append(") can't larger than width(");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
