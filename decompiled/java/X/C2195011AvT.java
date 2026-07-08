package X;

import Y.ARunnableS134S0100000_34;
import Y.ARunnableS61S0300000_28;
import Y.ARunnableS82S0200000_13;
import Y.ARunnableS85S0200000_16;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.bytedance.amg.minigameruntime.api.ScreenShotData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS118S1000000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195011AvT implements InterfaceC1006410cIR {
    public final C1304490k3D LIZ;
    public C2194981AvQ LIZJ;
    public AwS118S1000000_34 LIZLLL;
    public volatile SchemaParserData LJ;
    public volatile boolean LJFF;
    public volatile boolean LJI;
    public SurfaceView LJIIJJI;
    public ViewGroup LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public volatile C1777860wMi LJIILLIIL;
    public FrameLayout LJIIZILJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIJ;
    public volatile boolean LJIJI;
    public String LIZIZ = "";
    public final ARunnableS134S0100000_34 LJII = new ARunnableS134S0100000_34(this, 60);
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<InterfaceC1006900cJE> LJIIIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1006420cIS> LJIIJ = new CopyOnWriteArrayList<>();
    public long LJIIL = -1;
    public final Object LJIJJ = new Object();
    public EnumC1006650cIp LJIJJLI = EnumC1006650cIp.IN_PROGRESS;
    public final Object LJIL = new Object();
    public volatile int LJJ = -1;

    @Override // X.InterfaceC1006410cIR
    public final void LIZIZ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIJ;
        FrameLayout frameLayout = this.LJIIZILJ;
        this.LJIJ = null;
        this.LJIIZILJ = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null && frameLayout == null) {
            return;
        }
        ARunnableS61S0300000_28 aRunnableS61S0300000_28 = new ARunnableS61S0300000_28(frameLayout, sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, this.LJIILIIL, 9);
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS61S0300000_28.run();
        } else {
            C786410Ut5.LJJZZIII(this.LJIIIIZZ, aRunnableS61S0300000_28);
        }
    }

    @Override // X.InterfaceC1006410cIR
    public final void LIZJ() {
        this.LJIIIIZZ.removeCallbacks(this.LJII);
        this.LJFF = true;
        this.LJI = false;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markForegroundHandoff: cacheKey=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1006410cIR
    public final ScreenShotData LJFF() {
        synchronized (this.LJIJJ) {
            try {
                if (this.LJIILL) {
                    return null;
                }
                IMiniGameRuntimeAPI runtime = this.LIZ.getRuntime();
                return runtime != null ? runtime.screenshot() : null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL() {
        IMiniGameRuntimeAPI runtime = this.LIZ.getRuntime();
        long j = this.LJIIL;
        if (j < 0 || runtime == null) {
            return;
        }
        runtime.removeDownStreamSurface("miniGame", j);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeDownStreamSurface: id=");
        sbLIZ.append(this.LJIIL);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIL = -1L;
    }

    public final void LJIILIIL() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        if (this.LJIILL || this.LIZIZ.length() == 0) {
            return;
        }
        ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
        C2195201Avm c2195201AvmLJFF = C2195161Avi.LJFF(this.LIZIZ);
        if (c2195201AvmLJFF == null) {
            return;
        }
        List<JSONObject> listLIZIZ = c2195201AvmLJFF.LIZIZ();
        if (listLIZIZ.isEmpty() || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIJ) == null) {
            return;
        }
        try {
            InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
            if (kitView == null) {
                return;
            }
            Iterator<JSONObject> it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                try {
                    kitView.LIZ("minis.console", it2.next());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("replayCachedVConsoleLogs sendEvent failed: ");
                    sbLIZ.append(e.getMessage());
                    C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("replayCachedVConsoleLogs getKitView failed: ");
            sbLIZ2.append(e2.getMessage());
            C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1006410cIR
    public final void destroy() {
        synchronized (this.LJIJJ) {
            try {
                if (this.LJIILL) {
                    return;
                }
                this.LJIILL = true;
                this.LJIIIIZZ.removeCallbacks(this.LJII);
                this.LJFF = false;
                this.LJI = false;
                if (this.LIZIZ.length() > 0) {
                    ConcurrentHashMap<String, C2195171Avj> concurrentHashMap = C2195161Avi.LIZ;
                    C2195161Avi.LJI(this.LIZIZ);
                }
                AwS118S1000000_34 awS118S1000000_34 = this.LIZLLL;
                if (awS118S1000000_34 != null) {
                    awS118S1000000_34.invoke();
                }
                this.LIZLLL = null;
                LJ();
                LIZIZ();
                this.LJIILLIIL = null;
                this.LJIJI = false;
                this.LJIIIZ.clear();
                this.LJIIJ.clear();
                ARunnableS134S0100000_34 aRunnableS134S0100000_34 = new ARunnableS134S0100000_34(this, 59);
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    aRunnableS134S0100000_34.run();
                } else {
                    C786410Ut5.LJJZZIII(this.LJIIIIZZ, aRunnableS134S0100000_34);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1006410cIR
    public final void pause() {
        if (this.LJIILL) {
            return;
        }
        if (!this.LJFF) {
            this.LJI = false;
            C1304490k3D.LIZLLL(this.LIZ);
            return;
        }
        this.LJI = true;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause deferred: handoff active, will replay on clear, cacheKey=");
        sbLIZ.append(this.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1006410cIR
    public final void resume() throws JSONException {
        JSONObject jSONObject;
        String str;
        if (this.LJIILL) {
            return;
        }
        if (this.LJFF) {
            this.LJI = false;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume deferred: handoff active, pending pause cleared, cacheKey=");
            sbLIZ.append(this.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LJI = false;
        C1304490k3D c1304490k3D = this.LIZ;
        SchemaParserData schemaParserData = this.LJ;
        if (schemaParserData == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams == null || (str = tiktokMinisQueryParams.enterFrom) == null) {
                str = "";
            }
            jSONObject.put(Scene.SCENE_SERVICE, str);
            C1543800qHC c1543800qHC = C1543800qHC.LIZ;
            Map<String, String> mapLJ = schemaParserData.paramsMap;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c1543800qHC.getClass();
            jSONObject.put("query", C1543800qHC.LIZJ(mapLJ));
        }
        c1304490k3D.LJI(jSONObject);
    }

    @Override // X.InterfaceC1006410cIR
    public final void LJ() {
        LIZIZ();
        LJIIL();
        SurfaceView surfaceView = this.LJIIJJI;
        ViewGroup viewGroup = this.LJIILIIL;
        this.LJIIJJI = null;
        this.LJIILIIL = null;
        if (surfaceView == null || viewGroup == null) {
            return;
        }
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJJLZIJ(surfaceView, viewGroup);
        } else {
            C786410Ut5.LJJZZIII(this.LJIIIIZZ, new ARunnableS82S0200000_13(surfaceView, viewGroup, 66));
        }
    }

    @Override // X.InterfaceC1006410cIR
    public final EnumC1006650cIp LIZ() {
        return this.LJIJJLI;
    }

    public C2195011AvT(C1304490k3D c1304490k3D) {
        this.LIZ = c1304490k3D;
    }

    @Override // X.InterfaceC1006410cIR
    public final void LIZLLL(C1006430cIT c1006430cIT) {
        this.LJIIIZ.add(c1006430cIT);
    }

    @Override // X.InterfaceC1006410cIR
    public final void LJI(final ViewGroup viewGroup) {
        if (this.LJIILL) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZ("MiniGameRenderImpl", "bindToView called after destroy");
            return;
        }
        LJ();
        Pair pairLIZ = C1304540k3I.LIZ(viewGroup.getContext());
        final int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        final int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        SurfaceView surfaceView = new SurfaceView(viewGroup.getContext());
        viewGroup.addView(surfaceView, new ViewGroup.LayoutParams(-1, -1));
        surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.1AvS
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                IMiniGameRuntimeAPI runtime = this.LL.LIZ.getRuntime();
                if (runtime == null) {
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LIZ("MiniGameRenderImpl", "surfaceCreated but runtime is null");
                } else {
                    this.LL.LJIIJJI(runtime, surfaceHolder, viewGroup, iIntValue, iIntValue2, "surfaceCreated");
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                this.LL.LJIIL();
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
                IMiniGameRuntimeAPI runtime = this.LL.LIZ.getRuntime();
                if (runtime == null) {
                    return;
                }
                long j = this.LL.LJIIL;
                if (j >= 0) {
                    runtime.removeDownStreamSurface("miniGame", j);
                    this.LL.LJIIL = -1L;
                }
                this.LL.LJIIJJI(runtime, surfaceHolder, viewGroup, iIntValue, iIntValue2, "surfaceChanged");
            }
        });
        this.LJIIJJI = surfaceView;
        this.LJIILIIL = viewGroup;
    }

    @Override // X.InterfaceC1006410cIR
    public final void LJII(ViewGroup viewGroup) {
        C1777860wMi c1777860wMi;
        Activity activityLIZ;
        ViewGroup viewGroup2;
        String simpleName;
        if (this.LJIILL || (c1777860wMi = this.LJIILLIIL) == null) {
            return;
        }
        Context context = viewGroup.getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ == null) {
            if (context != null) {
                simpleName = context.getClass().getSimpleName();
            } else {
                simpleName = "null";
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showVConsole skipped: container.context is not an Activity (ctx=");
            sbLIZ.append(simpleName);
            sbLIZ.append(')');
            C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        LIZIZ();
        try {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            C1547430qN3 c1547430qN3 = C1547430qN3.LIZ;
            String str = c1777860wMi.LIZ;
            C1547470qN7 c1547470qN7 = c1777860wMi.LIZIZ;
            c1547430qN3.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL = C1547430qN3.LJIILL(activityLIZ, str, c1547470qN7);
            ViewParent parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL, viewGroup2);
            }
            frameLayout.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL, new ViewGroup.LayoutParams(-1, -1));
            C786410Ut5.LLLLIIIILLL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL, 0);
            this.LJIIZILJ = frameLayout;
            this.LJIJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJIILL;
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("vConsole attached for clientKey=");
            sbLIZ2.append(c1777860wMi.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (this.LJIJI) {
                this.LJIJI = false;
                LJIILIIL();
                try {
                    C1304490k3D c1304490k3D = this.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    IMiniGameRuntimeAPI iMiniGameRuntimeAPI = c1304490k3D.LLILLL;
                    if (iMiniGameRuntimeAPI != null) {
                        iMiniGameRuntimeAPI.emitJSAPIEvent("onVConsoleReady", jSONObject);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("vConsole flush pending onVConsoleReady failed: ");
                    sbLIZ3.append(e.getMessage());
                    C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("showVConsole failed: ");
            sbLIZ4.append(e2.getMessage());
            C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ4));
            FrameLayout frameLayout2 = this.LJIIZILJ;
            this.LJIJ = null;
            this.LJIIZILJ = null;
            if (frameLayout2 != null && frameLayout2.getParent() == viewGroup) {
                C786410Ut5.LJJJLZIJ(frameLayout2, viewGroup);
            }
        }
    }

    @Override // X.InterfaceC1006410cIR
    public final void LJIIIIZZ(C1006430cIT c1006430cIT) {
        this.LJIIIZ.remove(c1006430cIT);
    }

    public final void LJIIJ(EnumC1007130cJb enumC1007130cJb) {
        if (this.LJIILL) {
            return;
        }
        synchronized (this.LJIL) {
            try {
                if (enumC1007130cJb.ordinal() <= this.LJJ) {
                    return;
                }
                this.LJJ = enumC1007130cJb.ordinal();
                C786410Ut5.LJJZZIII(this.LJIIIIZZ, new ARunnableS85S0200000_16(this, enumC1007130cJb, 39));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ(final int i, final String str, final boolean z) {
        EnumC1006650cIp enumC1006650cIp;
        if (z) {
            enumC1006650cIp = EnumC1006650cIp.LOAD_COMPLETE;
        } else {
            enumC1006650cIp = EnumC1006650cIp.FAIL;
        }
        this.LJIJJLI = enumC1006650cIp;
        C786410Ut5.LJJZZIII(this.LJIIIIZZ, new Runnable() { // from class: X.0cJD
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MiniGameRenderImpl@d7c2.notifyLoadComplete$1");
                try {
                    CopyOnWriteArrayList<InterfaceC1006900cJE> copyOnWriteArrayList = this.LL.LJIIIZ;
                    boolean z2 = z;
                    int i2 = i;
                    String str2 = str;
                    Iterator<InterfaceC1006900cJE> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(i2, str2, z2);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MiniGameRenderImpl@d7c2.notifyLoadComplete$1");
            }
        });
    }

    public final void LJIIJJI(IMiniGameRuntimeAPI iMiniGameRuntimeAPI, SurfaceHolder surfaceHolder, ViewGroup viewGroup, int i, int i2, String str) {
        RectF rectF;
        if (i > 0 && i2 > 0) {
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            int iWidth = surfaceFrame.width();
            int iHeight = surfaceFrame.height();
            if (iWidth > 0 && iHeight > 0) {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                if (width > 0 && height > 0) {
                    rectF = new RectF(0.0f, 0.0f, C13LZ.LIZLLL(width / i, 0.0f, 1.0f), C13LZ.LIZLLL(height / i2, 0.0f, 1.0f));
                } else {
                    rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                }
                this.LJIIL = iMiniGameRuntimeAPI.addDownStreamSurface("miniGame", surfaceHolder.getSurface(), iWidth, iHeight, EnumC1285200jY6.SCALE_TO_FILL_WITH_SOURCE_CROP, rectF, 60);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("addDownStreamSurface[");
                sbLIZ.append(str);
                sbLIZ.append("]: id=");
                sbLIZ.append(this.LJIIL);
                sbLIZ.append(" buffer=");
                sbLIZ.append(iWidth);
                sbLIZ.append('x');
                sbLIZ.append(iHeight);
                sbLIZ.append(" sourceRect=(");
                sbLIZ.append(rectF.left);
                sbLIZ.append(',');
                sbLIZ.append(rectF.top);
                sbLIZ.append(',');
                sbLIZ.append(rectF.right);
                sbLIZ.append(',');
                sbLIZ.append(rectF.bottom);
                sbLIZ.append(')');
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("registerCroppedDownstream[");
            sbLIZ2.append(str);
            sbLIZ2.append("]: invalid buffer ");
            sbLIZ2.append(iWidth);
            sbLIZ2.append('x');
            sbLIZ2.append(iHeight);
            sbLIZ2.append(", deferring");
            C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        int i5 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("registerCroppedDownstream[");
        sbLIZ3.append(str);
        sbLIZ3.append("]: invalid canvas ");
        sbLIZ3.append(i);
        sbLIZ3.append('x');
        sbLIZ3.append(i2);
        C1720106oR.LIZ("MiniGameRenderImpl", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
