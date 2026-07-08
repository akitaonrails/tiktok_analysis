package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fT2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128300fT2 {
    public static final C1128300fT2 LIZ = new C1128300fT2();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0049 A[EDGE_INSN: B:47:0x0049->B:28:0x0049 BREAK  A[LOOP:0: B:23:0x0037->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZ(X.AbstractC1126600fQI r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L90
            T extends X.0054 r5 = r6.LIZIZ
        L5:
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.Gift
            if (r0 == 0) goto L8e
            com.bytedance.android.livesdk.model.Gift r5 = (com.bytedance.android.livesdk.model.Gift) r5
            if (r5 == 0) goto L11
            java.util.List<com.bytedance.android.livesdk.gift.model.GiftColorInfo> r3 = r5.colorInfos
            if (r3 != 0) goto L13
        L11:
            X.13BV r3 = X.C13BV.INSTANCE
        L13:
            if (r5 == 0) goto L7b
            com.bytedance.android.livesdk.model.Gift$ColorPickerInfo r2 = r5.colorPickerInfo
            long r0 = r5.id
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r0 = LJIIIZ(r0, r2, r3)
            if (r0 == 0) goto L7b
            java.lang.Long r0 = r0.colorId
            if (r0 == 0) goto L7b
            long r1 = r0.longValue()
        L27:
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r0 = LIZLLL(r5, r1)
            r5 = -1
            if (r0 == 0) goto L33
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6e
        L33:
            java.util.Iterator r2 = r3.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r0 = (com.bytedance.android.livesdk.gift.model.GiftColorInfo) r0
            boolean r0 = r0.isDefault
            if (r0 == 0) goto L37
            r4 = r1
        L49:
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r4 = (com.bytedance.android.livesdk.gift.model.GiftColorInfo) r4
            if (r4 == 0) goto L78
            java.lang.Long r0 = r4.colorId
            if (r0 == 0) goto L78
            long r1 = r0.longValue()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L6e
        L59:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6e
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r0)
            com.bytedance.android.livesdk.gift.model.GiftColorInfo r0 = (com.bytedance.android.livesdk.gift.model.GiftColorInfo) r0
            java.lang.Long r0 = r0.colorId
            long r1 = r0.longValue()
        L6e:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            return r0
        L78:
            r1 = -1
            goto L59
        L7b:
            X.01GW r0 = X.C1131920fYs.LIZ
            if (r6 == 0) goto L8c
            long r0 = r6.LJFF()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L87:
            long r1 = X.C1131920fYs.LIZ(r0)
            goto L27
        L8c:
            r0 = r4
            goto L87
        L8e:
            r5 = r4
            goto L11
        L90:
            r5 = r4
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1128300fT2.LIZ(X.0fQI):kotlin.Pair");
    }

    public static boolean LIZIZ(Gift.ColorPickerInfo colorPickerInfo) {
        List<Gift.ColorGroup> list;
        if (colorPickerInfo == null || (list = colorPickerInfo.groups) == null || list.isEmpty()) {
            return false;
        }
        Iterator<Gift.ColorGroup> it2 = list.iterator();
        while (it2.hasNext()) {
            if (!it2.next().colorInfos.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static GiftColorInfo LJIIIIZZ(Gift gift) {
        Long lValueOf;
        C01GW c01gw = C1131920fYs.LIZ;
        if (gift != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        return LIZLLL(gift, C1131920fYs.LIZ(lValueOf));
    }

    public static ImageModel LJIIJJI(Gift gift) {
        List list;
        Object next;
        ImageModel imageModel;
        ImageModel imageModel2;
        if (gift == null || (list = gift.colorInfos) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return null;
        }
        GiftColorInfo giftColorInfoLJIIIIZZ = LJIIIIZZ(gift);
        if (giftColorInfoLJIIIIZZ == null || (imageModel2 = giftColorInfoLJIIIIZZ.giftImage) == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((GiftColorInfo) next).isDefault) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GiftColorInfo giftColorInfo = (GiftColorInfo) next;
            if (giftColorInfo == null || (imageModel = giftColorInfo.giftImage) == null) {
                return ((GiftColorInfo) ListProtector.get(list, 0)).giftImage;
            }
            return imageModel;
        }
        return imageModel2;
    }

    public static GiftColorInfo LIZLLL(Gift gift, long j) {
        if (gift == null) {
            return null;
        }
        List list = gift.colorInfos;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        return LIZJ(j, gift.colorPickerInfo, list);
    }

    public static GiftColorInfo LIZJ(long j, Gift.ColorPickerInfo colorPickerInfo, List list) {
        Object next;
        List<Gift.ColorGroup> list2;
        Object obj = null;
        if (j == -1) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Long l = ((GiftColorInfo) next).colorId;
                if (l != null && l.longValue() == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        GiftColorInfo giftColorInfo = (GiftColorInfo) next;
        if (giftColorInfo == null) {
            if (colorPickerInfo == null || (list2 = colorPickerInfo.groups) == null) {
                return null;
            }
            C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(list2), AnonymousClass0207.get$arr$(8)));
            while (true) {
                if (!c197024126s.hasNext()) {
                    break;
                }
                Object next2 = c197024126s.next();
                Long l2 = ((GiftColorInfo) next2).colorId;
                if (l2 != null && l2.longValue() == j) {
                    obj = next2;
                    break;
                }
            }
            return (GiftColorInfo) obj;
        }
        return giftColorInfo;
    }

    public static List LJ(List list, GiftColorInfo giftColorInfo, GiftColorInfo giftColorInfo2) {
        List listLJIJI = C13LQ.LJIJI(new GiftColorInfo[]{giftColorInfo, giftColorInfo2});
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJIJI) {
            if (hashSet.add(((GiftColorInfo) obj).colorId)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        HashSet hashSet2 = new HashSet(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hashSet2.add(((GiftColorInfo) it2.next()).colorId);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!hashSet2.contains(((GiftColorInfo) obj2).colorId)) {
                arrayList2.add(obj2);
            }
        }
        return C13LP.LJLIL(arrayList2, arrayList);
    }

    public static List LJFF(GiftColorInfo giftColorInfo, GiftColorInfo giftColorInfo2, GiftColorInfo giftColorInfo3) {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<String> list = giftColorInfo.colorReason;
        if (list != null) {
            for (String str : list) {
                if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                    string = "";
                }
                if (string.length() > 0) {
                    linkedHashSet.add(string);
                }
            }
        }
        if (giftColorInfo2 != null && Intrinsics.LJFF(giftColorInfo.colorId, giftColorInfo2.colorId)) {
            linkedHashSet.add("last_sent");
        }
        if (giftColorInfo3 != null && Intrinsics.LJFF(giftColorInfo.colorId, giftColorInfo3.colorId)) {
            linkedHashSet.add("user_chosen");
        }
        if (linkedHashSet.isEmpty()) {
            return Collections.singletonList("others");
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static String LJI(Gift gift, long j, Long l) {
        GiftColorInfo giftColorInfoLIZLLL = LIZLLL(gift, j);
        GiftColorInfo giftColorInfoLIZLLL2 = null;
        if (giftColorInfoLIZLLL == null) {
            return null;
        }
        if (l != null) {
            giftColorInfoLIZLLL2 = LIZLLL(gift, l.longValue());
        }
        return C13LP.LJJLIIIJ(LJFF(giftColorInfoLIZLLL, LJIIIIZZ(gift), giftColorInfoLIZLLL2), ",", null, null, 0, null, null, 62);
    }

    public static GiftColorInfo LJII(long j, Gift.ColorPickerInfo colorPickerInfo, List list) {
        C01GW c01gw = C1131920fYs.LIZ;
        return LIZJ(C1131920fYs.LIZ(Long.valueOf(j)), colorPickerInfo, list);
    }

    public static GiftColorInfo LJIIIZ(long j, Gift.ColorPickerInfo colorPickerInfo, List list) {
        Long l;
        if (LIZIZ(colorPickerInfo)) {
            return null;
        }
        C1128970fU7 c1128970fU7 = C1130100fVw.LIZ;
        long j2 = c1128970fU7.LJIIJ;
        if (j2 == -1 || (l = c1128970fU7.LIZIZ) == null || l.longValue() != j) {
            return null;
        }
        return LIZJ(j2, colorPickerInfo, list);
    }

    public static int LJIIL(List list, GiftColorInfo giftColorInfo, GiftColorInfo giftColorInfo2) {
        Iterator it2 = LJ(list, giftColorInfo, giftColorInfo2).iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (Intrinsics.LJFF(((GiftColorInfo) it2.next()).colorId, giftColorInfo2.colorId)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return 1;
        }
        return 1 + i;
    }

    public static long LJIIJ(C1128300fT2 c1128300fT2, Gift gift, long j, Long l, Long l2, Long l3, Long l4, int i) {
        Long lValueOf;
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            l3 = null;
        }
        if ((i & 128) != 0) {
            l4 = null;
        }
        c1128300fT2.getClass();
        if (gift != null) {
            lValueOf = Long.valueOf(gift.id);
        } else {
            lValueOf = null;
        }
        if (l2 != null && l2.longValue() != 0) {
            long jLongValue = l2.longValue();
            if (LIZLLL(gift, jLongValue) != null) {
                return jLongValue;
            }
        }
        if (l != null) {
            long jLongValue2 = l.longValue();
            if (LIZLLL(gift, jLongValue2) != null) {
                return jLongValue2;
            }
        }
        if (lValueOf != null) {
            Intrinsics.LJFF(null, lValueOf);
            if (Intrinsics.LJFF(l4, lValueOf) && l3 != null && l3.longValue() != -1) {
                long jLongValue3 = l3.longValue();
                if (LIZLLL(gift, jLongValue3) != null) {
                    return jLongValue3;
                }
            }
        }
        return j;
    }
}
