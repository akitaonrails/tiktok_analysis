package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZJ {
    public int LIZ;
    public final Object LIZIZ;
    public final Object[] LIZJ;
    public final String LIZLLL;
    public final C0WZW LJFF;
    public C0WSC LJIIIIZZ;
    public final Object LJ = null;
    public Map<String, C0WR6> LJI = null;
    public String LJII = null;
    public C0WZM LJIIIZ = null;

    public final void LIZ(String str, C0WR6 c0wr6) {
        if (this.LJI == null) {
            this.LJI = new LinkedHashMap();
        }
        Map<String, C0WR6> map = this.LJI;
        if (map != null) {
            map.put(str, c0wr6);
        }
    }

    public C0WZJ(int i, Object obj, Object[] objArr, String str, C0WZW c0wzw, C0WS7 c0ws7) {
        this.LIZ = i;
        this.LIZIZ = obj;
        this.LIZJ = objArr;
        this.LIZLLL = str;
        this.LJFF = c0wzw;
        this.LJIIIIZZ = c0ws7;
    }
}
