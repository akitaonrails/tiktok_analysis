package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227060i2K {
    public final C1227040i2I LIZ;
    public final C1226980i2C LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayMap<String, String> LIZ() {
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        arrayMap.put("enter_from", this.LIZIZ.LLJZIJLIL.LJIILLIIL);
        List list = this.LIZIZ.LLJI;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        arrayMap.put("invited_user_cnt_total", String.valueOf(list.size() + 1));
        Map<String, Object> map = this.LIZIZ.LLILZ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String)) {
                    value = null;
                }
                arrayMap.put(key, value);
            }
        }
        Map<String, Object> map2 = this.LIZIZ.LLILZ;
        Object obj = map2 != null ? map2.get("rec_type") : null;
        if ((obj instanceof String) && obj != null) {
            arrayMap.put("enter_method", obj);
        }
        return arrayMap;
    }

    public C1227060i2K(C1227040i2I c1227040i2I) {
        this.LIZ = c1227040i2I;
        this.LIZIZ = c1227040i2I.LLJIJIL;
    }

    public static void LIZIZ(C1227060i2K c1227060i2K, EnumC1227220i2a enumC1227220i2a, C1224780hye c1224780hye) {
        int iLIZ;
        Set<Map.Entry<String, List<C1224840hyk>>> setEntrySet;
        Map.Entry entry;
        List list;
        String str;
        C0I0B.LJFF.LIZIZ();
        if (c1224780hye != null) {
            ArrayMap<String, String> arrayMapLIZ = c1227060i2K.LIZ();
            InterfaceC1226510i1R interfaceC1226510i1R = c1227060i2K.LIZ.LLILLL;
            if (interfaceC1226510i1R != null) {
                iLIZ = interfaceC1226510i1R.LIZ();
            } else {
                iLIZ = 0;
            }
            arrayMapLIZ.put("active_user_cnt", String.valueOf(iLIZ));
            arrayMapLIZ.put("action", String.valueOf(enumC1227220i2a.getValue()));
            List<C1224840hyk> list2 = c1224780hye.LIZIZ;
            if (enumC1227220i2a != EnumC1227220i2a.SEARCH) {
                arrayMapLIZ.put("selected_user_cnt", String.valueOf(list2.size()));
                List list3 = c1227060i2K.LIZIZ.LLJJJIL;
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                if (!list3.isEmpty()) {
                    int size = list2.size();
                    List list4 = c1227060i2K.LIZIZ.LLJJJIL;
                    if (list4 == null) {
                        list4 = C13BV.INSTANCE;
                    }
                    boolean z = true;
                    for (Object obj : list4) {
                        if (!list2.isEmpty()) {
                            Iterator<C1224840hyk> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.LJFF(it2.next().LLILZ, obj)) {
                                    size--;
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    arrayMapLIZ.put("selected_all_users", str);
                    arrayMapLIZ.put("selected_more_users_cnt", String.valueOf(size));
                }
            }
            Map<String, List<C1224840hyk>> map = c1224780hye.LIZ;
            if (map != null && (setEntrySet = map.entrySet()) != null && (entry = (Map.Entry) C13LP.LJJJLIIL(setEntrySet)) != null && (list = (List) entry.getValue()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.LJFF(((C1224840hyk) obj2).LLJI.get("index_tag"), "suggested")) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    C1224840hyk c1224840hyk = (C1224840hyk) obj3;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<C1224840hyk> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (Intrinsics.LJFF(c1224840hyk.LLILZ, it3.next().LLILZ)) {
                                    arrayList2.add(obj3);
                                    break;
                                }
                            }
                        }
                    }
                }
                arrayMapLIZ.put("suggested_user_cnt", String.valueOf(arrayList2.size()));
            }
            C20684815ws.LJIILLIIL("click_create_group_chat_panel", arrayMapLIZ);
        }
    }
}
