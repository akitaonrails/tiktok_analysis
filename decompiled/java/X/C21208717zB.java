package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.hotroom.HotRoomInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.17zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21208717zB {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(String str, String str2) {
        try {
            Uri uri = UriProtector.parse(str);
            Uri uri2 = UriProtector.parse(str2);
            String strLIZ = C416901jj.LIZ(uri, "surl");
            String strLIZ2 = C416901jj.LIZ(uri2, "surl");
            String strLIZ3 = C416901jj.LIZ(uri, "room_id");
            String strLIZ4 = C416901jj.LIZ(uri2, "room_id");
            if (strLIZ == null || strLIZ2 == null || !Intrinsics.LJFF(strLIZ, strLIZ2) || strLIZ3 == null || strLIZ4 == null) {
                return false;
            }
            if (!Intrinsics.LJFF(strLIZ3, strLIZ4)) {
                return false;
            }
            return true;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static JSONObject LIZ(Long l, long j, String str, boolean z, boolean z2, Map map) throws JSONException {
        Object obj;
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("start_click_time", j);
        if (str.length() == 0) {
            str = "live_room";
        }
        jSONObject.put("enter_from", str);
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("is_first_click", obj);
        if (z2) {
            str2 = "1";
        }
        jSONObject.put("is_enable_reuse", str2);
        Object obj2 = map;
        if (map == null) {
            obj2 = "";
        }
        jSONObject.put("extra_track_params", obj2);
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        HotRoomInfo hotRoomInfoLIZJ = C598410NdX.LIZJ(string);
        if (hotRoomInfoLIZJ != null) {
            jSONObject.put("hot_live_room_path", C1741890vQh.LJIIIIZZ(hotRoomInfoLIZJ));
        }
        return jSONObject;
    }

    public static void LIZJ(String str, Long l, long j, String str2, boolean z, Map map, InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        Object obj;
        JSONObject jSONObjectLIZ = LIZ(l, j, str2, z, true, map);
        Map<String, Object> globalProps = interfaceC1541990qEH.getGlobalProps();
        Map map2 = null;
        if (globalProps != null) {
            obj = globalProps.get("queryItems");
        } else {
            obj = null;
        }
        if (C19719512Dh.LJII(obj)) {
            map2 = (Map) obj;
        }
        Uri uri = UriProtector.parse(str);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str3 : queryParameterNames) {
                String strLIZ = C416901jj.LIZ(uri, str3);
                if (strLIZ != null && map2 != null) {
                    map2.put(str3, strLIZ);
                }
            }
        }
        C13DA c13da = new C13DA();
        c13da.put("shopping_list_datas", jSONObjectLIZ);
        if (map2 != null) {
            c13da.put("queryItems", map2);
        }
        if (z) {
            c13da.put("useReuse", "1");
        }
        interfaceC1541990qEH.U0(c13da.build());
    }
}
