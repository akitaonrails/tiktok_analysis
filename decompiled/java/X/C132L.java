package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132L, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132L extends AbstractC19933512yz<C132L> implements InterfaceC19933112yv {
    public int LLILZIL;
    public List<C132Q> LLILZLL;
    public C130M<C132Q, C132R, InterfaceC199472132w> LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        int i = 0;
        while (true) {
            C130M<C132Q, C132R, InterfaceC199472132w> c130m = this.LLIZ;
            if (i >= (c130m == null ? this.LLILZLL.size() : c130m.LJFF())) {
                return true;
            }
            C130M<C132Q, C132R, InterfaceC199472132w> c130m2 = this.LLIZ;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLILZLL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJLZIJ;
        c19935812zM.LIZ(C132M.class, C132L.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132M buildPartial() {
        C132M c132m = new C132M(this);
        C130M<C132Q, C132R, InterfaceC199472132w> c130m = this.LLIZ;
        int i = 1;
        if (c130m == null) {
            if ((this.LLILZIL & 1) != 0) {
                this.LLILZLL = Collections.unmodifiableList(this.LLILZLL);
                this.LLILZIL &= -2;
            }
            c132m.defaults_ = this.LLILZLL;
        } else {
            c132m.defaults_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c132m.minimumEdition_ = this.LLIZLLLIL;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                c132m.maximumEdition_ = this.LLJ;
                i |= 2;
            }
            c132m.LLILLJJLI |= i;
        }
        LJIILL();
        return c132m;
    }

    public C132L() {
        this.LLILZLL = Collections.emptyList();
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132M c132mBuildPartial = buildPartial();
        if (c132mBuildPartial.isInitialized()) {
            return c132mBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132mBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132M.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJLL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132M c132mBuildPartial = buildPartial();
        if (c132mBuildPartial.isInitialized()) {
            return c132mBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132mBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132M.getDefaultInstance();
    }

    public C132L(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = Collections.emptyList();
        this.LLIZLLLIL = 0;
        this.LLJ = 0;
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132M) {
            LJIJJLI((C132M) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C132M c132m) {
        if (c132m == C132M.getDefaultInstance()) {
            return;
        }
        if (this.LLIZ == null) {
            if (!c132m.defaults_.isEmpty()) {
                if (this.LLILZLL.isEmpty()) {
                    this.LLILZLL = c132m.defaults_;
                    this.LLILZIL &= -2;
                } else {
                    if ((this.LLILZIL & 1) == 0) {
                        this.LLILZLL = new ArrayList(this.LLILZLL);
                        this.LLILZIL |= 1;
                    }
                    this.LLILZLL.addAll(c132m.defaults_);
                }
                LJIILLIIL();
            }
        } else if (!c132m.defaults_.isEmpty()) {
            if (this.LLIZ.LJII()) {
                C130M<C132Q, C132R, InterfaceC199472132w> c130m = null;
                this.LLIZ.LIZ = null;
                this.LLIZ = null;
                List<C132Q> list = c132m.defaults_;
                this.LLILZLL = list;
                this.LLILZIL &= -2;
                if (k0.alwaysUseFieldBuilders) {
                    C130M<C132Q, C132R, InterfaceC199472132w> c130m2 = new C130M<>(list, LJIIJJI(), this.LLILLL);
                    this.LLIZ = c130m2;
                    this.LLILZLL = null;
                    c130m = c130m2;
                }
                this.LLIZ = c130m;
            } else {
                this.LLIZ.LIZIZ(c132m.defaults_);
            }
        }
        if (c132m.hasMinimumEdition()) {
            C130B minimumEdition = c132m.getMinimumEdition();
            minimumEdition.getClass();
            this.LLILZIL |= 2;
            this.LLIZLLLIL = minimumEdition.getNumber();
            LJIILLIIL();
        }
        if (c132m.hasMaximumEdition()) {
            C130B maximumEdition = c132m.getMaximumEdition();
            maximumEdition.getClass();
            this.LLILZIL |= 4;
            this.LLJ = maximumEdition.getNumber();
            LJIILLIIL();
        }
        LJFF(c132m.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132M) {
            LJIJJLI((C132M) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJIL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    if (iLJJIJIL == 0) {
                        break;
                    }
                    if (iLJJIJIL != 10) {
                        if (iLJJIJIL != 32) {
                            if (iLJJIJIL != 40) {
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                                if (C130B.forNumber(iLJIILLIIL) == null) {
                                    LJIILJJIL(5, iLJIILLIIL);
                                } else {
                                    this.LLJ = iLJIILLIIL;
                                    this.LLILZIL |= 4;
                                }
                            }
                        } else {
                            int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                            if (C130B.forNumber(iLJIILLIIL2) == null) {
                                LJIILJJIL(4, iLJIILLIIL2);
                            } else {
                                this.LLIZLLLIL = iLJIILLIIL2;
                                this.LLILZIL |= 2;
                            }
                        }
                    } else {
                        C132Q c132q = (C132Q) abstractC19927312xz.LJJ(C132Q.parser(), c19926312xp);
                        C130M<C132Q, C132R, InterfaceC199472132w> c130m = this.LLIZ;
                        if (c130m == null) {
                            if ((this.LLILZIL & 1) == 0) {
                                this.LLILZLL = new ArrayList(this.LLILZLL);
                                this.LLILZIL = 1 | this.LLILZIL;
                            }
                            this.LLILZLL.add(c132q);
                        } else {
                            c130m.LIZJ(c132q);
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
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
