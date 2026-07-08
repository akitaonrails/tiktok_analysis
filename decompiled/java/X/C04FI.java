package X;

import com.bytedance.goda.v2.model.dto.EventParam;
import com.bytedance.goda.v2.model.dto.GlobalStruct;
import com.bytedance.goda.v2.model.dto.GodaV2Container;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2EventGroup;
import com.bytedance.goda.v2.model.dto.GodaV2Extension;
import com.bytedance.goda.v2.model.dto.GodaV2Facade;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.goda.v2.model.dto.GodaV2Style;
import com.bytedance.goda.v2.model.dto.GroupFacade;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04FI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04FI {
    public static C04FG LIZ(GodaV2Protocol godaV2Protocol, C04CV c04cv, InterfaceC1066504Fb interfaceC1066504Fb) {
        GodaV2Data godaV2Data;
        Map<String, GodaV2EventGroup> map;
        Map<String, EventParam> map2;
        n nVar;
        GodaV2Style godaV2Style;
        Object obj;
        List<String> list;
        GodaV2Data godaV2Data2;
        Map<String, GodaV2EventGroup> map3;
        Map<String, EventParam> map4;
        n nVar2;
        GodaV2Style godaV2Style2;
        Object obj2;
        List<String> list2;
        List<String> list3;
        Map<String, GodaV2Data> map5;
        String str;
        List<GroupFacade> list4;
        GodaV2Facade godaV2Facade = godaV2Protocol.facade;
        Map<String, GodaV2Data> map6 = godaV2Protocol.data;
        if (map6 != null) {
            godaV2Data = map6.get("page");
        } else {
            godaV2Data = null;
        }
        if (godaV2Data != null) {
            map = godaV2Data.trackData;
        } else {
            map = null;
        }
        C04FZ c04fz = new C04FZ(map);
        if (godaV2Data != null) {
            map2 = godaV2Data.trackTemplate;
            nVar = godaV2Data.itemData;
            godaV2Style = godaV2Data.style;
            obj = godaV2Data.LIZ;
        } else {
            map2 = null;
            nVar = null;
            godaV2Style = null;
            obj = null;
        }
        GodaV2Facade godaV2Facade2 = godaV2Protocol.facade;
        if (godaV2Facade2 != null) {
            list = godaV2Facade2.header;
        } else {
            list = null;
        }
        C04FM c04fmLIZ = C04FJ.LIZ(godaV2Protocol, "header", list, c04cv, interfaceC1066504Fb);
        Map<String, GodaV2Data> map7 = godaV2Protocol.data;
        if (map7 != null) {
            godaV2Data2 = map7.get("body");
        } else {
            godaV2Data2 = null;
        }
        ArrayList arrayList = new ArrayList();
        GodaV2Facade godaV2Facade3 = godaV2Protocol.facade;
        if (godaV2Facade3 != null && (list4 = godaV2Facade3.body) != null) {
            for (GroupFacade groupFacade : list4) {
                String str2 = groupFacade.groupId;
                if (str2 != null) {
                    arrayList.add(C04FJ.LIZ(godaV2Protocol, str2, groupFacade.items, c04cv, interfaceC1066504Fb));
                }
            }
        }
        if (arrayList.isEmpty()) {
            C04EU c04eu = c04cv.LIZJ;
            if (c04eu != null) {
                str = c04eu.LIZ;
            } else {
                str = null;
            }
            C1067104Fh c1067104Fh = new C1067104Fh(101, "data", " group not in body", new C1067004Fg(str, null, null, null, null, null, null, 254));
            if (interfaceC1066504Fb != null) {
                interfaceC1066504Fb.LIZ(c1067104Fh);
            }
        }
        if (godaV2Data2 != null) {
            map3 = godaV2Data2.trackData;
        } else {
            map3 = null;
        }
        C04FZ c04fz2 = new C04FZ(map3);
        if (godaV2Data2 != null) {
            map4 = godaV2Data2.trackTemplate;
            nVar2 = godaV2Data2.itemData;
            godaV2Style2 = godaV2Data2.style;
            obj2 = godaV2Data2.LIZ;
        } else {
            map4 = null;
            nVar2 = null;
            godaV2Style2 = null;
            obj2 = null;
        }
        C04FP c04fp = new C04FP(c04fz2, map4, nVar2, obj2, arrayList, godaV2Style2, c04cv);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C04FR) it2.next()).LJII = c04fp;
        }
        GodaV2Facade godaV2Facade4 = godaV2Protocol.facade;
        if (godaV2Facade4 != null) {
            list2 = godaV2Facade4.footer;
        } else {
            list2 = null;
        }
        C04FM c04fmLIZ2 = C04FJ.LIZ(godaV2Protocol, "footer", list2, c04cv, interfaceC1066504Fb);
        C04FO c04fo = new C04FO(c04fz, map2, nVar, c04cv, obj, godaV2Style, c04fmLIZ, c04fp, c04fmLIZ2);
        c04fmLIZ.LJII = c04fo;
        c04fp.LJII = c04fo;
        c04fmLIZ2.LJII = c04fo;
        GodaV2Facade godaV2Facade5 = godaV2Protocol.facade;
        if (godaV2Facade5 != null) {
            list3 = godaV2Facade5.overlay;
        } else {
            list3 = null;
        }
        C04FM c04fmLIZ3 = C04FJ.LIZ(godaV2Protocol, "overlay", list3, c04cv, interfaceC1066504Fb);
        if (godaV2Protocol.global == null) {
            new GlobalStruct(null, null, null, null);
        }
        Map<String, GodaV2Data> map8 = godaV2Protocol.data;
        Map<String, GodaV2Container> map9 = godaV2Protocol.container;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        GodaV2Extension godaV2Extension = godaV2Protocol.extension;
        if (godaV2Extension != null && (map5 = godaV2Extension.service) != null) {
            for (Map.Entry<String, GodaV2Data> entry : map5.entrySet()) {
                String key = entry.getKey();
                GodaV2Data value = entry.getValue();
                linkedHashMap.put(key, new C04FQ(entry.getKey(), new C04FZ(value.trackData), value.trackTemplate, value.itemData, value.LIZ, c04cv, value.actionData));
            }
        }
        return new C04FG(godaV2Facade, c04fo, c04fmLIZ3, map8, map9, c04cv, linkedHashMap, godaV2Protocol.extension);
    }
}
