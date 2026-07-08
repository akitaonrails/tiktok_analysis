package X;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.platform.horae.java_impl.async.AsyncScheduleCenter;
import com.bytedance.platform.horae.java_impl.barrier.BarrierMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.088B, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088B implements Runnable {
    public static C088B LLJI;
    public AsyncScheduleCenter LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Looper LLILZ;
    public C088D LLILZIL;
    public boolean LLILZLL;
    public MessageQueue LLIZ;
    public Field LLIZLLLIL;
    public Field LLJ;

    public static C088B LIZIZ() {
        if (LLJI == null) {
            synchronized (C088B.class) {
                try {
                    if (LLJI == null) {
                        LLJI = new C088B();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLJI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AsyncServiceScheduleManager@647b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AsyncServiceScheduleManager@647b.run");
    }

    public final void LIZ() {
        long jMax;
        Message message;
        int iLIZJ;
        AnonymousClass0888.LIZ();
        if (this.LLIZ == null || this.LLIZLLLIL == null || this.LLJ == null) {
            try {
                this.LLIZ = (MessageQueue) C1963407ma.LIZ(Looper.class, "mQueue").get(Looper.getMainLooper());
                this.LLJ = C1963407ma.LIZ(MessageQueue.class, "mMessages");
                this.LLIZLLLIL = C1963407ma.LIZ(Message.class, "next");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AnonymousClass0888.LIZ();
                return;
            }
        }
        if (this.LLILZLL) {
            BarrierMonitor.LIZLLL.LIZIZ();
        }
        try {
        } catch (Exception e2) {
            e = e2;
            jMax = 2000;
        }
        synchronized (this.LLIZ) {
            try {
                Message message2 = (Message) this.LLJ.get(this.LLIZ);
                message = null;
                if (message2 == null || !this.LLILZLL) {
                    iLIZJ = -1;
                    if (message2 == null) {
                    }
                    C786410Ut5.LJLIIL(jMax, this.LL, this);
                }
                iLIZJ = BarrierMonitor.LIZLLL.LIZJ(new WeakReference<>(message2));
                do {
                    if (C088G.LIZIZ(message2)) {
                        Message messageObtain = Message.obtain(message2);
                        message2.what = -message2.what;
                        Message messageObtain2 = Message.obtain(this.LL);
                        messageObtain2.obj = messageObtain;
                        C786410Ut5.LJLJL(this.LL, messageObtain2, message2.getWhen());
                        message = message2;
                    }
                    message2 = (Message) this.LLIZLLLIL.get(message2);
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
        C786410Ut5.LJLIIL(jMax, this.LL, this);
    }
}
