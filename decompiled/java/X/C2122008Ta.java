package X;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08Ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2122008Ta extends C09AY implements Function0<ExecutorService> {
    public C2122008Ta() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ExecutorService invoke() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZJ = 1;
        c2123408ToLIZ.LIZIZ = "ChatListActor";
        return C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }
}
