package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Uyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790060Uyy extends BroadcastReceiver {
    public static boolean LIZ = false;
    public static ArrayList<InterfaceC790070Uyz> LIZIZ = new ArrayList<>();
    public static C790060Uyy LIZJ;

    public static void LIZIZ(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        Context contextN3 = C786410Ut5.N3(context);
        if (LIZJ == null) {
            synchronized (C790060Uyy.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C790060Uyy();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C786410Ut5.LJIJJ(contextN3, LIZJ, intentFilter);
    }

    public static void LIZJ(InterfaceC790070Uyz interfaceC790070Uyz) {
        if (LIZIZ == null) {
            LIZIZ = new ArrayList<>();
        }
        if (!LIZIZ.contains(interfaceC790070Uyz)) {
            LIZIZ.add(interfaceC790070Uyz);
        }
    }

    public static void LIZLLL(InterfaceC790070Uyz interfaceC790070Uyz) {
        ArrayList<InterfaceC790070Uyz> arrayList = LIZIZ;
        if (arrayList != null && arrayList.contains(interfaceC790070Uyz)) {
            LIZIZ.remove(interfaceC790070Uyz);
        }
    }

    public static void LJ(Context context) {
        if (LIZJ != null) {
            try {
                C786410Ut5.LJJIFFI(C786410Ut5.N3(context), LIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ(Context context, Intent intent) {
        LIZJ = this;
        if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            if (!C790050Uyx.LIZ(context)) {
                LIZ = false;
            } else {
                LIZ = true;
                NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
                if (networkInfoLJIJ != null && C2204961BRm.LJLJLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhksfRx6IYHc/s3qS/", null)) != null && C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhksfRx6IYHc/s3qS/", null)) == 0) {
                    C2204961BRm.LJLJLLL(networkInfoLJIJ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhksfRx6IYHc/s3qS/", null)).toLowerCase(Locale.getDefault()).equals("cmnet");
                }
            }
            if (!LIZIZ.isEmpty()) {
                int size = LIZIZ.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC790070Uyz interfaceC790070Uyz = (InterfaceC790070Uyz) ListProtector.get(LIZIZ, i);
                    if (interfaceC790070Uyz != null) {
                        if (LIZ) {
                            interfaceC790070Uyz.LIZIZ();
                        } else {
                            interfaceC790070Uyz.LIZ();
                        }
                    }
                }
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
