package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.form.vm.PcsFormVm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.SMBFormConsent;
import webcast.data.SMBFormDisclaimer;

/* JADX INFO: renamed from: X.0vF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734700vF6 {
    public static final C1734820vFI LIZ(PcsFormVm pcsFormVm) {
        InterfaceC1891350zJl next;
        C1727540v3Y c1727540v3Y;
        Pair pair;
        int i;
        int i2;
        int i3;
        SMBFormDisclaimer sMBFormDisclaimer;
        List<SMBFormConsent> list;
        int i4;
        List<AbstractC1727320v3C> listYQ2 = pcsFormVm.yQ2();
        if (listYQ2 == null) {
            listYQ2 = C13BV.INSTANCE;
        }
        Iterator<InterfaceC1891350zJl> it2 = pcsFormVm.getState().LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1727540v3Y) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next instanceof C1727540v3Y) {
            c1727540v3Y = (C1727540v3Y) next;
        } else {
            c1727540v3Y = null;
        }
        int i5 = 0;
        if (c1727540v3Y != null && (sMBFormDisclaimer = c1727540v3Y.LLILZIL) != null && (list = sMBFormDisclaimer.consents) != null) {
            int size = list.size();
            if (list.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<SMBFormConsent> it3 = list.iterator();
                i4 = 0;
                while (it3.hasNext()) {
                    if ((!it3.next().isOptional) && (i4 = i4 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            pair = new Pair(Integer.valueOf(size), Integer.valueOf(i4));
        } else {
            pair = new Pair(0, 0);
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        int size2 = listYQ2.size() + iIntValue;
        if (listYQ2.isEmpty()) {
            i = 0;
        } else {
            Iterator<AbstractC1727320v3C> it4 = listYQ2.iterator();
            i = 0;
            while (it4.hasNext()) {
                if (it4.next().LIZ().LJFF && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int i6 = i + iIntValue2;
        if (listYQ2.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<AbstractC1727320v3C> it5 = listYQ2.iterator();
            i2 = 0;
            while (it5.hasNext()) {
                Object obj = ((LinkedHashMap) pcsFormVm.LLILZLL).get(it5.next().LIZ().LIZ);
                if (obj == null) {
                    obj = EnumC1734720vF8.NONE;
                }
                if (obj != EnumC1734720vF8.NONE && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (listYQ2.isEmpty()) {
            i3 = 0;
        } else {
            Iterator<AbstractC1727320v3C> it6 = listYQ2.iterator();
            i3 = 0;
            while (it6.hasNext()) {
                if (C1533950q1J.LJ((String) ((LinkedHashMap) pcsFormVm.LLILZ).get(it6.next().LIZ().LIZ)) && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        Collection collectionValues = ((LinkedHashMap) pcsFormVm.LLIZLLLIL).values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it7 = collectionValues.iterator();
            while (it7.hasNext()) {
                if (((Boolean) it7.next()).booleanValue() && (i5 = i5 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return new C1734820vFI(size2, i6, i2, i3 + i5);
    }

    public static final void LIZIZ(PcsFormVm pcsFormVm, String str) {
        AbstractC1727320v3C next;
        C1727990v4H c1727990v4HLIZ;
        String str2;
        C1734810vFH c1734810vFH = pcsFormVm.LLJIJIL;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("click_position", str);
        List<AbstractC1727320v3C> listYQ2 = pcsFormVm.yQ2();
        if (listYQ2 == null) {
            listYQ2 = C13BV.INSTANCE;
        }
        Set setKeySet = ((LinkedHashMap) pcsFormVm.LLILZ).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            Iterator<AbstractC1727320v3C> it2 = listYQ2.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (!Intrinsics.LJFF(next.LIZ().LIZ, obj));
            AbstractC1727320v3C abstractC1727320v3C = next;
            if (abstractC1727320v3C != null && (c1727990v4HLIZ = abstractC1727320v3C.LIZ()) != null && (str2 = c1727990v4HLIZ.LJIIJJI) != null) {
                arrayList.add(str2);
            }
        }
        pairArr[1] = new Pair("filled_list", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        C1734710vF7.LIZ(c1734810vFH, "click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static final void LIZJ(PcsFormVm pcsFormVm, boolean z) {
        String str;
        C1734810vFH c1734810vFH = pcsFormVm.LLJIJIL;
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_form_submit_result");
        c474500IjALIZ.LJJII(c1734810vFH.LIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1734810vFH.LIZIZ, "enter_from_merge");
        c474500IjALIZ.LJJII(c1734810vFH.LIZJ, "enter_method");
        c474500IjALIZ.LJJII(c1734810vFH.LJIIIIZZ, "show_entrance");
        c474500IjALIZ.LJJII(Integer.valueOf(c1734810vFH.LJFF ? 1 : 0), "is_ad_traffic");
        c474500IjALIZ.LJJII(c1734810vFH.LJII, "room_id");
        c474500IjALIZ.LJJII(c1734810vFH.LJIIIZ, "sku_id");
        c474500IjALIZ.LJJII(c1734810vFH.LJIIJ, "traffic_action_type");
        c474500IjALIZ.LJJII(c1734810vFH.LJIIJJI, "user_id");
        c474500IjALIZ.LJJII(c1734810vFH.LJI, "request_id");
        c474500IjALIZ.LJJII(str, "result");
        c474500IjALIZ.LIZ();
    }
}
