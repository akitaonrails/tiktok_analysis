package X;

import android.os.Message;

/* JADX INFO: renamed from: X.08Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075908Bh implements InterfaceC20666087s {
    public static volatile boolean LL;
    public static final C2075908Bh LLILLJJLI = new C2075908Bh();
    public static volatile boolean LLILLL = false;

    @Override // X.InterfaceC20666087s
    public final void messageDispatchStarting(String str) {
    }

    public static boolean LIZ(Message message) {
        int i;
        if (message == null || message.getTarget() == null || !message.getTarget().getClass().getName().contains("ActivityThread") || ((i = message.what) != 159 && i != 160)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC20666087s
    public final void messageDispatched(String str, Message message) {
        if (!LLILLL && LIZ(message)) {
            LLILLL = true;
        }
    }
}
