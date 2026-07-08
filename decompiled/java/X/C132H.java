package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132H, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132H extends AbstractC19933512yz<C132H> implements AnonymousClass1330 {
    public int LLILZIL;
    public Object LLILZLL;
    public List<C132J> LLIZ;
    public C130M<C132J, C132K, InterfaceC199474132y> LLIZLLLIL;
    public C132D LLJ;
    public C130N<C132D, C132G, InterfaceC199471132v> LLJI;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        int i = 0;
        while (true) {
            C130M<C132J, C132K, InterfaceC199474132y> c130m = this.LLIZLLLIL;
            if (i >= (c130m == null ? this.LLIZ.size() : c130m.LJFF())) {
                if ((this.LLILZIL & 4) != 0) {
                    C130N<C132D, C132G, InterfaceC199471132v> c130n = this.LLJI;
                    if (c130n == null) {
                        interfaceC19916512wFLIZLLL = this.LLJ;
                        if (interfaceC19916512wFLIZLLL == null) {
                            interfaceC19916512wFLIZLLL = C132D.getDefaultInstance();
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
            C130M<C132J, C132K, InterfaceC199474132y> c130m2 = this.LLIZLLLIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLIZ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJ;
        c19935812zM.LIZ(C132I.class, C132H.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132I buildPartial() {
        int i;
        C132I c132i = new C132I(this);
        C130M<C132J, C132K, InterfaceC199474132y> c130m = this.LLIZLLLIL;
        if (c130m == null) {
            if ((this.LLILZIL & 2) != 0) {
                this.LLIZ = Collections.unmodifiableList(this.LLIZ);
                this.LLILZIL &= -3;
            }
            c132i.method_ = this.LLIZ;
        } else {
            c132i.method_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132i.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                C130N<C132D, C132G, InterfaceC199471132v> c130n = this.LLJI;
                c132i.options_ = c130n == null ? this.LLJ : (C132D) c130n.LIZIZ();
                i |= 2;
            }
            c132i.LLILLJJLI |= i;
        }
        LJIILL();
        return c132i;
    }

    public final C130M<C132J, C132K, InterfaceC199474132y> LJIJJLI() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C130M<>(this.LLIZ, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    public final C130N<C132D, C132G, InterfaceC199471132v> LJIL() {
        if (this.LLJI == null) {
            C132D defaultInstance = this.LLJ;
            if (defaultInstance == null) {
                defaultInstance = C132D.getDefaultInstance();
            }
            this.LLJI = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    public C132H() {
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
            LJIL();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132I c132iBuildPartial = buildPartial();
        if (c132iBuildPartial.isInitialized()) {
            return c132iBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132iBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132I.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132I c132iBuildPartial = buildPartial();
        if (c132iBuildPartial.isInitialized()) {
            return c132iBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132iBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132I.getDefaultInstance();
    }

    public C132H(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
            LJIL();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132I) {
            LJJI((C132I) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJI(C132I c132i) {
        C132D c132d;
        if (c132i == C132I.getDefaultInstance()) {
            return;
        }
        if (c132i.hasName()) {
            this.LLILZLL = c132i.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (this.LLIZLLLIL == null) {
            if (!c132i.method_.isEmpty()) {
                if (this.LLIZ.isEmpty()) {
                    this.LLIZ = c132i.method_;
                    this.LLILZIL &= -3;
                } else {
                    if ((this.LLILZIL & 2) == 0) {
                        this.LLIZ = new ArrayList(this.LLIZ);
                        this.LLILZIL |= 2;
                    }
                    this.LLIZ.addAll(c132i.method_);
                }
                LJIILLIIL();
            }
        } else if (!c132i.method_.isEmpty()) {
            if (this.LLIZLLLIL.LJII()) {
                C130M<C132J, C132K, InterfaceC199474132y> c130mLJIJJLI = null;
                this.LLIZLLLIL.LIZ = null;
                this.LLIZLLLIL = null;
                this.LLIZ = c132i.method_;
                this.LLILZIL &= -3;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJIJJLI = LJIJJLI();
                }
                this.LLIZLLLIL = c130mLJIJJLI;
            } else {
                this.LLIZLLLIL.LIZIZ(c132i.method_);
            }
        }
        if (c132i.hasOptions()) {
            C132D options = c132i.getOptions();
            C130N<C132D, C132G, InterfaceC199471132v> c130n = this.LLJI;
            if (c130n == null) {
                if ((this.LLILZIL & 4) != 0 && (c132d = this.LLJ) != null && c132d != C132D.getDefaultInstance()) {
                    this.LLILZIL |= 4;
                    LJIILLIIL();
                    ((C132G) LJIL().LIZJ()).LJJIIJZLJL(options);
                } else {
                    this.LLJ = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLJ != null) {
                this.LLILZIL |= 4;
                LJIILLIIL();
            }
        }
        LJFF(c132i.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132I) {
            LJJI((C132I) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIFFI(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIFFI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJIL().LIZJ(), c19926312xp);
                                this.LLILZIL |= 4;
                            }
                        } else {
                            C132J c132j = (C132J) abstractC19927312xz.LJJ(C132J.parser(), c19926312xp);
                            C130M<C132J, C132K, InterfaceC199474132y> c130m = this.LLIZLLLIL;
                            if (c130m == null) {
                                if ((this.LLILZIL & 2) == 0) {
                                    this.LLIZ = new ArrayList(this.LLIZ);
                                    this.LLILZIL |= 2;
                                }
                                this.LLIZ.add(c132j);
                            } else {
                                c130m.LIZJ(c132j);
                            }
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
        LJJIFFI(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIFFI(abstractC19927312xz, c19926312xp);
        return this;
    }
}
