package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.132F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C132F extends AbstractC19933312yx<C132E, C132F> implements C131N {
    public int LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public Object LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Object LLJJIJIIJIL;
    public Object LLJJIJIL;
    public Object LLJJJ;
    public Object LLJJJIL;
    public Object LLJJJJ;
    public Object LLJJJJJIL;
    public Object LLJJJJLIIL;
    public C199437131n LLJJL;
    public C130N<C199437131n, C199436131m, AnonymousClass1326> LLJJLIIIJLLLLLLLZ;
    public List<C132O> LLJL;
    public C130M<C132O, C132N, AnonymousClass1331> LLJLIL;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJJIII;
        c19935812zM.LIZ(C132E.class, C132F.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJJII, reason: merged with bridge method [inline-methods] */
    public final C132E buildPartial() {
        int i;
        C132E c132e = new C132E(this);
        C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJLIL;
        if (c130m == null) {
            if ((this.LLILZLL & 1048576) != 0) {
                this.LLJL = Collections.unmodifiableList(this.LLJL);
                this.LLILZLL &= -1048577;
            }
            c132e.uninterpretedOption_ = this.LLJL;
        } else {
            c132e.uninterpretedOption_ = c130m.LIZLLL();
        }
        int i2 = this.LLILZLL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c132e.javaPackage_ = this.LLIZ;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c132e.javaOuterClassname_ = this.LLIZLLLIL;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c132e.javaMultipleFiles_ = this.LLJ;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c132e.javaGenerateEqualsAndHash_ = this.LLJI;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c132e.javaStringCheckUtf8_ = this.LLJIJIL;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c132e.optimizeFor_ = this.LLJILJIL;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c132e.goPackage_ = this.LLJILJILJ;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c132e.ccGenericServices_ = this.LLJILLL;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c132e.javaGenericServices_ = this.LLJJ;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                c132e.pyGenericServices_ = this.LLJJI;
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c132e.deprecated_ = this.LLJJIII;
                i |= 1024;
            }
            if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
                c132e.ccEnableArenas_ = this.LLJJIJI;
                i |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            }
            if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
                c132e.objcClassPrefix_ = this.LLJJIJIIJIL;
                i |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            }
            if ((i2 & 8192) != 0) {
                c132e.csharpNamespace_ = this.LLJJIJIL;
                i |= 8192;
            }
            if ((i2 & 16384) != 0) {
                c132e.swiftPrefix_ = this.LLJJJ;
                i |= 16384;
            }
            if ((i2 & 32768) != 0) {
                c132e.phpClassPrefix_ = this.LLJJJIL;
                i |= 32768;
            }
            if ((i2 & 65536) != 0) {
                c132e.phpNamespace_ = this.LLJJJJ;
                i |= 65536;
            }
            if ((i2 & 131072) != 0) {
                c132e.phpMetadataNamespace_ = this.LLJJJJJIL;
                i |= 131072;
            }
            if ((i2 & 262144) != 0) {
                c132e.rubyPackage_ = this.LLJJJJLIIL;
                i |= 262144;
            }
            if ((i2 & 524288) != 0) {
                C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJLIIIJLLLLLLLZ;
                c132e.features_ = c130n == null ? this.LLJJL : (C199437131n) c130n.LIZIZ();
                i |= 524288;
            }
            c132e.LLILLJJLI |= i;
        }
        LJIILL();
        return c132e;
    }

    public final C130N<C199437131n, C199436131m, AnonymousClass1326> LJJIII() {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            C199437131n defaultInstance = this.LLJJL;
            if (defaultInstance == null) {
                defaultInstance = C199437131n.getDefaultInstance();
            }
            this.LLJJLIIIJLLLLLLLZ = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJL = null;
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final C130M<C132O, C132N, AnonymousClass1331> LJJIIJ() {
        if (this.LLJLIL == null) {
            this.LLJLIL = new C130M<>(this.LLJL, LJIIJJI(), this.LLILLL);
            this.LLJL = null;
        }
        return this.LLJLIL;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZLL & 524288) != 0) {
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJLIIIJLLLLLLLZ;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJJL;
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
            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJLIL;
            if (i >= (c130m == null ? this.LLJL.size() : c130m.LJFF())) {
                return LJIJJLI();
            }
            C130M<C132O, C132N, AnonymousClass1331> c130m2 = this.LLJLIL;
            if (!(c130m2 == null ? (AbstractC19932312yn) ListProtector.get(this.LLJL, i) : c130m2.LJI(i)).isInitialized()) {
                return false;
            }
            i++;
        }
    }

    public C132F() {
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJILJIL = 1;
        this.LLJILJILJ = "";
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        this.LLJJJIL = "";
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = "";
        this.LLJL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C132E c132eBuildPartial = buildPartial();
        if (c132eBuildPartial.isInitialized()) {
            return c132eBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132eBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C132E.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJJII;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C132E c132eBuildPartial = buildPartial();
        if (c132eBuildPartial.isInitialized()) {
            return c132eBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c132eBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C132E.getDefaultInstance();
    }

    public C132F(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        this.LLJILJIL = 1;
        this.LLJILJILJ = "";
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        this.LLJJJIL = "";
        this.LLJJJJ = "";
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = "";
        this.LLJL = Collections.emptyList();
        if (k0.alwaysUseFieldBuilders) {
            LJJIII();
            LJJIIJ();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132E) {
            LJJIIJZLJL((C132E) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJJIIJZLJL(C132E c132e) {
        C199437131n c199437131n;
        if (c132e == C132E.getDefaultInstance()) {
            return;
        }
        if (c132e.hasJavaPackage()) {
            this.LLIZ = c132e.javaPackage_;
            this.LLILZLL |= 1;
            LJIILLIIL();
        }
        if (c132e.hasJavaOuterClassname()) {
            this.LLIZLLLIL = c132e.javaOuterClassname_;
            this.LLILZLL |= 2;
            LJIILLIIL();
        }
        if (c132e.hasJavaMultipleFiles()) {
            this.LLJ = c132e.getJavaMultipleFiles();
            this.LLILZLL |= 4;
            LJIILLIIL();
        }
        if (c132e.hasJavaGenerateEqualsAndHash()) {
            this.LLJI = c132e.getJavaGenerateEqualsAndHash();
            this.LLILZLL |= 8;
            LJIILLIIL();
        }
        if (c132e.hasJavaStringCheckUtf8()) {
            this.LLJIJIL = c132e.getJavaStringCheckUtf8();
            this.LLILZLL |= 16;
            LJIILLIIL();
        }
        if (c132e.hasOptimizeFor()) {
            AnonymousClass1321 optimizeFor = c132e.getOptimizeFor();
            optimizeFor.getClass();
            this.LLILZLL |= 32;
            this.LLJILJIL = optimizeFor.getNumber();
            LJIILLIIL();
        }
        if (c132e.hasGoPackage()) {
            this.LLJILJILJ = c132e.goPackage_;
            this.LLILZLL |= 64;
            LJIILLIIL();
        }
        if (c132e.hasCcGenericServices()) {
            this.LLJILLL = c132e.getCcGenericServices();
            this.LLILZLL |= 128;
            LJIILLIIL();
        }
        if (c132e.hasJavaGenericServices()) {
            this.LLJJ = c132e.getJavaGenericServices();
            this.LLILZLL |= 256;
            LJIILLIIL();
        }
        if (c132e.hasPyGenericServices()) {
            this.LLJJI = c132e.getPyGenericServices();
            this.LLILZLL |= 512;
            LJIILLIIL();
        }
        if (c132e.hasDeprecated()) {
            this.LLJJIII = c132e.getDeprecated();
            this.LLILZLL |= 1024;
            LJIILLIIL();
        }
        if (c132e.hasCcEnableArenas()) {
            this.LLJJIJI = c132e.getCcEnableArenas();
            this.LLILZLL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            LJIILLIIL();
        }
        if (c132e.hasObjcClassPrefix()) {
            this.LLJJIJIIJIL = c132e.objcClassPrefix_;
            this.LLILZLL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
            LJIILLIIL();
        }
        if (c132e.hasCsharpNamespace()) {
            this.LLJJIJIL = c132e.csharpNamespace_;
            this.LLILZLL |= 8192;
            LJIILLIIL();
        }
        if (c132e.hasSwiftPrefix()) {
            this.LLJJJ = c132e.swiftPrefix_;
            this.LLILZLL |= 16384;
            LJIILLIIL();
        }
        if (c132e.hasPhpClassPrefix()) {
            this.LLJJJIL = c132e.phpClassPrefix_;
            this.LLILZLL |= 32768;
            LJIILLIIL();
        }
        if (c132e.hasPhpNamespace()) {
            this.LLJJJJ = c132e.phpNamespace_;
            this.LLILZLL |= 65536;
            LJIILLIIL();
        }
        if (c132e.hasPhpMetadataNamespace()) {
            this.LLJJJJJIL = c132e.phpMetadataNamespace_;
            this.LLILZLL |= 131072;
            LJIILLIIL();
        }
        if (c132e.hasRubyPackage()) {
            this.LLJJJJLIIL = c132e.rubyPackage_;
            this.LLILZLL |= 262144;
            LJIILLIIL();
        }
        if (c132e.hasFeatures()) {
            C199437131n features = c132e.getFeatures();
            C130N<C199437131n, C199436131m, AnonymousClass1326> c130n = this.LLJJLIIIJLLLLLLLZ;
            if (c130n == null) {
                if ((this.LLILZLL & 524288) != 0 && (c199437131n = this.LLJJL) != null && c199437131n != C199437131n.getDefaultInstance()) {
                    this.LLILZLL |= 524288;
                    LJIILLIIL();
                    ((C199436131m) LJJIII().LIZJ()).LJJIIJ(features);
                } else {
                    this.LLJJL = features;
                }
            } else {
                c130n.LJ(features);
            }
            if (this.LLJJL != null) {
                this.LLILZLL |= 524288;
                LJIILLIIL();
            }
        }
        if (this.LLJLIL == null) {
            if (!c132e.uninterpretedOption_.isEmpty()) {
                if (this.LLJL.isEmpty()) {
                    this.LLJL = c132e.uninterpretedOption_;
                    this.LLILZLL &= -1048577;
                } else {
                    if ((this.LLILZLL & 1048576) == 0) {
                        this.LLJL = new ArrayList(this.LLJL);
                        this.LLILZLL |= 1048576;
                    }
                    this.LLJL.addAll(c132e.uninterpretedOption_);
                }
                LJIILLIIL();
            }
        } else if (!c132e.uninterpretedOption_.isEmpty()) {
            if (this.LLJLIL.LJII()) {
                C130M<C132O, C132N, AnonymousClass1331> c130mLJJIIJ = null;
                this.LLJLIL.LIZ = null;
                this.LLJLIL = null;
                this.LLJL = c132e.uninterpretedOption_;
                this.LLILZLL &= -1048577;
                if (k0.alwaysUseFieldBuilders) {
                    c130mLJJIIJ = LJJIIJ();
                }
                this.LLJLIL = c130mLJJIIJ;
            } else {
                this.LLJLIL.LIZIZ(c132e.uninterpretedOption_);
            }
        }
        LJIL(c132e);
        LJFF(c132e.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C132E) {
            LJJIIJZLJL((C132E) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJIIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    switch (iLJJIJIL) {
                        case 0:
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            this.LLIZ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 1;
                            break;
                        case 66:
                            this.LLIZLLLIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 2;
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (AnonymousClass1321.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(9, iLJIILLIIL);
                            } else {
                                this.LLJILJIL = iLJIILLIIL;
                                this.LLILZLL |= 32;
                            }
                            break;
                        case 80:
                            this.LLJ = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 4;
                            break;
                        case 90:
                            this.LLJILJILJ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 64;
                            break;
                        case 128:
                            this.LLJILLL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 128;
                            break;
                        case 136:
                            this.LLJJ = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 256;
                            break;
                        case 144:
                            this.LLJJI = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 512;
                            break;
                        case 160:
                            this.LLJI = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 8;
                            break;
                        case 184:
                            this.LLJJIII = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 1024;
                            break;
                        case 216:
                            this.LLJIJIL = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= 16;
                            break;
                        case 248:
                            this.LLJJIJI = abstractC19927312xz.LJIILIIL();
                            this.LLILZLL |= SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
                            break;
                        case 290:
                            this.LLJJIJIIJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                            break;
                        case 298:
                            this.LLJJIJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 8192;
                            break;
                        case 314:
                            this.LLJJJ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 16384;
                            break;
                        case 322:
                            this.LLJJJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 32768;
                            break;
                        case 330:
                            this.LLJJJJ = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 65536;
                            break;
                        case 354:
                            this.LLJJJJJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 131072;
                            break;
                        case 362:
                            this.LLJJJJLIIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZLL |= 262144;
                            break;
                        case 402:
                            abstractC19927312xz.LJJI(LJJIII().LIZJ(), c19926312xp);
                            this.LLILZLL |= 524288;
                            break;
                        case 7994:
                            C132O c132o = (C132O) abstractC19927312xz.LJJ(C132O.parser(), c19926312xp);
                            C130M<C132O, C132N, AnonymousClass1331> c130m = this.LLJLIL;
                            if (c130m == null) {
                                if ((this.LLILZLL & 1048576) == 0) {
                                    this.LLJL = new ArrayList(this.LLJL);
                                    this.LLILZLL |= 1048576;
                                }
                                this.LLJL.add(c132o);
                            } else {
                                c130m.LIZJ(c132o);
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
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJIIZ(abstractC19927312xz, c19926312xp);
        return this;
    }
}
