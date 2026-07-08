package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0PJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642860PJk {
    public static final C642860PJk LIZ = new C642860PJk();
    public static final Map<Integer, C642890PJn> LIZIZ = new LinkedHashMap();
    public static final Map<Integer, C642880PJm> LIZJ = new LinkedHashMap();
    public static final Map<Integer, C642870PJl> LIZLLL = new LinkedHashMap();

    public static C642870PJl LIZ(int i) {
        Map<Integer, C642870PJl> map = LIZLLL;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c642870PJl = linkedHashMap.get(numValueOf);
        if (c642870PJl == null) {
            c642870PJl = new C642870PJl();
            linkedHashMap.put(numValueOf, c642870PJl);
        }
        return (C642870PJl) c642870PJl;
    }

    public static C642880PJm LIZIZ(int i) {
        Map<Integer, C642880PJm> map = LIZJ;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c642880PJm = linkedHashMap.get(numValueOf);
        if (c642880PJm == null) {
            c642880PJm = new C642880PJm();
            linkedHashMap.put(numValueOf, c642880PJm);
        }
        return (C642880PJm) c642880PJm;
    }
}
