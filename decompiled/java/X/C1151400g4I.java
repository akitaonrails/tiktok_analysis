package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151400g4I implements InterfaceC1816020xMG {
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final Diamond LLIZLLLIL;
    public final boolean LLJ;

    @Override // X.InterfaceC1816020xMG
    public final InterfaceC1816020xMG LJIIL() {
        return LIZ(this, false, false, 479);
    }

    @Override // X.InterfaceC1816020xMG
    public final InterfaceC1816020xMG LJIJI() {
        return LIZ(this, true, true, 223);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1151400g4I)) {
            return false;
        }
        C1151400g4I c1151400g4I = (C1151400g4I) obj;
        return Intrinsics.LJFF(this.LL, c1151400g4I.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1151400g4I.LLILLJJLI) && this.LLILLL == c1151400g4I.LLILLL && this.LLILZ == c1151400g4I.LLILZ && this.LLILZIL == c1151400g4I.LLILZIL && this.LLILZLL == c1151400g4I.LLILZLL && this.LLIZ == c1151400g4I.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1151400g4I.LLIZLLLIL) && this.LLJ == c1151400g4I.LLJ;
    }

    public final int hashCode() {
        return (((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeItem(iapId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", price=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", diamondId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", diamondCount=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", givingCount=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", recommended=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", originDiamondData=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isManualSelected=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1816020xMG
    public final boolean isSelected() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1151400g4I) {
            C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c1151400g4I.LLILLJJLI, this.LLILLJJLI) && c1151400g4I.LLILLL == this.LLILLL && c1151400g4I.LLILZ == this.LLILZ && c1151400g4I.LLILZIL == this.LLILZIL && c1151400g4I.LLILZLL == this.LLILZLL && c1151400g4I.LLIZ == this.LLIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1151400g4I) {
            C1151400g4I c1151400g4I = (C1151400g4I) interfaceC1891350zJl;
            if (!Intrinsics.LJFF(c1151400g4I.LL, this.LL)) {
                Diamond diamond = this.LLIZLLLIL;
                int i = diamond.count;
                Diamond diamond2 = c1151400g4I.LLIZLLLIL;
                if (i == diamond2.count && Intrinsics.LJFF(diamond.LJI, diamond2.LJI)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1151400g4I) {
            boolean z = ((C1151400g4I) interfaceC1891350zJl).LLILZLL;
            if (z != this.LLILZLL) {
                return new C1151420g4K(z);
            }
            if (!Intrinsics.LJFF(((C1151400g4I) interfaceC1891350zJl).LLILLJJLI, this.LLILLJJLI)) {
                return new Object() { // from class: X.005x
                    public final boolean LIZ = true;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0235005x) && this.LIZ == ((C0235005x) obj).LIZ;
                    }

                    public final int hashCode() {
                        return C786410Ut5.Z2(this.LIZ);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("PriceChangeDiff(isPriceChange=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }
                };
            }
            return null;
        }
        return null;
    }

    public static C1151400g4I LIZ(C1151400g4I c1151400g4I, boolean z, boolean z2, int i) {
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        Diamond diamond = null;
        if ((i & 1) != 0) {
            str = c1151400g4I.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c1151400g4I.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            i2 = c1151400g4I.LLILLL;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            i3 = c1151400g4I.LLILZ;
        } else {
            i3 = 0;
        }
        if ((i & 16) != 0) {
            i4 = c1151400g4I.LLILZIL;
        } else {
            i4 = 0;
        }
        if ((i & 32) != 0) {
            z5 = c1151400g4I.LLILZLL;
        }
        if ((i & 64) != 0) {
            z3 = c1151400g4I.LLIZ;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            diamond = c1151400g4I.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            z4 = c1151400g4I.LLJ;
        }
        c1151400g4I.getClass();
        return new C1151400g4I(str, str2, i2, i3, i4, z5, z3, diamond, z4);
    }

    public C1151400g4I(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, Diamond diamond, boolean z3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = diamond;
        this.LLJ = z3;
    }
}
