package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.19BE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19BE implements InterfaceC21499419Bw {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ Scene LIZIZ;

    @Override // X.InterfaceC21499419Bw
    public final C195F LIZ() {
        if (this.LIZ == 0) {
            return null;
        }
        return C195F.LJ(this.LIZ, this.LIZIZ.requireActivity());
    }

    public C19BE(Scene scene, int i) {
        this.LIZ = i;
        this.LIZIZ = scene;
    }
}
