package X;

import Y.ARunnableS117S0100000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135900ffI {
    public static final C11RO LIZ = C1701940uOG.LIZIZ();

    public static void LIZIZ(boolean z, InterfaceC1136020ffU interfaceC1136020ffU, List list, boolean z2, Function0 function0) {
        int size;
        int size2;
        int iLIZLLL;
        int iLIZLLL2;
        Long lValueOf;
        Long lValueOf2;
        boolean z3;
        int iLIZLLL3;
        int iLIZLLL4;
        Long lValueOf3;
        Long lValueOf4;
        if (C1135980ffQ.LJI(interfaceC1136020ffU.LJ(), z) == EnumC994350byz.VALUE) {
            if (!z) {
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                InterfaceC1136800fgk interfaceC1136800fgkLIZJ = interfaceC1136020ffU.LIZJ();
                if (interfaceC1136800fgkLIZJ != null && interfaceC1136800fgkLIZJ.getId() == currentUserId) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Iterator it2 = list.iterator();
                size = 0;
                while (it2.hasNext()) {
                    InterfaceC1136020ffU interfaceC1136020ffU2 = (InterfaceC1136020ffU) it2.next();
                    if (z3) {
                        InterfaceC1136800fgk interfaceC1136800fgkLIZJ2 = interfaceC1136020ffU2.LIZJ();
                        if (interfaceC1136800fgkLIZJ2 != null && interfaceC1136800fgkLIZJ2.getId() == currentUserId) {
                            break;
                            break;
                        }
                        break;
                    }
                    InterfaceC1136800fgk interfaceC1136800fgkLIZJ3 = interfaceC1136020ffU2.LIZJ();
                    if (interfaceC1136800fgkLIZJ3 == null || interfaceC1136800fgkLIZJ3.getId() != currentUserId) {
                    }
                    size++;
                    if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                        if (C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
                            iLIZLLL3 = C1135870ffF.LIZJ(interfaceC1136020ffU);
                        } else {
                            iLIZLLL3 = interfaceC1136020ffU.LJJI().LIZLLL();
                        }
                        if (C1135870ffF.LJIILIIL(interfaceC1136020ffU2)) {
                            iLIZLLL4 = C1135870ffF.LIZJ(interfaceC1136020ffU2);
                        } else {
                            iLIZLLL4 = interfaceC1136020ffU2.LJJI().LIZLLL();
                        }
                        if (iLIZLLL3 == iLIZLLL4 && C1135870ffF.LJIIJ(interfaceC1136020ffU) && C1135870ffF.LJIIJ(interfaceC1136020ffU2)) {
                            AssetsModel assetsModelLJIILLIIL = C1135870ffF.LJIILLIIL(interfaceC1136020ffU);
                            if (assetsModelLJIILLIIL != null) {
                                lValueOf3 = Long.valueOf(assetsModelLJIILLIIL.id);
                            } else {
                                lValueOf3 = null;
                            }
                            AssetsModel assetsModelLJIILLIIL2 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU2);
                            if (assetsModelLJIILLIIL2 != null) {
                                lValueOf4 = Long.valueOf(assetsModelLJIILLIIL2.id);
                            } else {
                                lValueOf4 = null;
                            }
                            if (Intrinsics.LJFF(lValueOf3, lValueOf4)) {
                                break;
                            } else {
                                size++;
                            }
                        } else if (iLIZLLL3 > iLIZLLL4) {
                            break;
                        } else {
                            size++;
                        }
                    } else if (interfaceC1136020ffU.LJJI().LIZLLL() > interfaceC1136020ffU2.LJJI().LIZLLL()) {
                        break;
                    } else {
                        size++;
                    }
                }
                size = -1;
            } else if (LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                Iterator it3 = list.iterator();
                size = 0;
                while (it3.hasNext()) {
                    InterfaceC1136020ffU interfaceC1136020ffU3 = (InterfaceC1136020ffU) it3.next();
                    if (C1135870ffF.LJIILIIL(interfaceC1136020ffU)) {
                        iLIZLLL = C1135870ffF.LIZJ(interfaceC1136020ffU);
                    } else {
                        iLIZLLL = interfaceC1136020ffU.LJJI().LIZLLL();
                    }
                    if (C1135870ffF.LJIILIIL(interfaceC1136020ffU3)) {
                        iLIZLLL2 = C1135870ffF.LIZJ(interfaceC1136020ffU3);
                    } else {
                        iLIZLLL2 = interfaceC1136020ffU3.LJJI().LIZLLL();
                    }
                    if (iLIZLLL == iLIZLLL2 && C1135870ffF.LJIIJ(interfaceC1136020ffU) && C1135870ffF.LJIIJ(interfaceC1136020ffU3)) {
                        AssetsModel assetsModelLJIILLIIL3 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU);
                        if (assetsModelLJIILLIIL3 != null) {
                            lValueOf = Long.valueOf(assetsModelLJIILLIIL3.id);
                        } else {
                            lValueOf = null;
                        }
                        AssetsModel assetsModelLJIILLIIL4 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU3);
                        if (assetsModelLJIILLIIL4 != null) {
                            lValueOf2 = Long.valueOf(assetsModelLJIILLIIL4.id);
                        } else {
                            lValueOf2 = null;
                        }
                        if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                            break;
                        } else {
                            size++;
                        }
                    } else if (iLIZLLL > iLIZLLL2) {
                        break;
                    } else {
                        size++;
                    }
                }
                size = -1;
            } else {
                Iterator it4 = list.iterator();
                size = 0;
                while (it4.hasNext()) {
                    if (interfaceC1136020ffU.LJJI().LIZLLL() > ((InterfaceC1136020ffU) it4.next()).LJJI().LIZLLL()) {
                        break;
                    } else {
                        size++;
                    }
                }
                size = -1;
            }
        } else if (interfaceC1136020ffU.LJJI().LJIIIZ > 0) {
            Iterator it5 = list.iterator();
            size = 0;
            while (it5.hasNext()) {
                if (C1135870ffF.LJIIIZ(interfaceC1136020ffU, (InterfaceC1136020ffU) it5.next())) {
                    break;
                } else {
                    size++;
                }
            }
            size = -1;
        } else {
            size = ((LinkedList) list).size();
        }
        Integer numValueOf = Integer.valueOf(size);
        int iIntValue = numValueOf.intValue();
        if (iIntValue >= 0 && iIntValue <= ((LinkedList) list).size()) {
            size2 = numValueOf.intValue();
        } else {
            size2 = ((LinkedList) list).size();
        }
        ListProtector.add(list, size2, interfaceC1136020ffU);
        C1136080ffa.LIZLLL(interfaceC1136020ffU, z2);
        LIZ.LIZIZ(new ARunnableS117S0100000_17(function0, 173));
    }

    public static void LIZ(boolean z, InterfaceC1136020ffU interfaceC1136020ffU, List list, HashSet hashSet, boolean z2, boolean z3, Function0 function0) {
        if (interfaceC1136020ffU.LJJIFFI() != null) {
            System.nanoTime();
        }
        C1133910fc5.LJ("GiftTrayMessageQueueHelper", "new msg entering");
        String str = interfaceC1136020ffU.LJJI().LIZIZ;
        boolean zLJIIL = C1135870ffF.LJIIL(interfaceC1136020ffU);
        boolean zContains = hashSet.contains(str);
        if (!zLJIIL && zContains) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1136020ffU interfaceC1136020ffU2 = (InterfaceC1136020ffU) it2.next();
                if (Intrinsics.LJFF(interfaceC1136020ffU2.LJJI().LIZIZ, str)) {
                    it2.remove();
                    C1136080ffa.LJFF(interfaceC1136020ffU2, z2);
                    interfaceC1136020ffU2.LJJIFFI().LJIIJJI.addAll(interfaceC1136020ffU.LJJIFFI().LJIIJJI);
                    interfaceC1136020ffU.LJJIFFI().LJIIJJI = interfaceC1136020ffU2.LJJIFFI().LJIIJJI;
                    interfaceC1136020ffU.LJJIFFI().LJFF = interfaceC1136020ffU2.LJJIFFI().LJFF;
                    interfaceC1136020ffU.LJJI().LJ(interfaceC1136020ffU2);
                    C1133200faw.LIZJ(interfaceC1136020ffU, interfaceC1136020ffU2);
                    interfaceC1136020ffU.LJJI().LIZLLL = Math.max(interfaceC1136020ffU.LJJI().LIZJ(), interfaceC1136020ffU2.LJJI().LIZJ());
                    if (!z3) {
                        interfaceC1136020ffU.LJJI().LJI = interfaceC1136020ffU2.LJJI().LIZ();
                        interfaceC1136020ffU.LJJI().LJII = interfaceC1136020ffU2.LJJI().LJII;
                        interfaceC1136020ffU2.LJJI().LJIIIIZZ.addAll(interfaceC1136020ffU.LJJI().LJIIIIZZ);
                        interfaceC1136020ffU.LJJI().LJIIIIZZ = interfaceC1136020ffU2.LJJI().LJIIIIZZ;
                    }
                }
            }
            C1136240ffq c1136240ffqLJJIFFI = interfaceC1136020ffU.LJJIFFI();
            System.nanoTime();
            c1136240ffqLJJIFFI.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("insertIntoQueue1 interruptedProcess == ");
            sbLIZ.append(interfaceC1136020ffU.LJJI().LJII);
            sbLIZ.append(", currentProcess == ");
            sbLIZ.append(interfaceC1136020ffU.LJJI().LIZ());
            sbLIZ.append(", mLocal == ");
            sbLIZ.append(interfaceC1136020ffU.LJ());
            sbLIZ.append(", isSpecial = ");
            sbLIZ.append(zLJIIL);
            sbLIZ.append(", isSignatureSetContains = ");
            sbLIZ.append(zContains);
            sbLIZ.append(", signature=");
            sbLIZ.append(str);
            C1133910fc5.LJIIIIZZ("GiftTrayMessageQueueHelper", C2188811AlT.LIZIZ(sbLIZ));
            LIZIZ(z, interfaceC1136020ffU, list, z2, function0);
            if (z2) {
                C1134980fdo.LIZ.LJFF++;
            } else if (C1135870ffF.LJII(interfaceC1136020ffU) == 2) {
                C1134960fdm c1134960fdm = C1134980fdo.LIZ;
                c1134960fdm.LJ++;
                c1134960fdm.LIZJ++;
            } else {
                C1134960fdm c1134960fdm2 = C1134980fdo.LIZ;
                c1134960fdm2.LIZLLL++;
                c1134960fdm2.LIZJ++;
            }
            C1136240ffq c1136240ffqLJJIFFI2 = interfaceC1136020ffU.LJJIFFI();
            System.nanoTime();
            c1136240ffqLJJIFFI2.getClass();
            return;
        }
        C1136240ffq c1136240ffqLJJIFFI3 = interfaceC1136020ffU.LJJIFFI();
        System.nanoTime();
        c1136240ffqLJJIFFI3.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("insertIntoQueue2 interruptedProcess == ");
        sbLIZ2.append(interfaceC1136020ffU.LJJI().LJII);
        sbLIZ2.append(", currentProcess == ");
        sbLIZ2.append(interfaceC1136020ffU.LJJI().LIZ());
        sbLIZ2.append(", isSpecial = ");
        sbLIZ2.append(zLJIIL);
        sbLIZ2.append(", mLocal == ");
        sbLIZ2.append(interfaceC1136020ffU.LJ());
        sbLIZ2.append(", isSignatureSetContains = ");
        sbLIZ2.append(zContains);
        sbLIZ2.append(", signature=");
        sbLIZ2.append(str);
        C1133910fc5.LJIIIIZZ("GiftTrayMessageQueueHelper", C2188811AlT.LIZIZ(sbLIZ2));
        LIZIZ(z, interfaceC1136020ffU, list, z2, function0);
        hashSet.add(str);
        C1136240ffq c1136240ffqLJJIFFI4 = interfaceC1136020ffU.LJJIFFI();
        System.nanoTime();
        c1136240ffqLJJIFFI4.getClass();
    }
}
