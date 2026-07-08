package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS143S1100000_29;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19643111tF extends AbstractC2255721DQs<InterfaceC1465010oE7> implements InterfaceC1465010oE7, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public AddYoursStickerModel LLJ;
    public boolean LLJI;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1464960oE2.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578430MmP.class, null);
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 641));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(270));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 640));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19643111tF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19643111tF.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19643111tF.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19643111tF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19643111tF.class, "imageModeSwitchApi", "getImageModeSwitchApi()Lcom/ss/android/ugc/aweme/image/switchmode/ImageModeSwitchApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJILJ = 8;
    }

    public InterfaceC1465010oE7 X1() {
        return this;
    }

    private final InterfaceC390170FRn W1() {
        return (InterfaceC390170FRn) this.LLJIJIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c3() {
        /*
            r4 = this;
            X.0nIg r1 = X.C1429400nIg.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.H2()
            r1.getClass()
            boolean r0 = X.C1429400nIg.LIZ(r0)
            if (r0 == 0) goto Lac
            X.0MmP r0 = r4.w2()
            if (r0 == 0) goto L25
            com.bytedance.als.LiveEvent r2 = r0.Vh()
            if (r2 == 0) goto L25
            Y.AObjectS247S0100000_29 r1 = new Y.AObjectS247S0100000_29
            r0 = 75
            r1.<init>(r4, r0)
            r2.LIZ(r4, r1)
        L25:
            X.01GW r0 = X.C268100Af2.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lad
            X.0nzM r0 = r4.Z1()
            if (r0 == 0) goto L49
            androidx.lifecycle.LiveData r2 = r0.oG2()
        L3d:
            if (r2 == 0) goto L49
            Y.AObserverS231S0100000_29 r1 = new Y.AObserverS231S0100000_29
            r0 = 102(0x66, float:1.43E-43)
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
        L49:
            X.0oE4 r0 = r4.G2()
            androidx.lifecycle.MutableLiveData<java.util.List<com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi$AddYoursTopicRecommendInfo>> r2 = r0.LLJ
            Y.AObserverS231S0100000_29 r1 = new Y.AObserverS231S0100000_29
            r0 = 103(0x67, float:1.44E-43)
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.H2()
            boolean r0 = X.C1428470nHB.LJLIIL(r0)
            if (r0 == 0) goto L7f
            X.0nzM r1 = r4.Z1()
            boolean r0 = r1 instanceof X.InterfaceC1451050nrb
            if (r0 == 0) goto L7f
            X.0nrb r1 = (X.InterfaceC1451050nrb) r1
            if (r1 == 0) goto L7f
            androidx.lifecycle.LiveData r2 = r1.PV1()
            if (r2 == 0) goto L7f
            Y.AObserverS231S0100000_29 r1 = new Y.AObserverS231S0100000_29
            r0 = 104(0x68, float:1.46E-43)
            r1.<init>(r4, r0)
            r2.observe(r4, r1)
        L7f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.H2()
            boolean r0 = com.ss.android.ugc.aweme.shortvideo.edit.u4.LIZJ(r0)
            if (r0 == 0) goto L9a
            X.0oE4 r1 = r4.G2()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.H2()
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel r0 = r0.stickerModel
            java.lang.Long r0 = r0.tosTimeStampForAyCommend
            r1.LIZJ(r0)
        L9a:
            X.0LBb r3 = r4.T2()
            X.0nsX r2 = r4.o2()
            Y.AObjectS247S0100000_29 r1 = new Y.AObjectS247S0100000_29
            r0 = 76
            r1.<init>(r4, r0)
            X.C1408420mkq.LIZ(r3, r4, r2, r1)
        Lac:
            return
        Lad:
            X.0nzM r0 = r4.Z1()
            if (r0 == 0) goto L49
            androidx.lifecycle.LiveData r2 = r0.op()
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19643111tF.c3():void");
    }

    private final C1451630nsX o2() {
        return (C1451630nsX) this.LLILZ.getValue(this, LLJILJIL[2]);
    }

    private final InterfaceC578430MmP w2() {
        return (InterfaceC578430MmP) this.LLILZLL.getValue(this, LLJILJIL[4]);
    }

    public final C1464980oE4 G2() {
        return (C1464980oE4) this.LLIZ.getValue();
    }

    public final VideoPublishEditModel H2() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJILJIL[0]);
    }

    public final C538770LBb<Boolean> T2() {
        return (C538770LBb) this.LLIZLLLIL.getValue();
    }

    public final InterfaceC1464960oE2 W2() {
        return (InterfaceC1464960oE2) this.LLILLL.getValue(this, LLJILJIL[1]);
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJILJIL[3]);
    }

    @Override // X.InterfaceC1465010oE7
    public InterfaceC390170FRn LJIIJ() {
        return W1();
    }

    @Override // X.InterfaceC1465010oE7
    public AddYoursStickerModel V61() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FTJ c0ftj;
        InterfaceC1464960oE2 interfaceC1464960oE2W2 = W2();
        StickerModel stickerModelLJLI = (interfaceC1464960oE2W2 == null || (listLLLLLZ = interfaceC1464960oE2W2.LLLLLZ(EnumC1466150oFx.ADD_YOURS)) == null || (c0ftj = (C0FTJ) C13LP.LJJJLL(listLLLLLZ)) == null) ? null : c0ftj.LJLI();
        if (stickerModelLJLI instanceof AddYoursStickerModel) {
            return (AddYoursStickerModel) stickerModelLJLI;
        }
        return null;
    }

    @Override // X.InterfaceC1465010oE7
    public InterfaceC1647770syt Xk0() {
        return G2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        c3();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19643111tF(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1465010oE7
    public void FI1(AddYoursStickerModel addYoursStickerModel) {
        if (u4.LJJIJIIJIL(H2())) {
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
        StickerModel stickerModel;
        AddYoursStickerModel addYoursStickerModel;
        List<StickerModel> listDt;
        StickerModel next;
        InterfaceC1464960oE2 interfaceC1464960oE2W2 = W2();
        String topicText = null;
        if (interfaceC1464960oE2W2 != null && (listDt = interfaceC1464960oE2W2.Dt()) != null) {
            Iterator<StickerModel> it2 = listDt.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            stickerModel = next;
        } else {
            stickerModel = null;
        }
        if (u4.LJJIJIIJIL(H2()) && C299960BpK.LIZIZ && stickerModel != null) {
            if ((stickerModel instanceof AddYoursStickerModel) && (addYoursStickerModel = (AddYoursStickerModel) stickerModel) != null) {
                topicText = addYoursStickerModel.getTopicText();
            }
            InterfaceC1464960oE2 interfaceC1464960oE2W22 = W2();
            if (interfaceC1464960oE2W22 != null) {
                interfaceC1464960oE2W22.Dr(EnumC1466150oFx.ADD_YOURS, stickerModel, str, new AwS143S1100000_29(this, topicText, 1));
                return;
            }
            return;
        }
        if (stickerModel instanceof AddYoursStickerModel) {
            AddYoursStickerModel addYoursStickerModel2 = (AddYoursStickerModel) stickerModel;
            if (addYoursStickerModel2.isCandidateState()) {
                G2().LIZ().LIZIZ();
                C1403910mdZ.LIZ(H2(), addYoursStickerModel2, "Displaying");
            }
            InterfaceC1464960oE2 interfaceC1464960oE2W23 = W2();
            if (interfaceC1464960oE2W23 != null) {
                interfaceC1464960oE2W23.J4(addYoursStickerModel2.copy(addYoursStickerModel2.baseStickerModel, addYoursStickerModel2.topicID, addYoursStickerModel2.topicText, addYoursStickerModel2.topicTextFromRecommendTopicList, addYoursStickerModel2.visible, addYoursStickerModel2.editable, addYoursStickerModel2.clickable, addYoursStickerModel2.addYoursInvitees, addYoursStickerModel2.addYoursEnterMethod, addYoursStickerModel2.isOperationSet, addYoursStickerModel2.fontSize, addYoursStickerModel2.topicType, addYoursStickerModel2.followTopicText, addYoursStickerModel2.followTopicId, addYoursStickerModel2.needRemindUserCanChangeTopic, addYoursStickerModel2.isEdited, addYoursStickerModel2.sourceOfTrendsAddYoursInVideo, false, addYoursStickerModel2.initialRecommendTopicByContent, addYoursStickerModel2.videoCount, true, addYoursStickerModel2.recommendAyInitialScale));
            }
        }
        InterfaceC1464960oE2 interfaceC1464960oE2W24 = W2();
        if (interfaceC1464960oE2W24 == null) {
            return;
        }
        interfaceC1464960oE2W24.Dr(EnumC1466150oFx.ADD_YOURS, stickerModel, str, AFwS273S0000000_29.get$arr$(72));
    }

    @Override // X.InterfaceC1465010oE7
    public void rj(StickerModel stickerModel) {
        List<StickerModel> listDt;
        if (stickerModel == null) {
            InterfaceC1464960oE2 interfaceC1464960oE2W2 = W2();
            stickerModel = null;
            if (interfaceC1464960oE2W2 != null && (listDt = interfaceC1464960oE2W2.Dt()) != null) {
                Iterator<StickerModel> it2 = listDt.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    StickerModel next = it2.next();
                    if (next.getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                        stickerModel = next;
                        break;
                    }
                }
                stickerModel = stickerModel;
            }
        }
        C344010DeB c344010DeB = C344010DeB.LIZIZ;
        c344010DeB.LIZJ(C1664590tQ1.LJII(this), c344010DeB.LIZ(), new AwS391S0200000_25(stickerModel, this, 164));
    }

    public final void i3(AddYoursStickerModel addYoursStickerModel, String str) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C19642711tB(addYoursStickerModel, this, str, null), 3);
    }
}
