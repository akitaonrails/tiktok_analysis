package X;

/* JADX INFO: renamed from: X.0yrz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874130yrz extends C1874120yry {
    public final EnumC1874080yru LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1874130yrz) && this.LLILLJJLI == ((C1874130yrz) obj).LLILLJJLI;
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopNoticeUIType1Item(item=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1874130yrz(EnumC1874080yru enumC1874080yru) {
        super(enumC1874080yru);
        this.LLILLJJLI = enumC1874080yru;
    }
}
