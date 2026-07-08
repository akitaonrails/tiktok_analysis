package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.131Z, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C131Z extends AbstractC19933312yx<C131Y, C131Z> implements InterfaceC199415130r {
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public InterfaceC19922412xC LLJJI;
    public List<C132V> LLJJIII;
    public C130M<C132V, C199450132a, InterfaceC199431131h> LLJJIJI;
    public C199437131n LLJJIJIIJIL;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJJIJIL;
    public C199433131j LLJJJ;
    public C130N<C199433131j, C199434131k, InterfaceC199432131i> LLJJJIL;
    public List<C132O> LLJJJJ;
    public C130M<C132O, C132N, AnonymousClass1331> LLJJJJJIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIIZI;
        c19935812zM.LIZ(C131Y.class, C131Z.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C131Y buildPartial() {
        int i;
        C131Y c131y = new C131Y(this);
        C130M<C132V, C199450132a, InterfaceC199431131h> c130m = this.LLJJIJI;
        if (c130m == null) {
            if ((this.LLILZLL & 1024) != 0) {
                this.LLJJIII = Collections.unmodifiableList(this.LLJJIII);
                this.LLILZLL &= -1025;
            }
            c131y.editionDefaults_ = this.LLJJIII;
        } else {
            c131y.editionDefaults_ = c130m.LIZLLL();
        }
        C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJJJJJIL;
        if (c130m2 == null) {
            if ((this.LLILZLL & 8192) != 0) {
                this.LLJJJJ = Collections.unmodifiableList(this.LLJJJJ);
                this.LLILZLL &= -8193;
            }
            c131y.uninterpretedOption_ = this.LLJJJJ;
        } else {
            c131y.uninterpretedOption_ = c130m2.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c131y.ctype_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c131y.packed_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c131y.jstype_ = this.LLJ;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c131y.lazy_ = this.LLJI;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c131y.unverifiedLazy_ = this.LLJIJIL;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c131y.deprecated_ = this.LLJILJIL;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c131y.weak_ = this.LLJILJILJ;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c131y.debugRedact_ = this.LLJILLL;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c131y.retention_ = this.LLJJ;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                this.LLJJI.LJJLIIIJL();
                c131y.targets_ = this.LLJJI;
            }
            if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJIJIL;
                c131y.features_ = c130n == null ? this.LLJJIJIIJIL : (C199437131n) c130n.LIZIZ();
                i |= 512;
            }
            if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                C130N<C199433131j, C199434131k, InterfaceC199432131i> c130n2 = this.LLJJJIL;
                c131y.featureSupport_ = c130n2 == null ? this.LLJJJ : (C199433131j) c130n2.LIZIZ();
                i |= 1024;
            }
            c131y.LLILLJJLI |= i;
        }
        LJIILL();
        return c131y;
    }

    public final void LJJIII() {
        if (!this.LLJJI.LJJLIL()) {
            this.LLJJI = (InterfaceC19922412xC) k0.LJII(this.LLJJI);
        }
        this.LLILZLL |= 512;
    }

    public final C130M<C132V, C199450132a, InterfaceC199431131h> LJJIIJ() {
        if (this.LLJJIJI == null) {
            this.LLJJIJI = new C130M<>(this.LLJJIII, LJIIJJI(), this.LLILLL);
            this.LLJJIII = null;
        }
        return this.LLJJIJI;
    }

    public final C130N<C199433131j, C199434131k, InterfaceC199432131i> LJJIIJZLJL() {
        if (this.LLJJJIL == null) {
            C199433131j defaultInstance = this.LLJJJ;
            if (defaultInstance == null) {
                defaultInstance = C199433131j.getDefaultInstance();
            }
            this.LLJJJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJJ = null;
        }
        return this.LLJJJIL;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIIZ() {
        if (this.LLJJIJIL == null) {
            C199437131n defaultInstance = this.LLJJIJIIJIL;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJJIJIL = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJIJIIJIL = null;
        }
        return this.LLJJIJIL;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIZI() {
        if (this.LLJJJJJIL == null) {
            this.LLJJJJJIL = new C130M<>(this.LLJJJJ, LJIIJJI(), this.LLILLL);
            this.LLJJJJ = null;
        }
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJIJIL;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJJIJIIJIL;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C199437131n.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL = c130n.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                return false;
            }
        }
        int i = 0;
        while (true) {
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJJJJJIL;
            if (i >= (c130m == null ? this.LLJJJJ.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJJJJJIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJJJJ, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C131Z() {
        this.LLJJI = C19889012ro.LLILZIL;
        this.LLJJIII = Collections.emptyList();
        this.LLJJJJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJ();
            LJJIIZ();
            LJJIIJZLJL();
            LJJIIZI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C131Y c131yBuildPartial = buildPartial();
        if (c131yBuildPartial.isInitialized()) {
            return c131yBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131yBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C131Y.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJIIZ;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C131Y c131yBuildPartial = buildPartial();
        if (c131yBuildPartial.isInitialized()) {
            return c131yBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c131yBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C131Y.getDefaultInstance();
    }

    public C131Z(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLJJI = C19889012ro.LLILZIL;
        this.LLJJIII = Collections.emptyList();
        this.LLJJJJ = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIIJ();
            LJJIIZ();
            LJJIIJZLJL();
            LJJIIZI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131Y) {
            LJJIJ((C131Y) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIJ(C131Y c131y) {
        C130M<C132V, C199450132a, InterfaceC199431131h> c130mLJJIIJ;
        C199433131j c199433131j;
        C199437131n c199437131n;
        if (c131y == C131Y.getDefaultInstance()) {
            return;
        }
        if (c131y.hasCtype()) {
            EnumC199424131a ctype = c131y.getCtype();
            ctype.getClass();
            this.LLILZLL |= 1;
            this.LLIZ = ctype.getNumber();
            LJIILLIIL();
        }
        if (c131y.hasPacked()) {
            this.LLIZLLLIL = c131y.getPacked();
            this.LLILZLL |= 2;
            LJIILLIIL();
        }
        if (c131y.hasJstype()) {
            EnumC199425131b jstype = c131y.getJstype();
            jstype.getClass();
            this.LLILZLL |= 4;
            this.LLJ = jstype.getNumber();
            LJIILLIIL();
        }
        if (c131y.hasLazy()) {
            this.LLJI = c131y.getLazy();
            this.LLILZLL |= 8;
            LJIILLIIL();
        }
        if (c131y.hasUnverifiedLazy()) {
            this.LLJIJIL = c131y.getUnverifiedLazy();
            this.LLILZLL |= 16;
            LJIILLIIL();
        }
        if (c131y.hasDeprecated()) {
            this.LLJILJIL = c131y.getDeprecated();
            this.LLILZLL |= 32;
            LJIILLIIL();
        }
        if (c131y.hasWeak()) {
            this.LLJILJILJ = c131y.getWeak();
            this.LLILZLL |= 64;
            LJIILLIIL();
        }
        if (c131y.hasDebugRedact()) {
            this.LLJILLL = c131y.getDebugRedact();
            this.LLILZLL |= 128;
            LJIILLIIL();
        }
        if (c131y.hasRetention()) {
            EnumC199426131c retention = c131y.getRetention();
            retention.getClass();
            this.LLILZLL |= 256;
            this.LLJJ = retention.getNumber();
            LJIILLIIL();
        }
        if (!c131y.targets_.isEmpty()) {
            if (this.LLJJI.isEmpty()) {
                InterfaceC19922412xC interfaceC19922412xC = c131y.targets_;
                this.LLJJI = interfaceC19922412xC;
                interfaceC19922412xC.LJJLIIIJL();
                this.LLILZLL |= 512;
            } else {
                LJJIII();
                this.LLJJI.addAll(c131y.targets_);
            }
            LJIILLIIL();
        }
        C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIZI = null;
        if (this.LLJJIJI == null) {
            if (!c131y.editionDefaults_.isEmpty()) {
                if (this.LLJJIII.isEmpty()) {
                    this.LLJJIII = c131y.editionDefaults_;
                    this.LLILZLL &= -1025;
                } else {
                    if ((this.LLILZLL & 1024) == 0) {
                        this.LLJJIII = new ArrayList(this.LLJJIII);
                        this.LLILZLL |= 1024;
                    }
                    this.LLJJIII.addAll(c131y.editionDefaults_);
                }
                LJIILLIIL();
            }
        } else if (!c131y.editionDefaults_.isEmpty()) {
            if (this.LLJJIJI.LJII()) {
                this.LLJJIJI.LIZ = null;
                this.LLJJIJI = null;
                this.LLJJIII = c131y.editionDefaults_;
                this.LLILZLL &= -1025;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                } else {
                    c130mLJJIIJ = null;
                }
                this.LLJJIJI = c130mLJJIIJ;
            } else {
                this.LLJJIJI.LIZIZ(c131y.editionDefaults_);
            }
        }
        if (c131y.hasFeatures()) {
            C199437131n features = c131y.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJIJIL;
            if (c130n == null) {
                if ((this.LLILZLL & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 && (c199437131n = this.LLJJIJIIJIL) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                    LJIILLIIL();
                    ((C199436131m) LJJIIZ().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJJIJIIJIL = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJJIJIIJIL != null) {
                this.LLILZLL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                LJIILLIIL();
            }
        }
        if (c131y.hasFeatureSupport()) {
            C199433131j featureSupport = c131y.getFeatureSupport();
            C130N<C199433131j, C199434131k, InterfaceC199432131i> c130n2 = this.LLJJJIL;
            if (c130n2 == null) {
                if ((this.LLILZLL & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 && (c199433131j = this.LLJJJ) != null && c199433131j != C199433131j.getDefaultInstance()) {
                    this.LLILZLL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                    LJIILLIIL();
                    ((C199434131k) LJJIIJZLJL().LIZJ()).LJIJJLI(featureSupport);
                } else {
                    this.LLJJJ = featureSupport;
                }
            } else {
                c130n2.LJ(featureSupport);
            }
            if (this.LLJJJ != null) {
                this.LLILZLL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                LJIILLIIL();
            }
        }
        if (this.LLJJJJJIL == null) {
            if (!c131y.uninterpretedOption_.isEmpty()) {
                if (this.LLJJJJ.isEmpty()) {
                    this.LLJJJJ = c131y.uninterpretedOption_;
                    this.LLILZLL &= -8193;
                } else {
                    if ((this.LLILZLL & 8192) == 0) {
                        this.LLJJJJ = new ArrayList(this.LLJJJJ);
                        this.LLILZLL |= 8192;
                    }
                    this.LLJJJJ.addAll(c131y.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c131y.uninterpretedOption_.isEmpty()) {
            if (this.LLJJJJJIL.LJII()) {
                this.LLJJJJJIL.LIZ = null;
                this.LLJJJJJIL = null;
                this.LLJJJJ = c131y.uninterpretedOption_;
                this.LLILZLL &= -8193;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIZI = LJJIIZI();
                }
                this.LLJJJJJIL = c130mLJJIIZI;
            } else {
                this.LLJJJJJIL.LIZIZ(c131y.uninterpretedOption_);
            }
        }
        LJIL(c131y);
        LJFF(c131y.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C131Y) {
            LJJIJ((C131Y) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJIIJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIJIIJI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    switch (iLJJIJIL) {
                        case 0:
                            break;
                        case 8:
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199424131a.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(1, iLJIILLIIL);
                            } else {
                                this.LLIZ = iLJIILLIIL;
                                this.LLILZLL |= 1;
                            }
                            break;
                        case 16:
                            this.LLIZLLLIL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 2;
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            this.LLJILJIL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 32;
                            break;
                        case 40:
                            this.LLJI = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 8;
                            break;
                        case 48:
                            int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199425131b.forNumber(iLJIILLIIL2) == null) {
                                LJIILJJIL(6, iLJIILLIIL2);
                            } else {
                                this.LLJ = iLJIILLIIL2;
                                this.LLILZLL |= 4;
                            }
                            break;
                        case 80:
                            this.LLJILJILJ = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 64;
                            break;
                        case 120:
                            this.LLJIJIL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 16;
                            break;
                        case 128:
                            this.LLJILLL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 128;
                            break;
                        case 136:
                            int iLJIILLIIL3 = abstractC19927312xz.LJIILLIIL();
                            if (EnumC199426131c.forNumber(iLJIILLIIL3) == null) {
                                LJIILJJIL(17, iLJIILLIIL3);
                            } else {
                                this.LLJJ = iLJIILLIIL3;
                                this.LLILZLL |= 256;
                            }
                            break;
                        case 152:
                            int iLJIILLIIL4 = abstractC19927312xz.LJIILLIIL();
                            if (C130I.forNumber(iLJIILLIIL4) == null) {
                                LJIILJJIL(19, iLJIILLIIL4);
                            } else {
                                LJJIII();
                                this.LLJJI.LJJLL(iLJIILLIIL4);
                            }
                            break;
                        case 154:
                            int iLJIIL = abstractC19927312xz.LJIIL(abstractC19927312xz.LJJIII());
                            LJJIII();
                            while (abstractC19927312xz.LJFF() > 0) {
                                int iLJIILLIIL5 = abstractC19927312xz.LJIILLIIL();
                                if (C130I.forNumber(iLJIILLIIL5) == null) {
                                    LJIILJJIL(19, iLJIILLIIL5);
                                } else {
                                    this.LLJJI.LJJLL(iLJIILLIIL5);
                                }
                            }
                            abstractC19927312xz.LJIIJJI(iLJIIL);
                            break;
                        case 162:
                            C132V c132v = (C132V) abstractC19927312xz.LJJ(C132V.parser(), c19926312xp);
                            C130M<C132V, C199450132a, InterfaceC199431131h> c130m = this.LLJJIJI;
                            if (c130m == null) {
                                if ((this.LLILZLL & 1024) == 0) {
                                    this.LLJJIII = new ArrayList(this.LLJJIII);
                                    this.LLILZLL |= 1024;
                                }
                                this.LLJJIII.add(c132v);
                            } else {
                                c130m.LIZJ(c132v);
                            }
                            break;
                        case 170:
                            abstractC19927312xz.LJJI(LJJIIZ().LIZJ(), c19926312xp);
                            this.LLILZLL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                            break;
                        case 178:
                            abstractC19927312xz.LJJI(LJJIIJZLJL().LIZJ(), c19926312xp);
                            this.LLILZLL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                            break;
                        case 7994:
                            C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJJJJJIL;
                            if (c130m2 == null) {
                                if ((this.LLILZLL & 8192) == 0) {
                                    this.LLJJJJ = new ArrayList(this.LLJJJJ);
                                    this.LLILZLL |= 8192;
                                }
                                this.LLJJJJ.add(c132o);
                            } else {
                                c130m2.LIZJ(c132o);
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
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJIIJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIJIIJI(abstractC19927312xz, c19926312xp);
        return this;
    }
}
