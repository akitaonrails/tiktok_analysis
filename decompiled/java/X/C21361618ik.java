package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18ik, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21361618ik {
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIJ;
    public String LIZ = "";
    public long LIZIZ = -1;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;
    public String LJIIIIZZ = "";
    public boolean LJIIIZ = true;

    public final Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("type", this.LIZ);
        linkedHashMap.put("query_count", String.valueOf(this.LJFF));
        linkedHashMap.put("show_count", String.valueOf(this.LJI));
        linkedHashMap.put("hit_cache", String.valueOf(this.LJII));
        linkedHashMap.put("sticker_id", this.LJIIIIZZ);
        linkedHashMap.put("resource_id", this.LJIIIIZZ);
        linkedHashMap.put("need_scan", String.valueOf(this.LJIIJ));
        if (Intrinsics.LJFF(this.LIZ, "pic")) {
            linkedHashMap.put("query_material_duration", String.valueOf(this.LIZJ - this.LIZIZ));
            if (this.LJIIJ) {
                linkedHashMap.put("first_show_duration", String.valueOf(this.LJ - this.LIZIZ));
            }
        }
        linkedHashMap.put("show_duration", String.valueOf(this.LIZLLL - this.LIZIZ));
        return linkedHashMap;
    }

    public final void LIZIZ() {
        this.LIZ = "";
        this.LIZIZ = -1L;
        this.LIZJ = -1L;
        this.LJ = -1L;
        this.LIZLLL = -1L;
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = false;
        this.LJIIIIZZ = "";
        this.LJIIIZ = true;
        this.LJIIJ = false;
    }

    public final boolean LIZJ() {
        return this.LJIIIZ && this.LJIIIIZZ.length() > 0 && this.LIZIZ > 0;
    }
}
