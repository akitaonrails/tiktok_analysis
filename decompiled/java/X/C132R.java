package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.132R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132R extends AbstractC19933512yz<C132R> implements InterfaceC199472132w {
    public int LLILZIL;
    public int LLILZLL;
    public C199437131n LLIZ;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLIZLLLIL;
    public C199437131n LLJ;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJI;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJL;
        c19935812zM.LIZ(C132Q.class, C132R.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132Q buildPartial() {
        int i;
        C132Q c132q = new C132Q(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132q.edition_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
                c132q.overridableFeatures_ = c130n == null ? this.LLIZ : (C199437131n) c130n.LIZIZ();
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n2 = this.LLJI;
                c132q.fixedFeatures_ = c130n2 == null ? this.LLJ : (C199437131n) c130n2.LIZIZ();
                i |= 4;
            }
            c132q.LLILLJJLI |= i;
        }
        LJIILL();
        return c132q;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJIJJLI() {
        if (this.LLJI == null) {
            C199437131n defaultInstance = this.LLJ;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJI = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJIL() {
        if (this.LLIZLLLIL == null) {
            C199437131n defaultInstance = this.LLIZ;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLIZLLLIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        InterfaceC19916512wF interfaceC19916512wFLIZLLL2;
        if ((this.LLILZIL & 2) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL2 = this.LLIZ;
                if (interfaceC19916512wFLIZLLL2 == null) {
                    interfaceC19916512wFLIZLLL2 = C199437131n.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL2 = c130n.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL2.isInitialized()) {
                return false;
            }
        }
        if ((this.LLILZIL & 4) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n2 = this.LLJI;
            if (c130n2 == null) {
                interfaceC19916512wFLIZLLL = this.LLJ;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C199437131n.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL = c130n2.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public C132R() {
        if (k0.alwaysUseFieldBuilders) {
            LJIL();
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132Q c132qBuildPartial = buildPartial();
        if (c132qBuildPartial.isInitialized()) {
            return c132qBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132qBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132Q.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132Q c132qBuildPartial = buildPartial();
        if (c132qBuildPartial.isInitialized()) {
            return c132qBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132qBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132Q.getDefaultInstance();
    }

    public C132R(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        if (k0.alwaysUseFieldBuilders) {
            LJIL();
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132Q) {
            LJJIFFI((C132Q) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIFFI(C132Q c132q) {
        C199437131n c199437131n;
        C199437131n c199437131n2;
        if (c132q == C132Q.getDefaultInstance()) {
            return;
        }
        if (c132q.hasEdition()) {
            C130B edition = c132q.getEdition();
            edition.getClass();
            this.LLILZIL |= 1;
            this.LLILZLL = edition.getNumber();
            LJIILLIIL();
        }
        if (c132q.hasOverridableFeatures()) {
            C199437131n overridableFeatures = c132q.getOverridableFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                if ((this.LLILZIL & 2) != 0 && (c199437131n2 = this.LLIZ) != null && c199437131n2 != C199437131n.getDefaultInstance()) {
                    this.LLILZIL |= 2;
                    LJIILLIIL();
                    ((C199436131m) LJIL().LIZJ()).LJJIIJ(overridableFeatures);
                } else {
                    this.LLIZ = overridableFeatures;
                }
            } else {
                c130n.LJ(overridableFeatures);
            }
            if (this.LLIZ != null) {
                this.LLILZIL |= 2;
                LJIILLIIL();
            }
        }
        if (c132q.hasFixedFeatures()) {
            C199437131n fixedFeatures = c132q.getFixedFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n2 = this.LLJI;
            if (c130n2 == null) {
                if ((this.LLILZIL & 4) != 0 && (c199437131n = this.LLJ) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZIL |= 4;
                    LJIILLIIL();
                    ((C199436131m) LJIJJLI().LIZJ()).LJJIIJ(fixedFeatures);
                } else {
                    this.LLJ = fixedFeatures;
                }
            } else {
                c130n2.LJ(fixedFeatures);
            }
            if (this.LLJ != null) {
                this.LLILZIL |= 4;
                LJIILLIIL();
            }
        }
        LJFF(c132q.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132Q) {
            LJJIFFI((C132Q) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final C132R LJJI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        if (c19926312xp == null) {
            throw null;
        }
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 24) {
                        if (iLJJIJIL != 34) {
                            if (iLJJIJIL != 42) {
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                                this.LLILZIL |= 4;
                            }
                        } else {
                            abstractC19927312xz.LJJI(LJIL().LIZJ(), c19926312xp);
                            this.LLILZIL |= 2;
                        }
                    } else {
                        int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                        if (C130B.forNumber(iLJIILLIIL) == null) {
                            LJIILJJIL(3, iLJIILLIIL);
                        } else {
                            this.LLILZLL = iLJIILLIIL;
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
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }
}
