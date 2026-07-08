package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0MKK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKK {
    public final C0MKL LIZ;
    public final String LIZIZ = "tools_performance_share_2_story_pre_process";
    public Map<String, ? extends Object> LIZJ = C2097608Jq.LJ();

    public C0MKK(C0MKL c0mkl) {
        this.LIZ = c0mkl;
    }

    public final void LIZIZ(Integer num, String str) {
        LIZ(this, C0MKA.FAILED, num, str, null, 8);
    }

    public static void LIZ(C0MKK c0mkk, C0MKA c0mka, Integer num, String str, Map map, int i) {
        String str2;
        Map mapLJ = map;
        Integer num2 = num;
        String str3 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) == 0) {
            str3 = str;
        }
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        }
        c0mkk.getClass();
        long jLIZ = c0mkk.LIZ.LIZ();
        C138P c138p = c0mkk.LIZ.LIZIZ;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jLIZIZ = c138p.LIZIZ(timeUnit);
        long jLIZIZ2 = c0mkk.LIZ.LIZLLL.LIZIZ(timeUnit);
        long jLIZIZ3 = c0mkk.LIZ.LIZJ.LIZIZ(timeUnit);
        C0MKM c0mkm = new C0MKM(c0mka, jLIZ, jLIZIZ, jLIZIZ2, jLIZIZ3, num2, str3, mapLJ);
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(c0mka.getValue(), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(jLIZ, "total_time");
        c0lab.LIZIZ(jLIZIZ, "download_video_time");
        c0lab.LIZIZ(jLIZIZ2, "download_style_time");
        c0lab.LIZIZ(jLIZIZ3, "calculate_bg_time");
        c0lab.LJ("cover_rgb_status", c0mkk.LIZ.LJ);
        String str4 = "enable";
        if (C0BKO.LIZ()) {
            str2 = "enable";
        } else {
            str2 = "control";
        }
        c0lab.LJ("cover_rgb_exp_group", str2);
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "error_code");
        }
        if (str3 != null) {
            c0lab.LJ("error_msg", str3);
        }
        for (Map.Entry<String, ? extends Object> entry : c0mkk.LIZJ.entrySet()) {
            c0lab.LIZLLL(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, Object> entry2 : c0mkm.LJII.entrySet()) {
            c0lab.LIZLLL(entry2.getValue(), entry2.getKey());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PerformanceTracker reporting event: ");
        sbLIZ.append(c0mkk.LIZIZ);
        sbLIZ.append('\n');
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("  status: ");
        sbLIZ2.append(c0mkm.LIZ.getValue());
        sbLIZ2.append(" (");
        sbLIZ2.append(c0mkm.LIZ.getDescription());
        sbLIZ2.append(")\n");
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("  total_time: ");
        sbLIZ3.append(c0mkm.LIZIZ);
        sbLIZ3.append("ms\n");
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("  download_video_time: ");
        sbLIZ4.append(c0mkm.LIZJ);
        sbLIZ4.append("ms\n");
        C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("  download_style_time: ");
        sbLIZ5.append(c0mkm.LIZLLL);
        sbLIZ5.append("ms\n");
        C2188811AlT.LIZIZ(sbLIZ5);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("  calculate_bg_time: ");
        sbLIZ6.append(c0mkm.LJ);
        sbLIZ6.append("ms\n");
        C2188811AlT.LIZIZ(sbLIZ6);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("  cover_rgb_status: ");
        sbLIZ7.append(c0mkk.LIZ.LJ);
        sbLIZ7.append('\n');
        C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("  cover_rgb_exp_group: ");
        if (!C0BKO.LIZ()) {
            str4 = "control";
        }
        sbLIZ8.append(str4);
        sbLIZ8.append('\n');
        C2188811AlT.LIZIZ(sbLIZ8);
        Integer num3 = c0mkm.LJFF;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("  error_code: ");
            sbLIZ9.append(iIntValue);
            sbLIZ9.append('\n');
            C2188811AlT.LIZIZ(sbLIZ9);
        }
        String str5 = c0mkm.LJI;
        if (str5 != null) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("  error_msg: ");
            sbLIZ10.append(str5);
            sbLIZ10.append('\n');
            C2188811AlT.LIZIZ(sbLIZ10);
        }
        if (!c0mkk.LIZJ.isEmpty()) {
            for (Map.Entry<String, ? extends Object> entry3 : c0mkk.LIZJ.entrySet()) {
                String key = entry3.getKey();
                Object value = entry3.getValue();
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append("  ");
                sbLIZ11.append(key);
                sbLIZ11.append(": ");
                sbLIZ11.append(value);
                sbLIZ11.append('\n');
                C2188811AlT.LIZIZ(sbLIZ11);
            }
        }
        if (!c0mkm.LJII.isEmpty()) {
            for (Map.Entry<String, Object> entry4 : c0mkm.LJII.entrySet()) {
                String key2 = entry4.getKey();
                Object value2 = entry4.getValue();
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append("  ");
                sbLIZ12.append(key2);
                sbLIZ12.append(": ");
                sbLIZ12.append(value2);
                sbLIZ12.append('\n');
                C2188811AlT.LIZIZ(sbLIZ12);
            }
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ(c0mkk.LIZIZ, c0lab.LIZ);
    }
}
