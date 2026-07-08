package Y;

import X.C0FNV;
import X.C0XU4;
import X.C0XU6;
import X.C0XUD;
import X.C19262210Xk;
import X.C1C7U;
import X.C303010BuF;
import X.C835260Wpg;
import X.DialogC1240080iNK;
import android.app.Activity;
import android.net.Uri;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.awemepushapi.IPushApi;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS14S0210000_13 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S0210000_13.LIZ$0():void");
    }

    public static final void run$0(ARunnableS14S0210000_13 aRunnableS14S0210000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventComponent@6d7c.sendTrackEvent$1");
        try {
            IPushApi iPushApiLIZ = C303010BuF.LIZ();
            boolean z = aRunnableS14S0210000_13.z2;
            C19262210Xk c19262210Xk = (C19262210Xk) aRunnableS14S0210000_13.l1;
            iPushApiLIZ.notifyOnDeeplink(z, c19262210Xk.LIZ, c19262210Xk.LIZIZ, (Uri) aRunnableS14S0210000_13.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventComponent@6d7c.sendTrackEvent$1");
    }

    public static final void run$1(ARunnableS14S0210000_13 aRunnableS14S0210000_13) {
        boolean zLIZ;
        C1C7U.LIZ("DeeplinkEventComponent@6d7c.sendPushAndLaunchEvent$1");
        try {
            aRunnableS14S0210000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DeeplinkEventComponent@6d7c.sendPushAndLaunchEvent$1");
    }

    public static final void run$2(ARunnableS14S0210000_13 aRunnableS14S0210000_13) {
        boolean zLIZ;
        C1C7U.LIZ("LoginMethodsRepository@22bc.saveLoginMethodsAsync$2");
        try {
            C0XU4.LIZIZ.LIZJ((List) aRunnableS14S0210000_13.l0);
            if (!aRunnableS14S0210000_13.z2) {
                C0XUD c0xud = C0XUD.LIZ;
                List list = (List) aRunnableS14S0210000_13.l1;
                c0xud.getClass();
                List listLIZIZ = C0XUD.LIZIZ(list, false);
                C0XU4.LIZ.getClass();
                C835260Wpg.LIZIZ((C835260Wpg) C0XU4.LIZLLL.getValue(), listLIZIZ, null, "LoginMethodsRepository", 2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LoginMethodsRepository@22bc.saveLoginMethodsAsync$2");
    }

    public static final void run$3(ARunnableS14S0210000_13 aRunnableS14S0210000_13) {
        DialogC1240080iNK dialogC1240080iNK;
        C0XU6 c0xu6 = (C0XU6) aRunnableS14S0210000_13.l0;
        boolean z = aRunnableS14S0210000_13.z2;
        Activity activity = (Activity) aRunnableS14S0210000_13.l1;
        c0xu6.getClass();
        C1C7U.LIZ("LogoutManager@da8.logout$1L");
        if (z) {
            dialogC1240080iNK = new DialogC1240080iNK(activity);
        } else {
            dialogC1240080iNK = null;
        }
        c0xu6.LIZJ = dialogC1240080iNK;
        if (dialogC1240080iNK != null) {
            C0FNV.LIZJ(dialogC1240080iNK);
        }
        C1C7U.LIZIZ("LogoutManager@da8.logout$1L");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS14S0210000_13(android.net.Uri r2, X.C19262210Xk r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l1 = r3
            r0.l0 = r2
            r0.z2 = r4
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r3
            r0.z2 = r4
            r0.l0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS14S0210000_13.<init>(android.net.Uri, X.10Xk, boolean, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS14S0210000_13(Object obj, List<? extends BaseLoginMethod> list, boolean z, List<? extends BaseLoginMethod> list2) {
        this.$t = list2;
        this.l0 = obj;
        this.z2 = list;
        this.l1 = z;
    }
}
