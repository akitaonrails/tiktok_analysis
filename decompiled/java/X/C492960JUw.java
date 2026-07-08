package X;

/* JADX INFO: renamed from: X.0JUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492960JUw extends AbstractC492880JUo {
    public final int LL;

    public C492960JUw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C492960JUw) && this.LL == ((C492960JUw) obj).LL;
    }

    public final int hashCode() {
        return this.LL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestEmoteHintData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC492880JUo
    public final int getType() {
        return this.LL;
    }

    public C492960JUw(int i) {
        this.LL = 4;
    }
}
