package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0EVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C365810EVv {
    public Context LIZ;
    public InterfaceC360730ECh LIZIZ;
    public InterfaceC357880E1i LIZJ;
    public InterfaceC365850EVz LIZLLL;
    public InterfaceC369250Edn LJ = new InterfaceC369250Edn() { // from class: X.0E49
        @Override // X.InterfaceC369250Edn
        public final void LIZ(View view, C0E4C c0e4c) {
            Object c098200Yq;
            if (view != null) {
                try {
                    c098200Yq = Boolean.valueOf(view.performHapticFeedback(0, 2));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    C355090Dw3.LIZLLL("HapticFeedback", thM5exceptionOrNullimpl.getMessage());
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = bool;
                }
                ((Boolean) c098200Yq).booleanValue();
            }
        }
    };
}
