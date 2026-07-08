package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.bulletinboard.BulletinBoardFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMCrossAppFeatureDiffApi;
import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntrance;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229030i5V {
    public static final C1229030i5V LIZJ = new C1229030i5V();
    public final /* synthetic */ C1530805z0 LIZ = C1530805z0.LIZ;
    public final /* synthetic */ C1229120i5e LIZIZ = C1229120i5e.LIZ;

    public final void LIZLLL(int i, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        C1530805z0.LIZ(i, z, interfaceC1493105sv);
    }

    public final void LJ(List<String> list, String str, InterfaceC1493105sv interfaceC1493105sv) {
        C1530805z0.LIZIZ(list, str, interfaceC1493105sv);
    }

    public static boolean LIZ() {
        BulletinBoardFeature bulletinBoardFeatureLIZ = BulletinBoardFeature.LIZ.LIZ();
        if (bulletinBoardFeatureLIZ == null || !bulletinBoardFeatureLIZ.LLIL()) {
            return false;
        }
        IMCrossAppFeatureDiffApi.LIZ.getClass();
        IMCrossAppFeatureDiffApi iMCrossAppFeatureDiffApiLIZIZ = C898670ZNh.LIZIZ();
        if (iMCrossAppFeatureDiffApiLIZIZ == null) {
            return false;
        }
        iMCrossAppFeatureDiffApiLIZIZ.LJIILL();
        return true;
    }

    public static void LIZIZ(Context context) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        GroupCompositeType groupCompositeType = new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.FAN_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue());
        GroupCompositeType groupCompositeType2 = new GroupCompositeType(EnumC1228990i5R.PUBLIC_GROUP.getValue(), EnumC913760Zt0.CAMPUS_GROUP.getValue(), EnumC1219960hqs.UNKNOWN.getValue());
        boolean z2 = false;
        Map mapLJII = C1229040i5W.LJII(C1697810uHb.LJIIJJI(groupCompositeType, groupCompositeType2));
        C1228920i5K.LIZIZ(EnumC1229060i5Y.OPEN_CREATE_GROUP_PANEL);
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJII;
        GroupEntrance groupEntrance = (GroupEntrance) linkedHashMap.get(groupCompositeType);
        if (groupEntrance != null) {
            z = groupEntrance.canCreate;
        } else {
            z = false;
        }
        arrayList.add(new C1227910i3h(z, 27));
        GroupEntrance groupEntrance2 = (GroupEntrance) linkedHashMap.get(groupCompositeType2);
        if (groupEntrance2 != null) {
            z2 = groupEntrance2.canCreate;
        }
        arrayList.add(new C1227900i3g(z2, 27));
        C1227130i2R.LIZLLL(context, new C1226980i2C(context, null, null, "notification_page", "new_group", false, null, null, null, false, null, null, null, true, null, null, arrayList, null, null, false, false, false, EnumC1230500i7s.CREATE_GROUP_INBOX_TOP_BAR, 1071382502), "im", "inbox_top_bar", "native");
    }

    public static void LIZJ(Context context) {
        C1228650i4t c1228650i4t = new C1228650i4t("notification_page", "inbox_top_bar", EnumC1228990i5R.PUBLIC_GROUP.getValue(), null, 0, new C1228700i4y(0, 0, "notification_page", null, null, 27), false, null, null, true, null, false, null, null, null, null, 0, 0, false, null, null, EnumC1228990i5R.PRIVATE_GROUP, -1064, 0);
        C1228470i4b c1228470i4b = new C1228470i4b(c1228650i4t, new C1228810i59("notification_page", "inbox_top_bar", C461720I8s.LIZIZ(), false, false, null, 0L, null, null, null, 0, null, null, null, null, null, false, null, null, 4194296));
        InterfaceC1228540i4i.LIZ.getClass();
        C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "im", "inbox_top_bar").LIZLLL(context, c1228470i4b, C1228590i4n.LIZ().LIZ(context, c1228650i4t));
    }

    public final void LJFF(List<String> list, InterfaceC1493105sv interfaceC1493105sv) {
        this.LIZ.getClass();
        interfaceC1493105sv.sendEvent("ttsocial_create_group_menu_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("menu_array", list.toString())));
    }

    public final void LJI(int i, InterfaceC1493105sv interfaceC1493105sv) {
        String str;
        Boolean boolValueOf;
        this.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        if (i == R.raw.icon_two_person_plus) {
            str = "4";
        } else if (i == R.raw.icon_person_plus) {
            str = "5";
        } else {
            str = "3";
        }
        linkedHashMap.put("icon_version", str);
        C1759206uk c1759206uk = C1759206uk.LIZ;
        linkedHashMap.put("group_chat_enabled", C1529305yl.LIZ(Boolean.valueOf(C1759206uk.LIZ())));
        BulletinBoardFeature bulletinBoardFeatureLIZ = BulletinBoardFeature.LIZ.LIZ();
        if (bulletinBoardFeatureLIZ != null) {
            boolValueOf = Boolean.valueOf(bulletinBoardFeatureLIZ.LLIL());
        } else {
            boolValueOf = null;
        }
        linkedHashMap.put("is_bb_creator", C1529305yl.LIZ(boolValueOf));
        interfaceC1493105sv.sendEvent("show_create_group", linkedHashMap);
    }
}
