package X;

import Y.AObjectS240S0100000_5;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModelStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS119S1100000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375990Eof extends C0ETX<InterfaceC375950Eob, C379660Eua, C377830Erd, C379680Euc> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public static final int LLJZ;
    public final C19A3 LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final Function0<C377830Erd> LLJJL;
    public final Function0<C379680Euc> LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final InterfaceC1731706qJ LLJLIL;
    public final InterfaceC1731706qJ LLJLILLLLZIIL;
    public final InterfaceC1731706qJ LLJLL;
    public final InterfaceC1731706qJ LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C375990Eof.class, "resultPanelContext", "getResultPanelContext()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/aigcresult/AIGCResultPanelContext;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C375990Eof.class, "editorProAIGCLogicApi", "getEditorProAIGCLogicApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/logic/EditorProAIGCLogicApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C375990Eof.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C375990Eof.class, "adjustCanvasApi", "getAdjustCanvasApi()Lcom/ss/android/ugc/gamora/editorpro/startup/slide/EditorProAdjustCanvasApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C375990Eof.class, "editorProAIGCReportApi", "getEditorProAIGCReportApi()Lcom/ss/android/ugc/gamora/editorpro/aiediting/aigc/panel/shared/report/EditorProAIGCReportPanelApi;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJZ = 8;
    }

    @Override // X.C0ETX
    public void n5() {
    }

    private final InterfaceC362230EIb E5() {
        return (InterfaceC362230EIb) this.LLJLL.getValue(this, LLJLLL[3]);
    }

    private final InterfaceC377650ErL H5() {
        return (InterfaceC377650ErL) this.LLJLIL.getValue(this, LLJLLL[1]);
    }

    private final InterfaceC376000Eog M5() {
        return (InterfaceC376000Eog) this.LLJLLIL.getValue(this, LLJLLL[4]);
    }

    private final C375940Eoa N5() {
        return (C375940Eoa) this.LLJL.getValue(this, LLJLLL[0]);
    }

    private final void S5() {
        NLETrackSlot nLETrackSlot;
        String strLIZIZ;
        InterfaceC377650ErL interfaceC377650ErLH5;
        List<EditorProAIGCMediaItemModel> listFb0;
        AIGCGenerationParamType aIGCGenerationParamType = AIGCGenerationParamType.T2V_TYPE;
        C0E75 value = R5().dQ().getValue();
        if (value == null || (nLETrackSlot = value.LIZJ) == null || (strLIZIZ = C377740ErU.LIZIZ(nLETrackSlot)) == null || (interfaceC377650ErLH5 = H5()) == null || (listFb0 = interfaceC377650ErLH5.fb0(strLIZIZ, aIGCGenerationParamType, C1697810uHb.LJIIJJI(EditorProAIGCMediaItemModelStatus.LOADING, EditorProAIGCMediaItemModelStatus.COMPLETE, EditorProAIGCMediaItemModelStatus.ERROR))) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (EditorProAIGCMediaItemModel editorProAIGCMediaItemModel : listFb0) {
            if (editorProAIGCMediaItemModel.param.subGenerateType == AIGCGenerationSubType.AI_TRANSITION) {
                arrayList.add(editorProAIGCMediaItemModel);
            }
        }
        i3(new AwS119S1100000_5((List) arrayList, (List<EditorProAIGCMediaItemModel>) strLIZIZ, (String) 3));
        InterfaceC377650ErL interfaceC377650ErLH52 = H5();
        if (interfaceC377650ErLH52 != null) {
            interfaceC377650ErLH52.VC0(strLIZIZ, AIGCGenerationParamType.T2V_TYPE);
        }
        R5().yV(AFwS234S0000000_5.get$arr$(137));
    }

    public final C0E5S R5() {
        return (C0E5S) this.LLJLILLLLZIIL.getValue(this, LLJLLL[2]);
    }

    public final void U5() {
        InterfaceC362230EIb interfaceC362230EIbE5 = E5();
        if (interfaceC362230EIbE5 != null) {
            interfaceC362230EIbE5.td1(interfaceC362230EIbE5.pg0());
        }
        InterfaceC377650ErL interfaceC377650ErLH5 = H5();
        if (interfaceC377650ErLH5 != null) {
            String str = T2().LJIILLIIL;
            if (str == null) {
                str = "";
            }
            interfaceC377650ErLH5.kq0(str);
        }
        C01TT.LIZJ(new AwS549S0100000_5(this, 198));
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Unit> liveEventGs1;
        super.onCreate();
        S5();
        InterfaceC362230EIb interfaceC362230EIbE5 = E5();
        if (interfaceC362230EIbE5 != null) {
            interfaceC362230EIbE5.Dq1(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(429)) + C372480Ej0.LLLLLILLIL, true, null);
        }
        C0ETQ c0etqP4 = P4();
        if (c0etqP4 == null || (liveEventGs1 = c0etqP4.Gs1()) == null) {
            return;
        }
        liveEventGs1.LJII(this, Lifecycle.State.RESUMED, new AObjectS240S0100000_5(this, 47));
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C377830Erd> o2() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C379680Euc> w2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public C375990Eof(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = c19a3;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = AFwS191S0000000_5.get$arr$(82);
        this.LLJJLIIIJLLLLLLLZ = new AwS549S0100000_5(this, 199);
        this.LLJL = C1664770tQJ.LIZIZ(getDiContainer(), C375940Eoa.class, null);
        this.LLJLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC377650ErL.class, null);
        this.LLJLILLLLZIIL = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLJLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC362230EIb.class, null);
        this.LLJLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC376000Eog.class, null);
    }

    public final void uK1(EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, boolean z) {
        Boolean boolValueOf;
        C0E48 c0e48F4;
        C0E55 player;
        C0E55 player2;
        if (Intrinsics.LJFF(editorProAIGCMediaItemModel, T2().LJFF)) {
            return;
        }
        i3(new AwS584S0100000_5(editorProAIGCMediaItemModel, 215));
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (player2 = c0e48F42.getPlayer()) != null) {
            boolValueOf = Boolean.valueOf(player2.isPlaying());
        } else {
            boolValueOf = null;
        }
        InterfaceC376000Eog interfaceC376000EogM5 = M5();
        if (interfaceC376000EogM5 != null) {
            interfaceC376000EogM5.clearData();
        }
        InterfaceC377650ErL interfaceC377650ErLH5 = H5();
        if (interfaceC377650ErLH5 != null) {
            String str = T2().LJIILLIIL;
            if (str == null) {
                str = "";
            }
            interfaceC377650ErLH5.Ug0(str, editorProAIGCMediaItemModel, "");
        }
        if (z && (c0e48F4 = F4()) != null && (player = c0e48F4.getPlayer()) != null && editorProAIGCMediaItemModel.type == AIGCGenerationParamType.T2V_TYPE) {
            if (editorProAIGCMediaItemModel.status == EditorProAIGCMediaItemModelStatus.COMPLETE) {
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    player.LJIJJ();
                    return;
                }
                return;
            }
            player.pause(false);
        }
    }
}
