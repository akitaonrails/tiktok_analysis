package X;

import Y.AComparatorS51S0000000_32;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21182717uz {
    public static final C21182717uz LIZ = new C21182717uz();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(145));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(147));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(146));

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static boolean LIZIZ(IMessage iMessage) {
        ECommerceMessage eCommerceMessage;
        if (C292450BdD.LIZ() && (iMessage instanceof ECommerceMessage) && (eCommerceMessage = (ECommerceMessage) iMessage) != null && eCommerceMessage.oecLiveShoppingMessageV2 != null) {
            return true;
        }
        return false;
    }

    public static void LIZJ(String str, AbstractC21180917uh abstractC21180917uh) {
        if (!LIZ().containsKey(str)) {
            LIZ().put(str, new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ().get(str);
        int iLJ = (int) abstractC21180917uh.LJ();
        if (concurrentHashMap != null && !concurrentHashMap.containsKey(Integer.valueOf(iLJ))) {
            concurrentHashMap.put(Integer.valueOf(iLJ), new ConcurrentHashMap());
        }
        ConcurrentHashMap concurrentHashMap2 = null;
        if (concurrentHashMap != null) {
            concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iLJ));
        }
        Iterator<Integer> it2 = abstractC21180917uh.LIZJ().iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (concurrentHashMap2 != null) {
                if (!concurrentHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    concurrentHashMap2.put(Integer.valueOf(iIntValue), new CopyOnWriteArraySet());
                }
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap2.get(Integer.valueOf(iIntValue));
                if (copyOnWriteArraySet != null) {
                    if (copyOnWriteArraySet.contains(abstractC21180917uh)) {
                        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ECLiveMessageCenter: registerV2Handler duplicate ");
                        abstractC21180917uh.message();
                        sbLIZ.append(10000);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c2341109Fh.getClass();
                        C2341109Fh.LJ(strLIZIZ);
                    } else {
                        copyOnWriteArraySet.add(abstractC21180917uh);
                        C13LP.LJLLLL(new AComparatorS51S0000000_32(1), copyOnWriteArraySet);
                    }
                }
            }
        }
    }
}
