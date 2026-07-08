package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.132a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199450132a extends AbstractC19933512yz<C199450132a> implements InterfaceC199431131h {
    public int LLILZIL;
    public int LLILZLL;
    public Object LLIZ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIJIIJI;
        c19935812zM.LIZ(C132V.class, C199450132a.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132V buildPartial() {
        int i;
        C132V c132v = new C132V(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132v.edition_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132v.value_ = this.LLIZ;
                i |= 2;
            }
            c132v.LLILLJJLI |= i;
        }
        LJIILL();
        return c132v;
    }

    public C199450132a() {
        this.LLIZ = "";
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132V c132vBuildPartial = buildPartial();
        if (c132vBuildPartial.isInitialized()) {
            return c132vBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132vBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132V.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132V c132vBuildPartial = buildPartial();
        if (c132vBuildPartial.isInitialized()) {
            return c132vBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132vBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132V.getDefaultInstance();
    }

    public C199450132a(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZ = "";
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132V) {
            LJIJJLI((C132V) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C132V c132v) {
        if (c132v == C132V.getDefaultInstance()) {
            return;
        }
        if (c132v.hasEdition()) {
            C130B edition = c132v.getEdition();
            edition.getClass();
            this.LLILZIL |= 1;
            this.LLILZLL = edition.getNumber();
            LJIILLIIL();
        }
        if (c132v.hasValue()) {
            this.LLIZ = c132v.value_;
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        LJFF(c132v.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132V) {
            LJIJJLI((C132V) interfaceC19930912yZ);
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
                        if (iLJJIJIL != 24) {
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                break;
                            }
                        } else {
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (C130B.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(3, iLJIILLIIL);
                            } else {
                                this.LLILZLL = iLJIILLIIL;
                                this.LLILZIL |= 1;
                            }
                        }
                    } else {
                        this.LLIZ = abstractC19927312xz.LJIILJJIL();
                        this.LLILZIL |= 2;
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
