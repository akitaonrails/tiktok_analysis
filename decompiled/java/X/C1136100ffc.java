package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoPlayerPerfOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136100ffc {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C1136350fg1 LIZ;
    public final C1136350fg1 LIZIZ;
    public final C1136350fg1 LIZJ;

    public final long LIZLLL() {
        return LJIIJJI() + LJIIJJI();
    }

    public final boolean LIZIZ() {
        return LIZLLL() <= 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftTrayMessageQueueOther(AsyncQueue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", SyncQueue=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", InsertQueue=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0fg1, X.0fl5] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0fg1, X.0fl5] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0fg1, X.0fl5] */
    public C1136100ffc(InterfaceC1132530fZr interfaceC1132530fZr) {
        DataChannel dataChannelO3;
        DataChannel dataChannelO32;
        ?? r1 = new AbstractC1139490fl5<InterfaceC1136020ffU>() { // from class: X.0fg1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC1139490fl5
            public final boolean LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
                int iLIZIZ;
                Long lValueOf;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU2.LJIIIIZZ();
                boolean zLJIILIIL = C1135870ffF.LJIILIIL(interfaceC1136020ffU2);
                if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                    iLIZIZ = C1135870ffF.LIZJ(interfaceC1136020ffU2);
                } else {
                    iLIZIZ = C1135870ffF.LIZIZ(interfaceC1136020ffU2);
                }
                if (interfaceC1136160ffiLJIIIIZZ != null && iLIZIZ >= 0) {
                    LinkedList linkedList = (LinkedList) this.LIZJ.get(Integer.valueOf(iLIZIZ));
                    if (linkedList == null) {
                        TreeMap<Integer, LinkedList<DATA>> treeMap = this.LIZJ;
                        Integer numValueOf = Integer.valueOf(iLIZIZ);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(interfaceC1136020ffU2);
                        treeMap.put(numValueOf, (LinkedList<DATA>) linkedList2);
                        return true;
                    }
                    if (!this.LIZIZ) {
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        if (C1135870ffF.LJIJI(interfaceC1136020ffU2) == currentUserId) {
                            ListIterator listIterator = linkedList.listIterator();
                            while (listIterator.hasNext()) {
                                if (C1135870ffF.LJIJI((InterfaceC1136020ffU) listIterator.next()) != currentUserId) {
                                    listIterator.previous();
                                    listIterator.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                        ListIterator listIterator2 = linkedList.listIterator();
                        while (listIterator2.hasNext()) {
                            InterfaceC1136020ffU interfaceC1136020ffU3 = (InterfaceC1136020ffU) listIterator2.next();
                            if (C1135870ffF.LJIIJ(interfaceC1136020ffU2) && C1135870ffF.LJIIJ(interfaceC1136020ffU3)) {
                                AssetsModel assetsModelLJIILLIIL = C1135870ffF.LJIILLIIL(interfaceC1136020ffU2);
                                Long lValueOf2 = null;
                                if (assetsModelLJIILLIIL != null) {
                                    lValueOf = Long.valueOf(assetsModelLJIILLIIL.id);
                                } else {
                                    lValueOf = null;
                                }
                                AssetsModel assetsModelLJIILLIIL2 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU3);
                                if (assetsModelLJIILLIIL2 != null) {
                                    lValueOf2 = Long.valueOf(assetsModelLJIILLIIL2.id);
                                }
                                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                    listIterator2.previous();
                                    listIterator2.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    linkedList.add(interfaceC1136020ffU2);
                    return true;
                }
                C1133910fc5.LJ("GiftBucketQueue", "offer, gift == null || gift.diamondCount < 0");
                return false;
            }
        };
        if (interfaceC1132530fZr != null) {
            dataChannelO3 = interfaceC1132530fZr.o3();
        } else {
            dataChannelO3 = null;
        }
        r1.LIZIZ = C500260Jjc.LJIIZILJ(dataChannelO3);
        this.LIZ = r1;
        ?? r12 = new AbstractC1139490fl5<InterfaceC1136020ffU>() { // from class: X.0fg1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC1139490fl5
            public final boolean LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
                int iLIZIZ;
                Long lValueOf;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU2.LJIIIIZZ();
                boolean zLJIILIIL = C1135870ffF.LJIILIIL(interfaceC1136020ffU2);
                if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                    iLIZIZ = C1135870ffF.LIZJ(interfaceC1136020ffU2);
                } else {
                    iLIZIZ = C1135870ffF.LIZIZ(interfaceC1136020ffU2);
                }
                if (interfaceC1136160ffiLJIIIIZZ != null && iLIZIZ >= 0) {
                    LinkedList linkedList = (LinkedList) this.LIZJ.get(Integer.valueOf(iLIZIZ));
                    if (linkedList == null) {
                        TreeMap<Integer, LinkedList<DATA>> treeMap = this.LIZJ;
                        Integer numValueOf = Integer.valueOf(iLIZIZ);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(interfaceC1136020ffU2);
                        treeMap.put(numValueOf, (LinkedList<DATA>) linkedList2);
                        return true;
                    }
                    if (!this.LIZIZ) {
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        if (C1135870ffF.LJIJI(interfaceC1136020ffU2) == currentUserId) {
                            ListIterator listIterator = linkedList.listIterator();
                            while (listIterator.hasNext()) {
                                if (C1135870ffF.LJIJI((InterfaceC1136020ffU) listIterator.next()) != currentUserId) {
                                    listIterator.previous();
                                    listIterator.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                        ListIterator listIterator2 = linkedList.listIterator();
                        while (listIterator2.hasNext()) {
                            InterfaceC1136020ffU interfaceC1136020ffU3 = (InterfaceC1136020ffU) listIterator2.next();
                            if (C1135870ffF.LJIIJ(interfaceC1136020ffU2) && C1135870ffF.LJIIJ(interfaceC1136020ffU3)) {
                                AssetsModel assetsModelLJIILLIIL = C1135870ffF.LJIILLIIL(interfaceC1136020ffU2);
                                Long lValueOf2 = null;
                                if (assetsModelLJIILLIIL != null) {
                                    lValueOf = Long.valueOf(assetsModelLJIILLIIL.id);
                                } else {
                                    lValueOf = null;
                                }
                                AssetsModel assetsModelLJIILLIIL2 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU3);
                                if (assetsModelLJIILLIIL2 != null) {
                                    lValueOf2 = Long.valueOf(assetsModelLJIILLIIL2.id);
                                }
                                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                    listIterator2.previous();
                                    listIterator2.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    linkedList.add(interfaceC1136020ffU2);
                    return true;
                }
                C1133910fc5.LJ("GiftBucketQueue", "offer, gift == null || gift.diamondCount < 0");
                return false;
            }
        };
        if (interfaceC1132530fZr != null) {
            dataChannelO32 = interfaceC1132530fZr.o3();
        } else {
            dataChannelO32 = null;
        }
        r12.LIZIZ = C500260Jjc.LJIIZILJ(dataChannelO32);
        this.LIZIZ = r12;
        ?? r13 = new AbstractC1139490fl5<InterfaceC1136020ffU>() { // from class: X.0fg1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC1139490fl5
            public final boolean LJI(InterfaceC1136020ffU interfaceC1136020ffU) {
                int iLIZIZ;
                Long lValueOf;
                InterfaceC1136020ffU interfaceC1136020ffU2 = interfaceC1136020ffU;
                InterfaceC1136160ffi interfaceC1136160ffiLJIIIIZZ = interfaceC1136020ffU2.LJIIIIZZ();
                boolean zLJIILIIL = C1135870ffF.LJIILIIL(interfaceC1136020ffU2);
                if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                    iLIZIZ = C1135870ffF.LIZJ(interfaceC1136020ffU2);
                } else {
                    iLIZIZ = C1135870ffF.LIZIZ(interfaceC1136020ffU2);
                }
                if (interfaceC1136160ffiLJIIIIZZ != null && iLIZIZ >= 0) {
                    LinkedList linkedList = (LinkedList) this.LIZJ.get(Integer.valueOf(iLIZIZ));
                    if (linkedList == null) {
                        TreeMap<Integer, LinkedList<DATA>> treeMap = this.LIZJ;
                        Integer numValueOf = Integer.valueOf(iLIZIZ);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(interfaceC1136020ffU2);
                        treeMap.put(numValueOf, (LinkedList<DATA>) linkedList2);
                        return true;
                    }
                    if (!this.LIZIZ) {
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        if (C1135870ffF.LJIJI(interfaceC1136020ffU2) == currentUserId) {
                            ListIterator listIterator = linkedList.listIterator();
                            while (listIterator.hasNext()) {
                                if (C1135870ffF.LJIJI((InterfaceC1136020ffU) listIterator.next()) != currentUserId) {
                                    listIterator.previous();
                                    listIterator.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    if (zLJIILIIL && LiveGiftVideoPlayerPerfOptSetting.INSTANCE.isEnableReorder()) {
                        ListIterator listIterator2 = linkedList.listIterator();
                        while (listIterator2.hasNext()) {
                            InterfaceC1136020ffU interfaceC1136020ffU3 = (InterfaceC1136020ffU) listIterator2.next();
                            if (C1135870ffF.LJIIJ(interfaceC1136020ffU2) && C1135870ffF.LJIIJ(interfaceC1136020ffU3)) {
                                AssetsModel assetsModelLJIILLIIL = C1135870ffF.LJIILLIIL(interfaceC1136020ffU2);
                                Long lValueOf2 = null;
                                if (assetsModelLJIILLIIL != null) {
                                    lValueOf = Long.valueOf(assetsModelLJIILLIIL.id);
                                } else {
                                    lValueOf = null;
                                }
                                AssetsModel assetsModelLJIILLIIL2 = C1135870ffF.LJIILLIIL(interfaceC1136020ffU3);
                                if (assetsModelLJIILLIIL2 != null) {
                                    lValueOf2 = Long.valueOf(assetsModelLJIILLIIL2.id);
                                }
                                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                                    listIterator2.previous();
                                    listIterator2.add(interfaceC1136020ffU2);
                                    return true;
                                }
                            }
                        }
                    }
                    linkedList.add(interfaceC1136020ffU2);
                    return true;
                }
                C1133910fc5.LJ("GiftBucketQueue", "offer, gift == null || gift.diamondCount < 0");
                return false;
            }
        };
        r13.LIZIZ = C500260Jjc.LJIIZILJ(interfaceC1132530fZr != null ? interfaceC1132530fZr.o3() : null);
        this.LIZJ = r13;
    }

    public final InterfaceC1136020ffU LIZ(Function1<? super InterfaceC1136020ffU, Boolean> function1) {
        C1136350fg1 c1136350fg1;
        C1136350fg1 c1136350fg12;
        if (LIZIZ()) {
            return null;
        }
        if (LJ() >= LJ()) {
            c1136350fg1 = this.LIZIZ;
            c1136350fg12 = this.LIZ;
        } else {
            c1136350fg1 = this.LIZ;
            c1136350fg12 = this.LIZIZ;
        }
        InterfaceC1136020ffU interfaceC1136020ffULIZIZ = c1136350fg1.LIZIZ(function1);
        if (interfaceC1136020ffULIZIZ == null) {
            return c1136350fg12.LIZIZ(function1);
        }
        return interfaceC1136020ffULIZIZ;
    }

    public final void LIZJ(Function1<? super InterfaceC1136020ffU, C1140170fmB> function1) {
        if (LIZIZ()) {
            return;
        }
        if (!LIZJ()) {
            LIZLLL(function1);
        }
        if (!LIZJ()) {
            LIZLLL(function1);
        }
    }
}
