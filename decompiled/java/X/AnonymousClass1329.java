package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1329, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1329 extends AbstractC19933312yx<AnonymousClass1328, AnonymousClass1329> implements C131O {
    public int LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public C199437131n LLJ;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJI;
    public List<C132O> LLJIJIL;
    public C130M<C132O, C132N, AnonymousClass1331> LLJILJIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJJIZL;
        c19935812zM.LIZ(AnonymousClass1328.class, AnonymousClass1329.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass1328 buildPartial() {
        int i;
        AnonymousClass1328 anonymousClass1328 = new AnonymousClass1328(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJIL;
        if (c130m == null) {
            if ((this.LLILZLL & 8) != 0) {
                this.LLJIJIL = Collections.unmodifiableList(this.LLJIJIL);
                this.LLILZLL &= -9;
            }
            anonymousClass1328.uninterpretedOption_ = this.LLJIJIL;
        } else {
            anonymousClass1328.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                anonymousClass1328.deprecated_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                anonymousClass1328.idempotencyLevel_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJI;
                anonymousClass1328.features_ = c130n == null ? this.LLJ : (C199437131n) c130n.LIZIZ();
                i |= 4;
            }
            anonymousClass1328.LLILLJJLI |= i;
        }
        LJIILL();
        return anonymousClass1328;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIII() {
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

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJ() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C130M<>(this.LLJIJIL, LJIIJJI(), this.LLILLL);
            this.LLJIJIL = null;
        }
        return this.LLJILJIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 4) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJI;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJ;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJIL;
            if (i >= (c130m == null ? this.LLJIJIL.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJILJIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJIJIL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public AnonymousClass1329() {
        this.LLJIJIL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        AnonymousClass1328 anonymousClass1328BuildPartial = buildPartial();
        if (anonymousClass1328BuildPartial.isInitialized()) {
            return anonymousClass1328BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1328BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return AnonymousClass1328.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJJI;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        AnonymousClass1328 anonymousClass1328BuildPartial = buildPartial();
        if (anonymousClass1328BuildPartial.isInitialized()) {
            return anonymousClass1328BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1328BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return AnonymousClass1328.getDefaultInstance();
    }

    public AnonymousClass1329(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJIJIL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1328) {
            LJJIIJZLJL((AnonymousClass1328) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIJZLJL(AnonymousClass1328 anonymousClass1328) {
        C199437131n c199437131n;
        if (anonymousClass1328 == AnonymousClass1328.getDefaultInstance()) {
            return;
        }
        if (anonymousClass1328.hasDeprecated()) {
            this.LLIZ = anonymousClass1328.getDeprecated();
            this.LLILZLL |= 1;
            LJIILLIIL();
        }
        if (anonymousClass1328.hasIdempotencyLevel()) {
            EnumC199447131x idempotencyLevel = anonymousClass1328.getIdempotencyLevel();
            idempotencyLevel.getClass();
            this.LLILZLL |= 2;
            this.LLIZLLLIL = idempotencyLevel.getNumber();
            LJIILLIIL();
        }
        if (anonymousClass1328.hasFeatures()) {
            C199437131n features = anonymousClass1328.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJI;
            if (c130n == null) {
                if ((this.LLILZLL & 4) != 0 && (c199437131n = this.LLJ) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 4;
                    LJIILLIIL();
                    ((C199436131m) LJJIII().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJ = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJ != null) {
                this.LLILZLL |= 4;
                LJIILLIIL();
            }
        }
        if (this.LLJILJIL == null) {
            if (!anonymousClass1328.uninterpretedOption_.isEmpty()) {
                if (this.LLJIJIL.isEmpty()) {
                    this.LLJIJIL = anonymousClass1328.uninterpretedOption_;
                    this.LLILZLL &= -9;
                } else {
                    if ((this.LLILZLL & 8) == 0) {
                        this.LLJIJIL = new ArrayList(this.LLJIJIL);
                        this.LLILZLL |= 8;
                    }
                    this.LLJIJIL.addAll(anonymousClass1328.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!anonymousClass1328.uninterpretedOption_.isEmpty()) {
            if (this.LLJILJIL.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJILJIL.LIZ = null;
                this.LLJILJIL = null;
                this.LLJIJIL = anonymousClass1328.uninterpretedOption_;
                this.LLILZLL &= -9;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJILJIL = c130mLJJIIJ;
            } else {
                this.LLJILJIL.LIZIZ(anonymousClass1328.uninterpretedOption_);
            }
        }
        LJIL(anonymousClass1328);
        LJFF(anonymousClass1328.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1328) {
            LJJIIJZLJL((AnonymousClass1328) interfaceC19930912yZ);
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
                        if (iLJJIJIL != 272) {
                            if (iLJJIJIL != 282) {
                                if (iLJJIJIL != 7994) {
                                    if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                        break;
                                    }
                                } else {
                                    C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                                    C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJILJIL;
                                    if (c130m == null) {
                                        if ((this.LLILZLL & 8) == 0) {
                                            this.LLJIJIL = new ArrayList(this.LLJIJIL);
                                            this.LLILZLL |= 8;
                                        }
                                        this.LLJIJIL.add(c132o);
                                    } else {
                                        c130m.LIZJ(c132o);
                                    }
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
                                this.LLILZLL |= 4;
                            }
                        } else {
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199447131x.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(34, iLJIILLIIL);
                            } else {
                                this.LLIZLLLIL = iLJIILLIIL;
                                this.LLILZLL |= 2;
                            }
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
