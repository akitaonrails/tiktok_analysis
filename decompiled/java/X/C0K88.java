package X;

import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0K88, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0K88 {
    public void LIZIZ(View view) {
        throw null;
    }

    public void LIZJ(View view, String str) {
        throw null;
    }

    public static void LIZ(final View view) {
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0K89
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ImgLoadListener@1d1c.goneRootView$1");
                try {
                    C786410Ut5.LJLLLLLL(8, view);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ImgLoadListener@1d1c.goneRootView$1");
            }
        });
    }
}
