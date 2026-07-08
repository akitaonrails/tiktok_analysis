package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131U, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131U extends AbstractC19933312yx<C131T, C131U> implements C131F {
    public int LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public C199437131n LLJI;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJIJIL;
    public List<C132O> LLJILJIL;
    public C130M<C132O, C132N, AnonymousClass1331> LLJILJILJ;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIZ;
        c19935812zM.LIZ(C131T.class, C131U.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C131T buildPartial() {
        int i;
        C131T c131t = new C131T(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJILJ;
        if (c130m == null) {
            if ((this.LLILZLL & 16) != 0) {
                this.LLJILJIL = Collections.unmodifiableList(this.LLJILJIL);
                this.LLILZLL &= -17;
            }
            c131t.uninterpretedOption_ = this.LLJILJIL;
        } else {
            c131t.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131t.allowAlias_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c131t.deprecated_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c131t.deprecatedLegacyJsonFieldConflicts_ = this.LLJ;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJIJIL;
                c131t.features_ = c130n == null ? this.LLJI : (C199437131n) c130n.LIZIZ();
                i |= 8;
            }
            c131t.LLILLJJLI |= i;
        }
        LJIILL();
        return c131t;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIII() {
        if (this.LLJIJIL == null) {
            C199437131n defaultInstance = this.LLJI;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJIJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJI = null;
        }
        return this.LLJIJIL;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJ() {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new C130M<>(this.LLJILJIL, LJIIJJI(), this.LLILLL);
            this.LLJILJIL = null;
        }
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 8) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJIJIL;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJI;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJILJ;
            if (i >= (c130m == null ? this.LLJILJIL.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJILJILJ;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILJIL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C131U() {
        this.LLJILJIL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131T c131tBuildPartial = buildPartial();
        if (c131tBuildPartial.isInitialized()) {
            return c131tBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131tBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131T.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131T c131tBuildPartial = buildPartial();
        if (c131tBuildPartial.isInitialized()) {
            return c131tBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131tBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131T.getDefaultInstance();
    }

    public C131U(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJILJIL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131T) {
            LJJIIZ((C131T) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIZ(C131T c131t) {
        C199437131n c199437131n;
        if (c131t == C131T.getDefaultInstance()) {
            return;
        }
        if (c131t.hasAllowAlias()) {
            this.LLIZ = c131t.getAllowAlias();
            this.LLILZLL |= 1;
            LJIILLIIL();
        }
        if (c131t.hasDeprecated()) {
            this.LLIZLLLIL = c131t.getDeprecated();
            this.LLILZLL |= 2;
            LJIILLIIL();
        }
        if (c131t.hasDeprecatedLegacyJsonFieldConflicts()) {
            this.LLJ = c131t.getDeprecatedLegacyJsonFieldConflicts();
            this.LLILZLL |= 4;
            LJIILLIIL();
        }
        if (c131t.hasFeatures()) {
            C199437131n features = c131t.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJIJIL;
            if (c130n == null) {
                if ((this.LLILZLL & 8) != 0 && (c199437131n = this.LLJI) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 8;
                    LJIILLIIL();
                    ((C199436131m) LJJIII().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJI = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJI != null) {
                this.LLILZLL |= 8;
                LJIILLIIL();
            }
        }
        if (this.LLJILJILJ == null) {
            if (!c131t.uninterpretedOption_.isEmpty()) {
                if (this.LLJILJIL.isEmpty()) {
                    this.LLJILJIL = c131t.uninterpretedOption_;
                    this.LLILZLL &= -17;
                } else {
                    if ((this.LLILZLL & 16) == 0) {
                        this.LLJILJIL = new ArrayList(this.LLJILJIL);
                        this.LLILZLL |= 16;
                    }
                    this.LLJILJIL.addAll(c131t.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c131t.uninterpretedOption_.isEmpty()) {
            if (this.LLJILJILJ.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJILJILJ.LIZ = null;
                this.LLJILJILJ = null;
                this.LLJILJIL = c131t.uninterpretedOption_;
                this.LLILZLL &= -17;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJILJILJ = c130mLJJIIJ;
            } else {
                this.LLJILJILJ.LIZIZ(c131t.uninterpretedOption_);
            }
        }
        LJIL(c131t);
        LJFF(c131t.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131T) {
            LJJIIZ((C131T) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final C131U LJJIIJZLJL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 16) {
                        if (iLJJIJIL != 24) {
                            if (iLJJIJIL != 48) {
                                if (iLJJIJIL != 58) {
                                    if (iLJJIJIL != 7994) {
                                        if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                            break;
                                        }
                                    } else {
                                        C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJILJ;
                                        if (c130m == null) {
                                            if ((this.LLILZLL & 16) == 0) {
                                                this.LLJILJIL = new ArrayList(this.LLJILJIL);
                                                this.LLILZLL |= 16;
                                            }
                                            this.LLJILJIL.add(c132o);
                                        } else {
                                            c130m.LIZJ(c132o);
                                        }
                                    }
                                } else {
                                    abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
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
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
