package X;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664370Q4d {
    public long LJIIIIZZ;
    public transient Exception LJIIJJI;
    public String LJIIL;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public String LJ = "";
    public String LJFF = "";
    public int LJI = -1;
    public String LJII = "";
    public TreeMap<Long, String> LJIIIZ = new TreeMap<>();
    public List<? extends Map<String, ? extends Object>> LJIIJ = new ArrayList();

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("crosstalk_id", this.LIZ);
        linkedHashMap.put("search_session_id", this.LIZIZ);
        linkedHashMap.put("search_id", this.LIZJ);
        linkedHashMap.put("enter_from", this.LIZLLL);
        linkedHashMap.put("search_type", this.LJ);
        linkedHashMap.put("card_type", this.LJFF);
        linkedHashMap.put("rank", String.valueOf(this.LJI));
        linkedHashMap.put("aweme_id", this.LJII);
        linkedHashMap.put("play_timestamp", String.valueOf(this.LJIIIIZZ));
        linkedHashMap.put("operation_events", this.LJIIIZ.toString());
        linkedHashMap.put("all_player_infos", this.LJIIJ.toString());
        String stackTraceString = this.LJIIL;
        if (stackTraceString == null) {
            stackTraceString = Log.getStackTraceString(this.LJIIJJI);
            this.LJIIL = stackTraceString;
        }
        linkedHashMap.put("call_stack", stackTraceString);
        return linkedHashMap;
    }

    public final int hashCode() {
        return (((((((((((this.LJI * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJII.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C664370Q4d.class, cls)) {
            return false;
        }
        C664370Q4d c664370Q4d = (C664370Q4d) obj;
        if (this.LJI == c664370Q4d.LJI && Intrinsics.LJFF(this.LIZIZ, c664370Q4d.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c664370Q4d.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c664370Q4d.LIZLLL) && Intrinsics.LJFF(this.LJ, c664370Q4d.LJ) && Intrinsics.LJFF(this.LJFF, c664370Q4d.LJFF) && Intrinsics.LJFF(this.LJII, c664370Q4d.LJII)) {
            return true;
        }
        return false;
    }
}
