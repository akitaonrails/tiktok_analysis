package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400330mXn {
    public static final C1400330mXn LIZ = new C1400330mXn();

    public static Pair LIZLLL() {
        return C1589640rT8.LIZIZ.F2() ? new Pair(1, "is_top_tab") : new Pair(0, "is_top_tab");
    }

    public static void LJIIIZ() {
        try {
            C0O0R.LIZ.getClass();
            if (C0O0R.LIZIZ) {
                C20684815ws.LJIJI("unread_enter_friends", new Pair("homepage_friends", "enter_from"), new Pair(C0O0R.LJFF, "enter_method"), new Pair(String.valueOf(C0O0R.LIZJ), "is_post_unread_enter"), new Pair(String.valueOf(C0O0R.LIZLLL), "is_story_unread_enter"));
                C0O0R.LIZIZ = false;
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJII(String str) {
        C20684815ws.LJIJI("trigger_refresh_friends", new Pair(str, "enter_method"), LIZLLL());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Fragment fragment, Object obj) {
        Object objPut;
        InterfaceC1587410rPX interfaceC1587410rPX;
        if (fragment == 0 || !C1589640rT8.LIZIZ.t2(fragment)) {
            return;
        }
        String strY = null;
        if ((fragment instanceof InterfaceC1587410rPX) && (interfaceC1587410rPX = (InterfaceC1587410rPX) fragment) != null) {
            strY = interfaceC1587410rPX.Y();
        }
        if (C123100dR.LIZ(strY)) {
            try {
                if (obj instanceof AbstractC1386130mAt) {
                    AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
                    abstractC1386130mAt.LJFF("last_prev_page_group_id", strY, InterfaceC1210900hcG.LIZ);
                    objPut = abstractC1386130mAt;
                } else if (obj instanceof C2241008qG) {
                    C2241008qG c2241008qG = (C2241008qG) obj;
                    c2241008qG.LIZ.put("last_prev_page_group_id", strY);
                    objPut = c2241008qG;
                } else if (obj instanceof C0LAB) {
                    C0LAB c0lab = (C0LAB) obj;
                    c0lab.LJ("last_prev_page_group_id", strY);
                    objPut = c0lab;
                } else if (obj instanceof C2344009Gk) {
                    C2344009Gk c2344009Gk = (C2344009Gk) obj;
                    c2344009Gk.LJIIIIZZ("last_prev_page_group_id", strY);
                    objPut = c2344009Gk;
                } else if (obj instanceof JSONObject) {
                    objPut = ((JSONObject) obj).put("last_prev_page_group_id", strY);
                } else {
                    objPut = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(objPut);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(AbstractC1386140mAu abstractC1386140mAu, String str) {
        String str2;
        try {
            if (!Intrinsics.LJFF(str, "homepage_friends")) {
                return;
            }
            if (Intrinsics.LJFF(abstractC1386140mAu.LIZ, "stay_time")) {
                C0O0R.LIZ.getClass();
                abstractC1386140mAu.LJ("page_enter_method", C0O0R.LJFF);
            }
            if (Intrinsics.LJFF(abstractC1386140mAu.LIZ, "video_play")) {
                C0O0R.LIZ.getClass();
                abstractC1386140mAu.LJ("friends_enter_method", C0O0R.LJFF);
            } else {
                C0O0R.LIZ.getClass();
                abstractC1386140mAu.LJ("page_enter_method", C0O0R.LJFF);
            }
            C0O0R.LIZ.getClass();
            abstractC1386140mAu.LJ("is_post_unread_enter", String.valueOf(C0O0R.LIZJ));
            abstractC1386140mAu.LJ("is_story_unread_enter", String.valueOf(C0O0R.LIZLLL));
            if (C0O0R.LJ) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            abstractC1386140mAu.LJFF("is_red_enter", str2, InterfaceC1210900hcG.LIZ);
            C189200o6.m2constructorimpl(abstractC1386140mAu);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static String LIZJ(C19EG c19eg, String str) {
        InterfaceC1593630rZZ interfaceC1593630rZZ;
        String strF3;
        if (c19eg == null) {
            return "homepage_hot";
        }
        C128Y c128yKi = Hox.LLJILJIL.LIZ(c19eg).Ki(str);
        if (!(c128yKi instanceof InterfaceC1593630rZZ) || (interfaceC1593630rZZ = (InterfaceC1593630rZZ) c128yKi) == null || (strF3 = interfaceC1593630rZZ.f3()) == null) {
            return "homepage_hot";
        }
        return strF3;
    }

    public static void LJFF(String str, String str2, String str3) {
        C20684815ws.LJIJI("refresh_homepage_friends", new Pair(str, "enter_from"), new Pair(str2, "enter_method"), new Pair(str3, "result"), LIZLLL());
    }

    public static void LJIIIIZZ(int i, String str, boolean z) {
        int i2;
        if (z) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C20684815ws.LJIJI("friends_empty_page_show", new Pair(str, "enter_from"), new Pair(Integer.valueOf(i), "is_first_page"), new Pair(Integer.valueOf(i2), "has_more"), LIZLLL());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.equals("Playmode_Moodboost") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        if (r3.equals("Playmode_New") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r3.equals("Playmode_Top") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00aa, code lost:
    
        X.C1584320rKY.LIZ.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
    
        return X.C1584320rKY.LJI(r3);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJ(X.C19EG r2, java.lang.String r3, java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1400330mXn.LJIIJ(X.19EG, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void LJ(int i, int i2, long j, Integer num, String str, String str2) {
        if (i2 == 0) {
            C0O0R.LIZ.getClass();
            C20684815ws.LJIJI("exit_homepage_friends", new Pair(Integer.valueOf(i), "enter_with_notice"), new Pair(str, "notice_type"), new Pair(Long.valueOf(j), "stay_duration_ms"), new Pair(str2, "enter_from"), new Pair(C0O0R.LJFF, "page_enter_method"), new Pair(Integer.valueOf(C1589640rT8.LIZIZ.S2()), "video_consumed"), new Pair(Integer.valueOf(C0O0R.LJIIIZ), "slide_cnt"), new Pair(num, "video_consumed"), LIZLLL());
            C0O0R.LJIIIZ = 0;
        } else {
            C0O0R.LIZ.getClass();
            C20684815ws.LJIJI("exit_homepage_friends", new Pair(Integer.valueOf(i), "enter_with_notice"), new Pair(str, "notice_type"), new Pair(Integer.valueOf(i2), "number_cnt"), new Pair(Long.valueOf(j), "stay_duration_ms"), new Pair(str2, "enter_from"), new Pair(C0O0R.LJFF, "page_enter_method"), new Pair(Integer.valueOf(C1589640rT8.LIZIZ.S2()), "video_consumed"), new Pair(Integer.valueOf(C0O0R.LJIIIZ), "slide_cnt"), new Pair(num, "video_consumed"), LIZLLL());
            C0O0R.LJIIIZ = 0;
        }
    }

    public static void LJI(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List list, String str2, int i11, boolean z) {
        int i12 = i + i2;
        int i13 = i6 + i7;
        int i14 = i4 + i5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", "homepage_friends");
        c2344009Gk.LJFF("request_id", str);
        c2344009Gk.LIZJ(i12, "item_forecast");
        c2344009Gk.LIZJ(i, "item_forecast_story");
        c2344009Gk.LIZJ(i2, "item_forecast_normal");
        c2344009Gk.LIZJ(i13, "item_actual_mutual");
        c2344009Gk.LIZJ(i6, "item_actual_mutual_story");
        c2344009Gk.LIZJ(i7, "item_actual_mutual_normal");
        c2344009Gk.LIZJ(i14, "item_actual_single");
        c2344009Gk.LIZJ(i4, "item_actual_single_story");
        c2344009Gk.LIZJ(i5, "item_actual_single_normal");
        c2344009Gk.LIZJ((i12 - i13) - i14, "red_dot_actual_mutual_single_gap");
        c2344009Gk.LJFF("red_dot_request_id", str2);
        c2344009Gk.LIZJ(i11, "has_finished_sort_actual");
        if (C1589640rT8.LIZIZ.F2()) {
            c2344009Gk.LIZJ(1, "is_top_tab");
        } else {
            c2344009Gk.LIZJ(0, "is_top_tab");
        }
        if (z) {
            c2344009Gk.LIZJ(i3, "item_actual");
            c2344009Gk.LIZJ(i8, "item_actual_not_follow");
            c2344009Gk.LIZJ(i9 + i10, "item_unread_history");
            c2344009Gk.LIZJ(i9, "item_unread_history_story");
            c2344009Gk.LIZJ(i10, "item_unread_history_normal");
            c2344009Gk.LIZJ(i12 - i3, "item_diff");
            c2344009Gk.LJ(list, "rec_item_red_dot_id_list");
        }
        C20684815ws.LJIILLIIL("item_refresh_amount", c2344009Gk.LIZ);
    }
}
