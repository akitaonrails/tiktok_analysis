package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.social.creation.record.SocialRecordScene;
import com.ss.android.ugc.aweme.social.creation.record.monitor.RecordMonitor;
import kotlin.jvm.internal.Intrinsics;
import nv7.c0;

/* JADX INFO: renamed from: X.0t2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649970t2R extends AbstractC2255721DQs<InterfaceC1655310tB3> implements InterfaceC1655310tB3, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final C1649970t2R LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1649090t11.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC332260D0u<C1683130ttv> LLJI;
    public final C05YD<C1683130ttv> LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649970t2R.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649970t2R.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649970t2R.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649970t2R.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1649970t2R.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C1649970t2R.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILJILJ = 8;
    }

    private final InterfaceC1649090t11 Z1() {
        return (InterfaceC1649090t11) this.LLIZLLLIL.getValue(this, LLJILJIL[4]);
    }

    private final Activity getActivity() {
        return (Activity) this.LLIZ.getValue(this, LLJILJIL[3]);
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLJILJIL[1]);
    }

    private final Context getContext() {
        return (Context) this.LLILZLL.getValue(this, LLJILJIL[2]);
    }

    private final a getPlanCUIApiComponent() {
        return (a) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJ.getValue(this, LLJILJIL[5]);
    }

    @Override // X.InterfaceC1655310tB3
    public void nm() {
        RecordMonitor recordMonitor;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1683130ttv c1683130ttvO2;
        boolean z = C1462920oAk.LIZ;
        int i2 = 0;
        C1462920oAk.LJFF(getContext(), false);
        C578100Mls.LIZIZ(getActivity());
        AbstractC214814194y abstractC214814194yW1 = W1(this.LLILLJJLI);
        if (!(abstractC214814194yW1 instanceof SocialRecordScene) || (recordMonitor = (RecordMonitor) abstractC214814194yW1) == null) {
            return;
        }
        c0 c0Var = c0.LIZ;
        ShortVideoContext shortVideoContext = recordMonitor.LLJZIJLIL;
        if (shortVideoContext != null) {
            i = shortVideoContext.cameraComponentModel.mVideoWidth;
            i2 = shortVideoContext.cameraComponentModel.mVideoHeight;
        } else {
            i = 0;
        }
        c0Var.t2(i, i2);
        Z1().LIZ(null, getCameraApiComponent().getPreviewView(), (View) getCameraApiComponent().St2(), true);
        ViewGroup.LayoutParams layoutParams = getCameraApiComponent().getPreviewView().getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (c1683130ttvO2 = o2(marginLayoutParams)) == null || !(!Intrinsics.LJFF(c1683130ttvO2, C1683130ttv.LJ))) {
            return;
        }
        this.LLJI.LIZJ(c1683130ttvO2);
    }

    @Override // X.InterfaceC1655310tB3
    public void onCreated() {
        BaseScreenAdaptScene baseScreenAdaptScene;
        c0.LIZ.s2(ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(getContext()));
        AbstractC214814194y abstractC214814194yW1 = W1(this.LLILLJJLI);
        if (!(abstractC214814194yW1 instanceof SocialRecordScene) || (baseScreenAdaptScene = (BaseScreenAdaptScene) abstractC214814194yW1) == null) {
            return;
        }
        baseScreenAdaptScene.LLLLLJIL();
    }

    @Override // X.InterfaceC1655310tB3
    public C05YD<C1683130ttv> EB() {
        return this.LLJIJIL;
    }

    public C1649970t2R X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final C1683130ttv o2(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return new C1683130ttv(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    private final void w2(boolean z) {
        Window window;
        Activity activity = this.LLILLJJLI.mActivity;
        if (activity != null && (window = activity.getWindow()) != null) {
            if (Build.VERSION.SDK_INT >= 28 && window.getDecorView().getRootWindowInsets() == null) {
                return;
            }
            InterfaceC1650230t2r cameraApiComponent = getCameraApiComponent();
            InterfaceC2254001DKc mediaController = cameraApiComponent.St2().getMediaController();
            float f = C20246714Kb.LIZ;
            mediaController.k5(C20246714Kb.LIZ((ViewGroup.MarginLayoutParams) cameraApiComponent.getPreviewView().getLayoutParams(), window, z));
        }
    }

    @Override // X.InterfaceC1655310tB3
    public void S3(boolean z) {
        getPlanCUIApiComponent().gX1(z);
        w2(z);
    }

    public final AbstractC214814194y W1(Scene scene) {
        while (scene != null) {
            if (scene instanceof AbstractC214814194y) {
                return (AbstractC214814194y) scene;
            }
            scene = scene.mParentScene;
        }
        return null;
    }

    @Override // X.InterfaceC1655310tB3
    public void p2(boolean z) {
        getPlanCUIApiComponent().H90(z);
    }

    public C1649970t2R(C1DRG c1drg, C19A3 c19a3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1683130ttv.LJ);
        this.LLJI = c2252321DDqLIZ;
        this.LLJIJIL = c2252321DDqLIZ;
    }
}
