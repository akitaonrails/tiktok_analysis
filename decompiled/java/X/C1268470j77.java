package X;

import com.ss.ttlivestreamer.core.utils.AVLog;

/* JADX INFO: renamed from: X.0j77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268470j77 {
    public final /* synthetic */ C1268630j7N LIZ;

    public C1268470j77(C1268630j7N c1268630j7N) {
        this.LIZ = c1268630j7N;
    }

    public final void LIZ(int i, int i2) {
        if (i == 1) {
            this.LIZ.LJJLIIIIJ(301, i2, 0);
            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_DESTROYED  from livecore");
        } else if (i == 2) {
            this.LIZ.LJJLIIIIJ(302, i2, 0);
            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_WILL_BE_CREATED  from livecore");
        } else {
            if (i != 3) {
                return;
            }
            C1266530j3z.LIZ.onEvent(EnumC1269710j97.HOST_PREVIEW_FIRST_FRAME);
        }
    }
}
