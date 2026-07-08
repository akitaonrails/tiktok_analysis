package X;

/* JADX INFO: renamed from: X.16DE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16DE extends C16D8 {
    @Override // X.C16D8
    public void LJI() throws C16DK {
        if (!this.LIZ) {
            throw new C16DK("Control frame can't have fin==false set");
        }
        if (this.LJ) {
            throw new C16DK("Control frame can't have rsv1==true set");
        }
        if (this.LJFF) {
            throw new C16DK("Control frame can't have rsv2==true set");
        }
        if (this.LJI) {
            throw new C16DK("Control frame can't have rsv3==true set");
        }
    }

    public C16DE(C16DB c16db) {
        super(c16db);
    }
}
