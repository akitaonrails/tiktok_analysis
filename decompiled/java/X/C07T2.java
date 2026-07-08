package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07T2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07T2 {
    public static final void LIZ(Map<String, String> map) {
        List listLJJLIIIJILLIZJL;
        List listLJJLIIIJILLIZJL2;
        List listLJJLIIIJILLIZJL3;
        List listLJJLIIIJILLIZJL4;
        List listLJJLIIIJILLIZJL5;
        List listLJJLIIIJILLIZJL6;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        C1866507St.LIZIZ.getClass();
        C1866507St.LIZ.LIZIZ.clear();
        String str7 = map.get("prop_list");
        int i2 = 0;
        if (str7 != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str7, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL = null;
        }
        String str8 = map.get("prop_selected_from");
        if (str8 != null) {
            listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str8, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL2 = null;
        }
        boolean z = true;
        if (listLJJLIIIJILLIZJL2 != null && !listLJJLIIIJILLIZJL2.isEmpty()) {
            Iterator it2 = listLJJLIIIJILLIZJL2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (u.LJJIIJZLJL((String) it2.next(), "edit_page", false)) {
                        C1866507St.LJ = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        String str9 = map.get("prop_impr_position");
        if (str9 != null) {
            listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(str9, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL3 = null;
        }
        String str10 = map.get("effect_source");
        if (str10 != null) {
            listLJJLIIIJILLIZJL4 = a0.LJJLIIIJILLIZJL(str10, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL4 = null;
        }
        String str11 = map.get("resource_list");
        if (str11 != null) {
            listLJJLIIIJILLIZJL5 = a0.LJJLIIIJILLIZJL(str11, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL5 = null;
        }
        String str12 = map.get("is_default_prop");
        String str13 = map.get("tab_key");
        if (str13 != null) {
            listLJJLIIIJILLIZJL6 = a0.LJJLIIIJILLIZJL(str13, new String[]{","}, 0, 6);
        } else {
            listLJJLIIIJILLIZJL6 = null;
        }
        if (listLJJLIIIJILLIZJL != null && !listLJJLIIIJILLIZJL.isEmpty()) {
            z = false;
        }
        String str14 = "";
        if (!z) {
            int i3 = 0;
            for (Object obj : listLJJLIIIJILLIZJL) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    String str15 = (String) obj;
                    List<C1867007Sy> list = C1866507St.LIZ.LIZIZ;
                    if (listLJJLIIIJILLIZJL6 == null || (str = (String) C13LP.LJJJLZIJ(i3, listLJJLIIIJILLIZJL6)) == null) {
                        str = "";
                    }
                    if (listLJJLIIIJILLIZJL3 == null || (str2 = (String) C13LP.LJJJLZIJ(i3, listLJJLIIIJILLIZJL3)) == null) {
                        str2 = "";
                    }
                    if (listLJJLIIIJILLIZJL5 == null || (str3 = (String) C13LP.LJJJLZIJ(i3, listLJJLIIIJILLIZJL5)) == null) {
                        str3 = "";
                    }
                    if (listLJJLIIIJILLIZJL4 == null || (str4 = (String) C13LP.LJJJLZIJ(i3, listLJJLIIIJILLIZJL4)) == null) {
                        str4 = "";
                    }
                    if (str12 == null) {
                        str5 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str5 = str12;
                    }
                    if (listLJJLIIIJILLIZJL2 == null || (str6 = (String) C13LP.LJJJLZIJ(i3, listLJJLIIIJILLIZJL2)) == null) {
                        str6 = "";
                    }
                    list.add(new C1867007Sy(str15, "", "", str, str2, str3, str4, str5, CardStruct.IStatusCode.DEFAULT, str6, 1024));
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        C1865807Sm c1865807Sm = C1866507St.LIZJ;
        String str16 = map.get("music_id");
        if (str16 == null) {
            str16 = "";
        }
        String str17 = map.get("music_selected_from");
        if (str17 == null) {
            str17 = "";
        }
        String str18 = map.get("music_log_id");
        if (str18 == null) {
            str18 = "";
        }
        c1865807Sm.LIZIZ(new C1865907Sn(str16, str17, str18, "", false), "");
        C07T6 c07t6 = C1866507St.LIZ.LIZLLL;
        try {
            String str19 = map.get("pic_cnt");
            if (str19 == null) {
                str19 = "";
            }
            i = CastIntegerProtector.parseInt(str19);
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            i = 0;
        }
        c07t6.LIZ = i;
        try {
            String str20 = map.get("video_cnt");
            if (str20 != null) {
                str14 = str20;
            }
            i2 = CastIntegerProtector.parseInt(str14);
        } catch (NumberFormatException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c07t6.LIZIZ = i2;
    }
}
