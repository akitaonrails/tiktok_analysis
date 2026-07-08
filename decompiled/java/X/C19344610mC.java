package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19344610mC extends C19345310mJ {
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final EnumC1990607qy LJIJJ;
    public final int LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final int LJJI;
    public final int LJJIFFI;
    public final int LJJII;
    public final int LJJIII;
    public final int LJJIIJ;
    public final int LJJIIJZLJL;
    public C186X LJJIIZ;

    @Override // X.C19345310mJ, X.C186V
    public final int LIZ() {
        return this.LJJII;
    }

    @Override // X.C19345310mJ, X.C186V
    public final EnumC1990607qy LIZIZ() {
        return this.LJIJJ;
    }

    @Override // X.C19345310mJ, X.C186V
    public int LIZLLL() {
        return this.LJJIIJ;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJ() {
        return this.LJIL;
    }

    @Override // X.C19345310mJ, X.C186V
    public final boolean LJFF() {
        return this.LJIJ;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJI() {
        return this.LJJIFFI;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJII() {
        return this.LJJIIJZLJL;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJIIIZ() {
        return this.LJJ;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJIIJ() {
        return this.LJIJJLI;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJIIJJI() {
        return this.LJJI;
    }

    @Override // X.C19345310mJ, X.C186V
    public final int LJIILJJIL() {
        return this.LJJIII;
    }

    @Override // X.C19345310mJ, X.C186V
    public final C186X LJIILL() {
        return this.LJJIIZ;
    }

    @Override // X.C19345310mJ, X.C186V
    public final boolean LJIIZILJ() {
        return this.LJIJI;
    }

    @Override // X.C19345310mJ, X.C186V
    public final void LJIJ(C186X c186x) {
        this.LJJIIZ = c186x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19344610mC(int i, int i2, C19343810m4 c19343810m4, int i3) {
        boolean z;
        boolean z2;
        EnumC1990607qy enumC1990607qy;
        int iLIZIZ;
        int i4;
        int i5;
        int iLIZIZ2;
        int i6;
        int i7;
        super(0);
        if ((i3 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            enumC1990607qy = EnumC1990607qy.V1;
        } else {
            enumC1990607qy = null;
        }
        i = (i3 & 8) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19)) : i;
        if ((i3 & 16) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        } else {
            iLIZIZ = 0;
        }
        int i8 = i3 & 32;
        int i9 = R.attr.a1h;
        if (i8 != 0) {
            i4 = R.attr.a1h;
        } else {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            i5 = 92;
        } else {
            i5 = 0;
        }
        i9 = (i3 & 128) == 0 ? 0 : i9;
        if ((i3 & 256) != 0) {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        } else {
            iLIZIZ2 = 0;
        }
        i2 = (i3 & 512) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(2.5d))) : i2;
        if ((i3 & 1024) != 0) {
            i6 = R.attr.a1p;
        } else {
            i6 = 0;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i7 = 81;
        } else {
            i7 = 0;
        }
        C19344010m6 c19344010m6 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? new C19344010m6(null, 255) : c19343810m4;
        this.LJIJ = z;
        this.LJIJI = z2;
        this.LJIJJ = enumC1990607qy;
        this.LJIJJLI = i;
        this.LJIL = iLIZIZ;
        this.LJJ = i4;
        this.LJJI = i5;
        this.LJJIFFI = i9;
        this.LJJII = iLIZIZ2;
        this.LJJIII = i2;
        this.LJJIIJ = i6;
        this.LJJIIJZLJL = i7;
        this.LJJIIZ = c19344010m6;
    }
}
