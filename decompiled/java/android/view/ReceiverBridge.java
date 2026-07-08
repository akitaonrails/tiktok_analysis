package android.view;

import X.C08GB;
import X.C0WZX;
import X.C2179971ATj;
import X.C2204961BRm;
import android.os.Looper;
import android.util.Pair;
import android.view.DisplayEventReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class ReceiverBridge extends DisplayEventReceiver implements Runnable {
    public boolean firstVsync;
    public final C08GB mInjector;
    public final DisplayEventReceiver mOrigin;
    public Method oRunMethod;

    @Override // java.lang.Runnable
    public void run() {
        android_view_ReceiverBridge_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    public void android_view_ReceiverBridge__run$___twin___() {
        DisplayEventReceiver displayEventReceiver = this.mOrigin;
        if (displayEventReceiver != null) {
            try {
                C2204961BRm.a0(this.oRunMethod, displayEventReceiver, new Object[0], new C0WZX("dTF6Tg0zW4TKXFI2CyCBZVuiHPmujL+8kymH", null));
            } catch (IllegalAccessException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void scheduleVsync() {
        super.scheduleVsync();
    }

    public static void android_view_ReceiverBridge_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ReceiverBridge receiverBridge) {
        try {
            receiverBridge.android_view_ReceiverBridge__run$___twin___();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public void onVsync(long j, int i) {
        if (this.firstVsync) {
            this.firstVsync = false;
            this.mOrigin.dispose();
        }
        this.mOrigin.onVsync(j, i);
        this.mInjector.LIZIZ(j, i);
    }

    public void onVsync(long j, long j2, int i) {
        if (this.firstVsync) {
            this.firstVsync = false;
            this.mOrigin.dispose();
        }
        this.mOrigin.onVsync(j, j2, i);
        this.mInjector.LIZIZ(j, i);
    }

    public void onVsync(long j, int i, int i2) {
        if (this.firstVsync) {
            this.firstVsync = false;
            this.mOrigin.dispose();
        }
        this.mOrigin.onVsync(j, i, i2);
        this.mInjector.LIZIZ(j, i2);
    }

    public ReceiverBridge(Looper looper, Object obj, Pair<Method, Method> pair, C08GB c08gb) {
        super(looper, 0, 0);
        if (obj instanceof DisplayEventReceiver) {
            this.mOrigin = (DisplayEventReceiver) obj;
            this.oRunMethod = (Method) pair.second;
            this.mInjector = c08gb;
            return;
        }
        throw new RuntimeException("origin is not DisplayEventReceiver");
    }

    public void onVsync(long j, long j2, int i, DisplayEventReceiver.VsyncEventData vsyncEventData) {
        if (this.firstVsync) {
            this.firstVsync = false;
            this.mOrigin.dispose();
        }
        this.mOrigin.onVsync(j, j2, i, vsyncEventData);
        this.mInjector.LIZIZ(j, i);
    }
}
