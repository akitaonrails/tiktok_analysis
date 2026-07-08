package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.130R, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C130R extends AbstractC19933512yz<C130R> implements InterfaceC19933112yv {
    public int LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = AnonymousClass1307.LIZJ;
        c19935812zM.LIZ(C130Q.class, C130R.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C130Q buildPartial() {
        int i;
        C130Q c130q = new C130Q(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c130q.legacyClosedEnum_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c130q.utf8Validation_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c130q.largeEnum_ = this.LLIZLLLIL;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c130q.useOldOuterClassnameDefault_ = this.LLJ;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c130q.nestInFileClass_ = this.LLJI;
                i |= 16;
            }
            c130q.LLILLJJLI |= i;
        }
        LJIILL();
        return c130q;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C130Q c130qBuildPartial = buildPartial();
        if (c130qBuildPartial.isInitialized()) {
            return c130qBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c130qBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C130Q.getDefaultInstance();
    }

    public C130R() {
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return AnonymousClass1307.LIZIZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C130Q c130qBuildPartial = buildPartial();
        if (c130qBuildPartial.isInitialized()) {
            return c130qBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c130qBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C130Q.getDefaultInstance();
    }

    public C130R(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C130Q) {
            LJIJJLI((C130Q) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C130Q c130q) {
        if (c130q == C130Q.getDefaultInstance()) {
            return;
        }
        if (c130q.hasLegacyClosedEnum()) {
            this.LLILZLL = c130q.getLegacyClosedEnum();
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c130q.hasUtf8Validation()) {
            C130O utf8Validation = c130q.getUtf8Validation();
            utf8Validation.getClass();
            this.LLILZIL |= 2;
            this.LLIZ = utf8Validation.getNumber();
            LJIILLIIL();
        }
        if (c130q.hasLargeEnum()) {
            this.LLIZLLLIL = c130q.getLargeEnum();
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (c130q.hasUseOldOuterClassnameDefault()) {
            this.LLJ = c130q.getUseOldOuterClassnameDefault();
            this.LLILZIL |= 8;
            LJIILLIIL();
        }
        if (c130q.hasNestInFileClass()) {
            C130S nestInFileClass = c130q.getNestInFileClass();
            nestInFileClass.getClass();
            this.LLILZIL |= 16;
            this.LLJI = nestInFileClass.getNumber();
            LJIILLIIL();
        }
        LJFF(c130q.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C130Q) {
            LJIJJLI((C130Q) interfaceC19930912yZ);
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
                    if (iLJJIJIL != 8) {
                        if (iLJJIJIL != 16) {
                            if (iLJJIJIL != 24) {
                                if (iLJJIJIL != 32) {
                                    if (iLJJIJIL != 40) {
                                        if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                            break;
                                        }
                                    } else {
                                        int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                                        if (C130S.forNumber(iLJIILLIIL) == null) {
                                            LJIILJJIL(5, iLJIILLIIL);
                                        } else {
                                            this.LLJI = iLJIILLIIL;
                                            this.LLILZIL |= 16;
                                        }
                                    }
                                } else {
                                    this.LLJ = abstractC19927312xz.LJIILIIL();
                                    this.LLILZIL |= 8;
                                }
                            } else {
                                this.LLIZLLLIL = abstractC19927312xz.LJIILIIL();
                                this.LLILZIL |= 4;
                            }
                        } else {
                            int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                            if (C130O.forNumber(iLJIILLIIL2) == null) {
                                LJIILJJIL(2, iLJIILLIIL2);
                            } else {
                                this.LLIZ = iLJIILLIIL2;
                                this.LLILZIL |= 2;
                            }
                        }
                    } else {
                        this.LLILZLL = abstractC19927312xz.LJIILIIL();
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
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
