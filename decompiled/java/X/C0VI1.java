package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0VI1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI1 extends C0VI7 {
    public static C0VI1 LJIIIZ;
    public static C0VI1 LJIIJ;
    public static final Object LJIIJJI;
    public Context LIZ;
    public C0VHM LIZIZ;
    public WorkDatabase LIZJ;
    public InterfaceC787600Uv0 LIZLLL;
    public List<C0VHP> LJ;
    public C0VH8 LJFF;
    public C0VID LJI;
    public boolean LJII;
    public BroadcastReceiver.PendingResult LJIIIIZZ;

    static {
        C0VI8.LIZIZ("WorkManagerImpl");
        LJIIIZ = null;
        LJIIJ = null;
        LJIIJJI = new Object();
    }

    public static C0VI1 LJI() {
        synchronized (LJIIJJI) {
            try {
                C0VI1 c0vi1 = LJIIIZ;
                if (c0vi1 != null) {
                    return c0vi1;
                }
                return LJIIJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ() {
        synchronized (LJIIJJI) {
            try {
                this.LJII = true;
                BroadcastReceiver.PendingResult pendingResult = this.LJIIIIZZ;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.LJIIIIZZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJ() {
        List<JobInfo> listLJ;
        Context context = this.LIZ;
        JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context, "jobscheduler");
        if (jobScheduler != null && (listLJ = C0VI2.LJ(context, jobScheduler)) != null) {
            ArrayList arrayList = (ArrayList) listLJ;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0VI2.LIZJ(jobScheduler, ((JobInfo) it2.next()).getId());
                }
            }
        }
        C0VIH c0vih = (C0VIH) this.LIZJ.LJIIIIZZ();
        c0vih.LIZ.assertNotSuspendingTransaction();
        InterfaceC796340VLs interfaceC796340VLsAcquire = c0vih.LJIIIIZZ.acquire();
        c0vih.LIZ.beginTransaction();
        try {
            interfaceC796340VLsAcquire.LJIIL();
            c0vih.LIZ.setTransactionSuccessful();
            c0vih.LIZ.endTransaction();
            c0vih.LJIIIIZZ.release(interfaceC796340VLsAcquire);
            C0VHR.LIZ(this.LIZIZ, this.LIZJ, this.LJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vih.LIZ.endTransaction();
            c0vih.LJIIIIZZ.release(interfaceC796340VLsAcquire);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0VI1 LJII(Context context) {
        C0VI1 c0vi1LJI;
        synchronized (LJIIJJI) {
            try {
                c0vi1LJI = LJI();
                if (c0vi1LJI == null) {
                    Context contextN3 = C786410Ut5.N3(context);
                    if (contextN3 instanceof C0VHX) {
                        LJIIIIZZ(contextN3, ((C0VHX) contextN3).LIZ());
                        c0vi1LJI = LJII(contextN3);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c0vi1LJI;
    }

    @Override // X.C0VI7
    public final C795230VHl LIZIZ(final String str) {
        C0VHQ c0vhq = new C0VHQ() { // from class: X.0VHT
            @Override // X.C0VHQ
            public final void LIZIZ() {
                WorkDatabase workDatabase = this.LLILLJJLI.LIZJ;
                workDatabase.beginTransaction();
                try {
                    Iterator it2 = ((ArrayList) ((C0VIH) workDatabase.LJIIIIZZ()).LJII(str)).iterator();
                    while (it2.hasNext()) {
                        C0VHQ.LIZ(this.LLILLJJLI, (String) it2.next());
                    }
                    workDatabase.setTransactionSuccessful();
                    workDatabase.endTransaction();
                    C0VI1 c0vi1 = this.LLILLJJLI;
                    C0VHR.LIZ(c0vi1.LIZIZ, c0vi1.LIZJ, c0vi1.LJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    workDatabase.endTransaction();
                    throw th;
                }
            }
        };
        ((C0VG9) this.LIZLLL).LIZ(c0vhq);
        return c0vhq.LL;
    }

    public final C795230VHl LJ(String str) {
        C0VHU c0vhu = new C0VHU(this, str, true);
        ((C0VG9) this.LIZLLL).LIZ(c0vhu);
        return c0vhu.LL;
    }

    public final InterfaceC795220VHk LJFF(List<? extends AbstractC795370VHz> list) {
        if (!list.isEmpty()) {
            return new C795280VHq(this, null, C0VI0.KEEP, list, 0).LIZ();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void LJIIL(String str) {
        ((C0VG9) this.LIZLLL).LIZ(new C0VH7(this, str, false));
    }

    public static void LJIIIIZZ(Context context, C0VHM c0vhm) {
        synchronized (LJIIJJI) {
            try {
                if (LJIIIZ != null) {
                    if (LJIIJ != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                } else {
                    Context contextN3 = C786410Ut5.N3(context);
                    if (LJIIJ == null) {
                        LJIIJ = new C0VI1(contextN3, c0vhm, new C0VG9(c0vhm.LIZIZ));
                    }
                    LJIIIZ = LJIIJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIJJI(final String str, final C0VHE c0vhe) {
        ((C0VG9) this.LIZLLL).LIZ(new Runnable(this, str, c0vhe) { // from class: X.0VH1
            public final C0VI1 LL;
            public final String LLILLJJLI;
            public final C0VHE LLILLL;

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.LJFF.LJII(this.LLILLJJLI, this.LLILLL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = this;
                this.LLILLJJLI = str;
                this.LLILLL = c0vhe;
            }
        });
    }

    public C0VI1(Context context, C0VHM c0vhm, C0VG9 c0vg9) {
        C796500VMi c796500VMiLIZ;
        boolean z = context.getResources().getBoolean(R.bool.m);
        final Context contextN3 = C786410Ut5.N3(context);
        C0VJ8 c0vj8 = c0vg9.LIZ;
        if (z) {
            c796500VMiLIZ = new C796500VMi(contextN3, WorkDatabase.class, null);
            c796500VMiLIZ.LJII = true;
        } else {
            c796500VMiLIZ = C0OGG.LIZ(contextN3, WorkDatabase.class, "androidx.work.workdb");
            c796500VMiLIZ.LJI = new C0VKA() { // from class: X.0VKO
                @Override // X.C0VKA
                public final InterfaceC796190VLd LIZ(C0VKQ c0vkq) {
                    C0VKN c0vkn = new C0VKN(contextN3);
                    c0vkn.LIZIZ = c0vkq.LIZIZ;
                    c0vkn.LIZJ = c0vkq.LIZJ;
                    c0vkn.LIZLLL = true;
                    return new C0VKP().LIZ(c0vkn.LIZ());
                }
            };
        }
        c796500VMiLIZ.LJ = c0vj8;
        C0VK6 c0vk6 = new C0VK6() { // from class: X.0VJy
            @Override // X.C0VK6
            public final void LIZ(C0VLF c0vlf) {
                c0vlf.LJIIIIZZ();
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
                    sbLIZ.append(System.currentTimeMillis() - WorkDatabase.LL);
                    sbLIZ.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                    c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
                    c0vlf.LJJIIZ();
                    c0vlf.LJJIIZI();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c0vlf.LJJIIZI();
                    throw th;
                }
            }
        };
        if (c796500VMiLIZ.LIZLLL == null) {
            c796500VMiLIZ.LIZLLL = new ArrayList<>();
        }
        c796500VMiLIZ.LIZLLL.add(c0vk6);
        c796500VMiLIZ.LIZ(C0VI6.LIZ);
        final int i = 3;
        final int i2 = 2;
        c796500VMiLIZ.LIZ(new AbstractC796510VMj(i2, i, contextN3) { // from class: X.0VJx
            public final Context LIZ;

            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                if (this.endVersion >= 10) {
                    c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    C810670Vr7.LIZJ(this.LIZ, 0, "androidx.work.util.preferences").edit().putBoolean("reschedule_needed", true).apply();
                }
            }

            {
                this.LIZ = contextN3;
            }
        });
        c796500VMiLIZ.LIZ(C0VI6.LIZIZ);
        c796500VMiLIZ.LIZ(C0VI6.LIZJ);
        final int i3 = 5;
        final int i4 = 6;
        c796500VMiLIZ.LIZ(new AbstractC796510VMj(i3, i4, contextN3) { // from class: X.0VJx
            public final Context LIZ;

            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                if (this.endVersion >= 10) {
                    c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    C810670Vr7.LIZJ(this.LIZ, 0, "androidx.work.util.preferences").edit().putBoolean("reschedule_needed", true).apply();
                }
            }

            {
                this.LIZ = contextN3;
            }
        });
        c796500VMiLIZ.LIZ(C0VI6.LIZLLL);
        c796500VMiLIZ.LIZ(C0VI6.LJ);
        c796500VMiLIZ.LIZ(C0VI6.LJFF);
        c796500VMiLIZ.LIZ(new AbstractC796510VMj(contextN3) { // from class: X.0VJw
            public final Context LIZ;

            {
                super(9, 10);
                this.LIZ = contextN3;
            }

            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LIZ, 0, "androidx.work.util.preferences");
                if (sharedPreferencesLIZJ.contains("reschedule_needed") || sharedPreferencesLIZJ.contains("last_cancel_all_time_ms")) {
                    long j = 0;
                    long j2 = sharedPreferencesLIZJ.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferencesLIZJ.getBoolean("reschedule_needed", false)) {
                        j = 1;
                    }
                    c0vlf.LJIIIIZZ();
                    try {
                        c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                        c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                        sharedPreferencesLIZJ.edit().clear().apply();
                        c0vlf.LJJIIZ();
                        c0vlf.LJJIIZI();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferencesLIZJ2 = C810670Vr7.LIZJ(this.LIZ, 0, "androidx.work.util.id");
                if (sharedPreferencesLIZJ2.contains("next_job_scheduler_id") || sharedPreferencesLIZJ2.contains("next_job_scheduler_id")) {
                    int i5 = sharedPreferencesLIZJ2.getInt("next_job_scheduler_id", 0);
                    int i6 = sharedPreferencesLIZJ2.getInt("next_alarm_manager_id", 0);
                    c0vlf.LJIIIIZZ();
                    try {
                        c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i5)});
                        c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i6)});
                        sharedPreferencesLIZJ2.edit().clear().apply();
                        c0vlf.LJJIIZ();
                        c0vlf.LJJIIZI();
                    } finally {
                    }
                }
            }
        });
        final int i5 = 10;
        final int i6 = 11;
        c796500VMiLIZ.LIZ(new AbstractC796510VMj(i5, i6, contextN3) { // from class: X.0VJx
            public final Context LIZ;

            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                if (this.endVersion >= 10) {
                    c0vlf.LJJJJIZL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                } else {
                    C810670Vr7.LIZJ(this.LIZ, 0, "androidx.work.util.preferences").edit().putBoolean("reschedule_needed", true).apply();
                }
            }

            {
                this.LIZ = contextN3;
            }
        });
        c796500VMiLIZ.LIZ(C0VI6.LJI);
        c796500VMiLIZ.LIZJ();
        WorkDatabase workDatabase = (WorkDatabase) c796500VMiLIZ.LIZIZ();
        Context contextN32 = C786410Ut5.N3(context);
        C0VIC c0vic = new C0VIC(c0vhm.LJFF);
        synchronized (C0VI8.class) {
            C0VI8.LIZ = c0vic;
        }
        C0VI2 c0vi2 = new C0VI2(contextN32, this);
        C2455509jl.LIZ(contextN32, SystemJobService.class, true);
        C0VI8.LIZ().getClass();
        List<C0VHP> listAsList = Arrays.asList(c0vi2, new C0VHG(contextN32, c0vhm, c0vg9, this));
        C0VH8 c0vh8 = new C0VH8(context, c0vhm, c0vg9, workDatabase, listAsList);
        Context contextN33 = C786410Ut5.N3(context);
        this.LIZ = contextN33;
        this.LIZIZ = c0vhm;
        this.LIZLLL = c0vg9;
        this.LIZJ = workDatabase;
        this.LJ = listAsList;
        this.LJFF = c0vh8;
        this.LJI = new C0VID(workDatabase);
        this.LJII = false;
        if (Build.VERSION.SDK_INT >= 24 && contextN33.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        ((C0VG9) this.LIZLLL).LIZ(new ForceStopRunnable(contextN33, this));
    }

    @Override // X.C0VI7
    public final C795280VHq LIZ(String str, C0VI0 c0vi0, List list) {
        if (!list.isEmpty()) {
            return new C795280VHq(this, str, c0vi0, list);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // X.C0VI7
    public final InterfaceC795220VHk LIZJ(String str, C0VIA c0via, C0VIS c0vis) {
        C0VI0 c0vi0;
        if (c0via == C0VIA.KEEP) {
            c0vi0 = C0VI0.KEEP;
        } else {
            c0vi0 = C0VI0.REPLACE;
        }
        return new C795280VHq(this, str, c0vi0, Collections.singletonList(c0vis)).LIZ();
    }

    @Override // X.C0VI7
    public final InterfaceC795220VHk LIZLLL(String str, C0VI0 c0vi0, List<C0VIR> list) {
        return new C795280VHq(this, str, c0vi0, list).LIZ();
    }
}
