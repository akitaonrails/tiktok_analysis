package com.bytedance.adsdk.ugeno.utils;

import X.C1C7U;
import X.InterfaceC1050080dQs;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes17.dex */
public class WeakHandler extends BPEAHandler {
    public final WeakReference<InterfaceC1050080dQs> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakHandler@97d2.handleMessage");
        InterfaceC1050080dQs interfaceC1050080dQs = this.LL.get();
        if (interfaceC1050080dQs != null && message != null) {
            interfaceC1050080dQs.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakHandler@97d2.handleMessage");
    }

    public WeakHandler(Looper looper, InterfaceC1050080dQs interfaceC1050080dQs) {
        super(looper);
        this.LL = new WeakReference<>(interfaceC1050080dQs);
    }
}
