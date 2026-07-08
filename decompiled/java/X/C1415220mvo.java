package X;

import Y.AObjectS245S0100000_22;
import Y.AfS157S0200000_22;
import Y.AfS182S0100000_13;
import androidx.lifecycle.LiveData;
import ayh.i5;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback;
import com.bytedance.ies.nle.editor_jni.NLEApplyPatchShims;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceProtocol;
import com.bytedance.ies.nle.editor_jni.NLELokiResourceType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESafetyApplyPatchToken;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.n;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.utils.oh;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestApi;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS10S0000001_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS53S0100100_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415220mvo extends i<InterfaceC1459560o5K, C1415280mvu, C1412020mqe, C1415240mvq> implements InterfaceC379610EuV, InterfaceC1459560o5K {
    public static final C1415250mvr LLLILZLLLI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public static final int LLLJ;
    public static final float LLLJIL;
    public final C1DRG LLJILJILJ;
    public final Function0<C1415280mvu> LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public NLESafetyApplyPatchToken LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public NLEApplyPatchShims LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public InterfaceC420801kM LLJLL;
    public List<NLEModel> LLJLLIL;
    public final NLEEditor LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public long LLL;
    public float LLLF;
    public float LLLFF;
    public boolean LLLFFI;
    public Float LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIIL;
    public Boolean LLLIILIL;
    public boolean LLLIL;
    public String LLLILZ;
    public boolean LLLILZJ;

    public final void closePanel() {
        LJJ(false);
        C1412000mqc.LJFF(d6(), getEditModel(), EnumC1412010mqd.TAP_SCREEN.getValue());
        if (Intrinsics.LJFF(this.LLLIILIL, Boolean.TRUE)) {
            this.LLLIILIL = Boolean.FALSE;
            K4();
        }
        i3(AFwS261S0000000_22.get$arr$(209));
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.0mvr] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1415220mvo.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C13LE.LIZ.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1415220mvo.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1415220mvo.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1415220mvo.class, "toolbarApiComponent", "getToolbarApiComponent()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C2217381BqS(C1415220mvo.class, "editRecommendEffectGuideApi", "getEditRecommendEffectGuideApi()Lcom/ss/android/ugc/gamora/editor/recommendeffect/RecommendEffectGuideApi;", 0), new C2217381BqS(C1415220mvo.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C1415220mvo.class, "editCommonGuideHelper", "getEditCommonGuideHelper()Lcom/ss/android/ugc/gamora/editor/toolbar/EditCommonGuideHelper;", 0), new C2217381BqS(C1415220mvo.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0), new C2217381BqS(C1415220mvo.class, "editEffectModelApiComponent", "getEditEffectModelApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectModelApiComponent;", 0), new C2217381BqS(C1415220mvo.class, "editorProSlideApi", "getEditorProSlideApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/in/EditorProSlideApi;", 0), new C2217381BqS(C1415220mvo.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0)};
        LLLILZLLLI = new Object() { // from class: X.0mvr
        };
        LLLJ = 8;
        LLLJIL = C418440Gaw.LIZIZ(104);
    }

    private final InterfaceC364140EPk D5() {
        return (InterfaceC364140EPk) this.LLJJJJJIL.getValue(this, LLLIZZ[8]);
    }

    private final InterfaceC1461350o8D H5() {
        return (InterfaceC1461350o8D) this.LLJJJ.getValue(this, LLLIZZ[5]);
    }

    private final InterfaceC372680EjK N5() {
        return (InterfaceC372680EjK) this.LLJJJJLIIL.getValue(this, LLLIZZ[9]);
    }

    private final InterfaceC1461390o8H R5() {
        return (InterfaceC1461390o8H) this.LLJJ.getValue(this, LLLIZZ[0]);
    }

    private final String t5() {
        return new BDDateFormat("LLLL").LIZIZ(System.currentTimeMillis(), ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getCountryLocale());
    }

    private final InterfaceC1460000o62 u6() {
        return (InterfaceC1460000o62) this.LLJJIJIIJIL.getValue(this, LLLIZZ[3]);
    }

    private final InterfaceC1417050myl x5() {
        return (InterfaceC1417050myl) this.LLJJJJ.getValue(this, LLLIZZ[7]);
    }

    public final C1459920o5u C5() {
        return (C1459920o5u) this.LLJJJIL.getValue(this, LLLIZZ[6]);
    }

    public final InterfaceC1415210mvn E5() {
        return (InterfaceC1415210mvn) this.LLJJIJIL.getValue(this, LLLIZZ[4]);
    }

    public final InterfaceC1416920myY J6() {
        return (InterfaceC1416920myY) this.LLJL.getValue();
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIII.getValue(this, LLLIZZ[1]);
    }

    public final void K4() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLESafetyApplyPatchToken nLESafetyApplyPatchToken = this.LLJJI;
        if (nLESafetyApplyPatchToken != null) {
            nLESafetyApplyPatchToken.cancel();
        }
        this.LLLILZ = "";
        P6(false, true);
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            C350410DoV.LIZ(nLEEditor, true, true);
        }
        getEditModel().getEffectList().clear();
        i3(AFwS261S0000000_22.get$arr$(208));
    }

    public final InterfaceC377540ErA M5() {
        return (InterfaceC377540ErA) this.LLJJL.getValue(this, LLLIZZ[10]);
    }

    public final void P4() {
        if (this.LLLIIIL) {
            return;
        }
        this.LLLIIIL = true;
        if (C255690A0h.LIZ()) {
            L6(J6().LIZJ(EnumC2288308xt.RECOMMEND_EFFECT));
        } else {
            String strLIZIZ = C2275708vr.LIZIZ();
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            L6(strLIZIZ);
        }
        i3(AFwS261S0000000_22.get$arr$(210));
    }

    public final SafeHandler S5() {
        return (SafeHandler) this.LLLI.getValue();
    }

    public final float U5() {
        return ((Number) this.LLLIIII.getValue()).floatValue();
    }

    public final RecommendEffectItem d5() {
        return new RecommendEffectItem("", "", false, 1.0f, "", "", null, 0, true);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLLIZZ[2]);
    }

    public final C1416200mxO m6() {
        return (C1416200mxO) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1412020mqe> o2() {
        return new AwS566S0100000_22(this, 699);
    }

    public final Runnable v5() {
        return (Runnable) this.LLLII.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1415240mvq> w2() {
        return new AwS566S0100000_22(this, 697);
    }

    @Override // X.InterfaceC1459560o5K
    public boolean Dv0() {
        Iterator<RecommendEffectItem> it2 = T2().LIZLLL.iterator();
        while (it2.hasNext()) {
            if (!it2.next().LIZIZ) {
                return true;
            }
        }
        return false;
    }

    public final void Z4() {
        C348100Dkm c348100DkmLIZIZ;
        final InterfaceC1446740nke interfaceC1446740nke;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null) {
            return;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        C1DRG diContainer = getDiContainer();
        c363500EMy.getClass();
        NLEModel model = c348100DkmLIZIZ.LIZ.getModel();
        C366130EXb c366130EXb = new C366130EXb(diContainer);
        final C348100Dkm c348100DkmLIZ = ((C366320EXu) c366130EXb.LLILLL.getValue()).LIZ();
        if (c348100DkmLIZ != null && (interfaceC1446740nke = ((C366320EXu) c366130EXb.LLILLL.getValue()).LIZ) != null) {
            C0EYI.LIZ(model, editModel, new C0EYK() { // from class: X.0EYN
                @Override // X.C0EYK
                public final boolean LIZ() {
                    Boolean value2 = interfaceC1446740nke.sc1().getValue();
                    if (value2 != null) {
                        return value2.booleanValue();
                    }
                    return false;
                }

                @Override // X.C0EYK
                public final int getDuration() {
                    return c348100DkmLIZ.LJIIIIZZ().getDuration();
                }

                @Override // X.C0EYK
                public final List<EffectPointModel> o9() {
                    return interfaceC1446740nke.o9();
                }

                @Override // X.C0EYK
                public final void LIZIZ(C0EYM c0eym) {
                    interfaceC1446740nke.dS1().setValue(c0eym);
                }
            }, null, C13BV.INSTANCE);
        }
        EffectPointModel effectPointModel = (EffectPointModel) C13LP.LJJJLL(JY0().o9());
        Iterator<EffectPointModel> it2 = getEditModel().getEffectList().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            EffectPointModel next = it2.next();
            if (Intrinsics.LJFF(next.getResourceId(), effectPointModel != null ? effectPointModel.getResourceId() : null)) {
                if (next != null) {
                    return;
                }
            }
        }
        if (effectPointModel != null) {
            getEditModel().getEffectList().add(effectPointModel);
        }
    }

    public final int d6() {
        Integer num;
        if (!Dv0() || (num = T2().LIZIZ) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151  */
    @Override // ge.i, X.AbstractC2255721DQs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415220mvo.onCreate():void");
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (C1411980mqa.LIZ()) {
            LJJ(true);
        }
    }

    @Override // ge.i
    public Function0<C1415280mvu> E3() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    private final void H4(NLESegment nLESegment) {
        NLELokiResourceProtocol nLELokiResourceProtocolNLELokiResourceProtocolWithURS;
        NLELokiResourceType type;
        String effectId;
        NLELokiResourceProtocol nLELokiResourceProtocolNLELokiResourceProtocolWithURS2;
        NLELokiResourceType type2;
        String effectId2;
        NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(nLESegment);
        if (nLESegmentEffectDynamicCast != null && (type2 = (nLELokiResourceProtocolNLELokiResourceProtocolWithURS2 = NLELokiResourceProtocol.NLELokiResourceProtocolWithURS(nLESegmentEffectDynamicCast.getEffectSDKEffect().getResourceId())).getType()) != null) {
            int i = C356290Dxz.LIZ[type2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    effectId2 = nLELokiResourceProtocolNLELokiResourceProtocolWithURS2.getResourceId();
                }
            } else {
                effectId2 = nLELokiResourceProtocolNLELokiResourceProtocolWithURS2.getEffectId();
            }
            if (effectId2 != null) {
                nLESegmentEffectDynamicCast.getEffectSDKEffect().setResourceId(effectId2);
            }
        }
        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLESegment);
        if (nLESegmentComposerFilterDynamicCast != null && (type = (nLELokiResourceProtocolNLELokiResourceProtocolWithURS = NLELokiResourceProtocol.NLELokiResourceProtocolWithURS(nLESegmentComposerFilterDynamicCast.getEffectSDKFilter().getResourceId())).getType()) != null) {
            int i2 = C356290Dxz.LIZ[type.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    effectId = nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getResourceId();
                } else {
                    return;
                }
            } else {
                effectId = nLELokiResourceProtocolNLELokiResourceProtocolWithURS.getEffectId();
            }
            if (effectId != null) {
                nLESegmentComposerFilterDynamicCast.getEffectSDKFilter().setResourceId(effectId);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[PHI: r9
      0x0016: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:10:0x0014, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[PHI: r9
      0x001a: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:10:0x0014, B:12:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams n5(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1415220mvo.n5(java.lang.String):com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectRequestParams");
    }

    @Override // X.InterfaceC1459560o5K
    public void BC1(String str) {
        if (T2().LIZ) {
            S5().removeCallbacks(v5());
            LJJ(false);
            C1412000mqc.LJFF(d6(), getEditModel(), str);
        }
    }

    @Override // X.InterfaceC1459560o5K
    public void C50(int[] iArr) {
        float fLIZIZ;
        if (!this.LLLILZJ && iArr.length > 1) {
            this.LLLILZJ = true;
            if (C1415610mwR.LIZ() <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(667))) {
                fLIZIZ = C418440Gaw.LIZIZ(16);
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(40);
            }
            Float fValueOf = Float.valueOf((iArr[1] - LLLJIL) - fLIZIZ);
            this.LLLFZ = fValueOf;
            if (fValueOf != null) {
                i3(new AwS10S0000001_22(fValueOf.floatValue(), 1));
            }
        }
    }

    public final void K6(final String str) {
        C13OY c13oy = m6().LIZ;
        if (c13oy != null) {
            c13oy.LJIIIIZZ(C1697810uHb.LJ(str), null, new C13MA<EffectListResponse>() { // from class: X.0mwa
                @Override // X.C13MA
                public final void onSuccess(EffectListResponse effectListResponse) {
                    EffectListResponse effectListResponse2 = effectListResponse;
                    if (!effectListResponse2.getEffect_list().isEmpty()) {
                        Effect effect = (Effect) ListProtector.get(effectListResponse2.getEffect_list(), 0);
                        this.LIZ.m6().LIZIZ.put(str, effect);
                        C13OY c13oy2 = this.LIZ.m6().LIZ;
                        if (c13oy2 != null) {
                            c13oy2.LJI(effect, true, true, true, null);
                        }
                    }
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(EffectListResponse effectListResponse) {
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void onFail(EffectListResponse effectListResponse, C1662010tLr c1662010tLr) {
                }
            });
        }
    }

    public final void L6(String str) {
        String str2;
        String str3;
        C1412000mqc.LIZIZ("edit_recommend_effect_request_net_info", C2097908Jt.LIZJ(new Pair("net_type", Integer.valueOf(C2215011Bmd.LIZIZ()))));
        if (C123100dR.LIZ(str)) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        int i = 1;
        C1412000mqc.LIZIZ("edit_recommend_effect_request_tos_url", C2097608Jq.LJIIJ(new Pair("status_code", str2)));
        if (str != null && str.length() != 0) {
            i = 0;
        }
        C1637890six.LJ("edit_recommend_effect_request_tos_url", i, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        RecommendEffectRequestApi recommendEffectRequestApi = new RecommendEffectRequestApi();
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        RecommendEffectRequestParams recommendEffectRequestParamsN5 = n5(str3);
        C1415230mvp c1415230mvp = new C1415230mvp(this, str, jCurrentTimeMillis);
        AwS53S0100100_22 awS53S0100100_22 = new AwS53S0100100_22(this, jCurrentTimeMillis, 2);
        ((RecommendEffectRequestApi.Api) recommendEffectRequestApi.LIZ.getValue()).getRecommendEffects(recommendEffectRequestParamsN5.returnSize, recommendEffectRequestParamsN5.tosUrl, recommendEffectRequestParamsN5.algorithmKey, recommendEffectRequestParamsN5.resolutionList, recommendEffectRequestParamsN5.videoLengthList, recommendEffectRequestParamsN5.shootWay, recommendEffectRequestParamsN5.contentSource, recommendEffectRequestParamsN5.materialType, recommendEffectRequestParamsN5.isMultiContent, recommendEffectRequestParamsN5.mixType, recommendEffectRequestParamsN5.musicId, recommendEffectRequestParamsN5.stickerIdList, recommendEffectRequestParamsN5.effectIdList, recommendEffectRequestParamsN5.propIdList, recommendEffectRequestParamsN5.textList, recommendEffectRequestParamsN5.sdkVersion, recommendEffectRequestParamsN5.appVersion).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS157S0200000_22(awS53S0100100_22, c1415230mvp, 5), new AfS182S0100000_13(recommendEffectRequestApi, awS53S0100100_22, 93));
    }

    @Override // X.InterfaceC1459560o5K
    public void LJJ(boolean z) {
        i3(new AwS35S0010000_22(z, 25));
        if (z) {
            InterfaceC372680EjK interfaceC372680EjKN5 = N5();
            if (interfaceC372680EjKN5 != null) {
                interfaceC372680EjKN5.Yg0();
            }
            C1412000mqc.LIZIZ("effects_scroll_wheel_icon_fade_in", C1412000mqc.LIZ(getEditModel()));
            oh.LIZJ("tool_recommend_effect_edit_page", i5.LIZIZ(), -1L, null, null);
            return;
        }
        oh.LJ("tool_recommend_effect_edit_page");
    }

    public final int O4(float f) {
        return (int) ((f / (C1415610mwR.LIZIZ() / 2.0f)) * (C418440Gaw.LIZIZ(60) + U5()));
    }

    @Override // X.InterfaceC1459560o5K
    public void Rr1(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public final void T6(InterfaceC1455610nyx interfaceC1455610nyx) {
        LiveData<Boolean> liveDataPy1;
        interfaceC1455610nyx.x8().observe(this, new AObjectS245S0100000_22(this, 187));
        if ((interfaceC1455610nyx instanceof InterfaceC1460000o62) && (liveDataPy1 = interfaceC1455610nyx.Py1()) != null) {
            liveDataPy1.observe(this, new AObjectS245S0100000_22(this, 188));
        }
        interfaceC1455610nyx.ww().observe(this, new AObjectS245S0100000_22(this, 189));
    }

    public final void k5(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.LLJLLL.restore(it2.next());
            this.LLJLLIL.add(this.LLJLLL.getModel());
        }
    }

    @Override // X.InterfaceC1459560o5K
    public void ng1(boolean z) {
        i3(new AwS35S0010000_22(z, 26));
    }

    @Override // X.InterfaceC1459560o5K
    public void oS(boolean z) {
        this.LLLIIIIL = z;
        if (z) {
            if (Dv0() && Intrinsics.LJFF(this.LLLIILIL, Boolean.TRUE) && !T2().LJI) {
                i3(AFwS261S0000000_22.get$arr$(206));
                return;
            }
            return;
        }
        if (!Dv0() || !Intrinsics.LJFF(this.LLLIILIL, Boolean.TRUE) || !T2().LJI) {
            return;
        }
        i3(AFwS261S0000000_22.get$arr$(207));
    }

    public C1415220mvo(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = new AwS566S0100000_22(this, 698);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1460000o62.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1415210mvn.class, null);
        this.LLJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1459920o5u.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC364140EPk.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC372680EjK.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(232));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(230));
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = C346630DiP.LIZ();
        this.LLJZ = true;
        this.LLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, OppoPermissionPopupMaskDelayExp.DEFAULT));
        this.LLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 696));
        this.LLLIIII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(231));
        this.LLLIIIIL = true;
        this.LLLIL = true;
        this.LLLILZ = "";
    }

    public final void P6(boolean z, boolean z2) {
        i3(new C1411990mqb(z, z2));
    }

    public final void T4(int i, String str) {
        NLEModel nLEModelLIZ;
        VecNLETrackSPtr tracks;
        NLEResourceNode effectSDKFilter;
        String resource_id;
        String resource_id2;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value != null && (nLEModelLIZ = C352130DrH.LIZ(value)) != null && (tracks = nLEModelLIZ.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                NLETrackType trackType = nLETrack.getTrackType();
                NLETrackType nLETrackType = NLETrackType.EFFECT;
                if (trackType == nLETrackType && Intrinsics.LJFF(nLETrack.getUUID(), ((NLEModel) ListProtector.get(this.LLJLLIL, i - 1)).getTracks().get(0).getUUID())) {
                    nLETrack.setExtra("EffectTrackType", "NORMAL");
                    nLETrack.setExtra("track_type", "video_effect");
                    nLETrack.setExtraTrackType(nLETrackType);
                    for (NLETrackSlot nLETrackSlot : C13LP.LL(nLETrack.getSortedSlots(), 1)) {
                        if (nLETrackSlot.getEndTime() == -2) {
                            nLETrackSlot.setEndTime(nLEModelLIZ.getMainTrack().getMeasuredEndTime());
                        }
                        nLETrackSlot.setExtra("extra_video_effect_source", String.valueOf(EnumC356310Dy1.EDIT_RECOMMEND.getValue()));
                        NLESegment mainSegment = nLETrackSlot.getMainSegment();
                        if (mainSegment != null) {
                            H4(mainSegment);
                            mainSegment.setExtra("nleExtraEffectType", CardStruct.IStatusCode.DEFAULT);
                            mainSegment.setExtra("nleExtraEffectSelectedColor", String.valueOf(C0F4X.LIZIZ(i)));
                            mainSegment.setExtra("nleExtraEffectKey", str);
                            mainSegment.setExtra("nleExtraEffectSelectFrom", "carousel");
                            mainSegment.setExtra("nleExtraEffectExtra", "");
                            mainSegment.setExtra("nleExtraEffectEntrancePoint", "edit_page");
                            mainSegment.setExtra("nleExtraEffectIndex", String.valueOf(i));
                            mainSegment.setExtra("original_effect_order", String.valueOf(C348400DlG.LIZ(nLEModelLIZ) + 1));
                            mainSegment.setExtra("original_effect_carousel", "1");
                            NLESegmentEffect nLESegmentEffectDynamicCast = NLESegmentEffect.dynamicCast(mainSegment);
                            if (nLESegmentEffectDynamicCast != null) {
                                NLEResourceNode effectSDKEffect = nLESegmentEffectDynamicCast.getEffectSDKEffect();
                                if (effectSDKEffect != null) {
                                    Effect effect = (Effect) ((LinkedHashMap) m6().LIZIZ).get(str);
                                    if (effect != null) {
                                        resource_id2 = effect.getResource_id();
                                    } else {
                                        resource_id2 = null;
                                    }
                                    effectSDKEffect.setExtra("biz_res_id", C0FGD.LIZ(resource_id2, C1451980nt6.LIZ("normal_effect")));
                                }
                                Pair pair = (Pair) ((LinkedHashMap) m6().LIZJ).get(str);
                                if (pair != null) {
                                    boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                                    boolean zBooleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
                                    n nVar = new n();
                                    if (zBooleanValue) {
                                        nVar.LJJIIJ("info_effect_time", t5());
                                    }
                                    if (zBooleanValue2) {
                                        nVar.LJJIIJ("info_effect_location", ((RecommendEffectItem) ListProtector.get(T2().LIZLLL, i)).locationCity);
                                    }
                                    nLESegmentEffectDynamicCast.setJsonParam(nVar.toString());
                                }
                            }
                            NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment);
                            if (nLESegmentComposerFilterDynamicCast != null && (effectSDKFilter = nLESegmentComposerFilterDynamicCast.getEffectSDKFilter()) != null) {
                                Effect effect2 = (Effect) ((LinkedHashMap) m6().LIZIZ).get(str);
                                if (effect2 != null) {
                                    resource_id = effect2.getResource_id();
                                } else {
                                    resource_id = null;
                                }
                                effectSDKFilter.setExtra("biz_res_id", C0FGD.LIZ(resource_id, C1451980nt6.LIZ("normal_effect")));
                            }
                        }
                    }
                }
            }
        }
    }

    public final void F4(final String str, final int i, final String str2, final boolean z) {
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        NLEModel nLEModelLIZ;
        C348100Dkm c348100DkmLIZIZ2;
        NLEEditor nLEEditor;
        List<NLETrack> listLIZIZ;
        if (i <= this.LLJLLIL.size() && (value = JY0().g().getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && c348100DkmLIZIZ.LIZ != null) {
            InterfaceC1452170ntP value2 = JY0().g().getValue();
            NLESafetyApplyPatchToken nLESafetyApplyPatchTokenApplyNLEModel = null;
            if (value2 != null) {
                nLEModelLIZ = C352130DrH.LIZ(value2);
            } else {
                nLEModelLIZ = null;
            }
            NLEApplyPatchShims nLEApplyPatchShims = new NLEApplyPatchShims(nLEModelLIZ);
            this.LLJLIL = nLEApplyPatchShims;
            nLEApplyPatchShims.rebindNLEModel(nLEModelLIZ);
            i3(AFwS261S0000000_22.get$arr$(203));
            if (nLEModelLIZ != null && (listLIZIZ = C348520DlS.LIZIZ(nLEModelLIZ)) != null) {
                Iterator<NLETrack> it2 = listLIZIZ.iterator();
                while (it2.hasNext()) {
                    nLEModelLIZ.removeTrack(it2.next());
                }
            }
            InterfaceC1452170ntP value3 = JY0().g().getValue();
            if (value3 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value3)) != null && (nLEEditor = c348100DkmLIZIZ2.LIZ) != null) {
                C350410DoV.LIZ(nLEEditor, true, true);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.LLLIILIL = Boolean.TRUE;
            this.LLLILZ = str;
            NLESafetyApplyPatchToken nLESafetyApplyPatchToken = this.LLJJI;
            if (nLESafetyApplyPatchToken != null) {
                nLESafetyApplyPatchToken.cancel();
            }
            INLEApplyPatchCallback iNLEApplyPatchCallback = new INLEApplyPatchCallback() { // from class: X.0mvU
                @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
                public final void onProgress(NLEModel nLEModel, float f) {
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
                public final void onSuccess(NLEModel nLEModel) throws JSONException {
                    C1415220mvo c1415220mvo = this.LIZ;
                    c1415220mvo.LLLIILIL = Boolean.FALSE;
                    C01TT.LIZLLL(new C1415110mvd(c1415220mvo, i, str, z));
                    C1412000mqc.LIZJ(str, "", i, 0, Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)));
                    JSONObject jSONObject = new JSONObject();
                    String str3 = str;
                    long j = jCurrentTimeMillis;
                    jSONObject.put("effect_id", str3);
                    jSONObject.put("durationMs", (int) (System.currentTimeMillis() - j));
                    C1637890six.LJ("edit_recommend_effect_apply_info", 0, jSONObject);
                }

                @Override // com.bytedance.ies.nle.editor_jni.INLEApplyPatchCallback
                public final void onError(NLEModel nLEModel, String str3) throws JSONException {
                    C348100Dkm c348100DkmLIZIZ3;
                    NLEEditor nLEEditor2;
                    String str4 = str;
                    int i2 = i;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C1412000mqc.LIZJ(str4, str3, i2, 1, null);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("effect_id", str);
                    C1637890six.LJ("edit_recommend_effect_apply_info", 1, jSONObject);
                    C1415220mvo c1415220mvo = this.LIZ;
                    if (c1415220mvo.LLLIL && Intrinsics.LJFF(c1415220mvo.LLLIILIL, Boolean.TRUE)) {
                        C1415220mvo c1415220mvo2 = this.LIZ;
                        c1415220mvo2.LLLIL = false;
                        c1415220mvo2.F4(str, i, str2, z);
                    } else {
                        InterfaceC1452170ntP value4 = this.LIZ.JY0().g().getValue();
                        if (value4 == null || (c348100DkmLIZIZ3 = C352130DrH.LIZIZ(value4)) == null || (nLEEditor2 = c348100DkmLIZIZ3.LIZ) == null) {
                            return;
                        }
                        C350410DoV.LIZ(nLEEditor2, true, true);
                    }
                }
            };
            NLEApplyPatchShims nLEApplyPatchShims2 = this.LLJLIL;
            if (nLEApplyPatchShims2 != null) {
                nLESafetyApplyPatchTokenApplyNLEModel = nLEApplyPatchShims2.applyNLEModel((NLEModel) ListProtector.get(this.LLJLLIL, i - 1), iNLEApplyPatchCallback);
            }
            this.LLJJI = nLESafetyApplyPatchTokenApplyNLEModel;
            iNLEApplyPatchCallback.delete();
        }
    }
}
