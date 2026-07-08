package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0VI2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VI2 implements C0VHP {
    public static final /* synthetic */ int LLILZIL = 0;
    public final Context LL;
    public final JobScheduler LLILLJJLI;
    public final C0VI1 LLILLL;
    public final C0VHF LLILZ;

    @Override // X.C0VHP
    public final boolean LIZIZ() {
        return true;
    }

    static {
        C0VI8.LIZIZ("SystemJobScheduler");
    }

    @Override // X.C0VHP
    public final void LIZ(C0VIG... c0vigArr) {
        int iLIZIZ;
        List<Integer> listLIZLLL;
        int iLIZIZ2;
        WorkDatabase workDatabase = this.LLILLL.LIZJ;
        C0VI3 c0vi3 = new C0VI3(workDatabase);
        for (C0VIG c0vig : c0vigArr) {
            workDatabase.beginTransaction();
            try {
                C0VIG c0vigLJIIIIZZ = ((C0VIH) workDatabase.LJIIIIZZ()).LJIIIIZZ(c0vig.LIZ);
                if (c0vigLJIIIIZZ == null) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Skipping scheduling ");
                    sbLIZ.append(c0vig.LIZ);
                    sbLIZ.append(" because it's no longer in the DB");
                    C2188811AlT.LIZIZ(sbLIZ);
                    c0vi8LIZ.getClass();
                    workDatabase.setTransactionSuccessful();
                } else if (c0vigLJIIIIZZ.LIZIZ != C0VIP.ENQUEUED) {
                    C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Skipping scheduling ");
                    sbLIZ2.append(c0vig.LIZ);
                    sbLIZ2.append(" because it is no longer enqueued");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    c0vi8LIZ2.getClass();
                    workDatabase.setTransactionSuccessful();
                } else {
                    C0VH0 c0vh0LIZ = ((C0VI9) workDatabase.LIZJ()).LIZ(c0vig.LIZ);
                    if (c0vh0LIZ != null) {
                        iLIZIZ = c0vh0LIZ.LIZIZ;
                    } else {
                        this.LLILLL.LIZIZ.getClass();
                        iLIZIZ = c0vi3.LIZIZ(this.LLILLL.LIZIZ.LJI);
                        ((C0VI9) this.LLILLL.LIZJ.LIZJ()).LIZIZ(new C0VH0(c0vig.LIZ, iLIZIZ));
                    }
                    LJFF(c0vig, iLIZIZ);
                    if (Build.VERSION.SDK_INT == 23 && (listLIZLLL = LIZLLL(this.LL, this.LLILLJJLI, c0vig.LIZ)) != null) {
                        ArrayList arrayList = (ArrayList) listLIZLLL;
                        int iIndexOf = arrayList.indexOf(Integer.valueOf(iLIZIZ));
                        if (iIndexOf >= 0) {
                            arrayList.remove(iIndexOf);
                        }
                        if (!arrayList.isEmpty()) {
                            iLIZIZ2 = ((Integer) arrayList.get(0)).intValue();
                        } else {
                            this.LLILLL.LIZIZ.getClass();
                            iLIZIZ2 = c0vi3.LIZIZ(this.LLILLL.LIZIZ.LJI);
                        }
                        LJFF(c0vig, iLIZIZ2);
                    }
                    workDatabase.setTransactionSuccessful();
                }
                workDatabase.endTransaction();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @Override // X.C0VHP
    public final void LJJIIJ(String str) {
        List<Integer> listLIZLLL = LIZLLL(this.LL, this.LLILLJJLI, str);
        if (listLIZLLL != null) {
            ArrayList arrayList = (ArrayList) listLIZLLL;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    LIZJ(this.LLILLJJLI, ((Integer) it2.next()).intValue());
                }
                ((C0VI9) this.LLILLL.LIZJ.LIZJ()).LIZJ(str);
            }
        }
    }

    public C0VI2(Context context, C0VI1 c0vi1) {
        JobScheduler jobScheduler = (JobScheduler) C786410Ut5.H2(context, "jobscheduler");
        C0VHF c0vhf = new C0VHF(context);
        this.LL = context;
        this.LLILLL = c0vi1;
        this.LLILLJJLI = jobScheduler;
        this.LLILZ = c0vhf;
    }

    public static void LIZJ(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.k4(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)});
            c0vi8LIZ.getClass();
        }
    }

    public static List<JobInfo> LJ(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VI8.LIZ().getClass();
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r8 >= 26) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014e A[Catch: all -> 0x0182, IllegalStateException -> 0x0197, TryCatch #2 {IllegalStateException -> 0x0197, all -> 0x0182, blocks: (B:61:0x0146, B:63:0x014e, B:65:0x0164, B:67:0x016a), top: B:83:0x0146 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C0VIG r14, int r15) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VI2.LJFF(X.0VIG, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Integer> LIZLLL(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.List r1 = LJ(r5, r6)
            r6 = 0
            if (r1 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 2
            r5.<init>(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r4 = r1.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r3 = r4.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r1 = r3.getExtras()
            if (r1 == 0) goto L37
            boolean r0 = r1.containsKey(r2)     // Catch: java.lang.NullPointerException -> L33
            if (r0 == 0) goto L37
            java.lang.String r0 = r1.getString(r2)     // Catch: java.lang.NullPointerException -> L33
            goto L38
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            r0 = r6
        L38:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L14
            int r0 = r3.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.add(r0)
            goto L14
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VI2.LIZLLL(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.List");
    }
}
