package Y;

import X.C0WFR;
import X.C0WI2;
import X.C0WT5;
import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C805380Via;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.push.settings.storage.PushProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S3100000_13 implements Runnable {
    public final int $t;
    public Object l3;
    public String s0;
    public String s1;
    public String s2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS0S3100000_13 aRunnableS0S3100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LifeguardManager@d0f1.reportEvent$1");
        try {
            C0WT5.LIZLLL(aRunnableS0S3100000_13.s0, aRunnableS0S3100000_13.s1);
            C805380Via.LJFF("LaunchProtectException", "LifeguardProtect", new RuntimeException(aRunnableS0S3100000_13.s2));
            if (!((ScheduledExecutorService) aRunnableS0S3100000_13.l3).isShutdown()) {
                ((ScheduledExecutorService) aRunnableS0S3100000_13.l3).shutdown();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LifeguardManager@d0f1.reportEvent$1");
    }

    public static final void run$1(ARunnableS0S3100000_13 aRunnableS0S3100000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushProvider@1708.createNotifyRunnable$1");
        try {
            Uri uriLIZ = PushProvider.LIZ((Context) aRunnableS0S3100000_13.l3, new C0WFR(aRunnableS0S3100000_13.s0, aRunnableS0S3100000_13.s1, "val", aRunnableS0S3100000_13.s2));
            if (uriLIZ != null) {
                try {
                    ((Context) aRunnableS0S3100000_13.l3).getContentResolver().notifyChange(uriLIZ, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushProvider@1708.createNotifyRunnable$1");
    }

    public static final void run$2(ARunnableS0S3100000_13 aRunnableS0S3100000_13) throws Throwable {
        Context context = (Context) aRunnableS0S3100000_13.l3;
        String packageName = aRunnableS0S3100000_13.s0;
        String str = aRunnableS0S3100000_13.s1;
        String str2 = aRunnableS0S3100000_13.s2;
        C1C7U.LIZ("SecShareDataWriteManager@d33c.save2AccountManager$1L");
        try {
            AccountManager accountManager = AccountManager.get(context);
            if (packageName == null) {
                packageName = "";
            }
            if (TextUtils.isEmpty(packageName)) {
                packageName = context.getPackageName();
            }
            Account[] accountArrLIZIZ = C2204961BRm.LIZIZ(accountManager, packageName, new C0WZX("dzBzEhEpEcvSUUUuTBbKZylIDzO5MvA7/D1DaU//QncYdlp6oA48VBFTN7dALpkQeMOf/Eg3eJb2pW6wm/9wvw==", null));
            int length = accountArrLIZIZ.length;
            int i = 0;
            while (i < length) {
                Account account = accountArrLIZIZ[i];
                i++;
                AccountManager.get(context).setUserData(account, str, str2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0WI2 c0wi2 = new C0WI2();
            c0wi2.LIZIZ("share_sdk_save_account_info_failed");
            c0wi2.LIZ(e.getMessage(), "err_msg");
            c0wi2.LIZ(Log.getStackTraceString(e), "err_msg_stack");
            c0wi2.LIZJ();
        }
        C1C7U.LIZIZ("SecShareDataWriteManager@d33c.save2AccountManager$1L");
    }

    public ARunnableS0S3100000_13(Context context, String str, String str2, int i) {
        this.$t = i;
        this.l3 = context;
        this.s0 = str;
        this.s1 = "key_account_info";
        this.s2 = str2;
    }

    public ARunnableS0S3100000_13(Object obj, String str, String str2, String str3, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l3 = obj;
    }
}
