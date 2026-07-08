package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132G, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132G extends AbstractC19933312yx<C132D, C132G> implements InterfaceC199471132v {
    public int LLILZLL;
    public C199437131n LLIZ;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLIZLLLIL;
    public boolean LLJ;
    public List<C132O> LLJI;
    public C130M<C132O, C132N, AnonymousClass1331> LLJIJIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJJ;
        c19935812zM.LIZ(C132D.class, C132G.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C132D buildPartial() {
        int i;
        C132D c132d = new C132D(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJIJIL;
        if (c130m == null) {
            if ((this.LLILZLL & 4) != 0) {
                this.LLJI = Collections.unmodifiableList(this.LLJI);
                this.LLILZLL &= -5;
            }
            c132d.uninterpretedOption_ = this.LLJI;
        } else {
            c132d.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
                c132d.features_ = c130n == null ? this.LLIZ : (C199437131n) c130n.LIZIZ();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132d.deprecated_ = this.LLJ;
                i |= 2;
            }
            c132d.LLILLJJLI |= i;
        }
        LJIILL();
        return c132d;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIII() {
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

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJ() {
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new C130M<>(this.LLJI, LJIIJJI(), this.LLILLL);
            this.LLJI = null;
        }
        return this.LLJIJIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 1) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLIZ;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJIJIL;
            if (i >= (c130m == null ? this.LLJI.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJIJIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJI, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C132G() {
        this.LLJI = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132D c132dBuildPartial = buildPartial();
        if (c132dBuildPartial.isInitialized()) {
            return c132dBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132dBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132D.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132D c132dBuildPartial = buildPartial();
        if (c132dBuildPartial.isInitialized()) {
            return c132dBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132dBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132D.getDefaultInstance();
    }

    public C132G(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJI = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132D) {
            LJJIIJZLJL((C132D) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIJZLJL(C132D c132d) {
        C199437131n c199437131n;
        if (c132d == C132D.getDefaultInstance()) {
            return;
        }
        if (c132d.hasFeatures()) {
            C199437131n features = c132d.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
            if (c130n == null) {
                if ((this.LLILZLL & 1) != 0 && (c199437131n = this.LLIZ) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 1;
                    LJIILLIIL();
                    ((C199436131m) LJJIII().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLIZ = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLIZ != null) {
                this.LLILZLL |= 1;
                LJIILLIIL();
            }
        }
        if (c132d.hasDeprecated()) {
            this.LLJ = c132d.getDeprecated();
            this.LLILZLL |= 2;
            LJIILLIIL();
        }
        if (this.LLJIJIL == null) {
            if (!c132d.uninterpretedOption_.isEmpty()) {
                if (this.LLJI.isEmpty()) {
                    this.LLJI = c132d.uninterpretedOption_;
                    this.LLILZLL &= -5;
                } else {
                    if ((this.LLILZLL & 4) == 0) {
                        this.LLJI = new ArrayList(this.LLJI);
                        this.LLILZLL |= 4;
                    }
                    this.LLJI.addAll(c132d.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c132d.uninterpretedOption_.isEmpty()) {
            if (this.LLJIJIL.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJIJIL.LIZ = null;
                this.LLJIJIL = null;
                this.LLJI = c132d.uninterpretedOption_;
                this.LLILZLL &= -5;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJIJIL = c130mLJJIIJ;
            } else {
                this.LLJIJIL.LIZIZ(c132d.uninterpretedOption_);
            }
        }
        LJIL(c132d);
        LJFF(c132d.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132D) {
            LJJIIJZLJL((C132D) interfaceC19930912yZ);
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
                    if (iLJJIJIL != 264) {
                        if (iLJJIJIL != 274) {
                            if (iLJJIJIL != 7994) {
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJIJIL;
                                if (c130m == null) {
                                    if ((this.LLILZLL & 4) == 0) {
                                        this.LLJI = new ArrayList(this.LLJI);
                                        this.LLILZLL |= 4;
                                    }
                                    this.LLJI.add(c132o);
                                } else {
                                    c130m.LIZJ(c132o);
                                }
                            }
                        } else {
                            abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
                            this.LLILZLL |= 1;
                        }
                    } else {
                        this.LLJ = abstractC19927312xz.LJIILIIL();
                        this.LLILZLL |= 2;
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
