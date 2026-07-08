package X;

import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;

/* JADX INFO: renamed from: X.1ACd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175491ACd {
    public View LIZ;
    public final boolean LIZIZ;
    public final C1474170oSt LIZJ;

    public final void LIZ() {
        if (SurfaceViewAndroid10Workaround.INSTANCE.removeTransLogic()) {
            return;
        }
        View view = this.LIZ;
        if ((view instanceof SurfaceView) && (view.getParent() instanceof ViewGroup)) {
            int i = Resources.getSystem().getDisplayMetrics().heightPixels;
            ((View) this.LIZ.getParent()).getTranslationX();
            C786410Ut5.Gc(i * 5.0f, (ViewGroup) this.LIZ.getParent());
            ((View) this.LIZ.getParent()).getTranslationX();
        }
    }

    public final InterfaceC464060IHs LIZIZ() {
        KeyEvent.Callback callback = this.LIZ;
        if (callback instanceof InterfaceC464060IHs) {
            return (InterfaceC464060IHs) callback;
        }
        return null;
    }

    public final void LIZJ(ViewGroup.LayoutParams layoutParams) {
        if (this.LIZ.getContext() != null) {
            if (layoutParams.height != 0 || layoutParams.width != 0) {
                C786410Ut5.W5(this.LIZ, layoutParams);
            }
        }
    }

    public final void LIZLLL(boolean z) {
        C1474170oSt c1474170oSt = this.LIZJ;
        if (c1474170oSt != null && c1474170oSt.LJFF.booleanValue()) {
            c1474170oSt.LJIIIZ = z;
        }
    }

    public final void LJFF(float f) {
        KeyEvent.Callback callback = this.LIZ;
        if ((callback instanceof InterfaceC464060IHs) && callback != null) {
            ((InterfaceC464060IHs) callback).setTargetScaleResolution(f);
        }
    }

    public C2175491ACd(View view, boolean z) {
        this.LIZ = view;
        this.LIZIZ = z;
        SurfaceViewAndroid10Workaround surfaceViewAndroid10Workaround = SurfaceViewAndroid10Workaround.INSTANCE;
        if (surfaceViewAndroid10Workaround.isProxyPreviewPositionChangeListenerOfSurfaceView() && Build.VERSION.SDK_INT == 29 && (this.LIZ instanceof SurfaceView)) {
            C1474170oSt c1474170oSt = new C1474170oSt();
            this.LIZJ = c1474170oSt;
            c1474170oSt.LIZIZ((SurfaceView) this.LIZ);
        }
        if (surfaceViewAndroid10Workaround.isHardWareBlockModels()) {
            this.LIZ.setLayerType(1, null);
        }
    }

    public static void LJ(C2175491ACd c2175491ACd, int i) {
        KeyEvent.Callback callback = c2175491ACd.LIZ;
        if ((callback instanceof InterfaceC464060IHs) && callback != null) {
            ((InterfaceC464060IHs) callback).LIZJ(i, "");
        }
    }
}
