package X;

import com.bytedance.ies.nle.editor_jni.NLEVQScoreWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2216011BoF {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final long LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final C099F LJIIL = C090F.LIZIZ();
    public volatile boolean LJIILIIL;
    public volatile NLEVQScoreWrapper LJIILJJIL;
    public volatile C2216031BoH LJIILL;
    public volatile AnonymousClass0956 LJIILLIIL;
    public volatile AnonymousClass0956 LJIIZILJ;
    public volatile boolean LJIJ;
    public volatile boolean LJIJI;
    public volatile boolean LJIJJ;
    public volatile boolean LJIJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2216011BoF)) {
            return false;
        }
        C2216011BoF c2216011BoF = (C2216011BoF) obj;
        return Intrinsics.LJFF(this.LIZ, c2216011BoF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2216011BoF.LIZIZ) && this.LIZJ == c2216011BoF.LIZJ && this.LIZLLL == c2216011BoF.LIZLLL && this.LJ == c2216011BoF.LJ && this.LJFF == c2216011BoF.LJFF && this.LJI == c2216011BoF.LJI && this.LJII == c2216011BoF.LJII && this.LJIIIIZZ == c2216011BoF.LJIIIIZZ && this.LJIIIZ == c2216011BoF.LJIIIZ && this.LJIIJ == c2216011BoF.LJIIJ && this.LJIIJJI == c2216011BoF.LJIIJJI;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + C786410Ut5.Y2(this.LJIIJJI);
    }

    public final String toString() {
        return "ScoreSession(publishId=" + this.LIZ + ", postItemId=" + this.LIZIZ + ", hasEnterCoverEditor=" + this.LIZJ + ", originalWidth=" + this.LIZLLL + ", originalHeight=" + this.LJ + ", enableHighClarityPost=" + this.LJFF + ", startTime=" + this.LJI + ", durationMs=" + this.LJII + ", videoWidth=" + this.LJIIIIZZ + ", videoHeight=" + this.LJIIIZ + ", softTimeoutMs=" + this.LJIIJ + ", hardTtlMs=" + this.LJIIJJI + ')';
    }

    public C2216011BoF(String str, String str2, boolean z, int i, int i2, boolean z2, long j, long j2, int i3, int i4, long j3, long j4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z2;
        this.LJI = j;
        this.LJII = j2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = j3;
        this.LJIIJJI = j4;
    }
}
