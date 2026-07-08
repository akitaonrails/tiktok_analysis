package X;

import Y.AObjectS247S0100000_29;
import Y.AObserverS231S0100000_29;
import androidx.lifecycle.LiveData;
import ayh.i5;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.utils.oh;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS112S1200000_29;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19643011tE extends AbstractC2255721DQs<InterfaceC1465010oE7> implements InterfaceC1465010oE7, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public AddYoursStickerModel LLJ;
    public boolean LLJI;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578430MmP.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 639));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(269));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 638));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19643011tE.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19643011tE.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19643011tE.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19643011tE.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19643011tE.class, "imageModeSwitchApi", "getImageModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public InterfaceC1465010oE7 Z1() {
        return this;
    }

    private final InterfaceC578430MmP G2() {
        return (InterfaceC578430MmP) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    private final InterfaceC390170FRn X1() {
        return (InterfaceC390170FRn) this.LLJIJIL.getValue();
    }

    private final void i3() {
        InterfaceC1455860nzM interfaceC1455860nzMO2;
        LiveData<Void> liveDataWw2;
        LiveData<Unit> liveDataOp;
        LiveEvent<SwitchModePayload> liveEventVh;
        C1429400nIg c1429400nIg = C1429400nIg.LIZ;
        VideoPublishEditModel videoPublishEditModelW2 = W2();
        c1429400nIg.getClass();
        if (C1429400nIg.LIZ(videoPublishEditModelW2)) {
            InterfaceC578430MmP interfaceC578430MmPG2 = G2();
            if (interfaceC578430MmPG2 != null && (liveEventVh = interfaceC578430MmPG2.Vh()) != null) {
                liveEventVh.LIZ(this, new AObjectS247S0100000_29(this, 72));
            }
            InterfaceC1455860nzM interfaceC1455860nzMO22 = o2();
            if (interfaceC1455860nzMO22 != null && (liveDataOp = interfaceC1455860nzMO22.op()) != null) {
                liveDataOp.observe(this, new AObserverS231S0100000_29(this, 99));
            }
            T2().LIZIZ().observe(this, new AObserverS231S0100000_29(this, 100));
            if (C1428470nHB.LJZL(W2()) && (interfaceC1455860nzMO2 = o2()) != null && (liveDataWw2 = interfaceC1455860nzMO2.ww2()) != null) {
                liveDataWw2.observe(this, new AObserverS231S0100000_29(this, 101));
            }
            if (u4.LIZJ(W2())) {
                T2().LIZJ(W2().creativeModel.stickerModel.tosTimeStampForAyCommend);
            }
            C1408420mkq.LIZ(c3(), this, w2(), new AObjectS247S0100000_29(this, 73));
        }
    }

    private final C1451630nsX w2() {
        return (C1451630nsX) this.LLILZIL.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC391240FVq H2() {
        return (InterfaceC391240FVq) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1647770syt T2() {
        return (InterfaceC1647770syt) this.LLIZ.getValue();
    }

    public final VideoPublishEditModel W2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    public final C538770LBb<Boolean> c3() {
        return (C538770LBb) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1455860nzM o2() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    private final void q3() {
        InterfaceC391240FVq interfaceC391240FVqH2;
        if (u4.LJJIJIIJIL(W2()) && (interfaceC391240FVqH2 = H2()) != null) {
            interfaceC391240FVqH2.HL2(new AwS569S0100000_25(this, 506));
        }
    }

    @Override // X.InterfaceC1465010oE7
    public InterfaceC390170FRn LJIIJ() {
        return X1();
    }

    @Override // X.InterfaceC1465010oE7
    public AddYoursStickerModel V61() {
        List<StickerModel> listLLLILZLLLI;
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        StickerModel stickerModel = (interfaceC391240FVqH2 == null || (listLLLILZLLLI = interfaceC391240FVqH2.LLLILZLLLI(EnumC1466150oFx.ADD_YOURS)) == null) ? null : (StickerModel) C13LP.LJJJLL(listLLLILZLLLI);
        if (stickerModel instanceof AddYoursStickerModel) {
            return (AddYoursStickerModel) stickerModel;
        }
        return null;
    }

    @Override // X.InterfaceC1465010oE7
    public InterfaceC1647770syt Xk0() {
        return T2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<Boolean> liveEventGm1;
        super.onCreate();
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 != null && (liveEventGm1 = interfaceC391240FVqH2.Gm1()) != null) {
            liveEventGm1.LIZ(this, new AObjectS247S0100000_29(this, 74));
        }
        i3();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        W1(false);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19643011tE(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1465010oE7
    public void FI1(AddYoursStickerModel addYoursStickerModel) {
        if (u4.LJJIJIIJIL(W2())) {
            C01GW c01gw = C299960BpK.LIZ;
            if (!C299960BpK.LIZIZ) {
                rj(addYoursStickerModel);
                return;
            }
        }
        LJLLL("");
    }

    @Override // X.InterfaceC1465010oE7
    public void LJLLL(String str) {
        AddYoursStickerModel addYoursStickerModel;
        InterfaceC391240FVq interfaceC391240FVqH2 = H2();
        if (interfaceC391240FVqH2 == null) {
            return;
        }
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.ADD_YOURS;
        StickerModel stickerModel = (StickerModel) C13LP.LJJJLL(interfaceC391240FVqH2.LLLILZLLLI(enumC1466150oFx));
        String topicText = null;
        if (stickerModel == null) {
            interfaceC391240FVqH2.Tn0(enumC1466150oFx, null, str, AFwS273S0000000_29.get$arr$(212));
            return;
        }
        if (u4.LJJIJIIJIL(W2()) && C299960BpK.LIZIZ) {
            if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel = (AddYoursStickerModel) stickerModel) != null) {
                topicText = addYoursStickerModel.getTopicText();
            }
            C0FTJ<? extends StickerModel> c0ftj = (C0FTJ) C13LP.LJJJLL(interfaceC391240FVqH2.LLLLLZ(enumC1466150oFx));
            if (c0ftj == null) {
                return;
            }
            interfaceC391240FVqH2.Tn0(enumC1466150oFx, c0ftj, str, new AwS112S1200000_29((C0FTJ) c0ftj, (C0FTJ<? extends StickerModel>) this, (C19643011tE) topicText, (String) 5));
            return;
        }
        if (stickerModel instanceof AddYoursStickerModel) {
            AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) stickerModel;
            if (addYoursStickerModel2.isCandidateState()) {
                T2().LIZ().LIZIZ();
                C1403910mdZ.LIZ(W2(), addYoursStickerModel2, "Displaying");
            }
            interfaceC391240FVqH2.k3(addYoursStickerModel2.copy(addYoursStickerModel2.baseStickerModel, addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, addYoursStickerModel2.visible, addYoursStickerModel2.editable, addYoursStickerModel2.clickable, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, false, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, true, addYoursStickerModel2.recommendAyInitialScale), EnumC356070Dxd.COMMIT);
        }
        interfaceC391240FVqH2.sS(stickerModel);
    }

    public final void W1(boolean z) {
        C860560XpO.LIZJ(W2());
        if (z) {
            oh.LIZJ("tool_performance_add_yours_edit", i5.LIZIZ(), -1L, null, null);
        } else {
            oh.LJ("tool_performance_add_yours_edit");
        }
    }

    @Override // X.InterfaceC1465010oE7
    public void rj(StickerModel stickerModel) {
        List<StickerModel> listLLLILZLLLI;
        if (stickerModel == null) {
            InterfaceC391240FVq interfaceC391240FVqH2 = H2();
            if (interfaceC391240FVqH2 != null && (listLLLILZLLLI = interfaceC391240FVqH2.LLLILZLLLI(EnumC1466150oFx.ADD_YOURS)) != null) {
                stickerModel = (StickerModel) C13LP.LJJJLL(listLLLILZLLLI);
            } else {
                stickerModel = null;
            }
        }
        C344010DeB c344010DeB = C344010DeB.LIZIZ;
        c344010DeB.LIZJ(C1664590tQ1.LJII(this), c344010DeB.LIZ(), new AwS391S0200000_25(stickerModel, this, 163));
    }

    public final void m3(AddYoursStickerModel addYoursStickerModel, String str) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C19642811tC(addYoursStickerModel, this, str, null), 3);
    }
}
