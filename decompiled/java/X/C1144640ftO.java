package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top2CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.Top3CardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.VaultGloveCardInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AFwS340S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ftO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144640ftO {
    public static final BattleItem4FEModel LJ(int i) {
        Long lValueOf;
        GiftMode giftModeLJFF = C978520bZS.LJFF();
        if (giftModeLJFF != null) {
            lValueOf = Long.valueOf(giftModeLJFF.giftId);
        } else {
            lValueOf = null;
        }
        boolean z = false;
        String strLIZJ = C978520bZS.LIZJ(false);
        BattleItem4FEModel battleItem4FEModel = new BattleItem4FEModel();
        battleItem4FEModel.isSelfTeam = true;
        battleItem4FEModel.itemType = i;
        battleItem4FEModel.itemList = new ArrayList();
        long jLongValue = 0;
        if (lValueOf == null || lValueOf.longValue() != 0) {
            z = true;
        }
        battleItem4FEModel.isGiftOnlyMatch = z;
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
        }
        battleItem4FEModel.giftOnlyId = jLongValue;
        battleItem4FEModel.giftOnlyName = strLIZJ;
        return battleItem4FEModel;
    }

    public static final C1144830fth LJIIJJI(Long l, Long l2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (l != null && l.longValue() == 0) {
            return new C1144830fth(false, false, false);
        }
        if (l2 != null && l2.longValue() != 0) {
            boolean zLJII = C970370bMJ.LJII();
            if (l != null && Intrinsics.LJFF(l, l2)) {
                z = true;
            } else {
                z = false;
                if (zLJII && LJIILIIL(l, l2)) {
                    z2 = true;
                }
                z3 = true;
                return new C1144830fth(z, z2, z3);
            }
            z2 = false;
            if (z || 0 != 0) {
                z3 = true;
            }
            return new C1144830fth(z, z2, z3);
        }
        return new C1144830fth(false, false, false);
    }

    public static final int LJIIL(int i, BattleItem4FEModel battleItem4FEModel) {
        List<ItemInfo4FE> list;
        boolean z;
        if (battleItem4FEModel != null) {
            list = battleItem4FEModel.itemList;
        } else {
            list = null;
        }
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && i != 0) {
            long jLIZ = C158B.LIZ() / 1000;
            List<ItemInfo4FE> list2 = battleItem4FEModel.itemList;
            if (list2 != null) {
                for (ItemInfo4FE itemInfo4FE : list2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ItemInfo4FE itemInfo4FE2 = itemInfo4FE;
                        if (itemInfo4FE2.itemType == i && itemInfo4FE2.effectStartTimeSec <= jLIZ && itemInfo4FE2.endAt > jLIZ) {
                            return i2;
                        }
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        return -1;
    }

    public static final boolean LJIILIIL(Long l, Long l2) {
        List<TeamUsersInfo> listLJJJ;
        boolean zContains = false;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (listLJJJ = interfaceC973730bRjYf2.LJJJ()) != null) {
            for (TeamUsersInfo teamUsersInfo : listLJJJ) {
                if (teamUsersInfo.userIds.contains(l)) {
                    zContains = teamUsersInfo.userIds.contains(l2);
                }
            }
        }
        return zContains;
    }

    public static final void LJIILL(List<ItemInfo4FE> list, ItemInfo4FE itemInfo4FE) {
        LJIILJJIL(list, itemInfo4FE, AFwS254S0000000_17.get$arr$(460), AFwS254S0000000_17.get$arr$(461), AFwS254S0000000_17.get$arr$(462), AFwS340S0000000_17.get$arr$(3));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3 A[PHI: r1
      0x00f3: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:59:0x00ef, B:36:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE LIZ(java.util.UUID r7, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo r8, boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144640ftO.LIZ(java.util.UUID, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee A[PHI: r1
      0x00ee: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:59:0x00eb, B:36:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE LJFF(java.util.UUID r8, com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144640ftO.LJFF(java.util.UUID, com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    public static final ItemInfo4FE LJIIIIZZ(UUID uuid, Top2CardInfo top2CardInfo, boolean z, boolean z2, boolean z3) {
        return LIZLLL(uuid, 7, top2CardInfo.common, z, z2, z3);
    }

    public static final ItemInfo4FE LJIIIZ(UUID uuid, Top3CardInfo top3CardInfo, boolean z, boolean z2, boolean z3) {
        return LIZLLL(uuid, 8, top3CardInfo.common, z, z2, z3);
    }

    public static final ItemInfo4FE LJIIJ(UUID uuid, VaultGloveCardInfo vaultGloveCardInfo, boolean z, boolean z2, boolean z3) {
        ItemInfo4FE itemInfo4FELIZLLL = LIZLLL(uuid, 9, vaultGloveCardInfo.common, z, z2, z3);
        itemInfo4FELIZLLL.itemMultiple = vaultGloveCardInfo.multiple;
        itemInfo4FELIZLLL.otherItemMultiple = vaultGloveCardInfo.multipleOther;
        return itemInfo4FELIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[PHI: r1
      0x00ed: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:62:0x00ea, B:39:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE LIZLLL(java.util.UUID r7, int r8, com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144640ftO.LIZLLL(java.util.UUID, int, com.bytedance.android.livesdkapi.depend.model.live.match.CommonCardInfo, boolean, boolean, boolean):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    public static final void LJIILJJIL(List list, Object obj, Function1 function1, Function1 function12, Function1 function13, InterfaceC1631620sYq interfaceC1631620sYq) {
        int size;
        int iNextIndex;
        if (list == null || ((Number) function1.invoke(obj)).intValue() == 0) {
            return;
        }
        if (list.isEmpty()) {
            list.add(obj);
            return;
        }
        Object obj2 = ListProtector.get(list, list.size() - 1);
        if (((Number) function12.invoke(obj)).longValue() > ((Number) function12.invoke(obj2)).longValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NewItemStart = ");
            sbLIZ.append(((Number) function12.invoke(obj)).longValue());
            sbLIZ.append(", TailItemStart = ");
            sbLIZ.append(((Number) function12.invoke(obj2)).longValue());
            C20441214yg.LJ("MatchItemInsert", C2188811AlT.LIZIZ(sbLIZ));
            list.add(obj);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            size = 0;
            if (listIterator.hasPrevious()) {
                if (((Number) function1.invoke(listIterator.previous())).intValue() == ((Number) function1.invoke(obj)).intValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        long jLIZ = C158B.LIZ() / 1000;
        int i = 0;
        int i2 = -1;
        for (Object obj3 : list) {
            int i3 = i + 1;
            if (i >= 0) {
                if (((Number) function13.invoke(obj3)).longValue() <= jLIZ && ((Number) function12.invoke(obj3)).longValue() > jLIZ) {
                    i2 = i;
                }
                i = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (iNextIndex >= 0) {
            if (iNextIndex < i2) {
                size = i2 + 1;
            } else {
                size = iNextIndex + 1;
            }
        } else {
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL == null || ((Number) function13.invoke(objLJJJLL)).longValue() <= jLIZ) && 1 <= (size = list.size())) {
                size = 1;
            }
        }
        ListProtector.add(list, size, obj);
        long jLongValue = ((Number) function12.invoke(obj)).longValue();
        int i4 = size + 1;
        int size2 = list.size() - 1;
        if (i4 > size2) {
            return;
        }
        while (true) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i4, list);
            if (objLJJJLZIJ != null) {
                interfaceC1631620sYq.invoke(objLJJJLZIJ, Long.valueOf(jLongValue), Long.valueOf(C963140bAe.LIZLLL));
                jLongValue = ((Number) function12.invoke(objLJJJLZIJ)).longValue();
                if (i4 != size2) {
                    i4++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f A[PHI: r1
      0x010f: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v5 java.lang.String) binds: [B:71:0x010b, B:36:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE LIZIZ(java.util.UUID r9, com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo r10, boolean r11, boolean r12, boolean r13, long r14, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144640ftO.LIZIZ(java.util.UUID, com.bytedance.android.livesdkapi.depend.model.live.match.ExtraTimeCardInfo, boolean, boolean, boolean, long, kotlin.jvm.functions.Function1):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108 A[PHI: r1
      0x0108: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v6 java.lang.String) binds: [B:62:0x0105, B:39:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE LJI(java.util.UUID r9, com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo r10, boolean r11, boolean r12, boolean r13, java.util.List<com.bytedance.android.livesdk.model.message.AnchorPair> r14, int r15, com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1144640ftO.LJI(java.util.UUID, com.bytedance.android.livesdkapi.depend.model.live.match.SpecialEffectCardInfo, boolean, boolean, boolean, java.util.List, int, com.bytedance.android.livesdkapi.depend.model.live.match.CommunityHeartMeInfo, java.lang.String):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }
}
