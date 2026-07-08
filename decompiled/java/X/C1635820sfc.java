package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;

/* JADX INFO: renamed from: X.0sfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635820sfc {
    public final int LIZ;
    public final int LIZIZ;
    public final C1638260sjY LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final boolean LJII;
    public final long LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C1635840sfe LJIIJ;
    public final C1636520sgk LJIIJJI;
    public final C1635830sfd LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1635820sfc() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        this(0, objArr, null, objArr2, objArr3, objArr4, objArr5, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr6, objArr7, objArr8, 131071);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1635820sfc(int i, int i2, C1638260sjY c1638260sjY, int i3, int i4, int i5, boolean z, long j, C1635840sfe c1635840sfe, C1636520sgk c1636520sgk, boolean z2, boolean z3, boolean z4, int i6) {
        boolean z5;
        boolean z6 = z4;
        boolean z7 = z3;
        C1636520sgk c1636520sgk2 = c1636520sgk;
        long j2 = j;
        boolean z8 = z;
        int i7 = i5;
        C1635840sfe c1635840sfe2 = c1635840sfe;
        int i8 = i4;
        int i9 = i3;
        C1638260sjY c1638260sjY2 = c1638260sjY;
        int i10 = i2;
        boolean z9 = z2;
        int i11 = (i6 & 1) != 0 ? 0 : i;
        i10 = (i6 & 2) != 0 ? 0 : i10;
        boolean z10 = false;
        boolean z11 = false;
        c1638260sjY2 = (i6 & 4) != 0 ? null : c1638260sjY2;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        i9 = (i6 & 16) != 0 ? 0 : i9;
        i8 = (i6 & 32) != 0 ? -1 : i8;
        i7 = (i6 & 64) != 0 ? 0 : i7;
        z8 = (i6 & 128) != 0 ? false : z8;
        j2 = (i6 & 256) != 0 ? 490L : j2;
        if ((i6 & 512) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this(i11, i10, c1638260sjY2, 0, i9, i8, i7, z8, j2, z5, (i6 & 1024) != 0 ? new C1635840sfe(null, false, false, 0, null, false, null, false, 16777215) : c1635840sfe2, (i6 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? new C1636520sgk(i12, z11 ? 1 : 0, z10 ? 1 : 0, z18 ? 1 : 0, z17 ? 1 : 0, z16 ? 1 : 0, z15 ? 1 : 0, z14 ? 1 : 0, z13 ? 1 : 0, z12 ? 1 : 0, 0.0f, 16777215) : c1636520sgk2, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new Object() { // from class: X.0sfd
        } : 0, (i6 & 8192) != 0 ? false : z9, (i6 & 16384) != 0 ? false : z7, false, (i6 & 65536) != 0 ? false : z6);
    }

    public C1635820sfc(int i, int i2, C1638260sjY c1638260sjY, int i3, int i4, int i5, int i6, boolean z, long j, boolean z2, C1635840sfe c1635840sfe, C1636520sgk c1636520sgk, C1635830sfd c1635830sfd, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c1638260sjY;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = z;
        this.LJIIIIZZ = j;
        this.LJIIIZ = z2;
        this.LJIIJ = c1635840sfe;
        this.LJIIJJI = c1636520sgk;
        this.LJIIL = c1635830sfd;
        this.LJIILIIL = z3;
        this.LJIILJJIL = z4;
        this.LJIILL = z6;
    }
}
