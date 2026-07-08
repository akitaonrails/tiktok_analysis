package X;

import com.bytedance.iap.core.model.IAPProductDetail;
import com.bytedance.iap.core.model.IAPProductPrice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0wRD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780650wRD implements InterfaceC560980LzM<Map<String, ? extends InterfaceC1780600wR8>, List<? extends IAPProductDetail>> {
    public final InterfaceC1786800wb8 LIZ;

    @Override // X.InterfaceC560980LzM
    public final String getName() {
        return "map_channel_to_iap_product_details";
    }

    public C1780650wRD(InterfaceC1786800wb8 interfaceC1786800wb8) {
        this.LIZ = interfaceC1786800wb8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    @Override // X.InterfaceC560980LzM
    public final Object LIZ(Map<String, ? extends InterfaceC1780600wR8> map, InterfaceC1364105Vn<? super List<? extends IAPProductDetail>> interfaceC1364105Vn) {
        ?? arrayList;
        EnumC1780660wRE enumC1780660wRE;
        EnumC1780660wRE enumC1780660wRE2;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, ? extends InterfaceC1780600wR8> entry : map.entrySet()) {
            InterfaceC1780600wR8 value = entry.getValue();
            int i = 10;
            if (value instanceof C1780580wR6) {
                String key = entry.getKey();
                C1780580wR6 c1780580wR6 = (C1780580wR6) value;
                List<C1780610wR9> list = c1780580wR6.LIZLLL;
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C1780610wR9 c1780610wR9 : list) {
                    String str = c1780580wR6.LIZ;
                    EnumC1780720wRK enumC1780720wRK = EnumC1780720wRK.INAPP;
                    String str2 = c1780580wR6.LIZIZ;
                    String str3 = c1780580wR6.LIZJ;
                    String currentRegionCode = this.LIZ.getCurrentRegionCode();
                    List<C1780630wRB> list2 = c1780610wR9.LIZLLL;
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, i));
                    for (C1780630wRB c1780630wRB : list2) {
                        String str4 = c1780630wRB.LIZ;
                        long j = c1780630wRB.LIZIZ;
                        String str5 = c1780630wRB.LIZJ;
                        EnumC1780660wRE[] enumC1780660wREArrValues = EnumC1780660wRE.values();
                        int length = enumC1780660wREArrValues.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                enumC1780660wRE2 = enumC1780660wREArrValues[i2];
                                if (enumC1780660wRE2.getMode() != c1780630wRB.LIZLLL.getMode()) {
                                    i2++;
                                }
                            } else {
                                enumC1780660wRE2 = EnumC1780660wRE.NON_RECURRING;
                                break;
                            }
                        }
                        arrayList3.add(new IAPProductPrice(str4, j, str5, enumC1780660wRE2));
                    }
                    arrayList.add(new IAPProductDetail(str, key, enumC1780720wRK, str2, str3, currentRegionCode, "", arrayList3, c1780610wR9.LIZIZ, null, c1780610wR9.LIZJ, c1780610wR9.LIZ));
                    i = 10;
                }
            } else if (value instanceof C1780590wR7) {
                String key2 = entry.getKey();
                C1780590wR7 c1780590wR7 = (C1780590wR7) value;
                List<C1780620wRA> list3 = c1780590wR7.LIZLLL;
                arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
                for (C1780620wRA c1780620wRA : list3) {
                    String str6 = c1780590wR7.LIZ;
                    EnumC1780720wRK enumC1780720wRK2 = EnumC1780720wRK.SUBSCRIPTION;
                    String str7 = c1780590wR7.LIZIZ;
                    String str8 = c1780590wR7.LIZJ;
                    String currentRegionCode2 = this.LIZ.getCurrentRegionCode();
                    List<C1780640wRC> list4 = c1780620wRA.LIZLLL;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    for (C1780640wRC c1780640wRC : list4) {
                        String str9 = c1780640wRC.LIZ;
                        long j2 = c1780640wRC.LIZIZ;
                        String str10 = c1780640wRC.LIZJ;
                        EnumC1780660wRE[] enumC1780660wREArrValues2 = EnumC1780660wRE.values();
                        int length2 = enumC1780660wREArrValues2.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                enumC1780660wRE = enumC1780660wREArrValues2[i3];
                                if (enumC1780660wRE.getMode() != c1780640wRC.LJFF.getMode()) {
                                    i3++;
                                }
                            } else {
                                enumC1780660wRE = EnumC1780660wRE.NON_RECURRING;
                                break;
                            }
                        }
                        arrayList4.add(new IAPProductPrice(str9, j2, str10, enumC1780660wRE));
                    }
                    arrayList.add(new IAPProductDetail(str6, key2, enumC1780720wRK2, str7, str8, currentRegionCode2, "", arrayList4, null, c1780620wRA.LIZIZ, c1780620wRA.LIZJ, c1780620wRA.LIZ));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C19719612Di.LJJI(arrayList, arrayList2);
        }
        return arrayList2;
    }
}
