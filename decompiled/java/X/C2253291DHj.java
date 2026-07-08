package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.asve.recorder.camera.VECameraController;

/* JADX INFO: renamed from: X.1DHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253291DHj implements C1DIN {
    public final Context LIZ;
    public final C2253301DHk LIZIZ;

    @Override // X.C1DIN
    public final boolean Af() {
        return this.LIZIZ.LJ();
    }

    @Override // X.C1DIN
    public final boolean LIZ() {
        return this.LIZIZ.LIZJ;
    }

    @Override // X.C1DIN
    public final int LIZIZ() {
        this.LIZIZ.LIZIZ();
        return 1;
    }

    @Override // X.C1DIN
    public final void LJ() {
        this.LIZIZ.getClass();
    }

    @Override // X.C1DIN
    public final int LJI() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.C1DIN
    public final boolean db() {
        return this.LIZIZ.LIZIZ && LJII();
    }

    @Override // X.C1DIN
    public final boolean n() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.C1DIN
    public final void onCameraOpenSuccess() {
        this.LIZIZ.getClass();
    }

    @Override // X.C1DIN
    public final boolean LJII() {
        if (!Af()) {
            LIZLLL(false);
            return false;
        }
        int i = C2206701BYe.LIZ(this.LIZ).LIZ.getInt("key_camera_wide_mode", 0);
        if (i != 0) {
            return i == 1;
        }
        this.LIZIZ.getClass();
        C2216191BoX.LIZ.getClass();
        C2216191BoX.LIZIZ().getClass();
        LIZLLL(false);
        return false;
    }

    public static boolean LJIIIZ(Context context) {
        if (C2206701BYe.LIZ(context).LIZ.getInt("key_camera_wide_mode", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C1DIN
    public final boolean K(boolean z) {
        return this.LIZIZ.LIZLLL(z);
    }

    @Override // X.C1DIN
    public final void LIZJ(Cert cert) {
        C2216191BoX.LIZ.getClass();
        this.LIZIZ.LJFF(cert);
    }

    @Override // X.C1DIN
    public final void LIZLLL(boolean z) {
        int i;
        C2206691BYd c2206691BYdLIZ = C2206701BYe.LIZ(this.LIZ);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        c2206691BYdLIZ.LIZ.edit().putInt("key_camera_wide_mode", i).apply();
    }

    @Override // X.C1DIN
    public final float LJFF(float f) {
        this.LIZIZ.getClass();
        return f;
    }

    @Override // X.C1DIN
    public final boolean LJIIIIZZ(boolean z) {
        if (this.LIZIZ.LIZLLL(z) && LJII()) {
            return true;
        }
        return false;
    }

    public C2253291DHj(Context context, VECameraController vECameraController, C2253301DHk c2253301DHk) {
        this.LIZ = context;
        if (c2253301DHk != null) {
            this.LIZIZ = c2253301DHk;
        } else {
            this.LIZIZ = new C2253301DHk();
        }
        this.LIZIZ.getClass();
        C2253301DHk c2253301DHk2 = this.LIZIZ;
        c2253301DHk2.LIZ = vECameraController;
        c2253301DHk2.LIZJ(LJII());
    }
}
