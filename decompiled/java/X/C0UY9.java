package X;

import Y.ARunnableS112S0100000_12;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.SystemClock;
import com.bytedance.android.livesdk.broadcast.notification.BroadcastKeepAliveService;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import qo2.w;

/* JADX INFO: renamed from: X.0UY9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UY9 {
    public final LiveBroadcastFragment LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 169));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(54));
    public C0UYE LIZLLL;
    public boolean LJ;
    public long LJFF;
    public final C0UYT LJI;
    public final ARunnableS112S0100000_12 LJII;
    public final ARunnableS112S0100000_12 LJIIIIZZ;

    public final void LIZ() throws Throwable {
        Context context;
        if (this.LJ || (context = this.LIZ.getContext()) == null || new C815520Vyw(context).LIZ()) {
            return;
        }
        try {
            Context context2 = this.LIZ.getContext();
            if (context2 != null) {
                C2204961BRm.LJJJJ(context2, new Intent(context2, (Class<?>) BroadcastKeepAliveService.class), this.LJI, 73, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqgooQusTSVS4WCsQv6bkCQFhmm", null));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0UYT] */
    public C0UY9(LiveBroadcastFragment liveBroadcastFragment) {
        this.LIZ = liveBroadcastFragment;
        if (C1152750g6T.LIZ().getEnabled()) {
            this.LIZLLL = new C0UYE(liveBroadcastFragment);
        }
        this.LJI = new ServiceConnection() { // from class: X.0UYT
            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                this.LL.LJ = false;
            }

            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/bytedance/android/livesdk/broadcast/notification/KeepAppAliveManager$serviceConnection$1", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD/IJh/lucBOiiryHprqgooQusTSVS4WCsQv6bkCQFhmm", null)));
                if (c0wsuLIZIZ.LIZ) {
                    return;
                }
                Object[] objArr = c0wsuLIZIZ.LIZJ;
                if (objArr != null) {
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                }
                this.LL.LJ = true;
            }
        };
        this.LJII = new ARunnableS112S0100000_12(this, 61);
        this.LJIIIIZZ = new ARunnableS112S0100000_12(this, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UY9.LIZIZ(boolean):void");
    }

    public final void LIZJ(String str) {
        if (this.LJFF <= 0) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_background_live_duration");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(SystemClock.uptimeMillis() - this.LJFF), "duration");
        c474500IjALIZ.LJJII(str, "type");
        c474500IjALIZ.LIZ();
        this.LJFF = 0L;
    }
}
