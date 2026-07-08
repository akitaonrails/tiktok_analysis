package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0WkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831940WkK implements Handler.Callback {
    public final InterfaceC832950Wlx LL;
    public final zaq LLIZLLLIL;
    public final ArrayList<InterfaceC832260Wkq> LLILLJJLI = new ArrayList<>();
    public final ArrayList<InterfaceC832260Wkq> LLILLL = new ArrayList<>();
    public final ArrayList<InterfaceC832270Wkr> LLILZ = new ArrayList<>();
    public volatile boolean LLILZIL = false;
    public final AtomicInteger LLILZLL = new AtomicInteger(0);
    public boolean LLIZ = false;
    public final Object LLJ = new Object();

    public final void LIZ(InterfaceC832270Wkr interfaceC832270Wkr) {
        C0W3J.LJIIIIZZ(interfaceC832270Wkr);
        synchronized (this.LLJ) {
            try {
                if (this.LLILZ.contains(interfaceC832270Wkr)) {
                    new StringBuilder(String.valueOf(interfaceC832270Wkr).length() + 67);
                } else {
                    this.LLILZ.add(interfaceC832270Wkr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            InterfaceC832280Wks interfaceC832280Wks = (InterfaceC832280Wks) HandlerHook.getMessageObj(message.obj);
            synchronized (this.LLJ) {
                try {
                    if (this.LLILZIL && this.LL.isConnected() && this.LLILLJJLI.contains(interfaceC832280Wks)) {
                        interfaceC832280Wks.zk(null);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }

    public C831940WkK(Looper looper, C832220Wkm c832220Wkm) {
        this.LL = c832220Wkm;
        this.LLIZLLLIL = new zaq(looper, this);
    }
}
