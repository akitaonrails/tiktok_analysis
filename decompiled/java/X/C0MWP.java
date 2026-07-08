package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0MWP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0MWP implements InterfaceC21498119Bj<Scene> {
    public int LIZ;

    public C0MWP(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC21498119Bj
    public final boolean LIZ(Scene scene) {
        int i = this.LIZ;
        if (i <= 0) {
            return false;
        }
        this.LIZ = i - 1;
        return true;
    }
}
