package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.131k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199434131k extends AbstractC19933512yz<C199434131k> implements InterfaceC199432131i {
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIJIL;
        c19935812zM.LIZ(C199433131j.class, C199434131k.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C199433131j buildPartial() {
        int i;
        C199433131j c199433131j = new C199433131j(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199433131j.editionIntroduced_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c199433131j.editionDeprecated_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c199433131j.deprecationWarning_ = this.LLIZLLLIL;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c199433131j.editionRemoved_ = this.LLJ;
                i |= 8;
            }
            c199433131j.LLILLJJLI |= i;
        }
        LJIILL();
        return c199433131j;
    }

    public C199434131k() {
        this.LLIZLLLIL = "";
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199433131j c199433131jBuildPartial = buildPartial();
        if (c199433131jBuildPartial.isInitialized()) {
            return c199433131jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199433131jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199433131j.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIJIIJIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199433131j c199433131jBuildPartial = buildPartial();
        if (c199433131jBuildPartial.isInitialized()) {
            return c199433131jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199433131jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199433131j.getDefaultInstance();
    }

    public C199434131k(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZLLLIL = "";
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199433131j) {
            LJIJJLI((C199433131j) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C199433131j c199433131j) {
        if (c199433131j == C199433131j.getDefaultInstance()) {
            return;
        }
        if (c199433131j.hasEditionIntroduced()) {
            C130B editionIntroduced = c199433131j.getEditionIntroduced();
            editionIntroduced.getClass();
            this.LLILZIL |= 1;
            this.LLILZLL = editionIntroduced.getNumber();
            LJIILLIIL();
        }
        if (c199433131j.hasEditionDeprecated()) {
            C130B editionDeprecated = c199433131j.getEditionDeprecated();
            editionDeprecated.getClass();
            this.LLILZIL |= 2;
            this.LLIZ = editionDeprecated.getNumber();
            LJIILLIIL();
        }
        if (c199433131j.hasDeprecationWarning()) {
            this.LLIZLLLIL = c199433131j.deprecationWarning_;
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (c199433131j.hasEditionRemoved()) {
            C130B editionRemoved = c199433131j.getEditionRemoved();
            editionRemoved.getClass();
            this.LLILZIL |= 8;
            this.LLJ = editionRemoved.getNumber();
            LJIILLIIL();
        }
        LJFF(c199433131j.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199433131j) {
            LJIJJLI((C199433131j) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJIL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 8) {
                        if (iLJJIJIL != 16) {
                            if (iLJJIJIL != 26) {
                                if (iLJJIJIL != 32) {
                                    if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                        break;
                                    }
                                } else {
                                    int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                                    if (C130B.forNumber(iLJIILLIIL) == null) {
                                        LJIILJJIL(4, iLJIILLIIL);
                                    } else {
                                        this.LLJ = iLJIILLIIL;
                                        this.LLILZIL |= 8;
                                    }
                                }
                            } else {
                                this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                                this.LLILZIL |= 4;
                            }
                        } else {
                            int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                            if (C130B.forNumber(iLJIILLIIL2) == null) {
                                LJIILJJIL(2, iLJIILLIIL2);
                            } else {
                                this.LLIZ = iLJIILLIIL2;
                                this.LLILZIL |= 2;
                            }
                        }
                    } else {
                        int iLJIILLIIL3 = abstractC19927312xz.LJIILLIIL();
                        if (C130B.forNumber(iLJIILLIIL3) == null) {
                            LJIILJJIL(1, iLJIILLIIL3);
                        } else {
                            this.LLILZLL = iLJIILLIIL3;
                            this.LLILZIL |= 1;
                        }
                    }
                } catch (C19926612xs e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIILLIIL();
                throw th;
            }
        }
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
