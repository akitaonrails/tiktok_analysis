package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;

/* JADX INFO: renamed from: X.0UVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVZ {
    public static final C773300UVc LIZ() {
        if (C771670UOv.LIZLLL == null && !LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            C771670UOv.LIZLLL = new C773300UVc();
        }
        return C771670UOv.LIZLLL;
    }
}
