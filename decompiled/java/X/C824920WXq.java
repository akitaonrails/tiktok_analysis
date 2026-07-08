package X;

import android.content.ComponentName;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824920WXq extends C0W50 {
    public static C817470W4z LL;
    public static C0W59 LLILLJJLI;
    public static final ReentrantLock LLILLL = new ReentrantLock();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // X.C0W50
    public final void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z) {
        C817470W4z c817470W4z2;
        c817470W4z.LIZLLL();
        LL = c817470W4z;
        ReentrantLock reentrantLock = LLILLL;
        reentrantLock.lock();
        if (LLILLJJLI == null && (c817470W4z2 = LL) != null) {
            LLILLJJLI = c817470W4z2.LIZJ(null);
        }
        reentrantLock.unlock();
    }
}
