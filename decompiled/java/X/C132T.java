package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.132T, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132T extends AbstractC19933512yz<C132T> implements InterfaceC199475132z {
    public int LLILZIL;
    public Object LLILZLL;
    public C132C LLIZ;
    public C130N<C132C, C132B, InterfaceC199470132u> LLIZLLLIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIILL;
        c19935812zM.LIZ(C132P.class, C132T.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132P buildPartial() {
        int i;
        C132P c132p = new C132P(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132p.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C130N<C132C, C132B, InterfaceC199470132u> c130n = this.LLIZLLLIL;
                c132p.options_ = c130n == null ? this.LLIZ : (C132C) c130n.LIZIZ();
                i |= 2;
            }
            c132p.LLILLJJLI |= i;
        }
        LJIILL();
        return c132p;
    }

    public final C130N<C132C, C132B, InterfaceC199470132u> LJIJJLI() {
        if (this.LLIZLLLIL == null) {
            C132C defaultInstance = this.LLIZ;
            if (defaultInstance == null) {
                defaultInstance = C132C.getDefaultInstance();
            }
            this.LLIZLLLIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZIL & 2) != 0) {
            C130N<C132C, C132B, InterfaceC199470132u> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLIZ;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C132C.getDefaultInstance();
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

    public C132T() {
        this.LLILZLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132P c132pBuildPartial = buildPartial();
        if (c132pBuildPartial.isInitialized()) {
            return c132pBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132pBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132P.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIILJJIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132P c132pBuildPartial = buildPartial();
        if (c132pBuildPartial.isInitialized()) {
            return c132pBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132pBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132P.getDefaultInstance();
    }

    public C132T(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132P) {
            LJIL((C132P) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIL(C132P c132p) {
        C132C c132c;
        if (c132p == C132P.getDefaultInstance()) {
            return;
        }
        if (c132p.hasName()) {
            this.LLILZLL = c132p.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132p.hasOptions()) {
            C132C options = c132p.getOptions();
            C130N<C132C, C132B, InterfaceC199470132u> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                if ((this.LLILZIL & 2) != 0 && (c132c = this.LLIZ) != null && c132c != C132C.getDefaultInstance()) {
                    this.LLILZIL |= 2;
                    LJIILLIIL();
                    ((C132B) LJIJJLI().LIZJ()).LJJIIJZLJL(options);
                } else {
                    this.LLIZ = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLIZ != null) {
                this.LLILZIL |= 2;
                LJIILLIIL();
            }
        }
        LJFF(c132p.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132P) {
            LJIL((C132P) interfaceC19930912yZ);
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
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                break;
                            }
                        } else {
                            abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
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
