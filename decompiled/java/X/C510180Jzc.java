package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubPrivilegeDetailPopup;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0Jzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510180Jzc {
    public static void LIZIZ(Context context, boolean z, String str, String str2, String str3, String str4, C508400Jwk c508400Jwk, C495050JbD c495050JbD, int i) {
        C508400Jwk c508400Jwk2 = c508400Jwk;
        Function1 c510290Jzn = c495050JbD;
        String str5 = str4;
        if ((i & 32) != 0) {
            str5 = "";
        }
        if ((i & 64) != 0) {
            c508400Jwk2 = null;
        }
        if ((i & 128) != 0) {
            c510290Jzn = new C510290Jzn();
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        LIZ(context, C500260Jjc.LJJLI(), str, str2, new LinkedHashMap(), null, Boolean.valueOf(z), str3, str5, 0L, false, null, c508400Jwk2, c510290Jzn, 3584);
    }

    public static void LIZ(Context context, Room room, String str, String str2, Map map, C494830Jar c494830Jar, Boolean bool, String str3, String str4, long j, boolean z, String str5, C508400Jwk c508400Jwk, Function1 function1, int i) {
        boolean z2;
        long ownerUserId;
        Long lValueOf;
        int i2;
        String secUid;
        User owner;
        User owner2;
        SubscribeInfo subscribeInfo;
        long j2 = j;
        String str6 = str4;
        String str7 = str3;
        Function1 c510300Jzo = function1;
        C508400Jwk c508400Jwk2 = c508400Jwk;
        String str8 = str5;
        if ((i & 64) != 0) {
            bool = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        if ((i & 256) != 0) {
            str6 = "";
        }
        if ((i & 512) != 0) {
            j2 = 0;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str8 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c508400Jwk2 = null;
        }
        if ((i & 8192) != 0) {
            c510300Jzo = new C510300Jzo();
        }
        if (str7 != null && str7.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            map.put("anchor_id", str7);
            map.put("sec_another_user_id", str7);
            map.put("sec_anchor_id", str7);
        } else {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            String strLJIJ = interfaceC500940JkiUser.LJIJ(ownerUserId);
            map.put("anchor_id", strLJIJ);
            map.put("sec_another_user_id", strLJIJ);
            map.put("sec_anchor_id", strLJIJ);
        }
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        map.put("room_id", String.valueOf(lValueOf));
        w.LIZ.getClass();
        map.put("enter_from_merge", w.LJIIIZ());
        map.put("enter_method", w.LJIIL());
        map.put("show_entrance", str);
        map.put("request_id", w.LJIJI());
        map.put("video_id", w.LJJII());
        if (room != null && (owner2 = room.getOwner()) != null && (subscribeInfo = owner2.getSubscribeInfo()) != null && subscribeInfo.isSubscribed()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map.put("is_subscribe", String.valueOf(i2));
        map.remove("_user_temp_ts");
        map.remove("_user_sku_ts");
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, true);
        if (fragmentManagerLJIL != null) {
            SubPrivilegeDetailPopup subPrivilegeDetailPopup = new SubPrivilegeDetailPopup();
            if (bool != null) {
                subPrivilegeDetailPopup.LLJILLL = Boolean.valueOf(bool.booleanValue());
            }
            subPrivilegeDetailPopup.LLJJI = str8;
            subPrivilegeDetailPopup.LLJJIJIIJIL = c510300Jzo;
            subPrivilegeDetailPopup.LLJJIII = str;
            subPrivilegeDetailPopup.LLJJIJI = str2;
            subPrivilegeDetailPopup.LLJ = room;
            subPrivilegeDetailPopup.LLJJ = str7;
            if (str7 == null || str7.length() == 0) {
                Room room2 = subPrivilegeDetailPopup.LLJ;
                if (room2 != null && (owner = room2.getOwner()) != null) {
                    secUid = owner.getSecUid();
                } else {
                    secUid = null;
                }
                subPrivilegeDetailPopup.LLJJ = secUid;
            }
            subPrivilegeDetailPopup.LLJILJILJ = c494830Jar;
            subPrivilegeDetailPopup.LLJILJIL.putAll(map);
            C2211631BhB.LJIIJ(subPrivilegeDetailPopup);
            subPrivilegeDetailPopup.LLJJIJIL = j2;
            subPrivilegeDetailPopup.LLJJJ = str6;
            subPrivilegeDetailPopup.LLJJJJ = c508400Jwk2;
            if (Intrinsics.LJFF(str6, EnumC504050Jpj.SUB_ONLY_VIDEO.getSource())) {
                subPrivilegeDetailPopup.LLJJJIL = false;
            }
            subPrivilegeDetailPopup.show(fragmentManagerLJIL, "SubPrivilegeDetailPopup");
        }
    }
}
