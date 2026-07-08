package X;

/* JADX INFO: renamed from: X.0Zxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916740Zxo implements InterfaceC0148002o {
    public int LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;

    public C916740Zxo() {
        this(0, 0, false, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C916740Zxo)) {
            return false;
        }
        C916740Zxo c916740Zxo = (C916740Zxo) obj;
        return this.LL == c916740Zxo.LL && this.LLILLJJLI == c916740Zxo.LLILLJJLI && this.LLILLL == c916740Zxo.LLILLL && this.LLILZ == c916740Zxo.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorShareRevenue(shareRevenueSwitch=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shareRevenueRatio=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enableSettingRatio=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", settingVersion=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C916740Zxo(int i, int i2, boolean z, long j) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
        this.LLILZ = j;
    }
}
