package X;

/* JADX INFO: renamed from: X.16DD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16DD extends C16DV {
    public C16DD() {
        super(C16DB.TEXT);
    }

    @Override // X.C16DV, X.C16D8
    public final void LJI() throws C16DI {
        if (!C1336120ksE.LIZ(this.LIZJ)) {
            throw new C16DI(1007, "Received text is no valid utf8 string!");
        }
    }
}
