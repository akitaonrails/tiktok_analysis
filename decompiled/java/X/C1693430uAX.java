package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uAX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1693430uAX {
    public static final C1693430uAX LIZLLL = new C1693430uAX(0, 0, null, null, null, 0, null, 0, 0, 16777215);
    public final C1693450uAZ LIZ;
    public final C1693480uAc LIZIZ;
    public final C1683290tuB LIZJ;

    public final long LIZJ() {
        return this.LIZ.LIZLLL();
    }

    public final int LJ() {
        C1693450uAZ c1693450uAZ = this.LIZ;
        long j = c1693450uAZ.LIZIZ;
        C1682450tsp[] c1682450tspArr = C1682440tso.LIZIZ;
        int iY2 = C786410Ut5.Y2(j) * 31;
        C1680190tpB c1680190tpB = c1693450uAZ.LIZJ;
        int i = (iY2 + (c1680190tpB != null ? c1680190tpB.LL : 0)) * 31;
        C1693240uAE c1693240uAE = c1693450uAZ.LIZLLL;
        int i2 = (i + (c1693240uAE != null ? c1693240uAE.LIZ : 0)) * 31;
        C1695610uE3 c1695610uE3 = c1693450uAZ.LJ;
        int i3 = (i2 + (c1695610uE3 != null ? c1695610uE3.LIZ : 0)) * 31;
        AbstractC1696400uFK abstractC1696400uFK = c1693450uAZ.LJFF;
        int iHashCode = (i3 + (abstractC1696400uFK != null ? abstractC1696400uFK.hashCode() : 0)) * 31;
        String str = c1693450uAZ.LJI;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(c1693450uAZ.LJII)) * 31;
        C1160090gIJ c1160090gIJ = c1693450uAZ.LJIIIIZZ;
        int iFloatToIntBits = (iHashCode2 + (c1160090gIJ != null ? Float.floatToIntBits(c1160090gIJ.LIZ) : 0)) * 31;
        C1693560uAk c1693560uAk = c1693450uAZ.LJIIIZ;
        int iHashCode3 = (iFloatToIntBits + (c1693560uAk != null ? c1693560uAk.hashCode() : 0)) * 31;
        C1694560uCM c1694560uCM = c1693450uAZ.LJIIJ;
        int iHashCode4 = (((iHashCode3 + (c1694560uCM != null ? c1694560uCM.hashCode() : 0)) * 31) + C1685910tyP.LJIIJ(c1693450uAZ.LJIIJJI)) * 31;
        C1693870uBF c1693870uBF = c1693450uAZ.LJIILJJIL;
        int iHashCode5 = (((iHashCode4 + (c1693870uBF != null ? c1693870uBF.hashCode() : 0)) * 31) + this.LIZIZ.hashCode()) * 31;
        C1683290tuB c1683290tuB = this.LIZJ;
        return iHashCode5 + (c1683290tuB != null ? c1683290tuB.hashCode() : 0);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1683290tuB c1683290tuB = this.LIZJ;
        return iHashCode + (c1683290tuB != null ? c1683290tuB.hashCode() : 0);
    }

    public final String toString() {
        return "TextStyle(color=" + ((Object) C1685910tyP.LJIIJJI(LIZJ())) + ", brush=" + this.LIZ.LIZJ() + ", alpha=" + this.LIZ.LIZIZ() + ", fontSize=" + ((Object) C1682440tso.LJFF(this.LIZ.LIZIZ)) + ", fontWeight=" + this.LIZ.LIZJ + ", fontStyle=" + this.LIZ.LIZLLL + ", fontSynthesis=" + this.LIZ.LJ + ", fontFamily=" + this.LIZ.LJFF + ", fontFeatureSettings=" + this.LIZ.LJI + ", letterSpacing=" + ((Object) C1682440tso.LJFF(this.LIZ.LJII)) + ", baselineShift=" + this.LIZ.LJIIIIZZ + ", textGeometricTransform=" + this.LIZ.LJIIIZ + ", localeList=" + this.LIZ.LJIIJ + ", background=" + ((Object) C1685910tyP.LJIIJJI(this.LIZ.LJIIJJI)) + ", textDecoration=" + this.LIZ.LJIIL + ", shadow=" + this.LIZ.LJIILIIL + ", drawStyle=" + this.LIZ.LJIILL + ", textAlign=" + ((Object) C1692070u8L.LIZ(this.LIZIZ.LIZ)) + ", textDirection=" + ((Object) C1693820uBA.LIZ(this.LIZIZ.LIZIZ)) + ", lineHeight=" + ((Object) C1682440tso.LJFF(this.LIZIZ.LIZJ)) + ", textIndent=" + this.LIZIZ.LIZLLL + ", platformStyle=" + this.LIZJ + ", lineHeightStyle=" + this.LIZIZ.LJFF + ", lineBreak=" + ((Object) C1693660uAu.LIZ(this.LIZIZ.LJI)) + ", hyphens=" + ((Object) C1693860uBE.LIZ(this.LIZIZ.LJII)) + ", textMotion=" + this.LIZIZ.LJIIIIZZ + ')';
    }

    public final boolean LIZLLL(C1693430uAX c1693430uAX) {
        if (this != c1693430uAX) {
            if (Intrinsics.LJFF(this.LIZIZ, c1693430uAX.LIZIZ) && this.LIZ.LJ(c1693430uAX.LIZ)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final C1693430uAX LJFF(C1693430uAX c1693430uAX) {
        if (c1693430uAX != null && !Intrinsics.LJFF(c1693430uAX, LIZLLL)) {
            return new C1693430uAX(this.LIZ.LJI(c1693430uAX.LIZ), this.LIZIZ.LIZ(c1693430uAX.LIZIZ));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693430uAX)) {
            return false;
        }
        C1693430uAX c1693430uAX = (C1693430uAX) obj;
        if (Intrinsics.LJFF(this.LIZ, c1693430uAX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1693430uAX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1693430uAX.LIZJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1693430uAX(C1693450uAZ c1693450uAZ, C1693480uAc c1693480uAc) {
        C1683290tuB c1683290tuB;
        C1693870uBF c1693870uBF = c1693450uAZ.LJIILJJIL;
        C1693520uAg c1693520uAg = c1693480uAc.LJ;
        if (c1693870uBF == null && c1693520uAg == null) {
            c1683290tuB = null;
        } else {
            c1683290tuB = new C1683290tuB(c1693870uBF, c1693520uAg);
        }
        this(c1693450uAZ, c1693480uAc, c1683290tuB);
    }

    public C1693430uAX(C1693450uAZ c1693450uAZ, C1693480uAc c1693480uAc, C1683290tuB c1683290tuB) {
        this.LIZ = c1693450uAZ;
        this.LIZIZ = c1693480uAc;
        this.LIZJ = c1683290tuB;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1693430uAX(long j, long j2, C1680190tpB c1680190tpB, AbstractC1696400uFK abstractC1696400uFK, int i) {
        long j3;
        long j4;
        AbstractC1696400uFK abstractC1696400uFK2 = abstractC1696400uFK;
        C1680190tpB c1680190tpB2 = c1680190tpB;
        long j5 = j2;
        long j6 = (i & 1) != 0 ? C1685910tyP.LJIIJ : j;
        j5 = (i & 2) != 0 ? C1682440tso.LIZJ : j5;
        c1680190tpB2 = (i & 4) != 0 ? null : c1680190tpB2;
        abstractC1696400uFK2 = (i & 32) != 0 ? null : abstractC1696400uFK2;
        if ((i & 128) != 0) {
            j3 = C1682440tso.LIZJ;
        } else {
            j3 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = C1685910tyP.LJIIJ;
        } else {
            j4 = 0;
        }
        this(new C1693450uAZ(j6, j5, c1680190tpB2, (C1693240uAE) null, (C1695610uE3) null, abstractC1696400uFK2, (String) null, j3, (C1160090gIJ) null, (C1693560uAk) null, (C1694560uCM) null, j4, (C1693510uAf) null, (C1693340uAO) null, (C1693870uBF) null, (AbstractC1695860uES) null), new C1693480uAc(Integer.MIN_VALUE, Integer.MIN_VALUE, (i & 131072) != 0 ? C1682440tso.LIZJ : 0L, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public static C1693430uAX LJI(int i, int i2, int i3, long j, C1693430uAX c1693430uAX) {
        long j2;
        long j3;
        long j4;
        int i4 = i2;
        int i5 = i;
        long j5 = j;
        if ((i3 & 1) != 0) {
            j5 = C1685910tyP.LJIIJ;
        }
        long j6 = 0;
        if ((i3 & 2) != 0) {
            j2 = C1682440tso.LIZJ;
        } else {
            j2 = 0;
        }
        if ((i3 & 128) != 0) {
            j3 = C1682440tso.LIZJ;
        } else {
            j3 = 0;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = C1685910tyP.LJIIJ;
        } else {
            j4 = 0;
        }
        int i6 = Integer.MIN_VALUE;
        if ((32768 & i3) != 0) {
            i5 = Integer.MIN_VALUE;
        }
        if ((65536 & i3) != 0) {
            i4 = Integer.MIN_VALUE;
        }
        if ((131072 & i3) != 0) {
            j6 = C1682440tso.LIZJ;
        }
        int i7 = 1048576 & i3;
        if ((i3 & 2097152) == 0) {
            i6 = 0;
        }
        C1693450uAZ c1693450uAZLIZ = C1693470uAb.LIZ(c1693430uAX.LIZ, j5, null, Float.NaN, j2, null, null, null, null, null, j3, null, null, null, j4, null, null, null, null);
        C1693480uAc c1693480uAcLIZ = C1683300tuC.LIZ(c1693430uAX.LIZIZ, i5, i4, j6, null, null, null, 0, i6, null);
        if (c1693430uAX.LIZ == c1693450uAZLIZ && c1693430uAX.LIZIZ == c1693480uAcLIZ) {
            return c1693430uAX;
        }
        return new C1693430uAX(c1693450uAZLIZ, c1693480uAcLIZ);
    }

    public static C1693430uAX LIZIZ(int i, long j, long j2, long j3, C1683290tuB c1683290tuB, C1693430uAX c1693430uAX, AbstractC1696400uFK abstractC1696400uFK, C1680190tpB c1680190tpB) {
        C1693240uAE c1693240uAE;
        C1695610uE3 c1695610uE3;
        String str;
        C1160090gIJ c1160090gIJ;
        C1693560uAk c1693560uAk;
        C1694560uCM c1694560uCM;
        long j4;
        C1693510uAf c1693510uAf;
        C1693340uAO c1693340uAO;
        AbstractC1695860uES abstractC1695860uES;
        C1692070u8L c1692070u8L;
        C1693820uBA c1693820uBA;
        long j5;
        C1693390uAT c1693390uAT;
        C1695380uDg c1695380uDg;
        C1693660uAu c1693660uAu;
        C1693860uBE c1693860uBE;
        C1693790uB7 c1693790uB7;
        InterfaceC1693670uAv interfaceC1693670uAvLIZIZ;
        C1693870uBF c1693870uBF;
        int i2;
        int i3;
        C1693520uAg c1693520uAg;
        int i4;
        C1683290tuB c1683290tuB2 = c1683290tuB;
        AbstractC1696400uFK abstractC1696400uFK2 = abstractC1696400uFK;
        long j6 = j3;
        long jLIZLLL = j;
        C1680190tpB c1680190tpB2 = c1680190tpB;
        long j7 = j2;
        if ((i & 1) != 0) {
            jLIZLLL = c1693430uAX.LIZ.LIZLLL();
        }
        if ((i & 2) != 0) {
            j7 = c1693430uAX.LIZ.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1680190tpB2 = c1693430uAX.LIZ.LIZJ;
        }
        if ((i & 8) != 0) {
            c1693240uAE = c1693430uAX.LIZ.LIZLLL;
        } else {
            c1693240uAE = null;
        }
        if ((i & 16) != 0) {
            c1695610uE3 = c1693430uAX.LIZ.LJ;
        } else {
            c1695610uE3 = null;
        }
        if ((i & 32) != 0) {
            abstractC1696400uFK2 = c1693430uAX.LIZ.LJFF;
        }
        if ((i & 64) != 0) {
            str = c1693430uAX.LIZ.LJI;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            j6 = c1693430uAX.LIZ.LJII;
        }
        if ((i & 256) != 0) {
            c1160090gIJ = c1693430uAX.LIZ.LJIIIIZZ;
        } else {
            c1160090gIJ = null;
        }
        if ((i & 512) != 0) {
            c1693560uAk = c1693430uAX.LIZ.LJIIIZ;
        } else {
            c1693560uAk = null;
        }
        if ((i & 1024) != 0) {
            c1694560uCM = c1693430uAX.LIZ.LJIIJ;
        } else {
            c1694560uCM = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j4 = c1693430uAX.LIZ.LJIIJJI;
        } else {
            j4 = 0;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1693510uAf = c1693430uAX.LIZ.LJIIL;
        } else {
            c1693510uAf = null;
        }
        if ((i & 8192) != 0) {
            c1693340uAO = c1693430uAX.LIZ.LJIILIIL;
        } else {
            c1693340uAO = null;
        }
        if ((i & 16384) != 0) {
            abstractC1695860uES = c1693430uAX.LIZ.LJIILL;
        } else {
            abstractC1695860uES = null;
        }
        if ((32768 & i) != 0) {
            c1692070u8L = new C1692070u8L(c1693430uAX.LIZIZ.LIZ);
        } else {
            c1692070u8L = null;
        }
        if ((65536 & i) != 0) {
            c1693820uBA = new C1693820uBA(c1693430uAX.LIZIZ.LIZIZ);
        } else {
            c1693820uBA = null;
        }
        if ((131072 & i) != 0) {
            j5 = c1693430uAX.LIZIZ.LIZJ;
        } else {
            j5 = 0;
        }
        if ((262144 & i) != 0) {
            c1693390uAT = c1693430uAX.LIZIZ.LIZLLL;
        } else {
            c1693390uAT = null;
        }
        if ((524288 & i) != 0) {
            c1683290tuB2 = c1693430uAX.LIZJ;
        }
        if ((1048576 & i) != 0) {
            c1695380uDg = c1693430uAX.LIZIZ.LJFF;
        } else {
            c1695380uDg = null;
        }
        if ((2097152 & i) != 0) {
            c1693660uAu = new C1693660uAu(c1693430uAX.LIZIZ.LJI);
        } else {
            c1693660uAu = null;
        }
        if ((4194304 & i) != 0) {
            c1693860uBE = new C1693860uBE(c1693430uAX.LIZIZ.LJII);
        } else {
            c1693860uBE = null;
        }
        if ((i & 8388608) != 0) {
            c1693790uB7 = c1693430uAX.LIZIZ.LJIIIIZZ;
        } else {
            c1693790uB7 = null;
        }
        c1693430uAX.getClass();
        if (C1685910tyP.LJ(jLIZLLL, c1693430uAX.LIZ.LIZLLL())) {
            interfaceC1693670uAvLIZIZ = c1693430uAX.LIZ.LIZ;
        } else {
            InterfaceC1693670uAv.LIZ.getClass();
            interfaceC1693670uAvLIZIZ = C1693610uAp.LIZIZ(jLIZLLL);
        }
        if (c1683290tuB2 != null) {
            c1693870uBF = c1683290tuB2.LIZ;
        } else {
            c1693870uBF = null;
        }
        C1693450uAZ c1693450uAZ = new C1693450uAZ(interfaceC1693670uAvLIZIZ, j7, c1680190tpB2, c1693240uAE, c1695610uE3, abstractC1696400uFK2, str, j6, c1160090gIJ, c1693560uAk, c1694560uCM, j4, c1693510uAf, c1693340uAO, c1693870uBF, abstractC1695860uES);
        int i5 = Integer.MIN_VALUE;
        if (c1692070u8L != null) {
            i2 = c1692070u8L.LIZ;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        if (c1693820uBA != null) {
            i3 = c1693820uBA.LIZ;
        } else {
            i3 = Integer.MIN_VALUE;
        }
        if (c1683290tuB2 != null) {
            c1693520uAg = c1683290tuB2.LIZIZ;
        } else {
            c1693520uAg = null;
        }
        if (c1693660uAu != null) {
            i4 = c1693660uAu.LIZ;
        } else {
            i4 = 0;
        }
        if (c1693860uBE != null) {
            i5 = c1693860uBE.LIZ;
        }
        return new C1693430uAX(c1693450uAZ, new C1693480uAc(i2, i3, j5, c1693390uAT, c1693520uAg, c1695380uDg, i4, i5, c1693790uB7), c1683290tuB2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1693430uAX(long j, long j2, C1680190tpB c1680190tpB, C1693240uAE c1693240uAE, AbstractC1696400uFK abstractC1696400uFK, long j3, C1693510uAf c1693510uAf, int i, long j4, int i2) {
        long j5;
        int i3;
        long j6 = j4;
        int i4 = i;
        long j7 = j3;
        AbstractC1696400uFK abstractC1696400uFK2 = abstractC1696400uFK;
        C1680190tpB c1680190tpB2 = c1680190tpB;
        C1693240uAE c1693240uAE2 = c1693240uAE;
        C1693510uAf c1693510uAf2 = c1693510uAf;
        long j8 = j2;
        long j9 = (i2 & 1) != 0 ? C1685910tyP.LJIIJ : j;
        j8 = (i2 & 2) != 0 ? C1682440tso.LIZJ : j8;
        c1680190tpB2 = (i2 & 4) != 0 ? null : c1680190tpB2;
        c1693240uAE2 = (i2 & 8) != 0 ? null : c1693240uAE2;
        abstractC1696400uFK2 = (i2 & 32) != 0 ? null : abstractC1696400uFK2;
        j7 = (i2 & 128) != 0 ? C1682440tso.LIZJ : j7;
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j5 = C1685910tyP.LJIIJ;
        } else {
            j5 = 0;
        }
        c1693510uAf2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : c1693510uAf2;
        i4 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i4;
        if ((65536 & i2) != 0) {
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = 0;
        }
        int i5 = 2097152 & i2;
        this(new C1693450uAZ(j9, j8, c1680190tpB2, c1693240uAE2, (C1695610uE3) null, abstractC1696400uFK2, (String) null, j7, (C1160090gIJ) null, (C1693560uAk) null, (C1694560uCM) null, j5, c1693510uAf2, (C1693340uAO) null, (C1693870uBF) null, (AbstractC1695860uES) null), new C1693480uAc(i4, i3, (131072 & i2) != 0 ? C1682440tso.LIZJ : j6, null, null, null, 0, (i2 & 4194304) != 0 ? Integer.MIN_VALUE : 0, null), null);
    }

    public static C1693430uAX LIZ(int i, int i2, int i3, long j, long j2, long j3, long j4, C1693340uAO c1693340uAO, C1693430uAX c1693430uAX, C1693240uAE c1693240uAE, C1680190tpB c1680190tpB) {
        C1695610uE3 c1695610uE3;
        AbstractC1696400uFK abstractC1696400uFK;
        String str;
        C1160090gIJ c1160090gIJ;
        C1693560uAk c1693560uAk;
        C1694560uCM c1694560uCM;
        long j5;
        C1693510uAf c1693510uAf;
        AbstractC1695860uES abstractC1695860uES;
        C1693390uAT c1693390uAT;
        C1683290tuB c1683290tuB;
        C1695380uDg c1695380uDg;
        int i4;
        int i5;
        C1693790uB7 c1693790uB7;
        InterfaceC1693670uAv interfaceC1693670uAvLIZIZ;
        C1693870uBF c1693870uBF;
        C1693520uAg c1693520uAg;
        int i6 = i2;
        int i7 = i;
        long jLIZLLL = j;
        long j6 = j3;
        long j7 = j4;
        C1680190tpB c1680190tpB2 = c1680190tpB;
        C1693340uAO c1693340uAO2 = c1693340uAO;
        C1693240uAE c1693240uAE2 = c1693240uAE;
        long j8 = j2;
        if ((i3 & 1) != 0) {
            jLIZLLL = c1693430uAX.LIZ.LIZLLL();
        }
        if ((i3 & 2) != 0) {
            j8 = c1693430uAX.LIZ.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            c1680190tpB2 = c1693430uAX.LIZ.LIZJ;
        }
        if ((i3 & 8) != 0) {
            c1693240uAE2 = c1693430uAX.LIZ.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            c1695610uE3 = c1693430uAX.LIZ.LJ;
        } else {
            c1695610uE3 = null;
        }
        if ((i3 & 32) != 0) {
            abstractC1696400uFK = c1693430uAX.LIZ.LJFF;
        } else {
            abstractC1696400uFK = null;
        }
        if ((i3 & 64) != 0) {
            str = c1693430uAX.LIZ.LJI;
        } else {
            str = null;
        }
        if ((i3 & 128) != 0) {
            j6 = c1693430uAX.LIZ.LJII;
        }
        if ((i3 & 256) != 0) {
            c1160090gIJ = c1693430uAX.LIZ.LJIIIIZZ;
        } else {
            c1160090gIJ = null;
        }
        if ((i3 & 512) != 0) {
            c1693560uAk = c1693430uAX.LIZ.LJIIIZ;
        } else {
            c1693560uAk = null;
        }
        if ((i3 & 1024) != 0) {
            c1694560uCM = c1693430uAX.LIZ.LJIIJ;
        } else {
            c1694560uCM = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j5 = c1693430uAX.LIZ.LJIIJJI;
        } else {
            j5 = 0;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1693510uAf = c1693430uAX.LIZ.LJIIL;
        } else {
            c1693510uAf = null;
        }
        if ((i3 & 8192) != 0) {
            c1693340uAO2 = c1693430uAX.LIZ.LJIILIIL;
        }
        if ((i3 & 16384) != 0) {
            abstractC1695860uES = c1693430uAX.LIZ.LJIILL;
        } else {
            abstractC1695860uES = null;
        }
        if ((32768 & i3) != 0) {
            i7 = c1693430uAX.LIZIZ.LIZ;
        }
        if ((65536 & i3) != 0) {
            i6 = c1693430uAX.LIZIZ.LIZIZ;
        }
        if ((131072 & i3) != 0) {
            j7 = c1693430uAX.LIZIZ.LIZJ;
        }
        if ((262144 & i3) != 0) {
            c1693390uAT = c1693430uAX.LIZIZ.LIZLLL;
        } else {
            c1693390uAT = null;
        }
        if ((524288 & i3) != 0) {
            c1683290tuB = c1693430uAX.LIZJ;
        } else {
            c1683290tuB = null;
        }
        if ((1048576 & i3) != 0) {
            c1695380uDg = c1693430uAX.LIZIZ.LJFF;
        } else {
            c1695380uDg = null;
        }
        if ((2097152 & i3) != 0) {
            i4 = c1693430uAX.LIZIZ.LJI;
        } else {
            i4 = 0;
        }
        if ((4194304 & i3) != 0) {
            i5 = c1693430uAX.LIZIZ.LJII;
        } else {
            i5 = 0;
        }
        if ((i3 & 8388608) != 0) {
            c1693790uB7 = c1693430uAX.LIZIZ.LJIIIIZZ;
        } else {
            c1693790uB7 = null;
        }
        c1693430uAX.getClass();
        if (C1685910tyP.LJ(jLIZLLL, c1693430uAX.LIZ.LIZLLL())) {
            interfaceC1693670uAvLIZIZ = c1693430uAX.LIZ.LIZ;
        } else {
            InterfaceC1693670uAv.LIZ.getClass();
            interfaceC1693670uAvLIZIZ = C1693610uAp.LIZIZ(jLIZLLL);
        }
        if (c1683290tuB != null) {
            c1693870uBF = c1683290tuB.LIZ;
        } else {
            c1693870uBF = null;
        }
        C1693450uAZ c1693450uAZ = new C1693450uAZ(interfaceC1693670uAvLIZIZ, j8, c1680190tpB2, c1693240uAE2, c1695610uE3, abstractC1696400uFK, str, j6, c1160090gIJ, c1693560uAk, c1694560uCM, j5, c1693510uAf, c1693340uAO2, c1693870uBF, abstractC1695860uES);
        if (c1683290tuB != null) {
            c1693520uAg = c1683290tuB.LIZIZ;
        } else {
            c1693520uAg = null;
        }
        return new C1693430uAX(c1693450uAZ, new C1693480uAc(i7, i6, j7, c1693390uAT, c1693520uAg, c1695380uDg, i4, i5, c1693790uB7), c1683290tuB);
    }
}
