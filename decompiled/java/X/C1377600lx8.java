package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1377600lx8 extends AbstractC1376390lvB {
    public final String LL;

    @Override // X.AbstractC1376390lvB
    public final String LJJIJL() {
        return null;
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return "more";
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return this.LL;
    }

    public C1377600lx8(String str) {
        this.LL = str;
    }

    public static Intent LJJJJJL(Context context, Intent intent) {
        int i;
        Intent intent2 = new Intent();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getPackageName());
        sbLIZ.append(".systemshare.targetchosen.action");
        intent2.setAction(C2188811AlT.LIZIZ(sbLIZ));
        intent2.setPackage(context.getPackageName());
        if (Build.VERSION.SDK_INT >= 31) {
            i = 1375731712;
        } else {
            i = 1342177280;
        }
        return Intent.createChooser(intent, "", PendingIntent.getBroadcast(C786410Ut5.N3(context), 0, intent2, i).getIntentSender());
    }

    @Override // X.AbstractC1376120luk
    public final boolean LJ(Context context, Intent intent) {
        AutoDFIDManager.LIZJ(new C839020Wvk[]{new C839020Wvk(1207964160, new int[]{11098, 11097, 11094, 11093, 11092, 11091, 11090, 11089, 11088, 11087, 11086, 11085})});
        try {
            boolean zLJ = super.LJ(context, LJJJJJL(context, intent));
            AutoDFIDManager.LIZIZ();
            return zLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AutoDFIDManager.LIZIZ();
            throw th;
        }
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        C1361400lX0 c1361400lX0LIZIZ;
        int i;
        int iIntValue;
        if (context != null && (c1361400lX0LIZIZ = C1369540lk8.LIZIZ(context)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (z) {
                i = R.attr.s0;
            } else {
                i = R.attr.rz;
            }
            Integer numLIZ = C1369540lk8.LIZ(i, c1361400lX0LIZIZ);
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            c419910GdJ.LIZ = iIntValue;
            return c419910GdJ.LIZ(c1361400lX0LIZIZ);
        }
        return null;
    }
}
