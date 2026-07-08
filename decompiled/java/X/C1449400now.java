package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPLyricAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import lgo.a;

/* JADX INFO: renamed from: X.0now, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449400now implements IRecordMobService {
    public static final C1449400now LIZ = new C1449400now();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(98));
    public static final Keva LIZJ = Keva.getRepo("publish_tab_mob");
    public static boolean LIZLLL = true;

    @Override // com.ss.android.ugc.aweme.mob.record.IRecordMobService
    public final void LIZ(Map<String, String> map) {
        HashMap map2;
        Object obj;
        long jCurrentTimeMillis;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj2;
        Object obj3;
        if ((map instanceof HashMap) && (map2 = (HashMap) map) != null) {
            map2.put("group_id", C1443560nfW.LJIIIIZZ());
            map2.put("from_group_id", C1443560nfW.LJIIIIZZ());
            LIZ.getClass();
            ((ILiveOuterService) LIZIZ.getValue()).v6();
            String str = CardStruct.IStatusCode.DEFAULT;
            map2.put("has_lop_plus_bubble", CardStruct.IStatusCode.DEFAULT);
            if (Intrinsics.LJFF(((HashMap) map).get("enter_from"), "home_page_lop_bubble")) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("click_on_bubble", obj);
            if (C319860CgK.LIZ()) {
                map2.put("friends_tab_version", "v3.0");
            }
            if (C1392820mLg.LIZ()) {
                C1449440np0.LIZ.getClass();
                if (C1392820mLg.LIZ()) {
                    if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                        obj2 = "1";
                    } else {
                        obj2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    map2.put("is_login", obj2);
                    if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
                        obj3 = "1";
                    } else {
                        obj3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    map2.put("has_camera_permission", obj3);
                    if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
                        str = "1";
                    }
                    map2.put("has_microphone_permission", str);
                }
            }
            Keva keva = LIZJ;
            long j = keva.getLong("last_shoot_timestamp_ms", 0L);
            keva.storeLong("last_shoot_timestamp_ms", System.currentTimeMillis());
            if (j <= 0) {
                jCurrentTimeMillis = 0;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() - j;
            }
            Long lValueOf = Long.valueOf(jCurrentTimeMillis);
            if (lValueOf.longValue() > 0) {
                map2.put("last_shoot_duration", String.valueOf(lValueOf.longValue()));
            }
            C523280Kfe.LIZ.getClass();
            map2.put("has_upload_permission", C523280Kfe.LIZIZ());
            a aVar = a.LIZIZ;
            aVar.LIZ().LIZLLL();
            C1449450np1 c1449450np1 = C1449450np1.LIZ;
            map2.put("shoot_2_app_launch_duration", String.valueOf(c1449450np1.LIZJ()));
            map2.put("load_so_2_app_launch_duration", String.valueOf(c1449450np1.LIZLLL()));
            long jLIZIZ = C1449450np1.LIZIZ("camera_init_task_new_start");
            long jLIZIZ2 = C1449450np1.LIZIZ("camera_init_task_old_start");
            long jLIZIZ3 = C1449450np1.LIZIZ("camera_init_task_new_register");
            if (Math.max(jLIZIZ2, jLIZIZ) > 0) {
                z = true;
            } else {
                z = false;
            }
            map2.put("camera_init_task_run", C1402490mbH.LIZ(z));
            C0LAB c0lab = new C0LAB();
            long j2 = jLIZIZ2 - jLIZIZ;
            c0lab.LJ("type", "perf_shoot");
            c0lab.LJ("shoot_way", (String) map2.get("shoot_way"));
            if (jLIZIZ > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0lab.LJ("step1", C1402490mbH.LIZ(z2));
            if (jLIZIZ2 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            c0lab.LJ("step2", C1402490mbH.LIZ(z3));
            c0lab.LIZ(Long.signum(j2), "step3");
            if (jLIZIZ3 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0lab.LJ("step4", C1402490mbH.LIZ(z4));
            c0lab.LJ("step5", C1402490mbH.LIZ(aVar.recordService().LIZLLL()));
            c0lab.LJ("step6", C1402490mbH.LIZ(LIZLLL));
            c0lab.LJ("step7", String.valueOf(c1449450np1.LIZJ()));
            c0lab.LJ("step8", String.valueOf(c1449450np1.LIZLLL()));
            c0lab.LJ("totalstep", C1402490mbH.LIZ(z));
            c0lab.LJ("totaltime", String.valueOf(j2));
            LIZLLL = false;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C058O(c0lab, null), 3);
        }
        C01GW c01gw = LIZIZ;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) c01gw.getValue();
        ((ILiveOuterService) c01gw.getValue()).v6();
        iLiveOuterService.hasLopBubbleForLog(0);
        ((ILiveOuterService) c01gw.getValue()).hasLopEnterBubbleForLog(0);
        C1411520mpq.LIZ.getClass();
        C1411520mpq.LIZIZ("shoot", map);
    }

    @Override // com.ss.android.ugc.aweme.mob.record.IRecordMobService
    public final void LIZJ(C1449420noy c1449420noy, C0LAB c0lab) {
        String str;
        String str2;
        c0lab.LJ("creation_id", c1449420noy.LIZ);
        c0lab.LJ("shoot_way", c1449420noy.LIZIZ);
        c0lab.LJ("from_group_id", c1449420noy.LIZJ);
        C1449430noz c1449430noz = c1449420noy.LIZLLL;
        if (c1449430noz != null) {
            c0lab.LJ("music_id", c1449430noz.LIZ);
            c0lab.LJ("music_selected_from", c1449430noz.LIZIZ);
        }
        if (C1392820mLg.LIZ()) {
            C1449440np0.LIZ.getClass();
            if (C1392820mLg.LIZ()) {
                String str3 = "1";
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_login", str);
                if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("has_camera_permission", str2);
                if (!C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("has_microphone_permission", str3);
            }
        }
        C523280Kfe.LIZ.getClass();
        C523280Kfe.LIZ(c0lab);
        C560380LyO c560380LyO = C560380LyO.LIZ;
        EnumC560450LyV enumC560450LyV = EnumC560450LyV.RECORD;
        String strLJIIIIZZ = c0lab.LJIIIIZZ("enter_from");
        c560380LyO.getClass();
        C560380LyO.LJIJ(enumC560450LyV, strLJIIIIZZ);
        if (C298260Bma.LIZ()) {
            C1411520mpq c1411520mpq = C1411520mpq.LIZ;
            Map<String, String> map = c0lab.LIZ;
            c1411520mpq.getClass();
            C1411520mpq.LIZIZ("enter_video_shoot_page", map);
            return;
        }
        C20684815ws.LJIILLIIL("enter_video_shoot_page", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mob.record.IRecordMobService
    public final void LIZLLL(C1449410nox c1449410nox, Map<String, String> map) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(map);
        LIZIZ(c1449410nox, c0lab, null);
    }

    @Override // com.ss.android.ugc.aweme.mob.record.IRecordMobService
    public final void LIZIZ(C1449410nox c1449410nox, C0LAB c0lab, String str) {
        EPAnchorData ePAnchorData;
        String str2;
        c0lab.LJ("creation_id", c1449410nox.LIZ);
        c0lab.LJ("shoot_way", c1449410nox.LIZIZ);
        c0lab.LJ("group_id", c1449410nox.LIZLLL);
        c0lab.LJ("enter_from", c1449410nox.LIZJ);
        c0lab.LJ("from_group_id", c1449410nox.LJ);
        if (str == null) {
            str = "";
        }
        c0lab.LJ("request_id", str);
        String str3 = c1449410nox.LJI;
        if (str3 != null) {
            c0lab.LJ("author_id", str3);
        }
        C1449430noz c1449430noz = c1449410nox.LJFF;
        if (c1449430noz != null) {
            c0lab.LJ("music_id", c1449430noz.LIZ);
            c0lab.LJ("music_selected_from", c1449430noz.LIZIZ);
        }
        EditorProSchemeModel editorProSchemeModel = c1449410nox.LJII;
        if (editorProSchemeModel != null && (ePAnchorData = editorProSchemeModel.anchorData) != null && ePAnchorData.lyricAnchor != null) {
            c0lab.LJ("tt_template_type", "autocut_algo_lyric");
            c0lab.LJ("tt_template_id", ePAnchorData.resourceId);
            EPLyricAnchorData ePLyricAnchorData = ePAnchorData.lyricAnchor;
            if (ePLyricAnchorData != null && (str2 = ePLyricAnchorData.mainAnchorType) != null && str2.length() > 0) {
                c0lab.LJ("main_anchor_type", str2);
            }
        }
        LIZ(c0lab.LIZ);
    }
}
