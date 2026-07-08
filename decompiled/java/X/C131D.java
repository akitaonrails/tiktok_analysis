package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131D, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131D extends AbstractC19933512yz<C131D> implements InterfaceC199410130m {
    public int LLILZIL;
    public Object LLILZLL;
    public List<C131J> LLIZ;
    public C130M<C131J, C131I, C131H> LLIZLLLIL;
    public C131T LLJ;
    public C130N<C131T, C131U, C131F> LLJI;
    public List<C132Y> LLJIJIL;
    public C130M<C132Y, C199453132d, C131G> LLJILJIL;
    public C19920612wu LLJILJILJ;
    public int LLJILLL;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        int i = 0;
        while (true) {
            C130M<C131J, C131I, C131H> c130m = this.LLIZLLLIL;
            if (i >= (c130m == null ? this.LLIZ.size() : c130m.LJFF())) {
                if ((this.LLILZIL & 4) != 0) {
                    C130N<C131T, C131U, C131F> c130n = this.LLJI;
                    if (c130n == null) {
                        interfaceC19916512wFLIZLLL = this.LLJ;
                        if (interfaceC19916512wFLIZLLL == null) {
                            interfaceC19916512wFLIZLLL = C131T.getDefaultInstance();
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
            C130M<C131J, C131I, C131H> c130m2 = this.LLIZLLLIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLIZ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIIZILJ;
        c19935812zM.LIZ(C131C.class, C131D.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C131C buildPartial() {
        int i;
        C131C c131c = new C131C(this);
        C130M<C131J, C131I, C131H> c130m = this.LLIZLLLIL;
        if (c130m == null) {
            if ((this.LLILZIL & 2) != 0) {
                this.LLIZ = Collections.unmodifiableList(this.LLIZ);
                this.LLILZIL &= -3;
            }
            c131c.value_ = this.LLIZ;
        } else {
            c131c.value_ = c130m.LIZLLL();
        }
        C130M<C132Y, C199453132d, C131G> c130m2 = this.LLJILJIL;
        if (c130m2 == null) {
            if ((this.LLILZIL & 8) != 0) {
                this.LLJIJIL = Collections.unmodifiableList(this.LLJIJIL);
                this.LLILZIL &= -9;
            }
            c131c.reservedRange_ = this.LLJIJIL;
        } else {
            c131c.reservedRange_ = c130m2.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131c.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 4) != 0) {
                C130N<C131T, C131U, C131F> c130n = this.LLJI;
                c131c.options_ = c130n == null ? this.LLJ : (C131T) c130n.LIZIZ();
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.LLJILJILJ.LJJLIIIJL();
                c131c.reservedName_ = this.LLJILJILJ;
            }
            if ((i2 & 32) != 0) {
                c131c.visibility_ = this.LLJILLL;
                i |= 4;
            }
            c131c.LLILLJJLI |= i;
        }
        LJIILL();
        return c131c;
    }

    public final C130N<C131T, C131U, C131F> LJIJJLI() {
        if (this.LLJI == null) {
            C131T defaultInstance = this.LLJ;
            if (defaultInstance == null) {
                defaultInstance = C131T.getDefaultInstance();
            }
            this.LLJI = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    public final C130M<C132Y, C199453132d, C131G> LJIL() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C130M<>(this.LLJIJIL, LJIIJJI(), this.LLILLL);
            this.LLJIJIL = null;
        }
        return this.LLJILJIL;
    }

    public final C130M<C131J, C131I, C131H> LJJI() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C130M<>(this.LLIZ, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    public C131D() {
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        this.LLJIJIL = Collections.emptyList();
        this.LLJILJILJ = C19920612wu.LLILLL;
        this.LLJILLL = 0;
        if (k0.alwaysUseFieldBuilders) {
            LJJI();
            LJIJJLI();
            LJIL();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131C c131cBuildPartial = buildPartial();
        if (c131cBuildPartial.isInitialized()) {
            return c131cBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131cBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131C.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIILLIIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131C c131cBuildPartial = buildPartial();
        if (c131cBuildPartial.isInitialized()) {
            return c131cBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131cBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131C.getDefaultInstance();
    }

    public C131D(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        this.LLJIJIL = Collections.emptyList();
        this.LLJILJILJ = C19920612wu.LLILLL;
        this.LLJILLL = 0;
        if (k0.alwaysUseFieldBuilders) {
            LJJI();
            LJIJJLI();
            LJIL();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131C) {
            LJJII((C131C) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJII(C131C c131c) {
        C130M<C131J, C131I, C131H> c130mLJJI;
        C131T c131t;
        if (c131c == C131C.getDefaultInstance()) {
            return;
        }
        if (c131c.hasName()) {
            this.LLILZLL = c131c.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        C130M<C132Y, C199453132d, C131G> c130mLJIL = null;
        if (this.LLIZLLLIL == null) {
            if (!c131c.value_.isEmpty()) {
                if (this.LLIZ.isEmpty()) {
                    this.LLIZ = c131c.value_;
                    this.LLILZIL &= -3;
                } else {
                    if ((this.LLILZIL & 2) == 0) {
                        this.LLIZ = new ArrayList(this.LLIZ);
                        this.LLILZIL |= 2;
                    }
                    this.LLIZ.addAll(c131c.value_);
                }
                LJIILLIIL();
            }
        } else if (!c131c.value_.isEmpty()) {
            if (this.LLIZLLLIL.LJII()) {
                this.LLIZLLLIL.LIZ = null;
                this.LLIZLLLIL = null;
                this.LLIZ = c131c.value_;
                this.LLILZIL &= -3;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJI = LJJI();
                } else {
                    c130mLJJI = null;
                }
                this.LLIZLLLIL = c130mLJJI;
            } else {
                this.LLIZLLLIL.LIZIZ(c131c.value_);
            }
        }
        if (c131c.hasOptions()) {
            C131T options = c131c.getOptions();
            C130N<C131T, C131U, C131F> c130n = this.LLJI;
            if (c130n == null) {
                if ((this.LLILZIL & 4) != 0 && (c131t = this.LLJ) != null && c131t != C131T.getDefaultInstance()) {
                    this.LLILZIL |= 4;
                    LJIILLIIL();
                    ((C131U) LJIJJLI().LIZJ()).LJJIIZ(options);
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
        if (this.LLJILJIL == null) {
            if (!c131c.reservedRange_.isEmpty()) {
                if (this.LLJIJIL.isEmpty()) {
                    this.LLJIJIL = c131c.reservedRange_;
                    this.LLILZIL &= -9;
                } else {
                    if ((this.LLILZIL & 8) == 0) {
                        this.LLJIJIL = new ArrayList(this.LLJIJIL);
                        this.LLILZIL |= 8;
                    }
                    this.LLJIJIL.addAll(c131c.reservedRange_);
                }
                LJIILLIIL();
            }
        } else if (!c131c.reservedRange_.isEmpty()) {
            if (this.LLJILJIL.LJII()) {
                this.LLJILJIL.LIZ = null;
                this.LLJILJIL = null;
                this.LLJIJIL = c131c.reservedRange_;
                this.LLILZIL &= -9;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJIL = LJIL();
                }
                this.LLJILJIL = c130mLJIL;
            } else {
                this.LLJILJIL.LIZIZ(c131c.reservedRange_);
            }
        }
        if (!c131c.reservedName_.isEmpty()) {
            if (this.LLJILJILJ.isEmpty()) {
                this.LLJILJILJ = c131c.reservedName_;
                this.LLILZIL |= 16;
            } else {
                if (!this.LLJILJILJ.LL) {
                    this.LLJILJILJ = new C19920612wu(this.LLJILJILJ);
                }
                this.LLILZIL |= 16;
                this.LLJILJILJ.addAll(c131c.reservedName_);
            }
            LJIILLIIL();
        }
        if (c131c.hasVisibility()) {
            EnumC199405130h visibility = c131c.getVisibility();
            visibility.getClass();
            this.LLILZIL |= 32;
            this.LLJILLL = visibility.getNumber();
            LJIILLIIL();
        }
        LJFF(c131c.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131C) {
            LJJII((C131C) interfaceC19930912yZ);
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

    public final C131D LJJIFFI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                                if (iLJJIJIL != 34) {
                                    if (iLJJIJIL != 42) {
                                        if (iLJJIJIL != 48) {
                                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                break;
                                            }
                                        } else {
                                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                                            if (EnumC199405130h.forNumber(iLJIILLIIL) == null) {
                                                LJIILJJIL(6, iLJIILLIIL);
                                            } else {
                                                this.LLJILLL = iLJIILLIIL;
                                                this.LLILZIL |= 32;
                                            }
                                        }
                                    } else {
                                        AbstractC19922812xG abstractC19922812xGLJIILJJIL = abstractC19927312xz.LJIILJJIL();
                                        if (!this.LLJILJILJ.LL) {
                                            this.LLJILJILJ = new C19920612wu(this.LLJILJILJ);
                                        }
                                        this.LLILZIL |= 16;
                                        this.LLJILJILJ.LJL(abstractC19922812xGLJIILJJIL);
                                    }
                                } else {
                                    C132Y c132y = (C132Y) abstractC19927312xz.LJJ(C132Y.parser(), c19926312xp);
                                    C130M<C132Y, C199453132d, C131G> c130m = this.LLJILJIL;
                                    if (c130m == null) {
                                        if ((this.LLILZIL & 8) == 0) {
                                            this.LLJIJIL = new ArrayList(this.LLJIJIL);
                                            this.LLILZIL |= 8;
                                        }
                                        this.LLJIJIL.add(c132y);
                                    } else {
                                        c130m.LIZJ(c132y);
                                    }
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                                this.LLILZIL |= 4;
                            }
                        } else {
                            C131J c131j = (C131J) abstractC19927312xz.LJJ(C131J.parser(), c19926312xp);
                            C130M<C131J, C131I, C131H> c130m2 = this.LLIZLLLIL;
                            if (c130m2 == null) {
                                if ((this.LLILZIL & 2) == 0) {
                                    this.LLIZ = new ArrayList(this.LLIZ);
                                    this.LLILZIL |= 2;
                                }
                                this.LLIZ.add(c131j);
                            } else {
                                c130m2.LIZJ(c131j);
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
        return this;
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
