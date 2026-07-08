package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS91S0210000_8;

/* JADX INFO: renamed from: X.0MDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564920MDq extends AbstractC2255721DQs<C0ME3> implements C0ME3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final C0ME3 LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC564940MDs.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C0ME1.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C564920MDq.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C564920MDq.class, "taskHandler", "getTaskHandler()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveTaskApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C564920MDq.class, "aiLiveDraftApi", "getAiLiveDraftApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILiveDraftApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    public final C0ME1 W1() {
        return (C0ME1) this.LLILZIL.getValue(this, LLILZLL[2]);
    }

    public final InterfaceC564940MDs Z1() {
        return (InterfaceC564940MDs) this.LLILZ.getValue(this, LLILZLL[1]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    @Override // X.C0ME3
    public void WC2() {
        Z1().kj2();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_ai_alive_back_without_dialog", true, false)) {
            W1().TB2("ai_livephoto_cancel_edit_auto_save", 28);
            return;
        }
        C0MES c0mes = C0MES.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        VideoPublishEditModel editModel = getEditModel();
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 511);
        AwS552S0100000_8 awS552S0100000_82 = new AwS552S0100000_8(this, 512);
        c0mes.getClass();
        C0MES.LJII(contextLJIIIZ, editModel, awS552S0100000_8, awS552S0100000_82);
    }

    public C0ME3 X1() {
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

    public C564920MDq(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0ME3
    public void uh0(Function0<Unit> function0) {
        Z1().kj2();
        C0MES c0mes = C0MES.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        VideoPublishEditModel editModel = getEditModel();
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this, function0, 76);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 513);
        c0mes.getClass();
        C0MES.LJII(contextLJIIIZ, editModel, awS409S0200000_8, awS552S0100000_8);
    }

    @Override // X.C0ME3
    public void Qu(boolean z, Function0<Unit> function0) {
        Z1().kj2();
        getEditModel().getAILivePhotoModel().pageDataCache.publishDialogContinueSelected = false;
        getEditModel().getAILivePhotoModel().LJIILLIIL(AFwS239S0000000_8.get$arr$(170));
        C0MES c0mes = C0MES.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        VideoPublishEditModel editModel = getEditModel();
        AwS91S0210000_8 awS91S0210000_8 = new AwS91S0210000_8(this, (C564920MDq) z, (boolean) function0, (Function0<Unit>) 2);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 510);
        c0mes.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(contextLJIIIZ);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_ai_star;
        c1397580mTM.LJIIIZ = new C340190DVh(0, contextLJIIIZ, c419910GdJ.LIZ(contextLJIIIZ));
        c1397580mTM.LJI(C0MED.LIZ(C0MEB.EDITING_PAGE_GENERATING_REMINDER_POP_UP_TITLE, new Object[0]));
        c1397580mTM.LIZIZ(C0MED.LIZ(C0MEB.EDITING_PAGE_GENERATING_REMINDER_POP_UP_BODY, new Object[0]));
        C985403tE.LIZ(c1397580mTM, new AwS217S0300000_8(editModel, awS91S0210000_8, awS552S0100000_8, 36));
        c1397580mTM.LJ(new AwS587S0100000_8(editModel, 637));
        c1397580mTM.LJII = false;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
