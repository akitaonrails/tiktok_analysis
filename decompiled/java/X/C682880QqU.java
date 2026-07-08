package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682880QqU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, ViewGroup viewGroup, InterfaceC682870QqT interfaceC682870QqT) {
        if (z) {
            C786410Ut5.LJLZ(0, viewGroup);
            if (interfaceC682870QqT != null) {
                interfaceC682870QqT.LJFF();
                return;
            }
            return;
        }
        C786410Ut5.LJLZ(8, viewGroup);
        if (interfaceC682870QqT == null) {
            return;
        }
        interfaceC682870QqT.LJI();
    }

    public static void LIZIZ(Context context, InterfaceC1330440kj4 interfaceC1330440kj4, C1322110kVd c1322110kVd) {
        if (interfaceC1330440kj4 == null) {
            return;
        }
        try {
            int width = interfaceC1330440kj4.getWidth();
            int height = interfaceC1330440kj4.getHeight();
            if (width > 0 && height > 0) {
                ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
                layoutParams.height = (int) (((height * 1.0f) / width) * C12ES.LJIIJ(context));
                C786410Ut5.W5(c1322110kVd, layoutParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }
}
