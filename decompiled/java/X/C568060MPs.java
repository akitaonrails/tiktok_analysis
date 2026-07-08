package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.RecentCelebrationData;
import java.util.List;

/* JADX INFO: renamed from: X.0MPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568060MPs {
    public static final C568060MPs LIZ = new C568060MPs();

    public static void LIZLLL(int i, long j, long j2, boolean z) {
        long j3 = C08TN.LIZ().LJJLIIIJL;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, Scene.SCENE_SERVICE);
        c0lab.LIZIZ(j - j3, "start_time");
        c0lab.LIZIZ(j2 - j, "duration");
        c0lab.LJ("is_success", C0ML9.LJ(z));
        C20684815ws.LJIILLIIL("recent_celebrations_fetch", c0lab.LIZ);
    }

    public static void LIZIZ(int i, String str, Integer num, Integer num2, Boolean bool) {
        boolean z;
        List<Integer> readyCelebration;
        C0LAB c0lab = new C0LAB();
        if (num == null) {
            c0lab.LIZ(i, Scene.SCENE_SERVICE);
            c0lab.LJ("result", str);
            C20684815ws.LJIILLIIL("celebration_materials_fetch", c0lab.LIZ);
            return;
        }
        C568030MPp.LIZ.getClass();
        List listLJIIJ = C568030MPp.LJIIJ();
        boolean z2 = true;
        if (listLJIIJ != null && listLJIIJ.contains(num)) {
            z = true;
        } else {
            z = false;
        }
        C568030MPp.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), C568030MPp.LIZIZ());
        RecentCelebrationData recentCelebrationData = C568030MPp.LJ;
        if (recentCelebrationData == null || (readyCelebration = recentCelebrationData.getReadyCelebration()) == null || !readyCelebration.contains(num)) {
            z2 = false;
        }
        boolean zIsCelebrationExited = C1618440sDa.LIZIZ.LJJLIIIJLLLLLLLZ().isCelebrationExited(num.intValue());
        c0lab.LJ("is_today", C0ML9.LJ(z));
        c0lab.LJ("is_ready", C0ML9.LJ(z2));
        c0lab.LJ("is_exit", C0ML9.LJ(zIsCelebrationExited));
        c0lab.LIZ(num.intValue(), "celebration_type");
        c0lab.LJ("result", str);
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "material_size");
        }
        if (bool != null) {
            c0lab.LJ("has_render_video", C0ML9.LJ(bool.booleanValue()));
        }
        C20684815ws.LJIILLIIL("celebration_materials_fetch", c0lab.LIZ);
    }

    public static void LIZ(C568060MPs c568060MPs, int i, String str, int i2, boolean z, long j, int i3, String str2, String str3, String str4, String str5, int i4) {
        if ((i4 & 128) != 0) {
            str3 = null;
        }
        if ((i4 & 512) != 0) {
            str4 = null;
        }
        if ((i4 & 1024) != 0) {
            str5 = null;
        }
        c568060MPs.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "type");
        c0lab.LJ("stage", str);
        c0lab.LJ("error", C0ML9.LJ(z));
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(i2, "asset_cnt");
        c0lab.LIZ(i3, "item_cnt");
        c0lab.LIZ(0, "cached_asset_cnt");
        c0lab.LJ(Scene.SCENE_SERVICE, str2);
        if (str3 != null) {
            c0lab.LJ("error_code", str3);
        }
        if (str4 != null) {
            c0lab.LJ("error_msg", str4);
        }
        if (str5 != null) {
            c0lab.LJ("template_id", str5);
        }
        C20684815ws.LJIILLIIL("celebration_creation_perf", c0lab.LIZ);
    }
}
