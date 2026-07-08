package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131W extends AbstractC19933312yx<C131X, C131W> implements C131L {
    public int LLILZLL;
    public boolean LLIZ;
    public C199437131n LLIZLLLIL;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJ;
    public boolean LLJI;
    public C199433131j LLJIJIL;
    public C130N<C199433131j, C199434131k, InterfaceC199432131i> LLJILJIL;
    public List<C132O> LLJILJILJ;
    public C130M<C132O, C132N, AnonymousClass1331> LLJILLL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJI;
        c19935812zM.LIZ(C131X.class, C131W.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C131X buildPartial() {
        int i;
        C131X c131x = new C131X(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILLL;
        if (c130m == null) {
            if ((this.LLILZLL & 16) != 0) {
                this.LLJILJILJ = Collections.unmodifiableList(this.LLJILJILJ);
                this.LLILZLL &= -17;
            }
            c131x.uninterpretedOption_ = this.LLJILJILJ;
        } else {
            c131x.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131x.deprecated_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJ;
                c131x.features_ = c130n == null ? this.LLIZLLLIL : (C199437131n) c130n.LIZIZ();
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c131x.debugRedact_ = this.LLJI;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C130N<C199433131j, C199434131k, InterfaceC199432131i> c130n2 = this.LLJILJIL;
                c131x.featureSupport_ = c130n2 == null ? this.LLJIJIL : (C199433131j) c130n2.LIZIZ();
                i |= 8;
            }
            c131x.LLILLJJLI |= i;
        }
        LJIILL();
        return c131x;
    }

    public final C130N<C199433131j, C199434131k, InterfaceC199432131i> LJJIII() {
        if (this.LLJILJIL == null) {
            C199433131j defaultInstance = this.LLJIJIL;
            if (defaultInstance == null) {
                defaultInstance = C199433131j.getDefaultInstance();
            }
            this.LLJILJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJIJIL = null;
        }
        return this.LLJILJIL;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIIJ() {
        if (this.LLJ == null) {
            C199437131n defaultInstance = this.LLIZLLLIL;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLIZLLLIL = null;
        }
        return this.LLJ;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJZLJL() {
        if (this.LLJILLL == null) {
            this.LLJILLL = new C130M<>(this.LLJILJILJ, LJIIJJI(), this.LLILLL);
            this.LLJILJILJ = null;
        }
        return this.LLJILLL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 2) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJ;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLIZLLLIL;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C199437131n.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL = c130n.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                return false;
            }
        }
        int i = 0;
        while (true) {
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILLL;
            if (i >= (c130m == null ? this.LLJILJILJ.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJILLL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILJILJ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C131W() {
        this.LLJILJILJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJ();
            LJJIII();
            LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131X c131xBuildPartial = buildPartial();
        if (c131xBuildPartial.isInitialized()) {
            return c131xBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131xBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131X.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131X c131xBuildPartial = buildPartial();
        if (c131xBuildPartial.isInitialized()) {
            return c131xBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131xBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131X.getDefaultInstance();
    }

    public C131W(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJILJILJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJ();
            LJJIII();
            LJJIIJZLJL();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131X) {
            LJJIIZI((C131X) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIZI(C131X c131x) {
        C199433131j c199433131j;
        C199437131n c199437131n;
        if (c131x == C131X.getDefaultInstance()) {
            return;
        }
        if (c131x.hasDeprecated()) {
            this.LLIZ = c131x.getDeprecated();
            this.LLILZLL |= 1;
            LJIILLIIL();
        }
        if (c131x.hasFeatures()) {
            C199437131n features = c131x.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJ;
            if (c130n == null) {
                if ((this.LLILZLL & 2) != 0 && (c199437131n = this.LLIZLLLIL) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 2;
                    LJIILLIIL();
                    ((C199436131m) LJJIIJ().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLIZLLLIL = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLIZLLLIL != null) {
                this.LLILZLL |= 2;
                LJIILLIIL();
            }
        }
        if (c131x.hasDebugRedact()) {
            this.LLJI = c131x.getDebugRedact();
            this.LLILZLL |= 4;
            LJIILLIIL();
        }
        if (c131x.hasFeatureSupport()) {
            C199433131j featureSupport = c131x.getFeatureSupport();
            C130N<C199433131j, C199434131k, InterfaceC199432131i> c130n2 = this.LLJILJIL;
            if (c130n2 == null) {
                if ((this.LLILZLL & 8) != 0 && (c199433131j = this.LLJIJIL) != null && c199433131j != C199433131j.getDefaultInstance()) {
                    this.LLILZLL |= 8;
                    LJIILLIIL();
                    ((C199434131k) LJJIII().LIZJ()).LJIJJLI(featureSupport);
                } else {
                    this.LLJIJIL = featureSupport;
                }
            } else {
                c130n2.LJ(featureSupport);
            }
            if (this.LLJIJIL != null) {
                this.LLILZLL |= 8;
                LJIILLIIL();
            }
        }
        if (this.LLJILLL == null) {
            if (!c131x.uninterpretedOption_.isEmpty()) {
                if (this.LLJILJILJ.isEmpty()) {
                    this.LLJILJILJ = c131x.uninterpretedOption_;
                    this.LLILZLL &= -17;
                } else {
                    if ((this.LLILZLL & 16) == 0) {
                        this.LLJILJILJ = new ArrayList(this.LLJILJILJ);
                        this.LLILZLL |= 16;
                    }
                    this.LLJILJILJ.addAll(c131x.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c131x.uninterpretedOption_.isEmpty()) {
            if (this.LLJILLL.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJZLJL = null;
                this.LLJILLL.LIZ = null;
                this.LLJILLL = null;
                this.LLJILJILJ = c131x.uninterpretedOption_;
                this.LLILZLL &= -17;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJZLJL = LJJIIJZLJL();
                }
                this.LLJILLL = c130mLJJIIJZLJL;
            } else {
                this.LLJILLL.LIZIZ(c131x.uninterpretedOption_);
            }
        }
        LJIL(c131x);
        LJFF(c131x.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131X) {
            LJJIIZI((C131X) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final C131W LJJIIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 8) {
                        if (iLJJIJIL != 18) {
                            if (iLJJIJIL != 24) {
                                if (iLJJIJIL != 34) {
                                    if (iLJJIJIL != 7994) {
                                        if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                            break;
                                        }
                                    } else {
                                        C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILLL;
                                        if (c130m == null) {
                                            if ((this.LLILZLL & 16) == 0) {
                                                this.LLJILJILJ = new ArrayList(this.LLJILJILJ);
                                                this.LLILZLL |= 16;
                                            }
                                            this.LLJILJILJ.add(c132o);
                                        } else {
                                            c130m.LIZJ(c132o);
                                        }
                                    }
                                } else {
                                    abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
                                    this.LLILZLL |= 8;
                                }
                            } else {
                                this.LLJI = abstractC19927312xz.LJIILIIL();
                                this.LLILZLL |= 4;
                            }
                        } else {
                            abstractC19927312xz.LJJI(LJJIIJ().LIZJ(), c19926312xp);
                            this.LLILZLL |= 2;
                        }
                    } else {
                        this.LLIZ = abstractC19927312xz.LJIILIIL();
                        this.LLILZLL |= 1;
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
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }
}
