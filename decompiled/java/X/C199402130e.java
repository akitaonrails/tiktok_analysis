package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.130e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199402130e extends AbstractC19933512yz<C199402130e> implements InterfaceC19933112yv {
    public int LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public C19920612wu LLIZLLLIL;
    public InterfaceC19922412xC LLJ;
    public InterfaceC19922412xC LLJI;
    public C19920612wu LLJIJIL;
    public List<C199403130f> LLJILJIL;
    public C130M<C199403130f, C199404130g, InterfaceC199409130l> LLJILJILJ;
    public List<C131C> LLJILLL;
    public C130M<C131C, C131D, InterfaceC199410130m> LLJJ;
    public List<C132I> LLJJI;
    public C130M<C132I, C132H, AnonymousClass1330> LLJJIII;
    public List<C199412130o> LLJJIJI;
    public C130M<C199412130o, C199413130p, InterfaceC199411130n> LLJJIJIIJIL;
    public C132E LLJJIJIL;
    public C130N<C132E, C132F, C131N> LLJJJ;
    public AnonymousClass1315 LLJJJIL;
    public C130N<AnonymousClass1315, AnonymousClass1314, InterfaceC199417130t> LLJJJJ;
    public Object LLJJJJJIL;
    public int LLJJJJLIIL;

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        InterfaceC19916512wF interfaceC19916512wFLIZLLL2;
        int i = 0;
        while (true) {
            C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m = this.LLJILJILJ;
            if (i < (c130m == null ? this.LLJILJIL.size() : c130m.LJFF())) {
                C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m2 = this.LLJILJILJ;
                if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILJIL, i) : c130m2.LJI(i)).isInitialized()) {
                    return false;
                }
                i++;
            } else {
                int i2 = 0;
                while (true) {
                    C130M<C131C, C131D, InterfaceC199410130m> c130m3 = this.LLJJ;
                    if (i2 < (c130m3 == null ? this.LLJILLL.size() : c130m3.LJFF())) {
                        C130M<C131C, C131D, InterfaceC199410130m> c130m4 = this.LLJJ;
                        if (!(c130m4 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJILLL, i2) : c130m4.LJI(i2)).isInitialized()) {
                            return false;
                        }
                        i2++;
                    } else {
                        int i3 = 0;
                        while (true) {
                            C130M<C132I, C132H, AnonymousClass1330> c130m5 = this.LLJJIII;
                            if (i3 < (c130m5 == null ? this.LLJJI.size() : c130m5.LJFF())) {
                                C130M<C132I, C132H, AnonymousClass1330> c130m6 = this.LLJJIII;
                                if (!(c130m6 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJJI, i3) : c130m6.LJI(i3)).isInitialized()) {
                                    return false;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m7 = this.LLJJIJIIJIL;
                                    if (i4 >= (c130m7 == null ? this.LLJJIJI.size() : c130m7.LJFF())) {
                                        if ((this.LLILZIL & 1024) != 0) {
                                            C130N<C132E, C132F, C131N> c130n = this.LLJJJ;
                                            if (c130n == null) {
                                                interfaceC19916512wFLIZLLL2 = this.LLJJIJIL;
                                                if (interfaceC19916512wFLIZLLL2 == null) {
                                                    interfaceC19916512wFLIZLLL2 = C132E.getDefaultInstance();
                                                }
                                            } else {
                                                interfaceC19916512wFLIZLLL2 = c130n.LIZLLL();
                                            }
                                            if (!interfaceC19916512wFLIZLLL2.isInitialized()) {
                                                return false;
                                            }
                                        }
                                        if ((this.LLILZIL & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                                            C130N<AnonymousClass1315, AnonymousClass1314, InterfaceC199417130t> c130n2 = this.LLJJJJ;
                                            if (c130n2 == null) {
                                                interfaceC19916512wFLIZLLL = this.LLJJJIL;
                                                if (interfaceC19916512wFLIZLLL == null) {
                                                    interfaceC19916512wFLIZLLL = AnonymousClass1315.getDefaultInstance();
                                                }
                                            } else {
                                                interfaceC19916512wFLIZLLL = c130n2.LIZLLL();
                                            }
                                            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                    C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m8 = this.LLJJIJIIJIL;
                                    if (!(c130m8 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJJIJI, i4) : c130m8.LJI(i4)).isInitialized()) {
                                        return false;
                                    }
                                    i4++;
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
        C19935812zM c19935812zM = C131K.LIZIZ;
        c19935812zM.LIZ(C199401130d.class, C199402130e.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C199401130d buildPartial() {
        int i;
        C199401130d c199401130d = new C199401130d(this);
        C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m = this.LLJILJILJ;
        if (c130m == null) {
            if ((this.LLILZIL & 64) != 0) {
                this.LLJILJIL = Collections.unmodifiableList(this.LLJILJIL);
                this.LLILZIL &= -65;
            }
            c199401130d.messageType_ = this.LLJILJIL;
        } else {
            c199401130d.messageType_ = c130m.LIZLLL();
        }
        C130M<C131C, C131D, InterfaceC199410130m> c130m2 = this.LLJJ;
        if (c130m2 == null) {
            if ((this.LLILZIL & 128) != 0) {
                this.LLJILLL = Collections.unmodifiableList(this.LLJILLL);
                this.LLILZIL &= -129;
            }
            c199401130d.enumType_ = this.LLJILLL;
        } else {
            c199401130d.enumType_ = c130m2.LIZLLL();
        }
        C130M<C132I, C132H, AnonymousClass1330> c130m3 = this.LLJJIII;
        if (c130m3 == null) {
            if ((this.LLILZIL & 256) != 0) {
                this.LLJJI = Collections.unmodifiableList(this.LLJJI);
                this.LLILZIL &= -257;
            }
            c199401130d.service_ = this.LLJJI;
        } else {
            c199401130d.service_ = c130m3.LIZLLL();
        }
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m4 = this.LLJJIJIIJIL;
        if (c130m4 == null) {
            if ((this.LLILZIL & 512) != 0) {
                this.LLJJIJI = Collections.unmodifiableList(this.LLJJIJI);
                this.LLILZIL &= -513;
            }
            c199401130d.extension_ = this.LLJJIJI;
        } else {
            c199401130d.extension_ = c130m4.LIZLLL();
        }
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199401130d.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c199401130d.package_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                this.LLIZLLLIL.LJJLIIIJL();
                c199401130d.dependency_ = this.LLIZLLLIL;
            }
            if ((i2 & 8) != 0) {
                this.LLJ.LJJLIIIJL();
                c199401130d.publicDependency_ = this.LLJ;
            }
            if ((i2 & 16) != 0) {
                this.LLJI.LJJLIIIJL();
                c199401130d.weakDependency_ = this.LLJI;
            }
            if ((i2 & 32) != 0) {
                this.LLJIJIL.LJJLIIIJL();
                c199401130d.optionDependency_ = this.LLJIJIL;
            }
            if ((i2 & 1024) != 0) {
                C130N<C132E, C132F, C131N> c130n = this.LLJJJ;
                c199401130d.options_ = c130n == null ? this.LLJJIJIL : (C132E) c130n.LIZIZ();
                i |= 4;
            }
            if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                C130N<AnonymousClass1315, AnonymousClass1314, InterfaceC199417130t> c130n2 = this.LLJJJJ;
                c199401130d.sourceCodeInfo_ = c130n2 == null ? this.LLJJJIL : (AnonymousClass1315) c130n2.LIZIZ();
                i |= 8;
            }
            if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                c199401130d.syntax_ = this.LLJJJJJIL;
                i |= 16;
            }
            if ((i2 & 8192) != 0) {
                c199401130d.edition_ = this.LLJJJJLIIL;
                i |= 32;
            }
            c199401130d.LLILLJJLI |= i;
        }
        LJIILL();
        return c199401130d;
    }

    public final void LJIJJLI() {
        if ((this.LLILZIL & 64) == 0) {
            this.LLJILJIL = new ArrayList(this.LLJILJIL);
            this.LLILZIL |= 64;
        }
    }

    public final void LJIL() {
        if (!this.LLJ.LJJLIL()) {
            this.LLJ = (InterfaceC19922412xC) k0.LJII(this.LLJ);
        }
        this.LLILZIL |= 8;
    }

    public final void LJJI() {
        if (!this.LLJI.LJJLIL()) {
            this.LLJI = (InterfaceC19922412xC) k0.LJII(this.LLJI);
        }
        this.LLILZIL |= 16;
    }

    public final C130M<C131C, C131D, InterfaceC199410130m> LJJIFFI() {
        if (this.LLJJ == null) {
            this.LLJJ = new C130M<>(this.LLJILLL, LJIIJJI(), this.LLILLL);
            this.LLJILLL = null;
        }
        return this.LLJJ;
    }

    public final C130M<C199412130o, C199413130p, InterfaceC199411130n> LJJII() {
        if (this.LLJJIJIIJIL == null) {
            this.LLJJIJIIJIL = new C130M<>(this.LLJJIJI, LJIIJJI(), this.LLILLL);
            this.LLJJIJI = null;
        }
        return this.LLJJIJIIJIL;
    }

    public final C130M<C199403130f, C199404130g, InterfaceC199409130l> LJJIII() {
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new C130M<>(this.LLJILJIL, LJIIJJI(), this.LLILLL);
            this.LLJILJIL = null;
        }
        return this.LLJILJILJ;
    }

    public final C130N<C132E, C132F, C131N> LJJIIJ() {
        if (this.LLJJJ == null) {
            C132E defaultInstance = this.LLJJIJIL;
            if (defaultInstance == null) {
                defaultInstance = C132E.getDefaultInstance();
            }
            this.LLJJJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJIJIL = null;
        }
        return this.LLJJJ;
    }

    public final C130M<C132I, C132H, AnonymousClass1330> LJJIIJZLJL() {
        if (this.LLJJIII == null) {
            this.LLJJIII = new C130M<>(this.LLJJI, LJIIJJI(), this.LLILLL);
            this.LLJJI = null;
        }
        return this.LLJJIII;
    }

    public final C130N<AnonymousClass1315, AnonymousClass1314, InterfaceC199417130t> LJJIIZ() {
        if (this.LLJJJJ == null) {
            AnonymousClass1315 defaultInstance = this.LLJJJIL;
            if (defaultInstance == null) {
                defaultInstance = AnonymousClass1315.getDefaultInstance();
            }
            this.LLJJJJ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJJIL = null;
        }
        return this.LLJJJJ;
    }

    public C199402130e() {
        this.LLILZLL = "";
        this.LLIZ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.LLIZLLLIL = c19920612wu;
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.LLJ = c19889012ro;
        this.LLJI = c19889012ro;
        this.LLJIJIL = c19920612wu;
        this.LLJILJIL = Collections.emptyList();
        this.LLJILLL = Collections.emptyList();
        this.LLJJI = Collections.emptyList();
        this.LLJJIJI = Collections.emptyList();
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = 0;
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIFFI();
            LJJIIJZLJL();
            LJJII();
            LJJIIJ();
            LJJIIZ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199401130d c199401130dBuildPartial = buildPartial();
        if (c199401130dBuildPartial.isInitialized()) {
            return c199401130dBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199401130dBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199401130d.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LIZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199401130d c199401130dBuildPartial = buildPartial();
        if (c199401130dBuildPartial.isInitialized()) {
            return c199401130dBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199401130dBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199401130d.getDefaultInstance();
    }

    public C199402130e(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZ = "";
        C19920612wu c19920612wu = C19920612wu.LLILLL;
        this.LLIZLLLIL = c19920612wu;
        C19889012ro c19889012ro = C19889012ro.LLILZIL;
        this.LLJ = c19889012ro;
        this.LLJI = c19889012ro;
        this.LLJIJIL = c19920612wu;
        this.LLJILJIL = Collections.emptyList();
        this.LLJILLL = Collections.emptyList();
        this.LLJJI = Collections.emptyList();
        this.LLJJIJI = Collections.emptyList();
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = 0;
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIFFI();
            LJJIIJZLJL();
            LJJII();
            LJJIIJ();
            LJJIIZ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199401130d) {
            LJJIIZI((C199401130d) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIZI(C199401130d c199401130d) {
        C130M<C199403130f, C199404130g, InterfaceC199409130l> c130mLJJIII;
        C130M<C131C, C131D, InterfaceC199410130m> c130mLJJIFFI;
        C130M<C132I, C132H, AnonymousClass1330> c130mLJJIIJZLJL;
        AnonymousClass1315 anonymousClass1315;
        C132E c132e;
        if (c199401130d == C199401130d.getDefaultInstance()) {
            return;
        }
        if (c199401130d.hasName()) {
            this.LLILZLL = c199401130d.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c199401130d.hasPackage()) {
            this.LLIZ = c199401130d.package_;
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (!c199401130d.dependency_.isEmpty()) {
            if (this.LLIZLLLIL.isEmpty()) {
                this.LLIZLLLIL = c199401130d.dependency_;
                this.LLILZIL |= 4;
            } else {
                if (!this.LLIZLLLIL.LL) {
                    this.LLIZLLLIL = new C19920612wu(this.LLIZLLLIL);
                }
                this.LLILZIL |= 4;
                this.LLIZLLLIL.addAll(c199401130d.dependency_);
            }
            LJIILLIIL();
        }
        if (!c199401130d.publicDependency_.isEmpty()) {
            if (this.LLJ.isEmpty()) {
                InterfaceC19922412xC interfaceC19922412xC = c199401130d.publicDependency_;
                this.LLJ = interfaceC19922412xC;
                interfaceC19922412xC.LJJLIIIJL();
                this.LLILZIL |= 8;
            } else {
                LJIL();
                this.LLJ.addAll(c199401130d.publicDependency_);
            }
            LJIILLIIL();
        }
        if (!c199401130d.weakDependency_.isEmpty()) {
            if (this.LLJI.isEmpty()) {
                InterfaceC19922412xC interfaceC19922412xC2 = c199401130d.weakDependency_;
                this.LLJI = interfaceC19922412xC2;
                interfaceC19922412xC2.LJJLIIIJL();
                this.LLILZIL |= 16;
            } else {
                LJJI();
                this.LLJI.addAll(c199401130d.weakDependency_);
            }
            LJIILLIIL();
        }
        if (!c199401130d.optionDependency_.isEmpty()) {
            if (this.LLJIJIL.isEmpty()) {
                this.LLJIJIL = c199401130d.optionDependency_;
                this.LLILZIL |= 32;
            } else {
                if (!this.LLJIJIL.LL) {
                    this.LLJIJIL = new C19920612wu(this.LLJIJIL);
                }
                this.LLILZIL |= 32;
                this.LLJIJIL.addAll(c199401130d.optionDependency_);
            }
            LJIILLIIL();
        }
        C130M<C199412130o, C199413130p, InterfaceC199411130n> c130mLJJII = null;
        if (this.LLJILJILJ == null) {
            if (!c199401130d.messageType_.isEmpty()) {
                if (this.LLJILJIL.isEmpty()) {
                    this.LLJILJIL = c199401130d.messageType_;
                    this.LLILZIL &= -65;
                } else {
                    LJIJJLI();
                    this.LLJILJIL.addAll(c199401130d.messageType_);
                }
                LJIILLIIL();
            }
        } else if (!c199401130d.messageType_.isEmpty()) {
            if (this.LLJILJILJ.LJII()) {
                this.LLJILJILJ.LIZ = null;
                this.LLJILJILJ = null;
                this.LLJILJIL = c199401130d.messageType_;
                this.LLILZIL &= -65;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIII = LJJIII();
                } else {
                    c130mLJJIII = null;
                }
                this.LLJILJILJ = c130mLJJIII;
            } else {
                this.LLJILJILJ.LIZIZ(c199401130d.messageType_);
            }
        }
        if (this.LLJJ == null) {
            if (!c199401130d.enumType_.isEmpty()) {
                if (this.LLJILLL.isEmpty()) {
                    this.LLJILLL = c199401130d.enumType_;
                    this.LLILZIL &= -129;
                } else {
                    if ((this.LLILZIL & 128) == 0) {
                        this.LLJILLL = new ArrayList(this.LLJILLL);
                        this.LLILZIL |= 128;
                    }
                    this.LLJILLL.addAll(c199401130d.enumType_);
                }
                LJIILLIIL();
            }
        } else if (!c199401130d.enumType_.isEmpty()) {
            if (this.LLJJ.LJII()) {
                this.LLJJ.LIZ = null;
                this.LLJJ = null;
                this.LLJILLL = c199401130d.enumType_;
                this.LLILZIL &= -129;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIFFI = LJJIFFI();
                } else {
                    c130mLJJIFFI = null;
                }
                this.LLJJ = c130mLJJIFFI;
            } else {
                this.LLJJ.LIZIZ(c199401130d.enumType_);
            }
        }
        if (this.LLJJIII == null) {
            if (!c199401130d.service_.isEmpty()) {
                if (this.LLJJI.isEmpty()) {
                    this.LLJJI = c199401130d.service_;
                    this.LLILZIL &= -257;
                } else {
                    if ((this.LLILZIL & 256) == 0) {
                        this.LLJJI = new ArrayList(this.LLJJI);
                        this.LLILZIL |= 256;
                    }
                    this.LLJJI.addAll(c199401130d.service_);
                }
                LJIILLIIL();
            }
        } else if (!c199401130d.service_.isEmpty()) {
            if (this.LLJJIII.LJII()) {
                this.LLJJIII.LIZ = null;
                this.LLJJIII = null;
                this.LLJJI = c199401130d.service_;
                this.LLILZIL &= -257;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJZLJL = LJJIIJZLJL();
                } else {
                    c130mLJJIIJZLJL = null;
                }
                this.LLJJIII = c130mLJJIIJZLJL;
            } else {
                this.LLJJIII.LIZIZ(c199401130d.service_);
            }
        }
        if (this.LLJJIJIIJIL == null) {
            if (!c199401130d.extension_.isEmpty()) {
                if (this.LLJJIJI.isEmpty()) {
                    this.LLJJIJI = c199401130d.extension_;
                    this.LLILZIL &= -513;
                } else {
                    if ((this.LLILZIL & 512) == 0) {
                        this.LLJJIJI = new ArrayList(this.LLJJIJI);
                        this.LLILZIL |= 512;
                    }
                    this.LLJJIJI.addAll(c199401130d.extension_);
                }
                LJIILLIIL();
            }
        } else if (!c199401130d.extension_.isEmpty()) {
            if (this.LLJJIJIIJIL.LJII()) {
                this.LLJJIJIIJIL.LIZ = null;
                this.LLJJIJIIJIL = null;
                this.LLJJIJI = c199401130d.extension_;
                this.LLILZIL &= -513;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJII = LJJII();
                }
                this.LLJJIJIIJIL = c130mLJJII;
            } else {
                this.LLJJIJIIJIL.LIZIZ(c199401130d.extension_);
            }
        }
        if (c199401130d.hasOptions()) {
            C132E options = c199401130d.getOptions();
            C130N<C132E, C132F, C131N> c130n = this.LLJJJ;
            if (c130n == null) {
                if ((this.LLILZIL & 1024) != 0 && (c132e = this.LLJJIJIL) != null && c132e != C132E.getDefaultInstance()) {
                    this.LLILZIL |= 1024;
                    LJIILLIIL();
                    ((C132F) LJJIIJ().LIZJ()).LJJIIJZLJL(options);
                } else {
                    this.LLJJIJIL = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLJJIJIL != null) {
                this.LLILZIL |= 1024;
                LJIILLIIL();
            }
        }
        if (c199401130d.hasSourceCodeInfo()) {
            AnonymousClass1315 sourceCodeInfo = c199401130d.getSourceCodeInfo();
            C130N<AnonymousClass1315, AnonymousClass1314, InterfaceC199417130t> c130n2 = this.LLJJJJ;
            if (c130n2 == null) {
                if ((this.LLILZIL & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 && (anonymousClass1315 = this.LLJJJIL) != null && anonymousClass1315 != AnonymousClass1315.getDefaultInstance()) {
                    this.LLILZIL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    LJIILLIIL();
                    ((AnonymousClass1314) LJJIIZ().LIZJ()).LJJIII(sourceCodeInfo);
                } else {
                    this.LLJJJIL = sourceCodeInfo;
                }
            } else {
                c130n2.LJ(sourceCodeInfo);
            }
            if (this.LLJJJIL != null) {
                this.LLILZIL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                LJIILLIIL();
            }
        }
        if (c199401130d.hasSyntax()) {
            this.LLJJJJJIL = c199401130d.syntax_;
            this.LLILZIL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            LJIILLIIL();
        }
        if (c199401130d.hasEdition()) {
            C130B edition = c199401130d.getEdition();
            edition.getClass();
            this.LLILZIL |= 8192;
            this.LLJJJJLIIL = edition.getNumber();
            LJIILLIIL();
        }
        LJFF(c199401130d.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199401130d) {
            LJJIIZI((C199401130d) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJ(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIJ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
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
                            this.LLIZ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 2;
                            break;
                        case 26:
                            AbstractC19922812xG abstractC19922812xGLJIILJJIL = abstractC19927312xz.LJIILJJIL();
                            if (!this.LLIZLLLIL.LL) {
                                this.LLIZLLLIL = new C19920612wu(this.LLIZLLLIL);
                            }
                            this.LLILZIL |= 4;
                            this.LLIZLLLIL.LJL(abstractC19922812xGLJIILJJIL);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            C199403130f c199403130f = (C199403130f) abstractC19927312xz.LJJ(C199403130f.parser(), c19926312xp);
                            C130M<C199403130f, C199404130g, InterfaceC199409130l> c130m = this.LLJILJILJ;
                            if (c130m == null) {
                                LJIJJLI();
                                this.LLJILJIL.add(c199403130f);
                            } else {
                                c130m.LIZJ(c199403130f);
                            }
                            break;
                        case 42:
                            C131C c131c = (C131C) abstractC19927312xz.LJJ(C131C.parser(), c19926312xp);
                            C130M<C131C, C131D, InterfaceC199410130m> c130m2 = this.LLJJ;
                            if (c130m2 == null) {
                                if ((this.LLILZIL & 128) == 0) {
                                    this.LLJILLL = new ArrayList(this.LLJILLL);
                                    this.LLILZIL |= 128;
                                }
                                this.LLJILLL.add(c131c);
                            } else {
                                c130m2.LIZJ(c131c);
                            }
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            C132I c132i = (C132I) abstractC19927312xz.LJJ(C132I.parser(), c19926312xp);
                            C130M<C132I, C132H, AnonymousClass1330> c130m3 = this.LLJJIII;
                            if (c130m3 == null) {
                                if ((this.LLILZIL & 256) == 0) {
                                    this.LLJJI = new ArrayList(this.LLJJI);
                                    this.LLILZIL |= 256;
                                }
                                this.LLJJI.add(c132i);
                            } else {
                                c130m3.LIZJ(c132i);
                            }
                            break;
                        case 58:
                            C199412130o c199412130o = (C199412130o) abstractC19927312xz.LJJ(C199412130o.parser(), c19926312xp);
                            C130M<C199412130o, C199413130p, InterfaceC199411130n> c130m4 = this.LLJJIJIIJIL;
                            if (c130m4 == null) {
                                if ((this.LLILZIL & 512) == 0) {
                                    this.LLJJIJI = new ArrayList(this.LLJJIJI);
                                    this.LLILZIL |= 512;
                                }
                                this.LLJJIJI.add(c199412130o);
                            } else {
                                c130m4.LIZJ(c199412130o);
                            }
                            break;
                        case 66:
                            abstractC19927312xz.LJJI(LJJIIJ().LIZJ(), c19926312xp);
                            this.LLILZIL |= 1024;
                            break;
                        case 74:
                            abstractC19927312xz.LJJI(LJJIIZ().LIZJ(), c19926312xp);
                            this.LLILZIL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                            break;
                        case 80:
                            int iLJIJJLI = abstractC19927312xz.LJIJJLI();
                            LJIL();
                            this.LLJ.LJJLL(iLJIJJLI);
                            break;
                        case 82:
                            int iLJIIL = abstractC19927312xz.LJIIL(abstractC19927312xz.LJJIII());
                            LJIL();
                            while (abstractC19927312xz.LJFF() > 0) {
                                this.LLJ.LJJLL(abstractC19927312xz.LJIJJLI());
                            }
                            abstractC19927312xz.LJIIJJI(iLJIIL);
                            break;
                        case 88:
                            int iLJIJJLI2 = abstractC19927312xz.LJIJJLI();
                            LJJI();
                            this.LLJI.LJJLL(iLJIJJLI2);
                            break;
                        case 90:
                            int iLJIIL2 = abstractC19927312xz.LJIIL(abstractC19927312xz.LJJIII());
                            LJJI();
                            while (abstractC19927312xz.LJFF() > 0) {
                                this.LLJI.LJJLL(abstractC19927312xz.LJIJJLI());
                            }
                            abstractC19927312xz.LJIIJJI(iLJIIL2);
                            break;
                        case 98:
                            this.LLJJJJJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                            break;
                        case 112:
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (C130B.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(14, iLJIILLIIL);
                            } else {
                                this.LLJJJJLIIL = iLJIILLIIL;
                                this.LLILZIL |= 8192;
                            }
                            break;
                        case 122:
                            AbstractC19922812xG abstractC19922812xGLJIILJJIL2 = abstractC19927312xz.LJIILJJIL();
                            if (!this.LLJIJIL.LL) {
                                this.LLJIJIL = new C19920612wu(this.LLJIJIL);
                            }
                            this.LLILZIL |= 32;
                            this.LLJIJIL.LJL(abstractC19922812xGLJIILJJIL2);
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
