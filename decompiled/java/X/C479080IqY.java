package X;

/* JADX INFO: renamed from: X.0IqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C479080IqY implements InterfaceC0148002o {
    public final boolean LL;

    public C479080IqY() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C479080IqY) && this.LL == ((C479080IqY) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HangoutNewUserGuideState(interactPositioned=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C479080IqY(boolean z) {
        this.LL = z;
    }
}
