package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.0KBB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBB {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0KBC());

    public static final C0KM7 LIZ(Context context) {
        return C0W0R.LIZ(context);
    }

    public static final void LIZIZ(FragmentManager fragmentManager, String str, EnumC513410KBn enumC513410KBn) {
        C0KCF c0kcf = new C0KCF(null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, 0, null, null, null, null, null, 0, null, 0L, 0L, false, -1, 15);
        c0kcf.LJJI = str;
        C513690KCp.LIZ(c0kcf, null, enumC513410KBn, 10).show(fragmentManager, "");
    }

    public static final void LIZJ(FragmentManager fragmentManager, C0KCF c0kcf, Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("schema data:");
        sbLIZ.append(c0kcf);
        C20441214yg.LIZIZ("LiveSdkSubscriptionPaymentService", C2188811AlT.LIZIZ(sbLIZ));
        C513690KCp.LIZ(c0kcf, map, null, 12).show(fragmentManager, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(androidx.fragment.app.FragmentManager r7, X.C0KCF r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            X.0KCs r0 = com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet.LLLI
            r0.getClass()
            com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet r3 = new com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.ui.SubPackagePageSheet
            r3.<init>()
            r3.LLL = r8
            long r0 = java.lang.System.currentTimeMillis()
            r3.LLJZIJLIL = r0
            r3.LLJZ = r9
            java.lang.String r1 = r8.LJII
            java.lang.String r0 = "show_entrance"
            r9.put(r0, r1)
            java.lang.String r1 = r8.LJIIIIZZ
            if (r1 == 0) goto L24
            java.lang.String r0 = "group_id"
            r9.put(r0, r1)
        L24:
            java.lang.String r1 = "room_id"
            boolean r0 = r9.containsKey(r1)
            if (r0 != 0) goto L31
            java.lang.String r0 = r8.LJIILJJIL
            r9.put(r1, r0)
        L31:
            r4 = 0
            r3.LLLF = r4
            r2 = 0
            r3.LLJLLL = r2
            java.lang.String r0 = r8.LJJ
            X.C513380KBk.LIZ(r0)
            X.0KCq r0 = r3.uS()
            if (r0 == 0) goto L51
            X.0KCb r6 = r0.LLJ
            if (r6 == 0) goto L51
            java.lang.String r5 = r8.LIZ
            java.lang.String r1 = r8.LJI
            r0 = 1
            X.0KBn r0 = X.C513500KBw.LIZ(r5, r1, r0)
            r6.LIZJ = r0
        L51:
            java.lang.Boolean r1 = r8.LJIIIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
            java.lang.String r1 = r8.LJII
            java.lang.String r0 = "others_homepage"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L82
            X.0KCq r0 = r3.uS()
            if (r0 == 0) goto L80
            X.0KCb r0 = r0.LLJ
            if (r0 == 0) goto L80
            X.0KBn r0 = r0.LIZJ
        L71:
            boolean r0 = X.C513380KBk.LIZJ(r0)
            if (r0 != 0) goto L82
            r0 = 0
        L78:
            r3.LLLF = r0
            java.lang.String r0 = "sub_package_page"
            X.C19322110iZ.LJFF(r7, r3, r0, r2, r4)
            return
        L80:
            r0 = r2
            goto L71
        L82:
            r0 = 1
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KBB.LIZLLL(androidx.fragment.app.FragmentManager, X.0KCF, java.util.Map):void");
    }

    public final void LJ(Context context, Room room, String str, long j, long j2) {
        boolean z;
        FragmentManager supportFragmentManager;
        String str2;
        String str3;
        String str4;
        String str5;
        String pageName;
        SubscribeInfo subscribeInfo;
        SubscribeInfo subscribeInfo2;
        SubscribeInfo subscribeInfo3;
        SubscribeInfo subscribeInfo4;
        String secUid;
        SubscribeInfo subscribeInfo5 = room.getOwner().getSubscribeInfo();
        int i = 1;
        if (subscribeInfo5 != null && subscribeInfo5.isSolEligible) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        User owner = room.getOwner();
        if (owner != null && (secUid = owner.getSecUid()) != null && C500260Jjc.LJJIIZ(secUid)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap.put("anchor_id", room.getOwner().getSecUid());
            linkedHashMap.put("sec_another_user_id", room.getOwner().getSecUid());
            linkedHashMap.put("sec_anchor_id", room.getOwner().getSecUid());
        } else {
            String strLJIJ = UserService.getInstance().user().LJIJ(room.getOwnerUserId());
            linkedHashMap.put("anchor_id", strLJIJ);
            linkedHashMap.put("sec_another_user_id", strLJIJ);
            linkedHashMap.put("sec_anchor_id", strLJIJ);
        }
        String idStr = room.getIdStr();
        if (idStr == null) {
            idStr = "";
        }
        linkedHashMap.put("room_id", idStr);
        w.LIZ.getClass();
        linkedHashMap.put("enter_from_merge", w.LJIIIZ());
        linkedHashMap.put("enter_method", w.LJIIL());
        linkedHashMap.put("show_entrance", str);
        linkedHashMap.put("request_id", w.LJIJI());
        linkedHashMap.put("video_id", w.LJJII());
        User owner2 = room.getOwner();
        if (owner2 == null || (subscribeInfo4 = owner2.getSubscribeInfo()) == null || !subscribeInfo4.isSubscribed()) {
            i = 0;
        }
        linkedHashMap.put("is_subscribe", String.valueOf(i));
        linkedHashMap.remove("_user_temp_ts");
        linkedHashMap.remove("_user_sku_ts");
        C19EG c19egLIZ = C1124140fMK.LIZ(context);
        if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    value = "";
                }
                linkedHashMap2.put(key, value);
            }
            linkedHashMap2.put("anchor_id", room.getOwner().getIdStr());
            String idStr2 = room.getOwner().getIdStr();
            String str6 = CardStruct.IStatusCode.DEFAULT;
            if (idStr2 == null) {
                idStr2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap2.put("log_anchor_id", idStr2);
            linkedHashMap2.put("from_sub_enter", "");
            linkedHashMap2.put("show_entrance", str);
            linkedHashMap2.put("subscribe_state", ((ISubscriptionStatusService) this.LIZ.getValue()).m70(room).LIZIZ);
            linkedHashMap2.put("need_high_state_page", "false");
            linkedHashMap2.put("privilege_show_type", "vertical");
            linkedHashMap2.put("privilege_page", "main_page");
            linkedHashMap2.put("use_spark", "1");
            linkedHashMap2.put("user_present", "1");
            linkedHashMap2.put("is_native", "1");
            User owner3 = room.getOwner();
            if (owner3 == null || (subscribeInfo3 = owner3.getSubscribeInfo()) == null || (str2 = subscribeInfo3.packageId) == null) {
                str2 = "";
            }
            linkedHashMap2.put("package_id", str2);
            linkedHashMap2.put("sec_anchor_id", room.getOwner().getSecUid());
            linkedHashMap2.put("is_full_page", "false");
            String secUid2 = room.getOwner().getSecUid();
            String idStr3 = room.getOwner().getIdStr();
            if (room.liveSubOnlyTier > 0) {
                str3 = "plan_change";
            } else {
                str3 = "normal_sub";
            }
            User owner4 = room.getOwner();
            if (owner4 == null || (subscribeInfo2 = owner4.getSubscribeInfo()) == null || (str4 = subscribeInfo2.packageId) == null) {
                str4 = "";
            }
            User owner5 = room.getOwner();
            if (owner5 == null || (subscribeInfo = owner5.getSubscribeInfo()) == null || (str5 = subscribeInfo.packageId) == null) {
                str5 = "";
            }
            String str7 = ((ISubscriptionStatusService) this.LIZ.getValue()).m70(room).LIZIZ;
            String idStr4 = room.getIdStr();
            if (idStr4 != null) {
                str6 = idStr4;
            }
            String strLIZ = C497390Jez.LIZ("live_room");
            if (room.liveSubOnlyMonth <= 0 && room.liveSubOnlyTier > 0) {
                pageName = EnumC513390KBl.PLAN_CHANGE_PAGE.getPageName();
            } else {
                pageName = EnumC513390KBl.PACKAGE_PAGE.getPageName();
            }
            C513690KCp.LIZ(new C0KCF(secUid2, idStr3, "", false, 0, str3, str4, str, null, Boolean.TRUE, null, str7, "vertical", "main_page", str6, false, "", true, null, 1, null, strLIZ, str5, pageName, C0KVU.LIZ(room.getOwner()), 0, null, j, j2, true, 1750079232, 12), linkedHashMap2, null, 12).show(supportFragmentManager, "");
        }
    }
}
