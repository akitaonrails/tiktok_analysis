package X;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.08Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2123108Tl {
    public static final ScheduledExecutorService LIZ;

    static {
        C2123408To c2123408To = new C2123408To(C0WQX.SCHEDULED);
        c2123408To.LIZIZ = "client-ai";
        c2123408To.LIZJ = 1;
        c2123408To.LJFF = 600L;
        LIZ = (ScheduledExecutorService) C823050WQl.LIZ(new C2123508Tp(c2123408To));
    }
}
