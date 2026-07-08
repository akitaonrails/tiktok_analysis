package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ttr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683090ttr implements InterfaceC0148002o {
    public final C20185513yX LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Pair<Integer, Function1<C1397660mTU, Unit>> LLJ;
    public final int LLJI;

    public C1683090ttr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1683090ttr)) {
            return false;
        }
        C1683090ttr c1683090ttr = (C1683090ttr) obj;
        return Intrinsics.LJFF(this.LL, c1683090ttr.LL) && this.LLILLJJLI == c1683090ttr.LLILLJJLI && this.LLILLL == c1683090ttr.LLILLL && this.LLILZ == c1683090ttr.LLILZ && this.LLILZIL == c1683090ttr.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1683090ttr.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1683090ttr.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1683090ttr.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1683090ttr.LLJ) && this.LLJI == c1683090ttr.LLJI;
    }

    public final int hashCode() {
        C20185513yX c20185513yX = this.LL;
        int iHashCode = (((((((((c20185513yX == null ? 0 : c20185513yX.hashCode()) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Pair<Integer, Function1<C1397660mTU, Unit>> pair = this.LLJ;
        return ((iHashCode4 + (pair != null ? pair.hashCode() : 0)) * 31) + this.LLJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DiskManagerSettingsState(deviceInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", appStoragePercentWidth=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", appStoragePercentVisible=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", otherStoragePercentWidth=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", otherStoragePercentVisible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", cleanCacheSize=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", downloadCacheSize=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", draftCacheSize=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", dialogData=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1683090ttr(int i) {
        this(null, 0, true, 0, true, null, null, null, null, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1683090ttr(C20185513yX c20185513yX, int i, boolean z, int i2, boolean z2, String str, String str2, String str3, Pair<Integer, ? extends Function1<? super C1397660mTU, Unit>> pair, int i3) {
        this.LL = c20185513yX;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = i2;
        this.LLILZIL = z2;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = pair;
        this.LLJI = i3;
    }

    public static C1683090ttr LIZ(C1683090ttr c1683090ttr, C20185513yX c20185513yX, int i, boolean z, int i2, boolean z2, String str, String str2, String str3, Pair pair, int i3, int i4) {
        int i5 = i3;
        Pair pair2 = pair;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        boolean z3 = z2;
        int i6 = i2;
        boolean z4 = z;
        int i7 = i;
        C20185513yX c20185513yX2 = c20185513yX;
        if ((i4 & 1) != 0) {
            c20185513yX2 = c1683090ttr.LL;
        }
        if ((i4 & 2) != 0) {
            i7 = c1683090ttr.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            z4 = c1683090ttr.LLILLL;
        }
        if ((i4 & 8) != 0) {
            i6 = c1683090ttr.LLILZ;
        }
        if ((i4 & 16) != 0) {
            z3 = c1683090ttr.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            str6 = c1683090ttr.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            str5 = c1683090ttr.LLIZ;
        }
        if ((i4 & 128) != 0) {
            str4 = c1683090ttr.LLIZLLLIL;
        }
        if ((i4 & 256) != 0) {
            pair2 = c1683090ttr.LLJ;
        }
        if ((i4 & 512) != 0) {
            i5 = c1683090ttr.LLJI;
        }
        c1683090ttr.getClass();
        return new C1683090ttr(c20185513yX2, i7, z4, i6, z3, str6, str5, str4, pair2, i5);
    }
}
