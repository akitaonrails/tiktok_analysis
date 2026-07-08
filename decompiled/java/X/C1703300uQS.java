package X;

import X.C1238730iL9;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0uQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703300uQS<T extends C1238730iL9> {
    public T LIZ;
    public String LIZIZ;
    public Integer LIZJ;
    public Boolean LIZLLL;
    public Map<String, String> LJ;

    public final void LIZ(int i) {
        this.LIZJ = Integer.valueOf(i);
    }

    public final void LIZIZ(String str) {
        if (this.LJ == null) {
            this.LJ = new LinkedHashMap();
        }
        Map<String, String> map = this.LJ;
        if (map != null) {
            map.put("region", str);
        }
    }
}
