package X;

import Y.AObjectS243S0100000_14;
import Y.AObjectS245S0100000_22;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.SocialStickerMetaData;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryCommonStickerModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0neN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442850neN extends AbstractC2255721DQs<InterfaceC1435980nTI> implements InterfaceC1435980nTI, InterfaceC379610EuV {
    public static final C1442860neO LLIZLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public InterfaceC1452170ntP LLILLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public VESize LLILZ = new VESize(720, 1080);
    public long LLILZIL = -2;
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455590nyv.class, null);

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0neO] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1442850neN.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1442850neN.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1442850neN.class, "extraCoverApi", "getExtraCoverApi()Lcom/ss/android/ugc/aweme/port/internal/ExtraCoverFrameService;", 0)};
        LLIZLLLIL = new Object() { // from class: X.0neO
        };
        LLJI = 8;
    }

    public InterfaceC1435980nTI o2() {
        return this;
    }

    private final InterfaceC1455590nyv G2() {
        return (InterfaceC1455590nyv) this.LLIZ.getValue(this, LLJ[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZLL.getValue(this, LLJ[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    private final Context w2() {
        return C1664590tQ1.LJIIIZ(this);
    }

    @Override // X.InterfaceC1435980nTI
    public void CO2() {
        InterfaceC1446740nke interfaceC1446740nkeJY0;
        LiveData<Void> liveDataWw2;
        if (C1428470nHB.LJJJZ(LJJJLIIL()) || (interfaceC1446740nkeJY0 = JY0()) == null || (liveDataWw2 = interfaceC1446740nkeJY0.ww2()) == null) {
            return;
        }
        liveDataWw2.observe(this, new AObjectS243S0100000_14(this, 2));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C385670FAf<Boolean> c385670FAfMd2;
        super.onCreate();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 == null || (c385670FAfMd2 = interfaceC1446740nkeJY0.Md2()) == null) {
            return;
        }
        c385670FAfMd2.LIZ(this, new AObjectS245S0100000_22(this, 94));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        o2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1442850neN(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void X1(InterfaceC1452170ntP interfaceC1452170ntP) {
        InterfaceC1455590nyv interfaceC1455590nyvG2 = G2();
        if (interfaceC1455590nyvG2 != null) {
            interfaceC1455590nyvG2.TA(interfaceC1452170ntP, LJJJLIIL(), AFwS210S0000000_22.get$arr$(171), AFwS210S0000000_22.get$arr$(172));
        }
    }

    private final void W1(StoryCommonStickerModel storyCommonStickerModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        String stickerId;
        String stickerPath;
        String stickerId2;
        String str;
        C0FW6 c0fw6LJIIIZ;
        C348460DlM c348460DlM = new C348460DlM(0);
        c348460DlM.LJIILLIIL = "social";
        SocialStickerMetaData metadata = storyCommonStickerModel.getMetadata();
        String strLJIIL = null;
        if (metadata != null) {
            stickerId = metadata.getStickerId();
        } else {
            stickerId = null;
        }
        c348460DlM.LJIIZILJ = stickerId;
        SocialStickerMetaData metadata2 = storyCommonStickerModel.getMetadata();
        if (metadata2 != null) {
            stickerPath = metadata2.getStickerPath();
        } else {
            stickerPath = null;
        }
        c348460DlM.LJIIL = stickerPath;
        SocialStickerMetaData metadata3 = storyCommonStickerModel.getMetadata();
        if (metadata3 != null) {
            stickerId2 = metadata3.getStickerId();
        } else {
            stickerId2 = null;
        }
        c348460DlM.LJIILL = stickerId2;
        c348460DlM.LJFF = 0.5f;
        c348460DlM.LJI = 0.5f;
        String[] strArr = new String[2];
        strArr[0] = storyCommonStickerModel.getStickerJsonData();
        if (C426750GoL.LIZLLL(C1664590tQ1.LJIIIZ(this))) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        strArr[1] = str;
        c348460DlM.LJIILJJIL = strArr;
        c348460DlM.LJ = this.LLILZIL;
        c348460DlM.LJIIJ = 1.0f;
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP);
        if (c348100DkmLIZIZ != null && (c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ()) != null) {
            strLJIIL = c0fw6LJIIIZ.LJIIL(c348460DlM);
        }
        storyCommonStickerModel.setStickerUUID(strLJIIL);
    }

    private final void Z1(StoryCommonStickerModel storyCommonStickerModel, InterfaceC1452170ntP interfaceC1452170ntP) {
        if (!storyCommonStickerModel.isStickerAdded()) {
            W1(storyCommonStickerModel, interfaceC1452170ntP);
            storyCommonStickerModel.setStickerAdded(true);
        }
    }

    @Override // X.InterfaceC1435980nTI
    public void Yy2(InterfaceC1452170ntP interfaceC1452170ntP, VESize vESize) {
        C1463670oBx c1463670oBx;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETimeSpaceNode nLETimeSpaceNode;
        if (interfaceC1452170ntP == null) {
            return;
        }
        this.LLILZ = vESize;
        boolean z = interfaceC1452170ntP instanceof C1463670oBx;
        InterfaceC1452170ntP interfaceC1452170ntP2 = null;
        if (z) {
            interfaceC1452170ntP2 = interfaceC1452170ntP;
        }
        this.LLILLL = interfaceC1452170ntP2;
        if (z && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null && (mainTrack = c1463670oBx.LIZJ().getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLZIJ(0, slots)) != null) {
            this.LLILZIL = nLETimeSpaceNode.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        }
        Z1(LJJJLIIL().creativeModel.storyEventStickerData.getCommonStickerData(), interfaceC1452170ntP);
        interfaceC1452170ntP.jg();
    }
}
