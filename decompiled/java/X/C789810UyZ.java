package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0UyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789810UyZ {
    public static C789810UyZ LJ;
    public final C789770UyV LIZ;
    public final C789780UyW LIZIZ;
    public final C789830Uyb LIZJ;
    public final C789790UyX LIZLLL;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0UyV] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0UyW] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0UyX] */
    public C789810UyZ(Context context, final InterfaceC787600Uv0 interfaceC787600Uv0) {
        final Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = new AbstractC789800UyY<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0UyV
            static {
                C0VI8.LIZIZ("BatteryChrgTracker");
            }

            @Override // X.C0VG7
            public final Object LIZ() throws Exception {
                Intent intentLJIJJ = C786410Ut5.LJIJJ(this.LIZIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentLJIJJ == null) {
                    C0VI8.LIZ().getClass();
                    return null;
                }
                int intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            }

            @Override // X.AbstractC789800UyY
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AbstractC789800UyY
            public final void LJI(Intent intent) {
                String action = intent.getAction();
                if (action == null) {
                }
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Received %s", new Object[]{action});
                c0vi8LIZ.getClass();
                switch (action.hashCode()) {
                    case -1886648615:
                        if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            LIZJ(Boolean.FALSE);
                        }
                        break;
                    case -54942926:
                        if (action.equals("android.os.action.DISCHARGING")) {
                            LIZJ(Boolean.FALSE);
                        }
                        break;
                    case 948344062:
                        if (action.equals("android.os.action.CHARGING")) {
                            LIZJ(Boolean.TRUE);
                        }
                        break;
                    case 1019184907:
                        if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            LIZJ(Boolean.TRUE);
                        }
                        break;
                }
            }
        };
        this.LIZIZ = new AbstractC789800UyY<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0UyW
            static {
                C0VI8.LIZIZ("BatteryNotLowTracker");
            }

            @Override // X.C0VG7
            public final Object LIZ() throws Exception {
                Intent intentLJIJJ = C786410Ut5.LJIJJ(this.LIZIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentLJIJJ == null) {
                    C0VI8.LIZ().getClass();
                    return null;
                }
                float intExtra = intentLJIJJ.getIntExtra("level", -1) / intentLJIJJ.getIntExtra("scale", -1);
                boolean z = true;
                if (intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1) != 1 && intExtra <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.AbstractC789800UyY
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            }

            @Override // X.AbstractC789800UyY
            public final void LJI(Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Received %s", new Object[]{intent.getAction()});
                c0vi8LIZ.getClass();
                String action = intent.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        LIZJ(Boolean.FALSE);
                        return;
                    }
                    return;
                }
                LIZJ(Boolean.TRUE);
            }
        };
        this.LIZJ = new C789830Uyb(contextN3, interfaceC787600Uv0);
        this.LIZLLL = new AbstractC789800UyY<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0UyX
            static {
                C0VI8.LIZIZ("StorageNotLowTracker");
            }

            @Override // X.C0VG7
            public final Object LIZ() throws Exception {
                Intent intentLJIJJ = C786410Ut5.LJIJJ(this.LIZIZ, null, LJFF());
                if (intentLJIJJ == null || intentLJIJJ.getAction() == null) {
                    return Boolean.TRUE;
                }
                String action = intentLJIJJ.getAction();
                action.getClass();
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    return Boolean.FALSE;
                }
                if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return Boolean.TRUE;
                }
                return null;
            }

            @Override // X.AbstractC789800UyY
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter;
            }

            @Override // X.AbstractC789800UyY
            public final void LJI(Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Received %s", new Object[]{intent.getAction()});
                c0vi8LIZ.getClass();
                String action = intent.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        LIZJ(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                LIZJ(Boolean.FALSE);
            }
        };
    }

    public static synchronized C789810UyZ LIZ(Context context, InterfaceC787600Uv0 interfaceC787600Uv0) {
        if (LJ == null) {
            LJ = new C789810UyZ(context, interfaceC787600Uv0);
        }
        return LJ;
    }
}
