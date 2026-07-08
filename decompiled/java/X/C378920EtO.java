package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig;
import com.ss.android.ugc.gamora.editorpro.aigc.utils.EditorProAIGCStylizedStagesBuilder;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS28S0310000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378920EtO extends AbstractC2255721DQs<InterfaceC379160Etm> implements InterfaceC379160Etm, InterfaceC379610EuV {
    public static final C379340Eu4 LLLFZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public static final List<String> LLLIIII;
    public final C376260Ep6 LL;
    public final C1DRG LLILLJJLI;
    public C378970EtT LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public EnumC378720Et4 LLJLL;
    public Boolean LLJLLIL;
    public Integer LLJLLL;
    public List<? extends ResourceItem> LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLLF;
    public AIGCGenerationParam LLLFF;
    public C09AE LLLFFI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C379120Eti.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379300Eu0.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379310Eu1.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 250));
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379250Etv.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379270Etx.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379180Eto.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379090Etf.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379060Etc.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC376280Ep8.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC379280Ety.class, null);
    public final InterfaceC1731706qJ LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377650ErL.class, null);
    public final InterfaceC1731706qJ LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377410Eqx.class, null);
    public final InterfaceC1731706qJ LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 251));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 252));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 249));
    public List<C380190EvR> LLJJIJIL = C13BV.INSTANCE;
    public String LLJL = "";
    public final List<Function1<List<? extends ResourceItem>, Unit>> LLL = new ArrayList();

    public InterfaceC379160Etm m3() {
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [X.0Eu4] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C378920EtO.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/EPAIGCPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C378920EtO.class, "aiCreateApi", "getAiCreateApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/aicreate/EPAICreateApiComponent;", 0), new C2217381BqS(C378920EtO.class, "aiExtendApi", "getAiExtendApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/aiextend/EPAIExtendApiComponent;", 0), new C2217381BqS(C378920EtO.class, "modelSelectApi", "getModelSelectApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/modelselect/EPAIGCModelSelectApiComponent;", 0), new C2217381BqS(C378920EtO.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/topbar/EPAICreateTopBarApiComponent;", 0), new C2217381BqS(C378920EtO.class, "configApi", "getConfigApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/configurations/EPAIGCConfigurationApiComponent;", 0), new C2217381BqS(C378920EtO.class, "editTextApi", "getEditTextApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/edittext/EPAIGCEditTextApiComponent;", 0), new C2217381BqS(C378920EtO.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/preview/EPAIGCPreviewApiComponent;", 0), new C2217381BqS(C378920EtO.class, "styleSelectApi", "getStyleSelectApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/styleselect/EPAIGCStyleSelectApiComponent;", 0), new C2217381BqS(C378920EtO.class, "promptRephraserApi", "getPromptRephraserApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/base/promptrephraser/EPAICreatePromptRephraserApiComponent;", 0), new C2217381BqS(C378920EtO.class, "editorProAIGCLogicApi", "getEditorProAIGCLogicApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/logic/EditorProAIGCLogicApi;", 0), new C2217381BqS(C378920EtO.class, "editorProAIGCResultsPanelApi", "getEditorProAIGCResultsPanelApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/results/EditorProAIGCResultsPanelApi;", 0), new C2217381BqS(C378920EtO.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0)};
        LLLFZ = new Object() { // from class: X.0Eu4
        };
        LLLII = 8;
        LLLIIII = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    }

    private final InterfaceC377410Eqx H3() {
        return (InterfaceC377410Eqx) this.LLJJ.getValue(this, LLLI[11]);
    }

    private final InterfaceC379280Ety K4() {
        return (InterfaceC379280Ety) this.LLJILJILJ.getValue(this, LLLI[9]);
    }

    private final C0EY2 O3() {
        return (C0EY2) this.LLJJI.getValue(this, LLLI[12]);
    }

    private final InterfaceC376280Ep8 O4() {
        return (InterfaceC376280Ep8) this.LLJILJIL.getValue(this, LLLI[8]);
    }

    private final InterfaceC355850DxH P4() {
        return (InterfaceC355850DxH) this.LLJJIJIIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0350 A[EDGE_INSN: B:255:0x0350->B:197:0x0350 BREAK  A[LOOP:3: B:189:0x032a->B:256:?]] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[PHI: r24
      0x0120: PHI (r24v7 java.lang.String) = (r24v0 java.lang.String), (r24v8 java.lang.String) binds: [B:82:0x017a, B:70:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0124 A[PHI: r3 r24
      0x0124: PHI (r3v10 java.lang.String) = (r3v13 java.lang.String), (r3v14 java.lang.String) binds: [B:72:0x0122, B:70:0x011e] A[DONT_GENERATE, DONT_INLINE]
      0x0124: PHI (r24v4 java.lang.String) = (r24v7 java.lang.String), (r24v8 java.lang.String) binds: [B:72:0x0122, B:70:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177 A[PHI: r3 r24
      0x0177: PHI (r3v12 java.lang.String) = (r3v10 java.lang.String), (r3v13 java.lang.String) binds: [B:74:0x0126, B:72:0x0122] A[DONT_GENERATE, DONT_INLINE]
      0x0177: PHI (r24v6 java.lang.String) = (r24v4 java.lang.String), (r24v7 java.lang.String) binds: [B:74:0x0126, B:72:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam Z1() {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.Z1():com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam");
    }

    private final InterfaceC379300Eu0 c3() {
        return (InterfaceC379300Eu0) this.LLILZ.getValue(this, LLLI[1]);
    }

    private final InterfaceC379250Etv e4() {
        return (InterfaceC379250Etv) this.LLIZ.getValue(this, LLLI[3]);
    }

    private final InterfaceC379310Eu1 i3() {
        return (InterfaceC379310Eu1) this.LLILZIL.getValue(this, LLLI[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o2() {
        String str;
        String str2;
        String str3;
        C380190EvR next;
        String str4;
        String string;
        String str5;
        int i;
        String str6;
        String str7;
        C380190EvR next2;
        String str8;
        List<C379170Etn> listNi1 = H4().Ni1();
        int size = listNi1.size();
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return;
        }
        String strValueOf = String.valueOf(z4().LLJILJIL);
        int i2 = (this.LLJJJJJIL || this.LLJJJJLIIL) ? 1 : 0;
        boolean z = v3().SV() == C0F1E.DISABLED || v3().SV() == C0F1E.LOADING || v3().SV() == C0F1E.NOQUOTA;
        String str9 = q3().B40() == EnumC382880Ezm.BY_USER.getValue() ? "modify" : "default";
        AIGCGenerationParam aIGCGenerationParam = this.LLLFF;
        str = "";
        if (aIGCGenerationParam == null || (str2 = aIGCGenerationParam.generateReqKey) == null) {
            str2 = "";
        }
        C380190EvR c380190EvRIb = e4().Ib();
        String str10 = (c380190EvRIb == null || !c380190EvRIb.LJII) ? "high_quality" : "fast";
        AIGCGenerationParam aIGCGenerationParam2 = this.LLLFF;
        String str11 = Intrinsics.LJFF(aIGCGenerationParam2 != null ? aIGCGenerationParam2.rewriteType : null, EnumC379360Eu6.CREATIVE.getId()) ? "creative" : "precise";
        AIGCGenerationParam aIGCGenerationParam3 = this.LLLFF;
        if (aIGCGenerationParam3 == null || (str3 = aIGCGenerationParam3.aspectRatio) == null) {
            str3 = "";
        }
        EnumC378720Et4 enumC378720Et4N7 = T4().N7();
        String promptText = v3().getPromptText();
        if (enumC378720Et4N7 != EnumC378720Et4.TEXT_TO_IMAGE_CREATION) {
            if (enumC378720Et4N7 == EnumC378720Et4.TEXT_TO_VIDEO_CREATION) {
                int iWO0 = q3().WO0() / LSPassThroughRecordSizeConfig.DEFAULT;
                Iterator<C380190EvR> it2 = this.LLJJIJIL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZJ, c380190EvRIb != null ? c380190EvRIb.LIZJ : null)) {
                            break;
                        }
                    }
                }
                C380190EvR c380190EvR = next;
                int i3 = c380190EvR != null ? c380190EvR.LJ : 0;
                if (z4().LLJJIII != C0E9W.AI_EXTEND) {
                    C377120EqU c377120EqU = C377120EqU.LIZ;
                    C0E48 c0e48B3 = B3();
                    boolean z2 = this.LLJLILLLLZIIL;
                    Context sceneContext = this.LL.getSceneContext();
                    if (sceneContext != null && (string = sceneContext.getString(2131841124, String.valueOf(iWO0))) != null) {
                        str = string;
                    }
                    str4 = z ? "enable" : "disable";
                    int i4 = !listNi1.isEmpty() ? 1 : 0;
                    String str12 = this.LLJL;
                    boolean z3 = this.LLJLIL;
                    c377120EqU.getClass();
                    C377120EqU.LJIIIZ(editModel, c0e48B3, strValueOf, i2, z2, str3, promptText, str, i3, str4, i4, str12, z3 ? 1 : 0, size, str9, str2, str10, str11, null);
                    return;
                }
                AbstractC359300E6u abstractC359300E6u = z4().LLJILJIL;
                if (abstractC359300E6u == null || (str5 = abstractC359300E6u.LIZ) == null) {
                    str5 = "edit_toolbar";
                }
                C377120EqU c377120EqU2 = C377120EqU.LIZ;
                C0E48 c0e48B32 = B3();
                boolean z4 = this.LLJLILLLLZIIL;
                String strValueOf2 = String.valueOf(iWO0);
                str4 = z ? "enable" : "disable";
                String str13 = this.LLJL;
                if (str13.length() <= 0) {
                    str13 = null;
                }
                boolean z5 = this.LLJLIL;
                c377120EqU2.getClass();
                C377120EqU.LJIIIZ(editModel, c0e48B32, str5, i2, z4, "original", promptText, strValueOf2, i3, str4, 1, str13, z5 ? 1 : 0, 1, str9, str2, null, null, "ai_extend");
                return;
            }
            return;
        }
        if (listNi1.isEmpty()) {
            i = 0;
            str6 = null;
        } else {
            Iterator<C379170Etn> it3 = listNi1.iterator();
            while (it3.hasNext()) {
                if (it3.next().LIZ.length() > 0) {
                    i = 1;
                    str6 = this.LLJL;
                    if (str6.length() <= 0) {
                        str6 = null;
                    }
                }
            }
            i = 0;
            str6 = null;
        }
        C0EEF c0eefIR1 = O4().IR1();
        if (c0eefIR1 == null || (str7 = c0eefIR1.LIZIZ) == null || str7.length() <= 0) {
            str7 = "1";
        }
        Iterator<C380190EvR> it4 = this.LLJJIJIL.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it4.next();
                if (Intrinsics.LJFF(next2.LIZJ, c380190EvRIb != null ? c380190EvRIb.LIZJ : null)) {
                    break;
                }
            }
        }
        C380190EvR c380190EvR2 = next2;
        int i5 = c380190EvR2 != null ? c380190EvR2.LJ : 0;
        C377120EqU c377120EqU3 = C377120EqU.LIZ;
        C0E48 c0e48B33 = B3();
        boolean z6 = this.LLJLILLLLZIIL;
        if (c0eefIR1 == null || (str8 = c0eefIR1.LIZJ) == null) {
            str8 = "";
        }
        str4 = z ? "enable" : "disable";
        Integer numValueOf = Integer.valueOf(size);
        boolean z7 = z4().LLJJIII == C0E9W.AI_EXTEND;
        c377120EqU3.getClass();
        if (Intrinsics.LJFF(str3, "keep_ratio")) {
            str3 = "original";
        }
        C0LAB c0labLIZJ = C377120EqU.LIZJ(editModel, c0e48B33);
        c0labLIZJ.LJ("enter_source", strValueOf);
        c0labLIZJ.LIZ(i2, "is_from_result_page");
        c0labLIZJ.LIZ(z6 ? 1 : 0, "is_first_authorized");
        c0labLIZJ.LJ("aspect_ratio", str3);
        c0labLIZJ.LJ("prompt_content", promptText);
        c0labLIZJ.LJ("ai_image_style_resource_id", str7);
        c0labLIZJ.LJ("ai_image_style_resource_name", str8);
        c0labLIZJ.LJ("server_generate_times_status", "success");
        c0labLIZJ.LIZ(i5, "left_generate_times");
        c0labLIZJ.LJ("generate_button_status", str4);
        c0labLIZJ.LIZ(i, "is_upload_reference_image");
        c0labLIZJ.LJ("reference_image_source", str6 != null ? str6 : "");
        if (numValueOf != null) {
            c0labLIZJ.LIZ(numValueOf.intValue(), "ref_image_num");
        }
        c0labLIZJ.LJ("ai_create_req_key", str2);
        c0labLIZJ.LJ("model", str10);
        if (!z7) {
            c0labLIZJ.LJ("rewrite_prompt", str11);
        }
        Map<String, String> map = c0labLIZJ.LIZ;
        if (z7 && map != null) {
            map.remove("rewrite_prompt");
        }
        C20684815ws.LJIILLIIL("click_text_to_image_generate", map);
    }

    @Override // X.InterfaceC379160Etm
    public void A01() {
        AIGCGenerationParam aIGCGenerationParamZ1 = Z1();
        if (aIGCGenerationParamZ1 == null) {
            aIGCGenerationParamZ1 = null;
        } else if (aIGCGenerationParamZ1.aiCreateStylizedType != AICreateStylizedType.NONE) {
            aIGCGenerationParamZ1 = AIGCGenerationParam.LIZ(aIGCGenerationParamZ1, null, null, null, null, null, null, false, 0, false, null, null, null, EditorProAIGCStylizedStagesBuilder.LIZ(aIGCGenerationParamZ1), -1, 3);
        }
        this.LLLFF = aIGCGenerationParamZ1;
        o2();
    }

    public final C0E48 B3() {
        return (C0E48) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC379160Etm
    public Pair<String, Boolean> DW() {
        return new Pair<>(this.LLJL, Boolean.valueOf(this.LLJLIL));
    }

    public final InterfaceC377650ErL E3() {
        return (InterfaceC377650ErL) this.LLJILLL.getValue(this, LLLI[10]);
    }

    public final void E5() {
        AIGCGenerationParam aIGCGenerationParam = this.LLLFF;
        if (aIGCGenerationParam == null) {
            return;
        }
        if (n5(aIGCGenerationParam)) {
            Activity activity = this.LL.mActivity;
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131850358);
                C1390380mHk.LIZ(activity, 1061, creativeToastBuilder);
            }
            v3().Kg2(C0F1E.ENABLED);
            return;
        }
        if (aIGCGenerationParam.mediaType == AIGCGenerationParamType.V2V_TYPE && (!a0.LJJJIL(aIGCGenerationParam.imagePath))) {
            w2(aIGCGenerationParam);
        } else if (aIGCGenerationParam.mediaType == AIGCGenerationParamType.I2V_TYPE && (!a0.LJJJIL(aIGCGenerationParam.imagePath))) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2498009qc(this, aIGCGenerationParam, null), 3);
        } else {
            H5(aIGCGenerationParam);
        }
    }

    public final InterfaceC379060Etc H4() {
        return (InterfaceC379060Etc) this.LLJIJIL.getValue(this, LLLI[7]);
    }

    public final InterfaceC378020Erw Q3() {
        return (InterfaceC378020Erw) this.LLJJIII.getValue();
    }

    public final InterfaceC379270Etx T4() {
        return (InterfaceC379270Etx) this.LLIZLLLIL.getValue(this, LLLI[4]);
    }

    @Override // X.InterfaceC379160Etm
    public void Ux1() {
        T2(new AwS584S0100000_5(this, 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = r5.LLLFF
            boolean r0 = r5.v5(r0)
            if (r0 != 0) goto Lc
            r5.E5()
            return
        Lc:
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r1 = r5.LLLFF
            if (r1 == 0) goto L1e
            java.util.List<java.lang.String> r0 = r1.imagePathList
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L2a
            java.util.List<java.lang.String> r4 = r1.imagePathList
        L1c:
            if (r4 != 0) goto L20
        L1e:
            X.13BV r4 = X.C13BV.INSTANCE
        L20:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L3e
            r5.E5()
            return
        L2a:
            java.lang.String r0 = r1.imagePath
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3b
            java.lang.String r0 = r1.imagePath
            java.util.List r4 = java.util.Collections.singletonList(r0)
            goto L1c
        L3b:
            X.13BV r4 = X.C13BV.INSTANCE
            goto L1c
        L3e:
            androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.09qd r2 = new X.09qd
            r1 = 0
            r2.<init>(r5, r4, r1)
            r0 = 3
            X.C23250099c.LIZLLL(r3, r1, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.d6():void");
    }

    @Override // X.InterfaceC379160Etm
    public void hb() {
        AIGCGenerationParamType aIGCGenerationParamType;
        AIGCGenerationParam aIGCGenerationParam = this.LLLFF;
        if (aIGCGenerationParam == null || (aIGCGenerationParamType = aIGCGenerationParam.mediaType) == null) {
            return;
        }
        P4().LIZLLL(C377740ErU.LJIIIZ(aIGCGenerationParamType));
    }

    public final VideoGenTaskConfig k5() {
        C380190EvR c380190EvRIb;
        List<VideoGenTaskConfig> list;
        C378970EtT c378970EtT = this.LLJJJ;
        if (c378970EtT == null || (c380190EvRIb = c378970EtT.LIZ) == null) {
            c380190EvRIb = e4().Ib();
        }
        VideoGenTaskConfig videoGenTaskConfig = null;
        if (c380190EvRIb == null || (list = c380190EvRIb.LJIIJ) == null) {
            return null;
        }
        Iterator<VideoGenTaskConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            VideoGenTaskConfig next = it2.next();
            if (Intrinsics.LJFF(next.taskType, "image2video")) {
                videoGenTaskConfig = next;
                break;
            }
        }
        return videoGenTaskConfig;
    }

    public final InterfaceC381940EyG o4() {
        return (InterfaceC381940EyG) this.LLJJIJI.getValue();
    }

    public final InterfaceC379180Eto q3() {
        return (InterfaceC379180Eto) this.LLJ.getValue(this, LLLI[5]);
    }

    @Override // X.InterfaceC379160Etm
    public boolean sz1() {
        return this.LLJJJJJIL || this.LLJJJJLIIL;
    }

    public final InterfaceC379090Etf v3() {
        return (InterfaceC379090Etf) this.LLJI.getValue(this, LLLI[6]);
    }

    public final C379120Eti z4() {
        return (C379120Eti) this.LLILLL.getValue(this, LLLI[0]);
    }

    private final AIGCBusinessType C5() {
        int i = C378950EtR.LIZ[z4().LLJJIII.ordinal()];
        return i != 1 ? i != 2 ? AIGCBusinessType.AI_CREATE : AIGCBusinessType.AI_EXTEND : AIGCBusinessType.AI_CREATE;
    }

    private final NLEModel LLZ() {
        C0E48 c0e48B3 = B3();
        if (c0e48B3 != null) {
            return C350870DpF.LJI(c0e48B3);
        }
        return null;
    }

    public final void U5() {
        Activity activity;
        if (z4().LLJJIII == C0E9W.AI_EXTEND && (activity = this.LL.mActivity) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131825413);
            c1389890mGx.LJIIJJI();
        }
    }

    public final void d5() {
        C385670FAf<C377750ErV> c385670FAfQl0;
        C377750ErV c377750ErVLIZJ;
        InterfaceC377650ErL interfaceC377650ErLE3 = E3();
        if (interfaceC377650ErLE3 == null || (c385670FAfQl0 = interfaceC377650ErLE3.Ql0()) == null || (c377750ErVLIZJ = c385670FAfQl0.LIZJ()) == null || !c377750ErVLIZJ.LIZJ || c377750ErVLIZJ.LIZ == null) {
            return;
        }
        String str = c377750ErVLIZJ.LIZIZ;
        if (str != null && str.length() != 0) {
            G2(c377750ErVLIZJ);
        }
        Z0(EnumC379210Etr.GENERATION_SUCCESS);
    }

    public final VideoPublishEditModel getEditModel() {
        C0EY2 c0ey2O3 = O3();
        if (c0ey2O3 != null) {
            return c0ey2O3.getEditModel();
        }
        return null;
    }

    @Override // X.InterfaceC379160Etm
    public void init() {
        int i = C378950EtR.LIZ[z4().LLJJIII.ordinal()];
        if (i == 1) {
            q3().KI(null);
            c3().a7();
        } else if (i == 2) {
            i3().a7();
        }
    }

    @Override // X.InterfaceC379160Etm
    public void vk2() {
        EnumC378720Et4 enumC378720Et4N7 = T4().N7();
        C383990F3t c383990F3t = C383990F3t.LIZ;
        boolean z = enumC378720Et4N7 != EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
        C376260Ep6 c376260Ep6 = this.LL;
        VideoPublishEditModel videoPublishEditModel = z4().LLIZLLLIL;
        C0E48 c0e48B3 = B3();
        AwS584S0100000_5 awS584S0100000_5 = new AwS584S0100000_5(this, 253);
        c383990F3t.getClass();
        C383990F3t.LJFF(z, c376260Ep6, videoPublishEditModel, c0e48B3, awS584S0100000_5);
    }

    public final C376260Ep6 F4() {
        return this.LL;
    }

    @Override // X.InterfaceC379160Etm
    public List<C380190EvR> FA0() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379160Etm
    public boolean IR() {
        return this.LLLF;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        m3();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    private final void G2(C377750ErV c377750ErV) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C380190EvR next;
        int i;
        String string;
        String str7;
        String str8;
        boolean z2;
        String str9;
        String str10;
        int i2;
        String str11;
        String str12;
        List<C379170Etn> listNi1 = H4().Ni1();
        int size = listNi1.size();
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return;
        }
        String strValueOf = String.valueOf(z4().LLJILJIL);
        if (!this.LLJJJJJIL && !this.LLJJJJLIIL) {
            z = false;
        } else {
            z = true;
        }
        if (q3().B40() == EnumC382880Ezm.BY_USER.getValue()) {
            str = "modify";
        } else {
            str = "default";
        }
        AIGCGenerationParam aIGCGenerationParam = this.LLLFF;
        String str13 = "";
        if (aIGCGenerationParam == null || (str2 = aIGCGenerationParam.generateReqKey) == null) {
            str2 = "";
        }
        C380190EvR c380190EvRIb = e4().Ib();
        if (c380190EvRIb != null && c380190EvRIb.LJII) {
            str3 = "fast";
        } else {
            str3 = "high_quality";
        }
        AIGCGenerationParam aIGCGenerationParam2 = this.LLLFF;
        C380190EvR c380190EvR = null;
        if (aIGCGenerationParam2 != null) {
            str4 = aIGCGenerationParam2.rewriteType;
        } else {
            str4 = null;
        }
        if (Intrinsics.LJFF(str4, EnumC379360Eu6.CREATIVE.getId())) {
            str5 = "creative";
        } else {
            str5 = "precise";
        }
        AIGCGenerationParam aIGCGenerationParam3 = this.LLLFF;
        if (aIGCGenerationParam3 == null || (str6 = aIGCGenerationParam3.aspectRatio) == null) {
            str6 = "";
        }
        EnumC378720Et4 enumC378720Et4N7 = T4().N7();
        String promptText = v3().getPromptText();
        if (enumC378720Et4N7 == EnumC378720Et4.TEXT_TO_IMAGE_CREATION) {
            if (!listNi1.isEmpty()) {
                Iterator<C379170Etn> it2 = listNi1.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZ.length() > 0) {
                        z2 = true;
                        str9 = this.LLJL;
                        if (str9.length() <= 0) {
                            str9 = null;
                        }
                    }
                }
                z2 = false;
                str9 = null;
            } else {
                z2 = false;
                str9 = null;
            }
            C0EEF c0eefIR1 = O4().IR1();
            if (c0eefIR1 == null || (str10 = c0eefIR1.LIZIZ) == null || str10.length() <= 0) {
                str10 = "1";
            }
            Iterator<C380190EvR> it3 = this.LLJJIJIL.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C380190EvR next2 = it3.next();
                String str14 = next2.LIZJ;
                if (c380190EvRIb != null) {
                    str12 = c380190EvRIb.LIZJ;
                } else {
                    str12 = null;
                }
                if (Intrinsics.LJFF(str14, str12)) {
                    c380190EvR = next2;
                    break;
                }
            }
            C380190EvR c380190EvR2 = c380190EvR;
            if (c380190EvR2 != null) {
                i2 = c380190EvR2.LJ;
            } else {
                i2 = 0;
            }
            C377120EqU c377120EqU = C377120EqU.LIZ;
            C0E48 c0e48B3 = B3();
            if (c0eefIR1 == null || (str11 = c0eefIR1.LIZJ) == null) {
                str11 = "";
            }
            String str15 = c377750ErV.LIZIZ;
            if (str15 != null) {
                str13 = str15;
            }
            Integer numValueOf = Integer.valueOf(size);
            c377120EqU.getClass();
            C377120EqU.LJIIJJI(editModel, c0e48B3, strValueOf, z, str6, promptText, str10, str11, i2, "generate", str13, z2, str9, numValueOf, str2, str3);
            return;
        }
        if (enumC378720Et4N7 != EnumC378720Et4.TEXT_TO_VIDEO_CREATION) {
            return;
        }
        int iWO0 = q3().WO0() / LSPassThroughRecordSizeConfig.DEFAULT;
        Iterator<C380190EvR> it4 = this.LLJJIJIL.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                String str16 = next.LIZJ;
                if (c380190EvRIb != null) {
                    str8 = c380190EvRIb.LIZJ;
                } else {
                    str8 = null;
                }
                if (Intrinsics.LJFF(str16, str8)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C380190EvR c380190EvR3 = next;
        if (c380190EvR3 != null) {
            i = c380190EvR3.LJ;
        } else {
            i = 0;
        }
        if (z4().LLJJIII == C0E9W.AI_EXTEND) {
            AbstractC359300E6u abstractC359300E6u = z4().LLJILJIL;
            if (abstractC359300E6u == null || (str7 = abstractC359300E6u.LIZ) == null) {
                str7 = "edit_toolbar";
            }
            C377120EqU c377120EqU2 = C377120EqU.LIZ;
            C0E48 c0e48B32 = B3();
            String strValueOf2 = String.valueOf(iWO0);
            String str17 = c377750ErV.LIZIZ;
            if (str17 != null) {
                str13 = str17;
            }
            String str18 = this.LLJL;
            if (str18.length() <= 0) {
                str18 = null;
            }
            boolean z3 = this.LLJLIL;
            c377120EqU2.getClass();
            C377120EqU.LJIIL(editModel, c0e48B32, str7, z, "original", promptText, strValueOf2, i, "generate", str13, 1, str18, z3 ? 1 : 0, 1, str, str2, null, null, "ai_extend");
            return;
        }
        C377120EqU c377120EqU3 = C377120EqU.LIZ;
        C0E48 c0e48B33 = B3();
        Context sceneContext = this.LL.getSceneContext();
        if (sceneContext == null || (string = sceneContext.getString(2131841124, String.valueOf(iWO0))) == null) {
            string = "";
        }
        String str19 = c377750ErV.LIZIZ;
        if (str19 != null) {
            str13 = str19;
        }
        int i3 = !listNi1.isEmpty() ? 1 : 0;
        String str20 = this.LLJL;
        boolean z4 = this.LLJLIL;
        c377120EqU3.getClass();
        C377120EqU.LJIIL(editModel, c0e48B33, strValueOf, z, str6, promptText, string, i, "generate", str13, i3, str20, z4 ? 1 : 0, size, str, str2, str3, str5, null);
    }

    private final void J6(C378970EtT c378970EtT) {
        T4().bE(c378970EtT);
    }

    private final void T2(Function1<? super List<? extends ResourceItem>, Unit> function1) {
        List<? extends ResourceItem> list = this.LLJZ;
        if (list != null) {
            function1.invoke(list);
            return;
        }
        this.LLL.add(function1);
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        final AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(this, 65);
        C09AE c09ae = this.LLLFFI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLLFFI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C2497909qb(this, awS582S0100000_3, null), 3);
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        if (!C0E46.LIZ().LIZJ) {
            awS582S0100000_3.invoke(null);
            return;
        }
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (interfaceC360730ECh == null) {
            awS582S0100000_3.invoke(null);
        } else {
            interfaceC360730ECh.LJII("editor_pro_aigc", !W1(this.LL.getSceneContext()), false, true, new C0E0V<ResourceItem>() { // from class: X.0EUx
                @Override // X.C0E0V, X.InterfaceC365520EUs
                public final void LIZ(C0EDV c0edv) {
                    awS582S0100000_3.invoke(null);
                }

                @Override // X.InterfaceC365520EUs
                public final void LIZIZ(List<? extends ResourceItem> list2, boolean z) {
                    this.LIZ.LLJZ = list2;
                    awS582S0100000_3.invoke(list2);
                }
            });
        }
    }

    public static boolean W1(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd A[PHI: r4
      0x00fd: PHI (r4v10 java.lang.String) = (r4v7 java.lang.String), (r4v11 java.lang.String) binds: [B:61:0x00fb, B:59:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101 A[PHI: r4
      0x0101: PHI (r4v9 java.lang.String) = (r4v7 java.lang.String), (r4v10 java.lang.String) binds: [B:61:0x00fb, B:63:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void W2(X.C377750ErV r48) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.W2(X.0ErV):void");
    }

    private final void m6(C378970EtT c378970EtT) {
        q3().zy(c378970EtT);
    }

    private final boolean n5(AIGCGenerationParam aIGCGenerationParam) {
        C0E48 c0e48B3;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlotLJJIII;
        boolean z = false;
        if (aIGCGenerationParam.businessType == AIGCBusinessType.AI_EXTEND) {
            return false;
        }
        AIGCGenerationParamType aIGCGenerationParamType = aIGCGenerationParam.mediaType;
        if ((aIGCGenerationParamType != AIGCGenerationParamType.T2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.FL2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.V2V_TYPE) || (c0e48B3 = B3()) == null) {
            return false;
        }
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48B3);
        String str = aIGCGenerationParam.i2vSlotID;
        if ((str.length() <= 0 || (nLETrackSlotLLLLLLIL = C351220Dpo.LJL(nLEModelLJI, str)) == null) && (nLETrackSlotLLLLLLIL = c0e48B3.LLLLLLIL()) == null) {
            return false;
        }
        long j = aIGCGenerationParam.duration;
        if (j < 0 || j <= 0) {
            return false;
        }
        long startTime = nLETrackSlotLLLLLLIL.getStartTime() + (j * 1000);
        C351510DqH c351510DqH = C351510DqH.LIZ;
        long startTime2 = nLETrackSlotLLLLLLIL.getStartTime();
        c351510DqH.getClass();
        NLEModel nLEModelLJI2 = C350870DpF.LJI(c0e48B3);
        NLETrack trackBySlot = nLEModelLJI2.getTrackBySlot(nLETrackSlotLLLLLLIL);
        if (trackBySlot == null || !C351220Dpo.LLLIIL(trackBySlot) || (nLETrackSlotLJJIII = C351510DqH.LJJIII(trackBySlot, nLETrackSlotLLLLLLIL)) == null || startTime <= nLETrackSlotLJJIII.getStartTime() || C351510DqH.LJIILLIIL(startTime2, nLEModelLJI2, startTime) != null || C351510DqH.LJII(nLEModelLJI2)) {
            z = true;
        }
        return !z;
    }

    private final void u6(C378970EtT c378970EtT) {
        e4().I32(c378970EtT.LIZ);
    }

    private final void uW(C378970EtT c378970EtT) {
        C380190EvR next;
        int i;
        C380190EvR c380190EvR = c378970EtT.LIZ;
        Iterator<C380190EvR> it2 = this.LLJJIJIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZJ, c380190EvR.LIZJ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C380190EvR c380190EvR2 = next;
        if (c380190EvR2 != null && (i = c380190EvR2.LJ) >= 0) {
            v3().vH(i, R5(c380190EvR, i));
        }
        v3().uW(c378970EtT);
    }

    private final boolean v5(AIGCGenerationParam aIGCGenerationParam) {
        AIGCGenerationParamType aIGCGenerationParamType;
        int i;
        if (!C307460C3k.LIZ() || z4().LLJJIII == C0E9W.AI_EXTEND) {
            return false;
        }
        String str = null;
        if (aIGCGenerationParam == null || (aIGCGenerationParamType = aIGCGenerationParam.mediaType) == null || ((i = C378950EtR.LIZJ[aIGCGenerationParamType.ordinal()]) != 1 && i != 2 && i != 3)) {
            return false;
        }
        if (aIGCGenerationParam != null) {
            str = aIGCGenerationParam.modelName;
        }
        if (!Intrinsics.LJFF(str, EnumC379050Etb.HIGH_QUALITY.getModelName())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[PHI: r7
      0x0048: PHI (r7v1 com.bytedance.ies.nle.editor_jni.NLETrackSlot) = (r7v0 com.bytedance.ies.nle.editor_jni.NLETrackSlot), (r7v4 com.bytedance.ies.nle.editor_jni.NLETrackSlot) binds: [B:18:0x0046, B:14:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w2(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r17) {
        /*
            r16 = this;
            r4 = r16
            X.0Ep6 r0 = r4.LL
            android.app.Activity r14 = r0.mActivity
            r8 = r17
            if (r14 != 0) goto Le
            r4.H5(r8)
            return
        Le:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r4.LLZ()
            r2 = 0
            if (r0 == 0) goto L3c
            java.util.List r0 = X.C352250DrT.LJFF(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L1f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r7 = r3.next()
            r0 = r7
            com.bytedance.ies.nle.editor_jni.NLENode r0 = (com.bytedance.ies.nle.editor_jni.NLENode) r0
            java.lang.String r1 = r0.getUUID()
            java.lang.String r0 = r4.LLJJLIIIJLLLLLLLZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1f
        L38:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r7 = (com.bytedance.ies.nle.editor_jni.NLETrackSlot) r7
            if (r7 != 0) goto L48
        L3c:
            X.0E48 r0 = r4.B3()
            if (r0 == 0) goto L77
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r7 = r0.LLLLLLIL()
            if (r7 == 0) goto L77
        L48:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r7.getMainSegment()
            if (r0 == 0) goto L77
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r13 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.dynamicCast(r0)
            if (r13 == 0) goto L77
            if (r7 != 0) goto L59
            return
        L57:
            r7 = r2
            goto L38
        L59:
            long r9 = r13.getTimeClipStart()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r0
            long r11 = r13.getTimeClipEnd()
            long r11 = r11 / r0
            long r5 = r11 - r9
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)
            X.0EtV r3 = new X.0EtV
            r15 = 0
            r3 = r3
            r3.<init>(r4, r5, r7, r8, r9, r11, r13, r14, r15)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r2, r2, r3, r0)
            return
        L77:
            r4.H5(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.w2(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam):void");
    }

    private final void zH0(C378970EtT c378970EtT) {
        H4().zH0(c378970EtT);
    }

    public final Object D5(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        ArrayList arrayList = new ArrayList();
        for (String str : LLLIIII) {
            AlgorithmModelResourceFinder algorithmModelResourceFinderLIZLLL = C13Q5.LIZ().LIZLLL();
            boolean zIsResourceAvailable = algorithmModelResourceFinderLIZLLL.isResourceAvailable(str);
            boolean zLJFF = Intrinsics.LJFF(algorithmModelResourceFinderLIZLLL.realFindResourceUri(0, null, str), "asset://md5_error");
            if (!zIsResourceAvailable || zLJFF) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            C189200o6.m2constructorimpl(true);
            c23260099m.resumeWith(true);
        } else {
            C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", arrayList)), new C13MA<Long>() { // from class: X.0EtZ
                @Override // X.C13MA
                public final void onSuccess(Long l) {
                    l.longValue();
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                    l.longValue();
                }

                @Override // X.C13MA
                public final void onFail(Long l, C1662010tLr c1662010tLr) {
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn2 = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn2.resumeWith(bool);
                }
            });
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public final void H5(AIGCGenerationParam aIGCGenerationParam) {
        boolean z;
        final boolean z2;
        Object next;
        final AIGCGenerationParam aIGCGenerationParamLIZ = aIGCGenerationParam;
        String strLIZIZ = null;
        if (this.LLJJJJJIL) {
            InterfaceC377410Eqx interfaceC377410EqxH3 = H3();
            if (interfaceC377410EqxH3 != null) {
                interfaceC377410EqxH3.zg0(null, new AwS406S0200000_5(this, aIGCGenerationParamLIZ, 37));
                return;
            }
            return;
        }
        NLEModel nLEModelLLZ = LLZ();
        String str = "";
        if (nLEModelLLZ != null) {
            String str2 = this.LLJJLIIIJLLLLLLLZ;
            if (str2 == null) {
                str2 = "";
            }
            Iterator it2 = ((ArrayList) C352250DrT.LJFF(nLEModelLLZ)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot != null) {
                strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot);
            }
        }
        if (C123100dR.LIZ(strLIZIZ) && aIGCGenerationParamLIZ.mediaType != AIGCGenerationParamType.V2V_TYPE && aIGCGenerationParamLIZ.businessType != AIGCBusinessType.AI_EXTEND) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJJJLIIL) {
            AIGCGenerationParam aIGCGenerationParamLIZ2 = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZ, null, null, null, null, null, "", false, 0, false, null, null, null, null, -16385, 7);
            String str3 = this.LLJJL;
            if (str3 != null) {
                str = str3;
            }
            aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZ2, null, null, null, null, str, null, false, 0, false, null, null, null, null, -40961, 7);
        } else if (z) {
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZ, null, null, null, null, str, null, false, 0, false, null, null, null, null, -40961, 7);
        }
        if (!this.LLJJJJLIIL && !z) {
            z2 = this.LLJJJIL;
        } else {
            z2 = false;
        }
        o4().LJ(C378120Es6.LIZ(aIGCGenerationParamLIZ), false, new InterfaceC382370Eyx() { // from class: X.0Eta
            @Override // X.InterfaceC382370Eyx
            public final void LJIIJ(String str4) {
                String str5;
                InterfaceC377650ErL interfaceC377650ErLE3 = this.LIZ.E3();
                if (interfaceC377650ErLE3 != null) {
                    AIGCGenerationParam aIGCGenerationParam2 = aIGCGenerationParamLIZ;
                    boolean z3 = z2;
                    AbstractC359300E6u abstractC359300E6u = this.LIZ.z4().LLJILJIL;
                    if (abstractC359300E6u == null || (str5 = abstractC359300E6u.LIZ) == null) {
                        str5 = "";
                    }
                    interfaceC377650ErLE3.GP0(aIGCGenerationParam2, str4, null, z3, str5, null);
                }
            }

            @Override // X.InterfaceC382370Eyx
            public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str4, String str5) {
                C378920EtO c378920EtO = this.LIZ;
                c378920EtO.LLLF = false;
                InterfaceC377650ErL interfaceC377650ErLE3 = c378920EtO.E3();
                if (interfaceC377650ErLE3 != null) {
                    interfaceC377650ErLE3.PI2(c377760ErW, enumC381960EyI, str4, false, str5);
                }
                this.LIZ.Z4(c377760ErW);
            }
        });
    }

    @Override // X.InterfaceC379160Etm
    public void RV(C378930EtP c378930EtP) {
        this.LLJJJIL = c378930EtP.LIZ;
        this.LLJJJJ = c378930EtP.LIZIZ;
        this.LLJJJJJIL = c378930EtP.LIZJ;
        this.LLJJJJLIIL = c378930EtP.LIZLLL;
        this.LLJJL = c378930EtP.LJ;
        this.LLJJLIIIJLLLLLLLZ = c378930EtP.LJFF;
        this.LLJLILLLLZIIL = c378930EtP.LJI;
        this.LLJJIJIL = c378930EtP.LJII;
    }

    @Override // X.InterfaceC379160Etm
    public void Z0(EnumC379210Etr enumC379210Etr) {
        int i = C378950EtR.LIZ[z4().LLJJIII.ordinal()];
        if (i != 1) {
            if (i == 2) {
                i3().Z0(enumC379210Etr);
            }
        } else {
            c3().Z0(enumC379210Etr);
        }
        hb();
        this.LL.LLLLIIIILLL();
    }

    public final void Z4(C377760ErW c377760ErW) {
        C385670FAf<C377750ErV> c385670FAfQl0;
        C377750ErV c377750ErVLIZJ;
        C377760ErW c377760ErW2;
        Map<String, String> map;
        InterfaceC377650ErL interfaceC377650ErLE3 = E3();
        if (interfaceC377650ErLE3 != null && (c385670FAfQl0 = interfaceC377650ErLE3.Ql0()) != null && (c377750ErVLIZJ = c385670FAfQl0.LIZJ()) != null && c377750ErVLIZJ.LIZLLL) {
            if ((!c377760ErW.LJ.isEmpty()) && (c377760ErW2 = c377750ErVLIZJ.LJI) != null && (map = c377760ErW2.LJ) != null) {
                map.putAll(c377760ErW.LJ);
            }
            W2(c377750ErVLIZJ);
            Activity activity = this.LL.mActivity;
            if (activity != null) {
                C383990F3t c383990F3t = C383990F3t.LIZ;
                C377760ErW c377760ErW3 = c377750ErVLIZJ.LJI;
                c383990F3t.getClass();
                C383990F3t.LJ(activity, c377760ErW3);
            }
            fe1(EnumC379010EtX.GENERATE_FAIL, null);
            v3().Kg2(C0F1E.ENABLED);
        }
    }

    @Override // X.InterfaceC379160Etm
    public void nW(EnumC378720Et4 enumC378720Et4) {
        boolean z;
        EnumC382100EyW enumC382100EyW;
        if (enumC378720Et4 == EnumC378720Et4.TEXT_TO_IMAGE_CREATION) {
            z = true;
        } else {
            z = false;
        }
        List<C380190EvR> list = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList();
        for (C380190EvR c380190EvR : list) {
            if (c380190EvR.LJI == z) {
                arrayList.add(c380190EvR);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C380190EvR) it2.next()).LIZJ);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList3.add(obj);
            }
        }
        List<String> listLJJJJI = C13LP.LJJJJI(arrayList3);
        if (listLJJJJI.isEmpty()) {
            return;
        }
        if (z) {
            enumC382100EyW = EnumC382100EyW.VIDEO;
        } else {
            enumC382100EyW = EnumC382100EyW.IMAGE;
        }
        o4().LIZIZ(enumC382100EyW, listLJJJJI, "", EnumC379020EtY.PRE_FETCH.toString(), new AwS584S0100000_5(this, 254));
    }

    public final void t5(AIGCGenerationParam aIGCGenerationParam) {
        NLEModel nLEModelLLZ;
        NLETrackSlot nLETrackSlotLIZLLL;
        final AIGCGenerationParam aIGCGenerationParamLIZ = aIGCGenerationParam;
        InterfaceC377650ErL interfaceC377650ErLE3 = E3();
        String str = "";
        if (interfaceC377650ErLE3 != null) {
            String str2 = this.LLJJL;
            if (str2 == null) {
                str2 = "";
            }
            if (interfaceC377650ErLE3.iY(str2, aIGCGenerationParamLIZ)) {
                AIGCGenerationParam aIGCGenerationParamLIZ2 = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZ, null, null, null, null, null, "", false, 0, false, null, null, null, null, -16385, 7);
                String str3 = this.LLJJL;
                if (str3 != null) {
                    str = str3;
                }
                aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZ2, null, null, null, null, str, null, false, 0, false, null, null, null, null, -40961, 7);
            }
        }
        String str4 = this.LLJJL;
        if (str4 != null && (nLEModelLLZ = LLZ()) != null && (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModelLLZ, str4)) != null) {
            C349070DmL.LIZ(nLEModelLLZ, nLETrackSlotLIZLLL, true);
        }
        o4().LJ(C378120Es6.LIZ(aIGCGenerationParamLIZ), false, new InterfaceC382370Eyx() { // from class: X.0Etd
            @Override // X.InterfaceC382370Eyx
            public final void LJIIJ(String str5) {
                InterfaceC377650ErL interfaceC377650ErLE32 = this.LIZ.E3();
                if (interfaceC377650ErLE32 != null) {
                    interfaceC377650ErLE32.GP0(aIGCGenerationParamLIZ, str5, null, false, String.valueOf(this.LIZ.z4().LLJILJIL), null);
                }
            }

            @Override // X.InterfaceC382370Eyx
            public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str5, String str6) {
                C378920EtO c378920EtO = this.LIZ;
                c378920EtO.LLLF = false;
                InterfaceC377650ErL interfaceC377650ErLE32 = c378920EtO.E3();
                if (interfaceC377650ErLE32 != null) {
                    interfaceC377650ErLE32.PI2(c377760ErW, enumC381960EyI, str5, false, str6);
                }
                this.LIZ.Z4(c377760ErW);
            }
        });
    }

    public C378920EtO(C376260Ep6 c376260Ep6, C1DRG c1drg) {
        this.LL = c376260Ep6;
        this.LLILLJJLI = c1drg;
    }

    private final String R5(C380190EvR c380190EvR, int i) {
        Context sceneContext;
        if (i > 0 || (sceneContext = this.LL.getSceneContext()) == null) {
            return "";
        }
        List<C380190EvR> list = this.LLJJIJIL;
        ArrayList<C380190EvR> arrayList = new ArrayList();
        for (C380190EvR c380190EvR2 : list) {
            if (c380190EvR2.LJI == c380190EvR.LJI) {
                arrayList.add(c380190EvR2);
            }
        }
        if (!arrayList.isEmpty()) {
            for (C380190EvR c380190EvR3 : arrayList) {
                if (!Intrinsics.LJFF(c380190EvR3.LIZJ, c380190EvR.LIZJ) && c380190EvR3.LJ > 0) {
                    return sceneContext.getString(2131825483);
                }
            }
        }
        return sceneContext.getString(2131825482, Integer.valueOf(c380190EvR.LJFF));
    }

    @Override // X.InterfaceC379160Etm
    public void J02(C378960EtS c378960EtS, boolean z) throws Throwable {
        EnumC378720Et4 enumC378720Et4 = c378960EtS.LIZIZ;
        if (enumC378720Et4 == null) {
            enumC378720Et4 = EnumC378720Et4.NONE;
        }
        List<C379170Etn> listNi1 = c378960EtS.LIZJ;
        if (listNi1 == null) {
            listNi1 = H4().Ni1();
        }
        C380190EvR c380190EvRIb = c378960EtS.LIZ;
        if (c380190EvRIb == null) {
            if (enumC378720Et4 != EnumC378720Et4.NONE) {
                c380190EvRIb = e4().NN2(enumC378720Et4);
            } else {
                c380190EvRIb = e4().Ib();
            }
            if (c380190EvRIb == null) {
                return;
            }
        }
        if (enumC378720Et4 == EnumC378720Et4.NONE) {
            if (c380190EvRIb.LJI) {
                enumC378720Et4 = EnumC378720Et4.TEXT_TO_VIDEO_CREATION;
            } else {
                enumC378720Et4 = EnumC378720Et4.TEXT_TO_IMAGE_CREATION;
            }
        }
        if (c378960EtS.LIZJ != null) {
            this.LLJL = "upload";
            this.LLJLIL = false;
        }
        C378970EtT c378970EtTN5 = N5(c380190EvRIb, enumC378720Et4, listNi1, z);
        this.LLJJJ = c378970EtTN5;
        u6(c378970EtTN5);
        m6(c378970EtTN5);
        zH0(c378970EtTN5);
        uW(c378970EtTN5);
        J6(c378970EtTN5);
    }

    @Override // X.InterfaceC379160Etm
    public void KQ1(String str, boolean z) {
        this.LLJL = str;
        this.LLJLIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String M5(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.String r0 = "content://"
            r1 = 0
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r13, r0, r1)
            if (r0 != 0) goto La
            return r13
        La:
            android.content.ContentResolver r4 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L5c
            android.net.Uri r5 = com.bytedance.mt.protector.impl.UriProtector.parse(r13)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "_data"
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L5c
            r7 = 0
            X.0WZX r10 = new X.0WZX     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF384cWghZ6StZ5ba0yCqDphScXvBvw9zH56IB2nyV21T+Cyl/QOlEdbhT2sCOZuuOrEBV11vQyFE4mIE9e/AnPd/8Yc="
            r3 = 0
            r10.<init>(r0, r3)     // Catch: java.lang.Throwable -> L5c
            r8 = r7
            r9 = r7
            android.database.Cursor r2 = X.C2204961BRm.LJJJ(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L57
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L35
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L37
        L35:
            java.lang.String r1 = ""
        L37:
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L5c
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> L5c
            r0 = r0 ^ 1
            if (r0 == 0) goto L43
            r3 = r1
        L43:
            if (r3 == 0) goto L57
            goto L58
        L46:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4b
            throw r1     // Catch: java.lang.Throwable -> L51
        L4b:
            r0 = move-exception
            r1 = r3
        L4d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r0 = move-exception
            goto L4d
        L53:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L5c
            throw r0     // Catch: java.lang.Throwable -> L5c
        L57:
            r3 = r13
        L58:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L5c
            goto L68
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L68:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r0 == 0) goto L6f
            r3 = r13
        L6f:
            java.lang.String r3 = (java.lang.String) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.M5(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S5(com.bytedance.ies.nle.editor_jni.NLETrackSlot r13, X.InterfaceC1364105Vn<? super java.lang.String> r14) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.S5(com.bytedance.ies.nle.editor_jni.NLETrackSlot, X.05Vn):java.lang.Object");
    }

    public final void X1(List<C381550Exd> list, String str) {
        String string;
        C381550Exd c381550Exd;
        Integer numValueOf;
        C380190EvR c380190EvR;
        String str2;
        if (list.isEmpty()) {
            return;
        }
        C08QU c08quLJIIIZ = C09RB.LJIIIZ(new C1939607ik(list), AFwS234S0000000_5.get$arr$(149));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C08QT c08qt = new C08QT(c08quLJIIIZ);
        while (c08qt.hasNext()) {
            Object next = c08qt.next();
            linkedHashMap.put(((C381550Exd) next).LIZ, next);
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        List<C380190EvR> list2 = this.LLJJIJIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C380190EvR c380190EvRLIZ : list2) {
            C381550Exd c381550Exd2 = (C381550Exd) linkedHashMap.get(c380190EvRLIZ.LIZJ);
            if (c381550Exd2 != null) {
                int i = c381550Exd2.LIZIZ;
                int i2 = c381550Exd2.LIZJ;
                if (c380190EvRLIZ.LJ != i || c380190EvRLIZ.LJFF != i2) {
                    c380190EvRLIZ = C380190EvR.LIZ(c380190EvRLIZ, null, i, i2, 4047);
                }
            }
            arrayList.add(c380190EvRLIZ);
        }
        this.LLJJIJIL = arrayList;
        e4().VX1(arrayList);
        C378970EtT c378970EtT = this.LLJJJ;
        if (c378970EtT == null || (c380190EvR = c378970EtT.LIZ) == null || (str2 = c380190EvR.LIZJ) == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            string = "";
        }
        if (string.length() > 0 && (c381550Exd = (C381550Exd) linkedHashMap.get(string)) != null && (numValueOf = Integer.valueOf(c381550Exd.LIZIZ)) != null && numValueOf.intValue() >= 0) {
            v3().GQ(false);
            v3().vH(numValueOf.intValue(), str);
        }
    }

    @Override // X.InterfaceC379160Etm
    public void fe1(EnumC379010EtX enumC379010EtX, Function2<? super Boolean, ? super String, Unit> function2) {
        boolean z;
        C380190EvR c380190EvR;
        EnumC382100EyW enumC382100EyW;
        String string;
        if (enumC379010EtX == EnumC379010EtX.INIT_OTHER) {
            z = true;
        } else {
            z = false;
        }
        C378970EtT c378970EtT = this.LLJJJ;
        if (c378970EtT != null && (c380190EvR = c378970EtT.LIZ) != null) {
            if (c380190EvR.LJI) {
                enumC382100EyW = EnumC382100EyW.VIDEO;
            } else {
                enumC382100EyW = EnumC382100EyW.IMAGE;
            }
            List<C380190EvR> list = this.LLJJIJIL;
            ArrayList arrayList = new ArrayList();
            for (C380190EvR c380190EvR2 : list) {
                if (c380190EvR2.LJI == c380190EvR.LJI) {
                    arrayList.add(c380190EvR2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C380190EvR) it2.next()).LIZJ);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (!a0.LJJJIL((String) obj)) {
                    arrayList3.add(obj);
                }
            }
            String str = "";
            if (arrayList3.isEmpty()) {
                v3().vH(0, "");
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, "");
                    return;
                }
                return;
            }
            if (!z) {
                str = c380190EvR.LIZJ;
            }
            int i = C378950EtR.LIZIZ[enumC379010EtX.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            string = EnumC379020EtY.GENERATE_FAIL.toString();
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        string = EnumC379020EtY.GENERATE.toString();
                    }
                } else {
                    string = EnumC379020EtY.PRE_FETCH.toString();
                }
            } else {
                string = EnumC379020EtY.PANEL_SHOW.toString();
            }
            o4().LIZIZ(enumC382100EyW, arrayList3, str, string, new AwS28S0310000_5(this, (C378920EtO) c380190EvR, (C380190EvR) z, (boolean) function2, (Function2<? super Boolean, ? super String, Unit>) 0));
        }
    }

    @Override // X.InterfaceC379160Etm
    public void ql2(Function0<Unit> function0, Function0<Unit> function02) {
        C379140Etk.LIZ.getClass();
        if (C379140Etk.LJFF()) {
            function0.invoke();
            return;
        }
        VideoPublishEditModel editModel = getEditModel();
        if (editModel != null) {
            C377120EqU c377120EqU = C377120EqU.LIZ;
            C0E48 c0e48B3 = B3();
            c377120EqU.getClass();
            C20684815ws.LJIILLIIL("ai_create_authorized_popup_show", C377120EqU.LIZJ(editModel, c0e48B3).LIZ);
        }
        Context sceneContext = this.LL.getSceneContext();
        if (sceneContext == null) {
            return;
        }
        C383990F3t c383990F3t = C383990F3t.LIZ;
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, (C378920EtO) function0, (Function0<Unit>) 38);
        AwS406S0200000_5 awS406S0200000_5 = new AwS406S0200000_5(this, (C378920EtO) function02, (Function0<Unit>) 35);
        AwS406S0200000_5 awS406S0200000_52 = new AwS406S0200000_5(this, (C378920EtO) function02, (Function0<Unit>) 36);
        c383990F3t.getClass();
        C383990F3t.LJII(sceneContext, awS371S0200000_5, awS406S0200000_5, awS406S0200000_52);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0 A[PHI: r1
      0x00b0: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:53:0x00fe, B:34:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101 A[PHI: r1
      0x0101: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String), (r1v8 java.lang.String) binds: [B:53:0x00fe, B:36:0x00b2, B:38:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H2(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r27, java.lang.String r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.H2(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0205 A[PHI: r6 r8
      0x0205: PHI (r6v18 java.lang.String) = (r6v16 java.lang.String), (r6v16 java.lang.String), (r6v19 java.lang.String) binds: [B:91:0x014e, B:93:0x0156, B:89:0x014a] A[DONT_GENERATE, DONT_INLINE]
      0x0205: PHI (r8v9 java.lang.String) = (r8v7 java.lang.String), (r8v7 java.lang.String), (r8v10 java.lang.String) binds: [B:91:0x014e, B:93:0x0156, B:89:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0234 A[PHI: r11
      0x0234: PHI (r11v8 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig) = 
      (r11v6 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
      (r11v6 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
      (r11v9 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
     binds: [B:77:0x0125, B:79:0x012d, B:75:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ed A[PHI: r23
      0x02ed: PHI (r23v5 java.lang.String) = (r23v0 java.lang.String), (r23v7 java.lang.String), (r23v7 java.lang.String) binds: [B:194:0x02ea, B:186:0x02be, B:188:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032d A[PHI: r9
      0x032d: PHI (r9v6 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig) = 
      (r9v2 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
      (r9v9 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
     binds: [B:215:0x032b, B:211:0x031f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x038b A[PHI: r23
      0x038b: PHI (r23v1 java.lang.String) = (r23v0 java.lang.String), (r23v3 java.lang.String), (r23v3 java.lang.String) binds: [B:239:0x0388, B:235:0x0363, B:237:0x036b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a9 A[LOOP:9: B:245:0x03a3->B:247:0x03a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04af A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf A[PHI: r3
      0x00cf: PHI (r3v51 com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) = (r3v44 com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode), (r3v54 com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) binds: [B:42:0x00cd, B:38:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0123 A[PHI: r11
      0x0123: PHI (r11v6 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig) = 
      (r11v5 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
      (r11v9 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
      (r11v4 com.ss.android.ugc.gamora.editorpro.aiediting.aigc.logic.dynamicmodel.VideoGenTaskConfig)
     binds: [B:146:0x023c, B:75:0x0121, B:73:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0144 A[PHI: r8
      0x0144: PHI (r8v11 java.lang.String) = (r8v6 java.lang.String), (r8v12 java.lang.String) binds: [B:85:0x0142, B:83:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148 A[PHI: r8
      0x0148: PHI (r8v10 java.lang.String) = (r8v6 java.lang.String), (r8v11 java.lang.String) binds: [B:85:0x0142, B:87:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014c A[PHI: r6 r8
      0x014c: PHI (r6v16 java.lang.String) = (r6v19 java.lang.String), (r6v20 java.lang.String) binds: [B:89:0x014a, B:87:0x0146] A[DONT_GENERATE, DONT_INLINE]
      0x014c: PHI (r8v7 java.lang.String) = (r8v10 java.lang.String), (r8v11 java.lang.String) binds: [B:89:0x014a, B:87:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C378970EtT N5(X.C380190EvR r33, X.EnumC378720Et4 r34, java.util.List<X.C379170Etn> r35, boolean r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.N5(X.0EvR, X.0Et4, java.util.List, boolean):X.0EtT");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x5(java.util.List<X.C381550Exd> r10, X.C380190EvR r11, boolean r12, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378920EtO.x5(java.util.List, X.0EvR, boolean, kotlin.jvm.functions.Function2):void");
    }
}
