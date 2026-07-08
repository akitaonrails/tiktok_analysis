package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.132d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199453132d extends AbstractC19933512yz<C199453132d> implements C131G {
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIJI;
        c19935812zM.LIZ(C132Y.class, C199453132d.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132Y buildPartial() {
        int i;
        C132Y c132y = new C132Y(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132y.start_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132y.end_ = this.LLIZ;
                i |= 2;
            }
            c132y.LLILLJJLI |= i;
        }
        LJIILL();
        return c132y;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132Y c132yBuildPartial = buildPartial();
        if (c132yBuildPartial.isInitialized()) {
            return c132yBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132yBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132Y.getDefaultInstance();
    }

    public C199453132d() {
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132Y c132yBuildPartial = buildPartial();
        if (c132yBuildPartial.isInitialized()) {
            return c132yBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132yBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132Y.getDefaultInstance();
    }

    public C199453132d(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132Y) {
            LJIL((C132Y) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIL(C132Y c132y) {
        if (c132y == C132Y.getDefaultInstance()) {
            return;
        }
        if (c132y.hasStart()) {
            this.LLILZLL = c132y.getStart();
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132y.hasEnd()) {
            this.LLIZ = c132y.getEnd();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        LJFF(c132y.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132Y) {
            LJIL((C132Y) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIJJLI(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJIJJLI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                break;
                            }
                        } else {
                            this.LLIZ = abstractC19927312xz.LJIJJLI();
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
        LJIJJLI(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIJJLI(abstractC19927312xz, c19926312xp);
        return this;
    }
}
