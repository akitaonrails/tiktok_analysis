package androidx.core.app;

import X.AbstractC790360UzS;
import X.AsyncTaskC808400VnS;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C808410VnT;
import X.InterfaceC808420VnU;
import X.InterfaceC808430VnV;
import X.JobServiceEngineC808380VnQ;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public abstract class JobIntentService extends Service {
    public final ArrayList<C808410VnT> mCompatQueue;
    public AbstractC790360UzS mCompatWorkEnqueuer;
    public AsyncTaskC808400VnS mCurProcessor;
    public boolean mDestroyed;
    public boolean mInterruptIfStopped;
    public InterfaceC808430VnV mJobImpl;
    public boolean mStopped;
    public static final Object sLock = new Object();
    public static final HashMap<ComponentName, AbstractC790360UzS> sClassWorkEnqueuer = new HashMap<>();

    public void androidx_core_app_JobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        androidx_core_app_JobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public abstract void onHandleWork(Intent intent);

    public boolean onStopCurrentWork() {
        return true;
    }

    public InterfaceC808420VnU dequeueWork() {
        InterfaceC808430VnV interfaceC808430VnV = this.mJobImpl;
        if (interfaceC808430VnV != null) {
            return ((JobServiceEngineC808380VnQ) interfaceC808430VnV).LIZ();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean doStopCurrentWork() {
        AsyncTaskC808400VnS asyncTaskC808400VnS = this.mCurProcessor;
        if (asyncTaskC808400VnS != null) {
            asyncTaskC808400VnS.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void processorFinished() {
        ArrayList<C808410VnT> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<C808410VnT> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new JobServiceEngineC808380VnQ(this);
            this.mCompatWorkEnqueuer = null;
        } else {
            this.mJobImpl = null;
            this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<C808410VnT> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mDestroyed = true;
                    this.mCompatWorkEnqueuer.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VnS] */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new PthreadAsyncTask<Void, Void, Void>() { // from class: X.0VnS
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) {
                    while (true) {
                        InterfaceC808420VnU interfaceC808420VnUDequeueWork = this.LIZ.dequeueWork();
                        if (interfaceC808420VnUDequeueWork != null) {
                            this.LIZ.onHandleWork(interfaceC808420VnUDequeueWork.getIntent());
                            interfaceC808420VnUDequeueWork.LJFF();
                        } else {
                            return null;
                        }
                    }
                }

                @Override // android.os.AsyncTask
                public final void onCancelled(Object obj) {
                    this.LIZ.processorFinished();
                }

                @Override // android.os.AsyncTask
                public final void onPostExecute(Object obj) {
                    this.LIZ.processorFinished();
                }
            };
            AbstractC790360UzS abstractC790360UzS = this.mCompatWorkEnqueuer;
            if (abstractC790360UzS != null && z) {
                abstractC790360UzS.LIZLLL();
            }
            executeOnExecutor(PthreadAsyncTask.THREAD_POOL_EXECUTOR_V2, new Void[0]);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "androidx/core/app/JobIntentService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXNsPt/xk0gbTNu6+7oJB9PQ==", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        Object obj2 = this.mJobImpl;
        if (obj2 != null) {
            return ((JobServiceEngine) obj2).getBinder();
        }
        return null;
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void androidx_core_app_JobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(JobIntentService jobIntentService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        jobIntentService.androidx_core_app_JobIntentService__attachBaseContext$___twin___(context);
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, final int i2) {
        if (this.mCompatQueue != null) {
            this.mCompatWorkEnqueuer.LJ();
            synchronized (this.mCompatQueue) {
                try {
                    ArrayList<C808410VnT> arrayList = this.mCompatQueue;
                    if (intent == null) {
                        intent = new Intent();
                    }
                    arrayList.add((C808410VnT) new InterfaceC808420VnU(intent, i2) { // from class: X.0VnT
                        public final Intent LIZ;
                        public final int LIZIZ;

                        @Override // X.InterfaceC808420VnU
                        public final void LJFF() {
                            this.LIZJ.stopSelf(this.LIZIZ);
                        }

                        @Override // X.InterfaceC808420VnU
                        public final Intent getIntent() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = intent;
                            this.LIZIZ = i2;
                        }
                    });
                    ensureProcessorRunningLocked(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return 3;
        }
        return 2;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                try {
                    AbstractC790360UzS workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                    workEnqueuer.LIZIZ(i);
                    workEnqueuer.LIZ(intent);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static AbstractC790360UzS getWorkEnqueuer(final Context context, final ComponentName componentName, boolean z, final int i) {
        HashMap<ComponentName, AbstractC790360UzS> map = sClassWorkEnqueuer;
        AbstractC790360UzS abstractC790360UzS = map.get(componentName);
        if (abstractC790360UzS == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z) {
                    abstractC790360UzS = new AbstractC790360UzS(i, componentName, context) { // from class: X.0VI5
                        public final JobInfo LIZLLL;
                        public final JobScheduler LJ;

                        @Override // X.AbstractC790360UzS
                        public final void LIZ(Intent intent) {
                            this.LJ.enqueue(this.LIZLLL, new JobWorkItem(intent));
                        }

                        {
                            super(componentName);
                            LIZIZ(i);
                            this.LIZLLL = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
                            Context applicationContext = context.getApplicationContext();
                            this.LJ = (JobScheduler) C786410Ut5.H2(applicationContext == null ? C1BWL.LIZ() : applicationContext, "jobscheduler");
                        }
                    };
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                abstractC790360UzS = new AbstractC790360UzS(componentName, context) { // from class: X.0UzR
                    public final Context LIZLLL;
                    public final PowerManager.WakeLock LJ;
                    public final PowerManager.WakeLock LJFF;
                    public boolean LJI;
                    public boolean LJII;

                    @Override // X.AbstractC790360UzS
                    public final void LIZJ() {
                        synchronized (this) {
                            try {
                                if (this.LJII) {
                                    if (this.LJI) {
                                        this.LJ.acquire(60000L);
                                    }
                                    this.LJII = false;
                                    this.LJFF.release();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.AbstractC790360UzS
                    public final void LIZLLL() {
                        synchronized (this) {
                            try {
                                if (!this.LJII) {
                                    this.LJII = true;
                                    this.LJFF.acquire(600000L);
                                    this.LJ.release();
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.AbstractC790360UzS
                    public final void LJ() {
                        synchronized (this) {
                            try {
                                this.LJI = false;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }

                    @Override // X.AbstractC790360UzS
                    public final void LIZ(Intent intent) {
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(this.LIZ);
                        if (C786410Ut5.s3(this.LIZLLL, intent2) != null) {
                            synchronized (this) {
                                try {
                                    if (!this.LJI) {
                                        this.LJI = true;
                                        if (!this.LJII) {
                                            this.LJ.acquire(60000L);
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }
                    }

                    {
                        super(componentName);
                        Context applicationContext = context.getApplicationContext();
                        this.LIZLLL = applicationContext == null ? C1BWL.LIZ() : applicationContext;
                        PowerManager powerManager = (PowerManager) C786410Ut5.H2(context, "power");
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXNsPt/xk0gbTNu6+7oJB9PQ==", new String[]{"01789"})) + ":launch");
                        this.LJ = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, C2204961BRm.LJJIJIIJIL(componentName, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXNsPt/xk0gbTNu6+7oJB9PQ==", new String[]{"01789"})) + ":run");
                        this.LJFF = wakeLockNewWakeLock2;
                        wakeLockNewWakeLock2.setReferenceCounted(false);
                    }
                };
            }
            map.put(componentName, abstractC790360UzS);
        }
        return abstractC790360UzS;
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }
}
