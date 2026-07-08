package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0K3W, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3W extends FrameLayout {
    public View LL;
    public int LLILLJJLI;

    public static C0K77 LIZ() {
        Object c098200Yq;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            c098200Yq = iLiveOuterService != null ? iLiveOuterService.C3() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (C0K77) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public C0K3W(Context context, AttributeSet attributeSet) {
        Object c098200Yq;
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1;
        setClickable(false);
        setFocusable(false);
        try {
            C0K77 c0k77LIZ = LIZ();
            if (c0k77LIZ != null) {
                c098200Yq = c0k77LIZ.LJIJI(context, attributeSet, 0);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        View view = (View) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (view == null) {
            C786410Ut5.R0(this, 8);
        } else {
            this.LL = view;
            addView(view, new FrameLayout.LayoutParams(-2, -1));
        }
    }
}
