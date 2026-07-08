package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.EcButtonFrequency;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13UY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UY implements InterfaceC710490Rtv {
    public static final C13UY LIZ = new C13UY();
    public static final List<String> LIZIZ = new ArrayList();
    public static final Map<Long, Boolean> LIZJ = new LinkedHashMap();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(251));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(252));
    public static final C01GW LJFF = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS219S0000000_30.get$arr$(253));

    @Override // X.InterfaceC710490Rtv
    public final void LIZ() {
    }

    @Override // X.InterfaceC710490Rtv
    public final void LJFF(Context context) {
    }

    public static final Keva LJIIIIZZ() {
        return (Keva) LJFF.getValue();
    }

    @Override // X.InterfaceC710490Rtv
    public final List<String> LIZLLL() {
        return LIZIZ;
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZJ(Long l) {
        Set<String> setKeySet;
        Object objLJJLIIIJL;
        List list;
        ((LinkedHashMap) LIZJ).clear();
        C13UZ c13uz = (C13UZ) LJ.getValue();
        c13uz.getClass();
        if (l != null) {
            l.longValue();
            Map<String, EcButtonConfig> map = C20018213Ue.LIZ().configs;
            if (map != null && (setKeySet = map.keySet()) != null) {
                for (Object obj : setKeySet) {
                    if (!c13uz.LIZJ.containsKey(obj)) {
                        c13uz.LIZJ.put((String) obj, new ArrayList());
                    }
                    List list2 = (List) ((LinkedHashMap) c13uz.LIZJ).get(obj);
                    if (list2 != null) {
                        objLJJLIIIJL = C13LP.LJJLIIIJL(list2);
                    } else {
                        objLJJLIIIJL = null;
                    }
                    if (!Intrinsics.LJFF(objLJJLIIIJL, l) && (list = (List) ((LinkedHashMap) c13uz.LIZJ).get(obj)) != null) {
                        list.add(l);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fa  */
    @Override // X.InterfaceC710490Rtv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(java.lang.Long r20) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13UY.LJ(java.lang.Long):boolean");
    }

    public static String LJII(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('.');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC710490Rtv
    public final void LIZIZ(Long l, String str) {
        int i;
        int iIntValue;
        int iIntValue2;
        EcButtonFrequency ecButtonFrequency;
        C20017813Ua c20017813Ua = (C20017813Ua) LIZLLL.getValue();
        c20017813Ua.getClass();
        EcButtonConfig ecButtonConfigLIZIZ = C20018213Ue.LIZIZ(str);
        if (ecButtonConfigLIZIZ != null && (ecButtonFrequency = ecButtonConfigLIZIZ.frequency) != null) {
            i = ecButtonFrequency.departureDisplayCountWithoutClick;
        } else {
            i = C20017113Tt.LIZ().departureDisplayCountWithoutClick;
        }
        Integer num = (Integer) ((LinkedHashMap) c20017813Ua.LIZIZ).get(str);
        int iIntValue3 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > i) {
            iIntValue %= i;
        }
        int i2 = iIntValue + 1;
        c20017813Ua.LIZIZ.put(str, Integer.valueOf(i2));
        C13UY c13uy = LIZ;
        LJIIIIZZ().storeInt(LJII(str, "key_non_click_count"), i2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        c20017813Ua.LIZ.put(str, Long.valueOf(jCurrentTimeMillis));
        LJIIIIZZ().storeLong(LJII(str, "key_last_show_time"), jCurrentTimeMillis);
        C13UZ c13uz = (C13UZ) LJ.getValue();
        c13uz.LIZ.put(str, Long.valueOf(LJIIIIZZ().getLong(LJII(str, "key_last_show_time"), 0L)));
        Map<String, Integer> map = c13uz.LIZIZ;
        Integer num2 = (Integer) ((LinkedHashMap) map).get(str);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        map.put(str, Integer.valueOf(iIntValue2 + 1));
        Keva kevaLJIIIIZZ = LJIIIIZZ();
        String strLJII = LJII(str, "key_show_count");
        Integer num3 = (Integer) ((LinkedHashMap) c13uz.LIZIZ).get(str);
        if (num3 != null) {
            iIntValue3 = num3.intValue();
        }
        kevaLJIIIIZZ.storeInt(strLJII, iIntValue3);
        List list = (List) ((LinkedHashMap) c13uz.LIZJ).get(str);
        if (list != null) {
            list.clear();
        }
    }

    @Override // X.InterfaceC710490Rtv
    public final void LJI(Long l, String str) {
        ((C20017813Ua) LIZLLL.getValue()).LIZIZ.put(str, 0);
        C13UY c13uy = LIZ;
        LJIIIIZZ().storeInt(LJII(str, "key_non_click_count"), 0);
    }
}
