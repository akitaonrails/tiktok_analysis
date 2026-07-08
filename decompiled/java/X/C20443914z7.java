package X;

/* JADX INFO: renamed from: X.14z7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20443914z7 implements C15MM<AbstractC20434814xe, AbstractC20027413Xs> {
    public final /* synthetic */ InterfaceC20236714Gf<AbstractC20434814xe> LIZ;

    public C20443914z7(C2252611DEt c2252611DEt) {
        this.LIZ = c2252611DEt;
    }

    @Override // X.C15MM
    public final void LIZ(AbstractC20027413Xs abstractC20027413Xs) {
        AbstractC20027413Xs abstractC20027413Xs2 = abstractC20027413Xs;
        if (this.LIZ.isActive()) {
            InterfaceC20236714Gf<AbstractC20434814xe> interfaceC20236714Gf = this.LIZ;
            C098200Yq c098200Yq = new C098200Yq(abstractC20027413Xs2);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
        }
    }

    @Override // X.C15MM
    public final void onResult(AbstractC20434814xe abstractC20434814xe) {
        if (this.LIZ.isActive()) {
            InterfaceC20236714Gf<AbstractC20434814xe> interfaceC20236714Gf = this.LIZ;
            C189200o6.m2constructorimpl(abstractC20434814xe);
            interfaceC20236714Gf.resumeWith(abstractC20434814xe);
        }
    }
}
