package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class RunnableC21553419Wq implements Runnable {
    public final /* synthetic */ C21553019Wm LL;

    public final void LIZ() {
        C21552519Wh c21552519Wh = this.LL.LLILLL;
        if (c21552519Wh == null || !c21552519Wh.isAttachedToWindow() || this.LL.LLILLL.getCount() <= this.LL.LLILLL.getChildCount()) {
            return;
        }
        int childCount = this.LL.LLILLL.getChildCount();
        C21553019Wm c21553019Wm = this.LL;
        if (childCount <= c21553019Wm.LLJILJILJ) {
            c21553019Wm.LLJJJJLIIL.setInputMethodMode(2);
            this.LL.show();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC21553419Wq(C21553019Wm c21553019Wm) {
        this.LL = c21553019Wm;
    }
}
