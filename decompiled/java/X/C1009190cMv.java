package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009190cMv {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(372));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(373));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(374));

    public static ViewGroup LIZ(Activity activity) {
        Object c098200Yq;
        Object obj = null;
        if (activity == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) activity.findViewById(R.id.a8u);
        try {
            if (viewStub == null) {
                c098200Yq = (FrameLayout) activity.findViewById(R.id.interaction_fe_full_container);
            } else {
                viewStub.setLayoutResource(R.layout.d5y);
                c098200Yq = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        FrameLayout frameLayout = (FrameLayout) obj;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        return frameLayout;
    }
}
