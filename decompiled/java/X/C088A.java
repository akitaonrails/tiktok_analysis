package X;

import android.app.Application;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.platform.horae.java_impl.barrier.BarrierMonitor;
import com.bytedance.platform.horae.java_impl.sync.SyncScheduleCenter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.088A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088A implements Runnable {
    public static final Object LLJIJIL = new Object();
    public static C088A LLJILJIL;
    public Application LL;
    public SyncScheduleCenter LLILLJJLI;
    public final List<Message> LLILLL = new ArrayList();
    public long LLILZ;
    public boolean LLILZIL;
    public C088D LLILZLL;
    public boolean LLIZ;
    public MessageQueue LLIZLLLIL;
    public Field LLJ;
    public Field LLJI;

    public static C088A LIZJ() {
        if (LLJILJIL == null) {
            synchronized (C088A.class) {
                try {
                    if (LLJILJIL == null) {
                        LLJILJIL = new C088A();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJILJIL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SyncServiceScheduleManager@28f.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SyncServiceScheduleManager@28f.run");
    }

    public final void LIZ() {
        long jMax;
        Message message;
        int iLIZJ;
        AnonymousClass0888.LIZ();
        if (this.LLIZLLLIL == null || this.LLJ == null || this.LLJI == null) {
            try {
                this.LLIZLLLIL = (MessageQueue) C1963407ma.LIZ(Looper.class, "mQueue").get(Looper.getMainLooper());
                this.LLJI = C1963407ma.LIZ(MessageQueue.class, "mMessages");
                this.LLJ = C1963407ma.LIZ(Message.class, "next");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AnonymousClass0888.LIZ();
                return;
            }
        }
        if (this.LLIZ) {
            BarrierMonitor.LIZLLL.LIZIZ();
        }
        try {
        } catch (Exception e2) {
            e = e2;
            jMax = 2000;
        }
        synchronized (this.LLIZLLLIL) {
            try {
                Message message2 = (Message) this.LLJI.get(this.LLIZLLLIL);
                message = null;
                if (message2 == null || !this.LLIZ) {
                    iLIZJ = -1;
                    if (message2 == null) {
                    }
                    this.LLILLJJLI.postDelayed(this, jMax);
                }
                iLIZJ = BarrierMonitor.LIZLLL.LIZJ(new WeakReference<>(message2));
                do {
                    if (message2.getTarget() == C1966607n6.LIZJ()) {
                        if (((HashSet) C007M.LIZ).contains(Integer.valueOf(message2.what))) {
                            LIZIZ(message2);
                            message = message2;
                        }
                    }
                    message2 = (Message) this.LLJ.get(message2);
                } while (message2 != null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (iLIZJ != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("remove last barrier token:");
            sbLIZ.append(iLIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            if (AnonymousClass0887.ERROR.ordinal() >= AnonymousClass0888.LIZ.ordinal()) {
                AnonymousClass0888.LIZIZ.getClass();
            }
        }
        if (message != null) {
            jMax = message.getWhen() - SystemClock.uptimeMillis();
            if (jMax < 0) {
                try {
                    AnonymousClass0888.LIZ();
                } catch (Exception e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Something is wrong here ");
                    sbLIZ2.append(e.toString());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    AnonymousClass0888.LIZ();
                }
            }
        } else {
            jMax = 2000;
        }
        jMax = Math.max(jMax, 2000L);
        this.LLILLJJLI.postDelayed(this, jMax);
    }

    public final void LIZIZ(Message message) {
        long when;
        if (this.LL != null) {
            int i = message.arg2;
            if (i != 9527 && i != 9529) {
                WeakReference weakReference = new WeakReference(message);
                Message messageObtainMessage = this.LLILLJJLI.obtainMessage(100);
                messageObtainMessage.obj = weakReference;
                message.arg2 = 9527;
                if (SystemClock.uptimeMillis() - message.getWhen() > 1000) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Current follow message ");
                    sbLIZ.append(message.what);
                    sbLIZ.append(" is already out of time.");
                    C2188811AlT.LIZIZ(sbLIZ);
                    AnonymousClass0888.LIZ();
                    when = SystemClock.uptimeMillis();
                } else {
                    when = message.getWhen() + 1000;
                }
                long jMax = Math.max(this.LLILZ + 30, when);
                this.LLILLJJLI.sendMessageAtTime(messageObtainMessage, jMax);
                this.LLILZ = jMax;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Follow message ");
                sbLIZ2.append(message);
                sbLIZ2.append(" successful. Trigger at time = ");
                sbLIZ2.append(this.LLILZ);
                C2188811AlT.LIZIZ(sbLIZ2);
                AnonymousClass0888.LIZ();
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Current message ");
            sbLIZ3.append(message.what);
            sbLIZ3.append(" is already followed!");
            C2188811AlT.LIZIZ(sbLIZ3);
            AnonymousClass0888.LIZ();
            return;
        }
        throw new RuntimeException("Must call start(Application context) first!!!");
    }
}
