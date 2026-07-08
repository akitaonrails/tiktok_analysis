package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopInfo4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104350eqP {
    public static String LIZ = CardStruct.IStatusCode.DEFAULT;
    public static String LIZIZ = "";

    public static void LIZ(Boolean bool, String str, List list) {
        String str2;
        int iIntValue;
        String str3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        String str4;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE2;
        RedEnvelopInfo4FE redEnvelopInfo4FE2;
        Integer num;
        RedEnvelopeMessage4FE redEnvelopeMessage4FE3;
        RedEnvelopInfo4FE redEnvelopInfo4FE3;
        HashMap map = new HashMap(7);
        String str5 = "";
        if (list == null || (redEnvelopeMessage4FE3 = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) == null || (redEnvelopInfo4FE3 = redEnvelopeMessage4FE3.envelopInfo) == null || (str2 = redEnvelopInfo4FE3.envelopeId) == null) {
            str2 = "";
        }
        map.put("envelope_id", str2);
        if (list != null && (redEnvelopeMessage4FE2 = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) != null && (redEnvelopInfo4FE2 = redEnvelopeMessage4FE2.envelopInfo) != null && (num = redEnvelopInfo4FE2.businessType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put("business_type", String.valueOf(iIntValue));
        if (list != null && (redEnvelopeMessage4FE = (RedEnvelopeMessage4FE) ListProtector.get(list, 0)) != null && (redEnvelopInfo4FE = redEnvelopeMessage4FE.envelopInfo) != null && (str4 = redEnvelopInfo4FE.sendUserId) != null) {
            str5 = str4;
        }
        map.put("send_user_id", str5);
        map.put("drop_reason", str);
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str3);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_data_drop");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_treasure_box_data_drop", map);
    }

    public static void LIZJ(Boolean bool, String str, List list) {
        long jLIZ;
        boolean zBooleanValue;
        int iIntValue;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        Integer num;
        String str2;
        HashMap map = new HashMap(11);
        try {
            jLIZ = C158B.LIZ() - CastLongProtector.parseLong(LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jLIZ = 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RedEnvelopInfo4FE redEnvelopInfo4FE2 = ((RedEnvelopeMessage4FE) it2.next()).envelopInfo;
            if (redEnvelopInfo4FE2 == null || (str2 = redEnvelopInfo4FE2.envelopeId) == null) {
                str2 = "";
            }
            arrayList.add(str2);
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        map.put("is_anchor", String.valueOf(zBooleanValue));
        map.put("duration", String.valueOf(jLIZ));
        map.put("envelope_id", LIZIZ);
        map.put("data_from", str);
        map.put("envelope_id_list", arrayList.toString());
        if ((!list.isEmpty()) && (redEnvelopInfo4FE = ((RedEnvelopeMessage4FE) ListProtector.get(list, 0)).envelopInfo) != null && (num = redEnvelopInfo4FE.businessType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put("business_type", String.valueOf(iIntValue));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_short_touch_pushin");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_treasure_box_short_touch_pushin", map);
    }

    public static void LIZLLL(Boolean bool, String str, List list) {
        int iIntValue;
        String str2;
        RedEnvelopInfo4FE redEnvelopInfo4FE;
        Integer num;
        String str3;
        InterfaceC500940Jki interfaceC500940JkiUser;
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap(11);
        map.put("envelope_id", LIZIZ);
        map.put("time_stamp", String.valueOf(C158B.LIZ()));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        UserService userService = UserService.getInstance();
        if (userService != null && (interfaceC500940JkiUser = userService.user()) != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
            map.put("user_id", String.valueOf(currentUser.getId()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            RedEnvelopInfo4FE redEnvelopInfo4FE2 = ((RedEnvelopeMessage4FE) it2.next()).envelopInfo;
            if (redEnvelopInfo4FE2 == null || (str3 = redEnvelopInfo4FE2.envelopeId) == null) {
                str3 = "";
            }
            arrayList.add(str3);
        }
        if (list.size() >= 0 && (redEnvelopInfo4FE = ((RedEnvelopeMessage4FE) ListProtector.get(list, 0)).envelopInfo) != null && (num = redEnvelopInfo4FE.businessType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        map.put("business_type", String.valueOf(iIntValue));
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_anchor", str2);
        map.put("data_from", str);
        map.put("envelope_id_list", arrayList.toString());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_treasure_box_short_touch_finish");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_treasure_box_short_touch_finish", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[PHI: r1
      0x0042: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v13 java.lang.String) binds: [B:10:0x0040, B:8:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r8, java.lang.String r9, java.util.List r10, java.lang.Boolean r11, java.lang.Exception r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104350eqP.LIZIZ(int, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Exception, boolean):void");
    }
}
