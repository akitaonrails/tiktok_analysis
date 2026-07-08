package X;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.common.GoogleApiAvailability;

/* JADX INFO: renamed from: X.0XV0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XV0 {
    public static final boolean LIZ(Activity activity) {
        Dialog errorDialog;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        String errorString = null;
        if (activity != null) {
            Integer numValueOf = Integer.valueOf(C786410Ut5.b4(googleApiAvailability, activity));
            if (numValueOf != null && numValueOf.intValue() == 0) {
                return true;
            }
            if (activity != null && numValueOf != null && (errorDialog = googleApiAvailability.getErrorDialog(activity, numValueOf.intValue(), 9000, new DialogInterfaceOnCancelListenerC854590Xfl(activity, 2))) != null) {
                errorDialog.setOnDismissListener(new DialogInterfaceOnDismissListenerC854640Xfq(activity, 1));
                C0FNV.LIZJ(errorDialog);
                if (numValueOf != null) {
                    errorString = googleApiAvailability.getErrorString(numValueOf.intValue());
                }
                C2344809Gs.LJI(new IllegalStateException(errorString));
                return false;
            }
            return false;
        }
        return false;
    }
}
