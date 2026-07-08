package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.132W, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132W extends AbstractC19933512yz<C132W> implements AnonymousClass1327 {
    public int LLILZIL;
    public int LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIIJJI;
        c19935812zM.LIZ(C132S.class, C132W.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132S buildPartial() {
        int i;
        C132S c132s = new C132S(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132s.number_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132s.fullName_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c132s.type_ = this.LLIZLLLIL;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c132s.reserved_ = this.LLJ;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c132s.repeated_ = this.LLJI;
                i |= 16;
            }
            c132s.LLILLJJLI |= i;
        }
        LJIILL();
        return c132s;
    }

    public C132W() {
        this.LLIZ = "";
        this.LLIZLLLIL = "";
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132S c132sBuildPartial = buildPartial();
        if (c132sBuildPartial.isInitialized()) {
            return c132sBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132sBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132S.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIIJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132S c132sBuildPartial = buildPartial();
        if (c132sBuildPartial.isInitialized()) {
            return c132sBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132sBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132S.getDefaultInstance();
    }

    public C132W(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZ = "";
        this.LLIZLLLIL = "";
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132S) {
            LJIJJLI((C132S) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C132S c132s) {
        if (c132s == C132S.getDefaultInstance()) {
            return;
        }
        if (c132s.hasNumber()) {
            this.LLILZLL = c132s.getNumber();
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132s.hasFullName()) {
            this.LLIZ = c132s.fullName_;
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c132s.hasType()) {
            this.LLIZLLLIL = c132s.type_;
            this.LLILZIL |= 4;
            LJIILLIIL();
        }
        if (c132s.hasReserved()) {
            this.LLJ = c132s.getReserved();
            this.LLILZIL |= 8;
            LJIILLIIL();
        }
        if (c132s.hasRepeated()) {
            this.LLJI = c132s.getRepeated();
            this.LLILZIL |= 16;
            LJIILLIIL();
        }
        LJFF(c132s.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132S) {
            LJIJJLI((C132S) interfaceC19930912yZ);
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
                        if (iLJJIJIL != 18) {
                            if (iLJJIJIL != 26) {
                                if (iLJJIJIL != 40) {
                                    if (iLJJIJIL != 48) {
                                        if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                            break;
                                        }
                                    } else {
                                        this.LLJI = abstractC19927312xz.LJIILIIL();
                                        this.LLILZIL |= 16;
                                    }
                                } else {
                                    this.LLJ = abstractC19927312xz.LJIILIIL();
                                    this.LLILZIL |= 8;
                                }
                            } else {
                                this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                                this.LLILZIL |= 4;
                            }
                        } else {
                            this.LLIZ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 2;
                        }
                    } else {
                        this.LLILZLL = abstractC19927312xz.LJIJJLI();
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
