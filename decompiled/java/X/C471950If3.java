package X;

/* JADX INFO: renamed from: X.0If3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471950If3 extends AbstractC472000If8 {
    public final EnumC471970If5 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C471950If3) && this.LIZIZ == ((C471950If3) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchNoMoreData(subType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C471950If3(EnumC471970If5 enumC471970If5) {
        super("");
        this.LIZIZ = enumC471970If5;
    }
}
