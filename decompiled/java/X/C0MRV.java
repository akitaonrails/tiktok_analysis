package X;

import Y.AObjectS241S0100000_8;
import Y.ATListenerS442S0100000_8;
import androidx.lifecycle.Observer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MRV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRV extends AbstractC2255721DQs<InterfaceC568300MQq> implements InterfaceC568300MQq, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public C0MRW LLILZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), OnThisDayCardPreviewScene.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C568190MQf.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), ArrayList.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MRV.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/OnThisDayCardPreviewScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0MRV.class, "onThisDayStickerStateGlobal", "getOnThisDayStickerStateGlobal()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/component/sticker/styles/OnThisDayStickerStateGlobal;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0MRV.class, "forwardList", "getForwardList()Ljava/util/ArrayList;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    public InterfaceC568300MQq W1() {
        return this;
    }

    private final ArrayList<ForwardMedia> X1() {
        return (ArrayList) this.LLILZIL.getValue(this, LLILZLL[2]);
    }

    private final C568190MQf Z1() {
        return (C568190MQf) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    private final boolean w2() {
        C0ML6.LIZ.getClass();
        return C0ML6.LIZ().getInt("shuffle_guide_count", 2) > 0;
    }

    @Override // X.InterfaceC568300MQq
    public void HD0() {
        C0MRW c0mrw = this.LLILZ;
        if (c0mrw == null || c0mrw.LJIIJJI) {
            return;
        }
        c0mrw.LJIILIIL = true;
        c0mrw.LIZ();
        c0mrw.LJIIL = 0;
    }

    @Override // X.InterfaceC568300MQq
    public void HV0() {
        C0MRW c0mrw = this.LLILZ;
        if (c0mrw == null || c0mrw.LJIIJJI) {
            return;
        }
        c0mrw.LJIILIIL = false;
        c0mrw.LJ.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(2000L, c0mrw.LJ, c0mrw.LJIILJJIL);
    }

    public final OnThisDayCardPreviewScene o2() {
        return (OnThisDayCardPreviewScene) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        C709150Rrl c709150Rrl;
        super.onCreate();
        if (w2() && (!X1().isEmpty()) && (c709150Rrl = (C709150Rrl) o2().mView.findViewById(R.id.tsc)) != null) {
            C201955140j.LJIILJJIL(C1429810nJL.LIZIZ, "need show shuffle guide");
            TuxTextView tuxTextView = new TuxTextView(o2().requireSceneContext(), null, 6, 0);
            tuxTextView.setTuxFont(42);
            tuxTextView.setGravity(17);
            tuxTextView.setText(o2().getString(2131838700));
            tuxTextView.setTextColorRes(R.attr.zl);
            tuxTextView.setLineSpacing(C418440Gaw.LIZIZ(3), 0.0f);
            C0MRW c0mrw = new C0MRW(c709150Rrl, new AwS552S0100000_8(this, 665), tuxTextView, this);
            if (!c0mrw.LJIIJ) {
                c0mrw.LJIIJ = true;
                c0mrw.LIZ.setInterceptTouchListener(new ATListenerS442S0100000_8(c0mrw, 2));
                C786410Ut5.LJLIIL(2000L, c0mrw.LJ, c0mrw.LJIILJJIL);
            }
            c0mrw.LJIIIIZZ.observe(this, new Observer() { // from class: X.0MRU
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        C201955140j.LJIILJJIL(C1429810nJL.LIZIZ, "shuffle guide has shown");
                        C0ML6.LIZ.getClass();
                        C0ML6.LIZ().storeInt("shuffle_guide_count", C0ML6.LIZ().getInt("shuffle_guide_count", 2) - 1);
                    }
                }
            });
            this.LLILZ = c0mrw;
            Z1().LIZIZ.LIZ(o2(), new AObjectS241S0100000_8(this, 46));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        C0MRW c0mrw = this.LLILZ;
        if (c0mrw == null || c0mrw.LJIIJJI) {
            return;
        }
        c0mrw.LJIILIIL = true;
        c0mrw.LIZ();
        c0mrw.LJIIL = 0;
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C0MRW c0mrw = this.LLILZ;
        if (c0mrw == null || c0mrw.LJIIJJI) {
            return;
        }
        c0mrw.LJIILIIL = false;
        c0mrw.LJ.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(2000L, c0mrw.LJ, c0mrw.LJIILJJIL);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        C0MRW c0mrw = this.LLILZ;
        if (c0mrw == null || c0mrw.LJIIL < 1) {
            return;
        }
        c0mrw.LJIIJJI = true;
        c0mrw.LIZ();
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

    public C0MRV(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
