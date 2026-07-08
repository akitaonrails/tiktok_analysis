package com.android.billingclient.api;

import X.C168Q;
import X.C1719660uqq;
import X.C19F0;
import X.C21505219Ec;
import X.C2200451BAd;
import X.C786410Ut5;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes33.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    public static final String _pnsPageId = "KyohZy49LDcjICt9KiwgJSY9LyYgICo9PGstHELIOSOSZ9GDcjMTYRISkgICE0CSY4IDk6PDwaew==";
    public C19F0 LL;
    public C19F0 LLILLJJLI;
    public C19F0 LLILLL;
    public C19F0 LLILZ;
    public ResultReceiver LLILZIL;
    public ResultReceiver LLILZLL;
    public ResultReceiver LLIZ;
    public ResultReceiver LLIZLLLIL;

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

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LL = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.19FW
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.LIZ;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.data;
                int i = C2200451BAd.LJ(intent, "ProxyBillingActivityV2").LIZ;
                ResultReceiver resultReceiver = proxyBillingActivityV2.LLILZIL;
                if (resultReceiver != null) {
                    Bundle extras = null;
                    if (intent != null) {
                        try {
                            extras = intent.getExtras();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    resultReceiver.send(i, extras);
                }
                int i2 = activityResult.resultCode;
                if (i2 != -1 || i != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Alternative billing only dialog finished with resultCode ");
                    sbLIZ.append(i2);
                    sbLIZ.append(" and billing's responseCode: ");
                    sbLIZ.append(i);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.LLILLJJLI = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.19FZ
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.LIZ;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.data;
                int i = C2200451BAd.LJ(intent, "ProxyBillingActivityV2").LIZ;
                ResultReceiver resultReceiver = proxyBillingActivityV2.LLILZLL;
                if (resultReceiver != null) {
                    Bundle extras = null;
                    if (intent != null) {
                        try {
                            extras = intent.getExtras();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    resultReceiver.send(i, extras);
                }
                int i2 = activityResult.resultCode;
                if (i2 != -1 || i != 0) {
                    C786410Ut5.j4("External offer dialog finished with resultCode: %s and billing's responseCode: %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i)});
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.LLILLL = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.19FX
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.LIZ;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.data;
                Bundle extras = null;
                if (intent != null) {
                    try {
                        extras = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (activityResult.resultCode != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    C786410Ut5.j4("External offer flow finished with resultCode: %s", new Object[]{Integer.valueOf(activityResult.resultCode)});
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", C1BAX.ERROR_IN_ACTIVITY_RESULT.zza());
                    C786410Ut5.LJJJI("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", C786410Ut5.j4("External offer flow finished with error resultCode: %s", new Object[]{Integer.valueOf(activityResult.resultCode)}), extras);
                }
                int i = C2200451BAd.LJ(intent, "ProxyBillingActivityV2").LIZ;
                ResultReceiver resultReceiver = proxyBillingActivityV2.LLIZ;
                if (resultReceiver != null) {
                    resultReceiver.send(i, extras);
                }
                if (i != 0) {
                    C786410Ut5.j4("External offer flow finished with billing responseCode: %s", new Object[]{Integer.valueOf(i)});
                }
                proxyBillingActivityV2.finish();
            }
        });
        this.LLILZ = registerForActivityResult(new C21505219Ec(), new C168Q() { // from class: X.19FY
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.LIZ;
                ActivityResult activityResult = (ActivityResult) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = activityResult.data;
                Bundle extras = null;
                if (intent != null) {
                    try {
                        extras = intent.getExtras();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (activityResult.resultCode != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    C786410Ut5.j4("Launch external link flow finished with resultCode: %s", new Object[]{Integer.valueOf(activityResult.resultCode)});
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", C1BAX.ERROR_IN_ACTIVITY_RESULT.zza());
                    C786410Ut5.LJJJI("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", C786410Ut5.j4("Launch external link flow finished with error resultCode: %s", new Object[]{Integer.valueOf(activityResult.resultCode)}), extras);
                }
                int i = C2200451BAd.LJ(intent, "ProxyBillingActivityV2").LIZ;
                ResultReceiver resultReceiver = proxyBillingActivityV2.LLIZLLLIL;
                if (resultReceiver != null) {
                    resultReceiver.send(i, extras);
                }
                if (i != 0) {
                    C786410Ut5.j4("Launch external link flow finished with billing responseCode: %s", new Object[]{Integer.valueOf(i)});
                }
                proxyBillingActivityV2.finish();
            }
        });
        if (bundle == null) {
            C2200451BAd.LJI("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.LLILZIL = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                this.LL.LIZ(new C1719660uqq(pendingIntent).LIZ());
                return;
            }
            if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.LLILZLL = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                this.LLILLJJLI.LIZ(new C1719660uqq(pendingIntent2).LIZ());
                return;
            } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
                PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
                this.LLIZ = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
                this.LLILLL.LIZ(new C1719660uqq(pendingIntent3).LIZ());
                return;
            } else {
                if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
                    PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
                    this.LLIZLLLIL = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
                    this.LLILZ.LIZ(new C1719660uqq(pendingIntent4).LIZ());
                    return;
                }
                return;
            }
        }
        if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.LLILZIL = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        }
        if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.LLILZLL = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
        if (bundle.containsKey("external_offer_flow_result_receiver")) {
            this.LLIZ = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
        }
        if (bundle.containsKey("launch_external_link_result_receiver")) {
            this.LLIZLLLIL = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
        }
    }

    @Override // androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.LLILZIL;
        if (resultReceiver != null) {
            C786410Ut5.LJJIJL(bundle, "alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.LLILZLL;
        if (resultReceiver2 != null) {
            C786410Ut5.LJJIJL(bundle, "external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.LLIZ;
        if (resultReceiver3 != null) {
            C786410Ut5.LJJIJL(bundle, "external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.LLIZLLLIL;
        if (resultReceiver4 != null) {
            C786410Ut5.LJJIJL(bundle, "launch_external_link_result_receiver", resultReceiver4);
        }
    }
}
