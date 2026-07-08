package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0qTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551530qTf {
    public final Context LIZ;
    public final ExecutorC1551550qTh LIZIZ;
    public final C21172217tI LIZJ;
    public InterfaceC1504290pFT LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final C1551290qTH LJI;
    public Long LJII;
    public final String LJIIIIZZ;
    public String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final File LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    public final C822650WOx LIZ() {
        return C1827607Du.LJIIIZ(new C0VEO(), C1785606z0.LIZ()) ? C1505550pHV.LIZIZ : this.LIZJ;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [X.0qTe] */
    public C1551530qTf(C1537040q6I c1537040q6I) throws Throwable {
        Object obj;
        Context context = c1537040q6I.LIZLLL;
        this.LIZ = context;
        if (context != null) {
            this.LJ = c1537040q6I.LIZIZ;
            this.LJFF = c1537040q6I.LIZJ;
            this.LJI = c1537040q6I.LJFF;
            this.LJII = c1537040q6I.LJI;
            if (TextUtils.isEmpty(c1537040q6I.LJII)) {
                this.LJIIIIZZ = C2362609No.LIZJ(context);
            } else {
                this.LJIIIIZZ = c1537040q6I.LJII;
            }
            this.LJIIIZ = c1537040q6I.LJIIIIZZ;
            this.LJIIJJI = c1537040q6I.LJIIJJI;
            File file = c1537040q6I.LJIIJ;
            if (file == null) {
                File file2 = C786450Ut9.LIZJ;
                if (file2 == null || !C786450Ut9.LJ) {
                    try {
                        C786450Ut9.LIZJ = context.getFilesDir();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        Context applicationContext = null;
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mInitialApplication");
                            declaredField.setAccessible(true);
                            obj = declaredField.get(objInvoke);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Error: ");
                            sbLIZ.append(e.getMessage());
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (obj instanceof Application) {
                            applicationContext = ((Application) obj).getApplicationContext();
                            PrintStream printStream2 = System.out;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Application context obtained through ActivityThread: ");
                            sbLIZ2.append(applicationContext);
                            printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                            if (applicationContext != null) {
                                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                                C08RN.LIZ(applicationContext);
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(th.getMessage());
                            sbLIZ3.append(":");
                            sbLIZ3.append(C08RN.LIZJ());
                            sbLIZ3.append(" applicationContext is null");
                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                        sbLIZ32.append(th.getMessage());
                        sbLIZ32.append(":");
                        sbLIZ32.append(C08RN.LIZJ());
                        sbLIZ32.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
                    }
                    file2 = C786450Ut9.LIZJ;
                }
                this.LJIIL = new C0VSJ(file2, "gecko_offline_res_x");
            } else {
                this.LJIIL = file;
            }
            String str = c1537040q6I.LJIIIZ;
            this.LJIIJ = str;
            if (!TextUtils.isEmpty(str)) {
                List<String> list = this.LJ;
                if (list != null && !list.isEmpty()) {
                    List<String> list2 = this.LJFF;
                    if (list2 != null && !list2.isEmpty()) {
                        if (this.LJFF.containsAll(this.LJ)) {
                            if (this.LJII != null) {
                                if (!TextUtils.isEmpty(this.LJIIIZ)) {
                                    C1551500qTc c1551500qTc = C1551510qTd.LIZ;
                                    if (c1551500qTc.LIZJ == null) {
                                        c1551500qTc.LIZJ = new ExecutorC1551550qTh();
                                    }
                                    this.LIZIZ = c1551500qTc.LIZJ;
                                    if (c1551500qTc.LIZ == null) {
                                        C21172217tI c21172217tI = new C21172217tI(TimeUnit.SECONDS, new ThreadFactory() { // from class: X.0qTe
                                            public final /* synthetic */ C1551500qTc LL = C1551510qTd.LIZ;

                                            @Override // java.util.concurrent.ThreadFactory
                                            public final Thread newThread(Runnable runnable) {
                                                BPEAThread bPEAThread = new BPEAThread(runnable);
                                                StringBuilder sb = new StringBuilder("gecko-check-update-client-thread-");
                                                C1551500qTc c1551500qTc2 = this.LL;
                                                int i = c1551500qTc2.LIZLLL + 1;
                                                c1551500qTc2.LIZLLL = i;
                                                sb.append(i);
                                                ThreadMethodProxy.setName(bPEAThread, sb.toString());
                                                ThreadMethodProxy.setPriority(bPEAThread, 3);
                                                return bPEAThread;
                                            }
                                        });
                                        c1551500qTc.LIZ = c21172217tI;
                                        c21172217tI.allowCoreThreadTimeOut(true);
                                    }
                                    this.LIZJ = c1551500qTc.LIZ;
                                    InterfaceC1504290pFT interfaceC1504290pFT = c1537040q6I.LIZ;
                                    if (interfaceC1504290pFT == null) {
                                        this.LIZLLL = new C1504240pFO();
                                    } else {
                                        this.LIZLLL = interfaceC1504290pFT;
                                    }
                                    this.LJIILIIL = c1537040q6I.LJIIL;
                                    this.LJIILJJIL = true;
                                    return;
                                }
                                throw new IllegalArgumentException("deviceId key empty");
                            }
                            throw new IllegalArgumentException("appId is null");
                        }
                        throw new IllegalArgumentException("local accessKey must contain accessKey");
                    }
                    throw new IllegalArgumentException("local accessKey is empty");
                }
                throw new IllegalArgumentException("accessKey is empty");
            }
            throw new IllegalArgumentException("host is null");
        }
        throw new IllegalArgumentException("context == null");
    }
}
