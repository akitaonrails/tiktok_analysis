package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0cdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019290cdD {
    public static final C1019290cdD LIZ = new C1019290cdD();
    public static final List<InterfaceC1019340cdI> LIZIZ = new ArrayList();

    public final synchronized void LIZ(InterfaceC1019340cdI interfaceC1019340cdI) {
        List<InterfaceC1019340cdI> list = LIZIZ;
        if (((ArrayList) list).contains(interfaceC1019340cdI)) {
            return;
        }
        ((ArrayList) list).add(interfaceC1019340cdI);
    }
}
