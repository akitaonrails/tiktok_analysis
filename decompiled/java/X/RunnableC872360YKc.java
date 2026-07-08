package X;

import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.im.core.client.configs.ReportTaskInfoConfig;
import com.bytedance.im.core.internal.utils.WeakHandler;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0YKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class RunnableC872360YKc<T> implements Runnable, C0YE4 {
    public final InterfaceC872410YKh<T> LL;
    public final InterfaceC864800XwE<T> LLILLJJLI;
    public final C0YFS LLILLL;
    public T LLILZ;
    public final Executor LLILZLL;
    public final ReportTaskInfoConfig LLIZ;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public Throwable LLJILLL;
    public Throwable LLJJ;
    public final C868780Y6i LLJJI;
    public final C0YLL LLJJIII;
    public final C0YJA LLJJIJI;
    public final C872370YKd LLJJIJIIJIL;
    public final WeakHandler LLILZIL = new WeakHandler(Looper.getMainLooper(), this);
    public final long LLIZLLLIL = SystemClock.uptimeMillis();

    public final void LIZIZ() {
        T tLIZ;
        this.LLILZIL.removeMessages(100002);
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.LLJI = jUptimeMillis - this.LLIZLLLIL;
        InterfaceC872410YKh<T> interfaceC872410YKh = this.LL;
        if (interfaceC872410YKh != null) {
            try {
                tLIZ = interfaceC872410YKh.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJJI.LJIIIZ("Task run", e);
                this.LLJILLL = e;
                this.LLJJIII.LJ(e);
                tLIZ = null;
            }
        } else {
            tLIZ = null;
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        this.LLJ = jUptimeMillis2;
        this.LLJIJIL = jUptimeMillis2 - jUptimeMillis;
        this.LLILZ = tLIZ;
        if (this.LLILZIL != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100001;
            messageObtain.obj = this;
            this.LLILZIL.sendMessage(messageObtain);
        }
    }

    public final void LJFF() {
        if (this.LLILZIL != null && this.LLIZ.enable == 1) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100002;
            messageObtain.obj = this;
            this.LLILZIL.sendMessageDelayed(messageObtain, this.LLIZ.timeoutDurationMs);
        }
        try {
            this.LLILZLL.execute(this);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLJJ = e;
            this.LLJJI.LJIIIZ("Task start", e);
            this.LLJJIII.LJ(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("Task@61ba.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Task@61ba.run");
    }

    public static String LIZJ(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 2048) {
            return stackTraceString.substring(0, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
        return stackTraceString;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C0YJ9 r8) {
        /*
            r7 = this;
            java.util.concurrent.Executor r1 = r7.LLILZLL
            boolean r0 = r1 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r0 == 0) goto L79
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            java.util.concurrent.BlockingQueue r0 = r1.getQueue()
            int r0 = r0.size()
            long r1 = (long) r0
            java.util.concurrent.Executor r0 = r7.LLILZLL
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            long r5 = r0.getTaskCount()
        L19:
            X.0YKd r4 = r7.LLJJIJIIJIL
            java.util.concurrent.Executor r3 = r7.LLILZLL
            if (r3 != 0) goto L5d
            r4.getClass()
        L22:
            java.lang.String r3 = "unknown"
        L24:
            java.lang.String r0 = "executor_name"
            r8.LIZ(r3, r0)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "processor_count"
            r8.LIZ(r3, r0)
            java.lang.String r3 = "work_queue_size"
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r8.LIZ(r0, r3)
            java.lang.String r1 = "task_count"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r8.LIZ(r0, r1)
            X.0YKh<T> r0 = r7.LL
            if (r0 != 0) goto L58
            java.lang.String r1 = "null"
        L52:
            java.lang.String r0 = "task_name"
            r8.LIZ(r1, r0)
            return
        L58:
            java.lang.String r1 = r0.toString()
            goto L52
        L5d:
            java.util.concurrent.ExecutorService r0 = r4.LIZJ
            if (r3 != r0) goto L64
            java.lang.String r3 = "default"
            goto L24
        L64:
            java.util.concurrent.ExecutorService r0 = r4.LIZIZ
            if (r3 != r0) goto L6b
            java.lang.String r3 = "receive"
            goto L24
        L6b:
            java.util.concurrent.ExecutorService r0 = r4.LIZ
            if (r3 != r0) goto L72
            java.lang.String r3 = "send"
            goto L24
        L72:
            java.util.concurrent.ExecutorService r0 = r4.LIZLLL
            if (r3 != r0) goto L22
            java.lang.String r3 = "event"
            goto L24
        L79:
            r1 = 0
            r5 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC872360YKc.LIZ(X.0YJ9):void");
    }

    public final void LJ(String str) {
        boolean z;
        C0YJA c0yja = this.LLJJIJI;
        if (c0yja == null) {
            return;
        }
        C0YJ9 c0yj9 = new C0YJ9(c0yja);
        c0yj9.LIZJ(str);
        LIZ(c0yj9);
        c0yj9.LIZ(Long.valueOf(this.LLJI), "wait_executor_cost");
        c0yj9.LIZ(Long.valueOf(this.LLJIJIL), "execute_cost");
        c0yj9.LIZ(Long.valueOf(this.LLJILJIL), "wait_main_thread_cost");
        c0yj9.LIZ(Long.valueOf(this.LLJILJILJ), "execute_callback_cost");
        String str2 = "unknown";
        String str3 = "1";
        if (this.LLJILLL != null) {
            c0yj9.LIZ("1", "execute_error");
            String message = this.LLJILLL.getMessage();
            if (message == null) {
                message = "unknown";
            }
            c0yj9.LIZ(message, "error_msg");
            c0yj9.LIZ(LIZJ(this.LLJILLL), "error_stack");
            z = true;
        } else {
            c0yj9.LIZ(CardStruct.IStatusCode.DEFAULT, "execute_error");
            z = false;
        }
        if (this.LLJJ != null) {
            c0yj9.LIZ("1", "execute_callback_error");
            String message2 = this.LLJJ.getMessage();
            if (message2 != null) {
                str2 = message2;
            }
            c0yj9.LIZ(str2, "error_msg");
            c0yj9.LIZ(LIZJ(this.LLJJ), "error_stack");
        } else {
            c0yj9.LIZ(CardStruct.IStatusCode.DEFAULT, "execute_callback_error");
            if (!z) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        }
        c0yj9.LIZ(str3, "has_error");
        c0yj9.LJFF();
    }

    @Override // X.C0YE4
    public final void handleMsg(Message message) {
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        C0YJA c0yja;
        if (!(HandlerHook.getMessageObj(message.obj) instanceof RunnableC872360YKc)) {
        }
        RunnableC872360YKc runnableC872360YKc = (RunnableC872360YKc) HandlerHook.getMessageObj(message.obj);
        switch (message.what) {
            case 100001:
                long jUptimeMillis = SystemClock.uptimeMillis();
                this.LLJILJIL = jUptimeMillis - this.LLJ;
                ((C0YFA) this.LLILLL).LIZ.LIZ.remove(Integer.valueOf(runnableC872360YKc.hashCode()));
                InterfaceC864800XwE<T> interfaceC864800XwE = runnableC872360YKc.LLILLJJLI;
                if (interfaceC864800XwE != null) {
                    try {
                        interfaceC864800XwE.LIZ(runnableC872360YKc.LLILZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLJJ = e;
                        this.LLJJI.LJIIIZ("Task handleMsg", e);
                        this.LLJJIII.LJ(e);
                    }
                }
                this.LLJILJILJ = SystemClock.uptimeMillis() - jUptimeMillis;
                if (this.LLIZ.enable != 0) {
                    final boolean zLIZJ = this.LLJJIII.LIZJ(0.001f);
                    if (this.LLJIJIL > this.LLIZ.executeTooLongMs && this.LLJJIII.LIZJ(1.0f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.LLJILJILJ > this.LLIZ.callbackTooLongMs && this.LLJJIII.LIZJ(1.0f)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.LLJILLL != null && this.LLJJIII.LIZJ(1.0f)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (this.LLJJ != null && this.LLJJIII.LIZJ(1.0f)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (zLIZJ || z || z2 || z3 || z4) {
                        final WeakReference weakReference = new WeakReference(this);
                        this.LLJJIJIIJIL.LIZIZ().execute(new Runnable() { // from class: X.0YKe
                            public final void LIZ() {
                                RunnableC872360YKc runnableC872360YKc2 = (RunnableC872360YKc) weakReference.get();
                                if (runnableC872360YKc2 == null) {
                                    return;
                                }
                                try {
                                    if (zLIZJ) {
                                        runnableC872360YKc2.LJ("im_sdk_task_info");
                                    }
                                    if (z) {
                                        runnableC872360YKc2.LJ("im_sdk_task_execute_too_long");
                                    }
                                    if (z2) {
                                        runnableC872360YKc2.LJ("im_sdk_task_callback_too_long");
                                    }
                                    if (z3) {
                                        runnableC872360YKc2.LIZLLL("im_sdk_task_execute_error", runnableC872360YKc2.LLJILLL);
                                    }
                                    if (z4) {
                                        runnableC872360YKc2.LIZLLL("im_sdk_task_callback_error", runnableC872360YKc2.LLJJ);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("Task@61ba.reportTaskInfo$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("Task@61ba.reportTaskInfo$1");
                            }
                        });
                    }
                }
                break;
            case 100002:
                this.LLILZIL.removeMessages(100002);
                try {
                    if (this.LLIZ.enable != 0 && this.LLJJIII.LIZJ(1.0f) && (c0yja = this.LLJJIJI) != null) {
                        C0YJ9 c0yj9 = new C0YJ9(c0yja);
                        c0yj9.LIZJ("im_sdk_task_wait_execute_timeout");
                        LIZ(c0yj9);
                        c0yj9.LJFF();
                        break;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
                break;
            case 100003:
                LJFF();
                break;
        }
    }

    public final void LIZLLL(String str, Throwable th) {
        String string;
        C0YJA c0yja = this.LLJJIJI;
        if (c0yja == null) {
            return;
        }
        C0YJ9 c0yj9 = new C0YJ9(c0yja);
        c0yj9.LIZJ(str);
        String message = th.getMessage();
        if (message == null) {
            message = "unknown";
        }
        c0yj9.LIZ(message, "error_msg");
        c0yj9.LIZ(LIZJ(th), "error_stack");
        InterfaceC872410YKh<T> interfaceC872410YKh = this.LL;
        if (interfaceC872410YKh == null) {
            string = "null";
        } else {
            string = interfaceC872410YKh.toString();
        }
        c0yj9.LIZ(string, "task_name");
        c0yj9.LJFF();
    }

    public RunnableC872360YKc(C868780Y6i c868780Y6i, C0YLL c0yll, C0YJA c0yja, C872370YKd c872370YKd, ReportTaskInfoConfig reportTaskInfoConfig, InterfaceC872410YKh interfaceC872410YKh, InterfaceC864800XwE interfaceC864800XwE, Executor executor, C0YFA c0yfa) {
        this.LLJJI = c868780Y6i;
        this.LLJJIII = c0yll;
        this.LLJJIJI = c0yja;
        this.LLJJIJIIJIL = c872370YKd;
        this.LL = interfaceC872410YKh;
        this.LLILLJJLI = interfaceC864800XwE;
        this.LLILZLL = executor;
        this.LLIZ = reportTaskInfoConfig;
        this.LLILLL = c0yfa;
    }
}
