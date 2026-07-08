package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0mvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415050mvX {
    public static final C1415050mvX LIZ = new C1415050mvX();
    public static final ConcurrentHashMap<String, C1415060mvY> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(String str, String str2) {
        ConcurrentHashMap<String, C1415060mvY> concurrentHashMap = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(str2);
        concurrentHashMap.remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(C1415050mvX c1415050mvX, String str, int i, String str2) {
        c1415050mvX.getClass();
        LIZIZ(i, str, "overall_apply_end", str2, null);
    }

    public static void LIZIZ(int i, String str, String str2, String str3, Integer num) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(str2);
        C1415060mvY c1415060mvYRemove = LIZIZ.remove(C2188811AlT.LIZIZ(sbLIZ));
        if (c1415060mvYRemove == null) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LyricsRuleProbe [Perf.End.");
            sbLIZ2.append(str2);
            sbLIZ2.append("] MISS key=");
            sbLIZ2.append(str);
            sbLIZ2.append(" (no matching start, skip mob)");
            C201955140j.LJIJJ(c1398350mUb, "LyricsRule", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c1415060mvYRemove.LJ;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("LyricsRuleProbe [Perf.End.");
        sbLIZ3.append(str2);
        sbLIZ3.append("] scene=");
        String str4 = c1415060mvYRemove.LIZLLL;
        if (str4 == null) {
            str4 = "-";
        }
        sbLIZ3.append(str4);
        sbLIZ3.append(" duration=");
        sbLIZ3.append(jCurrentTimeMillis);
        sbLIZ3.append(" status=");
        sbLIZ3.append(i);
        sbLIZ3.append(" key=");
        sbLIZ3.append(str);
        C201955140j.LJIILL(c1398350mUb2, "LyricsRule", C2188811AlT.LIZIZ(sbLIZ3));
        C1413500mt2 c1413500mt2 = C1413500mt2.LIZ;
        String str5 = c1415060mvYRemove.LIZ;
        String str6 = c1415060mvYRemove.LIZIZ;
        Integer num2 = c1415060mvYRemove.LIZJ;
        String str7 = c1415060mvYRemove.LIZLLL;
        c1413500mt2.getClass();
        C1413500mt2.LIZ(i, jCurrentTimeMillis, num, num2, str2, str3, str5, str6, str7);
    }

    public static void LJ(C1415050mvX c1415050mvX, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        c1415050mvX.getClass();
        LIZIZ(i, str, "overall_preload_end", str2, null);
    }

    public final void LJI(Integer num, String str, String str2, String str3, String str4) {
        LJFF(this, "overall_apply_start", str2, str3, num, str4, 448);
        LJII(num, str, "overall_apply_end", str2, str3, str4, false);
    }

    public static void LJFF(C1415050mvX c1415050mvX, String str, String str2, String str3, Integer num, String str4, int i) {
        String str5 = str4;
        Integer num2 = num;
        String str6 = str3;
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        c1415050mvX.getClass();
        C1413500mt2.LIZ.getClass();
        C1413500mt2.LIZ(0, 0L, null, num2, str, null, str2, str6, str5);
    }

    public static void LJII(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6 = str5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('#');
        sbLIZ.append(str2);
        LIZIZ.put(C2188811AlT.LIZIZ(sbLIZ), new C1415060mvY(str3, str4, System.currentTimeMillis(), num, str6));
        if (z) {
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LyricsRuleProbe [Perf.Begin.");
            sbLIZ2.append(str2);
            sbLIZ2.append("] scene=");
            if (str6 == null) {
                str6 = "-";
            }
            sbLIZ2.append(str6);
            sbLIZ2.append(" key=");
            sbLIZ2.append(str);
            C201955140j.LJIILL(c1398350mUb, "LyricsRule", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
