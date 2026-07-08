package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.amg.minigameruntime.api.IClientLogger;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.InitParams;
import com.bytedance.amg.minigameruntime.api.MiniGameRuntimeManager;
import com.bytedance.amg.minigameruntime.api.RefreshParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1304490k3D extends FrameLayout {
    public static final /* synthetic */ int LLJ = 0;
    public SurfaceView LL;
    public View LLILLJJLI;
    public IMiniGameRuntimeAPI LLILLL;
    public C1304240k2o LLILZ;
    public WeakReference<Activity> LLILZIL;
    public IClientAdapterService LLILZLL;
    public EnumC1304510k3F LLIZ;
    public final C1304520k3G LLIZLLLIL;

    public final InterfaceC1304530k3H getStateCallback() {
        return null;
    }

    public final void setStateCallback(InterfaceC1304530k3H interfaceC1304530k3H) {
    }

    public final void LJ() {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LLILLL;
        if (iMiniGameRuntimeAPI != null) {
            IMiniGameRuntimeAPI.DefaultImpls.onExit$default(iMiniGameRuntimeAPI, null, 1, null);
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILLL = null;
        this.LLILZ = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = EnumC1304510k3F.DESTROYED;
    }

    public final void LIZ() {
        Pair pairLIZ = C1304540k3I.LIZ(getContext());
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        SurfaceView surfaceView = new SurfaceView(C786410Ut5.N3(getContext()));
        C786410Ut5.U5(surfaceView, new FrameLayout.LayoutParams(-1, -1));
        surfaceView.getHolder().setFixedSize(iIntValue, iIntValue2);
        surfaceView.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824));
        surfaceView.layout(0, 0, iIntValue, iIntValue2);
        this.LL = surfaceView;
        View view = new View(getContext());
        view.setBackgroundColor(R.attr.cacheColorHint);
        this.LLILLJJLI = view;
    }

    public final SurfaceView getEngineView() {
        return this.LL;
    }

    public final IClientAdapterService getLastAdapter() {
        return this.LLILZLL;
    }

    public final IMiniGameRuntimeAPI getRuntime() {
        return this.LLILLL;
    }

    public final InterfaceC1177504j7 getRuntimeCallback() {
        return this.LLILZ;
    }

    public final EnumC1304510k3F getState() {
        return this.LLIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0k3G] */
    public C1304490k3D(Context context) {
        super(context, null, 0);
        this.LLIZ = EnumC1304510k3F.IDLE;
        this.LLIZLLLIL = new IClientLogger() { // from class: X.0k3G
            @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
            public final void d(String str, String str2) {
                int i = C2187451AjH.LIZ;
            }

            @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
            public final void e(String str, String str2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ(str, str2);
            }

            @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
            public final void i(String str, String str2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI(str, str2);
            }

            @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
            public final void v(String str, String str2) {
                int i = C2187451AjH.LIZ;
            }

            @Override // com.bytedance.amg.minigameruntime.api.IClientLogger
            public final void w(String str, String str2) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LIZ(str, str2);
            }
        };
    }

    public static void LIZLLL(C1304490k3D c1304490k3D) {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = c1304490k3D.LLILLL;
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.onPause(null);
        }
        if (c1304490k3D.LLIZ == EnumC1304510k3F.LAUNCHED) {
            c1304490k3D.LLIZ = EnumC1304510k3F.PAUSED;
        }
    }

    public final IMiniGameRuntimeAPI LIZIZ(C1304500k3E c1304500k3E) {
        if (this.LLIZ != EnumC1304510k3F.INITIALIZED) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createRuntime called in invalid state: ");
            sbLIZ.append(this.LLIZ);
            C1720106oR.LIZ("MiniGameRenderView", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        SurfaceView surfaceView = this.LL;
        if (surfaceView == null) {
            return null;
        }
        InitParams initParams = new InitParams(c1304500k3E.LIZ);
        initParams.setAPPNameName(c1304500k3E.LIZJ);
        initParams.setAppVersion(c1304500k3E.LIZLLL);
        initParams.setMSdkVersion(c1304500k3E.LJ);
        initParams.setIsDebugLocateJSMode(c1304500k3E.LJFF);
        initParams.setJSEngineType(c1304500k3E.LJI);
        IMiniGameRuntimeAPI iMiniGameRuntimeAPICreateMiniGameRuntime = MiniGameRuntimeManager.Companion.createMiniGameRuntime(initParams, c1304500k3E.LIZIZ, surfaceView);
        this.LLILLL = iMiniGameRuntimeAPICreateMiniGameRuntime;
        if (iMiniGameRuntimeAPICreateMiniGameRuntime != null) {
            this.LLILZ = new C1304240k2o(iMiniGameRuntimeAPICreateMiniGameRuntime);
            ABSetting aBSetting = c1304500k3E.LJII;
            if (aBSetting != null) {
                try {
                    iMiniGameRuntimeAPICreateMiniGameRuntime.registerABValue(aBSetting);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("registerABValue error: ");
                    sbLIZ2.append(e);
                    C1720106oR.LIZ("MiniGameRenderView", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        this.LLIZ = EnumC1304510k3F.RUNTIME_CREATED;
        return this.LLILLL;
    }

    public final void LJI(JSONObject jSONObject) {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LLILLL;
        if (iMiniGameRuntimeAPI != null) {
            iMiniGameRuntimeAPI.onResume(jSONObject);
        }
        if (this.LLIZ == EnumC1304510k3F.PAUSED) {
            this.LLIZ = EnumC1304510k3F.LAUNCHED;
        }
    }

    public final void LIZJ(IClientAdapterService iClientAdapterService, IMiniGameRuntimeAPI.LaunchResultListener launchResultListener) {
        IMiniGameRuntimeAPI iMiniGameRuntimeAPI = this.LLILLL;
        if (iMiniGameRuntimeAPI == null) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("MiniGameRenderView", "launch called but runtime is null");
            launchResultListener.onFailed(new IllegalStateException("Runtime not created. Call createRuntime first."));
        } else {
            this.LLILZLL = iClientAdapterService;
            iMiniGameRuntimeAPI.onLaunch(iClientAdapterService, launchResultListener);
            this.LLIZ = EnumC1304510k3F.LAUNCHED;
        }
    }

    public final void LJFF(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, Activity activity, IClientAdapterService iClientAdapterService) {
        this.LLILLL = iMiniGameRuntimeAPI;
        this.LLILZ = new C1304240k2o(iMiniGameRuntimeAPI);
        this.LLILZIL = new WeakReference<>(activity);
        this.LLILZLL = iClientAdapterService;
        RefreshParams refreshParams = new RefreshParams();
        refreshParams.setActivity(activity);
        refreshParams.setSurfaceView(this.LL);
        refreshParams.setClientAdapter(iClientAdapterService);
        iMiniGameRuntimeAPI.refresh(refreshParams);
        this.LLIZ = EnumC1304510k3F.LAUNCHED;
    }
}
