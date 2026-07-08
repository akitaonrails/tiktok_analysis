package X;

import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;

/* JADX INFO: renamed from: X.1DKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254221DKy implements C1DKZ {
    public final CameraComponentModel LIZ;
    public boolean LIZIZ;
    public float LIZJ = 4.0f;
    public EnumC1778480wNi LIZLLL = EnumC1778480wNi.AS_ENCODE_PROFILE_MAIN;
    public int LJ = 15;
    public final String LJFF = "";

    @Override // X.C1DKZ
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.C1DKZ
    public final float LJFF() {
        return 1.0f;
    }

    @Override // X.C1DKZ
    public final boolean LIZJ() {
        return this.LIZ.mHardEncode == 1;
    }

    @Override // X.C1DKZ
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C1DKZ
    public final float LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.C1DKZ
    public final EnumC1778480wNi LJ() {
        return this.LIZLLL;
    }

    @Override // X.C1DKZ
    public final int LJI() {
        return this.LJ;
    }

    @Override // X.C1DKZ
    public final String LJII() {
        return this.LJFF;
    }

    public C2254221DKy(CameraComponentModel cameraComponentModel) {
        this.LIZ = cameraComponentModel;
    }
}
