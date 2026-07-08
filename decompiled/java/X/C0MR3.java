package X;

import Y.ARunnableS19S0101000_8;
import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS552S0100000_8;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0MR3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MR3 extends AbstractC2255721DQs<InterfaceC568270MQn> implements InterfaceC568270MQn, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final C1DRG LL;
    public C214799194j LLILZ;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), OnThisDayCardPreviewScene.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), ArrayList.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 666));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MR3.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MR3.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/OnThisDayCardPreviewScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MR3.class, "forwardList", "getForwardList()Ljava/util/ArrayList;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0MR3.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJI = 8;
    }

    public InterfaceC568270MQn W1() {
        return this;
    }

    @Override // X.InterfaceC568270MQn
    public void xU() {
        this.LLIZ = false;
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLILZLL.getValue(this, LLJ[3]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILLJJLI.getValue(this, LLJ[0]);
    }

    private final Unit w2() {
        this.LLIZLLLIL.getValue();
        return Unit.LIZ;
    }

    @Override // X.InterfaceC568270MQn
    public void CC1() {
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        c0ml7.getClass();
        C0ML7.LJIILJJIL(videoPublishEditModelZ1, "pop_up", "click_cancel", C0ML7.LIZIZ, X1());
        G2();
        C0ML6.LIZ.getClass();
        C0ML6.LIZ().storeLong("recall_local_auth_dialog_click_not_allow_time", System.currentTimeMillis());
    }

    public final void G2() {
        C214799194j c214799194j = this.LLILZ;
        if (c214799194j != null) {
            c214799194j.LLLLIL();
        }
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = o2().LLLLLLIL();
        if (abstractC568240MQkLLLLLLIL != null) {
            abstractC568240MQkLLLLLLIL.LLLLIIIILLL(true);
        }
    }

    public final void H2() {
        C0ML6.LIZ.getClass();
        C0ML6.LIZ().storeLong("recall_local_auth_dialog_click_not_allow_time", System.currentTimeMillis());
        int i = C0ML6.LIZ().getInt("num_of_show_recall_local_auth_dialog", 0);
        if (i != Integer.MAX_VALUE) {
            C0ML6.LIZ().storeInt("num_of_show_recall_local_auth_dialog", i + 1);
        }
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        c0ml7.getClass();
        C0ML7.LJIILJJIL(videoPublishEditModelZ1, "pop_up", "show", C0ML7.LIZIZ, X1());
        C0MRB c0mrb = new C0MRB();
        c0mrb.disableSceneRestore();
        c0mrb.LLJILJIL = new AwS552S0100000_8(this, 673);
        c0mrb.LLJIJIL = new AwS552S0100000_8(this, 674);
        c0mrb.LLJILJILJ = Z1();
        c0mrb.LLJILLL = X1();
        C18YA c18ya = new C18YA();
        c18ya.LIZ(new AwS552S0100000_8(c0mrb, 671));
        c18ya.LIZIZ(EnumC214804194o.AUTO_SIZE);
        C214799194j c214799194j = c18ya.LIZ;
        c214799194j.LLLII = true;
        c214799194j.LLLI = false;
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 672);
        C214799194j c214799194j2 = c18ya.LIZ;
        c214799194j2.LLJLLIL = awS552S0100000_8;
        this.LLILZ = c214799194j2;
        c214799194j2.LLLLL(o2());
        AbstractC568240MQk abstractC568240MQkLLLLLLIL = o2().LLLLLLIL();
        if (abstractC568240MQkLLLLLLIL != null) {
            abstractC568240MQkLLLLLLIL.LLLLIIIILLL(false);
        }
    }

    @Override // X.InterfaceC568270MQn
    public void I51() {
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        c0ml7.getClass();
        C0ML7.LJIILJJIL(videoPublishEditModelZ1, "pop_up", "click_confirm", C0ML7.LIZIZ, X1());
        C0ML6.LIZ.getClass();
        C0ML6.LIZ().storeBoolean("has_allow_scan_album", true);
        C0ML5 c0ml5 = C0ML5.LIZ;
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModelZ12 = Z1();
        ArrayList<ForwardMedia> arrayListX1 = X1();
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 669);
        AwS552S0100000_8 awS552S0100000_82 = new AwS552S0100000_8(this, 670);
        c0ml5.getClass();
        C0ML5.LJI(activity, videoPublishEditModelZ12, "pop_up", arrayListX1, awS552S0100000_8, awS552S0100000_82);
    }

    public final ArrayList<ForwardMedia> X1() {
        return (ArrayList) this.LLILZIL.getValue(this, LLJ[2]);
    }

    @Override // X.InterfaceC568270MQn
    public void ba1() {
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        c0ml7.getClass();
        C0ML7.LJIILJJIL(videoPublishEditModelZ1, "card", "click_confirm", C0ML7.LIZIZ, X1());
        C0ML6.LIZ.getClass();
        C0ML6.LIZ().storeBoolean("has_allow_scan_album", true);
        C0ML5 c0ml5 = C0ML5.LIZ;
        C19EG activity = getActivity();
        VideoPublishEditModel videoPublishEditModelZ12 = Z1();
        ArrayList<ForwardMedia> arrayListX1 = X1();
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 667);
        AwS552S0100000_8 awS552S0100000_82 = new AwS552S0100000_8(this, 668);
        c0ml5.getClass();
        C0ML5.LJI(activity, videoPublishEditModelZ12, "card", arrayListX1, awS552S0100000_8, awS552S0100000_82);
    }

    public final OnThisDayCardPreviewScene o2() {
        return (OnThisDayCardPreviewScene) this.LLILLL.getValue(this, LLJ[1]);
    }

    @Override // X.InterfaceC568270MQn
    public void ox2() {
        C0ML7 c0ml7 = C0ML7.LIZ;
        VideoPublishEditModel videoPublishEditModelZ1 = Z1();
        c0ml7.getClass();
        C0ML7.LJIILJJIL(videoPublishEditModelZ1, "card", "click_cancel", C0ML7.LIZIZ, X1());
        C1440005kM.LIZ(new C568250MQl(1));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
        Bundle bundle = o2().mArguments;
        this.LLIZ = bundle != null ? bundle.getBoolean("has_scanned_album", false) : false;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C0ML5.LIZ.getClass();
        if (!C0ML5.LIZ() || this.LLIZ) {
            return;
        }
        T2(4);
    }

    @Override // X.InterfaceC568270MQn
    public void Uk2() {
        w2();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C0MR3(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void T2(int i) {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        C823050WQl.LIZLLL().submit(new ARunnableS19S0101000_8(i, this, 5));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0MR5 c0mr5) {
        NavigationScene navigationSceneLIZ = C1447800nmM.LIZ(o2());
        if (navigationSceneLIZ != null) {
            navigationSceneLIZ.LLLLLLJ(o2().getClass(), null);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C0MR4 c0mr4) {
        T2(!c0mr4.LIZ ? 1 : 0);
    }
}
