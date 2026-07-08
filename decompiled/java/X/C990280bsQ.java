package X;

import android.app.Activity;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.profile.ui.uiinterface.IAdProfileLayoutService;
import com.ss.android.ugc.profile.business.ur.AdProfileLayoutServiceImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990280bsQ {
    public static C1035340d36 LIZ(Activity activity) {
        C1035340d36 c1035340d36;
        FrameLayout frameLayoutLIZIZ = LIZIZ(activity);
        if (frameLayoutLIZIZ != null) {
            c1035340d36 = (C1035340d36) frameLayoutLIZIZ.findViewById(R.id.aai);
        } else {
            c1035340d36 = null;
        }
        if (!(c1035340d36 instanceof C1035340d36)) {
            return null;
        }
        return c1035340d36;
    }

    public static FrameLayout LIZIZ(Activity activity) {
        IAdProfileLayoutService iAdProfileLayoutService;
        Object objLIZ = C04TD.LIZ(IAdProfileLayoutService.class, false);
        if (objLIZ != null) {
            iAdProfileLayoutService = (IAdProfileLayoutService) objLIZ;
        } else {
            if (C04TD.F6 == null) {
                synchronized (IAdProfileLayoutService.class) {
                    if (C04TD.F6 == null) {
                        C04TD.F6 = new AdProfileLayoutServiceImpl();
                    }
                }
            }
            iAdProfileLayoutService = C04TD.F6;
        }
        ViewStub viewStubLIZ = iAdProfileLayoutService.LIZ(activity);
        if (viewStubLIZ == null) {
            return (FrameLayout) activity.findViewById(R.id.aat);
        }
        viewStubLIZ.setLayoutResource(R.layout.ehv);
        return (FrameLayout) C786410Ut5.LJLLLL(viewStubLIZ);
    }
}
