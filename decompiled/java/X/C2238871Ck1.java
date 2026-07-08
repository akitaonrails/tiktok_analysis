package X;

import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS225S0000000_34;
import tiktok.preload.dispatcher.RunnableHandler;

/* JADX INFO: renamed from: X.1Ck1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238871Ck1 {
    public static HandlerThread LIZIZ;
    public static RunnableHandler LIZJ;
    public static final C2238871Ck1 LIZ = new C2238871Ck1();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(624));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(280));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(279));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(623));

    public final void LIZ() {
        if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ != null) {
                        return;
                    }
                    LIZIZ = new HandlerThread("arsenal-preload-recorder");
                    ((C2206201BWg) C2238821Cjw.LIZLLL.getValue()).LIZ(new Runnable() { // from class: X.1Cjz
                        public static void LIZ() {
                            synchronized (C2238871Ck1.LIZ) {
                                try {
                                    if (C2238871Ck1.LIZIZ == null) {
                                        C2238871Ck1.LIZIZ = new HandlerThread("arsenal-preload-recorder");
                                    }
                                    HandlerThread handlerThread = C2238871Ck1.LIZIZ;
                                    if (handlerThread == null) {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    if (handlerThread.isAlive()) {
                                        return;
                                    }
                                    handlerThread.start();
                                    RunnableHandler runnableHandler = new RunnableHandler(C786410Ut5.W2(handlerThread), AFwS225S0000000_34.get$arr$(281));
                                    C2238871Ck1.LIZJ = runnableHandler;
                                    runnableHandler.sendEmptyMessageDelayed(0, 10000L);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    });
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
