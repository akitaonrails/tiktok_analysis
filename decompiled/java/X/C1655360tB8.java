package X;

import android.content.res.Configuration;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import lgo.a;
import mn3.e0;
import nv7.c0;

/* JADX INFO: renamed from: X.0tB8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1655360tB8 implements InterfaceC1655690tBf, InterfaceC1655700tBg, InterfaceC1655620tBY, InterfaceC1888407aU {
    public final C19EG LIZ;
    public final ShortVideoContext LIZIZ;
    public final TikTokCameraBaseGroupScene LIZJ;
    public final Function0<e0> LIZLLL;
    public final Function0<Boolean> LJ;
    public DisplayManager LJFF;
    public C1655370tB9 LJI;
    public int LJII;

    @Override // X.InterfaceC1888407aU
    public final InterfaceC1939907in LIZ() {
        return null;
    }

    @Override // X.InterfaceC1888407aU
    public final void LIZJ(boolean z) {
    }

    @Override // X.InterfaceC1655620tBY
    public final void LJ() {
    }

    @Override // X.InterfaceC1655620tBY
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.InterfaceC1888407aU
    public final void LIZLLL() {
        boolean z = !this.LIZIZ.creativeModel.initialModel.dmCameraModel.enterFromDM && C312180CLo.LIZ();
        boolean z2 = C1462920oAk.LIZ;
        C1462920oAk.LJFF(this.LIZ, z);
        C578100Mls.LIZIZ(this.LIZ);
        c0 c0Var = c0.LIZ;
        CameraComponentModel cameraComponentModel = this.LIZIZ.cameraComponentModel;
        c0Var.t2(cameraComponentModel.mVideoWidth, cameraComponentModel.mVideoHeight);
    }

    @Override // X.InterfaceC1655620tBY
    public final boolean LJFF() {
        if (this.LIZJ.LLLLLLZ() == null) {
            return this.LIZIZ.LJJJJLL();
        }
        return false;
    }

    public final int LJI() {
        Display display = Build.VERSION.SDK_INT >= 30 ? this.LIZ.getDisplay() : C2204961BRm.LLILZIL(this.LIZ.getWindowManager(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhicuLioMQGfX20qa4867kgN1ZOc2EojF6H43ASjAZeE/Rznr98BZG5LtiYCQ=", null));
        if (display != null) {
            return display.getRotation();
        }
        return 0;
    }

    @Override // X.InterfaceC1888407aU
    public final void LIZIZ(boolean z) {
        View decorView;
        C578100Mls.LIZIZ(this.LIZ);
        if (this.LIZIZ.duetFromUser != null) {
            return;
        }
        Window window = this.LIZ.getWindow();
        if (Build.VERSION.SDK_INT >= 28 && (window == null || (decorView = window.getDecorView()) == null || decorView.getRootWindowInsets() == null)) {
            return;
        }
        e0 e0VarInvoke = this.LIZLLL.invoke();
        InterfaceC2254001DKc mediaController = e0VarInvoke.St2().getMediaController();
        float f = C20246714Kb.LIZ;
        mediaController.k5(C20246714Kb.LIZ((ViewGroup.MarginLayoutParams) e0VarInvoke.getPreviewView().getLayoutParams(), window, z));
    }

    @Override // X.InterfaceC1655700tBg
    public final void dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.LIZIZ.actionDownTime = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1655690tBf
    public final void onConfigurationChanged(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        a.LIZIZ.recordService().LIZ();
        e0 e0VarInvoke = this.LIZLLL.invoke();
        if (this.LJ.invoke().booleanValue() && C12VA.LIZ().LJIIJJI.invoke().booleanValue()) {
            e0VarInvoke.St2().getCameraController().s4().Q3();
        }
    }

    public C1655360tB8(C19EG c19eg, ShortVideoContext shortVideoContext, TikTokCameraBaseGroupScene tikTokCameraBaseGroupScene, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        this.LIZ = c19eg;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = tikTokCameraBaseGroupScene;
        this.LIZLLL = awS569S0100000_25;
        this.LJ = awS569S0100000_252;
    }
}
