package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.130g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199404130g extends AbstractC19933512yz<C199404130g> implements InterfaceC199409130l {
    public int LLILZIL;
    public Object LLILZLL;
    public List<C199412130o> LLIZ;
    public C130M<C199412130o, C199413130p, InterfaceC199411130n> LLIZLLLIL;
    public List<C199412130o> LLJ;
    public C130M<C199412130o, C199413130p, InterfaceC199411130n> LLJI;
    public List<C199403130f> LLJIJIL;
    public C130M<C199403130f, C199404130g, InterfaceC199409130l> LLJILJIL;
    public List<C131C> LLJILJILJ;
    public C130M<C131C, C131D, InterfaceC199410130m> LLJILLL;
    public List<C199419130v> LLJJ;
    public C130M<C199419130v, C199420130w, InterfaceC199407130j> LLJJI;
    public List<C132P> LLJJIII;
    public C130M<C132P, C132T, InterfaceC199475132z> LLJJIJI;
    public C131P LLJJIJIIJIL;
    public C130N<C131P, C131Q, C131M> LLJJIJIL;
    public List<C132X> LLJJJ;
    public C130M<C132X, C199452132c, InterfaceC199408130k> LLJJJIL;
    public C19920612wu LLJJJJ;
    public int LLJJJJJIL;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        int i = 0;
        while (true) {
            C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m = this.LLIZLLLIL;
            if (i < (c130m == null ? this.LLIZ.size() : c130m.LJFF())) {
                C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m2 = this.LLIZLLLIL;
                if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLIZ, i) : c130m2.LJI(i)).isInitialized()) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m3 = this.LLJI;
                    if (i2 < (c130m3 == null ? this.LLJ.size() : c130m3.LJFF())) {
                        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m4 = this.LLJI;
                        if (!(c130m4 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJ, i2) : c130m4.LJI(i2)).isInitialized()) {
                            return false;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m5 = this.LLJILJIL;
                            if (i3 < (c130m5 == null ? this.LLJIJIL.size() : c130m5.LJFF())) {
                                C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m6 = this.LLJILJIL;
                                if (!(c130m6 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJIJIL, i3) : c130m6.LJI(i3)).isInitialized()) {
                                    return false;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C130M<C131C, C131D, InterfaceC199410130m> c130m7 = this.LLJILLL;
                                    if (i4 < (c130m7 == null ? this.LLJILJILJ.size() : c130m7.LJFF())) {
                                        C130M<C131C, C131D, InterfaceC199410130m> c130m8 = this.LLJILLL;
                                        if (!(c130m8 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILJILJ, i4) : c130m8.LJI(i4)).isInitialized()) {
                                            return false;
                                        }
                                        i4++;
                                    } else {
                                        int i5 = 0;
                                        while (true) {
                                            C130M<C199419130v, C199420130w, InterfaceC199407130j> c130m9 = this.LLJJI;
                                            if (i5 < (c130m9 == null ? this.LLJJ.size() : c130m9.LJFF())) {
                                                C130M<C199419130v, C199420130w, InterfaceC199407130j> c130m10 = this.LLJJI;
                                                if (!(c130m10 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJJ, i5) : c130m10.LJI(i5)).isInitialized()) {
                                                    return false;
                                                }
                                                i5++;
                                            } else {
                                                int i6 = 0;
                                                while (true) {
                                                    C130M<C132P, C132T, InterfaceC199475132z> c130m11 = this.LLJJIJI;
                                                    if (i6 >= (c130m11 == null ? this.LLJJIII.size() : c130m11.LJFF())) {
                                                        if ((this.LLILZIL & 128) != 0) {
                                                            C130N<C131P, C131Q, C131M> c130n = this.LLJJIJIL;
                                                            if (c130n == null) {
                                                                interfaceC19916512wFLIZLLL = this.LLJJIJIIJIL;
                                                                if (interfaceC19916512wFLIZLLL == null) {
                                                                    interfaceC19916512wFLIZLLL = C131P.getDefaultInstance();
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
                                                    C130M<C132P, C132T, InterfaceC199475132z> c130m12 = this.LLJJIJI;
                                                    if (!(c130m12 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJJIII, i6) : c130m12.LJI(i6)).isInitialized()) {
                                                        return false;
                                                    }
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LIZLLL;
        c19935812zM.LIZ(C199403130f.class, C199404130g.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C199403130f buildPartial() {
        int i;
        C199403130f c199403130f = new C199403130f(this);
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m = this.LLIZLLLIL;
        if (c130m == null) {
            if ((this.LLILZIL & 2) != 0) {
                this.LLIZ = Collections.unmodifiableList(this.LLIZ);
                this.LLILZIL &= -3;
            }
            c199403130f.field_ = this.LLIZ;
        } else {
            c199403130f.field_ = c130m.LIZLLL();
        }
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m2 = this.LLJI;
        if (c130m2 == null) {
            if ((this.LLILZIL & 4) != 0) {
                this.LLJ = Collections.unmodifiableList(this.LLJ);
                this.LLILZIL &= -5;
            }
            c199403130f.extension_ = this.LLJ;
        } else {
            c199403130f.extension_ = c130m2.LIZLLL();
        }
        C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m3 = this.LLJILJIL;
        if (c130m3 == null) {
            if ((this.LLILZIL & 8) != 0) {
                this.LLJIJIL = Collections.unmodifiableList(this.LLJIJIL);
                this.LLILZIL &= -9;
            }
            c199403130f.nestedType_ = this.LLJIJIL;
        } else {
            c199403130f.nestedType_ = c130m3.LIZLLL();
        }
        C130M<C131C, C131D, InterfaceC199410130m> c130m4 = this.LLJILLL;
        if (c130m4 == null) {
            if ((this.LLILZIL & 16) != 0) {
                this.LLJILJILJ = Collections.unmodifiableList(this.LLJILJILJ);
                this.LLILZIL &= -17;
            }
            c199403130f.enumType_ = this.LLJILJILJ;
        } else {
            c199403130f.enumType_ = c130m4.LIZLLL();
        }
        C130M<C199419130v, C199420130w, InterfaceC199407130j> c130m5 = this.LLJJI;
        if (c130m5 == null) {
            if ((this.LLILZIL & 32) != 0) {
                this.LLJJ = Collections.unmodifiableList(this.LLJJ);
                this.LLILZIL &= -33;
            }
            c199403130f.extensionRange_ = this.LLJJ;
        } else {
            c199403130f.extensionRange_ = c130m5.LIZLLL();
        }
        C130M<C132P, C132T, InterfaceC199475132z> c130m6 = this.LLJJIJI;
        if (c130m6 == null) {
            if ((this.LLILZIL & 64) != 0) {
                this.LLJJIII = Collections.unmodifiableList(this.LLJJIII);
                this.LLILZIL &= -65;
            }
            c199403130f.oneofDecl_ = this.LLJJIII;
        } else {
            c199403130f.oneofDecl_ = c130m6.LIZLLL();
        }
        C130M<C132X, C199452132c, InterfaceC199408130k> c130m7 = this.LLJJJIL;
        if (c130m7 == null) {
            if ((this.LLILZIL & 256) != 0) {
                this.LLJJJ = Collections.unmodifiableList(this.LLJJJ);
                this.LLILZIL &= -257;
            }
            c199403130f.reservedRange_ = this.LLJJJ;
        } else {
            c199403130f.reservedRange_ = c130m7.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199403130f.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 128) != 0) {
                C130N<C131P, C131Q, C131M> c130n = this.LLJJIJIL;
                c199403130f.options_ = c130n == null ? this.LLJJIJIIJIL : (C131P) c130n.LIZIZ();
                i |= 2;
            }
            if ((i2 & 512) != 0) {
                this.LLJJJJ.LJJLIIIJL();
                c199403130f.reservedName_ = this.LLJJJJ;
            }
            if ((i2 & 1024) != 0) {
                c199403130f.visibility_ = this.LLJJJJJIL;
                i |= 4;
            }
            c199403130f.LLILLJJLI |= i;
        }
        LJIILL();
        return c199403130f;
    }

    public final void LJIJJLI() {
        if ((this.LLILZIL & 32) == 0) {
            this.LLJJ = new ArrayList(this.LLJJ);
            this.LLILZIL |= 32;
        }
    }

    public final C130M<C131C, C131D, InterfaceC199410130m> LJIL() {
        if (this.LLJILLL == null) {
            this.LLJILLL = new C130M<>(this.LLJILJILJ, LJIIJJI(), this.LLILLL);
            this.LLJILJILJ = null;
        }
        return this.LLJILLL;
    }

    public final C130M<C199412130o, C199413130p, InterfaceC199411130n> LJJI() {
        if (this.LLJI == null) {
            this.LLJI = new C130M<>(this.LLJ, LJIIJJI(), this.LLILLL);
            this.LLJ = null;
        }
        return this.LLJI;
    }

    public final C130M<C199419130v, C199420130w, InterfaceC199407130j> LJJIFFI() {
        if (this.LLJJI == null) {
            this.LLJJI = new C130M<>(this.LLJJ, LJIIJJI(), this.LLILLL);
            this.LLJJ = null;
        }
        return this.LLJJI;
    }

    public final C130M<C199412130o, C199413130p, InterfaceC199411130n> LJJII() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C130M<>(this.LLIZ, LJIIJJI(), this.LLILLL);
            this.LLIZ = null;
        }
        return this.LLIZLLLIL;
    }

    public final C130M<C199403130f, C199404130g, InterfaceC199409130l> LJJIII() {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C130M<>(this.LLJIJIL, LJIIJJI(), this.LLILLL);
            this.LLJIJIL = null;
        }
        return this.LLJILJIL;
    }

    public final C130M<C132P, C132T, InterfaceC199475132z> LJJIIJ() {
        if (this.LLJJIJI == null) {
            this.LLJJIJI = new C130M<>(this.LLJJIII, LJIIJJI(), this.LLILLL);
            this.LLJJIII = null;
        }
        return this.LLJJIJI;
    }

    public final C130N<C131P, C131Q, C131M> LJJIIJZLJL() {
        if (this.LLJJIJIL == null) {
            C131P defaultInstance = this.LLJJIJIIJIL;
            if (defaultInstance == null) {
                defaultInstance = C131P.getDefaultInstance();
            }
            this.LLJJIJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJIJIIJIL = null;
        }
        return this.LLJJIJIL;
    }

    public final C130M<C132X, C199452132c, InterfaceC199408130k> LJJIIZ() {
        if (this.LLJJJIL == null) {
            this.LLJJJIL = new C130M<>(this.LLJJJ, LJIIJJI(), this.LLILLL);
            this.LLJJJ = null;
        }
        return this.LLJJJIL;
    }

    public final void LJJIIZI() {
        if (k0.alwaysUseFieldBuilders) {
            LJJII();
            LJJI();
            LJJIII();
            LJIL();
            LJJIFFI();
            LJJIIJ();
            LJJIIJZLJL();
            LJJIIZ();
        }
    }

    public C199404130g() {
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        this.LLJ = Collections.emptyList();
        this.LLJIJIL = Collections.emptyList();
        this.LLJILJILJ = Collections.emptyList();
        this.LLJJ = Collections.emptyList();
        this.LLJJIII = Collections.emptyList();
        this.LLJJJ = Collections.emptyList();
        this.LLJJJJ = C19920612wu.LLILLL;
        this.LLJJJJJIL = 0;
        LJJIIZI();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199403130f c199403130fBuildPartial = buildPartial();
        if (c199403130fBuildPartial.isInitialized()) {
            return c199403130fBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199403130fBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199403130f.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LIZJ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199403130f c199403130fBuildPartial = buildPartial();
        if (c199403130fBuildPartial.isInitialized()) {
            return c199403130fBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199403130fBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199403130f.getDefaultInstance();
    }

    public C199404130g(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZ = Collections.emptyList();
        this.LLJ = Collections.emptyList();
        this.LLJIJIL = Collections.emptyList();
        this.LLJILJILJ = Collections.emptyList();
        this.LLJJ = Collections.emptyList();
        this.LLJJIII = Collections.emptyList();
        this.LLJJJ = Collections.emptyList();
        this.LLJJJJ = C19920612wu.LLILLL;
        this.LLJJJJJIL = 0;
        LJJIIZI();
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJJIJIIJI(interfaceC19930912yZ);
        return this;
    }

    public final C199404130g LJJIJIIJI(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199403130f) {
            LJJIJIIJIL((C199403130f) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIJIIJIL(C199403130f c199403130f) {
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130mLJJII;
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130mLJJI;
        C130M<C199403130f, C199404130g, InterfaceC199409130l> c130mLJJIII;
        C130M<C131C, C131D, InterfaceC199410130m> c130mLJIL;
        C130M<C199419130v, C199420130w, InterfaceC199407130j> c130mLJJIFFI;
        C130M<C132P, C132T, InterfaceC199475132z> c130mLJJIIJ;
        C131P c131p;
        if (c199403130f == C199403130f.getDefaultInstance()) {
            return;
        }
        if (c199403130f.hasName()) {
            this.LLILZLL = c199403130f.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        C130M<C132X, C199452132c, InterfaceC199408130k> c130mLJJIIZ = null;
        if (this.LLIZLLLIL == null) {
            if (!c199403130f.field_.isEmpty()) {
                if (this.LLIZ.isEmpty()) {
                    this.LLIZ = c199403130f.field_;
                    this.LLILZIL &= -3;
                } else {
                    if ((this.LLILZIL & 2) == 0) {
                        this.LLIZ = new ArrayList(this.LLIZ);
                        this.LLILZIL |= 2;
                    }
                    this.LLIZ.addAll(c199403130f.field_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.field_.isEmpty()) {
            if (this.LLIZLLLIL.LJII()) {
                this.LLIZLLLIL.LIZ = null;
                this.LLIZLLLIL = null;
                this.LLIZ = c199403130f.field_;
                this.LLILZIL &= -3;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJII = LJJII();
                } else {
                    c130mLJJII = null;
                }
                this.LLIZLLLIL = c130mLJJII;
            } else {
                this.LLIZLLLIL.LIZIZ(c199403130f.field_);
            }
        }
        if (this.LLJI == null) {
            if (!c199403130f.extension_.isEmpty()) {
                if (this.LLJ.isEmpty()) {
                    this.LLJ = c199403130f.extension_;
                    this.LLILZIL &= -5;
                } else {
                    if ((this.LLILZIL & 4) == 0) {
                        this.LLJ = new ArrayList(this.LLJ);
                        this.LLILZIL |= 4;
                    }
                    this.LLJ.addAll(c199403130f.extension_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.extension_.isEmpty()) {
            if (this.LLJI.LJII()) {
                this.LLJI.LIZ = null;
                this.LLJI = null;
                this.LLJ = c199403130f.extension_;
                this.LLILZIL &= -5;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJI = LJJI();
                } else {
                    c130mLJJI = null;
                }
                this.LLJI = c130mLJJI;
            } else {
                this.LLJI.LIZIZ(c199403130f.extension_);
            }
        }
        if (this.LLJILJIL == null) {
            if (!c199403130f.nestedType_.isEmpty()) {
                if (this.LLJIJIL.isEmpty()) {
                    this.LLJIJIL = c199403130f.nestedType_;
                    this.LLILZIL &= -9;
                } else {
                    if ((this.LLILZIL & 8) == 0) {
                        this.LLJIJIL = new ArrayList(this.LLJIJIL);
                        this.LLILZIL |= 8;
                    }
                    this.LLJIJIL.addAll(c199403130f.nestedType_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.nestedType_.isEmpty()) {
            if (this.LLJILJIL.LJII()) {
                this.LLJILJIL.LIZ = null;
                this.LLJILJIL = null;
                this.LLJIJIL = c199403130f.nestedType_;
                this.LLILZIL &= -9;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIII = LJJIII();
                } else {
                    c130mLJJIII = null;
                }
                this.LLJILJIL = c130mLJJIII;
            } else {
                this.LLJILJIL.LIZIZ(c199403130f.nestedType_);
            }
        }
        if (this.LLJILLL == null) {
            if (!c199403130f.enumType_.isEmpty()) {
                if (this.LLJILJILJ.isEmpty()) {
                    this.LLJILJILJ = c199403130f.enumType_;
                    this.LLILZIL &= -17;
                } else {
                    if ((this.LLILZIL & 16) == 0) {
                        this.LLJILJILJ = new ArrayList(this.LLJILJILJ);
                        this.LLILZIL |= 16;
                    }
                    this.LLJILJILJ.addAll(c199403130f.enumType_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.enumType_.isEmpty()) {
            if (this.LLJILLL.LJII()) {
                this.LLJILLL.LIZ = null;
                this.LLJILLL = null;
                this.LLJILJILJ = c199403130f.enumType_;
                this.LLILZIL &= -17;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJIL = LJIL();
                } else {
                    c130mLJIL = null;
                }
                this.LLJILLL = c130mLJIL;
            } else {
                this.LLJILLL.LIZIZ(c199403130f.enumType_);
            }
        }
        if (this.LLJJI == null) {
            if (!c199403130f.extensionRange_.isEmpty()) {
                if (this.LLJJ.isEmpty()) {
                    this.LLJJ = c199403130f.extensionRange_;
                    this.LLILZIL &= -33;
                } else {
                    LJIJJLI();
                    this.LLJJ.addAll(c199403130f.extensionRange_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.extensionRange_.isEmpty()) {
            if (this.LLJJI.LJII()) {
                this.LLJJI.LIZ = null;
                this.LLJJI = null;
                this.LLJJ = c199403130f.extensionRange_;
                this.LLILZIL &= -33;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIFFI = LJJIFFI();
                } else {
                    c130mLJJIFFI = null;
                }
                this.LLJJI = c130mLJJIFFI;
            } else {
                this.LLJJI.LIZIZ(c199403130f.extensionRange_);
            }
        }
        if (this.LLJJIJI == null) {
            if (!c199403130f.oneofDecl_.isEmpty()) {
                if (this.LLJJIII.isEmpty()) {
                    this.LLJJIII = c199403130f.oneofDecl_;
                    this.LLILZIL &= -65;
                } else {
                    if ((this.LLILZIL & 64) == 0) {
                        this.LLJJIII = new ArrayList(this.LLJJIII);
                        this.LLILZIL |= 64;
                    }
                    this.LLJJIII.addAll(c199403130f.oneofDecl_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.oneofDecl_.isEmpty()) {
            if (this.LLJJIJI.LJII()) {
                this.LLJJIJI.LIZ = null;
                this.LLJJIJI = null;
                this.LLJJIII = c199403130f.oneofDecl_;
                this.LLILZIL &= -65;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                } else {
                    c130mLJJIIJ = null;
                }
                this.LLJJIJI = c130mLJJIIJ;
            } else {
                this.LLJJIJI.LIZIZ(c199403130f.oneofDecl_);
            }
        }
        if (c199403130f.hasOptions()) {
            C131P options = c199403130f.getOptions();
            C130N<C131P, C131Q, C131M> c130n = this.LLJJIJIL;
            if (c130n == null) {
                if ((this.LLILZIL & 128) != 0 && (c131p = this.LLJJIJIIJIL) != null && c131p != C131P.getDefaultInstance()) {
                    this.LLILZIL |= 128;
                    LJIILLIIL();
                    ((C131Q) LJJIIJZLJL().LIZJ()).LJJIIJZLJL(options);
                } else {
                    this.LLJJIJIIJIL = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLJJIJIIJIL != null) {
                this.LLILZIL |= 128;
                LJIILLIIL();
            }
        }
        if (this.LLJJJIL == null) {
            if (!c199403130f.reservedRange_.isEmpty()) {
                if (this.LLJJJ.isEmpty()) {
                    this.LLJJJ = c199403130f.reservedRange_;
                    this.LLILZIL &= -257;
                } else {
                    if ((this.LLILZIL & 256) == 0) {
                        this.LLJJJ = new ArrayList(this.LLJJJ);
                        this.LLILZIL |= 256;
                    }
                    this.LLJJJ.addAll(c199403130f.reservedRange_);
                }
                LJIILLIIL();
            }
        } else if (!c199403130f.reservedRange_.isEmpty()) {
            if (this.LLJJJIL.LJII()) {
                this.LLJJJIL.LIZ = null;
                this.LLJJJIL = null;
                this.LLJJJ = c199403130f.reservedRange_;
                this.LLILZIL &= -257;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIZ = LJJIIZ();
                }
                this.LLJJJIL = c130mLJJIIZ;
            } else {
                this.LLJJJIL.LIZIZ(c199403130f.reservedRange_);
            }
        }
        if (!c199403130f.reservedName_.isEmpty()) {
            if (this.LLJJJJ.isEmpty()) {
                this.LLJJJJ = c199403130f.reservedName_;
                this.LLILZIL |= 512;
            } else {
                if (!this.LLJJJJ.LL) {
                    this.LLJJJJ = new C19920612wu(this.LLJJJJ);
                }
                this.LLILZIL |= 512;
                this.LLJJJJ.addAll(c199403130f.reservedName_);
            }
            LJIILLIIL();
        }
        if (c199403130f.hasVisibility()) {
            EnumC199405130h visibility = c199403130f.getVisibility();
            visibility.getClass();
            this.LLILZIL |= 1024;
            this.LLJJJJJIL = visibility.getNumber();
            LJIILLIIL();
        }
        LJFF(c199403130f.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final /* bridge */ /* synthetic */ InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        LJJIJIIJI(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJ(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final C199404130g LJJIJ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    switch (iLJJIJIL) {
                        case 0:
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            this.LLILZLL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 1;
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            C199412130o c199412130o = (C199412130o) abstractC19927312xz.LJJ(C199412130o.parser(), c19926312xp);
                            C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m = this.LLIZLLLIL;
                            if (c130m == null) {
                                if ((this.LLILZIL & 2) == 0) {
                                    this.LLIZ = new ArrayList(this.LLIZ);
                                    this.LLILZIL |= 2;
                                }
                                this.LLIZ.add(c199412130o);
                            } else {
                                c130m.LIZJ(c199412130o);
                            }
                            break;
                        case 26:
                            C199403130f c199403130f = (C199403130f) abstractC19927312xz.LJJ(C199403130f.parser(), c19926312xp);
                            C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m2 = this.LLJILJIL;
                            if (c130m2 == null) {
                                if ((this.LLILZIL & 8) == 0) {
                                    this.LLJIJIL = new ArrayList(this.LLJIJIL);
                                    this.LLILZIL |= 8;
                                }
                                this.LLJIJIL.add(c199403130f);
                            } else {
                                c130m2.LIZJ(c199403130f);
                            }
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            C131C c131c = (C131C) abstractC19927312xz.LJJ(C131C.parser(), c19926312xp);
                            C130M<C131C, C131D, InterfaceC199410130m> c130m3 = this.LLJILLL;
                            if (c130m3 == null) {
                                if ((this.LLILZIL & 16) == 0) {
                                    this.LLJILJILJ = new ArrayList(this.LLJILJILJ);
                                    this.LLILZIL |= 16;
                                }
                                this.LLJILJILJ.add(c131c);
                            } else {
                                c130m3.LIZJ(c131c);
                            }
                            break;
                        case 42:
                            C199419130v c199419130v = (C199419130v) abstractC19927312xz.LJJ(C199419130v.parser(), c19926312xp);
                            C130M<C199419130v, C199420130w, InterfaceC199407130j> c130m4 = this.LLJJI;
                            if (c130m4 == null) {
                                LJIJJLI();
                                this.LLJJ.add(c199419130v);
                            } else {
                                c130m4.LIZJ(c199419130v);
                            }
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            C199412130o c199412130o2 = (C199412130o) abstractC19927312xz.LJJ(C199412130o.parser(), c19926312xp);
                            C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m5 = this.LLJI;
                            if (c130m5 == null) {
                                if ((this.LLILZIL & 4) == 0) {
                                    this.LLJ = new ArrayList(this.LLJ);
                                    this.LLILZIL |= 4;
                                }
                                this.LLJ.add(c199412130o2);
                            } else {
                                c130m5.LIZJ(c199412130o2);
                            }
                            break;
                        case 58:
                            abstractC19927312xz.LJJI(LJJIIJZLJL().LIZJ(), c19926312xp);
                            this.LLILZIL |= 128;
                            break;
                        case 66:
                            C132P c132p = (C132P) abstractC19927312xz.LJJ(C132P.parser(), c19926312xp);
                            C130M<C132P, C132T, InterfaceC199475132z> c130m6 = this.LLJJIJI;
                            if (c130m6 == null) {
                                if ((this.LLILZIL & 64) == 0) {
                                    this.LLJJIII = new ArrayList(this.LLJJIII);
                                    this.LLILZIL |= 64;
                                }
                                this.LLJJIII.add(c132p);
                            } else {
                                c130m6.LIZJ(c132p);
                            }
                            break;
                        case 74:
                            C132X c132x = (C132X) abstractC19927312xz.LJJ(C132X.parser(), c19926312xp);
                            C130M<C132X, C199452132c, InterfaceC199408130k> c130m7 = this.LLJJJIL;
                            if (c130m7 == null) {
                                if ((this.LLILZIL & 256) == 0) {
                                    this.LLJJJ = new ArrayList(this.LLJJJ);
                                    this.LLILZIL |= 256;
                                }
                                this.LLJJJ.add(c132x);
                            } else {
                                c130m7.LIZJ(c132x);
                            }
                            break;
                        case 82:
                            AbstractC19922812xG abstractC19922812xGLJIILJJIL = abstractC19927312xz.LJIILJJIL();
                            if (!this.LLJJJJ.LL) {
                                this.LLJJJJ = new C19920612wu(this.LLJJJJ);
                            }
                            this.LLILZIL |= 512;
                            this.LLJJJJ.LJL(abstractC19922812xGLJIILJJIL);
                            break;
                        case 88:
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199405130h.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(11, iLJIILLIIL);
                            } else {
                                this.LLJJJJJIL = iLJIILLIIL;
                                this.LLILZIL |= 1024;
                            }
                            break;
                        default:
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                            }
                            break;
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
        LJJIJ(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJ(abstractC19927312xz, c19926312xp);
        return this;
    }
}
