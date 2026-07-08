package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0b83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961530b83 {
    public static final void LIZ(C955670ayb c955670ayb, C961640b8E c961640b8E, C961660b8G c961660b8G, String str) {
        C961720b8M c961720b8M = (C961720b8M) ((LinkedHashMap) c961640b8E.LIZIZ).get(str);
        if (c961720b8M == null) {
            if (c961660b8G != null) {
                c961720b8M = new C961720b8M(c961660b8G, str);
                c961640b8E.LIZIZ.put(str, c961720b8M);
            } else {
                c961720b8M = null;
            }
        }
        c955670ayb.LIZLLL = c961720b8M;
    }
}
