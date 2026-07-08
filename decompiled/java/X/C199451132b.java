package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.132b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199451132b extends AbstractC19933512yz<C199451132b> implements InterfaceC199473132x {
    public int LLILZIL;
    public Object LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJJLI;
        c19935812zM.LIZ(C132U.class, C199451132b.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132U buildPartial() {
        int i;
        C132U c132u = new C132U(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132u.namePart_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132u.isExtension_ = this.LLIZ;
                i |= 2;
            }
            c132u.LLILLJJLI |= i;
        }
        LJIILL();
        return c132u;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        int i = this.LLILZIL;
        return ((i & 1) == 0 || (i & 2) == 0) ? false : true;
    }

    public C199451132b() {
        this.LLILZLL = "";
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132U c132uBuildPartial = buildPartial();
        if (c132uBuildPartial.isInitialized()) {
            return c132uBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132uBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132U.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJJL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132U c132uBuildPartial = buildPartial();
        if (c132uBuildPartial.isInitialized()) {
            return c132uBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132uBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132U.getDefaultInstance();
    }

    public C199451132b(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132U) {
            LJIJJLI((C132U) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIJJLI(C132U c132u) {
        if (c132u == C132U.getDefaultInstance()) {
            return;
        }
        if (c132u.hasNamePart()) {
            this.LLILZLL = c132u.namePart_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132u.hasIsExtension()) {
            this.LLIZ = c132u.getIsExtension();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        LJFF(c132u.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132U) {
            LJIJJLI((C132U) interfaceC19930912yZ);
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
                        if (iLJJIJIL != 16) {
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                break;
                            }
                        } else {
                            this.LLIZ = abstractC19927312xz.LJIILIIL();
                            this.LLILZIL |= 2;
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
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
