package X;

/* JADX INFO: renamed from: X.06Qb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1604706Qb implements InterfaceC0148002o {
    public final boolean LL;

    public C1604706Qb() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1604706Qb) && this.LL == ((C1604706Qb) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiReplySingleChatRoomState(hideActionBar=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1604706Qb(boolean z) {
        this.LL = z;
    }
}
