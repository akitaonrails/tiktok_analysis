package X;

import Y.AObjectS245S0100000_22;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.ailive.MixEditingMaterialModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS24S0002000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1414460mua extends AbstractC2255721DQs<InterfaceC564930MDr> implements InterfaceC564930MDr, InterfaceC379610EuV {
    public static final C1414500mue LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public boolean LLILLJJLI;
    public Pair<C1412800mru, ? extends InterfaceC1414490mud> LLIZLLLIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1414530muh.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1413600mtC.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1413730mtP.class, null);
    public C1414480muc LLJ = new C1414480muc();
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), C1412740mro.class, null);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0mue] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1414460mua.class, "mixEditingApi", "getMixEditingApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingAssetsApi;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1414460mua.class, "mixEditingOperationApi", "getMixEditingOperationApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialOperationApi;", 0), new C2217381BqS(C1414460mua.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1414460mua.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1414460mua.class, "mixEditingMaterialDataApi", "getMixEditingMaterialDataApi()Lcom/ss/android/ugc/gamora/editor/mixediting/MixEditingMaterialDataApi;", 0), new C2217381BqS(C1414460mua.class, "videoPicCountHolder", "getVideoPicCountHolder()Lcom/ss/android/ugc/gamora/editor/mixediting/eventtrack/MixEditingCurrentEditModelVideoPicCountHolder;", 0)};
        LLJIJIL = new Object() { // from class: X.0mue
        };
        LLJILJILJ = 8;
    }

    public InterfaceC564930MDr W1() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZLL.getValue(this, LLJILJIL[3]);
    }

    private final InterfaceC1414530muh X1() {
        return (InterfaceC1414530muh) this.LLILLL.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC1413600mtC o2() {
        return (InterfaceC1413600mtC) this.LLILZ.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1413730mtP Z1() {
        return (InterfaceC1413730mtP) this.LLIZ.getValue(this, LLJILJIL[4]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZIL.getValue(this, LLJILJIL[2]);
    }

    @Override // X.InterfaceC564930MDr
    public void hd1() {
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialAiAliveComponent -> openMixEditingPanel, mixEditingApi is null: ");
        sbLIZ.append(X1() == null);
        C201955140j.LIZJ(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1414530muh interfaceC1414530muhX1 = X1();
        if (interfaceC1414530muhX1 != null) {
            interfaceC1414530muhX1.OH1();
        }
        InterfaceC1414530muh interfaceC1414530muhX12 = X1();
        if (interfaceC1414530muhX12 != null) {
            interfaceC1414530muhX12.be(true);
        }
        InterfaceC1414530muh interfaceC1414530muhX13 = X1();
        if (interfaceC1414530muhX13 != null) {
            interfaceC1414530muhX13.bK1(new C1413010msF(true, false, EnumC1412690mrj.AUTO_SHOW, false, false, 56));
        }
    }

    public final C1412740mro w2() {
        return (C1412740mro) this.LLJI.getValue(this, LLJILJIL[5]);
    }

    @Override // X.InterfaceC564930MDr
    public void aA0() {
        InterfaceC1414530muh interfaceC1414530muhX1 = X1();
        if (interfaceC1414530muhX1 != null) {
            interfaceC1414530muhX1.Jv0();
        }
        InterfaceC1414530muh interfaceC1414530muhX12 = X1();
        if (interfaceC1414530muhX12 != null) {
            interfaceC1414530muhX12.hJ();
        }
    }

    @Override // X.InterfaceC564930MDr
    public void ix1() {
        C1412800mru c1412800mruLIZIZ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        AutoCutThemeData autoCutThemeDataLIZJ;
        if (getEditModel().getAILivePhotoModel().LJII()) {
            InterfaceC1452170ntP value = JY0().g().getValue();
            if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null || (autoCutThemeDataLIZJ = C1416110mxF.LIZJ(getEditModel().creativeModel.autoCutModel)) == null) {
                c1412800mruLIZIZ = null;
            } else {
                C1414140mu4 c1414140mu4 = C1414140mu4.LIZ;
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(getEditModel().creativeModel.musicBuzModel);
                c1414140mu4.getClass();
                c1412800mruLIZIZ = C1414140mu4.LIZIZ(autoCutThemeDataLIZJ, model, aVMusicExtractAVMusic);
            }
            Le0(c1412800mruLIZIZ);
        }
    }

    @Override // X.InterfaceC564930MDr
    public void kM() {
        InterfaceC1414530muh interfaceC1414530muhX1 = X1();
        if (interfaceC1414530muhX1 != null) {
            interfaceC1414530muhX1.OH1();
        }
        InterfaceC1414530muh interfaceC1414530muhX12 = X1();
        if (interfaceC1414530muhX12 != null) {
            interfaceC1414530muhX12.be(true);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getEditModel().creativeModel.draftInfoModel.isDraft) {
            C1419810n3D.LIZJ(new C1417870n05(getEditModel().mShootWay, getEditModel().getCreationId()));
        }
        InterfaceC1413600mtC interfaceC1413600mtCO2 = o2();
        if (interfaceC1413600mtCO2 != null) {
            interfaceC1413600mtCO2.Us2(new InterfaceC1414570mul() { // from class: X.0mub
                @Override // X.InterfaceC1414570mul
                public final void LIZ(C1412800mru c1412800mru) {
                    InterfaceC1414490mud second;
                    InterfaceC1414490mud second2;
                    this.LIZ.Le0(c1412800mru);
                    if (c1412800mru != null) {
                        C1414460mua c1414460mua = this.LIZ;
                        if (c1414460mua.G2(c1412800mru)) {
                            c1414460mua.LLJ.LIZ();
                            Pair<C1412800mru, ? extends InterfaceC1414490mud> pair = c1414460mua.LLIZLLLIL;
                            if (pair != null && (second2 = pair.getSecond()) != null) {
                                second2.onSuccess();
                            }
                            c1414460mua.LLIZLLLIL = null;
                            return;
                        }
                        return;
                    }
                    C1414460mua c1414460mua2 = this.LIZ;
                    C201955140j.LIZJ(C0L76.LIZIZ, "MixEditingMaterialAiAliveComponent -> onApplyMaterialSuccess, item is null ");
                    c1414460mua2.LLJ.LIZ();
                    Pair<C1412800mru, ? extends InterfaceC1414490mud> pair2 = c1414460mua2.LLIZLLLIL;
                    if (pair2 != null && (second = pair2.getSecond()) != null) {
                        Pair<C1412800mru, ? extends InterfaceC1414490mud> pair3 = c1414460mua2.LLIZLLLIL;
                        if (pair3 != null) {
                            pair3.getFirst();
                        }
                        second.onSuccess();
                    }
                    c1414460mua2.LLIZLLLIL = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4, types: [X.0muf] */
                @Override // X.InterfaceC1414570mul
                public final void LIZIZ(C1412800mru c1412800mru) {
                    InterfaceC1414490mud second;
                    if (c1412800mru != null) {
                        C1414460mua c1414460mua = this.LIZ;
                        if (c1414460mua.G2(c1412800mru)) {
                            c1414460mua.LLJ.LIZ();
                            Pair<C1412800mru, ? extends InterfaceC1414490mud> pair = c1414460mua.LLIZLLLIL;
                            if (pair != null && (second = pair.getSecond()) != 0) {
                                second.LIZIZ(new Object() { // from class: X.0muf
                                });
                            }
                            c1414460mua.LLIZLLLIL = null;
                        }
                    }
                }

                @Override // X.InterfaceC1414570mul
                public final void LIZJ(EnumC1998707sH enumC1998707sH) {
                    if (enumC1998707sH == EnumC1998707sH.NORMAL) {
                        this.LIZ.Le0(null);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC564930MDr
    public boolean Q02() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1414460mua(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final C1412800mru H2(MixEditingMaterialModel mixEditingMaterialModel) {
        C385670FAf<List<C1412800mru>> c385670FAfJ70;
        List<C1412800mru> listLIZJ;
        Object asset_id;
        InterfaceC1414530muh interfaceC1414530muhX1;
        Pair<Integer, C1412800mru> pairHc1;
        C1412800mru second;
        Asset asset = mixEditingMaterialModel.originAsset;
        if (asset != null && (interfaceC1414530muhX1 = X1()) != null && (pairHc1 = interfaceC1414530muhX1.Hc1(asset.getAsset_id(), asset.getAsset_type())) != null && (second = pairHc1.getSecond()) != null) {
            return second;
        }
        InterfaceC1413730mtP interfaceC1413730mtPZ1 = Z1();
        if (interfaceC1413730mtPZ1 != null && (c385670FAfJ70 = interfaceC1413730mtPZ1.j70()) != null && (listLIZJ = c385670FAfJ70.LIZJ()) != null) {
            Iterator<C1412800mru> it2 = listLIZJ.iterator();
            while (true) {
                asset_id = null;
                if (!it2.hasNext()) {
                    break;
                }
                C1412800mru next = it2.next();
                C1412800mru c1412800mru = next;
                String strLIZIZ = c1412800mru.LIZIZ();
                Asset asset2 = mixEditingMaterialModel.originAsset;
                if (asset2 != null) {
                    asset_id = asset2.getAsset_id();
                }
                if (Intrinsics.LJFF(strLIZIZ, asset_id) && c1412800mru.LIZ == mixEditingMaterialModel.type) {
                    asset_id = next;
                    break;
                }
            }
            C1412800mru c1412800mru2 = (C1412800mru) asset_id;
            if (c1412800mru2 != null) {
                return c1412800mru2;
            }
        }
        return C1414600muo.LJ(mixEditingMaterialModel);
    }

    public final boolean G2(C1412800mru c1412800mru) {
        Pair<C1412800mru, ? extends InterfaceC1414490mud> pair = this.LLIZLLLIL;
        if (pair == null || pair.getFirst().LIZ != c1412800mru.LIZ || !Intrinsics.LJFF(pair.getFirst().LIZIZ(), c1412800mru.LIZIZ())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC564930MDr
    public void LH(boolean z) {
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialAiAliveComponent -> notifyFetchDataSuccess, success = ");
        sbLIZ.append(z);
        sbLIZ.append("; isMainThread = ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C201955140j.LIZJ(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC564930MDr
    public void Le0(C1412800mru c1412800mru) {
        String str;
        MixEditingMaterialType mixEditingMaterialType;
        MixEditingMaterialType mixEditingMaterialType2;
        MixEditingMaterialType mixEditingMaterialType3;
        MixEditingMaterialModel mixEditingMaterialModel;
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialAiAliveComponent -> notifyRememberTemplate, item.name = ");
        MixEditingMaterialModel mixEditingMaterialModel2 = null;
        if (c1412800mru != null) {
            str = c1412800mru.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("; item.type = ");
        if (c1412800mru != null) {
            mixEditingMaterialType = c1412800mru.LIZ;
        } else {
            mixEditingMaterialType = null;
        }
        sbLIZ.append(mixEditingMaterialType);
        C201955140j.LIZJ(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        if (c1412800mru != null) {
            mixEditingMaterialType2 = c1412800mru.LIZ;
        } else {
            mixEditingMaterialType2 = null;
        }
        if (mixEditingMaterialType2 != MixEditingMaterialType.EFFECT_TYPE) {
            if (c1412800mru != null) {
                mixEditingMaterialType3 = c1412800mru.LIZ;
            } else {
                mixEditingMaterialType3 = null;
            }
            if (mixEditingMaterialType3 != MixEditingMaterialType.SOUND_SYNC) {
                ProgressModel progressModelLIZIZ = getEditModel().creativeModel.aiLivePhotoModel.LIZIZ();
                if (c1412800mru != null) {
                    mixEditingMaterialModel = new MixEditingMaterialModel(c1412800mru.LIZ, c1412800mru.LIZIZ, c1412800mru.LIZJ, c1412800mru.LIZLLL, c1412800mru.LJFF, c1412800mru.LJI, c1412800mru.LJII, c1412800mru.LJIIIIZZ, c1412800mru.LJIIIZ);
                } else {
                    mixEditingMaterialModel = null;
                }
                progressModelLIZIZ.bindMixMaterial = mixEditingMaterialModel;
                ProgressModel progressModel = getEditModel().creativeModel.aiLivePhotoModel.lastStatus;
                if (progressModel != null) {
                    if (c1412800mru != null) {
                        mixEditingMaterialModel2 = new MixEditingMaterialModel(c1412800mru.LIZ, c1412800mru.LIZIZ, c1412800mru.LIZJ, c1412800mru.LIZLLL, c1412800mru.LJFF, c1412800mru.LJI, c1412800mru.LJII, c1412800mru.LJIIIIZZ, c1412800mru.LJIIIZ);
                    }
                    progressModel.bindMixMaterial = mixEditingMaterialModel2;
                    return;
                }
                return;
            }
        }
        getEditModel().creativeModel.aiLivePhotoModel.LIZIZ().bindMixMaterial = null;
        ProgressModel progressModel2 = getEditModel().creativeModel.aiLivePhotoModel.lastStatus;
        if (progressModel2 != null) {
            progressModel2.bindMixMaterial = null;
        }
    }

    @Override // X.InterfaceC564930MDr
    public void iP1(boolean z) {
        InterfaceC1413600mtC interfaceC1413600mtCO2;
        if (C1414450muZ.LIZIZ(JY0().g().getValue(), getEditModel()) != null && (interfaceC1413600mtCO2 = o2()) != null) {
            interfaceC1413600mtCO2.DV(new C1413690mtL(false, z, EnumC1998707sH.CLEAR_FOR_AI_ALIVE));
        }
    }

    @Override // X.InterfaceC564930MDr
    public void KM0(boolean z, EnumC1998707sH enumC1998707sH) {
        EffectPointModel next;
        InterfaceC1414530muh interfaceC1414530muhX1;
        InterfaceC1413600mtC interfaceC1413600mtCO2;
        InterfaceC1414530muh interfaceC1414530muhX12 = X1();
        if (interfaceC1414530muhX12 != null) {
            interfaceC1414530muhX12.Ns1();
        }
        InterfaceC1413600mtC interfaceC1413600mtCO22 = o2();
        String str = null;
        if (interfaceC1413600mtCO22 != null) {
            interfaceC1413600mtCO22.AO1(null);
        }
        if (C1414450muZ.LIZIZ(JY0().g().getValue(), getEditModel()) != null && (interfaceC1413600mtCO2 = o2()) != null) {
            interfaceC1413600mtCO2.DV(new C1413690mtL(false, z, enumC1998707sH));
        }
        Iterator<EffectPointModel> it2 = getEditModel().getEditEffectModel().effectList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (C1533950q1J.LJ(next.musicId)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EffectPointModel effectPointModel = next;
        if (effectPointModel != null) {
            str = effectPointModel.musicId;
        }
        InterfaceC1413600mtC interfaceC1413600mtCO23 = o2();
        if (interfaceC1413600mtCO23 != null) {
            interfaceC1413600mtCO23.o80(str);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_force_insert_music_to_mix_editing", true) > 0) {
            if (C1414450muZ.LJIIJJI(getEditModel())) {
                InterfaceC1413600mtC interfaceC1413600mtCO24 = o2();
                if (interfaceC1413600mtCO24 != null) {
                    interfaceC1413600mtCO24.ON0();
                }
            } else if (C1414450muZ.LJIILIIL(getEditModel()) && (interfaceC1414530muhX1 = X1()) != null) {
                int iQr = interfaceC1414530muhX1.qr();
                InterfaceC1413600mtC interfaceC1413600mtCO25 = o2();
                if (interfaceC1413600mtCO25 != null) {
                    interfaceC1413600mtCO25.La1(iQr, EnumC1998707sH.CLEAR_FOR_AI_ALIVE);
                }
            }
        }
        InterfaceC1413600mtC interfaceC1413600mtCO26 = o2();
        if (interfaceC1413600mtCO26 != null) {
            interfaceC1413600mtCO26.F50();
        }
    }

    @Override // X.InterfaceC564930MDr
    public void Ti0(int i, int i2) {
        InterfaceC1413730mtP interfaceC1413730mtPZ1;
        C385670FAf<List<C1412800mru>> c385670FAfJ70;
        C1414620muq c1414620muq = C1414620muq.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC1412690mrj enumC1412690mrj = EnumC1412690mrj.AUTO_SHOW;
        AwS24S0002000_22 awS24S0002000_22 = new AwS24S0002000_22(i, i2, 1);
        c1414620muq.getClass();
        C1414620muq.LIZJ(jCurrentTimeMillis, enumC1412690mrj, awS24S0002000_22);
        InterfaceC1413730mtP interfaceC1413730mtPZ12 = Z1();
        if (interfaceC1413730mtPZ12 != null) {
            interfaceC1413730mtPZ12.zf1(false, true, true, false, new C1414520mug(i, i2));
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "studio_ai_alive_use_first_template", true) > 0 && (interfaceC1413730mtPZ1 = Z1()) != null && (c385670FAfJ70 = interfaceC1413730mtPZ1.j70()) != null) {
            c385670FAfJ70.LIZ(this, new AObjectS245S0100000_22(this, 161));
        }
    }

    @Override // X.InterfaceC564930MDr
    public void qV0(MixEditingMaterialModel mixEditingMaterialModel, InterfaceC1414490mud interfaceC1414490mud) {
        if (mixEditingMaterialModel == null) {
            return;
        }
        InterfaceC1414530muh interfaceC1414530muhX1 = X1();
        if (interfaceC1414530muhX1 != null && !interfaceC1414530muhX1.fe0()) {
            interfaceC1414530muhX1.OH1();
            interfaceC1414530muhX1.S72();
        }
        C1412800mru c1412800mruH2 = H2(mixEditingMaterialModel);
        if (c1412800mruH2 == null) {
            return;
        }
        InterfaceC1414530muh interfaceC1414530muhX12 = X1();
        if (interfaceC1414530muhX12 != null) {
            interfaceC1414530muhX12.F92(c1412800mruH2);
        }
        C1412440mrK c1412440mrK = C1412440mrK.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 613);
        c1412440mrK.getClass();
        C1412440mrK.LJIIIZ(editModel, c1412800mruH2, 1, true, awS566S0100000_22);
        if (interfaceC1414490mud != null) {
            this.LLIZLLLIL = new Pair<>(c1412800mruH2, interfaceC1414490mud);
            final C1414480muc c1414480muc = this.LLJ;
            final AwS388S0200000_22 awS388S0200000_22 = new AwS388S0200000_22(interfaceC1414490mud, c1412800mruH2, this, 119);
            c1414480muc.getClass();
            C201955140j.LIZJ(C0L76.LIZIZ, "MixEditingMaterialAiAliveComponent -> TimeoutHandler -> onStart");
            PthreadTimer pthreadTimer = c1414480muc.LIZIZ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
            }
            PthreadTimer pthreadTimer2 = new PthreadTimer("imeoutHandler");
            c1414480muc.LIZIZ = pthreadTimer2;
            pthreadTimer2.schedule(new C0W9W() { // from class: X.0T5F
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("TimeoutHandler@5dd3.onStart$2");
                    boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                    try {
                        awS388S0200000_22.invoke(Long.valueOf(c1414480muc.LIZ));
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("TimeoutHandler@5dd3.onStart$2");
                }
            }, c1414480muc.LIZ);
        }
        C0L76 c0l76 = C0L76.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingMaterialAiAliveComponent -> applyMaterial, targetPosition = ");
        sbLIZ.append(1);
        sbLIZ.append(' ');
        C201955140j.LIZJ(c0l76, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1413600mtC interfaceC1413600mtCO2 = o2();
        if (interfaceC1413600mtCO2 != null) {
            interfaceC1413600mtCO2.AO1(c1412800mruH2);
            interfaceC1413600mtCO2.GI2(1, c1412800mruH2, true);
        }
    }
}
