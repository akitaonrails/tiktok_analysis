package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693450uAZ implements InterfaceC1692820u9Y {
    public final InterfaceC1693670uAv LIZ;
    public final long LIZIZ;
    public final C1680190tpB LIZJ;
    public final C1693240uAE LIZLLL;
    public final C1695610uE3 LJ;
    public final AbstractC1696400uFK LJFF;
    public final String LJI;
    public final long LJII;
    public final C1160090gIJ LJIIIIZZ;
    public final C1693560uAk LJIIIZ;
    public final C1694560uCM LJIIJ;
    public final long LJIIJJI;
    public final C1693510uAf LJIIL;
    public final C1693340uAO LJIILIIL;
    public final C1693870uBF LJIILJJIL;
    public final AbstractC1695860uES LJIILL;

    public final float LIZIZ() {
        return this.LIZ.LIZ();
    }

    public final AbstractC1668700tWe LIZJ() {
        return this.LIZ.LJFF();
    }

    public final long LIZLLL() {
        return this.LIZ.LIZJ();
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) C1685910tyP.LJIIJJI(LIZLLL())) + ", brush=" + LIZJ() + ", alpha=" + LIZIZ() + ", fontSize=" + ((Object) C1682440tso.LJFF(this.LIZIZ)) + ", fontWeight=" + this.LIZJ + ", fontStyle=" + this.LIZLLL + ", fontSynthesis=" + this.LJ + ", fontFamily=" + this.LJFF + ", fontFeatureSettings=" + this.LJI + ", letterSpacing=" + ((Object) C1682440tso.LJFF(this.LJII)) + ", baselineShift=" + this.LJIIIIZZ + ", textGeometricTransform=" + this.LJIIIZ + ", localeList=" + this.LJIIJ + ", background=" + ((Object) C1685910tyP.LJIIJJI(this.LJIIJJI)) + ", textDecoration=" + this.LJIIL + ", shadow=" + this.LJIILIIL + ", platformStyle=" + this.LJIILJJIL + ", drawStyle=" + this.LJIILL + ')';
    }

    public final int hashCode() {
        int iLJIIJ = C1685910tyP.LJIIJ(LIZLLL()) * 31;
        AbstractC1668700tWe abstractC1668700tWeLIZJ = LIZJ();
        int iHashCode = (((iLJIIJ + (abstractC1668700tWeLIZJ != null ? abstractC1668700tWeLIZJ.hashCode() : 0)) * 31) + Float.floatToIntBits(LIZIZ())) * 31;
        long j = this.LIZIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        int iY2 = (iHashCode + C786410Ut5.Y2(j)) * 31;
        C1680190tpB c1680190tpB = this.LIZJ;
        int i = (iY2 + (c1680190tpB != null ? c1680190tpB.LL : 0)) * 31;
        C1693240uAE c1693240uAE = this.LIZLLL;
        int i2 = (i + (c1693240uAE != null ? c1693240uAE.LIZ : 0)) * 31;
        C1695610uE3 c1695610uE3 = this.LJ;
        int i3 = (i2 + (c1695610uE3 != null ? c1695610uE3.LIZ : 0)) * 31;
        AbstractC1696400uFK abstractC1696400uFK = this.LJFF;
        int iHashCode2 = (i3 + (abstractC1696400uFK != null ? abstractC1696400uFK.hashCode() : 0)) * 31;
        String str = this.LJI;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJII)) * 31;
        C1160090gIJ c1160090gIJ = this.LJIIIIZZ;
        int iFloatToIntBits = (iHashCode3 + (c1160090gIJ != null ? Float.floatToIntBits(c1160090gIJ.LIZ) : 0)) * 31;
        C1693560uAk c1693560uAk = this.LJIIIZ;
        int iHashCode4 = (iFloatToIntBits + (c1693560uAk != null ? c1693560uAk.hashCode() : 0)) * 31;
        C1694560uCM c1694560uCM = this.LJIIJ;
        int iHashCode5 = (((iHashCode4 + (c1694560uCM != null ? c1694560uCM.hashCode() : 0)) * 31) + C1685910tyP.LJIIJ(this.LJIIJJI)) * 31;
        C1693510uAf c1693510uAf = this.LJIIL;
        int i4 = (iHashCode5 + (c1693510uAf != null ? c1693510uAf.LIZ : 0)) * 31;
        C1693340uAO c1693340uAO = this.LJIILIIL;
        int iHashCode6 = (i4 + (c1693340uAO != null ? c1693340uAO.hashCode() : 0)) * 31;
        C1693870uBF c1693870uBF = this.LJIILJJIL;
        int iHashCode7 = (iHashCode6 + (c1693870uBF != null ? c1693870uBF.hashCode() : 0)) * 31;
        AbstractC1695860uES abstractC1695860uES = this.LJIILL;
        return iHashCode7 + (abstractC1695860uES != null ? abstractC1695860uES.hashCode() : 0);
    }

    public final boolean LJ(C1693450uAZ c1693450uAZ) {
        if (this == c1693450uAZ) {
            return true;
        }
        if (C1682440tso.LIZ(this.LIZIZ, c1693450uAZ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1693450uAZ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1693450uAZ.LIZLLL) && Intrinsics.LJFF(this.LJ, c1693450uAZ.LJ) && Intrinsics.LJFF(this.LJFF, c1693450uAZ.LJFF) && Intrinsics.LJFF(this.LJI, c1693450uAZ.LJI) && C1682440tso.LIZ(this.LJII, c1693450uAZ.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1693450uAZ.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1693450uAZ.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1693450uAZ.LJIIJ) && C1685910tyP.LJ(this.LJIIJJI, c1693450uAZ.LJIIJJI) && Intrinsics.LJFF(this.LJIILJJIL, c1693450uAZ.LJIILJJIL)) {
            return true;
        }
        return false;
    }

    public final boolean LJFF(C1693450uAZ c1693450uAZ) {
        if (!Intrinsics.LJFF(this.LIZ, c1693450uAZ.LIZ) || !Intrinsics.LJFF(this.LJIIL, c1693450uAZ.LJIIL) || !Intrinsics.LJFF(this.LJIILIIL, c1693450uAZ.LJIILIIL) || !Intrinsics.LJFF(this.LJIILL, c1693450uAZ.LJIILL)) {
            return false;
        }
        return true;
    }

    public final C1693450uAZ LJI(C1693450uAZ c1693450uAZ) {
        if (c1693450uAZ == null) {
            return this;
        }
        return C1693470uAb.LIZ(this, c1693450uAZ.LIZ.LIZJ(), c1693450uAZ.LIZ.LJFF(), c1693450uAZ.LIZ.LIZ(), c1693450uAZ.LIZIZ, c1693450uAZ.LIZJ, c1693450uAZ.LIZLLL, c1693450uAZ.LJ, c1693450uAZ.LJFF, c1693450uAZ.LJI, c1693450uAZ.LJII, c1693450uAZ.LJIIIIZZ, c1693450uAZ.LJIIIZ, c1693450uAZ.LJIIJ, c1693450uAZ.LJIIJJI, c1693450uAZ.LJIIL, c1693450uAZ.LJIILIIL, c1693450uAZ.LJIILJJIL, c1693450uAZ.LJIILL);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693450uAZ)) {
            return false;
        }
        C1693450uAZ c1693450uAZ = (C1693450uAZ) obj;
        if (LJ(c1693450uAZ) && LJFF(c1693450uAZ)) {
            return true;
        }
        return false;
    }

    public static C1693450uAZ LIZ(C1693450uAZ c1693450uAZ, long j, int i) {
        long j2;
        C1680190tpB c1680190tpB;
        C1693240uAE c1693240uAE;
        C1695610uE3 c1695610uE3;
        AbstractC1696400uFK abstractC1696400uFK;
        String str;
        long j3;
        C1160090gIJ c1160090gIJ;
        C1693560uAk c1693560uAk;
        C1694560uCM c1694560uCM;
        C1693510uAf c1693510uAf;
        C1693340uAO c1693340uAO;
        C1693870uBF c1693870uBF;
        InterfaceC1693670uAv interfaceC1693670uAvLIZIZ;
        long jLIZLLL = j;
        if ((i & 1) != 0) {
            jLIZLLL = c1693450uAZ.LIZLLL();
        }
        long j4 = 0;
        if ((i & 2) != 0) {
            j2 = c1693450uAZ.LIZIZ;
        } else {
            j2 = 0;
        }
        AbstractC1695860uES abstractC1695860uES = null;
        if ((i & 4) != 0) {
            c1680190tpB = c1693450uAZ.LIZJ;
        } else {
            c1680190tpB = null;
        }
        if ((i & 8) != 0) {
            c1693240uAE = c1693450uAZ.LIZLLL;
        } else {
            c1693240uAE = null;
        }
        if ((i & 16) != 0) {
            c1695610uE3 = c1693450uAZ.LJ;
        } else {
            c1695610uE3 = null;
        }
        if ((i & 32) != 0) {
            abstractC1696400uFK = c1693450uAZ.LJFF;
        } else {
            abstractC1696400uFK = null;
        }
        if ((i & 64) != 0) {
            str = c1693450uAZ.LJI;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            j3 = c1693450uAZ.LJII;
        } else {
            j3 = 0;
        }
        if ((i & 256) != 0) {
            c1160090gIJ = c1693450uAZ.LJIIIIZZ;
        } else {
            c1160090gIJ = null;
        }
        if ((i & 512) != 0) {
            c1693560uAk = c1693450uAZ.LJIIIZ;
        } else {
            c1693560uAk = null;
        }
        if ((i & 1024) != 0) {
            c1694560uCM = c1693450uAZ.LJIIJ;
        } else {
            c1694560uCM = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = c1693450uAZ.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1693510uAf = c1693450uAZ.LJIIL;
        } else {
            c1693510uAf = null;
        }
        if ((i & 8192) != 0) {
            c1693340uAO = c1693450uAZ.LJIILIIL;
        } else {
            c1693340uAO = null;
        }
        if ((i & 16384) != 0) {
            c1693870uBF = c1693450uAZ.LJIILJJIL;
        } else {
            c1693870uBF = null;
        }
        if ((i & 32768) != 0) {
            abstractC1695860uES = c1693450uAZ.LJIILL;
        }
        c1693450uAZ.getClass();
        if (C1685910tyP.LJ(jLIZLLL, c1693450uAZ.LIZLLL())) {
            interfaceC1693670uAvLIZIZ = c1693450uAZ.LIZ;
        } else {
            InterfaceC1693670uAv.LIZ.getClass();
            interfaceC1693670uAvLIZIZ = C1693610uAp.LIZIZ(jLIZLLL);
        }
        return new C1693450uAZ(interfaceC1693670uAvLIZIZ, j2, c1680190tpB, c1693240uAE, c1695610uE3, abstractC1696400uFK, str, j3, c1160090gIJ, c1693560uAk, c1694560uCM, j4, c1693510uAf, c1693340uAO, c1693870uBF, abstractC1695860uES);
    }

    public C1693450uAZ(long j, long j2, C1680190tpB c1680190tpB, C1693240uAE c1693240uAE, C1695610uE3 c1695610uE3, AbstractC1696400uFK abstractC1696400uFK, String str, long j3, C1160090gIJ c1160090gIJ, C1693560uAk c1693560uAk, C1694560uCM c1694560uCM, long j4, C1693510uAf c1693510uAf, C1693340uAO c1693340uAO, int i) {
        this((i & 1) != 0 ? C1685910tyP.LJIIJ : j, (i & 2) != 0 ? C1682440tso.LIZJ : j2, (i & 4) != 0 ? null : c1680190tpB, (i & 8) != 0 ? null : c1693240uAE, (i & 16) != 0 ? null : c1695610uE3, (i & 32) != 0 ? null : abstractC1696400uFK, (i & 64) != 0 ? null : str, (i & 128) != 0 ? C1682440tso.LIZJ : j3, (i & 256) != 0 ? null : c1160090gIJ, (i & 512) != 0 ? null : c1693560uAk, (i & 1024) != 0 ? null : c1694560uCM, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C1685910tyP.LJIIJ : j4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1693510uAf, (i & 8192) != 0 ? null : c1693340uAO, (C1693870uBF) null, (AbstractC1695860uES) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1693450uAZ(long j, long j2, C1680190tpB c1680190tpB, C1693240uAE c1693240uAE, C1695610uE3 c1695610uE3, AbstractC1696400uFK abstractC1696400uFK, String str, long j3, C1160090gIJ c1160090gIJ, C1693560uAk c1693560uAk, C1694560uCM c1694560uCM, long j4, C1693510uAf c1693510uAf, C1693340uAO c1693340uAO, C1693870uBF c1693870uBF, AbstractC1695860uES abstractC1695860uES) {
        this(C1693610uAp.LIZIZ(j), j2, c1680190tpB, c1693240uAE, c1695610uE3, abstractC1696400uFK, str, j3, c1160090gIJ, c1693560uAk, c1694560uCM, j4, c1693510uAf, c1693340uAO, c1693870uBF, abstractC1695860uES);
        InterfaceC1693670uAv.LIZ.getClass();
    }

    public C1693450uAZ(InterfaceC1693670uAv interfaceC1693670uAv, long j, C1680190tpB c1680190tpB, C1693240uAE c1693240uAE, C1695610uE3 c1695610uE3, AbstractC1696400uFK abstractC1696400uFK, String str, long j2, C1160090gIJ c1160090gIJ, C1693560uAk c1693560uAk, C1694560uCM c1694560uCM, long j3, C1693510uAf c1693510uAf, C1693340uAO c1693340uAO, C1693870uBF c1693870uBF, AbstractC1695860uES abstractC1695860uES) {
        this.LIZ = interfaceC1693670uAv;
        this.LIZIZ = j;
        this.LIZJ = c1680190tpB;
        this.LIZLLL = c1693240uAE;
        this.LJ = c1695610uE3;
        this.LJFF = abstractC1696400uFK;
        this.LJI = str;
        this.LJII = j2;
        this.LJIIIIZZ = c1160090gIJ;
        this.LJIIIZ = c1693560uAk;
        this.LJIIJ = c1694560uCM;
        this.LJIIJJI = j3;
        this.LJIIL = c1693510uAf;
        this.LJIILIIL = c1693340uAO;
        this.LJIILJJIL = c1693870uBF;
        this.LJIILL = abstractC1695860uES;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1693450uAZ(AbstractC1668700tWe abstractC1668700tWe, float f, long j, C1680190tpB c1680190tpB, C1693240uAE c1693240uAE, C1695610uE3 c1695610uE3, AbstractC1696400uFK abstractC1696400uFK, String str, long j2, C1160090gIJ c1160090gIJ, C1693560uAk c1693560uAk, C1694560uCM c1694560uCM, long j3, C1693510uAf c1693510uAf, C1693340uAO c1693340uAO, C1693870uBF c1693870uBF, AbstractC1695860uES abstractC1695860uES) {
        this(C1693610uAp.LIZ(f, abstractC1668700tWe), j, c1680190tpB, c1693240uAE, c1695610uE3, abstractC1696400uFK, str, j2, c1160090gIJ, c1693560uAk, c1694560uCM, j3, c1693510uAf, c1693340uAO, c1693870uBF, abstractC1695860uES);
        InterfaceC1693670uAv.LIZ.getClass();
    }
}
