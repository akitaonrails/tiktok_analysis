package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.01AM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AM {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Map] */
    public static C01AN LIZ(final C01AG c01ag, int i, long j, AbstractC1126600fQI abstractC1126600fQI, List list, int i2) {
        int i3;
        String str;
        C01AP c01ap;
        ?? linkedHashMap;
        Object obj;
        Gift gift;
        ArrayList<Gift> arrayList;
        Gift gift2;
        Gift.GiftSeriesInfo giftSeriesInfo;
        Integer numValueOf;
        int i4;
        ArrayList arrayList2 = new ArrayList();
        if (i >= 0) {
            int i5 = 0;
            i3 = 0;
            while (true) {
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i5, list);
                if (abstractC1126600fQI2 != null) {
                    numValueOf = Integer.valueOf(abstractC1126600fQI2.LIZ);
                } else {
                    numValueOf = null;
                }
                if (C01AW.LIZ(numValueOf)) {
                    i4 = i2;
                } else {
                    i4 = 1;
                }
                if (i3 + i4 > i2) {
                    i3 = 0;
                }
                int i6 = i4 + i3;
                if (i6 >= i2) {
                    i6 = 0;
                }
                if (i5 == i) {
                    break;
                }
                if (i5 == i) {
                    break;
                }
                i5++;
                i3 = i6;
            }
            i3 = 0;
        } else {
            i3 = 0;
        }
        int size = (i + i2) - i3;
        if (size > list.size()) {
            int size2 = size - list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList2.add(new C01AR());
            }
            size = list.size();
        }
        int[] iArr = C01AJ.LIZ;
        int i8 = iArr[c01ag.ordinal()];
        if (i8 != 1 && i8 != 2) {
            throw new C1954807lC();
        }
        Object obj2 = abstractC1126600fQI.LIZIZ;
        if (!(obj2 instanceof Gift) || (gift2 = (Gift) obj2) == null || (giftSeriesInfo = gift2.seriesInfo) == null || (str = giftSeriesInfo.seriesName) == null) {
            str = "";
        }
        C01AL c01al = new C01AL(new C292001Be(str), c01ag, abstractC1126600fQI);
        arrayList2.add(c01al);
        int i9 = iArr[c01ag.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                c01ap = C01AP.INCLUDE_HIDDEN_GIFTS;
            } else {
                throw new C1954807lC();
            }
        } else {
            c01ap = C01AP.ALL_GIFTS;
        }
        int i10 = C01AQ.LIZ[c01ap.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                Map<Long, Gift> mapLIZ = C177600mE.LIZ();
                List<Long> listLIZ = C01AK.LIZ(abstractC1126600fQI, c01ag);
                arrayList = new ArrayList();
                Iterator<Long> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    Gift gift3 = mapLIZ.get(Long.valueOf(it2.next().longValue()));
                    if (gift3 != null) {
                        arrayList.add(gift3);
                    }
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            if (list.isEmpty()) {
                linkedHashMap = C2097608Jq.LJ();
            } else {
                linkedHashMap = new LinkedHashMap();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) it3.next();
                    if (abstractC1126600fQI3 != null) {
                        obj = abstractC1126600fQI3.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Gift) && (gift = (Gift) obj) != null && !linkedHashMap.containsKey(Long.valueOf(gift.id))) {
                        linkedHashMap.put(Long.valueOf(gift.id), gift);
                    }
                }
            }
            Map<Long, Gift> mapLIZ2 = C177600mE.LIZ();
            List<Long> listLIZ2 = C01AK.LIZ(abstractC1126600fQI, c01ag);
            arrayList = new ArrayList();
            Iterator<Long> it4 = listLIZ2.iterator();
            while (it4.hasNext()) {
                long jLongValue = it4.next().longValue();
                Object obj3 = linkedHashMap.get(Long.valueOf(jLongValue));
                if (obj3 != null || (obj3 = mapLIZ2.get(Long.valueOf(jLongValue))) != null) {
                    arrayList.add(obj3);
                }
            }
        }
        int i11 = 0;
        for (final Gift gift4 : arrayList) {
            C1126040fPO c1126040fPO = new C1126040fPO(gift4, c01ag) { // from class: X.01AO
                public final C01AG LJJIFFI;

                @Override // X.C1126040fPO, X.AbstractC1126600fQI
                public final long LJI() {
                    return ((Gift) this.LIZIZ).id;
                }

                @Override // X.AbstractC1126600fQI
                public final String LJIILIIL() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(this.LJJIFFI.getUuidPrefix());
                    sbLIZ.append(':');
                    sbLIZ.append(((Gift) this.LIZIZ).id);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LJJIFFI = c01ag;
                }
            };
            c1126040fPO.LJIJJ = new C01AS(c01ag, j, true, arrayList2.size());
            arrayList2.add(c1126040fPO);
            i11++;
        }
        c01al.LJJIII = i11;
        int i12 = (i2 - i11) % i2;
        if (i12 < 0) {
            i12 += i2;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            C01AR c01ar = new C01AR();
            c01ar.LJIJJ = new C01AS(c01ag, true, 10);
            arrayList2.add(c01ar);
        }
        return new C01AN(size, i3, arrayList2);
    }
}
