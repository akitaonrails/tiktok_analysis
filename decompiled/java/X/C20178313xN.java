package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13xN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20178313xN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJIIIIZZ(C565880MHi c565880MHi) {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new C565870MHh(c565880MHi, null), 3);
    }

    public static void LJI(String str, C1457070o1J c1457070o1J) {
        int i;
        Object objValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DA c13da = new C13DA();
        c13da.put("strategy", str);
        c13da.put(Scene.SCENE_SERVICE, Integer.valueOf(c1457070o1J.LIZJ));
        int i2 = c1457070o1J.LJFF;
        int i3 = -1;
        if (i2 == 0) {
            i = -1;
        } else {
            i = i2;
        }
        Object objValueOf2 = "auto";
        if (i <= 0) {
            objValueOf = "auto";
        } else {
            if (i2 == 0) {
                i2 = -1;
            }
            objValueOf = Integer.valueOf(i2);
        }
        c13da.put("coverWidth", objValueOf);
        int i4 = c1457070o1J.LJI;
        if (i4 != 0 && i4 > 0) {
            if (i4 != 0) {
                i3 = i4;
            }
            objValueOf2 = Integer.valueOf(i3);
        }
        c13da.put("coverHeight", objValueOf2);
        c13da.put("quality", Integer.valueOf(c1457070o1J.LJII));
        c13da.put("format", c1457070o1J.LJIIIIZZ);
        c13da.put("savePath", c1457070o1J.LIZLLL);
        LJIIIIZZ(new C565880MHi(jCurrentTimeMillis, "strategy_start", c13da.build()));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Strategy started: ");
        sbLIZ.append(str);
        sbLIZ.append(" for scene ");
        sbLIZ.append(c1457070o1J.LIZJ);
        C201955140j.LIZLLL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DA c13da = new C13DA();
        c13da.put("requestKey", str);
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("cacheHit", str3);
        if (str2 != null) {
            c13da.put("cacheType", str2);
        }
        LJIIIIZZ(new C565880MHi(jCurrentTimeMillis, "cache_hit", c13da.build()));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request key=");
        sbLIZ.append(str);
        sbLIZ.append(", cacheHit=");
        sbLIZ.append(z);
        sbLIZ.append(", cacheType=");
        sbLIZ.append(str2);
        C201955140j.LIZLLL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(int i, int i2, long j, String str) {
        long j2 = j / ((long) 1024);
        LJIIIIZZ(new C565880MHi(System.currentTimeMillis(), "bitmap_generated", C2097608Jq.LJIIIIZZ(new Pair("width", Integer.valueOf(i)), new Pair("height", Integer.valueOf(i2)), new Pair("sizeBytes", Long.valueOf(j)), new Pair("sizeKB", Long.valueOf(j2)), new Pair("strategy", str))));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bitmap generated: ");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        sbLIZ.append(", size=");
        sbLIZ.append(j);
        sbLIZ.append("B (");
        sbLIZ.append(j2);
        sbLIZ.append("KB), strategy=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZJ(String str, String str2, String str3, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DA c13da = new C13DA();
        c13da.put("strategy", str);
        c13da.put("exceptionType", str2);
        c13da.put("phase", str3);
        c13da.putAll(map);
        LJIIIIZZ(new C565880MHi(jCurrentTimeMillis, "exception", c13da.build()));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Exception occurred: strategy=");
        sbLIZ.append(str);
        sbLIZ.append(", type=");
        sbLIZ.append(str2);
        sbLIZ.append(", phase=");
        sbLIZ.append(str3);
        C201955140j.LJIIIIZZ(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(String str, long j, boolean z, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DA c13da = new C13DA();
        c13da.put("strategy", str);
        c13da.put("duration", Long.valueOf(j));
        c13da.put("success", Boolean.valueOf(z));
        c13da.putAll(map);
        LJIIIIZZ(new C565880MHi(jCurrentTimeMillis, "extraction_summary", c13da.build()));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Extraction completed: strategy=");
        sbLIZ.append(str);
        sbLIZ.append(", duration=");
        sbLIZ.append(j);
        sbLIZ.append("ms, success=");
        sbLIZ.append(z);
        C201955140j.LJIILL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(long j, long j2, String str, String str2) {
        long j3 = j / ((long) 1024);
        LJIIIIZZ(new C565880MHi(System.currentTimeMillis(), "file_saved", C2097608Jq.LJIIIIZZ(new Pair("path", str), new Pair("sizeBytes", Long.valueOf(j)), new Pair("sizeKB", Long.valueOf(j3)), new Pair("saveDuration", Long.valueOf(j2)), new Pair("format", str2))));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("File saved: ");
        sbLIZ.append(str);
        sbLIZ.append(", size=");
        sbLIZ.append(j);
        sbLIZ.append("B (");
        sbLIZ.append(j3);
        sbLIZ.append("KB), duration=");
        sbLIZ.append(j2);
        sbLIZ.append("ms, format=");
        sbLIZ.append(str2);
        C201955140j.LJIILL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJII(int i, String str, String str2, String str3, Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C13DA c13da = new C13DA();
        c13da.put("taskId", str);
        c13da.put("taskType", str2);
        c13da.put("progress", Integer.valueOf(i));
        c13da.put("currentStep", str3);
        c13da.putAll(map);
        LJIIIIZZ(new C565880MHi(jCurrentTimeMillis, "task_progress", c13da.build()));
        C0MHB c0mhb = C0MHB.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Task progress: taskId=");
        sbLIZ.append(str);
        sbLIZ.append(", progress=");
        sbLIZ.append(i);
        sbLIZ.append("%, step=");
        sbLIZ.append(str3);
        C201955140j.LIZLLL(c0mhb, "CoverExtractionMonitor", C2188811AlT.LIZIZ(sbLIZ));
    }
}
