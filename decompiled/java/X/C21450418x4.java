package X;

/* JADX INFO: renamed from: X.18x4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21450418x4 extends AbstractC21450518x5 {
    public final StringBuilder LIZIZ;

    public C21450418x4() {
        super(EnumC21448718wn.Comment);
        this.LIZIZ = new StringBuilder();
    }

    @Override // X.AbstractC21450518x5
    public final AbstractC21450518x5 LIZ() {
        AbstractC21450518x5.LIZIZ(this.LIZIZ);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<!--");
        sbLIZ.append(this.LIZIZ.toString());
        sbLIZ.append("-->");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
