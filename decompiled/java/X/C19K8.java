package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.19K8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19K8 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C19K9());

    public static void LIZ(C19KC c19kc) {
        C19K7 c19k7;
        if (c19kc != null && (c19k7 = (C19K7) LIZ.getValue()) != null) {
            ((ArrayList) c19k7.LLILLJJLI).remove(c19kc);
            if (((ArrayList) c19k7.LLILLJJLI).isEmpty() && c19k7.LLILLL) {
                C786410Ut5.v2().removeFrameCallback(c19k7);
                c19k7.LLILLL = false;
                c19k7.LIZJ();
            }
        }
    }
}
