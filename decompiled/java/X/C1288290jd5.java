package X;

import Y.ARunnableS89S0200000_20;
import android.app.Activity;
import android.graphics.Rect;
import android.view.SurfaceView;
import com.bytedance.amg.minigameruntime.api.ABSetting;
import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.lynx.canvas.KryptonApp;
import com.lynx.canvas.KryptonViewAdaptor;
import com.lynx.canvas.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288290jd5 implements InterfaceC1304030k2T {
    public WeakReference<Activity> LIZ;
    public WeakReference<SurfaceView> LIZIZ;
    public KryptonViewAdaptor LIZJ;
    public int LIZLLL;
    public int LJ;
    public float LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final Vector<InterfaceC1288300jd6> LJIILIIL;
    public final Vector<InterfaceC1288310jd7> LJIILJJIL;
    public final C1288320jd8 LJIILL;
    public WeakReference<IClientAdapterService> LJIILLIIL;
    public float LJI = 1.0f;
    public String LJIIL = "zh_CN";

    @Override // X.InterfaceC1304030k2T
    public final void LIZLLL() {
        KryptonViewAdaptor kryptonViewAdaptor = this.LIZJ;
        if (kryptonViewAdaptor != null) {
            kryptonViewAdaptor.LIZJ.LIZJ();
        }
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJII() {
        SurfaceView surfaceView;
        String appLanguage;
        IClientAdapterService iClientAdapterService;
        IClientAdapterService iClientAdapterService2;
        Rect safeArea;
        IClientAdapterService iClientAdapterService3;
        Activity activity = this.LIZ.get();
        if (activity == null || (surfaceView = this.LIZIZ.get()) == null) {
            return;
        }
        float f = activity.getResources().getDisplayMetrics().density;
        this.LJFF = this.LJI * f;
        double d = 1.0d / ((double) f);
        int width = surfaceView.getWidth();
        if (width < 1) {
            width = activity.getResources().getDisplayMetrics().widthPixels;
        }
        int height = surfaceView.getHeight();
        if (height < 1) {
            height = activity.getResources().getDisplayMetrics().heightPixels;
        }
        this.LIZLLL = (int) (((double) width) * d);
        this.LJ = (int) (((double) height) * d);
        WeakReference<IClientAdapterService> weakReference = this.LJIILLIIL;
        this.LJIIJJI = (weakReference == null || (iClientAdapterService3 = weakReference.get()) == null) ? 0 : iClientAdapterService3.getStatusBarHeight();
        WeakReference<IClientAdapterService> weakReference2 = this.LJIILLIIL;
        if (weakReference2 == null || (iClientAdapterService2 = weakReference2.get()) == null || (safeArea = iClientAdapterService2.getSafeArea()) == null) {
            this.LJII = (int) (((double) surfaceView.getTop()) * d);
            this.LJIIIIZZ = (int) (((double) surfaceView.getBottom()) * d);
            this.LJIIIZ = (int) (((double) surfaceView.getLeft()) * d);
            this.LJIIJ = (int) (((double) surfaceView.getRight()) * d);
        } else {
            this.LJII = safeArea.top;
            this.LJIIIIZZ = safeArea.bottom;
            this.LJIIIZ = safeArea.left;
            this.LJIIJ = safeArea.right;
        }
        WeakReference<IClientAdapterService> weakReference3 = this.LJIILLIIL;
        if (weakReference3 == null || (iClientAdapterService = weakReference3.get()) == null || (appLanguage = iClientAdapterService.getAppLanguage()) == null) {
            appLanguage = "zh_CN";
        }
        this.LJIIL = appLanguage;
    }

    @Override // X.InterfaceC1304030k2T
    public final Activity getActivity() {
        return this.LIZ.get();
    }

    @Override // X.InterfaceC1304030k2T
    public final int LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIIIZZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1304030k2T
    public final int LJIIJJI() {
        return this.LJII;
    }

    @Override // X.InterfaceC1304030k2T
    public final String getAppLanguage() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1304030k2T
    public final float getDensity() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getHeight() {
        return this.LJ;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getStatusBarHeight() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1304030k2T
    public final int getWidth() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1304030k2T
    public final void LIZ(C1303980k2O c1303980k2O) {
        this.LJIILJJIL.add(c1303980k2O);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LIZIZ(SurfaceView surfaceView) {
        if (surfaceView == null || Intrinsics.LJFF(surfaceView, this.LIZIZ.get())) {
            return;
        }
        this.LIZIZ = new WeakReference<>(surfaceView);
        LJII();
        Iterator<InterfaceC1288310jd7> it2 = this.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJ(IClientAdapterService iClientAdapterService) {
        this.LJIILLIIL = new WeakReference<>(iClientAdapterService);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJFF(Activity activity) {
        if (activity == null || Intrinsics.LJFF(activity, this.LIZ.get())) {
            return;
        }
        this.LIZ = new WeakReference<>(activity);
        Iterator<InterfaceC1288300jd6> it2 = this.LJIILIIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJI(KryptonApp kryptonApp) {
        kryptonApp.LJIIJ(b.class, this.LJIILL);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIIJ(C1303980k2O c1303980k2O) {
        this.LJIILJJIL.remove(c1303980k2O);
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIIL(ABSetting aBSetting) {
        boolean z;
        C1288320jd8 c1288320jd8 = this.LJIILL;
        c1288320jd8.getClass();
        c1288320jd8.LJIIJ = aBSetting.getUsePrefFrameRate();
        float f = aBSetting.reduceRenderDprAtViewInit;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            z = true;
        } else {
            z = false;
        }
        float fLIZLLL = 1.0f;
        if (z) {
            fLIZLLL = C13LZ.LIZLLL(f, 0.1f, 1.0f);
        }
        this.LJI = fLIZLLL;
        LJII();
    }

    @Override // X.InterfaceC1304030k2T
    public final void LJIILIIL(KryptonApp kryptonApp) {
        Activity activity = this.LIZ.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new ARunnableS89S0200000_20(kryptonApp, this, 6));
    }

    public C1288290jd5(Activity activity, SurfaceView surfaceView) {
        this.LIZ = new WeakReference<>(activity);
        this.LIZIZ = new WeakReference<>(surfaceView);
        Vector<InterfaceC1288300jd6> vector = new Vector<>();
        this.LJIILIIL = vector;
        this.LJIILJJIL = new Vector<>();
        this.LJIILL = new C1288320jd8();
        Iterator<InterfaceC1288300jd6> it2 = vector.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        LJII();
        Iterator<InterfaceC1288310jd7> it3 = this.LJIILJJIL.iterator();
        while (it3.hasNext()) {
            it3.next().LIZ();
        }
    }
}
