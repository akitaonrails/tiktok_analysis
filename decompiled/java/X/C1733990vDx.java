package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommerceStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.OecInitData;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733990vDx {
    public static final HashMap<Long, OecInitData> LIZ = new HashMap<>();
    public static final Map<Long, AnonymousClass0957<BaseResponse<PopProductResp>>> LIZIZ = new LinkedHashMap();

    public static OecInitData LIZ(Room room) {
        String str;
        Type type;
        OecInitData oecInitData = null;
        if (room == null) {
            return null;
        }
        OecInitData oecInitData2 = LIZ.get(Long.valueOf(room.getId()));
        if (oecInitData2 != null) {
            return oecInitData2;
        }
        CommerceStruct commerceStruct = room.getCommerceStruct();
        if (commerceStruct != null) {
            str = commerceStruct.oecInitDataString;
        } else {
            str = null;
        }
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(OecInitData.class));
            } else {
                type = new TypeToken<OecInitData>() { // from class: X.0vDy
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
            if (!(objFromJson instanceof OecInitData)) {
                objFromJson = null;
            }
            OecInitData oecInitData3 = (OecInitData) objFromJson;
            oecInitData = oecInitData3;
            if (oecInitData3 != null) {
                LIZ.put(Long.valueOf(room.getId()), oecInitData);
                return oecInitData;
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return oecInitData;
    }

    public static void LIZIZ(long j) {
        LIZ.remove(Long.valueOf(j));
        AnonymousClass0957<BaseResponse<PopProductResp>> anonymousClass0957Remove = LIZIZ.remove(Long.valueOf(j));
        if (anonymousClass0957Remove != null) {
            anonymousClass0957Remove.LIZIZ(null);
        }
    }
}
