package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VYJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYJ extends AbstractC813200VvC {
    public static C0VYJ LLILLJJLI;
    public String LL = "";

    public static C0VYJ LIZ() {
        if (LLILLJJLI == null) {
            synchronized (C0VYJ.class) {
                try {
                    if (LLILLJJLI == null) {
                        LLILLJJLI = new C0VYJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLJJLI;
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        this.LL = fragment.getClass().getName();
    }
}
