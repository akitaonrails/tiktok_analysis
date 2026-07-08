package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.131m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199436131m extends AbstractC19933312yx<C199437131n, C199436131m> implements AnonymousClass1326 {
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJJJZ;
        c19935812zM.LIZ(C199437131n.class, C199436131m.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJIII, reason: merged with bridge method [inline-methods] */
    public final C199437131n buildPartial() {
        int i;
        C199437131n c199437131n = new C199437131n(this);
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199437131n.fieldPresence_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c199437131n.enumType_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c199437131n.repeatedFieldEncoding_ = this.LLJ;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c199437131n.utf8Validation_ = this.LLJI;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c199437131n.messageEncoding_ = this.LLJIJIL;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c199437131n.jsonFormat_ = this.LLJILJIL;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c199437131n.enforceNamingStyle_ = this.LLJILJILJ;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c199437131n.defaultSymbolVisibility_ = this.LLJILLL;
                i |= 128;
            }
            c199437131n.LLILLJJLI |= i;
        }
        LJIILL();
        return c199437131n;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C199437131n build() {
        C199437131n c199437131nBuildPartial = buildPartial();
        if (c199437131nBuildPartial.isInitialized()) {
            return c199437131nBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199437131nBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199437131n.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return LJIJJLI();
    }

    public C199436131m() {
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJJJLL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199437131n.getDefaultInstance();
    }

    public C199436131m(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199437131n) {
            LJJIIJ((C199437131n) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final C199436131m LJJIIJ(C199437131n c199437131n) {
        if (c199437131n == C199437131n.getDefaultInstance()) {
            return this;
        }
        if (c199437131n.hasFieldPresence()) {
            C130Z fieldPresence = c199437131n.getFieldPresence();
            fieldPresence.getClass();
            this.LLILZLL |= 1;
            this.LLIZ = fieldPresence.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasEnumType()) {
            EnumC199438131o enumType = c199437131n.getEnumType();
            enumType.getClass();
            this.LLILZLL |= 2;
            this.LLIZLLLIL = enumType.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasRepeatedFieldEncoding()) {
            LJJIIZ(c199437131n.getRepeatedFieldEncoding());
        }
        if (c199437131n.hasUtf8Validation()) {
            C130X utf8Validation = c199437131n.getUtf8Validation();
            utf8Validation.getClass();
            this.LLILZLL |= 8;
            this.LLJI = utf8Validation.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasMessageEncoding()) {
            EnumC199399130b messageEncoding = c199437131n.getMessageEncoding();
            messageEncoding.getClass();
            this.LLILZLL |= 16;
            this.LLJIJIL = messageEncoding.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasJsonFormat()) {
            EnumC199440131q jsonFormat = c199437131n.getJsonFormat();
            jsonFormat.getClass();
            this.LLILZLL |= 32;
            this.LLJILJIL = jsonFormat.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasEnforceNamingStyle()) {
            EnumC199439131p enforceNamingStyle = c199437131n.getEnforceNamingStyle();
            enforceNamingStyle.getClass();
            this.LLILZLL |= 64;
            this.LLJILJILJ = enforceNamingStyle.getNumber();
            LJIILLIIL();
        }
        if (c199437131n.hasDefaultSymbolVisibility()) {
            EnumC199441131r defaultSymbolVisibility = c199437131n.getDefaultSymbolVisibility();
            defaultSymbolVisibility.getClass();
            this.LLILZLL |= 128;
            this.LLJILLL = defaultSymbolVisibility.getNumber();
            LJIILLIIL();
        }
        LJIL(c199437131n);
        LJFF(c199437131n.getUnknownFields());
        LJIILLIIL();
        return this;
    }

    public final void LJJIIZ(C131R c131r) {
        c131r.getClass();
        this.LLILZLL |= 4;
        this.LLJ = c131r.getNumber();
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199437131n) {
            LJJIIJ((C199437131n) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIIJZLJL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                                        if (iLJJIJIL != 48) {
                                            if (iLJJIJIL != 56) {
                                                if (iLJJIJIL != 64) {
                                                    if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                                                        break;
                                                    }
                                                } else {
                                                    int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                                                    if (EnumC199441131r.forNumber(iLJIILLIIL) == null) {
                                                        LJIILJJIL(8, iLJIILLIIL);
                                                    } else {
                                                        this.LLJILLL = iLJIILLIIL;
                                                        this.LLILZLL |= 128;
                                                    }
                                                }
                                            } else {
                                                int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                                                if (EnumC199439131p.forNumber(iLJIILLIIL2) == null) {
                                                    LJIILJJIL(7, iLJIILLIIL2);
                                                } else {
                                                    this.LLJILJILJ = iLJIILLIIL2;
                                                    this.LLILZLL |= 64;
                                                }
                                            }
                                        } else {
                                            int iLJIILLIIL3 = abstractC19927312xz.LJIILLIIL();
                                            if (EnumC199440131q.forNumber(iLJIILLIIL3) == null) {
                                                LJIILJJIL(6, iLJIILLIIL3);
                                            } else {
                                                this.LLJILJIL = iLJIILLIIL3;
                                                this.LLILZLL |= 32;
                                            }
                                        }
                                    } else {
                                        int iLJIILLIIL4 = abstractC19927312xz.LJIILLIIL();
                                        if (EnumC199399130b.forNumber(iLJIILLIIL4) == null) {
                                            LJIILJJIL(5, iLJIILLIIL4);
                                        } else {
                                            this.LLJIJIL = iLJIILLIIL4;
                                            this.LLILZLL |= 16;
                                        }
                                    }
                                } else {
                                    int iLJIILLIIL5 = abstractC19927312xz.LJIILLIIL();
                                    if (C130X.forNumber(iLJIILLIIL5) == null) {
                                        LJIILJJIL(4, iLJIILLIIL5);
                                    } else {
                                        this.LLJI = iLJIILLIIL5;
                                        this.LLILZLL |= 8;
                                    }
                                }
                            } else {
                                int iLJIILLIIL6 = abstractC19927312xz.LJIILLIIL();
                                if (C131R.forNumber(iLJIILLIIL6) == null) {
                                    LJIILJJIL(3, iLJIILLIIL6);
                                } else {
                                    this.LLJ = iLJIILLIIL6;
                                    this.LLILZLL |= 4;
                                }
                            }
                        } else {
                            int iLJIILLIIL7 = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199438131o.forNumber(iLJIILLIIL7) == null) {
                                LJIILJJIL(2, iLJIILLIIL7);
                            } else {
                                this.LLIZLLLIL = iLJIILLIIL7;
                                this.LLILZLL |= 2;
                            }
                        }
                    } else {
                        int iLJIILLIIL8 = abstractC19927312xz.LJIILLIIL();
                        if (C130Z.forNumber(iLJIILLIIL8) == null) {
                            LJIILJJIL(1, iLJIILLIIL8);
                        } else {
                            this.LLIZ = iLJIILLIIL8;
                            this.LLILZLL |= 1;
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
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIJZLJL(abstractC19927312xz, c19926312xp);
        return this;
    }
}
