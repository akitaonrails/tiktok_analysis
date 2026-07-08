package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666110QAv {
    public final int LIZ;
    public final String LIZIZ;
    public C0QGC LIZJ;
    public Map<String, Object> LJFF;
    public Map<String, String> LJI;
    public String LIZLLL = "";
    public String LJ = "";
    public long LJII = System.currentTimeMillis();

    public C666110QAv(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }

    public final void LIZ(String str, String str2) {
        Map linkedHashMap = this.LJI;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.LJI = linkedHashMap;
        }
        linkedHashMap.put(str, str2);
    }

    public final void LIZIZ(Object obj, String str) {
        Map linkedHashMap = this.LJFF;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.LJFF = linkedHashMap;
        }
        linkedHashMap.put(str, obj);
    }
}
