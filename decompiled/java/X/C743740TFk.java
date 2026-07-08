package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743740TFk extends AbstractC214914198u {
    public final Dialog LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C743740TFk) && Intrinsics.LJFF(this.LIZ, ((C743740TFk) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogWrapper(dialog=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC214914198u
    public final void LIZ() {
        try {
            if (this.LIZ.isShowing()) {
                C786410Ut5.LIZIZ(this.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC214914198u
    public final boolean LIZIZ() {
        View decorView;
        Window window = this.LIZ.getWindow();
        return Intrinsics.LJFF((window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getTag(), "saf_skip_auto_dismiss");
    }

    @Override // X.AbstractC214914198u
    public final void LIZJ() {
        try {
            View view = this.LIZIZ;
            if (view != null) {
                C743750TFl.LIZ(view);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.AbstractC214914198u
    public final void LIZLLL() {
        try {
            View view = this.LIZIZ;
            if (view != null) {
                view.animate().alpha(1.0f).setDuration(150L).withStartAction(new RunnableC514801zW(view, 121)).withEndAction(new RunnableC514801zW(view, 122));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C743740TFk(Dialog dialog) {
        View decorView;
        this.LIZ = dialog;
        Window window = dialog.getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        this.LIZIZ = decorView;
    }
}
