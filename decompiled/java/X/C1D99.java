package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.1D99, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D99 implements InterfaceC2187111Aij {
    @Override // X.InterfaceC2187111Aij
    public final Integer LIZ() {
        return Integer.valueOf(Keva.getRepo("DefaultCameraFacingStore").getInt("default_camera_facing", 1));
    }

    @Override // X.InterfaceC2187111Aij
    public final void LIZIZ(int i) {
        Keva.getRepo("DefaultCameraFacingStore").storeInt("default_camera_facing", i);
    }
}
