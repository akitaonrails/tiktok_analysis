package X;

import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class RunnableC19351110nF implements InterfaceC19351010nE, Runnable {
    public final TextView LL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TextView textView = this.LL;
            textView.setText(textView.getText());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public RunnableC19351110nF(TextView textView) {
        this.LL = textView;
    }
}
