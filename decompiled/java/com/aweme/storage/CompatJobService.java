package com.aweme.storage;

import X.C15O7;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2501409rA;
import X.C2501509rB;
import X.C788530UwV;
import X.C817700W5w;
import X.C823050WQl;
import Y.ACallableS411S0100000_3;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes4.dex */
public class CompatJobService extends android.app.job.JobService {
    public static volatile boolean LL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        C15O7.LIZIZ(new ACallableS411S0100000_3((Object) this, 7), C823050WQl.LIZLLL(), null).LJIIZILJ(new C2501509rB(this, 0), C15O7.LJIIIIZZ).LJI(new C2501409rA(jobParameters, this, 2));
        return true;
    }
}
