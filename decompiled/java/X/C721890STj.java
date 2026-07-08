package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0STj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721890STj extends C09AY implements Function0<Handler> {
    public final /* synthetic */ C721850STf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C721890STj(C721850STf c721850STf) {
        super(0);
        this.LL = c721850STf;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Handler invoke() {
        Looper mainLooper = Looper.getMainLooper();
        final C721850STf c721850STf = this.LL;
        return new BPEAHandler(mainLooper, new Handler.Callback() { // from class: X.0STi
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                String str;
                c721850STf.getClass();
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if ((messageObj instanceof String) && (str = (String) messageObj) != null) {
                    int i = message.what;
                    if (i != 1003) {
                        if (i != 1005) {
                            if (i != 1008) {
                                if (i != 1010) {
                                    if (i != 1030) {
                                        if (i == 1060) {
                                            C721850STf.LJI("video_play_60", C0RY8.LIZ(str));
                                            return true;
                                        }
                                        return true;
                                    }
                                    C721850STf.LJI("video_play_30", C0RY8.LIZ(str));
                                    return true;
                                }
                                C721850STf.LJI("video_play_10", C0RY8.LIZ(str));
                                return true;
                            }
                            C721850STf.LJI("video_play_8", C0RY8.LIZ(str));
                            return true;
                        }
                        C721850STf.LJI("video_play_5", C0RY8.LIZ(str));
                        return true;
                    }
                    C721850STf.LJI("video_play_3", C0RY8.LIZ(str));
                    return true;
                }
                return false;
            }
        });
    }
}
