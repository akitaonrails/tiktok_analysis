package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.131I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131I extends AbstractC19933512yz<C131I> implements C131H {
    public int LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public C131X LLIZLLLIL;
    public C130N<C131X, C131W, C131L> LLJ;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIJJLI;
        c19935812zM.LIZ(C131J.class, C131I.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C131J buildPartial() {
        int i;
        C131J c131j = new C131J(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131j.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c131j.number_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C130N<C131X, C131W, C131L> c130n = this.LLJ;
                c131j.options_ = c130n == null ? this.LLIZLLLIL : (C131X) c130n.LIZIZ();
                i |= 4;
            }
            c131j.LLILLJJLI |= i;
        }
        LJIILL();
        return c131j;
    }

    public final C130N<C131X, C131W, C131L> LJIJJLI() {
        if (this.LLJ == null) {
            C131X defaultInstance = this.LLIZLLLIL;
            if (defaultInstance == null) {
                defaultInstance = C131X.getDefaultInstance();
            }
            this.LLJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLIZLLLIL = null;
        }
        return this.LLJ;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZIL & 4) != 0) {
            C130N<C131X, C131W, C131L> c130n = this.LLJ;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLIZLLLIL;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C131X.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL = c130n.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public C131I() {
        this.LLILZLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131J c131jBuildPartial = buildPartial();
        if (c131jBuildPartial.isInitialized()) {
            return c131jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131J.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIJJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131J c131jBuildPartial = buildPartial();
        if (c131jBuildPartial.isInitialized()) {
            return c131jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131J.getDefaultInstance();
    }

    public C131I(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131J) {
            LJJI((C131J) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJI(C131J c131j) {
        C131X c131x;
        if (c131j == C131J.getDefaultInstance()) {
            return;
        }
        if (c131j.hasName()) {
            this.LLILZLL = c131j.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c131j.hasNumber()) {
            this.LLIZ = c131j.getNumber();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c131j.hasOptions()) {
            C131X options = c131j.getOptions();
            C130N<C131X, C131W, C131L> c130n = this.LLJ;
            if (c130n == null) {
                if ((this.LLILZIL & 4) != 0 && (c131x = this.LLIZLLLIL) != null && c131x != C131X.getDefaultInstance()) {
                    this.LLILZIL |= 4;
                    LJIILLIIL();
                    ((C131W) LJIJJLI().LIZJ()).LJJIIZI(options);
                } else {
                    this.LLIZLLLIL = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLIZLLLIL != null) {
                this.LLILZIL |= 4;
                LJIILLIIL();
            }
        }
        LJFF(c131j.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131J) {
            LJJI((C131J) interfaceC19930912yZ);
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

    public final C131I LJIL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                    if (iLJJIJIL != 10) {
                        if (iLJJIJIL != 16) {
                            if (iLJJIJIL != 26) {
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                                this.LLILZIL |= 4;
                            }
                        } else {
                            this.LLIZ = abstractC19927312xz.LJIJJLI();
                            this.LLILZIL |= 2;
                        }
                    } else {
                        this.LLILZLL = abstractC19927312xz.LJIILJJIL();
                        this.LLILZIL |= 1;
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
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
