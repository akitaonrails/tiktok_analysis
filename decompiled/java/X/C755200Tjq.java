package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755200Tjq {
    public final boolean LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final boolean LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;

    public C755200Tjq(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, int i4) {
        boolean z8;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z9 = z4;
        boolean z10 = z2;
        int i10 = i;
        boolean z11 = z7;
        int i11 = i3;
        boolean z12 = z6;
        boolean z13 = z5;
        boolean z14 = (i4 & 1) != 0 ? false : z;
        int i12 = i4 & 2;
        int i13 = R.attr.ezq;
        i10 = i12 != 0 ? R.attr.ezq : i10;
        if ((i4 & 4) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        i13 = (i4 & 8) == 0 ? i2 : i13;
        z10 = (i4 & 16) != 0 ? false : z10;
        if ((i4 & 32) != 0) {
            i5 = R.attr.ezt;
        } else {
            i5 = 0;
        }
        boolean z15 = (i4 & 64) == 0 ? z3 : true;
        if ((i4 & 128) != 0) {
            i6 = R.attr.dw4;
        } else {
            i6 = 0;
        }
        z9 = (i4 & 256) != 0 ? false : z9;
        z13 = (i4 & 512) != 0 ? false : z13;
        if ((i4 & 1024) != 0) {
            i7 = R.attr.d3e;
        } else {
            i7 = 0;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i8 = R.attr.ezt;
        } else {
            i8 = 0;
        }
        z12 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z12;
        i11 = (i4 & 8192) != 0 ? R.attr.eny : i11;
        if ((i4 & 16384) != 0) {
            i9 = R.attr.ezt;
        } else {
            i9 = 0;
        }
        z11 = (i4 & 32768) != 0 ? false : z11;
        this.LIZ = z14;
        this.LIZIZ = i10;
        this.LIZJ = z8;
        this.LIZLLL = i13;
        this.LJ = z10;
        this.LJFF = i5;
        this.LJI = z15;
        this.LJII = i6;
        this.LJIIIIZZ = z9;
        this.LJIIIZ = z13;
        this.LJIIJ = i7;
        this.LJIIJJI = i8;
        this.LJIIL = z12;
        this.LJIILIIL = i11;
        this.LJIILJJIL = i9;
        this.LJIILL = z11;
    }
}
