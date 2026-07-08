package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MCB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MCB extends AbstractC2255721DQs<InterfaceC558740Lvk> implements InterfaceC558740Lvk, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final int LLJIJIL;
    public final C1DRG LL;
    public final InterfaceC558740Lvk LLILLJJLI = this;
    public final String LLILLL = "AILiveDataManager";
    public long LLILZ = -1;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1417050myl.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 509));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 508));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MCB.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MCB.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MCB.class, "editAutoCutApi", "getEditAutoCutApi()Lcom/ss/android/ugc/aweme/shortvideo/autocut/EditAutoCutApi;", 0);
        c09r3.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJIJIL = 8;
    }

    @Override // X.InterfaceC558740Lvk
    public String getTaskType() {
        return "PostProcess";
    }

    private final InterfaceC1417050myl Z1() {
        return (InterfaceC1417050myl) this.LLIZ.getValue(this, LLJI[2]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZIL.getValue(this, LLJI[0]);
    }

    public final C0MC8 X1() {
        return (C0MC8) this.LLJ.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJI[1]);
    }

    @Override // X.InterfaceC558740Lvk
    public String getSource() {
        return Source.EDIT_AI_LIVE_PHOTO.getSource();
    }

    public final NLEEditor o2() {
        return (NLEEditor) this.LLIZLLLIL.getValue();
    }

    public InterfaceC558740Lvk W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC558740Lvk
    public long getStartTime() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC558740Lvk
    public String getTag() {
        return this.LLILLL;
    }

    public C0MCB(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC558740Lvk
    public void bm(long j) {
        this.LLILZ = j;
    }

    @Override // X.InterfaceC558740Lvk
    public boolean F30(CreativeModel creativeModel, C0LSZ c0lsz) {
        return X1().F30(creativeModel, c0lsz);
    }

    @Override // X.InterfaceC558740Lvk
    public void Fx(CreativeModel creativeModel, C0LSZ c0lsz) {
        X1().Fx(creativeModel, c0lsz);
    }

    @Override // X.InterfaceC558740Lvk
    public void Zq1(NLETrackSlot nLETrackSlot, CreativeModel creativeModel) {
        X1().Zq1(nLETrackSlot, creativeModel);
    }

    @Override // X.InterfaceC558740Lvk
    public void ec2(VideoPublishEditModel videoPublishEditModel, NLETrackSlot nLETrackSlot) {
        if (!C1414940mvM.LIZJ(videoPublishEditModel) && videoPublishEditModel.creativeModel.draftInfoModel.isDraft && videoPublishEditModel.getAILivePhotoModel().LJII() && (videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.getEditMusicSyncMode())) {
            InterfaceC1417050myl interfaceC1417050mylZ1 = Z1();
            if (interfaceC1417050mylZ1 != null) {
                interfaceC1417050mylZ1.lJ1();
            }
            Zq1(nLETrackSlot, videoPublishEditModel.creativeModel);
            C0MCR c0mcr = C0MCR.LIZ;
            NLEEditor nLEEditorO2 = o2();
            c0mcr.getClass();
            C0MCR.LJIIIIZZ(nLEEditorO2, videoPublishEditModel);
            InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).MY1(InterfaceC1419190n2D.class);
            if (interfaceC1419190n2D != null) {
                interfaceC1419190n2D.UZ1();
            }
            C559010LwB.LIZIZ(getTag(), "updateCancel");
            return;
        }
        X1().ec2(videoPublishEditModel, nLETrackSlot);
    }

    @Override // X.InterfaceC558740Lvk
    public void ew1(String str, boolean z) {
        X1().ew1(str, z);
    }

    @Override // X.InterfaceC558740Lvk
    public void jA0(CreativeModel creativeModel, C0LSZ c0lsz) {
        X1().jA0(creativeModel, c0lsz);
    }

    @Override // X.InterfaceC558740Lvk
    public void qO(VideoPublishEditModel videoPublishEditModel, String str) {
        X1().qO(videoPublishEditModel, str);
    }

    @Override // X.InterfaceC558740Lvk
    public void k72(VideoPublishEditModel videoPublishEditModel, C0LSZ c0lsz, C0MCA c0mca) {
        X1().k72(videoPublishEditModel, c0lsz, c0mca);
    }

    @Override // X.InterfaceC558740Lvk
    public void Qy(boolean z, String str, String str2, boolean z2) {
        X1().Qy(z, str, str2, z2);
    }

    @Override // X.InterfaceC558740Lvk
    public void Xv1(VideoPublishEditModel videoPublishEditModel, PromptModel promptModel, String str, long j) {
        X1().Xv1(videoPublishEditModel, promptModel, str, j);
    }
}
