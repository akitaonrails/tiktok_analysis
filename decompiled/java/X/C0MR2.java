package X;

import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MR2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MR2 extends AbstractC2255721DQs<InterfaceC568290MQp> implements InterfaceC568290MQp, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC568290MQp LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), OnThisDayCardPreviewScene.class, null);
    public final View LLILZ = X1().mView.findViewById(R.id.ott);
    public final View LLILZIL = X1().mView.findViewById(R.id.uuu);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MR2.class, "onThisDayPreviewScene", "getOnThisDayPreviewScene()Lcom/ss/android/ugc/gamora/editor/lightening/canvas/forward/onthisday/OnThisDayCardPreviewScene;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZ = 8;
    }

    private final OnThisDayCardPreviewScene X1() {
        return (OnThisDayCardPreviewScene) this.LLILLL.getValue(this, LLILZLL[0]);
    }

    public InterfaceC568290MQp W1() {
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

    public C0MR2(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC568290MQp
    public void em1(Scene scene) {
        float f;
        boolean z;
        if (scene instanceof C0MR9) {
            f = 0.5f;
            z = false;
        } else {
            f = 1.0f;
            z = true;
        }
        C786410Ut5.T4(this.LLILZ, f);
        this.LLILZ.setClickable(z);
        C786410Ut5.T4(this.LLILZIL, f);
        this.LLILZIL.setClickable(z);
    }
}
