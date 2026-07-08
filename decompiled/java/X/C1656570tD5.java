package X;

import Y.AAListenerS335S0100000_25;
import Y.AObjectS246S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.StoryShootModel;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656570tD5 extends AbstractC2255721DQs<InterfaceC1646820sxM> implements InterfaceC1646820sxM, InterfaceC379610EuV {
    public static final C1656580tD6 LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public SmartImageView LLJ;
    public View LLJI;
    public View LLJIJIL;
    public final InterfaceC497601wk LLJILJILJ;
    public final File LLJILLL;
    public final AtomicInteger LLJJ;
    public final C01GW LLJJI;
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 433));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 434));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 430));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 435));
    public final C1656570tD5 LLJILJIL = this;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0tD6] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1656570tD5.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIII = new Object() { // from class: X.0tD6
        };
        LLJJIJIIJIL = 8;
    }

    private final StoryShootModel T2() {
        return (StoryShootModel) this.LLIZLLLIL.getValue();
    }

    private final void W2() {
        SmartImageView smartImageView = this.LLJ;
        if (smartImageView != null) {
            HandlerHook.viewPostDelay(smartImageView, new ARunnableS125S0100000_25(this, 55), 80L);
        }
    }

    private final boolean i3() {
        return ((Boolean) this.LLJJI.getValue()).booleanValue();
    }

    public final CreativeModel G2() {
        return (CreativeModel) this.LLIZ.getValue();
    }

    public final C19A3 H2() {
        return (C19A3) this.LLILZIL.getValue();
    }

    public final void c3() {
        if (this.LLJJ.incrementAndGet() >= 2) {
            SmartImageView smartImageView = this.LLJ;
            if (smartImageView != null) {
                smartImageView.animate().alpha(0.0f).setDuration(100L).setListener(new AAListenerS335S0100000_25(smartImageView, 3)).start();
            }
            View view = this.LLJI;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(100L).setListener(new AAListenerS335S0100000_25(view, 3)).start();
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C339190DRl.LIZIZ(view2);
            }
        }
    }

    public final InterfaceC1650230t2r getCameraApi() {
        return (InterfaceC1650230t2r) this.LLILZ.getValue(this, LLJJIJI[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue();
    }

    private final void X1() {
        if (i3() || T2().getFromPermissionRequestingActivity()) {
            return;
        }
        if (Intrinsics.LJFF(getShortVideoContext().enterMethod, "story_fixed_icon")) {
            c3();
        }
        C0CNO.LIZLLL(2000L, new AwS569S0100000_25(this, 431));
        m3();
        SmartImageView smartImageView = this.LLJ;
        if (this.LLJILLL == null || smartImageView == null) {
            q3(C1664590tQ1.LJII(this));
            return;
        }
        C339190DRl.LIZLLL(smartImageView);
        if (T2().getSharedElementTransitionMode() == 2) {
            View view = this.LLJIJIL;
            if (view != null) {
                C339190DRl.LIZLLL(view);
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C1447470nlp.LIZIZ(view2, C418440Gaw.LIZIZ(16));
            }
        }
        Z1(smartImageView, getShortVideoContext().cameraComponentModel.mVideoWidth, getShortVideoContext().cameraComponentModel.mVideoHeight);
        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(this.LLJILLL);
        c1331670kl3LJII.LJJ(smartImageView);
        c1331670kl3LJII.LJJJJZ = true;
        c1331670kl3LJII.LJJJJLL = true;
        c1331670kl3LJII.LJIIL(new C1698000uHu(this, 1));
    }

    private final void m3() {
        LiveEvent<Long> liveEventXF1;
        InterfaceC1650230t2r cameraApi = getCameraApi();
        if (cameraApi == null || (liveEventXF1 = cameraApi.xF1()) == null) {
            return;
        }
        liveEventXF1.LIZ(this, new AObjectS246S0100000_25(this, 299));
    }

    private final Size o2() {
        return new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))), (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))) * (getShortVideoContext().cameraComponentModel.mVideoHeight / getShortVideoContext().cameraComponentModel.mVideoWidth)));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        C1637850sit.LIZ(this, new AwS569S0100000_25(this, 432));
        this.LLJ = (SmartImageView) H2().findViewById(R.id.ip4);
        this.LLJI = H2().findViewById(R.id.szg);
        this.LLJIJIL = H2().findViewById(R.id.tsv);
        X1();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public final C19A3 getParentScene() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
    }

    public C1656570tD5 w2() {
        return this.LLJILJIL;
    }

    public final void q3(Activity activity) {
        activity.getWindow().setSharedElementsUseOverlay(false);
        InterfaceC721960STq interfaceC721960STqLJJJIL = C1618440sDa.LIZIZ.LJJJIL();
        if (interfaceC721960STqLJJJIL != null) {
            interfaceC721960STqLJJJIL.LIZ(activity, (View[]) C13LQ.LJIJI(new View[]{this.LLJ, this.LLJIJIL}).toArray(new View[0]), T2().getSharedElementTransitionMode(), null, new AwS674S0100000_25(this, 22));
        }
        C1606560ruQ.LJ(activity);
    }

    @Override // X.InterfaceC1646820sxM
    public void u50(final Function0<Unit> function0) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILLL.set(false);
        C23250099c.LIZLLL(this.LLJILJILJ, null, null, new C476501tL(this, jCurrentTimeMillis, function0, null), 3);
        if (getCameraApi() == null) {
            W1(this, jCurrentTimeMillis, function0, null);
            return;
        }
        Size sizeO2 = o2();
        InterfaceC1650230t2r cameraApi = getCameraApi();
        if (cameraApi != null) {
            cameraApi.qf0(sizeO2.getWidth(), sizeO2.getHeight(), false, false, new InterfaceC2173471A4j() { // from class: X.01tK
                @Override // X.InterfaceC2173471A4j
                public final void LIZ(int i, Bitmap bitmap) {
                    C1656570tD5 c1656570tD5 = this.LIZ;
                    C23250099c.LIZLLL(c1656570tD5.LLJILJILJ, null, null, new C476301tJ(bitmap, c1656570tD5, jCurrentTimeMillis, function0, null), 3);
                    if (i != 0) {
                        return;
                    }
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C476201tI(bitmap, this.LIZ, null), 2);
                }
            }, false);
        }
    }

    public C1656570tD5(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJILJILJ = C2296808zG.LIZ(C2107308Nj.LIZ);
        StoryHomepageService storyHomepageServiceLJJJJZ = C1618440sDa.LIZIZ.LJJJJZ();
        this.LLJILLL = storyHomepageServiceLJJJJZ != null ? storyHomepageServiceLJJJJZ.LIZLLL() : null;
        this.LLJJ = new AtomicInteger(0);
        this.LLJJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(222));
    }

    private final void Z1(View view, int i, int i2) {
        int i3;
        int i4;
        FrameLayout.LayoutParams layoutParams;
        int screenHeight = ScreenUtils.getScreenHeight(view.getContext());
        int screenWidth = ScreenUtils.getScreenWidth(view.getContext());
        float f = i / i2;
        float f2 = screenWidth;
        float f3 = screenHeight;
        if (f2 / f3 > f) {
            i4 = (int) (f3 * f);
            i3 = screenHeight;
        } else {
            i3 = (int) (f2 / f);
            i4 = screenWidth;
        }
        int i5 = (screenWidth - i4) / 2;
        int i6 = (screenHeight - i3) / 2;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = i4;
            layoutParams.height = i3;
            layoutParams.setMargins(i5, i6, i5, i6);
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void W1(C1656570tD5 c1656570tD5, long j, Function0<Unit> function0, Bitmap bitmap) {
        if (!c1656570tD5.LLILLL.getAndSet(true)) {
            if (bitmap != null && !c1656570tD5.i3()) {
                SmartImageView smartImageView = c1656570tD5.LLJ;
                if (smartImageView != null) {
                    c1656570tD5.Z1(smartImageView, c1656570tD5.getShortVideoContext().cameraComponentModel.mVideoWidth, c1656570tD5.getShortVideoContext().cameraComponentModel.mVideoHeight);
                }
                SmartImageView smartImageView2 = c1656570tD5.LLJ;
                if (smartImageView2 != null) {
                    smartImageView2.setImageBitmap(bitmap);
                }
                SmartImageView smartImageView3 = c1656570tD5.LLJ;
                if (smartImageView3 != null) {
                    C339190DRl.LIZLLL(smartImageView3);
                }
                c1656570tD5.W2();
            }
            System.currentTimeMillis();
            function0.invoke();
        }
    }
}
