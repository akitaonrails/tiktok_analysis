package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.player.sdk.v3.MsgHandler;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C83, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C83 {
    public static final C0C83 INS;
    public static final /* synthetic */ C0C83[] LLILLL;
    public final MsgHandler LL = new MsgHandler(Looper.getMainLooper());
    public MsgHandler LLILLJJLI;

    static {
        C0C83 c0c83 = new C0C83();
        INS = c0c83;
        LLILLL = new C0C83[]{c0c83};
    }

    public static C0C83[] values() {
        return (C0C83[]) LLILLL.clone();
    }

    public void init() {
        HandlerThread handlerThread = new HandlerThread("player_msg_dispatcher", ((Number) C1474810oTv.O3.getValue()).intValue());
        handlerThread.start();
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new MsgHandler(C786410Ut5.W2(handlerThread));
        }
    }

    public static C0C83 valueOf(String str) {
        return (C0C83) C08FF.LIZ(C0C83.class, str);
    }

    public void runOnMain(Runnable runnable) {
        MsgHandler msgHandler = this.LL;
        C0C2X c0c2x = new C0C2X();
        c0c2x.LIZ = runnable;
        Message messageObtain = Message.obtain();
        messageObtain.obj = new C0C2W(c0c2x.LIZ);
        C786410Ut5.LJLJJLL(msgHandler, messageObtain);
    }

    public void runOnMsg(Runnable runnable) {
        C786410Ut5.LJJZZIII(this.LLILLJJLI, runnable);
    }

    public C0C83 waitRunOnCurrent(Runnable runnable) {
        runnable.run();
        return this;
    }

    public <T> T waitRunOnMain(final Callable<T> callable) {
        final ArrayList arrayList = new ArrayList();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C786410Ut5.LJLJJLL(new BPEAHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: X.0C84
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                try {
                    arrayList.add(callable.call());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                countDownLatch.countDown();
                return true;
            }
        }), Message.obtain());
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arrayList.size() > 0) {
            return (T) ListProtector.get(arrayList, 0);
        }
        return null;
    }

    public C0C83 waitRunOnMain(Runnable runnable) {
        waitRunOn(Looper.getMainLooper(), runnable);
        return this;
    }

    public C0C83 waitRunOn(Looper looper, final Runnable runnable) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C786410Ut5.LJLJJLL(new BPEAHandler(looper, new Handler.Callback() { // from class: X.0C85
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                runnable.run();
                countDownLatch.countDown();
                return true;
            }
        }), Message.obtain());
        try {
            countDownLatch.await();
            return this;
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            return this;
        }
    }
}
