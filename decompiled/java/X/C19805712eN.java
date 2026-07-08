package X;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.12eN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19805712eN {
    public final /* synthetic */ C19809512ez LIZ;

    public final void LIZ() {
        this.LIZ.LJ();
        C19804812eE c19804812eELIZIZ = this.LIZ.LIZIZ();
        this.LIZ.LIZ.LJIILIIL.getClass();
        if (c19804812eELIZIZ.LJIIJJI(System.currentTimeMillis())) {
            this.LIZ.LIZIZ().LJIIL.LIZ(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.LIZ.LJIILJJIL().LJIILIIL.LIZJ("Detected application was in foreground");
                this.LIZ.LIZ.LJIILIIL.getClass();
                LIZJ(System.currentTimeMillis());
            }
        }
    }

    public C19805712eN(C19809512ez c19809512ez) {
        this.LIZ = c19809512ez;
    }

    public final void LIZJ(long j) {
        this.LIZ.LJ();
        if (!this.LIZ.LIZ.LJFF()) {
            return;
        }
        this.LIZ.LIZIZ().LJIILLIIL.LIZIZ(j);
        this.LIZ.LIZ.LJIILIIL.getClass();
        this.LIZ.LJIILJJIL().LJIILIIL.LIZ(Long.valueOf(SystemClock.elapsedRealtime()), "Session started, time");
        Long lValueOf = Long.valueOf(j / 1000);
        this.LIZ.LJII().LJJIFFI("auto", "_sid", lValueOf, j);
        this.LIZ.LIZIZ().LJIIZILJ.LIZIZ(lValueOf.longValue());
        this.LIZ.LIZIZ().LJIIL.LIZ(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", lValueOf.longValue());
        this.LIZ.LJII().LJIIZILJ(j, "auto", "_s", bundle);
        String strLIZ = this.LIZ.LIZIZ().LJIL.LIZ();
        if (!TextUtils.isEmpty(strLIZ)) {
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("_ffr", strLIZ, bundle2);
            this.LIZ.LJII().LJIIZILJ(j, "auto", "_ssr", bundle2);
        }
    }

    public final void LIZIZ(long j, boolean z) {
        this.LIZ.LJ();
        this.LIZ.LJIILLIIL();
        if (this.LIZ.LIZIZ().LJIIJJI(j)) {
            this.LIZ.LIZIZ().LJIIL.LIZ(true);
            this.LIZ.LJFF().LJIJI();
        }
        this.LIZ.LIZIZ().LJIILLIIL.LIZIZ(j);
        if (this.LIZ.LIZIZ().LJIIL.LIZIZ()) {
            LIZJ(j);
        }
    }
}
