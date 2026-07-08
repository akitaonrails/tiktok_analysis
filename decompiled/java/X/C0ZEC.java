package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ZEC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZEC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final int LJI;

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LIZ;
        if (str != null) {
            linkedHashMap.put("position", str);
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            linkedHashMap.put("to_user_id", str2);
        }
        String str3 = this.LIZJ;
        if (str3 != null) {
            linkedHashMap.put("enter_method", str3);
        }
        String str4 = this.LIZLLL;
        if (str4 != null) {
            linkedHashMap.put("page_to_enter", str4);
        }
        Integer num = this.LJ;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("rank_index", this.LJ.toString());
        }
        String str5 = this.LJFF;
        if (str5 != null) {
            linkedHashMap.put("to_group_id", str5);
        }
        return linkedHashMap;
    }

    public C0ZEC(C0ZE7 c0ze7) {
        this.LIZ = c0ze7.LIZIZ;
        this.LIZIZ = c0ze7.LIZJ;
        this.LIZJ = c0ze7.LJ;
        this.LIZLLL = c0ze7.LJFF;
        this.LJ = c0ze7.LJI;
        this.LJFF = c0ze7.LJIIIZ;
        this.LJI = c0ze7.LJIIJ;
    }
}
