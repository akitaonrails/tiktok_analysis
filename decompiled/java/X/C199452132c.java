package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.132c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199452132c extends AbstractC19933512yz<C199452132c> implements InterfaceC199408130k {
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJII;
        c19935812zM.LIZ(C132X.class, C199452132c.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C132X buildPartial() {
        int i;
        C132X c132x = new C132X(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132x.start_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132x.end_ = this.LLIZ;
                i |= 2;
            }
            c132x.LLILLJJLI |= i;
        }
        LJIILL();
        return c132x;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132X c132xBuildPartial = buildPartial();
        if (c132xBuildPartial.isInitialized()) {
            return c132xBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132xBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132X.getDefaultInstance();
    }

    public C199452132c() {
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJI;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132X c132xBuildPartial = buildPartial();
        if (c132xBuildPartial.isInitialized()) {
            return c132xBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132xBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132X.getDefaultInstance();
    }

    public C199452132c(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132X) {
            LJIL((C132X) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIL(C132X c132x) {
        if (c132x == C132X.getDefaultInstance()) {
            return;
        }
        if (c132x.hasStart()) {
            this.LLILZLL = c132x.getStart();
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c132x.hasEnd()) {
            this.LLIZ = c132x.getEnd();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        LJFF(c132x.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132X) {
            LJIL((C132X) interfaceC19930912yZ);
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

    public final C199452132c LJIJJLI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        if (c19926312xp == null) {
            throw null;
        }
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
        return this;
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
