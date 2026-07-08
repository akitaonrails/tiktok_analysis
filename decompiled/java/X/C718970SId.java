package X;

/* JADX INFO: renamed from: X.0SId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718970SId {
    public final EnumC704080Rja LIZ;
    public final C0SIB LIZIZ;

    public C718970SId() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("state: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", level: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C718970SId(int i) {
        this(EnumC704080Rja.UNKNOWN, C0SIB.ONLINE);
    }

    public C718970SId(EnumC704080Rja enumC704080Rja, C0SIB c0sib) {
        this.LIZ = enumC704080Rja;
        this.LIZIZ = c0sib;
    }
}
