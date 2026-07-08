package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0WW9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WW9 extends BroadcastReceiver {
    public final Context LIZ;
    public final MutableLiveData<String> LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L81
            r6 = 0
            android.os.Bundle r1 = r8.getExtras()     // Catch: java.lang.Exception -> L12
            goto L17
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r6
        L17:
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L40
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_STATUS"
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.OutOfMemoryError -> L22 java.lang.Exception -> L27
            goto L2c
        L22:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L2b
        L27:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2b:
            r2 = r6
        L2c:
            com.google.android.gms.common.api.Status r2 = (com.google.android.gms.common.api.Status) r2
            if (r2 == 0) goto L40
            int r0 = r2.zzd
            if (r0 != 0) goto L82
            java.lang.String r0 = "com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE"
            java.lang.Object r6 = r1.get(r0)     // Catch: java.lang.OutOfMemoryError -> L3b java.lang.Exception -> L42
            goto L46
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L46
        L40:
            r1 = 0
            goto L6e
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L46:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "[0-9]{4,}"
            java.util.regex.Pattern r0 = com.bytedance.mt.protector.impl.PatternProtector.compile(r0)
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L82
            java.lang.String r1 = r1.group(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L82
            androidx.lifecycle.MutableLiveData<java.lang.String> r0 = r7.LIZIZ
            r0.postValue(r1)
            r1 = 1
        L68:
            int r0 = r2.zzd
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L6e:
            android.content.Context r0 = r7.LIZ
            boolean r5 = X.C0VFU.LIZ(r0)
            android.content.Context r0 = r7.LIZ
            int r2 = X.C0WWA.LIZ(r0)
            if (r1 == 0) goto L84
            java.lang.String r0 = ""
            LIZIZ(r2, r0, r4, r5)
        L81:
            return
        L82:
            r1 = 0
            goto L68
        L84:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Failed to get SMS data from Broadcast Receiver, status code = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZIZ(r2, r0, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WW9.LIZ(android.content.Intent):void");
    }

    public C0WW9(Context context, MutableLiveData<String> mutableLiveData) {
        this.LIZ = context;
        this.LIZIZ = mutableLiveData;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }

    public static void LIZIZ(int i, String str, boolean z, boolean z2) {
        C832090WkZ.LIZLLL(i, str, z, z2);
        int i2 = 1;
        if (z) {
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZ(1, "is_successful");
            c0xgr.LIZLLL("error_desc", str);
            if (!z2) {
                i2 = 0;
            }
            c0xgr.LIZ(i2, "has_sim_card");
            c0xgr.LIZ(i, "google_availability");
            C20684815ws.LJIILLIIL("sms_auto_fill", c0xgr.LIZ);
            return;
        }
        C0XGR c0xgr2 = new C0XGR();
        c0xgr2.LIZ(0, "is_successful");
        c0xgr2.LIZLLL("error_desc", str);
        if (!z2) {
            i2 = 0;
        }
        c0xgr2.LIZ(i2, "has_sim_card");
        c0xgr2.LIZ(i, "google_availability");
        C20684815ws.LJIILLIIL("sms_auto_fill", c0xgr2.LIZ);
    }
}
