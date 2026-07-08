package X;

/* JADX INFO: renamed from: X.06P6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06P6 implements InterfaceC904740ZeS {
    public final boolean LIZ;
    public final String LIZIZ;

    public C06P6() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C06P6) && this.LIZ == ((C06P6) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoDataMsgEvent(isScrollToBottom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC904740ZeS
    public final String getName() {
        return this.LIZIZ;
    }

    public C06P6(boolean z) {
        this.LIZ = z;
        this.LIZIZ = "NoDataMsgEvent";
    }
}
