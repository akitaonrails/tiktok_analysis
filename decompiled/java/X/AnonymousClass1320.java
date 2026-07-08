package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1320, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1320 extends AbstractC19933312yx<C199449131z, AnonymousClass1320> implements InterfaceC199421130x {
    public int LLILZLL;
    public List<C132O> LLIZ;
    public C130M<C132O, C132N, AnonymousClass1331> LLIZLLLIL;
    public List<C132S> LLJ;
    public C130M<C132S, C132W, AnonymousClass1327> LLJI;
    public C199437131n LLJIJIL;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJILJIL;
    public int LLJILJILJ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        int i = 0;
        while (true) {
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLIZLLLIL;
            if (i >= (c130m == null ? this.LLIZ.size() : c130m.LJFF())) {
                if ((this.LLILZLL & 4) != 0) {
                    C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJIL;
                    if (c130n == null) {
                        interfaceC19916512wFLIZLLL = this.LLJIJIL;
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
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLIZLLLIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLIZ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIIIZ;
        c19935812zM.LIZ(C199449131z.class, AnonymousClass1320.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C199449131z buildPartial() {
        C199449131z c199449131z = new C199449131z(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLIZLLLIL;
        int i = 1;
        if (c130m == null) {
            if ((this.LLILZLL & 1) != 0) {
                this.LLIZ = Collections.unmodifiableList(this.LLIZ);
                this.LLILZLL &= -2;
            }
            c199449131z.uninterpretedOption_ = this.LLIZ;
        } else {
            c199449131z.uninterpretedOption_ = c130m.LIZLLL();
        }
        C130M<C132S, C132W, AnonymousClass1327> c130m2 = this.LLJI;
        if (c130m2 == null) {
            if ((this.LLILZLL & 2) != 0) {
                this.LLJ = Collections.unmodifiableList(this.LLJ);
                this.LLILZLL &= -3;
            }
            c199449131z.declaration_ = this.LLJ;
        } else {
            c199449131z.declaration_ = c130m2.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJIL;
                c199449131z.features_ = c130n == null ? this.LLJIJIL : (C199437131n) c130n.LIZIZ();
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                c199449131z.verification_ = this.LLJILJILJ;
                i |= 2;
            }
            c199449131z.LLILLJJLI |= i;
        }
        LJIILL();
        return c199449131z;
    }

    public final C130M<C132S, C132W, AnonymousClass1327> LJJIII() {
        if (this.LLJI == null) {
            this.LLJI = new C130M<>(this.LLJ, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIIJ() {
        if (this.LLJILJIL == null) {
            C199437131n defaultInstance = this.LLJIJIL;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJILJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJIJIL = null;
        }
        return this.LLJILJIL;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJZLJL() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C130M<>(this.LLIZ, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    public AnonymousClass1320() {
        this.LLIZ = Collections.emptyList();
        this.LLJ = Collections.emptyList();
        this.LLJILJILJ = 1;
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJZLJL();
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199449131z c199449131zBuildPartial = buildPartial();
        if (c199449131zBuildPartial.isInitialized()) {
            return c199449131zBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199449131zBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199449131z.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIIIIZZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199449131z c199449131zBuildPartial = buildPartial();
        if (c199449131zBuildPartial.isInitialized()) {
            return c199449131zBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199449131zBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199449131z.getDefaultInstance();
    }

    public AnonymousClass1320(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZ = Collections.emptyList();
        this.LLJ = Collections.emptyList();
        this.LLJILJILJ = 1;
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJZLJL();
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199449131z) {
            LJJIIZI((C199449131z) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final AnonymousClass1320 LJJIIZI(C199449131z c199449131z) {
        C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJZLJL;
        C199437131n c199437131n;
        if (c199449131z == C199449131z.getDefaultInstance()) {
            return this;
        }
        C130M<C132S, C132W, AnonymousClass1327> c130mLJJIII = null;
        if (this.LLIZLLLIL == null) {
            if (!c199449131z.uninterpretedOption_.isEmpty()) {
                if (this.LLIZ.isEmpty()) {
                    this.LLIZ = c199449131z.uninterpretedOption_;
                    this.LLILZLL &= -2;
                } else {
                    if ((this.LLILZLL & 1) == 0) {
                        this.LLIZ = new ArrayList(this.LLIZ);
                        this.LLILZLL |= 1;
                    }
                    this.LLIZ.addAll(c199449131z.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c199449131z.uninterpretedOption_.isEmpty()) {
            if (this.LLIZLLLIL.LJII()) {
                this.LLIZLLLIL.LIZ = null;
                this.LLIZLLLIL = null;
                this.LLIZ = c199449131z.uninterpretedOption_;
                this.LLILZLL &= -2;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJZLJL = LJJIIJZLJL();
                } else {
                    c130mLJJIIJZLJL = null;
                }
                this.LLIZLLLIL = c130mLJJIIJZLJL;
            } else {
                this.LLIZLLLIL.LIZIZ(c199449131z.uninterpretedOption_);
            }
        }
        if (this.LLJI == null) {
            if (!c199449131z.declaration_.isEmpty()) {
                if (this.LLJ.isEmpty()) {
                    this.LLJ = c199449131z.declaration_;
                    this.LLILZLL &= -3;
                } else {
                    if ((this.LLILZLL & 2) == 0) {
                        this.LLJ = new ArrayList(this.LLJ);
                        this.LLILZLL |= 2;
                    }
                    this.LLJ.addAll(c199449131z.declaration_);
                }
                LJIILLIIL();
            }
        } else if (!c199449131z.declaration_.isEmpty()) {
            if (this.LLJI.LJII()) {
                this.LLJI.LIZ = null;
                this.LLJI = null;
                this.LLJ = c199449131z.declaration_;
                this.LLILZLL &= -3;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIII = LJJIII();
                }
                this.LLJI = c130mLJJIII;
            } else {
                this.LLJI.LIZIZ(c199449131z.declaration_);
            }
        }
        if (c199449131z.hasFeatures()) {
            C199437131n features = c199449131z.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJILJIL;
            if (c130n == null) {
                if ((this.LLILZLL & 4) != 0 && (c199437131n = this.LLJIJIL) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 4;
                    LJIILLIIL();
                    ((C199436131m) LJJIIJ().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJIJIL = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJIJIL != null) {
                this.LLILZLL |= 4;
                LJIILLIIL();
            }
        }
        if (c199449131z.hasVerification()) {
            EnumC199448131y verification = c199449131z.getVerification();
            verification.getClass();
            this.LLILZLL |= 8;
            this.LLJILJILJ = verification.getNumber();
            LJIILLIIL();
        }
        LJIL(c199449131z);
        LJFF(c199449131z.getUnknownFields());
        LJIILLIIL();
        return this;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199449131z) {
            LJJIIZI((C199449131z) interfaceC19930912yZ);
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

    public final AnonymousClass1320 LJJIIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 18) {
                        if (iLJJIJIL != 24) {
                            if (iLJJIJIL != 402) {
                                if (iLJJIJIL != 7994) {
                                    if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                        break;
                                    }
                                } else {
                                    C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                    C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLIZLLLIL;
                                    if (c130m == null) {
                                        if ((this.LLILZLL & 1) == 0) {
                                            this.LLIZ = new ArrayList(this.LLIZ);
                                            this.LLILZLL = 1 | this.LLILZLL;
                                        }
                                        this.LLIZ.add(c132o);
                                    } else {
                                        c130m.LIZJ(c132o);
                                    }
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJJIIJ().LIZJ(), c19926312xp);
                                this.LLILZLL |= 4;
                            }
                        } else {
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199448131y.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(3, iLJIILLIIL);
                            } else {
                                this.LLJILJILJ = iLJIILLIIL;
                                this.LLILZLL |= 8;
                            }
                        }
                    } else {
                        C132S c132s = (C132S) abstractC19927312xz.LJJ(C132S.parser(), c19926312xp);
                        C130M<C132S, C132W, AnonymousClass1327> c130m2 = this.LLJI;
                        if (c130m2 == null) {
                            if ((this.LLILZLL & 2) == 0) {
                                this.LLJ = new ArrayList(this.LLJ);
                                this.LLILZLL |= 2;
                            }
                            this.LLJ.add(c132s);
                        } else {
                            c130m2.LIZJ(c132s);
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
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }
}
