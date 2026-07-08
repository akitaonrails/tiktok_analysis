package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostConversationApi;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.06jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1687506jB {
    public final String LIZ = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 1167));
    public final int LIZJ = C1687706jD.LIZ().getAffinityScore;

    public final Keva LIZLLL() {
        return (Keva) this.LIZIZ.getValue();
    }

    public final Map<String, Integer> LIZJ() {
        try {
            Map<String, Integer> map = (Map) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), LIZLLL().getString("display_conversation_count", "{}"), new TypeToken<Map<String, ? extends Integer>>() { // from class: X.06jC
            }.getType());
            return map == null ? C2097608Jq.LJ() : map;
        } catch (o e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public final boolean LJ() {
        return System.currentTimeMillis() > LIZLLL().getLong("key_first_display_timestamp", System.currentTimeMillis()) + TimeUnit.HOURS.toMillis(24L);
    }

    public static String LIZ(EnumC1685906iv enumC1685906iv) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("key_");
        sbLIZ.append(enumC1685906iv.getScene());
        sbLIZ.append("_has_shown");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJFF(EnumC1643306c3 enumC1643306c3) {
        if (enumC1643306c3 == null) {
            return;
        }
        if (enumC1643306c3 == EnumC1643306c3.PUBLIC) {
            LIZLLL().storeBoolean("key_has_turn_on_public", true);
        }
        if (enumC1643306c3 != EnumC1643306c3.NO_ONE) {
            LIZLLL().erase("turn_off_timestamp");
        } else {
            if (LIZLLL().contains("turn_off_timestamp")) {
                return;
            }
            LIZLLL().storeLong("turn_off_timestamp", System.currentTimeMillis());
            LIZLLL().erase("display_conversation_count");
            LIZLLL().erase("key_cannot_display_notice_until_timestamp");
            LIZLLL().erase("key_first_display_timestamp");
        }
    }

    public final void LJII(String str) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZJ());
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put(str, Integer.valueOf(iIntValue + 1));
        LIZLLL().storeString("display_conversation_count", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedHashMap));
        if (!LIZLLL().contains("key_cannot_display_notice_until_timestamp")) {
            LIZLLL().storeLong("key_cannot_display_notice_until_timestamp", System.currentTimeMillis() + TimeUnit.HOURS.toMillis(24L) + TimeUnit.DAYS.toMillis(C1687706jD.LIZ().getMinCooldownDaysAfterDisappearing));
        }
        if (!LIZLLL().contains("key_first_display_timestamp")) {
            LIZLLL().storeLong("key_first_display_timestamp", System.currentTimeMillis());
        }
    }

    public final boolean LJIIIZ(String str) {
        int iIntValue;
        if (LIZLLL().contains("key_cannot_display_notice_until_timestamp") && System.currentTimeMillis() > LIZLLL().getLong("key_cannot_display_notice_until_timestamp", 0L)) {
            LIZLLL().erase("key_cannot_display_notice_until_timestamp");
            LIZLLL().erase("display_conversation_count");
            LIZLLL().erase("key_first_display_timestamp");
            LIZLLL().storeInt("dismiss_count", LIZLLL().getInt("dismiss_count", 0) + 1);
        }
        IMHostConversationApi.LIZ.getClass();
        IMHostConversationApi iMHostConversationApiLIZ = C1688306jJ.LIZ();
        if (iMHostConversationApiLIZ != null && !iMHostConversationApiLIZ.LJ(str)) {
            return false;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (!C897370ZIh.LIZ().LJ().LJI() || C897370ZIh.LIZ().LJ().LIZ()) {
            return false;
        }
        if (!LIZLLL().contains("turn_off_timestamp")) {
            LIZLLL().storeLong("turn_off_timestamp", 1L);
        }
        if (LIZLLL().getInt("dismiss_count", 0) >= C1687706jD.LIZ().getForeverDisappearsCount || TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - LIZLLL().getLong("turn_off_timestamp", 0L)) < C1687706jD.LIZ().minTurnOffElapsedDaysBeforeShowingInlineNotice) {
            return false;
        }
        if (LIZLLL().contains("key_cannot_display_notice_until_timestamp") && LJ()) {
            return false;
        }
        Map<String, Integer> mapLIZJ = LIZJ();
        if (mapLIZJ.containsKey(str)) {
            Integer num = mapLIZJ.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue >= C1687706jD.LIZ().maxDisplayPerChat) {
                return false;
            }
        } else if (mapLIZJ.size() >= C1687706jD.LIZ().maxDisplayAllChat) {
            return false;
        }
        if (LJ()) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(EnumC1685906iv enumC1685906iv, String str) {
        Long lValueOf;
        if (!C1689706jX.LIZ()) {
            return false;
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (!C897370ZIh.LIZ().LJ().LJI()) {
            return false;
        }
        IMHostConversationApi.LIZ.getClass();
        IMHostConversationApi iMHostConversationApiLIZ = C1688306jJ.LIZ();
        IMUser iMUserLJ = null;
        if (iMHostConversationApiLIZ != null) {
            lValueOf = Long.valueOf(iMHostConversationApiLIZ.LIZJ(str));
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        C06QG c06qg = ContactFeature.LIZ;
        ContactFeature contactFeatureLIZ = c06qg.LIZ();
        if (contactFeatureLIZ == null) {
            return false;
        }
        ContactFeature contactFeatureLIZ2 = c06qg.LIZ();
        if (contactFeatureLIZ2 != null) {
            iMUserLJ = contactFeatureLIZ2.LJ(strValueOf, "im_local_db");
        }
        Integer numLJIIIIZZ = contactFeatureLIZ.LJIIIIZZ(iMUserLJ);
        if (numLJIIIIZZ == null || numLJIIIIZZ.intValue() == 2) {
            return false;
        }
        EnumC1643306c3 enumC1643306c3LJFF = C897370ZIh.LIZ().LJ().LJFF();
        int i = C1686006iw.LIZ[enumC1685906iv.ordinal()];
        if (i != 1) {
            if (i != 2 || LIZLLL().getBoolean(LIZ(enumC1685906iv), false)) {
                return false;
            }
            if (enumC1643306c3LJFF != EnumC1643306c3.FRIENDS && enumC1643306c3LJFF != EnumC1643306c3.NO_ONE) {
                return false;
            }
        } else if (LIZLLL().getBoolean(LIZ(enumC1685906iv), false) || LIZLLL().getBoolean("key_has_turn_on_public", false) || enumC1643306c3LJFF != EnumC1643306c3.FRIENDS) {
            return false;
        }
        return true;
    }

    public final void LJI(EnumC1685906iv enumC1685906iv, String str) {
        LIZLLL().storeBoolean(LIZ(enumC1685906iv), true);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("chat_type", "private"), new Pair("enter_from", "chat"), new Pair(Scene.SCENE_SERVICE, enumC1685906iv.getScene()), new Pair("platform", "internal"), new Pair("conversation_id", str));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_inline_dm_option", mapLJIIIIZZ);
    }

    public final void LJIIIIZZ(EnumC1685906iv enumC1685906iv, String str) {
        if (enumC1685906iv == EnumC1685906iv.PERMISSION) {
            LIZLLL().storeLong("key_cannot_display_notice_until_timestamp", System.currentTimeMillis() + TimeUnit.DAYS.toMillis(C1687706jD.LIZ().getMinCooldownDaysAfterDisappearing));
            LIZLLL().storeLong("key_first_display_timestamp", 10L);
            LIZLLL().erase("display_conversation_count");
        }
        String scene = enumC1685906iv.getScene();
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("chat_type", "private");
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("action", "click");
        c830490Whz.put(Scene.SCENE_SERVICE, scene);
        c830490Whz.put("conversation_id", str);
        C20684815ws.LJIILLIIL("click_inline_dm_option", c830490Whz);
    }
}
