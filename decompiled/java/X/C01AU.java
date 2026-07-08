package X;

import com.bytedance.android.livesdk.sticker.game.ViewerGameGiftStateChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.01AU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AU {
    public static long LIZ(DataChannel dataChannel) {
        C146400hC c146400hC = (C146400hC) dataChannel.gg0(ViewerGameGiftStateChannel.class);
        if (c146400hC != null) {
            return c146400hC.LIZIZ;
        }
        return 0L;
    }

    public static void LIZLLL(LinkedList linkedList) {
        AbstractC1126600fQI abstractC1126600fQI;
        C01AG c01ag = C01AG.MINUTE_GAME;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        for (Object obj : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) obj;
                if (abstractC1126600fQI2 != null && (abstractC1126600fQI2.LIZ == c01ag.getHeaderType() || C01AT.LIZ(abstractC1126600fQI2, c01ag))) {
                    linkedHashSet.add(Integer.valueOf(i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        int i3 = 0;
        for (Object obj2 : linkedList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) obj2;
                if (abstractC1126600fQI3 != null && abstractC1126600fQI3.LIZ == c01ag.getHeaderType()) {
                    while (true) {
                        i3--;
                        if (i3 < 0 || (abstractC1126600fQI = (AbstractC1126600fQI) linkedList.get(i3)) == null || abstractC1126600fQI.LIZ != 0) {
                            break;
                        } else {
                            linkedHashSet.add(Integer.valueOf(i3));
                        }
                    }
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        Iterator it2 = C13LP.LJLLL(linkedHashSet).iterator();
        while (it2.hasNext()) {
            linkedList.remove(((Number) it2.next()).intValue());
        }
    }

    public static int LIZIZ(long j, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            Object obj = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) next;
                    Integer numValueOf = Integer.valueOf(i);
                    numValueOf.intValue();
                    if (abstractC1126600fQI != null && C01AK.LIZIZ(abstractC1126600fQI, C01AG.MINUTE_GAME)) {
                        arrayList.add(numValueOf);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (j > 0) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) C13LP.LJJJLZIJ(((Number) next2).intValue(), list);
                        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJFF() == j) {
                            obj = next2;
                            break;
                        }
                    }
                    Integer num = (Integer) obj;
                    if (num != null) {
                        return num.intValue();
                    }
                    return -1;
                }
                Integer num2 = (Integer) C13LP.LJLL(arrayList);
                if (num2 != null) {
                    return num2.intValue();
                }
                return -1;
            }
        }
    }

    public static void LIZJ(LinkedList linkedList, boolean z, long j) {
        AbstractC1126600fQI abstractC1126600fQI;
        if (!z) {
            return;
        }
        if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                AbstractC1126600fQI abstractC1126600fQI2 = (AbstractC1126600fQI) it2.next();
                if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LIZ == C01AG.MINUTE_GAME.getHeaderType()) {
                    return;
                }
            }
        }
        int iLIZIZ = LIZIZ(j, linkedList);
        if (iLIZIZ == -1 || (abstractC1126600fQI = (AbstractC1126600fQI) linkedList.get(iLIZIZ)) == null) {
            return;
        }
        C01AN c01anLIZ = C01AM.LIZ(C01AG.MINUTE_GAME, iLIZIZ, abstractC1126600fQI.LJFF(), abstractC1126600fQI, linkedList, 4);
        linkedList.addAll(c01anLIZ.LIZ, c01anLIZ.LIZJ);
    }
}
