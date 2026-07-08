package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestClickOutPushEvent;
import com.bytedance.android.livesdk.dialog.CommonBottomConfirmDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482120IvS implements InterfaceC468080IXe {
    @Override // X.InterfaceC468080IXe
    public final boolean LIZ(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        if (uri != null) {
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multilive_type") == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "join_direct");
            } else {
                return true;
            }
        }
        if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "1") && !LIZJ(uri, (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class))) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Uri uri, Room room) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Long lValueOf;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        Long lValueOf2 = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "click_push_out_app_live_multi_guest")) {
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id")) != null) {
                lValueOf2 = Long.valueOf(CastLongProtector.parseLong(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
            }
            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(C19EG c19eg, EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession.LJ(enterRoomConfig).LIZIZ(new Event("multi_live_activity_page_enter_room", 5632, C0IIR.BussinessApiCall));
        if (enterRoomConfig.mRoomsData.roomId > 0) {
            return ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLiveFromSchema(c19eg, enterRoomConfig);
        }
        return false;
    }

    @Override // X.InterfaceC468080IXe
    public final boolean LIZIZ(Context context, Uri uri, EnterRoomConfig enterRoomConfig) {
        boolean z;
        String str;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        Object c098200Yq7;
        Object c098200Yq8;
        long[] jArrLLIIIILZ;
        int i;
        int i2;
        Long lLJIILIIL;
        Integer numLJIIJJI;
        if (uri == null) {
            return false;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            z = true;
        } else {
            z = false;
        }
        if (!UserService.getInstance().user().isLogin()) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(context, true);
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131853574);
            c476760Imo.LIZLLL = "interact";
            c476760Imo.LIZJ = 0;
            interfaceC500940JkiUser.LJIILL(c19egLJIJJLI, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            return false;
        }
        if (z && room != null && room.getOwnerUserId() != 0 && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            C766270U4b.LIZLLL(2131853520);
            return false;
        }
        String str2 = "";
        if (LIZJ(uri, room)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_mg_reason");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            EnumC482130IvT.Companion.getClass();
            EnumC482130IvT[] enumC482130IvTArrValues = EnumC482130IvT.values();
            int length = enumC482130IvTArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                EnumC482130IvT enumC482130IvT = enumC482130IvTArrValues[i3];
                if (Intrinsics.LJFF(enumC482130IvT.getValue(), str2)) {
                    DataChannelGlobal.LLILZ.FQ2(MultiGuestClickOutPushEvent.class, enumC482130IvT);
                    break;
                }
                i3++;
            }
            return false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "multilive_type");
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = CardStruct.IStatusCode.DEFAULT;
        }
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        int iHashCode = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.hashCode();
        if (iHashCode == 49 ? strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals("1") : iHashCode == 53 ? strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals("5") : iHashCode == 54 && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.equals("6")) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        roomsData.enterForMultiLive = str;
        enterRoomConfig.mRoomsData.actionTypeForMultiLive = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_mg_toplive");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
            str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        }
        enterRoomConfig.mRoomsData.isFromMgTopLive = str3;
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "feed_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
            }
            c098200Yq = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str4 = (String) c098200Yq;
        if (str4 == null) {
            str4 = "";
        }
        try {
            c098200Yq2 = (Map) C19748512Ol.LIZJ.LJIIIIZZ(str4, new TypeToken<Map<String, String>>() { // from class: X.0IvW
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        Map<String, String> linkedHashMap = (Map) c098200Yq2;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_params");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
            }
            c098200Yq3 = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        String str5 = (String) c098200Yq3;
        if (str5 == null) {
            str5 = "";
        }
        try {
            try {
                c098200Yq4 = (Map) C19748512Ol.LIZJ.LJIIIIZZ(str5, new TypeToken<Map<String, String>>() { // from class: X.0IvU
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq4);
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq4 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq4);
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        Map linkedHashMap2 = (Map) c098200Yq4;
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "card_label_infos");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
            }
            c098200Yq5 = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq5 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq5)) {
            c098200Yq5 = null;
        }
        String str6 = (String) c098200Yq5;
        if (str6 == null) {
            str6 = "";
        }
        try {
            try {
                c098200Yq6 = (Map) C19748512Ol.LIZJ.LJIIIIZZ(str6, new TypeToken<Map<String, String>>() { // from class: X.0IvV
                }.getType());
                C189200o6.m2constructorimpl(c098200Yq6);
            } catch (Throwable th7) {
                th = th7;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq6 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq6);
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (C189200o6.m7isFailureimpl(c098200Yq6)) {
            c098200Yq6 = null;
        }
        Map linkedHashMap3 = (Map) c098200Yq6;
        if (linkedHashMap3 == null) {
            linkedHashMap3 = new LinkedHashMap();
        }
        try {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mg_distribution_infos");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = "";
            }
            c098200Yq7 = URLDecoder.decode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, "UTF-8");
            C189200o6.m2constructorimpl(c098200Yq7);
        } catch (Throwable th9) {
            TryCatchGuardChecker.doCheck(th9);
            c098200Yq7 = new C098200Yq(th9);
            C189200o6.m2constructorimpl(c098200Yq7);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq7)) {
            c098200Yq7 = null;
        }
        String str7 = (String) c098200Yq7;
        if (str7 == null) {
            str7 = "";
        }
        try {
            c098200Yq8 = (Map) C19748512Ol.LIZJ.LJIIIIZZ(str7, new TypeToken<Map<String, String>>() { // from class: X.0IvX
            }.getType());
            C189200o6.m2constructorimpl(c098200Yq8);
        } catch (Throwable th10) {
            TryCatchGuardChecker.doCheck(th10);
            c098200Yq8 = new C098200Yq(th10);
            C189200o6.m2constructorimpl(c098200Yq8);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq8)) {
            c098200Yq8 = null;
        }
        Map linkedHashMap4 = (Map) c098200Yq8;
        if (linkedHashMap4 == null) {
            linkedHashMap4 = new LinkedHashMap();
        }
        EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
        roomsData2.mgExtraInfo = linkedHashMap;
        roomsData2.mgAISummaryExtra = new LinkedHashMap(linkedHashMap2);
        enterRoomConfig.mRoomsData.mgCardLabelInfo = new LinkedHashMap(linkedHashMap3);
        enterRoomConfig.mRoomsData.mgDistributionInfo = new LinkedHashMap(linkedHashMap4);
        EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_mg_reason");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 != null) {
            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8;
        }
        logData.enterMgReason = str2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mg_enter_type");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9)) != null) {
            enterRoomConfig.mRoomsData.mgEnterType = numLJIIJJI.intValue();
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mg_from_source_user_id");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) != null) {
            enterRoomConfig.mRoomsData.mgFromSourceUserId = lLJIILIIL.longValue();
        }
        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
        long[] jArr = roomsData3.roomIds;
        if (jArr == null) {
            jArrLLIIIILZ = null;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (long j : jArr) {
                linkedHashSet.add(Long.valueOf(j));
            }
            jArrLLIIIILZ = C13LP.LLIIIILZ(linkedHashSet);
        }
        roomsData3.roomIds = jArrLLIIIILZ;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "join_direct");
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11, "1")) {
            enterRoomConfig.mRoomsData.enterForJoinDirect = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11;
            C19EG c19egLJIJJLI2 = C520010KaN.LJIJJLI(context, true);
            if (c19egLJIJJLI2 == null) {
                return false;
            }
            return LJ(c19egLJIJJLI2, enterRoomConfig);
        }
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "1")) {
            C19EG c19egLJIJJLI3 = C520010KaN.LJIJJLI(context, true);
            if (c19egLJIJJLI3 == null) {
                return false;
            }
            AwS251S0300000_7 awS251S0300000_7 = new AwS251S0300000_7(context, this, enterRoomConfig, 1);
            int i4 = 2131841273;
            if (C924810aAp.LJ().LJIIIIZZ) {
                if (z) {
                    if (C924790aAn.LIZLLL().LJFF()) {
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841276));
                        return false;
                    }
                    if (C924790aAn.LIZLLL().LJI()) {
                        LIZLLL(c19egLJIJJLI3, 2131844513, 2131841627, 2131841273, new AwS551S0100000_7(awS251S0300000_7, 9));
                        return true;
                    }
                    LIZLLL(c19egLJIJJLI3, 2131844514, 2131844515, 2131841273, new AwS559S0100000_15(room, 550));
                    return true;
                }
            } else {
                if (z) {
                    i2 = 2131841626;
                    i4 = 2131841272;
                }
                LIZLLL(c19egLJIJJLI3, 2131844512, i2, i4, new AwS551S0100000_7(awS251S0300000_7, 10));
                return true;
            }
            i2 = 2131841628;
            LIZLLL(c19egLJIJJLI3, 2131844512, i2, i4, new AwS551S0100000_7(awS251S0300000_7, 10));
            return true;
        }
        if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "5") && !Intrinsics.LJFF(str3, "1")) {
            C19EG c19egLJIJJLI4 = C520010KaN.LJIJJLI(context, true);
            if (c19egLJIJJLI4 == null) {
                return false;
            }
            AwS251S0300000_7 awS251S0300000_72 = new AwS251S0300000_7(context, this, enterRoomConfig, 2);
            if (C924810aAp.LJ().LJIIIIZZ) {
                if (z) {
                    C766270U4b.LIZLLL(2131843679);
                    return false;
                }
            } else {
                if (z) {
                    i = 2131841625;
                }
                LIZLLL(c19egLJIJJLI4, 2131844511, i, 2131841271, new AwS551S0100000_7(awS251S0300000_72, 11));
                return true;
            }
            i = 2131841629;
            LIZLLL(c19egLJIJJLI4, 2131844511, i, 2131841271, new AwS551S0100000_7(awS251S0300000_72, 11));
            return true;
        }
        C19EG c19egLJIJJLI5 = C520010KaN.LJIJJLI(context, true);
        if (c19egLJIJJLI5 == null) {
            return false;
        }
        return LJ(c19egLJIJJLI5, enterRoomConfig);
    }

    public static void LIZLLL(C19EG c19eg, int i, int i2, int i3, Function0 function0) {
        C19EG c19egLJIJJLI = C520010KaN.LJIJJLI(c19eg, true);
        if (c19egLJIJJLI == null) {
            function0.invoke();
            return;
        }
        C1838140xvw c1838140xvw = new C1838140xvw(i, i2, i3, function0);
        CommonBottomConfirmDialog commonBottomConfirmDialog = new CommonBottomConfirmDialog(C1834150xpV.LJIIJJI(c19egLJIJJLI));
        c1838140xvw.invoke(commonBottomConfirmDialog);
        C500260Jjc.LJJLIIIJLLLLLLLZ(commonBottomConfirmDialog);
    }
}
