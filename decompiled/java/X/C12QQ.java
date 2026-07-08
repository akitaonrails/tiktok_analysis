package X;

import android.view.KeyEvent;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS18S0002000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12QQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12QQ extends i<InterfaceC1452510ntx, C21665319qd, C21665619qg, C12QU> implements InterfaceC1452510ntx, InterfaceC379610EuV, InterfaceC362610EJn {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final boolean LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C12QQ.class, "avListenableActivityRegistry", "getAvListenableActivityRegistry()Lcom/ss/android/ugc/tools/view/activity/AVListenableActivityRegistry;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C12QQ.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C12QQ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C12QQ.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJJIL = 8;
    }

    public abstract void H4();

    public void k5(boolean z) {
    }

    public void n5() {
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        this.LLJJIJIL = true;
        if (this.LLJILLL) {
            P4(this).vW1().setValue(C1452730nuJ.LIZJ());
        }
        H4();
        super.show();
        H5();
        i3(AFwS273S0000000_29.get$arr$(206));
        C1451630nsX c1451630nsXT4 = T4();
        if (c1451630nsXT4 != null) {
            c1451630nsXT4.LIZIZ(AFwS273S0000000_29.get$arr$(207));
        }
    }

    public abstract void t5(C1450520nqk c1450520nqk);

    public void v5(C1450520nqk c1450520nqk) {
    }

    private final InterfaceC524950KiL O4() {
        return (InterfaceC524950KiL) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    private final C1451630nsX T4() {
        return (C1451630nsX) this.LLJJI.getValue(this, LLJJJ[1]);
    }

    public final VideoPublishEditModel Z4() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJJJ[3]);
    }

    public final NLEEditor d5() {
        return (NLEEditor) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21665619qg> o2() {
        return new AwS573S0100000_29(this, 614);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12QU> w2() {
        return new AwS573S0100000_29(this, 616);
    }

    public final void H5() {
        NLEModel model;
        NLEModel model2;
        NLEEditor nLEEditorD5 = d5();
        int iLIZ = (nLEEditorD5 == null || (model2 = nLEEditorD5.getModel()) == null) ? 0 : C348360DlC.LIZ(model2);
        float f = iLIZ;
        NLEEditor nLEEditorD52 = d5();
        D5(iLIZ, (int) (f / ((nLEEditorD52 == null || (model = nLEEditorD52.getModel()) == null) ? 1.0f : model.getCanvasRatio())));
        NLETrackSlot nLETrackSlotM5 = M5();
        if (nLETrackSlotM5 != null) {
            E5(nLETrackSlotM5);
        }
    }

    public void K4() {
        super.hide();
        this.LLJJIJIL = false;
        if (this.LLJILLL) {
            P4(this).vW1().setValue(C1452730nuJ.LIZ());
        }
        C1451630nsX c1451630nsXT4 = T4();
        if (c1451630nsXT4 != null) {
            c1451630nsXT4.LIZIZ(AFwS273S0000000_29.get$arr$(204));
        }
    }

    public NLETrackSlot M5() {
        NLEModel model;
        NLETrack mainTrack;
        NLEEditor nLEEditorD5 = d5();
        NLETrackSlot slotByIndex = (nLEEditorD5 == null || (model = nLEEditorD5.getModel()) == null || (mainTrack = model.getMainTrack()) == null) ? null : mainTrack.getSlotByIndex(0);
        C5(slotByIndex);
        return slotByIndex;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        O4().kF(this);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // ge.i, X.InterfaceC386130FBz
    public boolean isShowing() {
        return this.LLJJIJIL;
    }

    private final void E5(NLETrackSlot nLETrackSlot) {
        x5(C389780FQa.LIZ(nLETrackSlot));
    }

    public static final InterfaceC1455860nzM P4(C12QQ c12qq) {
        return (InterfaceC1455860nzM) c12qq.LLJJIII.getValue(c12qq, LLJJJ[2]);
    }

    public final void C5(NLETrackSlot nLETrackSlot) {
        i3(new AwS608S0100000_29(nLETrackSlot, 350));
    }

    @Override // X.InterfaceC1452510ntx
    public void Uv1(C21665819qi c21665819qi) {
        i3(new AwS608S0100000_29(c21665819qi, 351));
    }

    public final void x5(C21665819qi c21665819qi) {
        i3(new AwS608S0100000_29(c21665819qi, 349));
    }

    private final void D5(int i, int i2) {
        i3(new AwS18S0002000_29(i, i2, 1));
    }

    @Override // X.InterfaceC362610EJn
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.LLJJIJIL) {
            i3(AFwS273S0000000_29.get$arr$(205));
            return true;
        }
        return false;
    }

    public C12QQ(C19A3 c19a3, C1DRG c1drg, boolean z) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = z;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC524950KiL.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 615));
    }
}
