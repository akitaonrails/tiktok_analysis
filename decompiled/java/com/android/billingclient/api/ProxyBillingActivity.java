package com.android.billingclient.api;

import X.C0WZX;
import X.C19885612rG;
import X.C19889112rp;
import X.C1BAX;
import X.C2188811AlT;
import X.C2200451BAd;
import X.C2200521BAk;
import X.C2204961BRm;
import X.C2409809cO;
import X.C786410Ut5;
import X.C817700W5w;
import X.EnumC2200651BAx;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes35.dex */
public class ProxyBillingActivity extends Activity {
    public static final String _pnsPageId = "KyohZy49LDcjICt9KiwgJSY9LyYgICo9PGHELIOSstOSZ9GDcjMTYRISkgICE0CSY4IDk6PDw=";
    public ResultReceiver LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;

    public final Intent LIZLLL() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        intent.setPackage(applicationContext.getPackageName());
        return intent;
    }

    @Override // android.app.Activity
    public final void onDestroy() throws Throwable {
        super.onDestroy();
        if (isFinishing() && this.LLILLJJLI) {
            Intent intentLIZLLL = LIZLLL();
            intentLIZLLL.putExtra("RESPONSE_CODE", 1);
            intentLIZLLL.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.LLILLL) {
                intentLIZLLL.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.LLILZ;
            if (i == 110 || i == 100) {
                intentLIZLLL.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentLIZLLL.putExtra("billingClientTransactionId", this.LLILZIL);
            }
            C2204961BRm.LLJLIL(this, intentLIZLLL, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw9KovsVJ7GovOX7xkpyHRZc0iMdQ=", new String[]{"01cc3"}));
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextActivity: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, true);
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            C2200451BAd.LJI("ProxyBillingActivity", "Launching Play Store billing flow");
            this.LLILZ = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.LLILLL = true;
                    this.LLILZ = 110;
                }
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.LL = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                this.LLILZ = 101;
            } else {
                pendingIntent = null;
            }
            if (getIntent().hasExtra("billingClientTransactionId")) {
                this.LLILZIL = getIntent().getLongExtra("billingClientTransactionId", 0L);
            }
            if (getIntent().hasExtra("wasServiceAutoReconnected")) {
                this.LLILZLL = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
            }
            try {
                this.LLILLJJLI = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), this.LLILZ, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                TryCatchGuardChecker.doCheck(e);
                ResultReceiver resultReceiver = this.LL;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                } else {
                    Intent intentLIZJ = LIZJ(C1BAX.INTENT_SENDER_EXCEPTION, this.LLILZIL);
                    if (this.LLILLL) {
                        intentLIZJ.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    C2204961BRm.LLJLIL(this, intentLIZJ, new C0WZX("dzBzEgM0W9jTXFNvRxuIaqGa/t0aV0yLu9rODctw9KovsVJ7GovOX7xkpyHRZc0iMdQ=", new String[]{"01cc3"}));
                }
                this.LLILLJJLI = false;
                finish();
                return;
            }
        }
        C2200451BAd.LJI("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.LLILLJJLI = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("in_app_message_result_receiver")) {
            this.LL = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.LLILLL = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
        this.LLILZ = bundle.getInt("activity_code", 100);
        if (bundle.containsKey("billingClientTransactionId")) {
            this.LLILZIL = bundle.getLong("billingClientTransactionId");
        }
        if (bundle.containsKey("wasServiceAutoReconnected")) {
            this.LLILZLL = bundle.getBoolean("wasServiceAutoReconnected");
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.LL;
        if (resultReceiver != null) {
            C786410Ut5.LJJIJL(bundle, "in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.LLILLJJLI);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.LLILLL);
        bundle.putInt("activity_code", this.LLILZ);
        bundle.putLong("billingClientTransactionId", this.LLILZIL);
        bundle.putBoolean("wasServiceAutoReconnected", this.LLILZLL);
    }

    public static C1BAX LIZIZ(int i, Intent intent) {
        if (intent == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 3) {
                        if (i != 4) {
                            return C1BAX.NULL_DATA_WITH_OTHER_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
                        }
                        return C1BAX.NULL_DATA_WITH_PLAY_CANCELED_WITHOUT_COMPLETE_ACTION_RESULT_CODE;
                    }
                    return C1BAX.NULL_DATA_WITH_PLAY_CANCELED_RESULT_CODE;
                }
                return C1BAX.NULL_DATA_WITH_CANCELLED_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
            }
            return C1BAX.NULL_DATA_WITH_OK_RESULT_CODE_IN_PROXY_BILLING_ACTIVITY_RESULT;
        }
        if (LIZ(intent) == null) {
            return C1BAX.NULL_BUNDLE_IN_ACTIVITY_RESULT;
        }
        if (i == 5) {
            return C1BAX.PLAY_STORE_ON_CREATE_RUNTIME_EXCEPTION;
        }
        return C1BAX.REASON_UNSPECIFIED;
    }

    public final Intent LIZJ(C1BAX c1bax, long j) {
        Intent intentLIZLLL = LIZLLL();
        intentLIZLLL.putExtra("RESPONSE_CODE", 6);
        intentLIZLLL.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        C19889112rp c19889112rp = new C19889112rp();
        c19889112rp.LIZ = 6;
        c19889112rp.LIZJ = "An internal error occurred.";
        C19885612rG c19885612rGLIZ = c19889112rp.LIZ();
        int i = C2200521BAk.LIZ;
        intentLIZLLL.putExtra("FAILURE_LOGGING_PAYLOAD", C2200521BAk.LIZIZ(c1bax, 2, c19885612rGLIZ, null, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED).LIZIZ());
        intentLIZLLL.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentLIZLLL.putExtra("billingClientTransactionId", j);
        intentLIZLLL.putExtra("wasServiceAutoReconnected", this.LLILZLL);
        return intentLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r11, int r12, android.content.Intent r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }
}
