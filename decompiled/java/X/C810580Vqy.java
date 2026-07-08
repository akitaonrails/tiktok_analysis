package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: renamed from: X.0Vqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810580Vqy implements InterfaceC810600Vr0, Handler.Callback {
    public final InterfaceC810600Vr0 LL;
    public BPEAHandler LLILLJJLI;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public C810580Vqy(InterfaceC810600Vr0 interfaceC810600Vr0) {
        this.LL = interfaceC810600Vr0;
    }

    @Override // X.InterfaceC810600Vr0
    public final Bitmap LIZ(C810610Vr1 c810610Vr1) {
        return this.LL.LIZ(c810610Vr1);
    }
}
