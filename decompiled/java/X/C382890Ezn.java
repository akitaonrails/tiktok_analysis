package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ezn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382890Ezn {
    public final boolean LIZ;
    public final String LIZIZ;
    public final C0F1E LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final int LJI;
    public final boolean LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final Boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C382890Ezn() {
        this(null, 0 == true ? 1 : 0, 32767);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382890Ezn)) {
            return false;
        }
        C382890Ezn c382890Ezn = (C382890Ezn) obj;
        return this.LIZ == c382890Ezn.LIZ && Intrinsics.LJFF(this.LIZIZ, c382890Ezn.LIZIZ) && this.LIZJ == c382890Ezn.LIZJ && this.LIZLLL == c382890Ezn.LIZLLL && this.LJ == c382890Ezn.LJ && Intrinsics.LJFF(this.LJFF, c382890Ezn.LJFF) && this.LJI == c382890Ezn.LJI && this.LJII == c382890Ezn.LJII && this.LJIIIIZZ == c382890Ezn.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c382890Ezn.LJIIIZ) && this.LJIIJ == c382890Ezn.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c382890Ezn.LJIIJJI) && this.LJIIL == c382890Ezn.LJIIL && this.LJIILIIL == c382890Ezn.LJIILIIL && this.LJIILJJIL == c382890Ezn.LJIILJJIL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        String str = this.LIZIZ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        C0F1E c0f1e = this.LIZJ;
        int iHashCode2 = (((((((((((((iHashCode + (c0f1e == null ? 0 : c0f1e.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF.hashCode()) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31;
        String str2 = this.LJIIIZ;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LJIIJ) * 31;
        Boolean bool = this.LJIIJJI;
        return ((((((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL);
    }

    public final String toString() {
        return "EPAIGCEditTextStates(showKeyboard=" + this.LIZ + ", promptState=" + this.LIZIZ + ", generateBtnState=" + this.LIZJ + ", configureBtnState=" + this.LIZLLL + ", curModelQuota=" + this.LJ + ", showToast=" + this.LJFF + ", showToastCount=" + this.LJI + ", disableAlbum=" + this.LJII + ", keyboardShowRequestId=" + this.LJIIIIZZ + ", editTextHint=" + this.LJIIIZ + ", imageQuantity=" + this.LJIIJ + ", isVideoModel=" + this.LJIIJJI + ", onDestroyView=" + this.LJIIL + ", skeletonLoading=" + this.LJIILIIL + ", showImageUploadButton=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C382890Ezn(String str, C0F1E c0f1e, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        C0F1E c0f1e2 = c0f1e;
        String str2 = str;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        str2 = (i & 2) != 0 ? null : str2;
        c0f1e2 = (i & 4) != 0 ? C0F1E.ENABLED : c0f1e2;
        String str3 = (i & 32) != 0 ? "" : null;
        if ((i & 8192) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16384) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(z, str2, c0f1e2, false, 0, str3, 0, false, 0L, null, 0, null, false, z2, z3);
    }

    public C382890Ezn(boolean z, String str, C0F1E c0f1e, boolean z2, int i, String str2, int i2, boolean z3, long j, String str3, int i3, Boolean bool, boolean z4, boolean z5, boolean z6) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = c0f1e;
        this.LIZLLL = z2;
        this.LJ = i;
        this.LJFF = str2;
        this.LJI = i2;
        this.LJII = z3;
        this.LJIIIIZZ = j;
        this.LJIIIZ = str3;
        this.LJIIJ = i3;
        this.LJIIJJI = bool;
        this.LJIIL = z4;
        this.LJIILIIL = z5;
        this.LJIILJJIL = z6;
    }

    public static C382890Ezn LIZ(C382890Ezn c382890Ezn, boolean z, String str, C0F1E c0f1e, boolean z2, int i, String str2, int i2, boolean z3, long j, String str3, int i3, Boolean bool, boolean z4, boolean z5, boolean z6, int i4) {
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        Boolean bool2 = bool;
        String str4 = str3;
        long j2 = j;
        boolean z10 = z3;
        int i5 = i2;
        String str5 = str2;
        int i6 = i;
        boolean z11 = z2;
        C0F1E c0f1e2 = c0f1e;
        String str6 = str;
        int i7 = i3;
        boolean z12 = z;
        if ((i4 & 1) != 0) {
            z12 = c382890Ezn.LIZ;
        }
        if ((i4 & 2) != 0) {
            str6 = c382890Ezn.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            c0f1e2 = c382890Ezn.LIZJ;
        }
        if ((i4 & 8) != 0) {
            z11 = c382890Ezn.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            i6 = c382890Ezn.LJ;
        }
        if ((i4 & 32) != 0) {
            str5 = c382890Ezn.LJFF;
        }
        if ((i4 & 64) != 0) {
            i5 = c382890Ezn.LJI;
        }
        if ((i4 & 128) != 0) {
            z10 = c382890Ezn.LJII;
        }
        if ((i4 & 256) != 0) {
            j2 = c382890Ezn.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            str4 = c382890Ezn.LJIIIZ;
        }
        if ((i4 & 1024) != 0) {
            i7 = c382890Ezn.LJIIJ;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = c382890Ezn.LJIIJJI;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z9 = c382890Ezn.LJIIL;
        }
        if ((i4 & 8192) != 0) {
            z8 = c382890Ezn.LJIILIIL;
        }
        if ((i4 & 16384) != 0) {
            z7 = c382890Ezn.LJIILJJIL;
        }
        c382890Ezn.getClass();
        return new C382890Ezn(z12, str6, c0f1e2, z11, i6, str5, i5, z10, j2, str4, i7, bool2, z9, z8, z7);
    }
}
