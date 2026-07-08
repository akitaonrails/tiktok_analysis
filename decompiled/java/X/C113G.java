package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.bytebench.EffectPanelPrefetchStrategy;
import com.ss.android.ugc.aweme.experiment.EditEffectPanelSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.113G, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C113G {
    public final C361270EEj LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final Function0<Boolean> LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;
    public final float LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final int LJJI;
    public final boolean LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public final boolean LJJIIJ;
    public final int LJJIIJZLJL;
    public final int LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public final String LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final boolean LJJIJIL;
    public final int LJJIJL;
    public final boolean LJJIJLIJ;
    public final InterfaceC361400EEw LJJIL;

    public C113G() {
        this(null, false, false, false, 0.0f, false, false, null, false, false, false, false, 0, false, false, false, false, false, null, false, false, 0, false, null, -1, 511);
    }

    public C113G(C361270EEj c361270EEj, boolean z, boolean z2, boolean z3, float f, boolean z4, boolean z5, Function0 function0, boolean z6, boolean z7, boolean z8, boolean z9, int i, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, boolean z15, boolean z16, int i2, boolean z17, C364090EPf c364090EPf, int i3, int i4) {
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        int iLIZ;
        int iMin;
        int i9;
        boolean zLIZ;
        int i10;
        int i11;
        double d;
        C364090EPf c364090EPf2 = c364090EPf;
        boolean z22 = z17;
        int i12 = i2;
        boolean z23 = z15;
        boolean z24 = z14;
        boolean z25 = z13;
        boolean z26 = z12;
        boolean z27 = z11;
        boolean z28 = z10;
        int i13 = i;
        boolean z29 = z9;
        boolean z30 = z6;
        float f3 = f;
        boolean z31 = z3;
        Function0 function02 = function0;
        boolean z32 = z8;
        boolean z33 = z16;
        boolean z34 = z4;
        boolean z35 = z2;
        boolean z36 = z5;
        boolean z37 = z;
        String str2 = str;
        boolean z38 = z7;
        C361270EEj c361270EEj2 = (i3 & 1) != 0 ? null : c361270EEj;
        if ((i3 & 2) != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        z37 = (i3 & 4) != 0 ? true : z37;
        z35 = (i3 & 8) != 0 ? true : z35;
        z31 = (i3 & 16) != 0 ? true : z31;
        f3 = (i3 & 32) != 0 ? 52.0f : f3;
        if ((i3 & 64) != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        if ((i3 & 128) != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        z34 = (i3 & 256) != 0 ? false : z34;
        z36 = (i3 & 512) != 0 ? false : z36;
        if ((i3 & 1024) != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        function02 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? AFwS217S0000000_28.get$arr$(621) : function02;
        z30 = (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? true : z30;
        z38 = (i3 & 16384) != 0 ? true : z38;
        if ((32768 & i3) != 0) {
            i5 = EditEffectPanelSettings.LIZ().panelColumn;
        } else {
            i5 = 0;
        }
        z32 = (65536 & i3) != 0 ? true : z32;
        z29 = (262144 & i3) != 0 ? false : z29;
        if ((524288 & i3) != 0) {
            i6 = R.attr.ee;
        } else {
            i6 = 0;
        }
        i13 = (1048576 & i3) != 0 ? 1 : i13;
        if ((2097152 & i3) != 0 && !C2281551ESb.LIZIZ.LJJIII()) {
            i7 = EditEffectPanelSettings.LIZ().panelColumn * EditEffectPanelSettings.LIZ().autoDownloadLine;
        } else {
            i7 = 0;
        }
        if ((4194304 & i3) != 0 && !C2281551ESb.LIZIZ.LJJIII()) {
            i8 = EditEffectPanelSettings.LIZ().preDownloadSize;
        } else {
            i8 = 0;
        }
        if ((8388608 & i3) != 0) {
            f2 = 0.35f;
        } else {
            f2 = 0.0f;
        }
        if ((16777216 & i3) != 0) {
            iLIZ = C366700EZg.LIZ(4.0d);
        } else {
            iLIZ = 0;
        }
        if ((33554432 & i3) != 0) {
            if (C357780E0y.LIZ()) {
                d = 100.0d;
            } else {
                d = 96.0d;
            }
            iMin = Math.min(C366700EZg.LIZ(d), (int) (((C1415610mwR.LIZIZ() * 0.92f) - ((i5 - 1) * iLIZ)) / i5));
        } else {
            iMin = 0;
        }
        if ((67108864 & i3) != 0) {
            i9 = 12;
        } else {
            i9 = 0;
        }
        z28 = (134217728 & i3) != 0 ? false : z28;
        z27 = (268435456 & i3) != 0 ? false : z27;
        z26 = (536870912 & i3) != 0 ? false : z26;
        if ((1073741824 & i3) != 0) {
            zLIZ = EffectPanelPrefetchStrategy.LIZ();
        } else {
            zLIZ = false;
        }
        if ((i3 & Integer.MIN_VALUE) != 0 && EffectPanelPrefetchStrategy.LIZ()) {
            i10 = EffectPanelPrefetchStrategy.LJ;
        } else {
            i10 = 0;
        }
        if ((i4 & 1) == 0 || !EffectPanelPrefetchStrategy.LIZ()) {
            i11 = 0;
        } else {
            i11 = EffectPanelPrefetchStrategy.LJFF;
        }
        z25 = (i4 & 2) != 0 ? false : z25;
        z24 = (i4 & 4) != 0 ? false : z24;
        str2 = (i4 & 8) != 0 ? "" : str2;
        z23 = (i4 & 16) != 0 ? false : z23;
        z33 = (i4 & 32) != 0 ? false : z33;
        i12 = (i4 & 64) != 0 ? R.attr.bn : i12;
        z22 = (i4 & 128) != 0 ? false : z22;
        c364090EPf2 = (i4 & 256) != 0 ? null : c364090EPf2;
        this.LIZ = c361270EEj2;
        this.LIZIZ = z18;
        this.LIZJ = z37;
        this.LIZLLL = z35;
        this.LJ = z31;
        this.LJFF = f3;
        this.LJI = z19;
        this.LJII = z20;
        this.LJIIIIZZ = z34;
        this.LJIIIZ = z36;
        this.LJIIJ = z21;
        this.LJIIJJI = function02;
        this.LJIIL = z30;
        this.LJIILIIL = z38;
        this.LJIILJJIL = i5;
        this.LJIILL = z32;
        this.LJIILLIIL = z29;
        this.LJIIZILJ = i6;
        this.LJIJ = i13;
        this.LJIJI = i7;
        this.LJIJJ = i8;
        this.LJIJJLI = f2;
        this.LJIL = iLIZ;
        this.LJJ = iMin;
        this.LJJI = i9;
        this.LJJIFFI = z28;
        this.LJJII = z27;
        this.LJJIII = z26;
        this.LJJIIJ = zLIZ;
        this.LJJIIJZLJL = i10;
        this.LJJIIZ = i11;
        this.LJJIIZI = z25;
        this.LJJIJ = z24;
        this.LJJIJIIJI = str2;
        this.LJJIJIIJIL = z23;
        this.LJJIJIL = z33;
        this.LJJIJL = i12;
        this.LJJIJLIJ = z22;
        this.LJJIL = c364090EPf2;
    }
}
