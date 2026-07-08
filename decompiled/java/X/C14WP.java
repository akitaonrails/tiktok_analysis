package X;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraMainFragment;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.ab.PipoNativeCameraConfigSettings;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14WP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14WP extends C14WL {
    public static int LLILZLL;
    public static Bitmap LLIZ;
    public static int LLJ;
    public static CompletionBlock<C14WM> LLJI;
    public static C19EG LLJIJIL;
    public static boolean LLJILJILJ;
    public C14WT LLILLL;
    public static String LLILZ = "";
    public static String LLILZIL = "";
    public static String LLIZLLLIL = "";
    public static String LLJILJIL = "back";
    public static boolean LLJILLL = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.14WT, X.1A5s] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        Activity activityLIZLLL;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        OnBackPressedDispatcher onBackPressedDispatcher;
        C14WK c14wk = (C14WK) xBaseParamModel;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            PipoNativeCameraConfigSettings.PipoNativeCameraConfigModel pipoNativeCameraConfigModel = PipoNativeCameraConfigSettings.LIZ;
            PipoNativeCameraConfigSettings.PipoNativeCameraConfigModel pipoNativeCameraConfigModel2 = (PipoNativeCameraConfigSettings.PipoNativeCameraConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_native_camera_config", PipoNativeCameraConfigSettings.PipoNativeCameraConfigModel.class, pipoNativeCameraConfigModel);
            if (pipoNativeCameraConfigModel2 != null) {
                pipoNativeCameraConfigModel = pipoNativeCameraConfigModel2;
            }
            if (Intrinsics.LJFF(pipoNativeCameraConfigModel.isUseNativeCamera, Boolean.TRUE)) {
                boolean zIsNeedPreview = c14wk.isNeedPreview();
                Map<String, String> map = C14WS.LIZ;
                map.put("session_id", String.valueOf(C19994513Lb.LIZ(1).nextInt()));
                map.put("need_preview", String.valueOf(zIsNeedPreview));
                map.put("enter_timestamp", String.valueOf(System.currentTimeMillis()));
                LLJI = completionBlock;
                LLJ = c14wk.getCompressQuality().intValue();
                String cameraType = c14wk.getCameraType();
                if (cameraType == null) {
                    cameraType = "back";
                }
                LLJILJIL = cameraType;
                LLJILJILJ = c14wk.isNeedPreview();
                if (Intrinsics.LJFF(LLJILJIL, "back")) {
                    map.put("camera_type", "back");
                } else {
                    map.put("camera_type", "front");
                }
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    activityLIZLLL = interfaceC634840OvC.LIZLLL();
                } else {
                    activityLIZLLL = null;
                }
                if (activityLIZLLL instanceof C19EG) {
                    c19eg = (C19EG) activityLIZLLL;
                } else {
                    c19eg = null;
                }
                LLJIJIL = c19eg;
                if (c19eg == null) {
                    C2382909Vj.LIZ(completionBlock, -1, "The owner activity is not a fragment activity", null, 4);
                    return;
                }
                final AwS431S0200000_30 awS431S0200000_30 = new AwS431S0200000_30(this, (C14WP) completionBlock, (CompletionBlock<C14WM>) 19);
                if (c14wk.getNestedHost()) {
                    final NativeCameraMainFragment nativeCameraMainFragment = new NativeCameraMainFragment();
                    LLJILLL = false;
                    ?? r1 = new AbstractC2173821A5s() { // from class: X.14WT
                        @Override // X.AbstractC2173821A5s
                        public final void LIZIZ() {
                            FragmentManager supportFragmentManager2;
                            C19EH c19ehLJIIJ2;
                            if (C14WP.LLJILLL) {
                                return;
                            }
                            C14WT c14wt = this.LIZLLL.LLILLL;
                            if (c14wt != null) {
                                c14wt.LJ();
                            }
                            this.LIZLLL.LLILLL = null;
                            NativeCameraMainFragment nativeCameraMainFragment2 = nativeCameraMainFragment;
                            if (nativeCameraMainFragment2.LLJI) {
                                C14WU.LIZ("camera_permission_result", C2097908Jt.LIZJ(new Pair("permission_result", "denied")));
                                Pair[] pairArr = new Pair[3];
                                pairArr[0] = new Pair("cancel_reason", "permission_denied_exit");
                                C14WV c14wv = nativeCameraMainFragment2.LLJILLL;
                                pairArr[1] = new Pair("peak_memory_usage", String.valueOf(c14wv != null ? c14wv.LIZ().get("peak_memory_usage") : null));
                                C14WV c14wv2 = nativeCameraMainFragment2.LLJILLL;
                                pairArr[2] = new Pair("peak_cpu_usage", String.valueOf(c14wv2 != null ? c14wv2.LIZ().get("peak_cpu_usage") : null));
                                C14WU.LIZ("camera_cancel", C2097608Jq.LJIIIIZZ(pairArr));
                                C14WQ.LIZ(-6, new Exception("User denied camera permission access"));
                                C14WP.LLJILLL = true;
                                C19EG activity = nativeCameraMainFragment2.getActivity();
                                if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null && (c19ehLJIIJ2 = supportFragmentManager2.LJIIJ()) != null) {
                                    c19ehLJIIJ2.LJIIZILJ(nativeCameraMainFragment2);
                                    c19ehLJIIJ2.LJIIJ();
                                }
                            } else {
                                Pair[] pairArr2 = new Pair[3];
                                pairArr2[0] = new Pair("cancel_reason", "back_click");
                                C14WV c14wv3 = nativeCameraMainFragment2.LLJILLL;
                                pairArr2[1] = new Pair("peak_memory_usage", String.valueOf(c14wv3 != null ? c14wv3.LIZ().get("peak_memory_usage") : null));
                                C14WV c14wv4 = nativeCameraMainFragment2.LLJILLL;
                                pairArr2[2] = new Pair("peak_cpu_usage", String.valueOf(c14wv4 != null ? c14wv4.LIZ().get("peak_cpu_usage") : null));
                                C14WU.LIZ("camera_cancel", C2097608Jq.LJIIIIZZ(pairArr2));
                                C14WQ.LIZIZ(nativeCameraMainFragment2);
                            }
                            C14WP.LLJILLL = true;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(true);
                        }
                    };
                    this.LLILLL = r1;
                    C19EG c19eg2 = LLJIJIL;
                    if (c19eg2 != null && (onBackPressedDispatcher = c19eg2.getOnBackPressedDispatcher()) != 0) {
                        onBackPressedDispatcher.LIZIZ(r1);
                    }
                    nativeCameraMainFragment.LLJ = new AwS431S0200000_30(awS431S0200000_30, nativeCameraMainFragment, 18);
                    C19EG c19eg3 = LLJIJIL;
                    if (c19eg3 != null && (supportFragmentManager = c19eg3.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                        c19ehLJIIJ.LIZIZ(R.id.content, nativeCameraMainFragment);
                        c098200Yq = Integer.valueOf(c19ehLJIIJ.LJIIJ());
                    } else {
                        c098200Yq = null;
                    }
                } else {
                    SmartRouter.buildRoute(LLJIJIL, "//pipo/veritas/client/native_camera").open(0, new OnActivityResultCallback() { // from class: X.14WR
                        @Override // com.bytedance.router.OnActivityResultCallback
                        public final void onActivityResult(int i, int i2, Intent intent) {
                            if (i2 == -1) {
                                awS431S0200000_30.invoke();
                            } else {
                                C2382909Vj.LIZ(completionBlock, -1, "failed when open activity page", null, 4);
                            }
                        }
                    });
                    c098200Yq = Unit.LIZ;
                }
            } else {
                C2382909Vj.LIZ(completionBlock, -1, "Native camera usage is off", null, 4);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Internal error: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2382909Vj.LIZ(completionBlock, -1, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
