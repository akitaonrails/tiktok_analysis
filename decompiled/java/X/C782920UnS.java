package X;

import Y.ARunnableS112S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.dataChannel.BottomTabGroupVisiblityChannel;
import com.bytedance.android.livesdk.dataChannel.StickerDialogShowChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastResizePreviewOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastReuseSurfaceView;
import com.bytedance.android.livesdk.livesetting.performance.LiveSmoothActivityUIBugFix;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782920UnS extends C19A3 implements C0UKH, InterfaceC1655130tAl {
    public static final /* synthetic */ int LLJJL = 0;
    public final InterfaceC775460UbQ LLJILLL;
    public final boolean LLJJ;
    public final C1DRG LLJJI;
    public InterfaceC782930UnT LLJJIII;
    public C783790Uor LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public boolean LLJJJJ;
    public C769960UIg LLJJJJJIL;
    public boolean LLJJJ = true;
    public boolean LLJJJIL = true;
    public final ARunnableS112S0100000_12 LLJJJJLIIL = new ARunnableS112S0100000_12(this, 401);

    @Override // X.C0UKH
    public final void LJL(Boolean bool) {
    }

    @Override // X.InterfaceC1655130tAl
    public final void onHide() throws Throwable {
        Fragment fragment;
        this.LLJJJIL = false;
        InterfaceC782930UnT interfaceC782930UnT = this.LLJJIII;
        if (interfaceC782930UnT != null && (fragment = interfaceC782930UnT.getFragment()) != null) {
            fragment.setUserVisibleHint(false);
        }
        LLLLIL();
    }

    @Override // X.InterfaceC1655130tAl
    public final void onShow() throws Throwable {
        Fragment fragment;
        this.LLJJJIL = true;
        InterfaceC782930UnT interfaceC782930UnT = this.LLJJIII;
        if (interfaceC782930UnT != null && (fragment = interfaceC782930UnT.getFragment()) != null) {
            fragment.setUserVisibleHint(true);
        }
        LLLLILI();
    }

    @Override // X.C0UKH
    public final void LJJIJLIJ() {
        C473410IhP.LJ(this.LLJJJJLIIL);
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJJLIIL;
        C782940UnU.LIZ.getClass();
        C473410IhP.LIZJ(aRunnableS112S0100000_12, C782940UnU.LIZIZ() ? 100L : 500L);
    }

    public final void LLLLIL() {
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        C0UJY c0ujyKs;
        C19EG c19egLIZIZ;
        SurfaceView surfaceViewLLLLIILL;
        C19EG c19egLIZIZ2;
        SurfaceView surfaceViewLLLLIILL2;
        Fragment fragment;
        if (this.LLJJ) {
            InterfaceC782930UnT interfaceC782930UnT = this.LLJJIII;
            boolean z = false;
            if (interfaceC782930UnT != null && (fragment = interfaceC782930UnT.getFragment()) != null && fragment.isAdded()) {
                z = true;
            }
            if (!z) {
                Context sceneContext = getSceneContext();
                if (sceneContext == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(sceneContext)) == null || (surfaceViewLLLLIILL2 = LLLLIILL(c19egLIZIZ2)) == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, surfaceViewLLLLIILL2);
                return;
            }
            Context sceneContext2 = getSceneContext();
            if (sceneContext2 != null && (c19egLIZIZ = C1388190mED.LIZIZ(sceneContext2)) != null && (surfaceViewLLLLIILL = LLLLIILL(c19egLIZIZ)) != null) {
                C786410Ut5.LJLLLLLL(8, surfaceViewLLLLIILL);
            }
        }
        InterfaceC782930UnT interfaceC782930UnT2 = this.LLJJIII;
        if (interfaceC782930UnT2 != null) {
            interfaceC782930UnT2.iq();
        }
        InterfaceC782930UnT interfaceC782930UnT3 = this.LLJJIII;
        if (interfaceC782930UnT3 != null && (c0ujyKs = interfaceC782930UnT3.ks()) != null) {
            c0ujyKs.closeCamera(C0UPU.LIZ());
        }
        if (LiveSmoothActivityUIBugFix.enable()) {
            Activity activity = this.mActivity;
            if (!(activity instanceof LiveMultiTabWrapperActivity) || (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity) == null) {
                return;
            }
            FrameLayout frameLayout = liveMultiTabWrapperActivity.LLILZIL;
            if (frameLayout != null) {
                frameLayout.setBackground(liveMultiTabWrapperActivity.LLILZLL);
            }
            liveMultiTabWrapperActivity.LLILZLL = null;
        }
    }

    public final void LLLLILI() {
        DataChannel dataChannel;
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity;
        Integer numLIZJ;
        Fragment fragment;
        C19EG c19egLIZIZ;
        SurfaceView surfaceViewLLLLIILL;
        if (this.LLJJ) {
            InterfaceC782930UnT interfaceC782930UnT = this.LLJJIII;
            if (interfaceC782930UnT == null || (fragment = interfaceC782930UnT.getFragment()) == null || !fragment.isAdded() || !this.LLJJJIL) {
                return;
            }
            Context sceneContext = getSceneContext();
            if (sceneContext != null && (c19egLIZIZ = C1388190mED.LIZIZ(sceneContext)) != null && (surfaceViewLLLLIILL = LLLLIILL(c19egLIZIZ)) != null) {
                C786410Ut5.LJLLLLLL(0, surfaceViewLLLLIILL);
            }
        }
        InterfaceC782930UnT interfaceC782930UnT2 = this.LLJJIII;
        if (interfaceC782930UnT2 != null) {
            interfaceC782930UnT2.QO();
        }
        if (LiveSmoothActivityUIBugFix.enable()) {
            Activity activity = this.mActivity;
            if ((activity instanceof LiveMultiTabWrapperActivity) && (liveMultiTabWrapperActivity = (LiveMultiTabWrapperActivity) activity) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e1, liveMultiTabWrapperActivity)) != null) {
                int iIntValue = numLIZJ.intValue();
                FrameLayout frameLayout = liveMultiTabWrapperActivity.LLILZIL;
                liveMultiTabWrapperActivity.LLILZLL = frameLayout != null ? frameLayout.getBackground() : null;
                FrameLayout frameLayout2 = liveMultiTabWrapperActivity.LLILZIL;
                if (frameLayout2 != null) {
                    frameLayout2.setBackgroundColor(iIntValue);
                }
            }
        }
        if (this.LLJJJ) {
            this.LLJJJ = false;
            InterfaceC782930UnT interfaceC782930UnT3 = this.LLJJIII;
            if (interfaceC782930UnT3 != null && (dataChannel = interfaceC782930UnT3.getDataChannel()) != null) {
                InterfaceC782930UnT interfaceC782930UnT4 = this.LLJJIII;
                dataChannel.BQ2(interfaceC782930UnT4 != null ? interfaceC782930UnT4.getFragment() : null, StickerDialogShowChannel.class, new AwS591S0100000_12(this, 1037));
                InterfaceC782930UnT interfaceC782930UnT5 = this.LLJJIII;
                dataChannel.BQ2(interfaceC782930UnT5 != null ? interfaceC782930UnT5.getFragment() : null, BottomTabGroupVisiblityChannel.class, new AwS591S0100000_12(this, 1038));
            }
        }
        C782940UnU.LIZ.getClass();
        if (C782940UnU.LIZ() && C782940UnU.LIZJ()) {
            LLLLIIIILLL(getSceneContext(), null, C782940UnU.LIZJ());
        }
    }

    @Override // X.C0UKH
    public final void LLLJIL() {
        C19EG c19egLIZIZ;
        SurfaceView surfaceViewLLLLIILL;
        Context sceneContext = getSceneContext();
        if (sceneContext == null || (c19egLIZIZ = C1388190mED.LIZIZ(sceneContext)) == null || (surfaceViewLLLLIILL = LLLLIILL(c19egLIZIZ)) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, surfaceViewLLLLIILL);
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        super.onDestroyView();
        IHostCreativeTool iHostCreativeTool = C520010KaN.LIZ;
        if (iHostCreativeTool == null || !iHostCreativeTool.UC0()) {
            Activity activity = this.mActivity;
            if (activity == null || (c19egLIZIZ = C1388190mED.LIZIZ(activity)) == null) {
                return;
            } else {
                supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            }
        } else {
            supportFragmentManager = C20622515mp.LJIIL(this);
        }
        if (supportFragmentManager == null || (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("LivePreviewTabScene")) == null) {
            return;
        }
        C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
        c19ehLJIIJ.LJIIL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(this, 890);
        if (this.LLJJIJIIJIL) {
            awS556S0100000_12.invoke();
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C775470UbR(this, awS556S0100000_12, null), 2);
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.scene.Scene
    public final void onStop() {
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SurfaceView LLLLIILL(C19EG c19eg) {
        InterfaceC782970UnX interfaceC782970UnX;
        InterfaceC782970UnX interfaceC782970UnX2;
        if (this.LLJJ) {
            C1DRG c1drg = this.LLJJI;
            if (c1drg == null || (interfaceC782970UnX2 = (InterfaceC782970UnX) c1drg.LJIIL(null, InterfaceC782970UnX.class)) == null) {
                return null;
            }
            return interfaceC782970UnX2.LJLIIIL();
        }
        if (!(c19eg instanceof InterfaceC782970UnX) || (interfaceC782970UnX = (InterfaceC782970UnX) c19eg) == null) {
            return null;
        }
        return interfaceC782970UnX.LJLIIIL();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.LLJJ) {
            C1834150xpV.LIZ(this.mActivity, false);
        }
        this.LLJJIJIIJIL = false;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        Map<String, Object> map = C1338270kvh.LIZ;
        super.onCreate(bundle);
    }

    public C782920UnS(InterfaceC775460UbQ interfaceC775460UbQ, boolean z, C1DRG c1drg) {
        this.LLJILLL = interfaceC775460UbQ;
        this.LLJJ = z;
        this.LLJJI = c1drg;
    }

    public final void LLLLIIIILLL(Context context, SurfaceView surfaceView, boolean z) {
        C19EG c19egLIZIZ;
        float fLIZ;
        boolean z2;
        SurfaceView surfaceViewLLLLIILL = surfaceView;
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            if (surfaceViewLLLLIILL == null && (surfaceViewLLLLIILL = LLLLIILL(c19egLIZIZ)) == null) {
                return;
            }
            if (LiveBroadcastReuseSurfaceView.getEnableIndependentPage() || LiveBroadcastResizePreviewOpt.enable()) {
                C1271250jBb c1271250jBb = C1271270jBd.LIZ;
                if (c1271250jBb.LJFF(2)) {
                    fLIZ = c1271250jBb.LIZLLL();
                } else {
                    C769220UFk c769220UFk = C769220UFk.LIZ;
                    int iLJI = C14KS.LJI(context);
                    int iLJ = C14KS.LJ(context);
                    c769220UFk.getClass();
                    fLIZ = C769220UFk.LIZ(iLJI, iLJ);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adapt ttlh resolution, new: ");
                sbLIZ.append(fLIZ);
                sbLIZ.append(", last go live ratio: ");
                sbLIZ.append(InterfaceC772190UQv.Y2.LIZ());
                C20441214yg.LIZIZ("LivePreviewTabScene", C2188811AlT.LIZIZ(sbLIZ));
                C769220UFk c769220UFk2 = C769220UFk.LIZ;
                C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
                if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C769220UFk.LIZIZ(c769220UFk2, context, surfaceViewLLLLIILL, null, null, z2, fLIZ, false, z, 64);
            }
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context;
        if (this.LLJJ) {
            context = requireSceneContext();
        } else {
            context = layoutInflater.getContext();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.oq3);
        frameLayout.setFitsSystemWindows(false);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, layoutInflater.getContext());
        if (numLIZJ != null) {
            frameLayout.setBackgroundColor(numLIZJ.intValue());
        }
        C1324720kZq c1324720kZq = new C1324720kZq(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C786410Ut5.u6(c1324720kZq, layoutParams);
        c1324720kZq.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c1324720kZq.setPlaceholderImage(new ColorDrawable(C497740JfY.LIZJ(R.attr.ezq)));
        c1324720kZq.setPlaceholderImageScaleType(InterfaceC1320380kSq.LJI);
        this.LLJJIJIL = c1324720kZq;
        frameLayout.addView(c1324720kZq);
        C1324570kZb.LJII(UserService.getInstance().user().LJIJJLI().getAvatarThumb(), C497740JfY.LJIIZILJ(), C497740JfY.LJIILLIIL(), new C1291830jin(C497740JfY.LJIIZILJ() / C497740JfY.LJIILLIIL()), new InterfaceC1324590kZd() { // from class: X.0UnV
            @Override // X.InterfaceC1324590kZd
            public final void onFailed() {
            }

            @Override // X.InterfaceC1324590kZd
            public final void LIZ(Bitmap bitmap) {
                C1324720kZq c1324720kZq2 = this.LIZ.LLJJIJIL;
                if (c1324720kZq2 != null) {
                    c1324720kZq2.setImageBitmap(bitmap);
                }
            }
        });
        return frameLayout;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
