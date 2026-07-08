package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0DFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336040DFi {
    public static final C336040DFi LIZ = new C336040DFi();
    public static final Set<String> LIZIZ = new LinkedHashSet();

    public final synchronized void LIZ(String str) {
        LIZIZ.remove(str);
    }

    public final synchronized boolean LIZIZ(String str) {
        return LIZIZ.contains(str);
    }
}
