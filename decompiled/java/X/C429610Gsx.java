package X;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Gsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429610Gsx {
    public static final C19508411Uc LIZ(View view) {
        Object c098200Yq;
        if (view == null) {
            return null;
        }
        if (view instanceof ViewStub) {
            try {
                c098200Yq = C786410Ut5.LJLLLL((ViewStub) view);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            view = (View) c098200Yq;
        }
        if (!(view instanceof C19508411Uc)) {
            return null;
        }
        return (C19508411Uc) view;
    }
}
