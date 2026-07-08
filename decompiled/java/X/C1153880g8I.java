package X;

/* JADX INFO: renamed from: X.0g8I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153880g8I implements InterfaceC111300bX {
    public final boolean LL;

    public C1153880g8I() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1153880g8I) && this.LL == ((C1153880g8I) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomSelectedAssemConfig(isPreviewScene=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153880g8I(boolean z) {
        this.LL = z;
    }
}
