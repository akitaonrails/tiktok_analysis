package X;

import Y.ARunnableS94S0200000_25;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlinx.coroutines.CoroutineExceptionHandler;
import mn3.e0;

/* JADX INFO: renamed from: X.0tJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660390tJF extends i<InterfaceC1648820t0a, C1660470tJN, C1660440tJK, C1660460tJM> implements InterfaceC1648820t0a, InterfaceC379610EuV {
    public static final C1649160t18 LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final float LLJLLIL;
    public static final float LLJLLL;
    public static final long LLJZ;
    public static final String LLJZIJLIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public float LLJJIJIL;
    public Pair<? extends FrameLayout.LayoutParams, Float> LLJJJ;
    public boolean LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final InterfaceC1731706qJ LLJJL;
    public final Function0<C1660440tJK> LLJJLIIIJLLLLLLLZ;
    public final Function0<C1660460tJM> LLJL;

    private final void C5() {
        this.LLJJJIL = true;
        O4().mD(new C1658370tFz(false, 14));
        d5().wu0(false);
    }

    public final void E5() {
        this.LLJJJIL = false;
        O4().mD(new C1658370tFz(true, 14));
        d5().wu0(true);
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0t18] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1660390tJF.class, "changeCameraSpecApi", "getChangeCameraSpecApi()Lcom/ss/android/ugc/aweme/changemode/ChangeCameraSpecApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1660390tJF.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1660390tJF.class, "reuseSurfaceApi", "getReuseSurfaceApi()Lcom/bytedance/uicomponent/ReuseSurfaceApiComponent;", 0), new C2217381BqS(C1660390tJF.class, "cameraLayoutBridge", "getCameraLayoutBridge()Lcom/ss/android/ugc/aweme/social/creation/record/view/CameraViewLayoutBridgeApiComponent;", 0), new C2217381BqS(C1660390tJF.class, "activity", "getActivity()Landroid/app/Activity;", 0), new C2217381BqS(C1660390tJF.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1660390tJF.class, "cameraViewControl", "getCameraViewControl()Lcom/ss/android/ugc/aweme/social/creation/record/viewmodel/component/CameraViewControlBridge;", 0), new C2217381BqS(C1660390tJF.class, "shootTabApi", "getShootTabApi()Lcom/ss/android/ugc/aweme/social/creation/record/bottom/ShootTopAndBottomRootApiComponent;", 0), new C2217381BqS(C1660390tJF.class, "socialCameraApi", "getSocialCameraApi()Lcom/ss/android/ugc/aweme/social/creation/record/launch/component/SocialCameraApiComponent;", 0)};
        LLJLIL = new Object() { // from class: X.0t18
        };
        LLJLL = 8;
        LLJLLIL = 77.0f;
        LLJLLL = 14.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(144.0f)) << 32) | (((long) Float.floatToRawIntBits(192.0f)) & 4294967295L);
        LLJZ = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) * 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) * 2.0f)) & 4294967295L);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1653870t8j.REVEAL.getTag());
        sbLIZ.append("Small");
        LLJZIJLIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    private final InterfaceC1655310tB3 K4() {
        return (InterfaceC1655310tB3) this.LLJJIII.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final C1658340tFw O4() {
        return (C1658340tFw) this.LLJJJJ.getValue(this, LLJLILLLLZIIL[6]);
    }

    private final InterfaceC1646220swO P4() {
        return (InterfaceC1646220swO) this.LLJILLL.getValue(this, LLJLILLLLZIIL[0]);
    }

    private final InterfaceC1452360nti Z4() {
        return (InterfaceC1452360nti) this.LLJJI.getValue(this, LLJLILLLLZIIL[2]);
    }

    private final InterfaceC1650150t2j d5() {
        return (InterfaceC1650150t2j) this.LLJJJJLIIL.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final InterfaceC1659790tIH k5() {
        return (InterfaceC1659790tIH) this.LLJJL.getValue(this, LLJLILLLLZIIL[8]);
    }

    public final e0 H4() {
        return (e0) this.LLJJ.getValue(this, LLJLILLLLZIIL[1]);
    }

    public final C578810Mn1 T4() {
        return (C578810Mn1) this.LLJJJJJIL.getValue();
    }

    public final void d6() {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1660410tJH(this, null), 3);
    }

    public final Activity getActivity() {
        return (Activity) this.LLJJIJI.getValue(this, LLJLILLLLZIIL[4]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJJIJIIJIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    @Override // X.InterfaceC1650310t2z
    public void re0() {
        if (this.LLJJJIL) {
            return;
        }
        getShortVideoContext().creativeModel.storyModel.setRevealCameraMode(k5().UP().getValue().booleanValue() ? "front" : "back");
        C5();
        show();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1660400tJG(this, null), 3);
    }

    public final void D5() {
        View view;
        SurfaceView surfaceViewLJIJJLI;
        InterfaceC1452360nti interfaceC1452360ntiZ4 = Z4();
        Object parent = (interfaceC1452360ntiZ4 == null || (surfaceViewLJIJJLI = interfaceC1452360ntiZ4.LJIJJLI()) == null) ? null : surfaceViewLJIJJLI.getParent();
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            view.setZ(0.0f);
        }
        H4().Cd(false, C1DPV.LIZIZ.LIZIZ(C1DPW.SWITCH_CAMERA_TOOL_BAR_DEFAULT, null), "reveal_story_auto");
        P4().uF2(C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_9_16, false), LLJZIJLIL, EnumC1653870t8j.REVEAL.getTag(), EnumC2008807tu.TAB_CHANGED);
    }

    public final void R5() {
        P4().uF2(C1660530tJT.LJFF(EnumC1660550tJV.VIDEO_MODE, EnumC1448590nnd.RATIO_3_4, false), EnumC1653870t8j.REVEAL.getTag(), LLJZIJLIL, EnumC2008807tu.TAB_CHANGED);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1660440tJK> o2() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1660460tJM> w2() {
        return this.LLJL;
    }

    private final void F4(View view) {
        FrameLayout frameLayout;
        boolean z;
        ViewParent parent = view.getParent();
        if ((parent instanceof FrameLayout) && (frameLayout = (FrameLayout) parent) != null) {
            Context context = frameLayout.getContext();
            if (H4().LJLJJLL() == 1) {
                z = true;
            } else {
                z = false;
            }
            ComposeView composeView = new ComposeView(context, null, 6);
            composeView.setContent(new C19719212De(199734770, new C1667210tUF(z), true));
            frameLayout.addView(composeView);
            n5(composeView);
            LifecycleOwnerExtensionsKt.LIZIZ(this, 500L, new ARunnableS94S0200000_25(this, frameLayout, 11));
            HandlerHook.viewPostDelay(composeView, new ARunnableS94S0200000_25(this, composeView, 12), 2000L);
        }
    }

    private final Pair<FrameLayout.LayoutParams, Float> v5(View view) {
        FrameLayout.LayoutParams layoutParamsLIZ;
        float fLIZIZ;
        C1447460nlo c1447460nlo;
        Float f;
        ViewGroup.LayoutParams layoutParams = H4().fF2().getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams) || (layoutParamsLIZ = (FrameLayout.LayoutParams) layoutParams) == null) {
            layoutParamsLIZ = C1658600tGM.LIZ(view.getContext());
        }
        ViewOutlineProvider outlineProvider = H4().fF2().getOutlineProvider();
        if ((outlineProvider instanceof C1447460nlo) && (c1447460nlo = (C1447460nlo) outlineProvider) != null && (f = c1447460nlo.LIZ) != null) {
            fLIZIZ = f.floatValue();
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(20.0f));
        }
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(layoutParamsLIZ));
        C1447470nlp.LIZIZ(view, fLIZIZ);
        return new Pair<>(layoutParamsLIZ, Float.valueOf(fLIZIZ));
    }

    public final void H5(View view) {
        this.LLJJJ = v5(view);
    }

    @Override // X.InterfaceC1648820t0a
    public void IR0(boolean z) {
        if (z) {
            show();
        } else {
            hide();
        }
    }

    public final void M5(C1695920uEY c1695920uEY) {
        long j = LLJZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))))));
        layoutParams.gravity = 8388659;
        C426750GoL.LJIIJ(layoutParams, c1695920uEY.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(LLJLLL)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(LLJLLIL)))), 0, 0, 32);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1695920uEY);
        c1695920uEY.setLayoutParams(layoutParams);
        c1695920uEY.setRoundCorners(C1669050tXD.LIZIZ(40.0f));
    }

    public final void N5(Bitmap bitmap) {
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParamsLIZ;
        float fLIZIZ;
        FrameLayout.LayoutParams first;
        SurfaceView surfaceViewLJIJJLI;
        InterfaceC1452360nti interfaceC1452360ntiZ4 = Z4();
        ViewParent parent = null;
        if (interfaceC1452360ntiZ4 != null && (surfaceViewLJIJJLI = interfaceC1452360ntiZ4.LJIJJLI()) != null) {
            parent = surfaceViewLJIJJLI.getParent();
        }
        if ((parent instanceof FrameLayout) && (viewGroup = (ViewGroup) parent) != null) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(viewGroup.getContext());
            try {
                appCompatImageView.setImageBitmap(bitmap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Pair<? extends FrameLayout.LayoutParams, Float> pair = this.LLJJJ;
            if (pair != null && (first = pair.getFirst()) != null) {
                layoutParamsLIZ = new FrameLayout.LayoutParams(first);
            } else {
                layoutParamsLIZ = C1658600tGM.LIZ(viewGroup.getContext());
            }
            C786410Ut5.h6(appCompatImageView, layoutParamsLIZ);
            Pair<? extends FrameLayout.LayoutParams, Float> pair2 = this.LLJJJ;
            if (pair2 != null) {
                fLIZIZ = pair2.getSecond().floatValue();
            } else {
                fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(20.0f));
            }
            C1447470nlp.LIZIZ(appCompatImageView, fLIZIZ);
            viewGroup.addView(appCompatImageView);
        }
    }

    public final void n5(View view) {
        int iLIZIZ;
        int iLIZIZ2;
        C1683130ttv value = K4().EB().getValue();
        int iLIZIZ3 = ((int) value.LIZIZ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(LLJLLIL)));
        if (view.getLayoutDirection() == 1) {
            iLIZIZ = (int) value.LIZ;
            iLIZIZ2 = ((int) value.LIZJ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(LLJLLL)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(LLJLLL))) + ((int) value.LIZ);
            iLIZIZ2 = (int) value.LIZJ;
        }
        if (view.getParent() instanceof FrameLayout) {
            long j = LLJZ;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))))));
            layoutParams.setMargins(iLIZIZ, iLIZIZ3, iLIZIZ2, 0);
            C786410Ut5.W5(view, layoutParams);
            C1447470nlp.LIZIZ(view, C418440Gaw.LIZIZ(Float.valueOf(40.0f)));
        }
    }

    public final void t5(View view) {
        this.LLJJIJIL = view.getZ();
        view.setZ(999.0f);
    }

    public final void x5(View view) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(new C1698380uIW(CoroutineExceptionHandler.LJJLIL, this, 0))), null, null, new C1660430tJJ(view, this, null), 3);
    }

    @Override // X.InterfaceC1648820t0a
    public void yI0(View view) {
        n5(view);
        if ((view instanceof SurfaceView) || (view instanceof TextureView)) {
            F4(view);
        }
    }

    public C1660390tJF(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1646220swO.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1452360nti.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1655310tB3.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C1658340tFw.class, null);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 376));
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650150t2j.class, null);
        this.LLJJL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1659790tIH.class, null);
        this.LLJJLIIIJLLLLLLLZ = AFwS214S0000000_25.get$arr$(190);
        this.LLJL = new AwS569S0100000_25(this, 377);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S5(boolean r9, X.InterfaceC1364105Vn<? super android.graphics.Bitmap> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1660420tJI
            if (r0 == 0) goto L21
            r7 = r10
            X.0tJI r7 = (X.C1660420tJI) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L2f
            if (r0 != r5) goto L27
            goto L5b
        L21:
            X.0tJI r7 = new X.0tJI
            r7.<init>(r8, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            X.0Mn1 r3 = r8.T4()     // Catch: java.lang.Exception -> L67
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r8.getShortVideoContext()     // Catch: java.lang.Exception -> L67
            if (r9 == 0) goto L58
            X.0nnd r1 = X.EnumC1448590nnd.RATIO_3_4     // Catch: java.lang.Exception -> L67
        L3e:
            r0 = 0
            kotlin.Pair r0 = r3.LJIIIIZZ(r2, r0, r4, r1)     // Catch: java.lang.Exception -> L67
            java.lang.Object r1 = r0.getFirst()     // Catch: java.lang.Exception -> L67
            X.0957 r1 = (X.AnonymousClass0957) r1     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r0.getSecond()     // Catch: java.lang.Exception -> L67
            X.0957 r0 = (X.AnonymousClass0957) r0     // Catch: java.lang.Exception -> L67
            r7.LLILLL = r5     // Catch: java.lang.Exception -> L67
            java.lang.Object r1 = r1.LJLIIIL(r7)     // Catch: java.lang.Exception -> L67
            if (r1 != r6) goto L5e
            goto L5a
        L58:
            r1 = r4
            goto L3e
        L5a:
            return r6
        L5b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L67
        L5e:
            X.0HZe r1 = (X.C443120HZe) r1     // Catch: java.lang.Exception -> L67
            java.lang.Object r0 = r1.getFirst()     // Catch: java.lang.Exception -> L67
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L67
            return r0
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C2344809Gs.LJI(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1660390tJF.S5(boolean, X.05Vn):java.lang.Object");
    }
}
