package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855260yNY implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C1855180yNQ LLILLL;
    public final C291001Au<Exception> LLILZ;
    public final Long LLILZIL;
    public final EnumC1855280yNa LLILZLL;
    public final C291001Au<Float> LLIZ;

    public C1855260yNY() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1855260yNY)) {
            return false;
        }
        C1855260yNY c1855260yNY = (C1855260yNY) obj;
        return this.LL == c1855260yNY.LL && this.LLILLJJLI == c1855260yNY.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1855260yNY.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1855260yNY.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1855260yNY.LLILZIL) && this.LLILZLL == c1855260yNY.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1855260yNY.LLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Exception> c291001Au = this.LLILZ;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        Long l = this.LLILZIL;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + this.LLILZLL.hashCode()) * 31;
        C291001Au<Float> c291001Au2 = this.LLIZ;
        return iHashCode2 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSpeechState(displaySpeechPanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isTalking=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", speechContent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", speechError=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", recordTimestamp=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", volumeStatus=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", wavePoint=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1855260yNY(int i) {
        this(false, false, C1855180yNQ.LIZLLL, null, null, EnumC1855280yNa.LOW_VOLUME, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1855260yNY(boolean z, boolean z2, C1855180yNQ c1855180yNQ, C291001Au<? extends Exception> c291001Au, Long l, EnumC1855280yNa enumC1855280yNa, C291001Au<Float> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c1855180yNQ;
        this.LLILZ = c291001Au;
        this.LLILZIL = l;
        this.LLILZLL = enumC1855280yNa;
        this.LLIZ = c291001Au2;
    }

    public static C1855260yNY LIZ(C1855260yNY c1855260yNY, boolean z, boolean z2, C1855180yNQ c1855180yNQ, C291001Au c291001Au, Long l, EnumC1855280yNa enumC1855280yNa, C291001Au c291001Au2, int i) {
        C291001Au c291001Au3 = c291001Au2;
        EnumC1855280yNa enumC1855280yNa2 = enumC1855280yNa;
        Long l2 = l;
        C291001Au c291001Au4 = c291001Au;
        C1855180yNQ c1855180yNQ2 = c1855180yNQ;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c1855260yNY.LL;
        }
        if ((i & 2) != 0) {
            z3 = c1855260yNY.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1855180yNQ2 = c1855260yNY.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1855260yNY.LLILZ;
        }
        if ((i & 16) != 0) {
            l2 = c1855260yNY.LLILZIL;
        }
        if ((i & 32) != 0) {
            enumC1855280yNa2 = c1855260yNY.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au3 = c1855260yNY.LLIZ;
        }
        c1855260yNY.getClass();
        return new C1855260yNY(z4, z3, c1855180yNQ2, c291001Au4, l2, enumC1855280yNa2, c291001Au3);
    }
}
