package X;

/* JADX INFO: renamed from: X.05VV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05VV extends C0M8P {
    public final C0LJE LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05VV) && this.LIZIZ == ((C05VV) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectBucketIndexClicked(type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C05VV(C0LJE c0lje) {
        super(false);
        this.LIZIZ = c0lje;
    }
}
