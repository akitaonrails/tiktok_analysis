package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131Q extends AbstractC19933312yx<C131P, C131Q> implements C131M {
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C199437131n LLJILJIL;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJILJILJ;
    public List<C132O> LLJILLL;
    public C130M<C132O, C132N, AnonymousClass1331> LLJJ;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIIJZLJL;
        c19935812zM.LIZ(C131P.class, C131Q.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C131P buildPartial() {
        int i;
        C131P c131p = new C131P(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJJ;
        if (c130m == null) {
            if ((this.LLILZLL & 64) != 0) {
                this.LLJILLL = Collections.unmodifiableList(this.LLJILLL);
                this.LLILZLL &= -65;
            }
            c131p.uninterpretedOption_ = this.LLJILLL;
        } else {
            c131p.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131p.messageSetWireFormat_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c131p.noStandardDescriptorAccessor_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c131p.deprecated_ = this.LLJ;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c131p.mapEntry_ = this.LLJI;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c131p.deprecatedLegacyJsonFieldConflicts_ = this.LLJIJIL;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJILJ;
                c131p.features_ = c130n == null ? this.LLJILJIL : (C199437131n) c130n.LIZIZ();
                i |= 32;
            }
            c131p.LLILLJJLI |= i;
        }
        LJIILL();
        return c131p;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIII() {
        if (this.LLJILJILJ == null) {
            C199437131n defaultInstance = this.LLJILJIL;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJILJILJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJILJIL = null;
        }
        return this.LLJILJILJ;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJ() {
        if (this.LLJJ == null) {
            this.LLJJ = new C130M<>(this.LLJILLL, LJIIJJI(), this.LLILLL);
            this.LLJILLL = null;
        }
        return this.LLJJ;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 32) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJILJ;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJILJIL;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJJ;
            if (i >= (c130m == null ? this.LLJILLL.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJJ;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILLL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C131Q() {
        this.LLJILLL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131P c131pBuildPartial = buildPartial();
        if (c131pBuildPartial.isInitialized()) {
            return c131pBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131pBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131P.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIIJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131P c131pBuildPartial = buildPartial();
        if (c131pBuildPartial.isInitialized()) {
            return c131pBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131pBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131P.getDefaultInstance();
    }

    public C131Q(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJILLL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131P) {
            LJJIIJZLJL((C131P) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final C131Q LJJIIJZLJL(C131P c131p) {
        C199437131n c199437131n;
        if (c131p == C131P.getDefaultInstance()) {
            return this;
        }
        if (c131p.hasMessageSetWireFormat()) {
            this.LLIZ = c131p.getMessageSetWireFormat();
            this.LLILZLL |= 1;
            LJIILLIIL();
        }
        if (c131p.hasNoStandardDescriptorAccessor()) {
            this.LLIZLLLIL = c131p.getNoStandardDescriptorAccessor();
            this.LLILZLL |= 2;
            LJIILLIIL();
        }
        if (c131p.hasDeprecated()) {
            this.LLJ = c131p.getDeprecated();
            this.LLILZLL |= 4;
            LJIILLIIL();
        }
        if (c131p.hasMapEntry()) {
            this.LLJI = c131p.getMapEntry();
            this.LLILZLL |= 8;
            LJIILLIIL();
        }
        if (c131p.hasDeprecatedLegacyJsonFieldConflicts()) {
            this.LLJIJIL = c131p.getDeprecatedLegacyJsonFieldConflicts();
            this.LLILZLL |= 16;
            LJIILLIIL();
        }
        if (c131p.hasFeatures()) {
            C199437131n features = c131p.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJILJ;
            if (c130n == null) {
                if ((this.LLILZLL & 32) != 0 && (c199437131n = this.LLJILJIL) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 32;
                    LJIILLIIL();
                    ((C199436131m) LJJIII().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJILJIL = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJILJIL != null) {
                this.LLILZLL |= 32;
                LJIILLIIL();
            }
        }
        if (this.LLJJ == null) {
            if (!c131p.uninterpretedOption_.isEmpty()) {
                if (this.LLJILLL.isEmpty()) {
                    this.LLJILLL = c131p.uninterpretedOption_;
                    this.LLILZLL &= -65;
                } else {
                    if ((this.LLILZLL & 64) == 0) {
                        this.LLJILLL = new ArrayList(this.LLJILLL);
                        this.LLILZLL |= 64;
                    }
                    this.LLJILLL.addAll(c131p.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c131p.uninterpretedOption_.isEmpty()) {
            if (this.LLJJ.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJJ.LIZ = null;
                this.LLJJ = null;
                this.LLJILLL = c131p.uninterpretedOption_;
                this.LLILZLL &= -65;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJJ = c130mLJJIIJ;
            } else {
                this.LLJJ.LIZIZ(c131p.uninterpretedOption_);
            }
        }
        LJIL(c131p);
        LJFF(c131p.getUnknownFields());
        LJIILLIIL();
        return this;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131P) {
            LJJIIJZLJL((C131P) interfaceC19930912yZ);
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

    public final void LJJIIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                            if (iLJJIJIL != 24) {
                                if (iLJJIJIL != 56) {
                                    if (iLJJIJIL != 88) {
                                        if (iLJJIJIL != 98) {
                                            if (iLJJIJIL != 7994) {
                                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                    break;
                                                }
                                            } else {
                                                C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                                C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJJ;
                                                if (c130m == null) {
                                                    if ((this.LLILZLL & 64) == 0) {
                                                        this.LLJILLL = new ArrayList(this.LLJILLL);
                                                        this.LLILZLL |= 64;
                                                    }
                                                    this.LLJILLL.add(c132o);
                                                } else {
                                                    c130m.LIZJ(c132o);
                                                }
                                            }
                                        } else {
                                            abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
                                            this.LLILZLL |= 32;
                                        }
                                    } else {
                                        this.LLJIJIL = abstractC19927312xz.LJIILIIL();
                                        this.LLILZLL |= 16;
                                    }
                                } else {
                                    this.LLJI = abstractC19927312xz.LJIILIIL();
                                    this.LLILZLL |= 8;
                                }
                            } else {
                                this.LLJ = abstractC19927312xz.LJIILIIL();
                                this.LLILZLL |= 4;
                            }
                        } else {
                            this.LLIZLLLIL = abstractC19927312xz.LJIILIIL();
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
