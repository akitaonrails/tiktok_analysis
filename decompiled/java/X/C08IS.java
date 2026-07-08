package X;

import java.util.Random;

/* JADX INFO: renamed from: X.08IS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IS {
    public static final void LIZ(Throwable th) {
        if (C2187451AjH.LJIIJ() || new Random().nextFloat() < 0.005f) {
            if ("frameArray".equals(th.getMessage())) {
                C1AF0.LJFF(th, "frameArray");
            } else {
                C1AF0.LJFF(th, "DoframeController");
            }
        }
    }
}
