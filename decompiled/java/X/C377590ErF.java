package X;

import Y.AComparatorS22S0000000_3;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.AlgoRaw;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCInfoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.ImageGenTaskConfig;
import com.ss.android.ugc.gamora.editorpro.aigc.utils.EditorProAIGCStylizedStagesBuilder;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.ss.android.ugc.tools.utils.FileIdentifierModel;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ErF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377590ErF extends AbstractC381020Ewm<InterfaceC377650ErL> implements InterfaceC377650ErL, InterfaceC379610EuV {
    public static final C378060Es0 LLJLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final int LLJZ;
    public final C1DRG LLILLL;
    public final Scene LLILZ;
    public final InterfaceC1731706qJ LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public C09AE LLJIJIL;
    public boolean LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public String LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final AsyncTasksPanelViewModel LLJJI;
    public final CutViewModel LLJJIII;
    public final h0<C377750ErV> LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final h0<C040900Cp> LLJJIJIL;
    public final h0<C377660ErM> LLJJJ;
    public final h0<C377660ErM> LLJJJIL;
    public final h0<C377660ErM> LLJJJJ;
    public final Set<String> LLJJJJJIL;
    public final Set<String> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public EditorProAIGCMediaItemModel LLJLILLLLZIIL;
    public AIGCGenerationParamType LLJLL;

    public InterfaceC377650ErL e4() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0Es0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C377590ErF.class, "trackGenerateApi", "getTrackGenerateApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/i2v/I2vTrackGeneratingApi;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C377590ErF.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C377590ErF.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0), new C2217381BqS(C377590ErF.class, "editorProAIGCResultsPanelApi", "getEditorProAIGCResultsPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0), new C2217381BqS(C377590ErF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C377590ErF.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new C2217381BqS(C377590ErF.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/gamora/editorpro/framework/bottombar/ui/BottomBarApiComponent;", 0), new C2217381BqS(C377590ErF.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0), new C2217381BqS(C377590ErF.class, "asyncTasksManagerApi", "getAsyncTasksManagerApi()Lcom/ss/android/ugc/gamora/editorpro/components/asyncedit/api/AsyncTasksManagerApi;", 0)};
        LLJLLIL = new Object() { // from class: X.0Es0
        };
        LLJZ = 8;
    }

    private final InterfaceC1455860nzM K4() {
        return (InterfaceC1455860nzM) this.LLJ.getValue(this, LLJLLL[4]);
    }

    private final InterfaceC377540ErA T4() {
        return (InterfaceC377540ErA) this.LLJI.getValue(this, LLJLLL[5]);
    }

    private final C0EY2 Z4() {
        return (C0EY2) this.LLILZLL.getValue(this, LLJLLL[1]);
    }

    private final void c3() {
        C201955140j.LIZLLL(C559380Lwm.LIZIZ, "EditorProAIGCComponent", "cancelObserveTaskStatus");
        C09AE c09ae = this.LLJIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJIJIL = null;
    }

    private final InterfaceC381940EyG k5() {
        return (InterfaceC381940EyG) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final InterfaceC376450EpP o4() {
        return (InterfaceC376450EpP) this.LLJLIL.getValue(this, LLJLLL[8]);
    }

    public final InterfaceC363160ELq C5() {
        return (InterfaceC363160ELq) this.LLILZIL.getValue(this, LLJLLL[0]);
    }

    public final InterfaceC360800ECo F4() {
        return (InterfaceC360800ECo) this.LLJJ.getValue(this, LLJLLL[7]);
    }

    public final void N5() {
        MutableLiveData<C377380Equ> mutableLiveData;
        MutableLiveData<C377360Eqs> mutableLiveData2;
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLJJI;
        if (asyncTasksPanelViewModel != null && (mutableLiveData2 = asyncTasksPanelViewModel.LLJJIJIIJIL) != null) {
            mutableLiveData2.observe(this, new AObserverS209S0100000_5(this, 30));
        }
        AsyncTasksPanelViewModel asyncTasksPanelViewModel2 = this.LLJJI;
        if (asyncTasksPanelViewModel2 == null || (mutableLiveData = asyncTasksPanelViewModel2.LLJJIJIL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS209S0100000_5(this, 31));
    }

    public final InterfaceC377410Eqx O4() {
        return (InterfaceC377410Eqx) this.LLIZLLLIL.getValue(this, LLJLLL[3]);
    }

    public final C363040ELe P4() {
        return (C363040ELe) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC378020Erw d5() {
        return (InterfaceC378020Erw) this.LLJJL.getValue();
    }

    @Override // X.InterfaceC377650ErL
    public boolean sm2() {
        C377760ErW c377760ErW;
        C377750ErV c377750ErVLIZJ = this.LLJJIJI.LIZJ();
        return (c377750ErVLIZJ == null || (c377760ErW = c377750ErVLIZJ.LJI) == null || c377760ErW.LIZIZ != 3019014) ? false : true;
    }

    public final InterfaceC355850DxH v5() {
        return (InterfaceC355850DxH) this.LLJL.getValue();
    }

    public final C0E5S x5() {
        return (C0E5S) this.LLIZ.getValue(this, LLJLLL[2]);
    }

    public final C0EGY z4() {
        return (C0EGY) this.LLJILJILJ.getValue(this, LLJLLL[6]);
    }

    private final NLEModel LLZ() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            return C350870DpF.LJI(c0e48W1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[PHI: r2
      0x0090: PHI (r2v2 int) = (r2v1 int), (r2v5 int) binds: [B:23:0x008d, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String E3() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9 = r10.getEditModel()
            java.lang.String r8 = ""
            if (r9 != 0) goto L9
            return r8
        L9:
            X.0E48 r0 = r10.W1()
            r7 = 0
            if (r0 == 0) goto L14
            kotlin.Pair r7 = r0.getCanvasSize()
        L14:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0MYj r2 = r0.getPathService()
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r1 = r9.getCreativeInfo()
            X.14Cy r5 = X.EnumC20228214Cy.EDITOR_PRO_AIGC
            java.lang.String r4 = "grey_bg.png"
            r0 = 0
            java.lang.String r1 = r2.LJIILJJIL(r1, r5, r4, r0)
            boolean r0 = X.C2286708xd.LIZJ(r1)
            if (r0 == 0) goto L34
            return r1
        L34:
            X.09oj r6 = X.C2486309oj.LIZ
            r3 = 1
            if (r7 == 0) goto L8b
            java.lang.Object r0 = r7.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L8b
            int r2 = r1.intValue()
        L51:
            java.lang.Object r0 = r7.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r1.intValue()
            if (r0 <= 0) goto L90
            int r0 = r1.intValue()
        L69:
            r6.getClass()
            android.graphics.Bitmap r2 = X.C2486309oj.LIZ(r2, r0)
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0Moe r0 = r0.LJJIIJZLJL()
            X.0MYj r1 = r0.getPathService()
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r9.getCreativeInfo()
            X.0VSJ r0 = r1.LIZJ(r0, r5, r4, r3)
            java.lang.String r0 = X.C2486309oj.LIZJ(r2, r0)
            if (r0 == 0) goto L93
            return r0
        L8b:
            r2 = 720(0x2d0, float:1.009E-42)
            if (r7 == 0) goto L90
            goto L51
        L90:
            r0 = 1280(0x500, float:1.794E-42)
            goto L69
        L93:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.E3():java.lang.String");
    }

    @Override // X.InterfaceC377650ErL
    public void KJ0() {
        InterfaceC363020ELc interfaceC363020ELcXG2;
        InterfaceC363160ELq interfaceC363160ELqC5 = C5();
        if (interfaceC363160ELqC5 == null || (interfaceC363020ELcXG2 = interfaceC363160ELqC5.xG2()) == null) {
            return;
        }
        interfaceC363020ELcXG2.LIZJ();
    }

    public final void M5() {
        if (getCreationId().length() == 0) {
            return;
        }
        c3();
        this.LLJIJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C377630ErJ(this, null), 3);
    }

    public final void P6() {
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null) {
            if (editModel.mIsFromDraft || editModel.isFromCrash()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C377600ErG(this, editModel, null), 3);
            }
        }
    }

    public final void Xi() {
        LiveData<Pair<List<NLETrackSlot>, List<NLETrackSlot>>> liveDataNU1;
        AbstractC1452680nuE abstractC1452680nuEGc;
        C0E5S c0e5sX5;
        LiveData<C0E75> liveDataDQ;
        LiveData<Unit> liveDataTl0;
        C0EY2 c0ey2Z4 = Z4();
        if (c0ey2Z4 != null && (liveDataTl0 = c0ey2Z4.Tl0()) != null) {
            liveDataTl0.observe(this, new AObserverS209S0100000_5(this, 27));
        }
        if (C378010Erv.LIZ() && (c0e5sX5 = x5()) != null && (liveDataDQ = c0e5sX5.dQ()) != null) {
            liveDataDQ.observe(this, new AObserverS209S0100000_5(this, 28));
        }
        InterfaceC1455860nzM interfaceC1455860nzMK4 = K4();
        if (interfaceC1455860nzMK4 != null && (abstractC1452680nuEGc = interfaceC1455860nzMK4.gc()) != null) {
            abstractC1452680nuEGc.LJJ().Ef(new AwS584S0100000_5(this, 207));
        }
        C0E5S c0e5sX52 = x5();
        if (c0e5sX52 == null || (liveDataNU1 = c0e5sX52.NU1()) == null) {
            return;
        }
        liveDataNU1.observe(this, new AObserverS209S0100000_5(this, 29));
    }

    public final String getCreationId() {
        String creationId;
        VideoPublishEditModel editModel = getEditModel();
        return (editModel == null || (creationId = editModel.getCreationId()) == null) ? "" : creationId;
    }

    public final VideoPublishEditModel getEditModel() {
        C0EY2 c0ey2Z4 = Z4();
        if (c0ey2Z4 != null) {
            return c0ey2Z4.getEditModel();
        }
        return null;
    }

    public final NLEEditor n5() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            return c0e48W1.LLFII().LJI();
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        c3();
    }

    @Override // X.InterfaceC377650ErL
    public C385670FAf<C040900Cp> Da2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC377650ErL
    public C385670FAf<C377660ErM> F21() {
        return this.LLJJJJ;
    }

    public final Scene H4() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC377650ErL
    public C385670FAf<C377750ErV> Ql0() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        e4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC377650ErL
    public C385670FAf<C377660ErM> pS1() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC377650ErL
    public C385670FAf<C377660ErM> pd2() {
        return this.LLJJJIL;
    }

    private final EnumC377680ErO J6(AIGCGenerationParam aIGCGenerationParam) {
        if (aIGCGenerationParam.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
            return EnumC377680ErO.AI_TRANSITION;
        }
        switch (C377670ErN.LIZ[aIGCGenerationParam.mediaType.ordinal()]) {
            case 1:
                return EnumC377680ErO.TEXT_2_IMAGE;
            case 2:
                return EnumC377680ErO.IMAGE_2_IMAGE;
            case 3:
                return EnumC377680ErO.TEXT_2_VIDEO;
            case 4:
                return EnumC377680ErO.IMAGE_2_VIDEO;
            case 5:
                return EnumC377680ErO.FL_2_VIDEO;
            case 6:
                return EnumC377680ErO.VIDEO_2_VIDEO;
            default:
                return EnumC377680ErO.TEXT_2_IMAGE;
        }
    }

    private final int L6(AIGCGenerationParam aIGCGenerationParam) {
        int i = C377670ErN.LIZ[aIGCGenerationParam.mediaType.ordinal()];
        if (i != 1 && i != 2) {
            return aIGCGenerationParam.duration / LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return aIGCGenerationParam.duration;
    }

    private final List<String> N6(AIGCGenerationParam aIGCGenerationParam) {
        List<String> listSingletonList;
        int i = C377670ErN.LIZ[aIGCGenerationParam.mediaType.ordinal()];
        if (i != 3) {
            if (i != 5) {
                List<String> list = aIGCGenerationParam.imagePathList;
                if (!(!list.isEmpty())) {
                    String str = aIGCGenerationParam.imagePath;
                    if (!(!a0.LJJJIL(str)) || str == null || (listSingletonList = Collections.singletonList(str)) == null) {
                        return C13BV.INSTANCE;
                    }
                    return listSingletonList;
                }
                return list;
            }
            return aIGCGenerationParam.imagePathList;
        }
        return C13BV.INSTANCE;
    }

    private final AIGCGenerationParam R5(AIGCGenerationParam aIGCGenerationParam) {
        return C378330EsR.LIZIZ(aIGCGenerationParam);
    }

    private final void S5(String str) {
        NLEModel model;
        NLETrackSlot nLETrackSlotLJIIJ;
        NLEEditor nLEEditorN5 = n5();
        if (nLEEditorN5 != null && (model = nLEEditorN5.getModel()) != null && (nLETrackSlotLJIIJ = C352250DrT.LJIIJ(model, str)) != null) {
            nLETrackSlotLJIIJ.removeExtraWithKey("creation_async_task_id");
            nLETrackSlotLJIIJ.removeExtraWithKey("ep_aigc_media_item_id");
            nLEEditorN5.commit();
        }
    }

    private final EnumC377820Erc m6(AIGCGenerationParam aIGCGenerationParam) {
        int i = C377670ErN.LIZ[aIGCGenerationParam.mediaType.ordinal()];
        if (i != 1 && i != 2) {
            return EnumC377820Erc.EP_AIGC_T2V;
        }
        return EnumC377820Erc.EP_AIGC_T2I;
    }

    private final EditorProAIGCMediaItemModel t5(List<EditorProAIGCMediaItemModel> list) {
        if (list.isEmpty()) {
            return null;
        }
        for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : list) {
            if (editorProAIGCMediaItemModel.isSelected) {
                return editorProAIGCMediaItemModel;
            }
        }
        return null;
    }

    private final int u6(String str) {
        boolean z;
        Object next;
        Integer numValueOf;
        if (a0.LJJJIL(str)) {
            return 4;
        }
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && editModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            z = true;
        } else {
            z = false;
        }
        C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(C307440C3i.LIZIZ(z)), AFwS232S0000000_4.get$arr$(103)));
        do {
            next = null;
            if (!c197024126s.hasNext()) {
                break;
            }
            next = c197024126s.next();
        } while (!Intrinsics.LJFF(((ImageGenTaskConfig) next).taskReqKey, str));
        ImageGenTaskConfig imageGenTaskConfig = (ImageGenTaskConfig) next;
        if (imageGenTaskConfig == null || (numValueOf = Integer.valueOf(imageGenTaskConfig.imageOutputCount)) == null || numValueOf.intValue() <= 0) {
            return 4;
        }
        return numValueOf.intValue();
    }

    public final EnumC381960EyI B3(AIGCGenerationParamType aIGCGenerationParamType) {
        switch (C377670ErN.LIZ[aIGCGenerationParamType.ordinal()]) {
            case 1:
            case 2:
                return EnumC381960EyI.EDITOR_PRO_AIGC_T2I;
            case 3:
            case 4:
            case 5:
            case 6:
                return EnumC381960EyI.EDITOR_PRO_AIGC_T2V;
            default:
                return null;
        }
    }

    public final boolean D5(C381540Exc c381540Exc) {
        return E5(c381540Exc.LJIIL);
    }

    public final boolean E5(EnumC381960EyI enumC381960EyI) {
        if (enumC381960EyI == null) {
            return false;
        }
        if (enumC381960EyI != EnumC381960EyI.EDITOR_PRO_AIGC_T2I && enumC381960EyI != EnumC381960EyI.EDITOR_PRO_AIGC_T2V) {
            return false;
        }
        return true;
    }

    public final EditorProAIGCTemplateModel H3(AIGCGenerationParam aIGCGenerationParam) throws Throwable {
        String first;
        long jLongValue;
        JSONObject jSONObject = new JSONObject();
        if (aIGCGenerationParam.mediaType == AIGCGenerationParamType.I2I_TYPE) {
            jSONObject.put("style_prompt", aIGCGenerationParam.stylePrompt.i2iPrompt);
        }
        jSONObject.put("duration", L6(aIGCGenerationParam));
        jSONObject.put("ratio", aIGCGenerationParam.aspectRatio);
        List<String> listN6 = N6(aIGCGenerationParam);
        String value = m6(aIGCGenerationParam).getValue();
        String value2 = J6(aIGCGenerationParam).getValue();
        AlgoRaw algoRaw = new AlgoRaw(d6(aIGCGenerationParam), C786410Ut5.J3(jSONObject));
        String str = aIGCGenerationParam.promptDescription;
        int type = aIGCGenerationParam.aiCreateStylizedType.getType();
        List listLIZ = EditorProAIGCStylizedStagesBuilder.LIZ(aIGCGenerationParam);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listN6, 10));
        for (String str2 : listN6) {
            C2471909mP c2471909mP = C2471909mP.LIZ;
            Pair<String, Long> pairLJI = c2471909mP.LJI(str2);
            if (pairLJI == null || (first = pairLJI.getFirst()) == null) {
                first = "";
            }
            Pair<String, Long> pairLJI2 = c2471909mP.LJI(str2);
            if (pairLJI2 != null) {
                jLongValue = pairLJI2.getSecond().longValue();
            } else {
                jLongValue = 0;
            }
            arrayList.add(new FileIdentifierModel(first, jLongValue));
        }
        return new EditorProAIGCTemplateModel(value, value2, null, algoRaw, arrayList, listN6, str, type, listLIZ, 4, null);
    }

    @Override // X.InterfaceC377650ErL
    public boolean LP(String str) {
        return !((ArrayList) C377150EqX.LJIILL(C377150EqX.LIZ, getEditModel(), str)).isEmpty();
    }

    public final void Q3(String str) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI;
        NLEResourceNode resource;
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ == null) {
            return;
        }
        List<NLETrackSlot> listLJFF = C352250DrT.LJFF(nLEModelLLZ);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJFF) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
            if (!Intrinsics.LJFF(C352250DrT.LJII(nLETrackSlot), str)) {
                String extra = nLETrackSlot.getExtra("ep_aigc_task_id");
                if (extra == null || extra.length() == 0) {
                    extra = null;
                }
                if (Intrinsics.LJFF(extra, str)) {
                }
            }
            arrayList.add(obj);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            NLESegment mainSegment = ((NLETrackSlot) it2.next()).getMainSegment();
            if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                resource.setExtra("ep_ai_generating", "1");
                resource.removeExtraWithKey("ep_ai_generated_fail");
            }
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (interfaceC351350Dq1LLFII = c0e48W1.LLFII()) != null && (nLEEditorLJI = interfaceC351350Dq1LLFII.LJI()) != null) {
            nLEEditorLJI.commit();
        }
    }

    public final void T6(NLETrackSlot nLETrackSlot) {
        String uuid;
        String strLJII;
        if (nLETrackSlot != null) {
            uuid = nLETrackSlot.getUUID();
        } else {
            uuid = null;
        }
        if (!Intrinsics.LJFF(uuid, this.LLJILLL) && nLETrackSlot != null && (strLJII = C352250DrT.LJII(nLETrackSlot)) != null) {
            h72(strLJII);
        }
    }

    public final void W2(String str) {
        v5().LJII(EnumC382030EyP.STOP_FAILED, EnumC2331909Bt.TASK_ID, str, "GenAITaskService");
        S5(str);
    }

    public final String d6(AIGCGenerationParam aIGCGenerationParam) {
        String str = aIGCGenerationParam.generateReqKey;
        if (a0.LJJJIL(str)) {
            switch (C377670ErN.LIZ[aIGCGenerationParam.mediaType.ordinal()]) {
                case 1:
                    return (String) C2506709s1.LIZ.getValue();
                case 2:
                    return C2537009wu.LIZ();
                case 3:
                    return C2536909wt.LIZ();
                case 4:
                    return (String) C274150Aon.LIZ.getValue();
                case 5:
                    return (String) C2536809ws.LIZ.getValue();
                case 6:
                    return "seedance_2_0_r2v_6nfe_e2e_with_pe_editor_pro_postprocess";
                default:
                    return "";
            }
        }
        return str;
    }

    @Override // X.InterfaceC377650ErL
    public boolean fO0(String str) {
        return !((ArrayList) C377150EqX.LJIIZILJ(C377150EqX.LIZ, getEditModel(), str)).isEmpty();
    }

    @Override // X.InterfaceC377650ErL
    public void h72(String str) {
        C377380Equ c377380Equ;
        Scene scene;
        Activity activity;
        C377380Equ next;
        if (!C378010Erv.LIZ()) {
            return;
        }
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLJJI;
        EnumC377350Eqr enumC377350Eqr = null;
        if (asyncTasksPanelViewModel != null) {
            Iterator<C377380Equ> it2 = asyncTasksPanelViewModel.LLJILJILJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            c377380Equ = next;
            if (c377380Equ != null) {
                enumC377350Eqr = c377380Equ.LJI;
            }
        } else {
            c377380Equ = null;
        }
        if (enumC377350Eqr == EnumC377350Eqr.FAILED && c377380Equ.LJIIIIZZ.length() > 0 && (activity = (scene = this.LLILZ).mActivity) != null && !C545820Lau.LJ(scene)) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(c377380Equ.LJIIIIZZ);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void i3(String str) {
        v5().LJII(EnumC382030EyP.STOP, EnumC2331909Bt.TASK_ID, str, "GenAITaskService");
        S5(str);
    }

    @Override // X.InterfaceC377650ErL
    public void kq0(String str) {
        String str2;
        String str3;
        String str4;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        String str5 = null;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModelLJIIJJI = C377150EqX.LJIIJJI(getEditModel(), str, null, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = this.LLJLILLLLZIIL;
        if (editorProAIGCMediaItemModel != null) {
            str2 = editorProAIGCMediaItemModel.epAIGCId;
        } else {
            str2 = null;
        }
        if (editorProAIGCMediaItemModelLJIIJJI != null) {
            str3 = editorProAIGCMediaItemModelLJIIJJI.epAIGCId;
        } else {
            str3 = null;
        }
        if (!Intrinsics.LJFF(str2, str3)) {
            return;
        }
        if (editorProAIGCMediaItemModelLJIIJJI != null) {
            str4 = editorProAIGCMediaItemModelLJIIJJI.itemID;
        } else {
            str4 = null;
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = this.LLJLILLLLZIIL;
        if (editorProAIGCMediaItemModel2 != null) {
            str5 = editorProAIGCMediaItemModel2.itemID;
        }
        if (!Intrinsics.LJFF(str4, str5) && editorProAIGCMediaItemModelLJIIJJI != null) {
            C363040ELe c363040ELeP4 = P4();
            AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModelLJIIJJI.param;
            c363040ELeP4.getClass();
            if (aIGCGenerationParam != null) {
                C350410DoV.LIZLLL(c363040ELeP4.LIZIZ, true, C051R.LIZIZ(C363040ELe.LIZIZ(aIGCGenerationParam)), false, true);
                C385300F8u c385300F8u = C385300F8u.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("doneChangeItem :");
                sbLIZ.append(str);
                C201955140j.LIZLLL(c385300F8u, "", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // X.InterfaceC377650ErL
    public boolean p12(String str) {
        AIGCGenerationParam aIGCGenerationParam;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        AIGCGenerationSubType aIGCGenerationSubType = null;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(C377150EqX.LJIILJJIL(getEditModel(), str, null, 12));
        if (editorProAIGCMediaItemModel != null && (aIGCGenerationParam = editorProAIGCMediaItemModel.param) != null) {
            aIGCGenerationSubType = aIGCGenerationParam.subGenerateType;
        }
        if (aIGCGenerationSubType == AIGCGenerationSubType.AI_TRANSITION) {
            return true;
        }
        return false;
    }

    public final AIGCGenerationParamType v3(EnumC381960EyI enumC381960EyI) {
        if (enumC381960EyI != null) {
            int i = C377670ErN.LIZJ[enumC381960EyI.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return AIGCGenerationParamType.T2V_TYPE;
                }
            } else {
                return AIGCGenerationParamType.T2I_TYPE;
            }
        }
        return AIGCGenerationParamType.NONE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C377590ErF(C1DRG c1drg, Scene scene) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = scene;
        this.LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363160ELq.class, null);
        this.LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0E5S.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377540ErA.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), C0EGY.class, null);
        this.LLJILLL = "";
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.LLJJI = (AsyncTasksPanelViewModel) C364210EPr.LIZJ(getDiContainer(), AsyncTasksPanelViewModel.class);
        this.LLJJIII = (CutViewModel) C364210EPr.LIZJ(getDiContainer(), CutViewModel.class);
        boolean z = false;
        long j = 0;
        this.LLJJIJI = new h0<>(new C377750ErV(null, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, j, j, j, 1920));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 190));
        this.LLJJIJIL = new h0<>(new C040900Cp(0));
        this.LLJJJ = new h0<>(new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 999));
        this.LLJJJIL = new h0<>(new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 999));
        this.LLJJJJ = new h0<>(new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 999));
        this.LLJJJJJIL = new LinkedHashSet();
        this.LLJJJJLIIL = new LinkedHashSet();
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 191));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 192));
        this.LLJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 193));
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC376450EpP.class, null);
    }

    private final AIGCGenerationParam G2(AIGCGenerationParam aIGCGenerationParam, int i) {
        return C377920Erm.LIZ(aIGCGenerationParam, i);
    }

    private final boolean H5(AIGCGenerationParamType aIGCGenerationParamType, AIGCGenerationParamType aIGCGenerationParamType2) {
        int i = C377670ErN.LIZ[aIGCGenerationParamType2.ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (aIGCGenerationParamType != aIGCGenerationParamType2) {
                    return false;
                }
            } else if (aIGCGenerationParamType != AIGCGenerationParamType.T2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.FL2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.V2V_TYPE) {
                return false;
            }
        } else if (aIGCGenerationParamType != AIGCGenerationParamType.T2I_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2I_TYPE) {
            return false;
        }
        return true;
    }

    private final NLETrackSlot W6(List<? extends NLETrackSlot> list, long j) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (NLETrackSlot nLETrackSlot : list) {
            arrayList.add(new Pair(nLETrackSlot, Long.valueOf(Math.abs(nLETrackSlot.getStartTime() - j))));
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(15), arrayList);
        if (listLJLLLL.size() > 1 && ((Number) ((Pair) ListProtector.get(listLJLLLL, 0)).getSecond()).longValue() == ((Number) ((Pair) ListProtector.get(listLJLLLL, 1)).getSecond()).longValue()) {
            return null;
        }
        return (NLETrackSlot) ((Pair) C13LP.LJJJJZI(listLJLLLL)).getFirst();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0133, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.ies.nle.editor_jni.NLETrackSlot K6(X.C381540Exc r12, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r13) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.K6(X.0Exc, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    @Override // X.InterfaceC377650ErL
    public List<EditorProAIGCMediaItemModel> Ow2(String str, AIGCGenerationParamType aIGCGenerationParamType) {
        NLEModel model;
        NLEEditor nLEEditorN5 = n5();
        if (nLEEditorN5 != null && (model = nLEEditorN5.getModel()) != null && C377740ErU.LIZLLL(model, str) != null) {
            return fb0(str, aIGCGenerationParamType, Collections.singletonList(EditorProAIGCMediaItemModelStatus.COMPLETE));
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC377650ErL
    public void VC0(String str, AIGCGenerationParamType aIGCGenerationParamType) {
        this.LLJLL = aIGCGenerationParamType;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        this.LLJLILLLLZIIL = C377150EqX.LJIIJJI(getEditModel(), str, aIGCGenerationParamType, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[LOOP:0: B:12:0x004d->B:14:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0163 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X1(java.util.List<X.C381540Exc> r22, X.InterfaceC1364105Vn<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.X1(java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC377650ErL
    public void et1(String str, C377390Eqv c377390Eqv) {
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLJJI;
        if (asyncTasksPanelViewModel != null) {
            List listSingletonList = Collections.singletonList(str);
            List<C377380Equ> list = asyncTasksPanelViewModel.LLJILJILJ;
            ArrayList arrayList = new ArrayList();
            for (C377380Equ c377380Equ : list) {
                if (listSingletonList.contains(c377380Equ.LIZ)) {
                    arrayList.add(c377380Equ);
                }
            }
            asyncTasksPanelViewModel.yQ2(arrayList, c377390Eqv);
        }
    }

    @Override // X.InterfaceC377650ErL
    public boolean iY(String str, AIGCGenerationParam aIGCGenerationParam) {
        Integer numValueOf;
        NLETrackSlot nLETrackSlotLIZLLL;
        boolean z;
        NLEModel model;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackRn = c0e48W1.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
            numValueOf = Integer.valueOf(slots.size());
        } else {
            numValueOf = null;
        }
        NLEEditor nLEEditorN5 = n5();
        if (nLEEditorN5 != null && (model = nLEEditorN5.getModel()) != null) {
            nLETrackSlotLIZLLL = C377740ErU.LIZLLL(model, str);
        } else {
            nLETrackSlotLIZLLL = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 1 && nLETrackSlotLIZLLL != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(!Ow2(str, null).isEmpty()) && !z && !sm2()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC377650ErL
    public String md0(String str, AIGCGenerationParamType aIGCGenerationParamType) {
        String str2;
        C377150EqX c377150EqX = C377150EqX.LIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(C377150EqX.LIZLLL(getEditModel(), str, aIGCGenerationParamType, Collections.singletonList(EditorProAIGCMediaItemModelStatus.LOADING)));
        if (editorProAIGCMediaItemModel == null || (str2 = editorProAIGCMediaItemModel.epAIGCAsyncTaskId) == null) {
            return "";
        }
        return str2;
    }

    public final void q3(List<? extends NLETrackSlot> list, List<? extends NLETrackSlot> list2) {
        Iterable iterableLLIIII;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        if (list.size() == list2.size()) {
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (nLETrackRn = c0e48W1.Rn()) == null || (slots = nLETrackRn.getSlots()) == null || (iterableLLIIII = C13LP.LLIIII(slots)) == null) {
            iterableLLIIII = C13BV.INSTANCE;
        }
        List listLJLIL = C13LP.LJLIL(iterableLLIIII, list2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJLIL, 10));
        Iterator it2 = ((ArrayList) listLJLIL).iterator();
        while (it2.hasNext()) {
            arrayList.add(((NLENode) it2.next()).getUUID());
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList);
        for (NLETrackSlot nLETrackSlot : list) {
            if (!setLLIIJI.contains(nLETrackSlot.getUUID())) {
                String strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot);
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                et1(md0(strLIZIZ, null), new C377390Eqv(false, false, false, true, 7));
                rX0(strLIZIZ, null, new C377390Eqv(false, false, false, true, 7));
                C377150EqX c377150EqX = C377150EqX.LIZ;
                List listLIZLLL = C377150EqX.LIZLLL(getEditModel(), strLIZIZ, null, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.ERROR));
                ArrayList<EditorProAIGCMediaItemModel> arrayList2 = new ArrayList();
                for (Object obj : listLIZLLL) {
                    if (((EditorProAIGCMediaItemModel) obj).status != EditorProAIGCMediaItemModelStatus.CANCEL) {
                        arrayList2.add(obj);
                    }
                }
                for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : arrayList2) {
                    editorProAIGCMediaItemModel.previousStatus = editorProAIGCMediaItemModel.status;
                    editorProAIGCMediaItemModel.status = EditorProAIGCMediaItemModelStatus.CANCEL;
                }
            }
        }
    }

    public final List<EditorProAIGCMediaItemModel> s7(String str, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus) {
        C377150EqX c377150EqX = C377150EqX.LIZ;
        return C377150EqX.LJIL(getEditModel(), str, editorProAIGCMediaItemModelStatus, false);
    }

    public final void u7(List<EditorProAIGCMediaItemModel> list, C377390Eqv c377390Eqv) {
        NLEModel model;
        NLETrackSlot nLETrackSlotLIZLLL;
        boolean z;
        int size;
        long j;
        InterfaceC363020ELc interfaceC363020ELcXG2;
        String str;
        EditorProAIGCMediaItemModel next;
        NLEResourceNode resource;
        String resourceFile;
        String str2;
        NLESegment mainSegment;
        NLEResourceNode resource2;
        AIGCGenerationParam aIGCGenerationParam;
        NLETrack nLETrackRn;
        VecNLETrackSlotSPtr slots;
        NLETrack nLETrackLJLLILLLL;
        AIGCGenerationParamType aIGCGenerationParamType = AIGCGenerationParamType.NONE;
        boolean z2 = false;
        String str3 = "";
        for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : list) {
            if (str3.length() == 0) {
                str3 = editorProAIGCMediaItemModel.epAIGCId;
            }
            if (aIGCGenerationParamType == AIGCGenerationParamType.NONE) {
                aIGCGenerationParamType = editorProAIGCMediaItemModel.type;
            }
            if (editorProAIGCMediaItemModel.isSelected) {
                z2 = true;
            }
        }
        String str4 = str3;
        List<EditorProAIGCMediaItemModel> listOw2 = Ow2(str4, aIGCGenerationParamType);
        if (!listOw2.isEmpty()) {
            if (z2) {
                Ug0(str4, (EditorProAIGCMediaItemModel) C13LP.LJJJJZI(listOw2), "");
                this.LLJJIJIL.LJII(new C040900Cp(EnumC040800Co.DELETE_TASK_ASYNC_REFRESH_PANEL, str4));
                return;
            } else {
                this.LLJJIJIL.LJII(new C040900Cp(EnumC040800Co.DELETE_TASK_ASYNC_REFRESH_PANEL, str4));
                return;
            }
        }
        NLEEditor nLEEditorN5 = n5();
        if (nLEEditorN5 == null || (model = nLEEditorN5.getModel()) == null || (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(model, str4)) == null) {
            return;
        }
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null && (nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(C350870DpF.LJI(c0e48W1), nLETrackSlotLIZLLL.getUUID())) != null && C351220Dpo.LLLIIL(nLETrackLJLLILLLL)) {
            z = true;
        } else {
            z = false;
        }
        C0E48 c0e48W12 = W1();
        if (c0e48W12 != null && (nLETrackRn = c0e48W12.Rn()) != null && (slots = nLETrackRn.getSlots()) != null) {
            size = slots.size();
        } else {
            size = 0;
        }
        List<EditorProAIGCMediaItemModel> listFb0 = fb0(str4, AIGCGenerationParamType.T2I_TYPE, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
        if (listFb0.isEmpty()) {
            listFb0 = fb0(str4, AIGCGenerationParamType.I2I_TYPE, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR));
        }
        boolean z3 = !listFb0.isEmpty();
        if (z3) {
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(listFb0);
            if (editorProAIGCMediaItemModel2 != null && (aIGCGenerationParam = editorProAIGCMediaItemModel2.param) != null) {
                j = aIGCGenerationParam.duration;
            } else {
                j = 3000;
            }
        } else {
            j = 0;
        }
        if (z3) {
            Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.isSelected) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel3 = next;
            NLESegment mainSegment2 = nLETrackSlotLIZLLL.getMainSegment();
            if (mainSegment2 != null && (resource = mainSegment2.getResource()) != null && (resourceFile = resource.getResourceFile()) != null && a0.LJJIIZI(resourceFile, "ep_aigc_cover_with_mask", false)) {
                if (editorProAIGCMediaItemModel3 != null) {
                    str2 = editorProAIGCMediaItemModel3.holderPicturePath;
                } else {
                    str2 = null;
                }
                if (C1533950q1J.LJ(str2) && (mainSegment = nLETrackSlotLIZLLL.getMainSegment()) != null && (resource2 = mainSegment.getResource()) != null) {
                    if (editorProAIGCMediaItemModel3 != null) {
                        str = editorProAIGCMediaItemModel3.holderPicturePath;
                    }
                    resource2.setResourceFile(str);
                }
            }
        }
        if ((size <= 1 || z3) && !z) {
            InterfaceC363160ELq interfaceC363160ELqC5 = C5();
            if (interfaceC363160ELqC5 == null || (interfaceC363020ELcXG2 = interfaceC363160ELqC5.xG2()) == null) {
                return;
            }
            interfaceC363020ELcXG2.LIZ(j, nLETrackSlotLIZLLL.getUUID(), false, z3);
            return;
        }
        CutViewModel cutViewModel = this.LLJJIII;
        if (cutViewModel == null) {
            return;
        }
        cutViewModel.deleteClip(nLETrackSlotLIZLLL, EnumC356070Dxd.COMMIT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, X.0956] */
    private final void H2(String str, AIGCGenerationParam aIGCGenerationParam, String str2) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C377640ErK(this, str, aIGCGenerationParam, str2, c259800zU, null), 3);
    }

    private final void S6(AIGCGenerationParamType aIGCGenerationParamType, String str, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (creativeModel = editModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 : arrayList) {
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel2.epAIGCId, str)) {
                    arrayList2.add(editorProAIGCMediaItemModel2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((EditorProAIGCMediaItemModel) it2.next()).isSelected = false;
            }
        }
        editorProAIGCMediaItemModel.isSelected = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0ErF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.bytedance.ies.nle.editor_jni.NLETrackSlot U5(com.bytedance.ies.nle.editor_jni.NLEModel r9, java.util.List<? extends com.bytedance.ies.nle.editor_jni.NLETrackSlot> r10, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r11) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r11.param
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r6 = X.C378330EsR.LIZIZ(r0)
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType r1 = r6.businessType
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType r0 = com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType.AI_EXTEND
            r4 = 0
            if (r1 == r0) goto Le
            return r4
        Le:
            java.lang.String r0 = r6.i2vSlotID
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r7 = X.C351220Dpo.LJL(r9, r0)
            if (r7 != 0) goto L17
            return r4
        L17:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r10.iterator()
        L20:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r1 = r0.getUUID()
            java.lang.String r0 = r7.getUUID()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            r5.add(r2)
            goto L20
        L41:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L48
            return r4
        L48:
            java.lang.String r0 = r7.getUUID()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = X.C351220Dpo.LJLLILLLL(r9, r0)
            if (r0 == 0) goto La5
            com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr r1 = r0.getSlots()
            if (r1 == 0) goto La5
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r0 = r0.getUUID()
            r2.add(r0)
            goto L67
        L7b:
            java.util.Set r4 = X.C13LP.LLIIJI(r2)
            if (r4 == 0) goto La5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L8a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r0 = r0.getUUID()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L8a
            r3.add(r1)
            goto L8a
        La5:
            X.13BV r3 = X.C13BV.INSTANCE
        La7:
            boolean r0 = r6.appendMode
            if (r0 == 0) goto Lba
            long r1 = r7.getMeasuredEndTime()
        Laf:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r8.W6(r3, r1)
            if (r0 != 0) goto Lb9
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r8.W6(r5, r1)
        Lb9:
            return r0
        Lba:
            long r1 = r7.getStartTime()
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.U5(com.bytedance.ies.nle.editor_jni.NLEModel, java.util.List, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel):com.bytedance.ies.nle.editor_jni.NLETrackSlot");
    }

    private final long m3(AIGCGenerationParam aIGCGenerationParam, NLEResType nLEResType, String str) {
        boolean z;
        if (nLEResType == NLEResType.VIDEO) {
            z = true;
        } else {
            z = false;
        }
        C359310E6v c359310E6v = C359310E6v.LIZ;
        if (str == null || !z) {
            str = null;
        }
        c359310E6v.getClass();
        return C359310E6v.LIZ(aIGCGenerationParam, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O3(String str, AIGCGenerationParam aIGCGenerationParam, String str2) {
        int i;
        int size;
        String string;
        String str3;
        String str4;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return;
        }
        if (aIGCGenerationParam.imagePath.length() <= 0 && !(!aIGCGenerationParam.imagePathList.isEmpty())) {
            i = 0;
        } else {
            i = 1;
        }
        if (aIGCGenerationParam.imagePathList.size() > 1) {
            size = aIGCGenerationParam.imagePathList.size();
        } else if (aIGCGenerationParam.imagePath.length() > 0) {
            size = 1;
        } else {
            size = 0;
        }
        AIGCGenerationParamType aIGCGenerationParamType = aIGCGenerationParam.mediaType;
        String str5 = null;
        if (aIGCGenerationParamType != AIGCGenerationParamType.T2I_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2I_TYPE) {
            if (aIGCGenerationParamType == AIGCGenerationParamType.T2V_TYPE || aIGCGenerationParamType == AIGCGenerationParamType.I2V_TYPE || aIGCGenerationParamType == AIGCGenerationParamType.FL2V_TYPE || aIGCGenerationParamType == AIGCGenerationParamType.V2V_TYPE) {
                int i2 = aIGCGenerationParam.duration / LSPassThroughRecordSizeConfig.DEFAULT;
                Context sceneContext = this.LLILZ.getSceneContext();
                if (sceneContext == null || (string = sceneContext.getString(2131841124, String.valueOf(i2))) == null) {
                    string = "";
                }
                Integer num = aIGCGenerationParam.promptSource;
                int value = EnumC382880Ezm.BY_USER.getValue();
                if (num != null && num.intValue() == value) {
                    str3 = "modify";
                } else {
                    str3 = "default";
                }
                if (Intrinsics.LJFF(aIGCGenerationParam.rewriteType, EnumC379360Eu6.CREATIVE.getId())) {
                    str4 = "creative";
                } else {
                    str4 = "precise";
                }
                C377120EqU c377120EqU = C377120EqU.LIZ;
                C0E48 c0e48W1 = W1();
                String str6 = aIGCGenerationParam.aspectRatio;
                String str7 = aIGCGenerationParam.promptDescription;
                int i3 = aIGCGenerationParam.remainQuota;
                if (i != 0) {
                    str5 = aIGCGenerationParam.imageSource;
                }
                boolean z = aIGCGenerationParam.imageReferenceAI;
                String str8 = aIGCGenerationParam.generateReqKey;
                String str9 = aIGCGenerationParam.modelName;
                c377120EqU.getClass();
                C377120EqU.LJIIL(editModel, c0e48W1, str2, false, str6, str7, string, i3, "generate", str, i, str5, z ? 1 : 0, size, str3, str8, str9, str4, null);
                return;
            }
            return;
        }
        C377120EqU c377120EqU2 = C377120EqU.LIZ;
        C0E48 c0e48W12 = W1();
        String str10 = aIGCGenerationParam.aspectRatio;
        String str11 = aIGCGenerationParam.promptDescription;
        String str12 = aIGCGenerationParam.styleEffectId;
        String str13 = aIGCGenerationParam.styleName;
        int i4 = aIGCGenerationParam.remainQuota;
        if (i != 0) {
            str5 = aIGCGenerationParam.imageSource;
        }
        Integer numValueOf = Integer.valueOf(size);
        String str14 = aIGCGenerationParam.generateReqKey;
        String str15 = aIGCGenerationParam.modelName;
        c377120EqU2.getClass();
        C377120EqU.LJIIJJI(editModel, c0e48W12, str2, false, str10, str11, str12, str13, i4, "generate", str, i, str5, numValueOf, str14, str15);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    @Override // X.InterfaceC377650ErL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ug0(java.lang.String r26, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r27, java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.Ug0(java.lang.String, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z1(java.lang.String r16, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r17, X.InterfaceC1364105Vn<? super java.lang.String> r18) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.Z1(java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC377650ErL
    public void fL1(AIGCGenerationParamType aIGCGenerationParamType, AIGCGenerationSubType aIGCGenerationSubType, C377660ErM c377660ErM) {
        switch (C377670ErN.LIZ[aIGCGenerationParamType.ordinal()]) {
            case 1:
            case 2:
                if (c377660ErM.LIZ) {
                    int i = c377660ErM.LJ;
                    Keva keva = (Keva) C378870EtJ.LIZIZ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("max_image_quota_");
                    sbLIZ.append((String) C378870EtJ.LIZ.getValue());
                    keva.storeInt(C2188811AlT.LIZIZ(sbLIZ), i);
                }
                this.LLJJJ.LJII(c377660ErM);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                if (aIGCGenerationSubType == AIGCGenerationSubType.AI_TRANSITION) {
                    if (c377660ErM.LIZ) {
                        int i2 = c377660ErM.LJ;
                        Keva keva2 = (Keva) C378870EtJ.LIZIZ.getValue();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("max_ai_transition_quota_");
                        sbLIZ2.append((String) C378870EtJ.LIZ.getValue());
                        keva2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2);
                    }
                    this.LLJJJJ.LJII(c377660ErM);
                } else {
                    if (c377660ErM.LIZ) {
                        int i3 = c377660ErM.LJ;
                        Keva keva3 = (Keva) C378870EtJ.LIZIZ.getValue();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("max_video_quota_");
                        sbLIZ3.append((String) C378870EtJ.LIZ.getValue());
                        keva3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), i3);
                    }
                    this.LLJJJIL.LJII(c377660ErM);
                }
                break;
        }
    }

    @Override // X.InterfaceC377650ErL
    public List<EditorProAIGCMediaItemModel> fb0(String str, AIGCGenerationParamType aIGCGenerationParamType, List<? extends EditorProAIGCMediaItemModelStatus> list) {
        C377150EqX c377150EqX = C377150EqX.LIZ;
        return C377150EqX.LIZLLL(getEditModel(), str, aIGCGenerationParamType, list);
    }

    @Override // X.InterfaceC377650ErL
    public void rX0(String str, AIGCGenerationParamType aIGCGenerationParamType, C377390Eqv c377390Eqv) {
        String str2;
        AIGCGenerationParamType aIGCGenerationParamType2;
        String str3;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_create_tns_independent_moderation", true, false) && aIGCGenerationParamType == (aIGCGenerationParamType2 = AIGCGenerationParamType.T2I_TYPE)) {
            C377150EqX c377150EqX = C377150EqX.LIZ;
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(C377150EqX.LJIILJJIL(getEditModel(), str, aIGCGenerationParamType2, 8));
            if (editorProAIGCMediaItemModel != null && (str3 = editorProAIGCMediaItemModel.epAIGCAsyncTaskId) != null) {
                List listLJIIIIZZ = C377150EqX.LJIIIIZZ(getEditModel(), str3);
                if (listLJIIIIZZ == null) {
                    listLJIIIIZZ = C13BV.INSTANCE;
                }
                if (!listLJIIIIZZ.isEmpty()) {
                    if (!listLJIIIIZZ.isEmpty()) {
                        Iterator it2 = listLJIIIIZZ.iterator();
                        while (it2.hasNext()) {
                            if (((EditorProAIGCMediaItemModel) it2.next()).status != EditorProAIGCMediaItemModelStatus.ERROR) {
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C377150EqX c377150EqX2 = C377150EqX.LIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(C377150EqX.LIZLLL(getEditModel(), str, aIGCGenerationParamType, Collections.singletonList(EditorProAIGCMediaItemModelStatus.ERROR)));
        if (editorProAIGCMediaItemModel2 == null || (str2 = editorProAIGCMediaItemModel2.epAIGCAsyncTaskId) == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            et1(str2, c377390Eqv);
        }
    }

    private final AIGCGenerationParam o2(NLEModel nLEModel, NLETrackSlot nLETrackSlot, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, NLEResType nLEResType) {
        NLETrack nLETrackLJLLILLLL;
        AIGCGenerationParam aIGCGenerationParamLIZIZ = C378330EsR.LIZIZ(editorProAIGCMediaItemModel.param);
        if (nLEResType != NLEResType.VIDEO) {
            return aIGCGenerationParamLIZIZ;
        }
        AIGCBusinessType aIGCBusinessType = editorProAIGCMediaItemModel.businessType;
        AIGCBusinessType aIGCBusinessType2 = AIGCBusinessType.AI_EXTEND;
        if ((aIGCBusinessType != aIGCBusinessType2 && aIGCGenerationParamLIZIZ.businessType != aIGCBusinessType2) || (nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModel, nLETrackSlot.getUUID())) == null || !C351220Dpo.LLLIIL(nLETrackLJLLILLLL)) {
            return aIGCGenerationParamLIZIZ;
        }
        C359310E6v.LIZ.getClass();
        int iLIZIZ = C359310E6v.LIZIZ(nLEModel, nLETrackSlot);
        if (iLIZIZ <= 0) {
            return aIGCGenerationParamLIZIZ;
        }
        return C377920Erm.LIZ(aIGCGenerationParamLIZIZ, iLIZIZ);
    }

    private final AIGCGenerationParam w2(AIGCGenerationParam aIGCGenerationParam, NLETrackSlot nLETrackSlot, NLEResType nLEResType, boolean z) {
        NLEModel nLEModelLLZ;
        NLETrack nLETrackLJLLILLLL;
        int iLIZIZ;
        AIGCGenerationParam aIGCGenerationParamLIZIZ = C378330EsR.LIZIZ(aIGCGenerationParam);
        if (nLEResType != NLEResType.VIDEO || aIGCGenerationParamLIZIZ.businessType != AIGCBusinessType.AI_EXTEND || (nLEModelLLZ = LLZ()) == null || (nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModelLLZ, nLETrackSlot.getUUID())) == null || !C351220Dpo.LLLIIL(nLETrackLJLLILLLL)) {
            return aIGCGenerationParamLIZIZ;
        }
        if (z) {
            C359310E6v.LIZ.getClass();
            Long lLIZJ = C359310E6v.LIZJ(nLEModelLLZ, nLETrackSlot);
            if (lLIZJ == null || (iLIZIZ = (int) (lLIZJ.longValue() / 1000)) < 0) {
                iLIZIZ = 0;
            }
        } else {
            C359310E6v.LIZ.getClass();
            iLIZIZ = C359310E6v.LIZIZ(nLEModelLLZ, nLETrackSlot);
        }
        return C377920Erm.LIZ(aIGCGenerationParamLIZIZ, iLIZIZ);
    }

    public final boolean T2(NLETrackSlot nLETrackSlot, C381540Exc c381540Exc, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, Map<String, C0ELY> map) {
        boolean z;
        NLEResourceNode resource;
        NLEResourceNode resource2;
        NLEResourceNode resource3;
        boolean z2;
        NLEResourceNode resource4;
        NLEResourceNode resource5;
        NLEResourceNode resource6;
        NLESegment mainSegment;
        NLEResourceNode resource7;
        String strLJII = C352250DrT.LJII(nLETrackSlot);
        if (strLJII != null && !Intrinsics.LJFF(strLJII, c381540Exc.LIZ)) {
            C385300F8u c385300F8u = C385300F8u.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Skip restore: slot task mismatch, taskId=");
            sbLIZ.append(c381540Exc.LIZ);
            sbLIZ.append(", slotId=");
            sbLIZ.append(nLETrackSlot.getUUID());
            sbLIZ.append(", existingTaskId=");
            sbLIZ.append(strLJII);
            C201955140j.LJIJJ(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        String strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot);
        if (strLIZIZ != null && !Intrinsics.LJFF(strLIZIZ, editorProAIGCMediaItemModel.epAIGCId)) {
            C385300F8u c385300F8u2 = C385300F8u.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Skip restore: slot ep mismatch, taskId=");
            sbLIZ2.append(c381540Exc.LIZ);
            sbLIZ2.append(", slotId=");
            sbLIZ2.append(nLETrackSlot.getUUID());
            sbLIZ2.append(", existingEpId=");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", mediaEpId=");
            sbLIZ2.append(editorProAIGCMediaItemModel.epAIGCId);
            C201955140j.LJIJJ(c385300F8u2, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        String strLIZJ = C377740ErU.LIZJ(nLETrackSlot);
        if (strLIZJ != null && !Intrinsics.LJFF(strLIZJ, editorProAIGCMediaItemModel.itemID)) {
            C385300F8u c385300F8u3 = C385300F8u.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Skip restore: slot media mismatch, taskId=");
            sbLIZ3.append(c381540Exc.LIZ);
            sbLIZ3.append(", slotId=");
            sbLIZ3.append(nLETrackSlot.getUUID());
            sbLIZ3.append(", existingMediaItemId=");
            sbLIZ3.append(strLIZJ);
            sbLIZ3.append(", mediaItemId=");
            sbLIZ3.append(editorProAIGCMediaItemModel.itemID);
            C201955140j.LJIJJ(c385300F8u3, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        C377740ErU.LJIIIIZZ(nLETrackSlot, editorProAIGCMediaItemModel.epAIGCId, c381540Exc.LIZ, editorProAIGCMediaItemModel.itemID);
        int i = C377670ErN.LIZIZ[editorProAIGCMediaItemModel.status.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource7 = mainSegment.getResource()) != null) {
                    resource7.setExtra("ep_ai_generated", "1");
                }
                return true;
            }
            NLESegment mainSegment2 = nLETrackSlot.getMainSegment();
            if (mainSegment2 != null && (resource6 = mainSegment2.getResource()) != null) {
                resource6.setExtra("ep_ai_generated", "1");
            }
            NLESegment mainSegment3 = nLETrackSlot.getMainSegment();
            if (mainSegment3 != null && (resource5 = mainSegment3.getResource()) != null) {
                resource5.setExtra("ep_ai_generated_fail", "1");
            }
            NLESegment mainSegment4 = nLETrackSlot.getMainSegment();
            if (mainSegment4 != null && (resource4 = mainSegment4.getResource()) != null) {
                resource4.removeExtraWithKey("ep_ai_generating");
            }
            String uuid = nLETrackSlot.getUUID();
            if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            map.put(uuid, new C0ELY(z2, editorProAIGCMediaItemModel.progress / 100.0f, false));
            return true;
        }
        NLESegment mainSegment5 = nLETrackSlot.getMainSegment();
        if (mainSegment5 != null && (resource3 = mainSegment5.getResource()) != null) {
            resource3.setExtra("ep_ai_generated", "1");
        }
        NLESegment mainSegment6 = nLETrackSlot.getMainSegment();
        if (mainSegment6 != null && (resource2 = mainSegment6.getResource()) != null) {
            resource2.setExtra("ep_ai_generating", "1");
        }
        NLESegment mainSegment7 = nLETrackSlot.getMainSegment();
        if (mainSegment7 != null && (resource = mainSegment7.getResource()) != null) {
            resource.removeExtraWithKey("ep_ai_generated_fail");
        }
        String uuid2 = nLETrackSlot.getUUID();
        if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        map.put(uuid2, new C0ELY(z, editorProAIGCMediaItemModel.progress / 100.0f, false));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0320 A[PHI: r42
      0x0320: PHI (r42v1 java.lang.String) = (r42v0 java.lang.String), (r42v5 java.lang.String), (r42v5 java.lang.String) binds: [B:179:0x031c, B:66:0x00f1, B:68:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032a A[PHI: r15
      0x032a: PHI (r15v2 long) = (r15v1 long), (r15v6 long), (r15v6 long) binds: [B:183:0x0326, B:47:0x00c8, B:49:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc A[PHI: r12 r15
      0x00dc: PHI (r12v1 long) = (r12v0 long), (r12v3 long), (r12v3 long), (r12v3 long) binds: [B:186:0x032c, B:52:0x00d2, B:54:0x00d6, B:56:0x00da] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r15v3 long) = (r15v2 long), (r15v5 long), (r15v5 long), (r15v5 long) binds: [B:186:0x032c, B:52:0x00d2, B:54:0x00d6, B:56:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L7(com.bytedance.ies.nle.editor_jni.NLEEditor r44, java.util.List<X.C381540Exc> r45, boolean r46, X.InterfaceC363160ELq r47, kotlin.jvm.functions.Function1<? super X.C381540Exc, java.lang.Boolean> r48) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.L7(com.bytedance.ies.nle.editor_jni.NLEEditor, java.util.List, boolean, X.0ELq, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.InterfaceC377650ErL
    public void PI2(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str, boolean z, String str2) {
        n7(c377760ErW, enumC381960EyI, str, z, str2, 0L);
    }

    public final Map<String, C0ELY> y7(NLEEditor nLEEditor, List<C381540Exc> list, boolean z, InterfaceC363160ELq interfaceC363160ELq, Function1<? super C381540Exc, Boolean> function1) {
        NLETrackSlot nLETrackSlotLJIIJ;
        boolean z2;
        ArrayList<C381540Exc> arrayList = new ArrayList();
        for (C381540Exc c381540Exc : list) {
            if (function1.invoke(c381540Exc).booleanValue()) {
                arrayList.add(c381540Exc);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C381540Exc c381540Exc2 : arrayList) {
            NLEModel nLEModelLLZ = LLZ();
            if (nLEModelLLZ != null && (nLETrackSlotLJIIJ = C352250DrT.LJIIJ(nLEModelLLZ, c381540Exc2.LIZ)) != null) {
                C377150EqX c377150EqX = C377150EqX.LIZ;
                List listLJIIJ = C377150EqX.LJIIJ(getEditModel(), c381540Exc2.LIZ, Collections.singletonList(EditorProAIGCMediaItemModelStatus.LOADING));
                if (!listLJIIJ.isEmpty()) {
                    if (((EditorProAIGCMediaItemModel) C13LP.LJJJJZI(listLJIIJ)).param.imagePath.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float f = c381540Exc2.LJII / 100.0f;
                    interfaceC363160ELq.xG2().LIZLLL(nLETrackSlotLJIIJ.getUUID(), new C0ELY(z2, f, true));
                    VideoPublishEditModel editModel = getEditModel();
                    String str = c381540Exc2.LIZ;
                    float f2 = c381540Exc2.LJII;
                    List listLJIIIIZZ = C377150EqX.LJIIIIZZ(editModel, str);
                    if (listLJIIIIZZ != null) {
                        Iterator it2 = listLJIIIIZZ.iterator();
                        while (it2.hasNext()) {
                            ((EditorProAIGCMediaItemModel) it2.next()).progress = f2;
                            C538950LBt c538950LBt = C538950LBt.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("updateProgressToMediaItemModel: progress: ");
                            sbLIZ.append(f2);
                            sbLIZ.append(" \n model: ");
                            sbLIZ.append(C377150EqX.LIZ);
                            C201955140j.LIZJ(c538950LBt, C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    C385300F8u c385300F8u = C385300F8u.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Slot ");
                    sbLIZ2.append(nLETrackSlotLJIIJ.getUUID());
                    sbLIZ2.append(" updated with progress: ");
                    sbLIZ2.append(c381540Exc2.LJII);
                    sbLIZ2.append(", isImageUploaded = ");
                    sbLIZ2.append(z2);
                    sbLIZ2.append(", (taskId=");
                    sbLIZ2.append(c381540Exc2.LIZ);
                    sbLIZ2.append(')');
                    C201955140j.LIZLLL(c385300F8u, "EditorProAIGCComponent", C2188811AlT.LIZIZ(sbLIZ2));
                    linkedHashMap.put(nLETrackSlotLJIIJ.getUUID(), new C0ELY(z2, f, 4));
                }
            }
        }
        return linkedHashMap;
    }

    private final void n7(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str, boolean z, String str2, long j) {
        boolean z2;
        NLETrackSlot nLETrackSlotLJIIJ;
        String strLIZIZ;
        String str3 = c377760ErW.LIZ;
        if (str3.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str4 = "";
        if (z2) {
            String str5 = c377760ErW.LIZ;
            NLEModel nLEModelLLZ = LLZ();
            if (nLEModelLLZ != null && (nLETrackSlotLJIIJ = C352250DrT.LJIIJ(nLEModelLLZ, str5)) != null && (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlotLJIIJ)) != null) {
                str4 = strLIZIZ;
            }
            if (str4.length() > 0 && 1 != 0) {
                AIGCGenerationParamType aIGCGenerationParamTypeV3 = v3(enumC381960EyI);
                k5().LJFF(C377740ErU.LJIIIZ(aIGCGenerationParamTypeV3), null, null, new AwS371S0200000_5(this, aIGCGenerationParamTypeV3, 35));
                k7(this, aIGCGenerationParamTypeV3, EditorProAIGCMediaItemModelStatus.ERROR, new ArrayList(), str3, null, null, null, 112, null);
            }
        }
        this.LLJJIJI.LJII(new C377750ErV(str4, str, z, true, false, enumC381960EyI, new C377760ErW(c377760ErW.LIZIZ, c377760ErW.LIZ, 0, c377760ErW.LIZJ, null, 24), 0L, 0L, str2, j));
    }

    @Override // X.InterfaceC377650ErL
    public void GP0(AIGCGenerationParam aIGCGenerationParam, String str, String str2, boolean z, String str3, Function0<Unit> function0) {
        if (str != null && str.length() != 0 && 0 == 0 && this.LLJJJJLIIL.add(str)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C377610ErH(this, str, str2, aIGCGenerationParam, z, str3, function0, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    private final List<EditorProAIGCMediaItemModel> d7(AIGCGenerationParamType aIGCGenerationParamType, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus, List<DownloadItemResult> list, String str, List<String> list2, List<Integer> list3, Map<String, String> map) {
        CreativeModel creativeModel;
        EditorProAIGCInfoModel editorProAIGCInfoModel;
        ArrayList<EditorProAIGCMediaItemModel> arrayList;
        boolean z;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel;
        ?? arrayList2 = list;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null && (creativeModel = editModel.creativeModel) != null && (editorProAIGCInfoModel = creativeModel.editorProAIGCInfoModel) != null && (arrayList = editorProAIGCInfoModel.editorProAIGCMediaItemModelList) != null) {
            ArrayList<EditorProAIGCMediaItemModel> arrayList3 = new ArrayList();
            for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 : arrayList) {
                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel3 = editorProAIGCMediaItemModel2;
                if (Intrinsics.LJFF(editorProAIGCMediaItemModel3.epAIGCAsyncTaskId, str) && H5(editorProAIGCMediaItemModel3.type, aIGCGenerationParamType)) {
                    arrayList3.add(editorProAIGCMediaItemModel2);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((EditorProAIGCMediaItemModel) it2.next()).status = editorProAIGCMediaItemModelStatus;
            }
            if (!arrayList3.isEmpty()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((EditorProAIGCMediaItemModel) it3.next()).param.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
                        z = true;
                        break;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            DownloadItemResult downloadItemResult = (DownloadItemResult) C13LP.LJJJLL(arrayList2);
            if (downloadItemResult != null && z && arrayList2.size() != arrayList3.size()) {
                arrayList2 = new ArrayList();
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(DownloadItemResult.LIZ(downloadItemResult, null, null, null, null, ((long) i) + downloadItemResult.timestamp, 15));
                }
            }
            if (!arrayList2.isEmpty()) {
                int i2 = 0;
                if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ai_create_tns_independent_moderation", true, false)) {
                    int size2 = arrayList3.size();
                    if (size2 != arrayList2.size()) {
                        return C13BV.INSTANCE;
                    }
                    while (i2 < size2) {
                        ((EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2)).creationTime = ((DownloadItemResult) ListProtector.get(arrayList2, i2)).timestamp;
                        ((EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2)).mediaFilePath = ((DownloadItemResult) ListProtector.get(arrayList2, i2)).localFilePath;
                        ((EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2)).serverDownloadUrl = ((DownloadItemResult) ListProtector.get(arrayList2, i2)).url;
                        int i3 = C377670ErN.LIZ[aIGCGenerationParamType.ordinal()];
                        if (i3 != 1 && i3 != 2) {
                            if (i3 == 3 || i3 == 4 || i3 == 5) {
                                ((EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2)).holderPicturePath = ((DownloadItemResult) ListProtector.get(arrayList2, i2)).thumbnailLocalFilePath;
                                EditorProAIGCMediaItemModel editorProAIGCMediaItemModel4 = (EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2);
                                String str2 = (String) C13LP.LJJJLZIJ(0, list2);
                                if (str2 == null) {
                                    str2 = "";
                                }
                                editorProAIGCMediaItemModel4.referenceImagePath = str2;
                            }
                        } else {
                            ((EditorProAIGCMediaItemModel) ListProtector.get(arrayList3, i2)).holderPicturePath = ((DownloadItemResult) ListProtector.get(arrayList2, i2)).localFilePath;
                        }
                        i2++;
                    }
                } else {
                    if ((aIGCGenerationParamType == AIGCGenerationParamType.T2V_TYPE || aIGCGenerationParamType == AIGCGenerationParamType.I2V_TYPE || aIGCGenerationParamType == AIGCGenerationParamType.FL2V_TYPE) && arrayList3.size() != arrayList2.size()) {
                        return C13BV.INSTANCE;
                    }
                    int size3 = arrayList2.size();
                    while (i2 < size3) {
                        DownloadItemResult downloadItemResult2 = (DownloadItemResult) C13LP.LJJJLZIJ((arrayList2.size() - 1) - i2, arrayList2);
                        if (downloadItemResult2 != null && (editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLZIJ((arrayList3.size() - 1) - i2, arrayList3)) != null) {
                            C377780ErY.LIZ(downloadItemResult2, editorProAIGCMediaItemModel, aIGCGenerationParamType, list2);
                        }
                        i2++;
                    }
                    for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel5 : arrayList3) {
                        if (editorProAIGCMediaItemModel5.mediaFilePath.length() == 0) {
                            editorProAIGCMediaItemModel5.status = EditorProAIGCMediaItemModelStatus.ERROR;
                        }
                    }
                }
            }
            if (editorProAIGCMediaItemModelStatus == EditorProAIGCMediaItemModelStatus.COMPLETE) {
                for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel6 : arrayList3) {
                    editorProAIGCMediaItemModel6.faceCountList = list3;
                    editorProAIGCMediaItemModel6.uriMigrationMap = map;
                }
            }
            InterfaceC376450EpP interfaceC376450EpPO4 = o4();
            if (interfaceC376450EpPO4 != null) {
                interfaceC376450EpPO4.T11();
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0261  */
    @Override // X.InterfaceC377650ErL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bJ0(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r54, X.C377660ErM r55, java.lang.String r56, com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel r57, java.lang.String r58, boolean r59, java.lang.String r60) {
        /*
            Method dump skipped, instruction units count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.bJ0(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam, X.0ErM, java.lang.String, com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel, java.lang.String, boolean, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List k7(C377590ErF c377590ErF, AIGCGenerationParamType aIGCGenerationParamType, EditorProAIGCMediaItemModelStatus editorProAIGCMediaItemModelStatus, List list, String str, List list2, List list3, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            list = new ArrayList();
        }
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            list2 = C13BV.INSTANCE;
        }
        if ((i & 32) != 0) {
            list3 = C13BV.INSTANCE;
        }
        if ((i & 64) != 0) {
            map = C2097608Jq.LJ();
        }
        return c377590ErF.d7(aIGCGenerationParamType, editorProAIGCMediaItemModelStatus, list, str, list2, list3, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel Z7(X.C377590ErF r29, java.lang.String r30, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.bytedance.ies.nle.editor_jni.NLETrackSlot r38, int r39, boolean r40) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377590ErF.Z7(X.0ErF, java.lang.String, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, boolean):com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel");
    }
}
