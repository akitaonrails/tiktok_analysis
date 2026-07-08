package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sRZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1627110sRZ {
    public static final C1627110sRZ LIZ = new C1627110sRZ();
    public static final Set<String> LIZIZ = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void LIZ(int i, PropFromGroupModel propFromGroupModel, InterfaceC1625220sOW interfaceC1625220sOW, InterfaceC1627120sRa interfaceC1627120sRa, boolean z) {
        String str;
        String strValueOf;
        String str2;
        int i2 = i;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("tab_name", "carousel", bundle);
        C786410Ut5.LJJJI("tab_key", "carousel", bundle);
        boolean z2 = interfaceC1627120sRa instanceof C1625930sPf;
        if (z2) {
            str = "prop_carousel_Favorites";
        } else {
            str = "prop_carousel_trending";
        }
        C786410Ut5.LJJJI("prop_selected_from", str, bundle);
        if (z2) {
            strValueOf = String.valueOf(-i2);
        } else {
            strValueOf = String.valueOf(i2);
        }
        C786410Ut5.LJJJI("prop_position", strValueOf, bundle);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C786410Ut5.LJJJI("is_default_on_shoot_page", str2, bundle);
        Effect effectLIZ = interfaceC1627120sRa.LIZ();
        String tabName = interfaceC1627120sRa.getTabName();
        String tabKey = interfaceC1627120sRa.getTabKey();
        if (interfaceC1627120sRa instanceof C1625930sPf) {
            i2 = -i2;
        }
        interfaceC1625220sOW.LJII(i2, bundle, propFromGroupModel, effectLIZ, tabName, tabKey, "slide_bar", "slide_bar");
    }

    public static void LIZIZ(InterfaceC1625220sOW interfaceC1625220sOW, Effect effect, boolean z, String str, String str2, String str3, String str4, String str5) {
        LinkedHashMap linkedHashMap;
        if (str2 == null) {
            str2 = "carousel";
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("tab_name", str2), new Pair("tab_type", "slide_bar"), new Pair("carousel_open", String.valueOf(z ? 1 : 0)), new Pair("tab_key", str), new Pair("impr_position", str3));
        if (EffectFullWidthHorizontalCarouselAB.isEnabled()) {
            linkedHashMap = new LinkedHashMap(mapLJIIIIZZ);
            linkedHashMap.put("fav_source", str4);
        } else {
            linkedHashMap = new LinkedHashMap(mapLJIIIIZZ);
        }
        if (str5 == null) {
            str5 = "slide_bar";
        }
        interfaceC1625220sOW.LJI(effect, false, str5, linkedHashMap);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, int i, int i2, int i3, String str3, String str4) {
        String str5;
        HashMap<String, String> mapLIZ = C1449260noi.LIZ(shortVideoContext, new Pair[0]);
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("action_type", str2);
        pairArr[1] = new Pair("scroll_pass_items", String.valueOf(Math.abs(i3 - i2)));
        if (i2 - i3 > 0) {
            str5 = "left";
        } else {
            str5 = "right";
        }
        pairArr[2] = new Pair("scroll_direction", str5);
        pairArr[3] = new Pair("carousel_type", str);
        pairArr[4] = new Pair("icon_current_index", String.valueOf(i3 - i));
        pairArr[5] = new Pair("icon_previous_index", String.valueOf(i2 - i));
        pairArr[6] = new Pair("current_effect_id", str4);
        pairArr[7] = new Pair("previous_effect_id", str3);
        mapLIZ.putAll(C2097608Jq.LJIIIIZZ(pairArr));
        C1449260noi.LJ("prop_carousel_scroll", mapLIZ);
    }
}
