package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: X.12ZG, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C12ZG extends AbstractC19781512aT {
    public final AlarmManager LIZLLL;
    public C19776212Zc LJ;
    public Integer LJFF;

    @Override // X.AbstractC19781512aT
    public final boolean LJIIJ() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.LIZLLL;
        if (alarmManager != null) {
            alarmManager.cancel(LJIILL());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) C786410Ut5.H2(this.LIZ.LIZ, "jobscheduler")) == null) {
            return false;
        }
        jobScheduler.cancel(LJIILIIL());
        return false;
    }

    public final int LJIILIIL() {
        if (this.LJFF == null) {
            this.LJFF = Integer.valueOf(("measurement" + this.LIZ.LIZ.getPackageName()).hashCode());
        }
        return this.LJFF.intValue();
    }

    public final PendingIntent LJIILL() {
        Context context = this.LIZ.LIZ;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C19785812bA.LIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.12Zc] */
    public final AbstractC19809612f0 LJIILLIIL() {
        if (this.LJ == null) {
            final C19804712eD c19804712eD = this.LIZIZ.LJIIJJI;
            this.LJ = new AbstractC19809612f0(c19804712eD) { // from class: X.12Zc
                @Override // X.AbstractC19809612f0
                public final void LIZJ() {
                    this.LJ.LJIIJJI();
                    this.LJ.LJIILJJIL().LJIILIIL.LIZJ("Starting upload from DelayedRunnable");
                    this.LJ.LIZIZ.LJJJLZIJ();
                }
            };
        }
        return this.LJ;
    }

    public final void LJIIJJI() {
        JobScheduler jobScheduler;
        LJIIIIZZ();
        LJIILJJIL().LJIILIIL.LIZJ("Unscheduling upload");
        AlarmManager alarmManager = this.LIZLLL;
        if (alarmManager != null) {
            alarmManager.cancel(LJIILL());
        }
        LJIILLIIL().LIZ();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) C786410Ut5.H2(this.LIZ.LIZ, "jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(LJIILIIL());
    }

    public C12ZG(C12Z4 c12z4) {
        super(c12z4);
        this.LIZLLL = (AlarmManager) C786410Ut5.H2(this.LIZ.LIZ, "alarm");
    }
}
