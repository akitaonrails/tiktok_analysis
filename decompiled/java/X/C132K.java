package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.132K, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132K extends AbstractC19933512yz<C132K> implements InterfaceC199474132y {
    public int LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public AnonymousClass1328 LLJ;
    public C130N<AnonymousClass1328, AnonymousClass1329, C131O> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIFFI;
        c19935812zM.LIZ(C132J.class, C132K.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132J buildPartial() {
        int i;
        C132J c132j = new C132J(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132j.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132j.inputType_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c132j.outputType_ = this.LLIZLLLIL;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C130N<AnonymousClass1328, AnonymousClass1329, C131O> c130n = this.LLJI;
                c132j.options_ = c130n == null ? this.LLJ : (AnonymousClass1328) c130n.LIZIZ();
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c132j.clientStreaming_ = this.LLJIJIL;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c132j.serverStreaming_ = this.LLJILJIL;
                i |= 32;
            }
            c132j.LLILLJJLI |= i;
        }
        LJIILL();
        return c132j;
    }

    public final C130N<AnonymousClass1328, AnonymousClass1329, C131O> LJIJJLI() {
        if (this.LLJI == null) {
            AnonymousClass1328 defaultInstance = this.LLJ;
            if (defaultInstance == null) {
                defaultInstance = AnonymousClass1328.getDefaultInstance();
            }
            this.LLJI = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZIL & 8) != 0) {
            C130N<AnonymousClass1328, AnonymousClass1329, C131O> c130n = this.LLJI;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJ;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = AnonymousClass1328.getDefaultInstance();
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

    public C132K() {
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132J c132jBuildPartial = buildPartial();
        if (c132jBuildPartial.isInitialized()) {
            return c132jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132J.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJI;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132J c132jBuildPartial = buildPartial();
        if (c132jBuildPartial.isInitialized()) {
            return c132jBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132jBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132J.getDefaultInstance();
    }

    public C132K(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132J) {
            LJIL((C132J) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIL(C132J c132j) {
        AnonymousClass1328 anonymousClass1328;
        if (c132j == C132J.getDefaultInstance()) {
            return;
        }
        if (c132j.hasName()) {
            this.LLILZLL = c132j.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132j.hasInputType()) {
            this.LLIZ = c132j.inputType_;
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c132j.hasOutputType()) {
            this.LLIZLLLIL = c132j.outputType_;
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (c132j.hasOptions()) {
            AnonymousClass1328 options = c132j.getOptions();
            C130N<AnonymousClass1328, AnonymousClass1329, C131O> c130n = this.LLJI;
            if (c130n == null) {
                if ((this.LLILZIL & 8) != 0 && (anonymousClass1328 = this.LLJ) != null && anonymousClass1328 != AnonymousClass1328.getDefaultInstance()) {
                    this.LLILZIL |= 8;
                    LJIILLIIL();
                    ((AnonymousClass1329) LJIJJLI().LIZJ()).LJJIIJZLJL(options);
                } else {
                    this.LLJ = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLJ != null) {
                this.LLILZIL |= 8;
                LJIILLIIL();
            }
        }
        if (c132j.hasClientStreaming()) {
            this.LLJIJIL = c132j.getClientStreaming();
            this.LLILZIL |= 16;
            LJIILLIIL();
        }
        if (c132j.hasServerStreaming()) {
            this.LLJILJIL = c132j.getServerStreaming();
            this.LLILZIL |= 32;
            LJIILLIIL();
        }
        LJFF(c132j.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132J) {
            LJIL((C132J) interfaceC19930912yZ);
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

    public final void LJJI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 10) {
                        if (iLJJIJIL != 18) {
                            if (iLJJIJIL != 26) {
                                if (iLJJIJIL != 34) {
                                    if (iLJJIJIL != 40) {
                                        if (iLJJIJIL != 48) {
                                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                break;
                                            }
                                        } else {
                                            this.LLJILJIL = abstractC19927312xz.LJIILIIL();
                                            this.LLILZIL |= 32;
                                        }
                                    } else {
                                        this.LLJIJIL = abstractC19927312xz.LJIILIIL();
                                        this.LLILZIL |= 16;
                                    }
                                } else {
                                    abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                                    this.LLILZIL |= 8;
                                }
                            } else {
                                this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                                this.LLILZIL |= 4;
                            }
                        } else {
                            this.LLIZ = abstractC19927312xz.LJIILJJIL();
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
