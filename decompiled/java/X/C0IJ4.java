package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0IJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJ4 {
    public static long LIZ = -1;
    public static final /* synthetic */ int LIZIZ = 0;

    public static long LIZIZ() {
        if (LIZ <= 0) {
            LIZ = UserService.getInstance().user().getCurrentUserId();
        }
        return LIZ;
    }

    public static final void LIZ(long j) {
        Boolean bool = C0IJ3.LIZ;
        Boolean bool2 = C0IJ3.LIZ;
        if (bool2 != null && bool2.booleanValue() && C0IJ3.LIZLLL == 0) {
            C0IJ3.LJFF.add(Long.valueOf(j));
        }
    }
}
