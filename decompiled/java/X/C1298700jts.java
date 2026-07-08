package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298700jts extends C1298730jtv {
    public Map<String, Object> LJI;

    public String LIZLLL() {
        return "params";
    }

    public Map<String, Object> LIZJ() {
        return this.LJI;
    }

    public C1298700jts(int i, String str) {
        super(i, str, EnumC1298710jtt.kCustom);
        this.LJI = new HashMap();
    }

    public final void LIZIZ(Object obj, String str) {
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        this.LJI.put(str, obj);
    }

    public C1298700jts(int i, String str, Map<String, Object> map) {
        super(i, str, EnumC1298710jtt.kCustom);
        this.LJI = map;
    }
}
