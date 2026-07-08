package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0d1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1034340d1U {
    public static final C1025650cnT LIZLLL = new C1025650cnT();
    public static volatile C1034340d1U LJ;
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final BPEAHandler LIZJ;

    public C1034340d1U() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(336));
        this.LIZ = c01gwLIZIZ;
        this.LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(335));
        ((Thread) c01gwLIZIZ.getValue()).start();
        Looper looperW2 = C786410Ut5.W2((HandlerThread) c01gwLIZIZ.getValue());
        if (looperW2 != null) {
            this.LIZJ = new BPEAHandler(looperW2, new Handler.Callback() { // from class: X.0d1V
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    boolean zHasWindowFocus;
                    Window window;
                    View decorView;
                    if (message.what == 100) {
                        Object messageObj = HandlerHook.getMessageObj(message.obj);
                        if (messageObj instanceof RunnableC1029210ctD) {
                            C1034340d1U c1034340d1U = this.LL;
                            RunnableC1029210ctD runnableC1029210ctD = (RunnableC1029210ctD) messageObj;
                            c1034340d1U.getClass();
                            if (runnableC1029210ctD != null) {
                                boolean z = C1BN8.LIZ().LIZ.LIZIZ;
                                Activity topActivity = ActivityStack.getTopActivity();
                                if (topActivity != null && (window = topActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                                    zHasWindowFocus = decorView.hasWindowFocus();
                                } else {
                                    zHasWindowFocus = true;
                                }
                                if (!z && zHasWindowFocus) {
                                    runnableC1029210ctD.LLILZIL.incrementAndGet();
                                    if (runnableC1029210ctD.LLILZIL.get() * ((C1034360d1W) c1034340d1U.LIZIZ.getValue()).LIZ > ((C1034360d1W) c1034340d1U.LIZIZ.getValue()).LIZIZ) {
                                        runnableC1029210ctD.LLILZLL.set(false);
                                        runnableC1029210ctD.run();
                                    } else {
                                        BPEAHandler bPEAHandler = c1034340d1U.LIZJ;
                                        if (bPEAHandler != null) {
                                            Message messageObtainMessage = bPEAHandler.obtainMessage();
                                            messageObtainMessage.what = 100;
                                            messageObtainMessage.obj = runnableC1029210ctD;
                                            C786410Ut5.LJLJLJ(bPEAHandler, messageObtainMessage, ((C1034360d1W) c1034340d1U.LIZIZ.getValue()).LIZ);
                                            return true;
                                        }
                                    }
                                } else {
                                    runnableC1029210ctD.LLIZ.put("is_background", Boolean.valueOf(z));
                                    runnableC1029210ctD.LLIZ.put("has_focus", Boolean.valueOf(zHasWindowFocus));
                                    runnableC1029210ctD.LLILZLL.set(true);
                                    runnableC1029210ctD.run();
                                    return true;
                                }
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    public final void LIZ(String str, C1029220ctE c1029220ctE, Integer num, String str2, Context context) {
        Message messageObtainMessage;
        int iIntValue;
        BPEAHandler bPEAHandler = this.LIZJ;
        if (bPEAHandler != null && (messageObtainMessage = bPEAHandler.obtainMessage()) != null) {
            messageObtainMessage.what = 100;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            messageObtainMessage.obj = new RunnableC1029210ctD(str, c1029220ctE, iIntValue, str2, context);
            messageObtainMessage.sendToTarget();
        }
    }
}
