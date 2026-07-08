package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0IIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIJ {
    public String LIZ;
    public C11JF LIZIZ;

    public final void LIZ(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_switch_resolution_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(this.LIZ, "current_resolution");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
