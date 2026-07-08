package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Noo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C605400Noo {
    public static String LIZIZ;
    public static final C605400Noo LIZ = new C605400Noo();
    public static final Map<String, C617300OJc> LIZJ = new LinkedHashMap();

    public static C617300OJc LIZ(String str) {
        if (!Intrinsics.LJFF(LIZIZ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            LIZ.getClass();
            ((LinkedHashMap) LIZJ).clear();
            LIZIZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
        Object c617300OJc = linkedHashMap.get(str);
        if (c617300OJc == null) {
            c617300OJc = new C617300OJc();
            linkedHashMap.put(str, c617300OJc);
        }
        return (C617300OJc) c617300OJc;
    }
}
