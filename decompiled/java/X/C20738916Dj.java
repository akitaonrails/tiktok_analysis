package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.16Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20738916Dj {
    public final C20739116Dl LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public C20738916Dj(C20739116Dl c20739116Dl) {
        this.LIZ = c20739116Dl;
    }

    public final void LIZ(EnumC1757150vpJ enumC1757150vpJ) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ(linkedHashMap);
        linkedHashMap.put("close_type", enumC1757150vpJ.toString());
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_mini_window_close", linkedHashMap);
        if (this.LIZIZ == 0) {
            this.LIZIZ = 0L;
            this.LIZJ = 0L;
            this.LIZLLL = 0L;
            this.LJ = 0L;
            this.LJFF = 0L;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        if (j > j2) {
            this.LJ += jCurrentTimeMillis - j;
        } else {
            this.LJFF += jCurrentTimeMillis - j2;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LJ(linkedHashMap2);
        linkedHashMap2.put("close_type", enumC1757150vpJ.toString());
        linkedHashMap2.put("total_duration", Long.valueOf(jCurrentTimeMillis - this.LIZIZ));
        linkedHashMap2.put("play_duration", Long.valueOf(this.LJ));
        linkedHashMap2.put("pause_duration", Long.valueOf(this.LJFF));
        int loopCount = 0;
        linkedHashMap2.put("error_stage_duration", 0);
        WeakReference<C20738716Dh> weakReference = C20738716Dh.LJIIIIZZ;
        InterfaceC1508380pM4 interfaceC1508380pM4LIZ = C1508320pLy.LIZ();
        if (interfaceC1508380pM4LIZ != null) {
            loopCount = interfaceC1508380pM4LIZ.getLoopCount();
        }
        linkedHashMap2.put("loop_count", Integer.valueOf(loopCount));
        C1507790pL7.LIZ("tiktokec_mini_window_duration", linkedHashMap2);
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
    }

    public final void LIZIZ(String str) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ(linkedHashMap);
        linkedHashMap.put("module_name", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_module_click", linkedHashMap);
    }

    public final void LIZJ(String str) {
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ(linkedHashMap);
        linkedHashMap.put("module_name", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_module_show", linkedHashMap);
    }

    public final void LIZLLL(boolean z) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LIZIZ == 0) {
            this.LIZIZ = jCurrentTimeMillis;
            this.LIZJ = jCurrentTimeMillis;
        }
        long j = this.LIZLLL;
        if (j > 0) {
            this.LIZJ = jCurrentTimeMillis;
            long j2 = this.LIZJ;
            if (j2 > 0) {
                this.LJFF += j2 - j;
            }
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJ(linkedHashMap);
        if (z) {
            str = "manual";
        } else {
            str = "auto";
        }
        linkedHashMap.put("play_type", str);
        c1507790pL7.getClass();
        C1507790pL7.LIZ("tiktokec_mini_window_play", linkedHashMap);
    }

    public final void LJ(Map<String, Object> map) {
        C20739116Dl c20739116Dl = this.LIZ;
        if (c20739116Dl != null) {
            map.putAll(c20739116Dl.LJFF);
            map.put("page_name", c20739116Dl.LIZIZ);
            map.put("enter_from", c20739116Dl.LIZ);
            map.put("previous_page", c20739116Dl.LIZJ);
            map.put("author_id", c20739116Dl.LIZLLL);
            map.put("is_ad", Integer.valueOf(c20739116Dl.LJ ? 1 : 0));
        }
    }
}
