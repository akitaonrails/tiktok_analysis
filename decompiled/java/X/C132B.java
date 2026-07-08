package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132B, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132B extends AbstractC19933312yx<C132C, C132B> implements InterfaceC199470132u {
    public int LLILZLL;
    public C199437131n LLIZ;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLIZLLLIL;
    public List<C132O> LLJ;
    public C130M<C132O, C132N, AnonymousClass1331> LLJI;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIJLIJ;
        c19935812zM.LIZ(C132C.class, C132B.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C132C buildPartial() {
        C132C c132c = new C132C(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJI;
        if (c130m == null) {
            if ((this.LLILZLL & 2) != 0) {
                this.LLJ = Collections.unmodifiableList(this.LLJ);
                this.LLILZLL &= -3;
            }
            c132c.uninterpretedOption_ = this.LLJ;
        } else {
            c132c.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i = this.LLILZLL;
        if (i != 0) {
            int i2 = 1;
            if ((i & 1) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLIZLLLIL;
                c132c.features_ = c130n == null ? this.LLIZ : (C199437131n) c130n.LIZIZ();
            } else {
                i2 = 0;
            }
            c132c.LLILLJJLI |= i2;
        }
        LJIILL();
        return c132c;
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
        if (this.LLJI == null) {
            this.LLJI = new C130M<>(this.LLJ, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJI;
            if (i >= (c130m == null ? this.LLJ.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJI;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C132B() {
        this.LLJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132C c132cBuildPartial = buildPartial();
        if (c132cBuildPartial.isInitialized()) {
            return c132cBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132cBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132C.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIJL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132C c132cBuildPartial = buildPartial();
        if (c132cBuildPartial.isInitialized()) {
            return c132cBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132cBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132C.getDefaultInstance();
    }

    public C132B(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132C) {
            LJJIIJZLJL((C132C) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIJZLJL(C132C c132c) {
        C199437131n c199437131n;
        if (c132c == C132C.getDefaultInstance()) {
            return;
        }
        if (c132c.hasFeatures()) {
            C199437131n features = c132c.getFeatures();
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
        if (this.LLJI == null) {
            if (!c132c.uninterpretedOption_.isEmpty()) {
                if (this.LLJ.isEmpty()) {
                    this.LLJ = c132c.uninterpretedOption_;
                    this.LLILZLL &= -3;
                } else {
                    if ((this.LLILZLL & 2) == 0) {
                        this.LLJ = new ArrayList(this.LLJ);
                        this.LLILZLL |= 2;
                    }
                    this.LLJ.addAll(c132c.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c132c.uninterpretedOption_.isEmpty()) {
            if (this.LLJI.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJI.LIZ = null;
                this.LLJI = null;
                this.LLJ = c132c.uninterpretedOption_;
                this.LLILZLL &= -3;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJI = c130mLJJIIJ;
            } else {
                this.LLJI.LIZIZ(c132c.uninterpretedOption_);
            }
        }
        LJIL(c132c);
        LJFF(c132c.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132C) {
            LJJIIJZLJL((C132C) interfaceC19930912yZ);
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
                    if (iLJJIJIL != 10) {
                        if (iLJJIJIL != 7994) {
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                break;
                            }
                        } else {
                            C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJI;
                            if (c130m == null) {
                                if ((this.LLILZLL & 2) == 0) {
                                    this.LLJ = new ArrayList(this.LLJ);
                                    this.LLILZLL |= 2;
                                }
                                this.LLJ.add(c132o);
                            } else {
                                c130m.LIZJ(c132o);
                            }
                        }
                    } else {
                        abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
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
