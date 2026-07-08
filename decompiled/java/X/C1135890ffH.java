package X;

import Y.ARunnableS10S0310000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftHammerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135890ffH {
    public static final C11RO LIZ = C1701940uOG.LIZIZ();
    public static final C11NJ LIZIZ = new C11NJ();

    public static void LIZ(List list, C1135810ff9 c1135810ff9) {
        boolean z;
        int i;
        int i2;
        int i3;
        int size;
        int i4;
        int i5;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        int i6;
        int i7;
        Long lValueOf3;
        Long lValueOf4;
        int size2;
        GiftMessage giftMessage = c1135810ff9.LIZ;
        if (giftMessage != null && giftMessage.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        int size3 = -1;
        if (z) {
            Iterator it2 = list.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                GiftMessage giftMessage2 = ((C1135810ff9) it2.next()).LIZ;
                if (giftMessage2 != null && giftMessage2.LLILLJJLI) {
                    i8++;
                } else {
                    size3 = i8;
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(size3);
            if (numValueOf.intValue() >= 0) {
                size2 = numValueOf.intValue();
            } else {
                size2 = list.size();
            }
            ListProtector.add(list, size2, c1135810ff9);
            return;
        }
        if (C1135980ffQ.LJI(c1135810ff9.LJJJLIIL, c1135810ff9.LJJJLL) == EnumC994350byz.VALUE) {
            if (!c1135810ff9.LJJJLL) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (c1135810ff9.LIZLLL() == currentUserId) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Iterator it3 = list.iterator();
                int i9 = 0;
                while (it3.hasNext()) {
                    C1135810ff9 c1135810ff92 = (C1135810ff9) it3.next();
                    GiftMessage giftMessage3 = c1135810ff92.LIZ;
                    if (giftMessage3 == null || !giftMessage3.LLILLJJLI) {
                        if (z2) {
                            if (c1135810ff92.LIZLLL() != currentUserId) {
                            }
                            size3 = i9;
                            break;
                        } else if (c1135810ff92.LIZLLL() == currentUserId) {
                            continue;
                        }
                        if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                            C1133690fbj.LIZ.getClass();
                            if (C1133690fbj.LJFF(c1135810ff9)) {
                                i6 = c1135810ff9.LJJJLZIJ;
                            } else {
                                i6 = c1135810ff9.LJ;
                            }
                            if (C1133690fbj.LJFF(c1135810ff92)) {
                                i7 = c1135810ff92.LJJJLZIJ;
                            } else {
                                i7 = c1135810ff92.LJ;
                            }
                            if (i6 == i7 && C1133690fbj.LIZLLL(c1135810ff9) && C1133690fbj.LIZLLL(c1135810ff92)) {
                                AssetsModel assetsModelLIZJ = C1133680fbi.LIZJ(c1135810ff9.LIZ);
                                if (assetsModelLIZJ != null) {
                                    lValueOf3 = Long.valueOf(assetsModelLIZJ.id);
                                } else {
                                    lValueOf3 = null;
                                }
                                AssetsModel assetsModelLIZJ2 = C1133680fbi.LIZJ(c1135810ff92.LIZ);
                                if (assetsModelLIZJ2 != null) {
                                    lValueOf4 = Long.valueOf(assetsModelLIZJ2.id);
                                } else {
                                    lValueOf4 = null;
                                }
                                if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                                    size3 = i9;
                                    break;
                                }
                            } else if (i6 > i7) {
                                size3 = i9;
                                break;
                            }
                        } else if (c1135810ff9.LJ > c1135810ff92.LJ) {
                            size3 = i9;
                            break;
                        }
                    }
                    i9++;
                }
            } else if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                Iterator it4 = list.iterator();
                i = 0;
                while (it4.hasNext()) {
                    C1135810ff9 c1135810ff93 = (C1135810ff9) it4.next();
                    GiftMessage giftMessage4 = c1135810ff93.LIZ;
                    if (giftMessage4 == null || !giftMessage4.LLILLJJLI) {
                        C1133690fbj.LIZ.getClass();
                        if (C1133690fbj.LJFF(c1135810ff9)) {
                            i4 = c1135810ff9.LJJJLZIJ;
                        } else {
                            i4 = c1135810ff9.LJ;
                        }
                        if (C1133690fbj.LJFF(c1135810ff93)) {
                            i5 = c1135810ff93.LJJJLZIJ;
                        } else {
                            i5 = c1135810ff93.LJ;
                        }
                        if (i4 == i5 && C1133690fbj.LIZLLL(c1135810ff9) && C1133690fbj.LIZLLL(c1135810ff93)) {
                            AssetsModel assetsModelLIZJ3 = C1133680fbi.LIZJ(c1135810ff9.LIZ);
                            if (assetsModelLIZJ3 != null) {
                                lValueOf = Long.valueOf(assetsModelLIZJ3.id);
                            } else {
                                lValueOf = null;
                            }
                            AssetsModel assetsModelLIZJ4 = C1133680fbi.LIZJ(c1135810ff93.LIZ);
                            if (assetsModelLIZJ4 != null) {
                                lValueOf2 = Long.valueOf(assetsModelLIZJ4.id);
                            } else {
                                lValueOf2 = null;
                            }
                            if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                size3 = i;
                                break;
                            }
                        } else if (i4 > i5) {
                            size3 = i;
                            break;
                        }
                    }
                    i++;
                }
            } else {
                Iterator it5 = list.iterator();
                i = 0;
                while (it5.hasNext()) {
                    C1135810ff9 c1135810ff94 = (C1135810ff9) it5.next();
                    GiftMessage giftMessage5 = c1135810ff94.LIZ;
                    if ((giftMessage5 != null && giftMessage5.LLILLJJLI) || c1135810ff9.LJ <= c1135810ff94.LJ) {
                        i++;
                    } else {
                        size3 = i;
                        break;
                    }
                }
            }
        } else {
            GiftMessage giftMessage6 = c1135810ff9.LIZ;
            if (giftMessage6 != null && giftMessage6.LLILZLL > 0) {
                Iterator it6 = list.iterator();
                i = 0;
                while (it6.hasNext()) {
                    GiftMessage giftMessage7 = ((C1135810ff9) it6.next()).LIZ;
                    if (giftMessage7 == null || !giftMessage7.LLILLJJLI) {
                        GiftMessage giftMessage8 = c1135810ff9.LIZ;
                        if (giftMessage8 != null) {
                            i2 = giftMessage8.LLIZ;
                        } else {
                            i2 = 0;
                        }
                        if (giftMessage7 != null) {
                            i3 = giftMessage7.LLIZ;
                        } else {
                            i3 = 0;
                        }
                        if (i2 < i3) {
                            size3 = i;
                            break;
                        }
                    }
                    i++;
                }
            } else {
                size3 = list.size();
            }
        }
        Integer numValueOf2 = Integer.valueOf(size3);
        int iIntValue = numValueOf2.intValue();
        if (iIntValue >= 0 && iIntValue <= list.size()) {
            size = numValueOf2.intValue();
        } else {
            size = list.size();
        }
        ListProtector.add(list, size, c1135810ff9);
    }

    public static void LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU, List list, boolean z) {
        int i;
        int size;
        boolean z2;
        int size2;
        int size3 = -1;
        if (interfaceC1136020ffU.LJIIJJI()) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((InterfaceC1136020ffU) it2.next()).LJIIJJI()) {
                    size3 = i2;
                    break;
                }
                i2++;
            }
            Integer numValueOf = Integer.valueOf(size3);
            if (numValueOf.intValue() >= 0) {
                size2 = numValueOf.intValue();
            } else {
                size2 = ((LinkedList) list).size();
            }
            ListProtector.add(list, size2, interfaceC1136020ffU);
            return;
        }
        if (C1135980ffQ.LJI(interfaceC1136020ffU.LJ(), z) == EnumC994350byz.VALUE) {
            if (!z) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (C1135870ffF.LJIJI(interfaceC1136020ffU) == currentUserId) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Iterator it3 = list.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    InterfaceC1136020ffU interfaceC1136020ffU2 = (InterfaceC1136020ffU) it3.next();
                    if (z2) {
                        if (C1135870ffF.LJIJI(interfaceC1136020ffU2) != currentUserId) {
                        }
                        size3 = i3;
                        break;
                    } else {
                        if (C1135870ffF.LJIJI(interfaceC1136020ffU2) == currentUserId) {
                            continue;
                        }
                        i3++;
                    }
                    if (C1135870ffF.LIZIZ(interfaceC1136020ffU) > C1135870ffF.LIZIZ(interfaceC1136020ffU2)) {
                        size3 = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                Iterator it4 = list.iterator();
                i = 0;
                while (it4.hasNext()) {
                    if (C1135870ffF.LIZIZ(interfaceC1136020ffU) <= C1135870ffF.LIZIZ((InterfaceC1136020ffU) it4.next())) {
                        i++;
                    } else {
                        size3 = i;
                        break;
                    }
                }
            }
        } else if (interfaceC1136020ffU.LJJI().LJIIIZ > 0) {
            Iterator it5 = list.iterator();
            i = 0;
            while (it5.hasNext()) {
                if (!C1135870ffF.LJIIIZ(interfaceC1136020ffU, (InterfaceC1136020ffU) it5.next())) {
                    i++;
                } else {
                    size3 = i;
                    break;
                }
            }
        } else {
            size3 = ((LinkedList) list).size();
        }
        Integer numValueOf2 = Integer.valueOf(size3);
        int iIntValue = numValueOf2.intValue();
        if (iIntValue >= 0 && iIntValue <= ((LinkedList) list).size()) {
            size = numValueOf2.intValue();
        } else {
            size = ((LinkedList) list).size();
        }
        ListProtector.add(list, size, interfaceC1136020ffU);
    }

    public static void LJ(GiftMessage giftMessage, List list, boolean z) {
        int i;
        int size;
        boolean z2;
        int size2;
        int size3 = -1;
        if (giftMessage.LLILLJJLI) {
            Iterator it2 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!((GiftMessage) it2.next()).LLILLJJLI) {
                    size3 = i2;
                    break;
                }
                i2++;
            }
            Integer numValueOf = Integer.valueOf(size3);
            if (numValueOf.intValue() >= 0) {
                size2 = numValueOf.intValue();
            } else {
                size2 = ((LinkedList) list).size();
            }
            ListProtector.add(list, size2, giftMessage);
            return;
        }
        if (C1135980ffQ.LJI(giftMessage.LLILLL, z) == EnumC994350byz.VALUE) {
            if (!z) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (C1133680fbi.LIZIZ(giftMessage) == currentUserId) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Iterator it3 = list.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    GiftMessage giftMessage2 = (GiftMessage) it3.next();
                    if (!giftMessage2.LLILLJJLI) {
                        if (z2) {
                            if (C1133680fbi.LIZIZ(giftMessage2) != currentUserId) {
                            }
                            size3 = i3;
                            break;
                        } else if (C1133680fbi.LIZIZ(giftMessage2) == currentUserId) {
                            continue;
                        }
                        if (C1133680fbi.LIZ(giftMessage) > C1133680fbi.LIZ(giftMessage2)) {
                            size3 = i3;
                            break;
                        }
                    }
                    i3++;
                }
            } else {
                Iterator it4 = list.iterator();
                i = 0;
                while (it4.hasNext()) {
                    GiftMessage giftMessage3 = (GiftMessage) it4.next();
                    if (giftMessage3.LLILLJJLI || C1133680fbi.LIZ(giftMessage) <= C1133680fbi.LIZ(giftMessage3)) {
                        i++;
                    } else {
                        size3 = i;
                        break;
                    }
                }
            }
        } else if (giftMessage.LLILZLL > 0) {
            Iterator it5 = list.iterator();
            i = 0;
            while (it5.hasNext()) {
                GiftMessage giftMessage4 = (GiftMessage) it5.next();
                if (!giftMessage4.LLILLJJLI && giftMessage.LLIZ < giftMessage4.LLIZ) {
                    size3 = i;
                    break;
                }
                i++;
            }
        } else {
            size3 = ((LinkedList) list).size();
        }
        Integer numValueOf2 = Integer.valueOf(size3);
        int iIntValue = numValueOf2.intValue();
        if (iIntValue >= 0 && iIntValue <= ((LinkedList) list).size()) {
            size = numValueOf2.intValue();
        } else {
            size = ((LinkedList) list).size();
        }
        ListProtector.add(list, size, giftMessage);
    }

    public static void LIZLLL(C1135810ff9 c1135810ff9, List list, Function0 function0, boolean z) {
        Boolean boolValueOf;
        long jLJFF = C1135980ffQ.LJFF(c1135810ff9.LJJJLIIL, c1135810ff9.LJJJLL);
        if (C1135980ffQ.LJIIJ() && jLJFF != 0) {
            GiftMessage giftMessage = c1135810ff9.LIZ;
            if (giftMessage != null) {
                boolValueOf = Boolean.valueOf(giftMessage.LLILLJJLI);
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                LIZ.LIZJ(new ARunnableS10S0310000_17(c1135810ff9, function0, list, z, 4), jLJFF, TimeUnit.MILLISECONDS);
                return;
            }
        }
        LIZ(list, c1135810ff9);
        C1136080ffa.LJ(c1135810ff9, z);
        LIZ.LIZIZ(new RunnableC514801zW(function0, (Function0<Unit>) 198));
    }

    public static void LIZJ(C1135810ff9 c1135810ff9, List list, HashSet hashSet, boolean z, boolean z2, Function0 function0) {
        Gift gift;
        c1135810ff9.LJJIJ = System.nanoTime();
        String str = c1135810ff9.LIZLLL;
        C1133690fbj.LIZ.getClass();
        boolean zLJ = C1133690fbj.LJ(c1135810ff9);
        boolean zContains = hashSet.contains(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertIntoQueueBefore, isSpecial = ");
        sbLIZ.append(zLJ);
        sbLIZ.append(", isSignatureSetContains = ");
        sbLIZ.append(zContains);
        sbLIZ.append(", signature=");
        sbLIZ.append(str);
        sbLIZ.append(",  msgEntering = ");
        sbLIZ.append(c1135810ff9);
        sbLIZ.append(", queue = ");
        sbLIZ.append(list);
        C1138230fj3.LIZ("LiveGiftTrayQueueHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (!zLJ && zContains) {
            Iterator it2 = list.iterator();
            while (true) {
                C1136900fgu c1136900fgu = null;
                if (!it2.hasNext()) {
                    break;
                }
                C1135810ff9 c1135810ff92 = (C1135810ff9) it2.next();
                if (Intrinsics.LJFF(c1135810ff92.LIZLLL, str)) {
                    it2.remove();
                    C1136080ffa.LJI(c1135810ff92, z);
                    c1135810ff9.LIZ(c1135810ff92.LJJJJ);
                    c1135810ff9.LJJJJI = c1135810ff92.LJJJJI;
                    Iterator<C1136900fgu> it3 = c1135810ff9.LJJIFFI.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C1136900fgu next = it3.next();
                        if (next.LIZ == 0) {
                            c1136900fgu = next;
                            break;
                        }
                    }
                    C1136900fgu c1136900fgu2 = c1136900fgu;
                    if (c1136900fgu2 != null) {
                        c1135810ff9.LJJIFFI.remove(c1136900fgu2);
                        c1135810ff9.LJJIFFI.add(C1136900fgu.LIZ(c1136900fgu2, c1135810ff92.LJIIIZ + 1, 14));
                    }
                    c1135810ff9.LJJIFFI.addAll(c1135810ff92.LJJIFFI);
                    if (LiveGiftHammerSetting.INSTANCE.isEnabled()) {
                        Queue<Pair<Integer, Boolean>> queue = c1135810ff92.LJJII;
                        queue.addAll(c1135810ff9.LJJII);
                        c1135810ff9.LJJII = queue;
                    }
                    c1135810ff9.LJIIIZ = Math.max(c1135810ff9.LJIIIZ, c1135810ff92.LJIIIZ);
                    if (!z2) {
                        c1135810ff9.LJIIJ = c1135810ff92.LJIIJ;
                        c1135810ff9.LJIIJJI = c1135810ff92.LJIIJJI;
                        c1135810ff9.LJIIL.addAll(c1135810ff92.LJIIL);
                    }
                }
            }
            c1135810ff9.LJJIJIIJI = System.nanoTime();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("insertIntoQueue1 interruptedProcess == ");
            sbLIZ2.append(c1135810ff9.LJIIJJI);
            sbLIZ2.append(", currentProcess == ");
            sbLIZ2.append(c1135810ff9.LJIIJ);
            sbLIZ2.append(", mLocal == ");
            sbLIZ2.append(c1135810ff9.LJJJLIIL);
            sbLIZ2.append(", isSpecial = ");
            sbLIZ2.append(zLJ);
            sbLIZ2.append(", isSignatureSetContains = ");
            sbLIZ2.append(zContains);
            sbLIZ2.append(", signature=");
            sbLIZ2.append(str);
            C1138230fj3.LIZJ("LiveGiftTrayQueueHelper", C2188811AlT.LIZIZ(sbLIZ2));
            LIZLLL(c1135810ff9, list, function0, z);
            if (z) {
                C1134980fdo.LIZ.LJFF++;
            } else {
                GiftMessage giftMessage = c1135810ff9.LIZ;
                if (giftMessage != null && (gift = giftMessage.mGift) != null && gift.type == 2) {
                    C1134960fdm c1134960fdm = C1134980fdo.LIZ;
                    c1134960fdm.LJ++;
                    c1134960fdm.LIZJ++;
                } else {
                    C1134960fdm c1134960fdm2 = C1134980fdo.LIZ;
                    c1134960fdm2.LIZLLL++;
                    c1134960fdm2.LIZJ++;
                }
            }
            c1135810ff9.LJJIJIIJIL = System.nanoTime();
        } else {
            c1135810ff9.LJJIJIIJI = System.nanoTime();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("insertIntoQueue2 interruptedProcess == ");
            sbLIZ3.append(c1135810ff9.LJIIJJI);
            sbLIZ3.append(", currentProcess == ");
            sbLIZ3.append(c1135810ff9.LJIIJ);
            sbLIZ3.append(", isSpecial = ");
            sbLIZ3.append(zLJ);
            sbLIZ3.append(", mLocal == ");
            sbLIZ3.append(c1135810ff9.LJJJLIIL);
            sbLIZ3.append(", isSignatureSetContains = ");
            sbLIZ3.append(zContains);
            sbLIZ3.append(", signature=");
            sbLIZ3.append(str);
            C1138230fj3.LIZJ("LiveGiftTrayQueueHelper", C2188811AlT.LIZIZ(sbLIZ3));
            LIZLLL(c1135810ff9, list, function0, z);
            hashSet.add(str);
            c1135810ff9.LJJIJIIJIL = System.nanoTime();
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("insertIntoQueueAfter, isSpecial = ");
        sbLIZ4.append(zLJ);
        sbLIZ4.append(", isSignatureSetContains = ");
        sbLIZ4.append(zContains);
        sbLIZ4.append(", signature=");
        sbLIZ4.append(str);
        sbLIZ4.append(",  msgEntering = ");
        sbLIZ4.append(c1135810ff9);
        sbLIZ4.append(", queue = ");
        sbLIZ4.append(list);
        C1138230fj3.LIZ("LiveGiftTrayQueueHelper", C2188811AlT.LIZIZ(sbLIZ4));
    }
}
