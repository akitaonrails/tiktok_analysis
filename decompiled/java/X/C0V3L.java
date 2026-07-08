package X;

import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V3L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V3L implements C0N5S, InterfaceC20666087s {
    public C0V3N LL;

    @Override // X.C0N5S
    public final void LJIIJJI() {
        C20665087r c20665087r;
        this.LL = null;
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) || (c20665087r = C20664087q.LJII) == null) {
            return;
        }
        c20665087r.removeMessageObserver(this);
    }

    @Override // X.C0N5S
    public final void LJFF(C0V3N c0v3n) {
        C20665087r c20665087r;
        this.LL = c0v3n;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()) && (c20665087r = C20664087q.LJII) != null) {
            c20665087r.addMessageObserver(this);
        }
    }

    @Override // X.InterfaceC20666087s
    public final void messageDispatchStarting(String str) {
        C0V3N c0v3n = this.LL;
        if (c0v3n != null) {
            c0v3n.LIZ();
        }
    }

    @Override // X.InterfaceC20666087s
    public final void messageDispatched(String str, Message message) {
        C0V3N c0v3n = this.LL;
        if (c0v3n != null) {
            c0v3n.LIZIZ();
        }
    }
}
