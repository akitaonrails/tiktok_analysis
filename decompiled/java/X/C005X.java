package X;

/* JADX INFO: renamed from: X.005X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C005X implements InterfaceC0148002o {
    public final boolean LL;

    public C005X() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C005X) && this.LL == ((C005X) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinVoiceRecordState(isVoicePanelActive=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C005X(boolean z) {
        this.LL = z;
    }
}
