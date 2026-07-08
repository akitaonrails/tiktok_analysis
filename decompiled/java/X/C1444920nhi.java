package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.commerce.tools.sticker.CommerceToolsStickerContext;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tiktok.eventtracking.ab.EffectETGroupEnableConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0nhi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444920nhi {
    public static final C1444920nhi LIZ = new C1444920nhi();

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b7, code lost:
    
        r7 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r21) {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1444920nhi.LIZLLL(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext):void");
    }

    public static void LJ(Map map) {
        C1449400now c1449400now = C1449400now.LIZ;
        String str = (String) map.get("creation_id");
        if (str == null) {
            str = "";
        }
        String str2 = (String) map.get("shoot_way");
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) map.get("enter_from");
        if (str3 == null) {
            str3 = "";
        }
        c1449400now.LIZIZ(new C1449410nox(str, str2, str3, null, null, null, null, null, 248), new C0LAB(), null);
    }

    public static void LIZ(ShortVideoContext shortVideoContext, C0LAB c0lab, String str) {
        CommerceToolsStickerContext stickerContext = shortVideoContext.creativeModel.commerceModel.getStickerContext();
        Long startUseTime = stickerContext.getStartUseTime();
        if (startUseTime != null && startUseTime.longValue() > 0 && C123100dR.LIZ(stickerContext.getPropId())) {
            c0lab.LIZIZ(SystemClock.elapsedRealtime() - startUseTime.longValue(), "last_prop_click_exit_duration");
        }
        if (!EffectETGroupEnableConfig.isEnabled()) {
            c0lab.LJ("prop_id", stickerContext.getPropId());
            c0lab.LJ("prop_resource_id", stickerContext.getResourceId());
            return;
        }
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        AFwS261S0000000_22 aFwS261S0000000_22 = AFwS261S0000000_22.get$arr$(296);
        C1449230nof c1449230nof = new C1449230nof(creativeModel, str, new C1281904zx(c0lab));
        aFwS261S0000000_22.invoke(c1449230nof);
        c1449230nof.LIZ();
    }

    public static final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, String str3) {
        Object objValueOf;
        C1444920nhi c1444920nhi = LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("shoot_page", str2);
        c0lab.LJ(Scene.SCENE_SERVICE, str3);
        c0lab.LJ("shoot_enter_from", shortVideoContext.enterFrom);
        c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
        c0lab.LJ("exit_method", str);
        if (C1411580mpw.LIZIZ >= 0) {
            objValueOf = Long.valueOf(System.currentTimeMillis() - C1411580mpw.LIZIZ);
        } else {
            objValueOf = "-1";
        }
        c0lab.LIZLLL(objValueOf, "shoot_exit_duration");
        c0lab.LJ("furthest_page", C1411580mpw.LIZJ);
        c0lab.LJ("is_after_discard", C1402490mbH.LIZ(shortVideoContext.creativeModel.recordMobModel.isAfterDiscard));
        c1444920nhi.getClass();
        LIZ(shortVideoContext, c0lab, "shoot_exit");
        C20684815ws.LJIILLIIL("shoot_exit", c0lab.LIZ);
    }

    public static void LIZIZ(String str, ShortVideoContext shortVideoContext, long j, long j2, String str2) {
        long jCurrentTimeMillis;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ(Scene.SCENE_SERVICE, str2);
        c0lab.LJ("exit_method", str);
        c0lab.LIZIZ(System.currentTimeMillis() - j, "duration_since_click_shoot");
        if (j2 > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - j2;
        } else {
            jCurrentTimeMillis = -1;
        }
        c0lab.LIZIZ(jCurrentTimeMillis, "duration_since_shoot_page");
        C20684815ws.LJIILLIIL("exit_creation", c0lab.LIZ);
    }
}
