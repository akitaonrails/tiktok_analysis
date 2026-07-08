package X;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import com.bytedance.memdump.upload.HprofUploadJobService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.09cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2408609cC {
    public static void LIZ() {
        C0VSJ c0vsj = new C0VSJ(C2405709bj.LIZ.getFilesDir(), "liko");
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            C2223108nN.LIZ(c0vsj);
        }
        File[] fileArrListFiles = C2223108nN.LIZIZ().listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        File fileLIZIZ = C2223108nN.LIZIZ();
        File fileLIZIZ2 = C2223108nN.LIZIZ();
        if (fileLIZIZ2 != null) {
            LIZIZ(fileLIZIZ2);
        }
        File[] fileArrListFiles2 = fileLIZIZ.listFiles(new FileFilter() { // from class: X.09cD
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (fileArrListFiles2 != null && fileArrListFiles2.length > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (File file : fileArrListFiles2) {
                try {
                    if (jCurrentTimeMillis - CastLongProtector.parseLong(file.getName()) >= 86400000) {
                        C2223108nN.LIZ(file);
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2223108nN.LIZ(file);
                }
            }
        }
        File[] fileArrListFiles3 = fileLIZIZ.listFiles(new FileFilter() { // from class: X.09cD
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        if (fileArrListFiles3 != null) {
            for (File file2 : fileArrListFiles3) {
                C2223108nN.LIZJ(file2, false, false);
            }
        }
        Application application = C2405709bj.LIZ;
        JobInfo.Builder overrideDeadline = new JobInfo.Builder(14131113, new ComponentName(application, (Class<?>) HprofUploadJobService.class)).setMinimumLatency(C2406809bu.LIZLLL).setBackoffCriteria(C2406809bu.LJ, 0).setOverrideDeadline(TimeUnit.MINUTES.toMillis(5L));
        overrideDeadline.setRequiredNetworkType(1);
        ((JobScheduler) C786410Ut5.H2(application, "jobscheduler")).schedule(overrideDeadline.build());
    }

    public static void LIZIZ(File file) {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                if (file2.isDirectory()) {
                    LIZIZ(file2);
                } else if (file2.getName().endsWith(".temp")) {
                    C2223108nN.LIZ(file2.getParentFile());
                }
            }
        }
    }
}
