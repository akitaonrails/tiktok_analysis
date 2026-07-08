package X;

import android.app.Application;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820150WFh {
    public static volatile boolean LIZIZ;
    public static Application LIZJ;
    public static final Map<Integer, AbstractC1498210p5f> LJ;
    public static String LJFF;
    public static final C0WJU LIZ = new C0WJU();
    public static final C820160WFi LIZLLL = new InterfaceC820110WFd() { // from class: X.0WFi
        @Override // X.InterfaceC820110WFd
        public final void LIZ() {
            C820150WFh.LIZ.LJII(1, C820150WFh.LIZJ);
        }

        @Override // X.InterfaceC820110WFd
        public final void LIZIZ() {
            C820150WFh.LIZ.LJII(2, C820150WFh.LIZJ);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0WFi] */
    static {
        new ConcurrentHashMap();
        LJ = new ConcurrentHashMap();
    }
}
