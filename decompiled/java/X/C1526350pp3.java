package X;

import android.os.Handler;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0pp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526350pp3 implements Handler.Callback {
    public final InterfaceC1526790ppl LL;
    public final Map<Long, C1525690pnz> LLILLJJLI = new ConcurrentHashMap();
    public final InterfaceC1525700po0 LLILLL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }

    public C1526350pp3(InterfaceC1525700po0 interfaceC1525700po0, C1526440ppC c1526440ppC) {
        this.LLILLL = interfaceC1525700po0;
        this.LL = c1526440ppC;
    }
}
