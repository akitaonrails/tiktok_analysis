package X;

import Y.AObserverS209S0100000_5;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Esm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378540Esm extends C0ETX<InterfaceC375980Eoe, C0F65, C378600Ess, C378560Eso> {
    public static final C378660Esy LLLF;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final C19A3 LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C01GW LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public List<C378700Et2> LLJLLIL;
    public int LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final InterfaceC378690Et1 LLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Esy] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C378540Esm.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/promptedit/PromptPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C378540Esm.class, "editorLoader", "getEditorLoader()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0)};
        LLLF = new Object() { // from class: X.0Esy
        };
        LLLFFI = 8;
    }

    private final InterfaceC377650ErL N5() {
        return (InterfaceC377650ErL) this.LLJLIL.getValue();
    }

    private final InterfaceC355850DxH U5() {
        return (InterfaceC355850DxH) this.LLJZIJLIL.getValue();
    }

    public final ICreationAsyncTaskManager H5() {
        return (ICreationAsyncTaskManager) this.LLJJL.getValue();
    }

    public final C0EY2 M5() {
        return (C0EY2) this.LLJL.getValue(this, LLLFF[1]);
    }

    public final InterfaceC378020Erw R5() {
        return (InterfaceC378020Erw) this.LLJZ.getValue();
    }

    public final C376980EqG S5() {
        return (C376980EqG) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFF[0]);
    }

    public final List<C378700Et2> d6() {
        if (this.LLJLLIL.size() <= 3) {
            return this.LLJLLIL;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.LLJLLL;
        int i = 0;
        do {
            size++;
            if (size >= this.LLJLLIL.size()) {
                size -= this.LLJLLIL.size();
            }
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(size, this.LLJLLIL);
            if (objLJJJLZIJ != null) {
                arrayList.add(objLJJJLZIJ);
            }
            i++;
        } while (i < 3);
        this.LLJLLL = size;
        return arrayList;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C378600Ess> o2() {
        return new AwS549S0100000_5(this, 301);
    }

    public final void u6() {
        i3(new AwS584S0100000_5(this, 297));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C378560Eso> w2() {
        return new AwS549S0100000_5(this, 305);
    }

    private final void E5() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C378530Esl(this, null), 3);
    }

    private final void init() {
        InterfaceC378650Esx interfaceC378650Esx;
        MutableLiveData mutableLiveDataIsLoading;
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.fx1(new AwS549S0100000_5(this, 304));
        }
        C376980EqG c376980EqGS5 = S5();
        if (c376980EqGS5 == null || (interfaceC378650Esx = c376980EqGS5.LLIZLLLIL) == null || (mutableLiveDataIsLoading = interfaceC378650Esx.isLoading()) == null) {
            return;
        }
        mutableLiveDataIsLoading.observe(this, new AObserverS209S0100000_5(this, 34));
    }

    public final void J6() {
        InterfaceC378650Esx interfaceC378650Esx;
        C376980EqG c376980EqGS5 = S5();
        if (c376980EqGS5 == null || (interfaceC378650Esx = c376980EqGS5.LLIZLLLIL) == null) {
            return;
        }
        interfaceC378650Esx.LLILLL(this.LLJLL, T2().LJFF);
    }

    public final void m6() {
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 != null) {
            c0etqP4.close();
        }
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        E5();
        init();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        i3(AFwS234S0000000_5.get$arr$(153));
        U5().LIZLLL(EnumC378030Erx.T2V);
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    public final void K6(C378480Esg c378480Esg) {
        this.LLJLL = c378480Esg.LIZ;
        i3(new AwS584S0100000_5(c378480Esg, 298));
        C1447800nmM.LIZIZ(this.LLJJJJJIL).LLLLLLZZ(this.LLJJJJJIL, c378480Esg);
    }

    public C378540Esm(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19a3;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(103));
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C376980EqG.class, null);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 302));
        this.LLJLLIL = new ArrayList();
        this.LLJLLL = -1;
        this.LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 303));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 306));
        this.LLL = new InterfaceC378690Et1() { // from class: X.0EsZ
            public final boolean LIZ;

            @Override // X.InterfaceC378690Et1
            public final void LJJJJZI() {
                VideoPublishEditModel editModel;
                C0EY2 c0ey2M5 = this.LIZIZ.M5();
                if (c0ey2M5 == null || (editModel = c0ey2M5.getEditModel()) == null) {
                    return;
                }
                C378540Esm c378540Esm = this.LIZIZ;
                C377120EqU c377120EqU = C377120EqU.LIZ;
                C0E48 c0e48F4 = c378540Esm.F4();
                boolean z = this.LIZ;
                c377120EqU.getClass();
                C377120EqU.LJIJ(editModel, c0e48F4, "ep_transition", null, false, z);
            }

            {
                C379140Etk.LIZ.getClass();
                this.LIZ = C379140Etk.LJFF();
            }

            @Override // X.InterfaceC378690Et1
            public final void LIZ(Context context, String str, boolean z) {
                VideoPublishEditModel editModel;
                String str2;
                String str3;
                String str4;
                AIGenerationType aIGenerationTypeLIZJ;
                NLETrackSlot nLETrackSlotLLLLLLIL;
                C0EY2 c0ey2M5 = this.LIZIZ.M5();
                if (c0ey2M5 != null && (editModel = c0ey2M5.getEditModel()) != null) {
                    String string = context.getString(2131841124, "5");
                    C377120EqU c377120EqU = C377120EqU.LIZ;
                    C0E48 c0e48F4 = this.LIZIZ.F4();
                    boolean z2 = this.LIZ;
                    if (z) {
                        str2 = "click_prompt_switch";
                    } else {
                        str2 = "click_default_prompt";
                    }
                    String str5 = (String) C13LP.LJJJLZIJ(0, C379370Eu7.LIZJ());
                    if (str5 == null) {
                        str5 = "";
                    }
                    c377120EqU.getClass();
                    if (Intrinsics.LJFF(str5, "keep_ratio")) {
                        str3 = "original";
                    } else {
                        str3 = str5;
                    }
                    if (Intrinsics.LJFF("ep_transition", "ep_transition")) {
                        str4 = "transition";
                    } else {
                        str4 = "ai_create";
                    }
                    C0LAB c0labLIZJ = C377120EqU.LIZJ(editModel, c0e48F4);
                    c0labLIZJ.LJ("enter_source", "ep_transition");
                    c0labLIZJ.LIZ(0, "is_from_result_page");
                    c0labLIZJ.LIZ(z2 ? 1 : 0, "is_first_authorized");
                    c0labLIZJ.LJ("aspect_ratio", str3);
                    c0labLIZJ.LJ("click_button_name", str2);
                    c0labLIZJ.LJ("aspect_ratio", str5);
                    c0labLIZJ.LJ("duration", string);
                    c0labLIZJ.LJ("scenerio", str4);
                    c0labLIZJ.LJ("prompt_id", str);
                    IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
                    if (iAIPlaygroundMobServiceLIZ == null || (aIGenerationTypeLIZJ = iAIPlaygroundMobServiceLIZ.LIZJ(editModel)) == null) {
                        aIGenerationTypeLIZJ = AIGenerationType.NONE;
                    }
                    if (aIGenerationTypeLIZJ != AIGenerationType.NONE) {
                        if (c0e48F4 != null) {
                            nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
                        } else {
                            nLETrackSlotLLLLLLIL = null;
                        }
                        if (C0E5J.LJFF(nLETrackSlotLLLLLLIL)) {
                            c0labLIZJ.LJ("ai_video_tool_name", C380220EvU.LIZ(aIGenerationTypeLIZJ));
                        }
                    }
                    C20684815ws.LJIILLIIL("click_text_to_video_panel", c0labLIZJ.LIZ);
                }
            }
        };
    }
}
