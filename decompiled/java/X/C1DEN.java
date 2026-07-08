package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DEN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DEN {
    public static final C1DEM<Object> LIZ = new C1DEM<>(-1, null, null, 0);
    public static final int LIZIZ = C1992307rF.LIZIZ("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int LIZJ = C1992307rF.LIZIZ("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final C09AU LIZLLL = new C09AU("BUFFERED");
    public static final C09AU LJ = new C09AU("SHOULD_BUFFER");
    public static final C09AU LJFF = new C09AU("S_RESUMING_BY_RCV");
    public static final C09AU LJI = new C09AU("RESUMING_BY_EB");
    public static final C09AU LJII = new C09AU("POISONED");
    public static final C09AU LJIIIIZZ = new C09AU("DONE_RCV");
    public static final C09AU LJIIIZ = new C09AU("INTERRUPTED_SEND");
    public static final C09AU LJIIJ = new C09AU("INTERRUPTED_RCV");
    public static final C09AU LJIIJJI = new C09AU("CHANNEL_CLOSED");
    public static final C09AU LJIIL = new C09AU("SUSPEND");
    public static final C09AU LJIILIIL = new C09AU("SUSPEND_NO_WAITER");
    public static final C09AU LJIILJJIL = new C09AU("FAILED");
    public static final C09AU LJIILL = new C09AU("NO_RECEIVE_RESULT");
    public static final C09AU LJIILLIIL = new C09AU("CLOSE_HANDLER_CLOSED");
    public static final C09AU LJIIZILJ = new C09AU("CLOSE_HANDLER_INVOKED");
    public static final C09AU LJIJ = new C09AU("NO_CLOSE_CAUSE");

    public static final <T> boolean LIZ(InterfaceC20236714Gf<? super T> interfaceC20236714Gf, T t, Function1<? super Throwable, Unit> function1) {
        C09AU c09auLJJIIJZLJL = interfaceC20236714Gf.LJJIIJZLJL(function1, t);
        if (c09auLJJIIJZLJL != null) {
            interfaceC20236714Gf.LJIIL(c09auLJJIIJZLJL);
            return true;
        }
        return false;
    }
}
