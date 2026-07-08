package X;

/* JADX INFO: renamed from: X.0Hxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457970Hxb implements InterfaceC0148002o {
    public final C0IBF LL;

    public C457970Hxb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C457970Hxb) && this.LL == ((C457970Hxb) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatRoomCameraState(displayStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C457970Hxb(int i) {
        this(C0IBF.FEATURE_STATUS_UNKNOWN);
    }

    public C457970Hxb(C0IBF c0ibf) {
        this.LL = c0ibf;
    }
}
