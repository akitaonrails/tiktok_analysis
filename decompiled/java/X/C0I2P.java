package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0I2P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I2P {
    public static final C0I2P LIZ = new C0I2P();

    public static void LIZ(int i, long j, long j2, boolean z, int i2, int i3) {
        int i4;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ(Scene.SCENE_SERVICE, "ai_sticker");
        if (z) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0lab.LIZ(i4, "success");
        c0lab.LIZIZ(j, "duration_ms");
        if (z) {
            c0lab.LIZ(i, "image_width");
            c0lab.LIZ(i2, "image_height");
            c0lab.LIZIZ(j2, "data_bytes");
        } else {
            c0lab.LIZ(i3, "error_code");
        }
        C20684815ws.LJIILLIIL("download_aigc_image", c0lab.LIZ);
    }
}
