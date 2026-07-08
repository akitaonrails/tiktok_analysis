package X;

/* JADX INFO: renamed from: X.0RtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710270RtZ extends C0S5P {
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C710270RtZ) && this.LIZIZ == ((C710270RtZ) obj).LIZIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZIZ);
    }

    @Override // X.C0S5P
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Translating(autoTranslate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C710270RtZ(boolean z) {
        super(C0SKK.TRANSLATING);
        this.LIZIZ = z;
    }
}
