package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12eG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19805012eG extends AbstractC19810512f9 {
    public volatile C19811512fJ LIZJ;
    public volatile C19811512fJ LIZLLL;
    public C19811512fJ LJ;
    public final Map<Activity, C19811512fJ> LJFF;
    public Activity LJI;
    public volatile boolean LJII;
    public volatile C19811512fJ LJIIIIZZ;
    public C19811512fJ LJIIIZ;
    public boolean LJIIJ;
    public final Object LJIIJJI;

    @Override // X.AbstractC19810512f9
    public final boolean LJIILL() {
        return false;
    }

    public C19805012eG(C19804712eD c19804712eD) {
        super(c19804712eD);
        this.LJIIJJI = new Object();
        this.LJFF = new ConcurrentHashMap();
    }

    public final String LJIILLIIL(Class cls) {
        String str;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        if (strArrSplit.length > 0) {
            str = strArrSplit[strArrSplit.length - 1];
        } else {
            str = "";
        }
        if (str.length() > this.LIZ.LJI.LJII(null, false)) {
            return str.substring(0, this.LIZ.LJI.LJII(null, false));
        }
        return str;
    }

    public final C19811512fJ LJIIZILJ(boolean z) {
        LJIIJJI();
        LJ();
        if (!z) {
            return this.LJ;
        }
        C19811512fJ c19811512fJ = this.LJ;
        if (c19811512fJ != null) {
            return c19811512fJ;
        }
        return this.LJIIIZ;
    }

    public final C19811512fJ LJJ(Activity activity) {
        C0W3J.LJIIIIZZ(activity);
        C19811512fJ c19811512fJ = (C19811512fJ) ((ConcurrentHashMap) this.LJFF).get(activity);
        if (c19811512fJ == null) {
            c19811512fJ = new C19811512fJ(null, LJIILLIIL(activity.getClass()), LIZJ().LJL());
            ((ConcurrentHashMap) this.LJFF).put(activity, c19811512fJ);
        }
        if (this.LJIIIIZZ != null) {
            return this.LJIIIIZZ;
        }
        return c19811512fJ;
    }

    public final void LJIJI(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.LIZ.LJI.LJIL() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJFF).put(activity, new C19811512fJ(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(FollowStatusChangeMethod.PARAM_UID)));
    }

    public final void LJIJJ(Activity activity, C19811512fJ c19811512fJ, final boolean z) {
        final C19811512fJ c19811512fJ2;
        C19811512fJ c19811512fJ3;
        String strLJIILLIIL;
        if (this.LIZJ == null) {
            c19811512fJ2 = this.LIZLLL;
        } else {
            c19811512fJ2 = this.LIZJ;
        }
        if (c19811512fJ.LIZIZ == null) {
            if (activity != null) {
                strLJIILLIIL = LJIILLIIL(activity.getClass());
            } else {
                strLJIILLIIL = null;
            }
            String str = c19811512fJ.LIZ;
            c19811512fJ3 = new C19811512fJ(c19811512fJ.LIZJ, c19811512fJ.LJFF, c19811512fJ.LJ, str, strLJIILLIIL);
        } else {
            c19811512fJ3 = c19811512fJ;
        }
        this.LIZLLL = this.LIZJ;
        this.LIZJ = c19811512fJ3;
        this.LIZ.LJIILIIL.getClass();
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        final C19811512fJ c19811512fJ4 = c19811512fJ3;
        LJIIL().LJIILL(new Runnable(this) { // from class: X.10pz
            public final /* synthetic */ C19805012eG LLILZIL;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzku@396b.run");
                try {
                    this.LLILZIL.LJIJJLI(c19811512fJ4, c19811512fJ2, jElapsedRealtime, z, null);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzku@396b.run");
            }

            {
                this.LLILZIL = this;
            }
        });
    }

    public final void LJIL(C19811512fJ c19811512fJ, boolean z, long j) {
        boolean z2;
        C19806012eQ c19806012eQLJIIIIZZ = this.LIZ.LJIIIIZZ();
        this.LIZ.LJIILIIL.getClass();
        c19806012eQLJIIIIZZ.LJIIJJI(SystemClock.elapsedRealtime());
        if (c19811512fJ != null && c19811512fJ.LIZLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LJIIJ().LJFF.LIZ(j, z2, z) && c19811512fJ != null) {
            c19811512fJ.LIZLLL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(X.C19811512fJ r21, X.C19811512fJ r22, long r23, boolean r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19805012eG.LJIJJLI(X.12fJ, X.12fJ, long, boolean, android.os.Bundle):void");
    }
}
