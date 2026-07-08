package X;

import Y.AObjectS240S0100000_5;
import Y.AObjectS302S0200000_5;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS105S0100000_5;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS154S1100000_5;
import kotlin.jvm.internal.AwS18S1201000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS66S0301000_5;
import kotlin.jvm.internal.AwS93S0110000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ErT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377730ErT extends C0ETZ<InterfaceC377410Eqx, AbstractC376010Eoh, C377830Erd, C379680Euc> implements InterfaceC377410Eqx {
    public static final C378070Es1 LLLIIIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public static final int LLLIIL;
    public final C19A3 LLJJI;
    public final boolean LLJJIII;
    public final C1DRG LLJJIJI;
    public final Function0<AbstractC376010Eoh> LLJJIJIIJIL;
    public final Function0<C377830Erd> LLJJIJIL;
    public final Function0<C379680Euc> LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final AsyncTasksPanelViewModel LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C09AE LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public int LLLF;
    public NLETrack LLLFF;
    public String LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public final C01GW LLLII;
    public C1884507Zr LLLIIII;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Es1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C377730ErT.class, "editorProInitApi", "getEditorProInitApi()Lcom/ss/android/ugc/gamora/editorpro/startup/api/EditorProInitApi;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C377730ErT.class, "adjustCanvasApi", "getAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0), new C2217381BqS(C377730ErT.class, "editorProLoaderApi", "getEditorProLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C377730ErT.class, "saveAndCancelApi", "getSaveAndCancelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/topbar/EPSaveAndCancelComponent;", 0), new C2217381BqS(C377730ErT.class, "previewPanelApi", "getPreviewPanelApi()Lcom/ss/ugc/android/editor/preview/PreviewPanelApiComponent;", 0), new C2217381BqS(C377730ErT.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0), new C2217381BqS(C377730ErT.class, "epAdjustCanvasApi", "getEpAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0)};
        LLLIIIIL = new Object() { // from class: X.0Es1
        };
        LLLIIL = 8;
    }

    private final InterfaceC376000Eog D5() {
        return (InterfaceC376000Eog) this.LLJLL.getValue();
    }

    private final C0EY2 H5() {
        return (C0EY2) this.LLJJJJJIL.getValue(this, LLLIIIL[2]);
    }

    private final C376420EpM K6() {
        return (C376420EpM) this.LLJJJJLIIL.getValue(this, LLLIIIL[3]);
    }

    private final InterfaceC362230EIb M5() {
        return (InterfaceC362230EIb) this.LLJL.getValue(this, LLLIIIL[6]);
    }

    private final InterfaceC355850DxH N6() {
        return (InterfaceC355850DxH) this.LLL.getValue();
    }

    private final InterfaceC1737690vJv U5() {
        return (InterfaceC1737690vJv) this.LLLII.getValue();
    }

    private final void W6() {
        AIGCGenerationParamType aIGCGenerationParamType;
        List<EditorProAIGCMediaItemModel> list;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel;
        AIGCGenerationParam aIGCGenerationParam;
        if (T2().LIZ) {
            J6().LJFF(EnumC378030Erx.T2I, null, null, new AwS584S0100000_5(this, 309));
            n9(this, AIGCGenerationParamType.T2I_TYPE, new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 1023), true);
            InterfaceC381940EyG interfaceC381940EyGJ6 = J6();
            AIGCGenerationParamType aIGCGenerationParamType2 = AIGCGenerationParamType.T2V_TYPE;
            interfaceC381940EyGJ6.LJFF(C378120Es6.LIZJ(aIGCGenerationParamType2), null, null, new AwS584S0100000_5(this, 310));
            n9(this, aIGCGenerationParamType2, new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 1023), true);
            return;
        }
        if (T2().LIZJ == EnumC378720Et4.TEXT_TO_IMAGE_RESULT) {
            aIGCGenerationParamType = AIGCGenerationParamType.T2I_TYPE;
        } else if (T2().LIZJ != EnumC378720Et4.TEXT_TO_VIDEO_RESULT && T2().LIZJ != EnumC378720Et4.AI_TRANSITION_RESULT) {
            return;
        } else {
            aIGCGenerationParamType = AIGCGenerationParamType.T2V_TYPE;
        }
        if (aIGCGenerationParamType != null) {
            n9(this, aIGCGenerationParamType, new C377660ErM(false, 0, null, 0, 0, false, null, 0, null, null, 1023), true);
            C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = T2().LJ;
            AIGCGenerationSubType aIGCGenerationSubType = (c375830EoP == null || (list = c375830EoP.LIZ) == null || (editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(list)) == null || (aIGCGenerationParam = editorProAIGCMediaItemModel.param) == null) ? null : aIGCGenerationParam.subGenerateType;
            AIGCGenerationSubType aIGCGenerationSubType2 = AIGCGenerationSubType.AI_TRANSITION;
            AIGCGenerationSubType aIGCGenerationSubType3 = aIGCGenerationSubType == aIGCGenerationSubType2 ? aIGCGenerationSubType2 : null;
            J6().LJFF(C378120Es6.LIZJ(aIGCGenerationParamType), null, C378120Es6.LIZIZ(aIGCGenerationSubType3), new AwS214S0300000_5(this, aIGCGenerationParamType, aIGCGenerationSubType3, 7));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final AbstractC359300E6u h8() {
        String str = this.LLLFFI;
        switch (str.hashCode()) {
            case -601295290:
                if (str.equals("edit_toolbar")) {
                    return C359200E6k.LIZIZ;
                }
                break;
            case 101944123:
                if (str.equals("upload_page_new_edit")) {
                    return C0E9B.LIZIZ;
                }
                break;
            case 438244595:
                if (str.equals("ai_create")) {
                    return C359240E6o.LIZIZ;
                }
                break;
            case 1064871437:
                if (str.equals("upload_page")) {
                    return C359220E6m.LIZIZ;
                }
                break;
            case 1367584105:
                if (str.equals("ep_transition")) {
                    return new AbstractC359300E6u() { // from class: X.0E9A
                    };
                }
                break;
        }
        return C359200E6k.LIZIZ;
    }

    private final InterfaceC362230EIb n5() {
        return (InterfaceC362230EIb) this.LLJJJJ.getValue(this, LLLIIIL[1]);
    }

    private final C0EGY t5() {
        return (C0EGY) this.LLJLLL.getValue();
    }

    private final InterfaceC360800ECo v5() {
        return (InterfaceC360800ECo) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLIIIL[5]);
    }

    public final InterfaceC377650ErL C5() {
        return (InterfaceC377650ErL) this.LLJLILLLLZIIL.getValue();
    }

    public final C0EFH E5() {
        return (C0EFH) this.LLJJJIL.getValue(this, LLLIIIL[0]);
    }

    public final InterfaceC381940EyG J6() {
        return (InterfaceC381940EyG) this.LLJZIJLIL.getValue();
    }

    public final void K4() {
        if (this.LLLI) {
            this.LLLI = false;
            InterfaceC361710EGb interfaceC361710EGbU6 = u6();
            if (interfaceC361710EGbU6 != null) {
                interfaceC361710EGbU6.XF1(true);
            }
        }
    }

    @Override // X.InterfaceC377410Eqx
    public void M10() {
        C09AE c09ae = this.LLJLLIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        K4();
        if (this.LLJJIII) {
            N6().LIZLLL(C378120Es6.LIZJ(AIGCGenerationParamType.T2I_TYPE));
            N6().LIZLLL(C378120Es6.LIZJ(AIGCGenerationParamType.T2V_TYPE));
        } else {
            N6().LIZLLL(C378120Es6.LIZJ(T2().LIZJ == EnumC378720Et4.TEXT_TO_IMAGE_RESULT ? AIGCGenerationParamType.T2I_TYPE : AIGCGenerationParamType.T2V_TYPE));
        }
        J8(false, null);
    }

    public final InterfaceC378020Erw N5() {
        return (InterfaceC378020Erw) this.LLJZ.getValue();
    }

    public final boolean P6() {
        C379140Etk.LIZ.getClass();
        return C379140Etk.LIZIZ();
    }

    public final InterfaceC361710EGb u6() {
        return (InterfaceC361710EGb) this.LLJJL.getValue(this, LLLIIIL[4]);
    }

    private final NLEModel LLZ() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            return C350870DpF.LJI(c0e48F4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T8() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.T8():void");
    }

    private final void Xi() {
        MutableLiveData<C377380Equ> mutableLiveData;
        C385670FAf<C377660ErM> c385670FAfF21;
        C385670FAf<C377660ErM> c385670FAfPd2;
        C385670FAf<C377660ErM> c385670FAfPS1;
        C385670FAf<C040900Cp> c385670FAfDa2;
        C385670FAf<C377750ErV> c385670FAfQl0;
        z8();
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null && (c385670FAfQl0 = interfaceC377650ErLC5.Ql0()) != null) {
            c385670FAfQl0.LIZ(this, new AObjectS240S0100000_5(this, 53));
        }
        InterfaceC377650ErL interfaceC377650ErLC52 = C5();
        if (interfaceC377650ErLC52 != null && (c385670FAfDa2 = interfaceC377650ErLC52.Da2()) != null) {
            c385670FAfDa2.LIZ(this, new AObjectS240S0100000_5(this, 54));
        }
        InterfaceC377650ErL interfaceC377650ErLC53 = C5();
        if (interfaceC377650ErLC53 != null && (c385670FAfPS1 = interfaceC377650ErLC53.pS1()) != null) {
            c385670FAfPS1.LIZ(this, new AObjectS240S0100000_5(this, 55));
        }
        InterfaceC377650ErL interfaceC377650ErLC54 = C5();
        if (interfaceC377650ErLC54 != null && (c385670FAfPd2 = interfaceC377650ErLC54.pd2()) != null) {
            c385670FAfPd2.LIZ(this, new AObjectS240S0100000_5(this, 56));
        }
        InterfaceC377650ErL interfaceC377650ErLC55 = C5();
        if (interfaceC377650ErLC55 != null && (c385670FAfF21 = interfaceC377650ErLC55.F21()) != null) {
            c385670FAfF21.LIZ(this, new AObjectS240S0100000_5(this, 57));
        }
        AsyncTasksPanelViewModel asyncTasksPanelViewModel = this.LLJLIL;
        if (asyncTasksPanelViewModel != null && (mutableLiveData = asyncTasksPanelViewModel.LLJJJ) != null) {
            mutableLiveData.observe(this, new AObserverS209S0100000_5(this, 35));
        }
        if (getDiContainer().LIZJ(InterfaceC362600EJm.class)) {
            whenReadyOrThrowInternal(getDiContainer(), InterfaceC362600EJm.class, new AwS584S0100000_5(this, 308));
        }
    }

    private final void z8() {
        C385670FAf<Boolean> c385670FAfJ50;
        final VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return;
        }
        C363500EMy.LIZ.getClass();
        if (C363500EMy.LJIILJJIL(editModel)) {
            C0EFH c0efhE5 = E5();
            if (c0efhE5 != null && (c385670FAfJ50 = c0efhE5.J50()) != null) {
                c385670FAfJ50.LIZ(this, new AObjectS302S0200000_5(editModel, this, 4));
            }
            C0EGY c0egyT5 = t5();
            InterfaceC359940E9g interfaceC359940E9gAZ0 = c0egyT5 != null ? c0egyT5.AZ0() : null;
            C0E5R c0e5r = new C0E5R() { // from class: X.0Efe
                @Override // X.C0EHU
                public final void LJ(C361980EHc c361980EHc) {
                    if (!this.LIZ.P6()) {
                        this.LIZ.u8();
                    }
                }
            };
            if (interfaceC359940E9gAZ0 != null) {
                interfaceC359940E9gAZ0.LIZJ(c0e5r);
            }
            InterfaceC361900EGu interfaceC361900EGu = new InterfaceC361900EGu() { // from class: X.0Eff
                @Override // X.InterfaceC361900EGu
                public final void LIZ(List<String> list) {
                }

                @Override // X.InterfaceC361900EGu
                public final void LIZIZ(List<String> list) {
                    MutableLiveData<C1884507Zr> mutableLiveDataNG;
                    C377730ErT c377730ErT = this;
                    C1884507Zr c1884507Zr = c377730ErT.LLLIIII;
                    if (c1884507Zr != null) {
                        VideoPublishEditModel videoPublishEditModel = editModel;
                        C363500EMy.LIZ.getClass();
                        if (C363500EMy.LJIILJJIL(videoPublishEditModel)) {
                            C0EFH c0efhE52 = c377730ErT.E5();
                            if (c0efhE52 != null && (mutableLiveDataNG = c0efhE52.nG()) != null) {
                                mutableLiveDataNG.setValue(c1884507Zr);
                            }
                            c377730ErT.LLLIIII = null;
                        }
                    }
                }
            };
            C0EGY c0egyT52 = t5();
            if (c0egyT52 != null) {
                c0egyT52.aE0(interfaceC361900EGu);
            }
        }
    }

    @Override // X.InterfaceC377410Eqx
    public void LIZLLL() {
        InterfaceC377650ErL interfaceC377650ErLC5;
        K4();
        C1447800nmM.LIZIZ(this.LLJJI).LLLLLLLZIL(U5());
        C19EG c19eg = (C19EG) this.LLJJI.mActivity;
        if (c19eg != null) {
            C1202340hOS.LIZIZ(c19eg, C1655600tBW.LIZ);
        }
        C376420EpM c376420EpMK6 = K6();
        if (c376420EpMK6 != null) {
            c376420EpMK6.dB1(true);
        }
        InterfaceC361710EGb interfaceC361710EGbU6 = u6();
        if (interfaceC361710EGbU6 != null) {
            interfaceC361710EGbU6.LLJJIJIIJIL(true);
        }
        t9(false);
        c9(false, null);
        y8(false);
        i3(AFwS234S0000000_5.get$arr$(156));
        o8(true);
        hide();
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = T2().LJFF;
        if (editorProAIGCMediaItemModel == null || (interfaceC377650ErLC5 = C5()) == null) {
            return;
        }
        interfaceC377650ErLC5.kq0(editorProAIGCMediaItemModel.epAIGCId);
    }

    @Override // X.InterfaceC377410Eqx
    public boolean LJLILLLLZI() {
        return T2().LIZLLL == EnumC378320EsQ.SHOW || T2().LIZLLL == EnumC378320EsQ.SHOW_WITH_ANIMATION;
    }

    public final NLEEditor S5() {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            return c0e48F4.LLFII().LJI();
        }
        return null;
    }

    public final void Z4() {
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = T2().LJFF;
        zg0(editorProAIGCMediaItemModel != null ? editorProAIGCMediaItemModel.type : null, new AwS406S0200000_5(editorProAIGCMediaItemModel, this, 42));
    }

    public final VideoPublishEditModel getEditModel() {
        C0EY2 c0ey2H5 = H5();
        if (c0ey2H5 != null) {
            return c0ey2H5.getEditModel();
        }
        return null;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    public final void u8() {
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        C0EGY c0egyT5 = t5();
        if (c0egyT5 != null && (interfaceC359940E9gAZ0 = c0egyT5.AZ0()) != null) {
            interfaceC359940E9gAZ0.LJ("bottom_item_root_ai_create", false);
        }
        this.LLLIIII = new C1884507Zr(C0EIE.AI_CREATE);
    }

    public final int x5() {
        Integer numValueOf;
        InterfaceC362230EIb interfaceC362230EIbM5 = M5();
        return (interfaceC362230EIbM5 == null || (numValueOf = Integer.valueOf(interfaceC362230EIbM5.ft2())) == null || numValueOf.intValue() <= 0) ? C0ES3.LIZ() : numValueOf.intValue();
    }

    @Override // ge.i
    public Function0<AbstractC376010Eoh> E3() {
        return this.LLJJIJIIJIL;
    }

    public final boolean d7() {
        return this.LLJJIII;
    }

    @Override // X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJIJI;
    }

    public final C19A3 getParentScene() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C377830Erd> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C379680Euc> w2() {
        return this.LLJJJ;
    }

    private final EditorProAIGCMediaItemModel L6(List<EditorProAIGCMediaItemModel> list) {
        EditorProAIGCMediaItemModel next;
        if (list == null) {
            return T2().LJFF;
        }
        Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
        while (true) {
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
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = next;
        if (editorProAIGCMediaItemModel == null) {
            return (EditorProAIGCMediaItemModel) C13LP.LJJJLL(list);
        }
        return editorProAIGCMediaItemModel;
    }

    private final String d8(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        AIGCGenerationParam aIGCGenerationParam;
        String str;
        NLEModel nLEModelLLZ;
        NLETrackSlot nLETrackSlotLIZLLL;
        String uuid;
        if (editorProAIGCMediaItemModel != null && (aIGCGenerationParam = editorProAIGCMediaItemModel.param) != null && (str = aIGCGenerationParam.epID) != null && (!a0.LJJJIL(str)) && !a0.LJJJIL(str) && (nLEModelLLZ = LLZ()) != null && (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModelLLZ, str)) != null && (uuid = nLETrackSlotLIZLLL.getUUID()) != null && (!a0.LJJJIL(uuid))) {
            return uuid;
        }
        String str2 = T2().LJIILLIIL;
        if (str2 != null && (true ^ a0.LJJJIL(str2))) {
            return str2;
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[PHI: r1
      0x00a4: PHI (r1v4 boolean) = (r1v3 boolean), (r1v6 boolean) binds: [B:46:0x00a1, B:34:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t9(boolean r11) {
        /*
            r10 = this;
            r5 = 0
            java.lang.String r2 = "select_slot_event"
            r3 = -1
            r4 = 0
            if (r11 == 0) goto L4c
            X.0E48 r0 = r10.F4()
            if (r0 == 0) goto L11
            com.bytedance.ies.nle.editor_jni.NLETrack r4 = r0.Pt()
        L11:
            r10.LLLFF = r4
            X.0E48 r0 = r10.F4()
            if (r0 == 0) goto L31
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r0.LLLLLLIL()
            if (r1 == 0) goto L31
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r10.LLLFF
            if (r0 == 0) goto L31
            int r0 = r0.getSlotIndex(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L31
            int r3 = r0.intValue()
        L31:
            r10.LLLF = r3
            X.0E48 r0 = r10.F4()
            if (r0 == 0) goto L4b
            X.0E4q r3 = new X.0E4q
            r4 = 0
            r9 = 254(0xfe, float:3.56E-43)
            r6 = r4
            r7 = r5
            r8 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.0DpP r0 = r0.S7()
            r0.LIZIZ(r3, r2, r5)
        L4b:
            return
        L4c:
            int r1 = r10.LLLF
            if (r1 == r3) goto L4b
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r10.LLLFF
            if (r0 == 0) goto L58
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r0.getSlotByIndex(r1)
        L58:
            X.0E48 r0 = r10.F4()
            if (r0 == 0) goto L6f
            X.0E4q r3 = new X.0E4q
            r6 = 0
            r9 = 238(0xee, float:3.34E-43)
            r7 = r5
            r8 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.0DpP r0 = r0.S7()
            r0.LIZIZ(r3, r2, r5)
        L6f:
            r3 = 1
            if (r4 == 0) goto L84
            boolean r0 = X.C0E5J.LIZJ(r4)
            if (r0 != r3) goto La0
            r1 = 1
        L79:
            boolean r0 = X.C0E5J.LIZLLL(r4)
            if (r0 != r3) goto La4
            r0 = 1
        L80:
            if (r1 != 0) goto L4b
            if (r0 != 0) goto L4b
        L84:
            X.0EGb r2 = r10.u6()
            if (r2 == 0) goto L93
            X.0ELW[] r1 = new X.C0ELW[r3]
            X.0ELW r0 = X.C0ELW.VIDEO
            r1[r5] = r0
            r2.o10(r1, r3)
        L93:
            X.0EGb r2 = r10.u6()
            if (r2 == 0) goto L4b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = 0
            r2.Kq2(r1, r0, r0, r0)
            return
        La0:
            r1 = 0
            if (r4 == 0) goto La4
            goto L79
        La4:
            r0 = 0
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.t9(boolean):void");
    }

    private final void u7(String str) {
        NLETrack nLETrackPt;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        int iIntValue;
        NLETrackSlot nLETrackSlotLIZLLL;
        NLETrack nLETrack;
        Integer numValueOf;
        Object next;
        C0E48 c0e48F4 = F4();
        NLETrack nLETrack2 = null;
        if (c0e48F4 != null) {
            nLETrackPt = c0e48F4.Pt();
        } else {
            nLETrackPt = null;
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null) {
            nLETrackSlotLLLLLLIL = c0e48F42.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        if (nLETrackPt != null && nLETrackSlotLLLLLLIL != null) {
            this.LLLFF = nLETrackPt;
            this.LLLF = nLETrackPt.getSlotIndex(nLETrackSlotLLLLLLIL);
        } else {
            C0E48 c0e48F43 = F4();
            if (c0e48F43 != null) {
                Iterator it2 = ((ArrayList) C352250DrT.LJI(C350870DpF.LJI(c0e48F43))).iterator();
                loop0: while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        VecNLETrackSlotSPtr slots = ((NLETrack) next).getSlots();
                        if (!(slots instanceof Collection) || !slots.isEmpty()) {
                            Iterator<NLETrackSlot> it3 = slots.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.LJFF(C377740ErU.LIZIZ(it3.next()), str)) {
                                    break loop0;
                                }
                            }
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                nLETrack2 = (NLETrack) next;
            }
            this.LLLFF = nLETrack2;
            C0E48 c0e48F44 = F4();
            if (c0e48F44 != null && (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(C350870DpF.LJI(c0e48F44), str)) != null && (nLETrack = this.LLLFF) != null && (numValueOf = Integer.valueOf(nLETrack.getSlotIndex(nLETrackSlotLIZLLL))) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            this.LLLF = iIntValue;
        }
        C0E48 c0e48F45 = F4();
        if (c0e48F45 != null) {
            c0e48F45.S7().LIZIZ(new C358740E4q(null, 0, null, false, 0, 254), "select_slot_event", false);
        }
    }

    private final void y8(boolean z) {
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            C350870DpF.LJIIIZ(c0e48F4, "is_editor_pro_aigc_panel_showing", Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC377410Eqx
    public void Na0(String str) {
        if (!Intrinsics.LJFF(T2().LJIILLIIL, str)) {
            return;
        }
        i3(new AwS119S1100000_5(this, str, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public final void O4(String str) {
        ?? arrayList;
        Pair pair;
        float fFloatValue;
        int iIntValue;
        int size;
        boolean z;
        String str2;
        AIGenerationType aIGenerationTypeLIZJ;
        NLETrackSlot nLETrackSlotLIZ;
        List<EditorProAIGCMediaItemModel> list;
        String str3;
        boolean z2;
        int i;
        String str4;
        int iIntValue2;
        int size2;
        List<EditorProAIGCMediaItemModel> list2;
        VideoPublishEditModel editModel = getEditModel();
        if (editModel == null) {
            return;
        }
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = T2().LJFF;
        if (editorProAIGCMediaItemModel == null) {
            editorProAIGCMediaItemModel = new EditorProAIGCMediaItemModel(null, null, null, null, 0.0f, null, null, null, null, 0L, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(editorProAIGCMediaItemModel.param.aspectRatio, new String[]{":"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() == 2) {
            arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ((String) it2.next());
                if (fLJIIIIZZ != null) {
                    arrayList.add(fLJIIIIZZ);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        if (arrayList.size() == 2) {
            pair = new Pair(ListProtector.get(arrayList, 0), ListProtector.get(arrayList, 1));
        } else {
            pair = new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        float fFloatValue2 = ((Number) pair.getFirst()).floatValue();
        float fFloatValue3 = ((Number) pair.getSecond()).floatValue();
        AIGCGenerationParam aIGCGenerationParam = editorProAIGCMediaItemModel.param;
        float f = aIGCGenerationParam.duration / LSPassThroughRecordSizeConfig.DEFAULT;
        Float f2 = aIGCGenerationParam.speed;
        if (f2 != null) {
            fFloatValue = f2.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        String strK4 = C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f / fFloatValue)}, 1));
        String str5 = "square";
        if (!T2().LIZ && T2().LIZJ != EnumC378720Et4.TEXT_TO_VIDEO_RESULT && T2().LIZJ != EnumC378720Et4.AI_TRANSITION_RESULT) {
            if (T2().LIZJ == EnumC378720Et4.TEXT_TO_IMAGE_RESULT) {
                if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
                    str3 = "original";
                } else {
                    str3 = editorProAIGCMediaItemModel.param.aspectRatio;
                }
                if (editorProAIGCMediaItemModel.param.imagePath.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str6 = "";
                if (z2) {
                    i = 1;
                    str4 = editorProAIGCMediaItemModel.param.imageSource;
                } else {
                    i = 0;
                    str4 = "";
                }
                C377120EqU c377120EqU = C377120EqU.LIZ;
                C0E48 c0e48F4 = F4();
                String str7 = this.LLLFFI;
                Integer num = T2().LJIIIIZZ;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = T2().LJ;
                if (c375830EoP != null && (list2 = c375830EoP.LIZ) != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                String str8 = editorProAIGCMediaItemModel.serverDownloadUrl;
                if (fFloatValue2 != fFloatValue3) {
                    if (fFloatValue2 > fFloatValue3) {
                        str5 = "landscape";
                    } else {
                        str5 = "portrait";
                    }
                }
                AIGCGenerationParam aIGCGenerationParam2 = editorProAIGCMediaItemModel.param;
                String str9 = aIGCGenerationParam2.promptDescription;
                String str10 = aIGCGenerationParam2.styleEffectId;
                String str11 = aIGCGenerationParam2.styleName;
                String str12 = editorProAIGCMediaItemModel.serverTaskId;
                c377120EqU.getClass();
                C0LAB c0labLIZJ = C377120EqU.LIZJ(editModel, c0e48F4);
                c0labLIZJ.LJ("enter_source", str7);
                c0labLIZJ.LIZ(1, "is_from_result_page");
                c0labLIZJ.LIZ(iIntValue2, "left_generate_times");
                c0labLIZJ.LIZ(size2, "generate_item_cnt");
                c0labLIZJ.LJ("click_button_name", str);
                c0labLIZJ.LJ("picture_id", str8);
                c0labLIZJ.LJ("container_type", str5);
                c0labLIZJ.LJ("prompt_content", str9);
                c0labLIZJ.LJ("aspect_ratio", str3);
                c0labLIZJ.LJ("ai_image_style_resource_id", str10);
                c0labLIZJ.LJ("ai_image_style_resource_name", str11);
                c0labLIZJ.LJ("task_id", str12);
                c0labLIZJ.LIZ(i, "is_upload_reference_image");
                if (str4 != null) {
                    str6 = str4;
                }
                c0labLIZJ.LJ("reference_image_source", str6);
                C20684815ws.LJIILLIIL("click_text_to_image_result_page", c0labLIZJ.LIZ);
                return;
            }
            return;
        }
        C377120EqU c377120EqU2 = C377120EqU.LIZ;
        C0E48 c0e48F42 = F4();
        String str13 = this.LLLFFI;
        Integer num2 = T2().LJIILIIL;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP2 = T2().LJ;
        if (c375830EoP2 != null && (list = c375830EoP2.LIZ) != null) {
            size = list.size();
        } else {
            size = 0;
        }
        String str14 = editorProAIGCMediaItemModel.serverDownloadUrl;
        if (fFloatValue2 != fFloatValue3) {
            if (fFloatValue2 > fFloatValue3) {
                str5 = "landscape";
            } else {
                str5 = "portrait";
            }
        }
        AIGCGenerationParam aIGCGenerationParam3 = editorProAIGCMediaItemModel.param;
        String str15 = aIGCGenerationParam3.promptDescription;
        String str16 = aIGCGenerationParam3.aspectRatio;
        String str17 = editorProAIGCMediaItemModel.serverTaskId;
        if (aIGCGenerationParam3.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
            z = true;
        } else {
            z = false;
        }
        String str18 = editorProAIGCMediaItemModel.slotId;
        c377120EqU2.getClass();
        C0LAB c0labLIZJ2 = C377120EqU.LIZJ(editModel, c0e48F42);
        c0labLIZJ2.LJ("enter_source", str13);
        c0labLIZJ2.LIZ(1, "is_from_result_page");
        c0labLIZJ2.LIZ(iIntValue, "left_generate_times");
        c0labLIZJ2.LIZ(size, "generate_item_cnt");
        c0labLIZJ2.LJ("click_button_name", str);
        c0labLIZJ2.LJ("video_id", str14);
        c0labLIZJ2.LJ("container_type", str5);
        c0labLIZJ2.LJ("prompt_content", str15);
        c0labLIZJ2.LJ("aspect_ratio", str16);
        c0labLIZJ2.LJ("duration", strK4);
        c0labLIZJ2.LJ("task_id", str17);
        if (z) {
            str2 = "transition";
        } else {
            str2 = "ai_create";
        }
        c0labLIZJ2.LJ("scenerio", str2);
        IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
        if (iAIPlaygroundMobServiceLIZ == null || (aIGenerationTypeLIZJ = iAIPlaygroundMobServiceLIZ.LIZJ(editModel)) == null) {
            aIGenerationTypeLIZJ = AIGenerationType.NONE;
        }
        if (aIGenerationTypeLIZJ != AIGenerationType.NONE) {
            if (c0e48F42 != null) {
                nLETrackSlotLIZ = C346680DiU.LIZ(C350870DpF.LJI(c0e48F42), str18);
            } else {
                nLETrackSlotLIZ = null;
            }
            if (C0E5J.LJFF(nLETrackSlotLIZ)) {
                c0labLIZJ2.LJ("ai_video_tool_name", C380220EvU.LIZ(aIGenerationTypeLIZJ));
            }
        }
        C20684815ws.LJIILLIIL("click_text_to_video_result_page", c0labLIZJ2.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P4(X.C377750ErV r40) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.P4(X.0ErV):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T4(X.C377750ErV r48) {
        /*
            Method dump skipped, instruction units count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.T4(X.0ErV):void");
    }

    public final void W7(String str) {
        NLETrackSlot nLETrackSlotLIZLLL;
        C0E55 player;
        C0E55 player2;
        if (!this.LLLI) {
            return;
        }
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ != null && (nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModelLLZ, str)) != null) {
            C0E48 c0e48F4 = F4();
            if (c0e48F4 != null && (player2 = c0e48F4.getPlayer()) != null) {
                player2.pause(false);
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
                player.LJIJI(nLETrackSlotLIZLLL.getStartTime(), C351110Dpd.LIZ);
            }
        }
        K4();
    }

    public final void Z7(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        InterfaceC376000Eog interfaceC376000EogD5;
        if ((editorProAIGCMediaItemModel != null || (editorProAIGCMediaItemModel = T2().LJFF) != null) && (interfaceC376000EogD5 = D5()) != null) {
            interfaceC376000EogD5.Ko1(editorProAIGCMediaItemModel);
        }
    }

    public final void a9(AIGCGenerationParam aIGCGenerationParam) {
        NLETrackSlot nLETrackSlotLIZLLL;
        final AIGCGenerationParam aIGCGenerationParamLIZ;
        NLETrackSlot nLETrackSlotLIZLLL2;
        NLETrack nLETrackLJLLILLLL;
        final String str = T2().LJIILLIIL;
        if (str == null) {
            K4();
            return;
        }
        AIGCGenerationParam aIGCGenerationParamLIZIZ = C378330EsR.LIZIZ(aIGCGenerationParam);
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ != null) {
            nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModelLLZ, str);
        } else {
            nLETrackSlotLIZLLL = null;
        }
        if (nLETrackSlotLIZLLL != null && nLEModelLLZ != null && aIGCGenerationParamLIZIZ.businessType == AIGCBusinessType.AI_EXTEND && (nLETrackLJLLILLLL = C351220Dpo.LJLLILLLL(nLEModelLLZ, nLETrackSlotLIZLLL.getUUID())) != null && C351220Dpo.LLLIIL(nLETrackLJLLILLLL)) {
            C359310E6v.LIZ.getClass();
            aIGCGenerationParamLIZIZ = C377920Erm.LIZ(aIGCGenerationParamLIZIZ, C359310E6v.LIZIZ(nLEModelLLZ, nLETrackSlotLIZLLL));
        }
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null && interfaceC377650ErLC5.iY(str, aIGCGenerationParamLIZIZ)) {
            aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZIZ, null, null, null, null, str, null, false, 0, false, null, null, null, null, -40961, 7);
        } else {
            aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamLIZIZ, null, null, null, null, str, null, false, 0, false, null, null, null, null, -8193, 7);
        }
        NLEModel nLEModelLLZ2 = LLZ();
        if (nLEModelLLZ2 != null && (nLETrackSlotLIZLLL2 = C377740ErU.LIZLLL(nLEModelLLZ2, str)) != null) {
            C349070DmL.LIZ(nLEModelLLZ2, nLETrackSlotLIZLLL2, true);
        }
        J6().LJ(C378120Es6.LIZ(aIGCGenerationParamLIZ), true, new InterfaceC382370Eyx() { // from class: X.0Erj
            @Override // X.InterfaceC382370Eyx
            public final void LJIIJ(String str2) {
                InterfaceC377650ErL interfaceC377650ErLC52 = this.LIZ.C5();
                if (interfaceC377650ErLC52 != null) {
                    interfaceC377650ErLC52.GP0(aIGCGenerationParamLIZ, str2, null, false, "", new AwS154S1100000_5(this.LIZ, str, 2));
                }
            }

            @Override // X.InterfaceC382370Eyx
            public final void LIZ(C377760ErW c377760ErW, EnumC381960EyI enumC381960EyI, String str2, String str3) {
                this.LIZ.K4();
                InterfaceC377650ErL interfaceC377650ErLC52 = this.LIZ.C5();
                if (interfaceC377650ErLC52 != null) {
                    interfaceC377650ErLC52.PI2(c377760ErW, enumC381960EyI, str2, false, str3);
                }
            }
        });
    }

    public final void d5(AICreateStylizedType aICreateStylizedType) {
        AIGCGenerationParam aIGCGenerationParamH4;
        Context contextLIZIZ;
        LIZLLL();
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = T2().LJFF;
        String strD8 = d8(editorProAIGCMediaItemModel);
        AIGCGenerationParam aIGCGenerationParamLIZ = null;
        if (editorProAIGCMediaItemModel != null) {
            aIGCGenerationParamH4 = H4(editorProAIGCMediaItemModel, strD8, aICreateStylizedType);
        } else {
            aIGCGenerationParamH4 = null;
        }
        if (aICreateStylizedType == AICreateStylizedType.STYLIZED_FL2V && aIGCGenerationParamH4 == null) {
            if (!C545820Lau.LJ(this.LLJJI) && (contextLIZIZ = C545820Lau.LIZIZ(this.LLJJI)) != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131850743);
                creativeToastBuilder.isTuxToast(true);
                C1390380mHk.LIZJ(contextLIZIZ, 3046, creativeToastBuilder);
                return;
            }
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            if (aIGCGenerationParamH4 != null) {
                aIGCGenerationParamLIZ = AIGCGenerationParam.LIZ(aIGCGenerationParamH4, null, null, null, "", null, null, false, 0, false, null, null, null, null, -65, 7);
            }
            C375820EoO.LIZ(this.LLJJI, c0e48F4, C376260Ep6.class, new C379120Eti(c0e48F4, getEditModel(), EnumC378720Et4.TEXT_TO_VIDEO_CREATION, aIGCGenerationParamLIZ, T2().LJIILLIIL, null, false, true, false, false, null, null, System.currentTimeMillis(), EnumC378910EtN.RESULT_PAGE, 3936), 16);
        }
    }

    public final AIGCGenerationParamType d6(EnumC378720Et4 enumC378720Et4) {
        if (enumC378720Et4 == EnumC378720Et4.TEXT_TO_IMAGE_RESULT) {
            return AIGCGenerationParamType.T2I_TYPE;
        }
        return AIGCGenerationParamType.T2V_TYPE;
    }

    @Override // X.InterfaceC377410Eqx
    public void eO(String str) {
        if (str.length() == 0) {
            str = "ai_create";
        }
        this.LLLFFI = str;
    }

    public final void k7(List<EditorProAIGCMediaItemModel> list) {
        AIGCGenerationParamType aIGCGenerationParamType;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModelL6 = L6(list);
        if (editorProAIGCMediaItemModelL6 != null) {
            aIGCGenerationParamType = editorProAIGCMediaItemModelL6.type;
        } else {
            aIGCGenerationParamType = null;
        }
        zg0(aIGCGenerationParamType, new AwS406S0200000_5(this, (C377730ErT) list, (List<EditorProAIGCMediaItemModel>) 43));
    }

    public final void n7(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel) {
        zg0(editorProAIGCMediaItemModel.type, new AwS406S0200000_5(editorProAIGCMediaItemModel, this, 44));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o7(java.util.List<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel> r23) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.o7(java.util.List):void");
    }

    public final void o8(boolean z) {
        C0E55 player;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaSettings mediaSettingApi;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (iNLEMediaSessionF1 = c0e48F4.f1()) != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
            mediaSettingApi.setLoopPlay(false);
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
            boolean zIsPlaying = player.isPlaying();
            player.LJIILL(true);
            player.LJIJJLI();
            if (z) {
                player.pause(false);
            } else {
                if (!zIsPlaying) {
                    return;
                }
                player.LLIL(false);
            }
        }
    }

    public final void r8(Function0<Unit> function0) {
        this.LLLI = true;
        InterfaceC361710EGb interfaceC361710EGbU6 = u6();
        if (interfaceC361710EGbU6 != null) {
            interfaceC361710EGbU6.mi1(false, new AwS406S0200000_5(this, (C377730ErT) function0, (Function0<Unit>) 41));
        } else {
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    public final void s7(List<EditorProAIGCMediaItemModel> list) {
        T t;
        String strMd0;
        NLETrackSlot nLETrackSlot;
        int slotIndex;
        NLETrack mainTrack;
        C259800zU c259800zU = new C259800zU();
        ?? r0 = T2().LJIILLIIL;
        if (r0 == 0) {
            return;
        }
        c259800zU.element = r0;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModelL6 = L6(list);
        C259800zU c259800zU2 = new C259800zU();
        if (editorProAIGCMediaItemModelL6 != null) {
            t = editorProAIGCMediaItemModelL6.param;
        } else {
            t = 0;
        }
        c259800zU2.element = t;
        if (t == 0) {
            return;
        }
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null) {
            strMd0 = interfaceC377650ErLC5.md0((String) c259800zU.element, null);
        } else {
            strMd0 = null;
        }
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ != null) {
            String str = T2().LJIILLIIL;
            if (str == null) {
                str = "";
            }
            nLETrackSlot = C377740ErU.LIZLLL(nLEModelLLZ, str);
        } else {
            nLETrackSlot = null;
        }
        NLEModel nLEModelLLZ2 = LLZ();
        if (nLEModelLLZ2 != null && (mainTrack = nLEModelLLZ2.getMainTrack()) != null) {
            if (nLETrackSlot == null) {
                nLETrackSlot = new NLETrackSlot();
            }
            slotIndex = mainTrack.getSlotIndex(nLETrackSlot);
        } else {
            slotIndex = 0;
        }
        if (strMd0 != null && strMd0.length() > 0) {
            C383990F3t.LIZ.LJI(this.LLJJI.requireActivity(), new AwS18S1201000_5(this, (C377730ErT) strMd0, (String) c259800zU2, (C259800zU<AIGCGenerationParam>) slotIndex, 2));
        } else {
            J8(true, null);
            r8(new AwS66S0301000_5(this, (C377730ErT) c259800zU, (C259800zU<String>) c259800zU2, (C259800zU<AIGCGenerationParam>) slotIndex, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r1 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y7(java.util.List<com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel> r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.y7(java.util.List):void");
    }

    public static final void I7(C377730ErT c377730ErT, Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C377760ErW c377760ErW = new C377760ErW(5, null, iIntValue, null, null, 21);
        Activity activity = c377730ErT.LLJJI.mActivity;
        if (activity != null) {
            C383990F3t.LIZ.getClass();
            C383990F3t.LJ(activity, c377760ErW);
        }
        C377120EqU c377120EqU = C377120EqU.LIZ;
        VideoPublishEditModel editModel = c377730ErT.getEditModel();
        C0E48 c0e48F4 = c377730ErT.F4();
        c377120EqU.getClass();
        if (editModel != null) {
            C0LAB c0labLIZJ = C377120EqU.LIZJ(editModel, c0e48F4);
            c0labLIZJ.LJ("scenerio", "ai_create");
            C20684815ws.LJIILLIIL("ai_create_usage_limit_toast", c0labLIZJ.LIZ);
        }
    }

    public final void J8(boolean z, String str) {
        if ((!C123100dR.LIZ(str) || Intrinsics.LJFF(T2().LJIILLIIL, str)) && LJLILLLLZI()) {
            c9(true, T2().LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L7(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r9, int r10) {
        /*
            r8 = this;
            r3 = r8
            java.lang.Object r0 = r3.T2()
            X.0Erd r0 = (X.C377830Erd) r0
            java.lang.String r0 = r0.LJIILLIIL
            if (r0 != 0) goto Lc
            return
        Lc:
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType r1 = r9.subGenerateType
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType r0 = com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType.AI_TRANSITION
            if (r1 != r0) goto L8f
            X.00zU r6 = new X.00zU
            r6.<init>()
            r6.element = r9
            X.09AE r0 = r3.LLJLLIL
            r7 = 0
            if (r0 == 0) goto L21
            r0.LIZIZ(r7)
        L21:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r3.LLZ()
            if (r0 == 0) goto L85
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r0.getMainTrack()
            if (r1 == 0) goto L85
            int r0 = r10 + (-1)
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r1.getSlotByIndex(r0)
        L33:
            com.bytedance.ies.nle.editor_jni.NLEModel r1 = r3.LLZ()
            if (r1 == 0) goto L72
            java.lang.Object r0 = r3.T2()
            X.0Erd r0 = (X.C377830Erd) r0
            java.lang.String r0 = r0.LJIILLIIL
            if (r0 != 0) goto L45
            java.lang.String r0 = ""
        L45:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = X.C377740ErU.LIZLLL(r1, r0)
            if (r0 == 0) goto L72
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r3.LLZ()
            if (r0 == 0) goto L83
            com.bytedance.ies.nle.editor_jni.NLETrack r1 = r0.getMainTrack()
            if (r1 == 0) goto L83
            int r0 = r10 + 1
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = r1.getSlotByIndex(r0)
        L5d:
            if (r4 == 0) goto L87
            if (r5 == 0) goto L87
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r3)
            X.0Dtm r2 = new X.0Dtm
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r1, r7, r7, r2, r0)
            r3.LLJLLIL = r0
            return
        L72:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r3.LLZ()
            if (r0 == 0) goto L83
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r0.getMainTrack()
            if (r0 == 0) goto L83
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = r0.getSlotByIndex(r10)
            goto L5d
        L83:
            r5 = r7
            goto L5d
        L85:
            r4 = r7
            goto L33
        L87:
            T r0 = r6.element
            com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam r0 = (com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam) r0
            r3.a9(r0)
            return
        L8f:
            r3.a9(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.L7(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam, int):void");
    }

    public final List<EditorProAIGCMediaItemModel> R5(String str, AIGCGenerationParamType aIGCGenerationParamType) {
        List<EditorProAIGCMediaItemModel> listFb0;
        if (this.LLJJIII) {
            aIGCGenerationParamType = null;
        }
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 == null || (listFb0 = interfaceC377650ErLC5.fb0(str, aIGCGenerationParamType, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR))) == null) {
            return C13BV.INSTANCE;
        }
        return listFb0;
    }

    public final void S6(boolean z, boolean z2) {
        C0E55 player;
        NLETrack nLETrack;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaSettings mediaSettingApi;
        NLEModel nLEModelLLZ = LLZ();
        if (nLEModelLLZ != null) {
            String str = T2().LJIILLIIL;
            if (str == null) {
                str = "";
            }
            NLETrackSlot nLETrackSlotLIZLLL = C377740ErU.LIZLLL(nLEModelLLZ, str);
            if (nLETrackSlotLIZLLL != null) {
                C0E48 c0e48F4 = F4();
                boolean z3 = true;
                if (c0e48F4 != null && (iNLEMediaSessionF1 = c0e48F4.f1()) != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
                    mediaSettingApi.setLoopPlay(true);
                }
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null && (player = c0e48F42.getPlayer()) != null) {
                    player.LJIJJLI();
                    player.LJIILL(false);
                    long[] jArr = new long[2];
                    int i = C349360Dmo.LIZJ;
                    C0E48 c0e48F43 = F4();
                    if (c0e48F43 == null || (nLETrack = c0e48F43.Pt()) == null) {
                        nLETrack = new NLETrack();
                    }
                    C350670Dov.LIZIZ(nLETrack, nLETrackSlotLIZLLL, jArr);
                    long j = jArr[0];
                    long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j3 = j + j2;
                    long j4 = jArr[1] - ((long) 30000);
                    if (player.Jh() >= j4 / j2) {
                        z3 = false;
                    }
                    if (z) {
                        if (!z2 && !z3) {
                            player.LJJIIZI(j3, j4, true, false);
                            return;
                        } else {
                            player.LJJIIZI(j3, j4, true, true);
                            return;
                        }
                    }
                    player.LJIIIIZZ(j3, j4, true);
                }
            }
        }
    }

    public final void c9(boolean z, EnumC378720Et4 enumC378720Et4) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z2;
        boolean z3;
        List<EditorProAIGCMediaItemModel> list;
        EditorProAIGCMediaItemModel next;
        AIGCGenerationParamType aIGCGenerationParamType = null;
        int i = 0;
        if (z) {
            InterfaceC360800ECo interfaceC360800ECoV5 = v5();
            if (interfaceC360800ECoV5 != null) {
                C0EB4.LIZIZ(interfaceC360800ECoV5, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO}, null, Boolean.FALSE, null, null, 26);
            }
            InterfaceC360800ECo interfaceC360800ECoV52 = v5();
            if (interfaceC360800ECoV52 != null) {
                C0EB4.LIZIZ(interfaceC360800ECoV52, new EnumC373450EkZ[]{EnumC373450EkZ.REDO}, null, Boolean.FALSE, null, null, 26);
            }
        } else {
            InterfaceC360800ECo interfaceC360800ECoV53 = v5();
            if (interfaceC360800ECoV53 != null) {
                EnumC373450EkZ[] enumC373450EkZArr = {EnumC373450EkZ.UNDO};
                C0E48 c0e48F4 = F4();
                if (c0e48F4 != null) {
                    boolValueOf2 = Boolean.valueOf(c0e48F4.Bo().LIZ());
                } else {
                    boolValueOf2 = null;
                }
                C0EB4.LIZIZ(interfaceC360800ECoV53, enumC373450EkZArr, null, boolValueOf2, null, null, 26);
            }
            InterfaceC360800ECo interfaceC360800ECoV54 = v5();
            if (interfaceC360800ECoV54 != null) {
                EnumC373450EkZ[] enumC373450EkZArr2 = {EnumC373450EkZ.REDO};
                C0E48 c0e48F42 = F4();
                if (c0e48F42 != null) {
                    boolValueOf = Boolean.valueOf(c0e48F42.Bo().LJFF());
                } else {
                    boolValueOf = null;
                }
                C0EB4.LIZIZ(interfaceC360800ECoV54, enumC373450EkZArr2, null, boolValueOf, null, null, 26);
            }
        }
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = T2().LJ;
        if (c375830EoP != null && (list = c375830EoP.LIZ) != null) {
            Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
            while (true) {
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
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = next;
            if (editorProAIGCMediaItemModel != null) {
                aIGCGenerationParamType = editorProAIGCMediaItemModel.type;
            }
        }
        if (aIGCGenerationParamType != AIGCGenerationParamType.T2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2V_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.FL2V_TYPE) {
            z2 = false;
        } else {
            z2 = true;
        }
        InterfaceC360800ECo interfaceC360800ECoV55 = v5();
        if (interfaceC360800ECoV55 != null) {
            EnumC373450EkZ[] enumC373450EkZArr3 = {EnumC373450EkZ.PLAY_PAUSE};
            if (enumC378720Et4 == EnumC378720Et4.TEXT_TO_IMAGE_RESULT && !z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0EB4.LIZIZ(interfaceC360800ECoV55, enumC373450EkZArr3, null, Boolean.valueOf(z3), null, null, 26);
        }
        InterfaceC360800ECo interfaceC360800ECoV56 = v5();
        if (interfaceC360800ECoV56 != null) {
            EnumC373450EkZ[] enumC373450EkZArr4 = {EnumC373450EkZ.TIME_PROGRESS};
            if (z) {
                i = 4;
            }
            C0EB4.LIZIZ(interfaceC360800ECoV56, enumC373450EkZArr4, Integer.valueOf(i), null, null, null, 28);
        }
    }

    public final EnumC378720Et4 m6(AIGCGenerationParamType aIGCGenerationParamType, AIGCGenerationSubType aIGCGenerationSubType) {
        if (aIGCGenerationSubType == AIGCGenerationSubType.AI_TRANSITION) {
            return EnumC378720Et4.AI_TRANSITION_RESULT;
        }
        if (aIGCGenerationParamType != AIGCGenerationParamType.T2I_TYPE && aIGCGenerationParamType != AIGCGenerationParamType.I2I_TYPE) {
            return EnumC378720Et4.TEXT_TO_VIDEO_RESULT;
        }
        return EnumC378720Et4.TEXT_TO_IMAGE_RESULT;
    }

    @Override // X.InterfaceC377410Eqx
    public void uK1(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, boolean z) {
        Boolean boolValueOf;
        C0E48 c0e48F4;
        C0E55 player;
        String str;
        C0E55 player2;
        if (Intrinsics.LJFF(editorProAIGCMediaItemModel, T2().LJFF)) {
            return;
        }
        C0E48 c0e48F42 = F4();
        AIGCGenerationParamType aIGCGenerationParamType = null;
        if (c0e48F42 != null && (player2 = c0e48F42.getPlayer()) != null) {
            boolValueOf = Boolean.valueOf(player2.isPlaying());
        } else {
            boolValueOf = null;
        }
        Set<AIGCGenerationParamType> set = C377150EqX.LIZIZ;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = T2().LJFF;
        if (editorProAIGCMediaItemModel2 != null) {
            aIGCGenerationParamType = editorProAIGCMediaItemModel2.type;
        }
        boolean zLJJJJ = C13LP.LJJJJ(aIGCGenerationParamType, set);
        i3(new AwS584S0100000_5(editorProAIGCMediaItemModel, 307));
        if (z) {
            if (set.contains(editorProAIGCMediaItemModel.type)) {
                str = "click_change_picture";
            } else {
                str = "click_video";
            }
            O4(str);
        }
        boolean zContains = C377150EqX.LIZJ.contains(editorProAIGCMediaItemModel.type);
        InterfaceC360800ECo interfaceC360800ECoV5 = v5();
        boolean z2 = false;
        if (interfaceC360800ECoV5 != null) {
            C0EB4.LIZIZ(interfaceC360800ECoV5, new EnumC373450EkZ[]{EnumC373450EkZ.PLAY_PAUSE}, null, Boolean.valueOf(zContains), null, null, 26);
        }
        InterfaceC376000Eog interfaceC376000EogD5 = D5();
        if (interfaceC376000EogD5 != null) {
            interfaceC376000EogD5.clearData();
        }
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null) {
            String str2 = T2().LJIILLIIL;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC377650ErLC5.Ug0(str2, editorProAIGCMediaItemModel, "");
        }
        if (z && (c0e48F4 = F4()) != null && (player = c0e48F4.getPlayer()) != null) {
            AIGCGenerationParamType aIGCGenerationParamType2 = editorProAIGCMediaItemModel.type;
            if (aIGCGenerationParamType2 != AIGCGenerationParamType.T2V_TYPE && aIGCGenerationParamType2 != AIGCGenerationParamType.I2V_TYPE && aIGCGenerationParamType2 != AIGCGenerationParamType.FL2V_TYPE) {
                player.pause(false);
                LifecycleOwnerExtensionsKt.LIZ(this, new ARunnableS105S0100000_5(this, 41));
            } else {
                if (editorProAIGCMediaItemModel.status == EditorProAIGCMediaItemModelStatus.COMPLETE) {
                    if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || zLJJJJ) {
                        z2 = true;
                    }
                    S6(z2, true);
                    return;
                }
                player.pause(false);
            }
        }
    }

    @Override // X.InterfaceC377410Eqx
    public void zg0(AIGCGenerationParamType aIGCGenerationParamType, Function0<Unit> function0) {
        String strMd0;
        String str = T2().LJIILLIIL;
        if (str == null) {
            return;
        }
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null && (strMd0 = interfaceC377650ErLC5.md0(str, null)) != null && strMd0.length() > 0) {
            C383990F3t.LIZ.LJI(this.LLJJI.requireActivity(), new C377790ErZ(this, strMd0, str, aIGCGenerationParamType, function0));
            return;
        }
        InterfaceC377650ErL interfaceC377650ErLC52 = C5();
        if (interfaceC377650ErLC52 != null) {
            interfaceC377650ErLC52.rX0(str, aIGCGenerationParamType, new C377390Eqv(false, true, false, false, 13));
        }
        function0.invoke();
    }

    public C377730ErT(C19A3 c19a3, boolean z, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLJJI = c19a3;
        this.LLJJIII = z;
        this.LLJJIJI = c1drg;
        this.LLJJIJIIJIL = new AwS549S0100000_5(this, 332);
        this.LLJJIJIL = AFwS191S0000000_5.get$arr$(105);
        this.LLJJJ = new AwS549S0100000_5(this, 331);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EFH.class, null);
        this.LLJJJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), C376420EpM.class, null);
        this.LLJJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361710EGb.class, null);
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        this.LLJLIL = (AsyncTasksPanelViewModel) C364210EPr.LIZJ(getDiContainer(), AsyncTasksPanelViewModel.class);
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 333));
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 334));
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 330));
        this.LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 335));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 329));
        this.LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 336));
        this.LLLF = -1;
        this.LLLFFI = "ai_create";
        this.LLLII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 337));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam H4(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel r56, java.lang.String r57, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType r58) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377730ErT.H4(com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel, java.lang.String, com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType):com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam");
    }

    public static final void n9(C377730ErT c377730ErT, AIGCGenerationParamType aIGCGenerationParamType, C377660ErM c377660ErM, boolean z) {
        AIGCGenerationSubType aIGCGenerationSubType;
        List<EditorProAIGCMediaItemModel> list;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel;
        AIGCGenerationParam aIGCGenerationParam;
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = c377730ErT.T2().LJ;
        if (c375830EoP != null && (list = c375830EoP.LIZ) != null && (editorProAIGCMediaItemModel = (EditorProAIGCMediaItemModel) C13LP.LJJJLL(list)) != null && (aIGCGenerationParam = editorProAIGCMediaItemModel.param) != null) {
            aIGCGenerationSubType = aIGCGenerationParam.subGenerateType;
        } else {
            aIGCGenerationSubType = null;
        }
        if (aIGCGenerationSubType == AIGCGenerationSubType.AI_TRANSITION) {
            c377730ErT.i3(new AwS93S0110000_5(z, c377660ErM, 1));
            return;
        }
        C377150EqX c377150EqX = C377150EqX.LIZ;
        if (C377150EqX.LIZIZ.contains(aIGCGenerationParamType)) {
            c377730ErT.i3(new AwS93S0110000_5(z, c377660ErM, 2));
        } else {
            if (aIGCGenerationParamType != AIGCGenerationParamType.T2V_TYPE) {
                return;
            }
            c377730ErT.i3(new AwS93S0110000_5(z, c377660ErM, 3));
        }
    }

    @Override // X.InterfaceC377410Eqx
    public void RX(EnumC378720Et4 enumC378720Et4, String str, String str2, boolean z) {
        boolean z2;
        List<EditorProAIGCMediaItemModel> list;
        EditorProAIGCMediaItemModel next;
        int iIntValue;
        InterfaceC377650ErL interfaceC377650ErLC5 = C5();
        if (interfaceC377650ErLC5 != null) {
            interfaceC377650ErLC5.VC0(str, d6(enumC378720Et4));
        }
        if (LJLILLLLZI()) {
            Na0(str);
            return;
        }
        C1447800nmM.LIZIZ(this.LLJJI).LLLIILIL(this, U5());
        C19EG c19eg = (C19EG) this.LLJJI.mActivity;
        if (c19eg != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, new C1361400lX0(c19eg, R.style.y0));
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LJFF(iIntValue);
            tuxImmersionBar.LIZLLL();
        }
        C376420EpM c376420EpMK6 = K6();
        if (c376420EpMK6 != null) {
            c376420EpMK6.dB1(false);
        }
        InterfaceC361710EGb interfaceC361710EGbU6 = u6();
        if (interfaceC361710EGbU6 != null) {
            interfaceC361710EGbU6.LLJJIJIIJIL(false);
        }
        u7(str);
        List<EditorProAIGCMediaItemModel> listR5 = R5(str, d6(enumC378720Et4));
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : listR5) {
            if (hashSet.add(editorProAIGCMediaItemModel.type)) {
                arrayList.add(editorProAIGCMediaItemModel);
            }
        }
        if (arrayList.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        i3(new C377800Era(this, str, enumC378720Et4, z, z2));
        y8(true);
        c9(true, enumC378720Et4);
        W6();
        C375830EoP<List<EditorProAIGCMediaItemModel>> c375830EoP = T2().LJ;
        AIGCGenerationParamType aIGCGenerationParamType = null;
        if (c375830EoP != null && (list = c375830EoP.LIZ) != null) {
            Iterator<EditorProAIGCMediaItemModel> it2 = list.iterator();
            while (true) {
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
            EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = next;
            if (editorProAIGCMediaItemModel2 != null) {
                aIGCGenerationParamType = editorProAIGCMediaItemModel2.type;
            }
        }
        S6(C13LP.LJJJJ(aIGCGenerationParamType, C377150EqX.LIZJ), false);
        T8();
        show();
    }
}
