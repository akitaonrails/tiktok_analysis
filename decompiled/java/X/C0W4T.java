package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS627S0100000_13;

/* JADX INFO: renamed from: X.0W4T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4T extends BroadcastReceiver {
    public final Context LIZ;
    public final Function2<Boolean, String, Unit> LIZIZ;

    public C0W4T(Context context, AwS627S0100000_13 awS627S0100000_13) {
        this.LIZ = context;
        this.LIZIZ = awS627S0100000_13;
    }

    public final void LIZ(Context context, Intent intent) {
        String action;
        Bundle extras;
        Object obj;
        Integer numValueOf;
        String strGroup;
        Object obj2;
        String str;
        Status status;
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        if (TextUtils.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", action)) {
            if (intent != null) {
                try {
                    extras = intent.getExtras();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    extras = null;
                }
                if (extras != null) {
                    try {
                        obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj = null;
                    } catch (OutOfMemoryError e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        obj = null;
                    }
                } else {
                    obj = null;
                }
            } else {
                extras = null;
                obj = null;
            }
            if ((obj instanceof Status) && (status = (Status) obj) != null) {
                numValueOf = Integer.valueOf(status.zzd);
            } else {
                numValueOf = null;
            }
            int iB4 = 1;
            boolean z = false;
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    try {
                        obj2 = extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        obj2 = null;
                    } catch (OutOfMemoryError e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str = (String) obj2;
                    } else {
                        str = null;
                    }
                    Matcher matcher = PatternProtector.compile("[0-9]{4,}").matcher(str);
                    if (matcher.find()) {
                        strGroup = matcher.group(0);
                        if (!TextUtils.isEmpty(strGroup)) {
                            z = true;
                        }
                    }
                } else {
                    numValueOf.intValue();
                }
                strGroup = null;
            } else {
                strGroup = null;
            }
            boolean zLIZ = C0VEG.LIZ(context);
            if (context != null) {
                try {
                    iB4 = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context);
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            }
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("statusCode: ");
            sbLIZ.append(numValueOf);
            sbLIZ.append(", hasSimCard: ");
            sbLIZ.append(zLIZ);
            sbLIZ.append(", googleAvailability: ");
            sbLIZ.append(iB4);
            sbLIZ.append(", success: ");
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            if (z) {
                this.LIZIZ.invoke(Boolean.TRUE, strGroup);
            } else {
                this.LIZIZ.invoke(Boolean.FALSE, null);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
