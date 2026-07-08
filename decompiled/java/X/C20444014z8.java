package X;

/* JADX INFO: renamed from: X.14z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20444014z8 implements C15MM<C20433914xV, AbstractC20027713Xv> {
    public final /* synthetic */ InterfaceC20236714Gf<C20433914xV> LIZ;

    public C20444014z8(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    @Override // X.C15MM
    public final void LIZ(AbstractC20027713Xv abstractC20027713Xv) {
        AbstractC20027713Xv abstractC20027713Xv2 = abstractC20027713Xv;
        if (this.LIZ.isActive()) {
            InterfaceC20236714Gf<C20433914xV> interfaceC20236714Gf = this.LIZ;
            C098200Yq c098200Yq = new C098200Yq(abstractC20027713Xv2);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
    }

    @Override // X.C15MM
    public final void onResult(C20433914xV c20433914xV) {
        if (this.LIZ.isActive()) {
            InterfaceC20236714Gf<C20433914xV> interfaceC20236714Gf = this.LIZ;
            C189200o6.m2constructorimpl(c20433914xV);
            interfaceC20236714Gf.resumeWith(c20433914xV);
        }
    }
}
