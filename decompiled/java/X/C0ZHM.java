package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ZHM, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZHM {
    public static final DmNoticeProxy LIZ = DmNoticeProxyImpl.LIZJ();

    public static C0Z4P LIZ(Context context) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
        layoutParams.gravity = 8388613;
        C426750GoL.LJIIJ(layoutParams, context, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, 50);
        C0Z4P c0z4p = new C0Z4P(context, layoutParams);
        C786410Ut5.LJLLLLLL(0, c0z4p.LIZ);
        C10VP.LIZIZ(c0z4p.LIZ);
        LIZ.Y0((TuxAlertBadgeLayout) c0z4p.LIZ.findViewById(R.id.h7i));
        return c0z4p;
    }
}
