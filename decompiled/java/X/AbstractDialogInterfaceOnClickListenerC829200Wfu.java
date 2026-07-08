package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Wfu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC829200Wfu implements DialogInterface.OnClickListener {
    public abstract void LIZ();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                LIZ();
                dialogInterface.dismiss();
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                Build.FINGERPRINT.contains("generic");
                dialogInterface.dismiss();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dialogInterface.dismiss();
            throw th;
        }
    }
}
