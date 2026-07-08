package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;

/* JADX INFO: renamed from: X.0SmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC731360SmU {
    public boolean LIZ = true;

    public abstract void LIZ();

    public final void LIZLLL() {
        if (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZIZ()) {
            LIZ();
        }
    }

    public static void LIZIZ(TuxTextView tuxTextView, boolean z) {
        if (z) {
            tuxTextView.setTuxFont(72);
        }
    }

    public static void LIZJ(TuxTextView tuxTextView, boolean z) {
        if (z && tuxTextView != null) {
            if (!C2174761A9i.LIZIZ() && !LowScreenOptimizeAB.LIZIZ() && !C2174771A9j.LIZJ()) {
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
                if (C426750GoL.LIZLLL(tuxTextView.getContext())) {
                    C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, null, null, false, 30);
                } else {
                    C426750GoL.LJIIIZ(tuxTextView, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), null, false, 27);
                }
            }
            if (!C302070Bsj.LIZLLL()) {
                tuxTextView.setMinTextSize(9.0f);
            }
        }
    }
}
