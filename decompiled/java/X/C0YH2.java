package X;

/* JADX INFO: renamed from: X.0YH2, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YH2 implements C0YH7 {
    public final C0YEC LIZ;
    public final C0YHD LIZIZ = new C0YHD(this);
    public final C871550YGz LIZJ = new C0YH0() { // from class: X.0YGz
        {
            super(this.LIZIZ);
        }

        @Override // X.C0YH0
        public final Object LIZ(C0YCX c0ycx, AbstractC23140094w abstractC23140094w) throws C0Y8K {
            C0YED c0yedLIZIZ = this.LIZIZ.LIZ.LJFF.LIZIZ("PluginContext.fetchRemote");
            if (c0yedLIZIZ != null) {
                return c0yedLIZIZ.LJIJI().LJIILLIIL().LLLIILIL(c0ycx, false, abstractC23140094w);
            }
            throw new C0Y8K(-1, "No active session", null);
        }
    };
    public final C0YHG LIZLLL = new C0YHG(this);
    public final C0YH1 LJ = new C0YH1(this);

    @Override // X.C0YH7
    public final C0YDA LIZJ() {
        return this.LIZ.LJIIJJI;
    }

    @Override // X.C0YH7
    public final C868780Y6i LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.C0YH7
    public final InterfaceC870750YDx LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.C0YH7
    public final boolean isLogin() {
        return this.LIZ.isLogin();
    }

    @Override // X.C0YH7
    public final C0YH0 LIZ() {
        return this.LIZJ;
    }

    @Override // X.C0YH7
    public final C0YHG LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0YH7
    public final C0YEM LJFF() {
        return this.LIZ;
    }

    @Override // X.C0YH7
    public final C0YH1 LLJLL() {
        return this.LJ;
    }

    @Override // X.C0YH7
    public final C0YHD getConfig() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YGz] */
    public C0YH2(C0YEC c0yec) {
        this.LIZ = c0yec;
    }
}
