package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.1317, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1317 extends AbstractC19933512yz<AnonymousClass1317> implements C131B {
    public int LLILZIL;
    public InterfaceC19922412xC LLILZLL;
    public InterfaceC19922412xC LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public C19920612wu LLJI;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJLIIIJILLIZJL;
        c19935812zM.LIZ(AnonymousClass1316.class, AnonymousClass1317.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final AnonymousClass1316 buildPartial() {
        int i;
        AnonymousClass1316 anonymousClass1316 = new AnonymousClass1316(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                this.LLILZLL.LJJLIIIJL();
                anonymousClass1316.path_ = this.LLILZLL;
            }
            if ((i2 & 2) != 0) {
                this.LLIZ.LJJLIIIJL();
                anonymousClass1316.span_ = this.LLIZ;
            }
            if ((i2 & 4) != 0) {
                anonymousClass1316.leadingComments_ = this.LLIZLLLIL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                anonymousClass1316.trailingComments_ = this.LLJ;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.LLJI.LJJLIIIJL();
                anonymousClass1316.leadingDetachedComments_ = this.LLJI;
            }
            anonymousClass1316.LLILLJJLI |= i;
        }
        LJIILL();
        return anonymousClass1316;
    }

    public final void LJIJJLI() {
        if (!this.LLILZLL.LJJLIL()) {
            this.LLILZLL = (InterfaceC19922412xC) k0.LJII(this.LLILZLL);
        }
        this.LLILZIL |= 1;
    }

    public final void LJIL() {
        if (!this.LLIZ.LJJLIL()) {
            this.LLIZ = (InterfaceC19922412xC) k0.LJII(this.LLIZ);
        }
        this.LLILZIL |= 2;
    }

    public AnonymousClass1317() {
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.LLILZLL = c19889012ro;
        this.LLIZ = c19889012ro;
        this.LLIZLLLIL = "";
        this.LLJ = "";
        this.LLJI = C19920612wu.LLILLL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        AnonymousClass1316 anonymousClass1316BuildPartial = buildPartial();
        if (anonymousClass1316BuildPartial.isInitialized()) {
            return anonymousClass1316BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1316BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return AnonymousClass1316.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJLIIIJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        AnonymousClass1316 anonymousClass1316BuildPartial = buildPartial();
        if (anonymousClass1316BuildPartial.isInitialized()) {
            return anonymousClass1316BuildPartial;
        }
        throw AbstractC19931812yi.LJI(anonymousClass1316BuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return AnonymousClass1316.getDefaultInstance();
    }

    public AnonymousClass1317(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.LLILZLL = c19889012ro;
        this.LLIZ = c19889012ro;
        this.LLIZLLLIL = "";
        this.LLJ = "";
        this.LLJI = C19920612wu.LLILLL;
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1316) {
            LJJI((AnonymousClass1316) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJI(AnonymousClass1316 anonymousClass1316) {
        if (anonymousClass1316 == AnonymousClass1316.getDefaultInstance()) {
            return;
        }
        if (!anonymousClass1316.path_.isEmpty()) {
            if (this.LLILZLL.isEmpty()) {
                InterfaceC19922412xC interfaceC19922412xC = anonymousClass1316.path_;
                this.LLILZLL = interfaceC19922412xC;
                interfaceC19922412xC.LJJLIIIJL();
                this.LLILZIL |= 1;
            } else {
                LJIJJLI();
                this.LLILZLL.addAll(anonymousClass1316.path_);
            }
            LJIILLIIL();
        }
        if (!anonymousClass1316.span_.isEmpty()) {
            if (this.LLIZ.isEmpty()) {
                InterfaceC19922412xC interfaceC19922412xC2 = anonymousClass1316.span_;
                this.LLIZ = interfaceC19922412xC2;
                interfaceC19922412xC2.LJJLIIIJL();
                this.LLILZIL |= 2;
            } else {
                LJIL();
                this.LLIZ.addAll(anonymousClass1316.span_);
            }
            LJIILLIIL();
        }
        if (anonymousClass1316.hasLeadingComments()) {
            this.LLIZLLLIL = anonymousClass1316.leadingComments_;
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (anonymousClass1316.hasTrailingComments()) {
            this.LLJ = anonymousClass1316.trailingComments_;
            this.LLILZIL |= 8;
            LJIILLIIL();
        }
        if (!anonymousClass1316.leadingDetachedComments_.isEmpty()) {
            if (this.LLJI.isEmpty()) {
                this.LLJI = anonymousClass1316.leadingDetachedComments_;
                this.LLILZIL |= 16;
            } else {
                if (!this.LLJI.LL) {
                    this.LLJI = new C19920612wu(this.LLJI);
                }
                this.LLILZIL |= 16;
                this.LLJI.addAll(anonymousClass1316.leadingDetachedComments_);
            }
            LJIILLIIL();
        }
        LJFF(anonymousClass1316.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof AnonymousClass1316) {
            LJJI((AnonymousClass1316) interfaceC19930912yZ);
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
                    if (iLJJIJIL != 8) {
                        if (iLJJIJIL != 10) {
                            if (iLJJIJIL != 16) {
                                if (iLJJIJIL != 18) {
                                    if (iLJJIJIL != 26) {
                                        if (iLJJIJIL != 34) {
                                            if (iLJJIJIL != 50) {
                                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                    break;
                                                }
                                            } else {
                                                AbstractC19922812xG abstractC19922812xGLJIILJJIL = abstractC19927312xz.LJIILJJIL();
                                                if (!this.LLJI.LL) {
                                                    this.LLJI = new C19920612wu(this.LLJI);
                                                }
                                                this.LLILZIL |= 16;
                                                this.LLJI.LJL(abstractC19922812xGLJIILJJIL);
                                            }
                                        } else {
                                            this.LLJ = abstractC19927312xz.LJIILJJIL();
                                            this.LLILZIL |= 8;
                                        }
                                    } else {
                                        this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                                        this.LLILZIL |= 4;
                                    }
                                } else {
                                    int iLJIIL = abstractC19927312xz.LJIIL(abstractC19927312xz.LJJIII());
                                    LJIL();
                                    while (abstractC19927312xz.LJFF() > 0) {
                                        this.LLIZ.LJJLL(abstractC19927312xz.LJIJJLI());
                                    }
                                    abstractC19927312xz.LJIIJJI(iLJIIL);
                                }
                            } else {
                                int iLJIJJLI = abstractC19927312xz.LJIJJLI();
                                LJIL();
                                this.LLIZ.LJJLL(iLJIJJLI);
                            }
                        } else {
                            int iLJIIL2 = abstractC19927312xz.LJIIL(abstractC19927312xz.LJJIII());
                            LJIJJLI();
                            while (abstractC19927312xz.LJFF() > 0) {
                                this.LLILZLL.LJJLL(abstractC19927312xz.LJIJJLI());
                            }
                            abstractC19927312xz.LJIIJJI(iLJIIL2);
                        }
                    } else {
                        int iLJIJJLI2 = abstractC19927312xz.LJIJJLI();
                        LJIJJLI();
                        this.LLILZLL.LJJLL(iLJIJJLI2);
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
