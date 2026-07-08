package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WZW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WZW {
    public final boolean LIZ;
    public final String LIZIZ;
    public Map<String, Object> LIZJ;
    public final String LIZLLL;
    public final String[] LJ;
    public C0WS7 LJFF;
    public boolean LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtraInfo{isReflection=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", parameterSignature='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hashOfCallSiteClass='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", codePointTags=");
        sbLIZ.append(Arrays.toString(this.LJ));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0WZW(String str) {
        this.LIZJ = new HashMap();
        this.LJI = false;
        this.LIZ = false;
        this.LIZIZ = str;
    }

    public final Object LIZIZ(String str) {
        Map<String, Object> map = this.LIZJ;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.LIZJ.get(str);
    }

    public C0WZW(String str, int i) {
        this.LIZJ = new HashMap();
        this.LJI = false;
        this.LIZ = false;
        this.LIZIZ = "";
        this.LIZLLL = str;
    }

    public final void LIZ(Object obj, String str) {
        if (this.LIZJ == null) {
            this.LIZJ = new HashMap();
        }
        this.LIZJ.put(str, obj);
    }

    public C0WZW(String str, Map map) {
        new HashMap();
        this.LJI = false;
        this.LIZ = false;
        this.LIZIZ = "";
        this.LIZJ = map;
        this.LIZLLL = str;
    }

    public C0WZW(boolean z, String str, C0WZX c0wzx) {
        this.LIZJ = new HashMap();
        this.LJI = false;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZLLL = c0wzx.LIZ;
        this.LJ = c0wzx.LIZIZ;
    }
}
