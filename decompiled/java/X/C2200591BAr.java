package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: renamed from: X.1BAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2200591BAr {
    public final Context LIZ;
    public final InterfaceC1796100wq8 LIZIZ;
    public final C1BBD LIZJ;
    public final C2200461BAe LIZLLL = new C2200461BAe(this, true);
    public final C2200461BAe LJ = new C2200461BAe(this, false);
    public boolean LJFF;

    public final void LIZ(boolean z) {
        int i;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.LJFF = z;
        C2200461BAe c2200461BAe = this.LJ;
        Context context = this.LIZ;
        c2200461BAe.LIZIZ(context, intentFilter2);
        if (this.LJFF) {
            C2200461BAe c2200461BAe2 = this.LIZLLL;
            synchronized (c2200461BAe2) {
                if (!c2200461BAe2.LIZ) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (true != c2200461BAe2.LIZIZ) {
                            i = 4;
                        } else {
                            i = 2;
                        }
                        C786410Ut5.LJJ(context, c2200461BAe2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, i);
                    } else {
                        C786410Ut5.LJIL(context, c2200461BAe2, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                    }
                    c2200461BAe2.LIZ = true;
                }
            }
            return;
        }
        this.LIZLLL.LIZIZ(context, intentFilter);
    }

    public C2200591BAr(Context context, InterfaceC1796100wq8 interfaceC1796100wq8, C1BBD c1bbd) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1796100wq8;
        this.LIZJ = c1bbd;
    }
}
