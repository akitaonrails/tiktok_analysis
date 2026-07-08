package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.EcShopBagCommonBubbleConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.11Xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19516211Xc {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final int LIZIZ;

    static {
        C21213117zt.LIZ.getClass();
        LIZIZ = C21213117zt.LJII();
    }

    public static List LIZ(boolean z, boolean z2, EnumC598510Ndh enumC598510Ndh) {
        int iIntValue;
        n nVarLJJIJ;
        Type type;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(Integer.valueOf(LIZIZ));
        }
        if (enumC598510Ndh != EnumC598510Ndh.ROOM_ENTER) {
            return arrayList;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it2 = ((n) C11XZ.LIZIZ.getValue()).entrySet().iterator();
        while (true) {
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ((Map.Entry) it2.next()).getKey());
            if (numLJIIJJI != null) {
                iIntValue = numLJIIJJI.intValue();
            } else {
                iIntValue = -1;
            }
            Object obj = null;
            try {
                nVarLJJIJ = ((n) C11XZ.LIZIZ.getValue()).LJJIJ(String.valueOf(iIntValue));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                nVarLJJIJ = null;
            }
            if (nVarLJJIJ != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        z3 = true;
                    }
                    if (!z3) {
                        type = new TypeToken<EcShopBagCommonBubbleConfig>() { // from class: X.11Xb
                        }.getType();
                    } else {
                        type = C2371409Qy.LIZJ(C13LE.LJII(EcShopBagCommonBubbleConfig.class));
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, nVarLJJIJ, type);
                    if (!(objFromJson instanceof EcShopBagCommonBubbleConfig)) {
                        objFromJson = null;
                    }
                    obj = objFromJson;
                } catch (s e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                if (obj != null) {
                    linkedHashMap.put(Integer.valueOf(iIntValue), obj);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i = ((EcShopBagCommonBubbleConfig) entry.getValue()).frequencyLimit;
            C19516311Xd c19516311Xd = C19516311Xd.LIZ;
            String str = ((EcShopBagCommonBubbleConfig) entry.getValue()).bubbleKey;
            c19516311Xd.getClass();
            if (i > C19516311Xd.LIZIZ.getInt(C19516311Xd.LIZ(str), 0) && (((Number) entry.getKey()).intValue() != 4 || z2)) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public static void LIZIZ(long j, long j2, boolean z, EnumC598510Ndh enumC598510Ndh) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C19516511Xf(enumC598510Ndh, z, j, j2, null, null), 3);
    }
}
