package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;

/* JADX INFO: renamed from: X.130w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199420130w extends AbstractC19933512yz<C199420130w> implements InterfaceC199407130j {
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public C199449131z LLIZLLLIL;
    public C130N<C199449131z, AnonymousClass1320, InterfaceC199421130x> LLJ;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJFF;
        c19935812zM.LIZ(C199419130v.class, C199420130w.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C199419130v buildPartial() {
        int i;
        C199419130v c199419130v = new C199419130v(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199419130v.start_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c199419130v.end_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C130N<C199449131z, AnonymousClass1320, InterfaceC199421130x> c130n = this.LLJ;
                c199419130v.options_ = c130n == null ? this.LLIZLLLIL : (C199449131z) c130n.LIZIZ();
                i |= 4;
            }
            c199419130v.LLILLJJLI |= i;
        }
        LJIILL();
        return c199419130v;
    }

    public final C130N<C199449131z, AnonymousClass1320, InterfaceC199421130x> LJIJJLI() {
        if (this.LLJ == null) {
            C199449131z defaultInstance = this.LLIZLLLIL;
            if (defaultInstance == null) {
                defaultInstance = C199449131z.getDefaultInstance();
            }
            this.LLJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLIZLLLIL = null;
        }
        return this.LLJ;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZIL & 4) != 0) {
            C130N<C199449131z, AnonymousClass1320, InterfaceC199421130x> c130n = this.LLJ;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLIZLLLIL;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C199449131z.getDefaultInstance();
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

    public C199420130w() {
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199419130v c199419130vBuildPartial = buildPartial();
        if (c199419130vBuildPartial.isInitialized()) {
            return c199419130vBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199419130vBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199419130v.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199419130v c199419130vBuildPartial = buildPartial();
        if (c199419130vBuildPartial.isInitialized()) {
            return c199419130vBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199419130vBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199419130v.getDefaultInstance();
    }

    public C199420130w(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJJI(interfaceC19930912yZ);
        return this;
    }

    public final C199420130w LJJI(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199419130v) {
            LJJIFFI((C199419130v) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIFFI(C199419130v c199419130v) {
        C199449131z c199449131z;
        if (c199419130v == C199419130v.getDefaultInstance()) {
            return;
        }
        if (c199419130v.hasStart()) {
            this.LLILZLL = c199419130v.getStart();
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c199419130v.hasEnd()) {
            this.LLIZ = c199419130v.getEnd();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c199419130v.hasOptions()) {
            C199449131z options = c199419130v.getOptions();
            C130N<C199449131z, AnonymousClass1320, InterfaceC199421130x> c130n = this.LLJ;
            if (c130n == null) {
                if ((this.LLILZIL & 4) != 0 && (c199449131z = this.LLIZLLLIL) != null && c199449131z != C199449131z.getDefaultInstance()) {
                    this.LLILZIL |= 4;
                    LJIILLIIL();
                    ((AnonymousClass1320) LJIJJLI().LIZJ()).LJJIIZI(options);
                } else {
                    this.LLIZLLLIL = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLIZLLLIL != null) {
                this.LLILZIL |= 4;
                LJIILLIIL();
            }
        }
        LJFF(c199419130v.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final /* bridge */ /* synthetic */ InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJJI(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final C199420130w LJIL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                            if (iLJJIJIL != 26) {
                                if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                    break;
                                }
                            } else {
                                abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                                this.LLILZIL |= 4;
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
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJIL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
