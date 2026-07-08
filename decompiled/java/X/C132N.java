package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132N extends AbstractC19933512yz<C132N> implements AnonymousClass1331 {
    public int LLILZIL;
    public List<C132U> LLILZLL;
    public C130M<C132U, C199451132b, InterfaceC199473132x> LLIZ;
    public Object LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public double LLJIJIL;
    public AbstractC19922812xG LLJILJIL;
    public Object LLJILJILJ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        int i = 0;
        while (true) {
            C130M<C132U, C199451132b, InterfaceC199473132x> c130m = this.LLIZ;
            if (i >= (c130m == null ? this.LLILZLL.size() : c130m.LJFF())) {
                return true;
            }
            C130M<C132U, C199451132b, InterfaceC199473132x> c130m2 = this.LLIZ;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLILZLL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJJJL;
        c19935812zM.LIZ(C132O.class, C132N.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132O buildPartial() {
        C132O c132o = new C132O(this);
        C130M<C132U, C199451132b, InterfaceC199473132x> c130m = this.LLIZ;
        int i = 1;
        if (c130m == null) {
            if ((this.LLILZIL & 1) != 0) {
                this.LLILZLL = Collections.unmodifiableList(this.LLILZLL);
                this.LLILZIL &= -2;
            }
            c132o.name_ = this.LLILZLL;
        } else {
            c132o.name_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 2) != 0) {
                c132o.identifierValue_ = this.LLIZLLLIL;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                c132o.positiveIntValue_ = this.LLJ;
                i |= 2;
            }
            if ((i2 & 8) != 0) {
                c132o.negativeIntValue_ = this.LLJI;
                i |= 4;
            }
            if ((i2 & 16) != 0) {
                c132o.doubleValue_ = this.LLJIJIL;
                i |= 8;
            }
            if ((i2 & 32) != 0) {
                c132o.stringValue_ = this.LLJILJIL;
                i |= 16;
            }
            if ((i2 & 64) != 0) {
                c132o.aggregateValue_ = this.LLJILJILJ;
                i |= 32;
            }
            c132o.LLILLJJLI |= i;
        }
        LJIILL();
        return c132o;
    }

    public C132N() {
        this.LLILZLL = Collections.emptyList();
        this.LLIZLLLIL = "";
        this.LLJILJIL = AbstractC19922812xG.EMPTY;
        this.LLJILJILJ = "";
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132O c132oBuildPartial = buildPartial();
        if (c132oBuildPartial.isInitialized()) {
            return c132oBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132oBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132O.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJJJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132O c132oBuildPartial = buildPartial();
        if (c132oBuildPartial.isInitialized()) {
            return c132oBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132oBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132O.getDefaultInstance();
    }

    public C132N(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = Collections.emptyList();
        this.LLIZLLLIL = "";
        this.LLJILJIL = AbstractC19922812xG.EMPTY;
        this.LLJILJILJ = "";
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132O) {
            LJIJJLI((C132O) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C132O c132o) {
        if (c132o == C132O.getDefaultInstance()) {
            return;
        }
        if (this.LLIZ == null) {
            if (!c132o.name_.isEmpty()) {
                if (this.LLILZLL.isEmpty()) {
                    this.LLILZLL = c132o.name_;
                    this.LLILZIL &= -2;
                } else {
                    if ((this.LLILZIL & 1) == 0) {
                        this.LLILZLL = new ArrayList(this.LLILZLL);
                        this.LLILZIL |= 1;
                    }
                    this.LLILZLL.addAll(c132o.name_);
                }
                LJIILLIIL();
            }
        } else if (!c132o.name_.isEmpty()) {
            if (this.LLIZ.LJII()) {
                C130M<C132U, C199451132b, InterfaceC199473132x> c130m = null;
                this.LLIZ.LIZ = null;
                this.LLIZ = null;
                List<C132U> list = c132o.name_;
                this.LLILZLL = list;
                this.LLILZIL &= -2;
                if (k0.alwaysUseFieldBuilders) {
                    C130M<C132U, C199451132b, InterfaceC199473132x> c130m2 = new C130M<>(list, LJIIJJI(), this.LLILLL);
                    this.LLIZ = c130m2;
                    this.LLILZLL = null;
                    c130m = c130m2;
                }
                this.LLIZ = c130m;
            } else {
                this.LLIZ.LIZIZ(c132o.name_);
            }
        }
        if (c132o.hasIdentifierValue()) {
            this.LLIZLLLIL = c132o.identifierValue_;
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c132o.hasPositiveIntValue()) {
            this.LLJ = c132o.getPositiveIntValue();
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (c132o.hasNegativeIntValue()) {
            this.LLJI = c132o.getNegativeIntValue();
            this.LLILZIL |= 8;
            LJIILLIIL();
        }
        if (c132o.hasDoubleValue()) {
            this.LLJIJIL = c132o.getDoubleValue();
            this.LLILZIL |= 16;
            LJIILLIIL();
        }
        if (c132o.hasStringValue()) {
            AbstractC19922812xG stringValue = c132o.getStringValue();
            stringValue.getClass();
            this.LLJILJIL = stringValue;
            this.LLILZIL |= 32;
            LJIILLIIL();
        }
        if (c132o.hasAggregateValue()) {
            this.LLJILJILJ = c132o.aggregateValue_;
            this.LLILZIL |= 64;
            LJIILLIIL();
        }
        LJFF(c132o.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132O) {
            LJIJJLI((C132O) interfaceC19930912yZ);
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
                    if (iLJJIJIL != 18) {
                        if (iLJJIJIL != 26) {
                            if (iLJJIJIL != 32) {
                                if (iLJJIJIL != 40) {
                                    if (iLJJIJIL != 49) {
                                        if (iLJJIJIL != 58) {
                                            if (iLJJIJIL != 66) {
                                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                    break;
                                                }
                                            } else {
                                                this.LLJILJILJ = abstractC19927312xz.LJIILJJIL();
                                                this.LLILZIL |= 64;
                                            }
                                        } else {
                                            this.LLJILJIL = abstractC19927312xz.LJIILJJIL();
                                            this.LLILZIL |= 32;
                                        }
                                    } else {
                                        this.LLJIJIL = abstractC19927312xz.LJIILL();
                                        this.LLILZIL |= 16;
                                    }
                                } else {
                                    this.LLJI = abstractC19927312xz.LJIL();
                                    this.LLILZIL |= 8;
                                }
                            } else {
                                this.LLJ = abstractC19927312xz.LJJIJLIJ();
                                this.LLILZIL |= 4;
                            }
                        } else {
                            this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 2;
                        }
                    } else {
                        C132U c132u = (C132U) abstractC19927312xz.LJJ(C132U.parser(), c19926312xp);
                        C130M<C132U, C199451132b, InterfaceC199473132x> c130m = this.LLIZ;
                        if (c130m == null) {
                            if ((this.LLILZIL & 1) == 0) {
                                this.LLILZLL = new ArrayList(this.LLILZLL);
                                this.LLILZIL = 1 | this.LLILZIL;
                            }
                            this.LLILZLL.add(c132u);
                        } else {
                            c130m.LIZJ(c132u);
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
