package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: X.0Wpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class FragmentC835340Wpo extends Fragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiHELIOSY3ZiIhOmEkKSkgLDt9Mj8o";
    public int LL;
    public RunnableC835360Wpq LLILLJJLI;
    public boolean LLILLL;

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        RunnableC835360Wpq runnableC835360Wpq = this.LLILLJJLI;
        if (runnableC835360Wpq == null || runnableC835360Wpq.LLILLJJLI != this) {
            return;
        }
        runnableC835360Wpq.LLILLJJLI = null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC835360Wpq runnableC835360Wpq = this.LLILLJJLI;
        if (runnableC835360Wpq == null) {
            LIZ(null);
        } else {
            runnableC835360Wpq.LLILLJJLI = this;
            runnableC835360Wpq.LIZIZ();
        }
    }

    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
        if (!this.LLILLL) {
            int i = 1;
            this.LLILLL = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (abstractC835450Wpz != null) {
                int i2 = this.LL;
                if (!activity.isFinishing()) {
                    Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                    if (excLJIIIZ instanceof C825010WXz) {
                        try {
                            ((C825010WXz) excLJIIIZ).startResolutionForResult(activity, i2);
                            return;
                        } catch (IntentSender.SendIntentException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return;
                        }
                    }
                    Intent intent = new Intent();
                    if (abstractC835450Wpz.LJIILJJIL()) {
                        ((InterfaceC834950WpB) abstractC835450Wpz.LJIIJ()).LJJIL(intent);
                        i = -1;
                    } else if (excLJIIIZ instanceof C0W4V) {
                        C0W4V c0w4v = (C0W4V) excLJIIIZ;
                        intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(c0w4v.getStatusCode(), null, c0w4v.getMessage()));
                    } else {
                        intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                    }
                    PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i2, intent, 1073741824);
                    if (pendingIntentCreatePendingResult != null) {
                        try {
                            pendingIntentCreatePendingResult.send(i);
                            return;
                        } catch (PendingIntent.CanceledException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            PendingIntent pendingIntentCreatePendingResult2 = activity.createPendingResult(this.LL, new Intent(), 1073741824);
            if (pendingIntentCreatePendingResult2 != null) {
                try {
                    pendingIntentCreatePendingResult2.send(0);
                } catch (PendingIntent.CanceledException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LL = getArguments().getInt("requestCode");
        if (C835350Wpp.LIZIZ != getArguments().getLong("initializationElapsedRealtime")) {
            this.LLILLJJLI = null;
        } else {
            this.LLILLJJLI = (RunnableC835360Wpq) RunnableC835360Wpq.LLILZIL.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.LLILLL = z;
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.LLILLL);
        RunnableC835360Wpq runnableC835360Wpq = this.LLILLJJLI;
        if (runnableC835360Wpq != null && runnableC835360Wpq.LLILLJJLI == this) {
            runnableC835360Wpq.LLILLJJLI = null;
        }
    }
}
