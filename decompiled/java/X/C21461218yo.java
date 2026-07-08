package X;

import android.os.Build;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21461218yo extends C21461518yr {
    public static boolean LJI = true;

    @Override // X.C21371918kP
    public void LIZ(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.LIZ(i, view);
            return;
        }
        if (!LJI) {
            return;
        }
        try {
            view.setTransitionVisibility(i);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            LJI = false;
        }
    }
}
