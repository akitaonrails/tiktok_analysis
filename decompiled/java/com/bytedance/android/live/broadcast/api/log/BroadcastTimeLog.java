package com.bytedance.android.live.broadcast.api.log;

import X.C0IJT;
import X.C1C7U;
import X.C474500IjA;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class BroadcastTimeLog {
    public static final Handler LIZ = new BPEAHandler(Looper.getMainLooper()) { // from class: com.bytedance.android.live.broadcast.api.log.BroadcastTimeLog.1
        public HashMap<String, String> LL = new HashMap<>(10);

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("BroadcastTimeLog@9c21.<field>$1");
            int i = message.what;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_performance_anchor_create_room_duration");
                    c474500IjALIZ.LJJIIZI(this.LL);
                    c474500IjALIZ.LIZ();
                    this.LL = new HashMap<>(10);
                }
            } else {
                Pair pair = (Pair) HandlerHook.getMessageObj(message.obj);
                this.LL.put((String) pair.first, (String) pair.second);
            }
            C1C7U.LIZIZ("BroadcastTimeLog@9c21.<field>$1");
        }
    };

    public static void LIZ(String str, String str2) {
        Handler handler = LIZ;
        Message messageObtain = Message.obtain(handler, 2);
        messageObtain.obj = new Pair(str, str2);
        C786410Ut5.LJLJJL(handler, messageObtain);
    }
}
