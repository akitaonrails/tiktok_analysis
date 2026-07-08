package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: X.0VrV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810910VrV {
    public static final long LJIIIIZZ = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int LJIIIZ = 0;
    public final Context LIZ;
    public final C812200Vta LIZIZ;
    public final C812300Vtk LIZJ;
    public final FirebaseMessaging LIZLLL;
    public final ScheduledExecutorService LJFF;
    public final C810940VrY LJII;
    public final C830490Whz LJ = new C830490Whz();
    public boolean LJI = false;

    public final boolean LJFF() throws Throwable {
        C810920VrW c810920VrWLIZ;
        while (true) {
            synchronized (this) {
                try {
                    c810920VrWLIZ = this.LJII.LIZ();
                    if (c810920VrWLIZ == null) {
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            try {
                String str = c810920VrWLIZ.LIZIZ;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        LIZJ(c810920VrWLIZ.LIZ);
                    }
                } else if (str.equals("S")) {
                    LIZIZ(c810920VrWLIZ.LIZ);
                }
                this.LJII.LIZJ(c810920VrWLIZ);
                LIZLLL(c810920VrWLIZ);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage()) || e.getMessage() == null) {
                    return false;
                }
                throw e;
            }
        }
    }

    public static <T> void LIZ(AbstractC835450Wpz<T> abstractC835450Wpz) throws Throwable {
        try {
            C835460Wq0.LIZIZ(abstractC835450Wpz, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if ((cause instanceof IOException) || (cause instanceof RuntimeException)) {
                throw cause;
            }
            throw new IOException(e2);
        } catch (TimeoutException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void LIZIZ(String str) throws Throwable {
        C812300Vtk c812300Vtk = this.LIZJ;
        String strLIZ = this.LIZLLL.LIZ();
        c812300Vtk.getClass();
        Bundle bundle = new Bundle();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/topics/");
        sbLIZ.append(str);
        C786410Ut5.LJJJI("gcm.topic", C2188811AlT.LIZIZ(sbLIZ), bundle);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("/topics/");
        sbLIZ2.append(str);
        LIZ(c812300Vtk.LIZ(c812300Vtk.LIZJ(strLIZ, C2188811AlT.LIZIZ(sbLIZ2), bundle)));
    }

    public final void LIZJ(String str) throws Throwable {
        C812300Vtk c812300Vtk = this.LIZJ;
        String strLIZ = this.LIZLLL.LIZ();
        c812300Vtk.getClass();
        Bundle bundle = new Bundle();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/topics/");
        sbLIZ.append(str);
        C786410Ut5.LJJJI("gcm.topic", C2188811AlT.LIZIZ(sbLIZ), bundle);
        C786410Ut5.LJJJI("delete", "1", bundle);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("/topics/");
        sbLIZ2.append(str);
        LIZ(c812300Vtk.LIZ(c812300Vtk.LIZJ(strLIZ, C2188811AlT.LIZIZ(sbLIZ2), bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(C810920VrW c810920VrW) {
        synchronized (this.LJ) {
            try {
                String str = c810920VrW.LIZJ;
                if (!this.LJ.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.LJ.get(str);
                C835520Wq6 c835520Wq6 = (C835520Wq6) arrayDeque.poll();
                if (c835520Wq6 != null) {
                    c835520Wq6.LIZIZ(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.LJ.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LJ(boolean z) {
        this.LJI = z;
    }

    public final void LJI(long j) {
        this.LJFF.schedule(new RunnableC789750UyT(this, this.LIZ, this.LIZIZ, Math.min(Math.max(30L, 2 * j), LJIIIIZZ)), j, TimeUnit.SECONDS);
        synchronized (this) {
            this.LJI = true;
        }
    }

    public C810910VrV(FirebaseMessaging firebaseMessaging, C812200Vta c812200Vta, C810940VrY c810940VrY, C812300Vtk c812300Vtk, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.LIZLLL = firebaseMessaging;
        this.LIZIZ = c812200Vta;
        this.LJII = c810940VrY;
        this.LIZJ = c812300Vtk;
        this.LIZ = context;
        this.LJFF = scheduledExecutorService;
    }
}
