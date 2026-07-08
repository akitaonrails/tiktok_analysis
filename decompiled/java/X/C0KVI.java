package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0KVI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KVI {
    public static final C0KVI LIZ = new C0KVI();

    public static void LIZ(Integer num, String str, String str2, String str3, Map map) {
        String str4;
        String string;
        String str5;
        Number number;
        Number number2;
        C0KOO c0koo = C0KOO.LIZ;
        C13DA c13da = new C13DA();
        c13da.put("action_type", str);
        if (str2 != null) {
            c13da.put("click_position", str2);
        }
        Object obj = map.get("previous_page");
        if ((obj instanceof String) && obj != null) {
            c13da.put("previous_page", obj);
        }
        Object obj2 = map.get("enter_from");
        if ((obj2 instanceof String) && obj2 != null) {
            c13da.put("enter_from", obj2);
        }
        Object obj3 = map.get("series_enter_entrance");
        if ((obj3 instanceof String) && obj3 != null) {
            c13da.put("series_enter_entrance", obj3);
        }
        Object obj4 = map.get("business_type");
        if ((obj4 instanceof String) && obj4 != null) {
            c13da.put("business_type", obj4);
        }
        Object obj5 = map.get("subscribe_state");
        if ((obj5 instanceof Number) && (number2 = (Number) obj5) != null) {
            c13da.put("subscribe_state", String.valueOf(number2.intValue()));
        }
        Object obj6 = map.get("payment_type");
        if ((obj6 instanceof String) && obj6 != null) {
            c13da.put("payment_type", obj6);
        }
        Object obj7 = map.get("show_type");
        if (obj7 instanceof String) {
            str4 = (String) obj7;
        } else {
            str4 = null;
        }
        if (str4 == null || str4.length() <= 0) {
            str4 = "collection_purchase";
        }
        c13da.put("show_type", str4);
        Object obj8 = map.get("collection_id");
        if ((obj8 instanceof Number) && (number = (Number) obj8) != null) {
            c13da.put("collection_id", String.valueOf(number.longValue()));
        }
        Object obj9 = map.get("error_code");
        if (obj9 == null || (string = obj9.toString()) == null || string.length() <= 0) {
            if (num != null) {
                string = num.toString();
            } else {
                string = "-1";
            }
        }
        c13da.put("error_code", string);
        Object obj10 = map.get("error_msg");
        if ((obj10 instanceof String) && (str5 = (String) obj10) != null && str5.length() > 0) {
            str3 = str5;
        } else {
            if (str3 != null && str3.length() > 0) {
            }
            Map mapBuild = c13da.build();
            c0koo.getClass();
            C0KOO.LIZ(mapBuild);
        }
        c13da.put("error_msg", str3);
        Map mapBuild2 = c13da.build();
        c0koo.getClass();
        C0KOO.LIZ(mapBuild2);
    }

    public static void LIZIZ(C0KVI c0kvi, Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Map map, Integer num, int i) {
        AFwS193S0000000_7 aFwS193S0000000_7;
        AFwS193S0000000_7 aFwS193S0000000_72;
        Integer num2 = num;
        Map map2 = map;
        if ((i & 64) != 0) {
            map2 = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(342);
        } else {
            aFwS193S0000000_7 = null;
        }
        if ((i & 512) != 0) {
            aFwS193S0000000_72 = AFwS193S0000000_7.get$arr$(343);
        } else {
            aFwS193S0000000_72 = null;
        }
        c0kvi.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        C1235760iGM.LIZ(c1397580mTM, R.raw.icon_exclamation_mark_circle, null, 6);
        c1397580mTM.LJI(charSequence);
        c1397580mTM.LIZIZ(charSequence2);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new C0KVJ(charSequence3, charSequence4, map2, aFwS193S0000000_7, charSequence2, num2, aFwS193S0000000_72));
        new C1397510mTF(c1397580mTM).LIZLLL();
        if (map2 != null) {
            C0KVI c0kvi2 = LIZ;
            String string = charSequence2.toString();
            c0kvi2.getClass();
            LIZ(num2, "show", null, string, map2);
        }
    }
}
