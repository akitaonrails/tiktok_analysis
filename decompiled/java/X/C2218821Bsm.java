package X;

import com.ss.android.vesdk.VESensorInfoHolder;

/* JADX INFO: renamed from: X.1Bsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218821Bsm implements InterfaceC2218811Bsl {
    public static final C2218821Bsm LIZIZ = new C2218821Bsm();
    public static final VESensorInfoHolder LIZJ = VESensorInfoHolder.getInstance();

    static {
        InterfaceC2218811Bsl.LIZ.getClass();
    }

    @Override // X.InterfaceC2218811Bsl
    public final void LIZ(boolean z) {
        LIZJ.setSensorMode(z);
    }

    @Override // X.InterfaceC2218811Bsl
    public final void LIZIZ(float[] fArr) {
        LIZJ.setFov(fArr);
    }

    @Override // X.InterfaceC2218811Bsl
    public final void LIZJ(float[] fArr, double d) {
        LIZJ.setRotationSensorInfo(fArr, d);
    }
}
