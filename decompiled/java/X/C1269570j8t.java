package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0j8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1269570j8t {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final int LIZIZ = 1;
    public static final int LIZJ = 2;
    public static final int LIZLLL = 4;
    public static final int LJ = 8;
    public static final int LJFF = 16;

    public static String LIZ(int i) {
        String strLIZIZ = "";
        if ((LIZIZ & i) != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append("CAPTURE_NODE");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if ((LIZJ & i) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("|");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append("VIDEO_ADAPTER_NODE");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if ((LIZLLL & i) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append("|");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("EFFECT_NODE");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if ((LJ & i) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append("|");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(strLIZIZ);
            sbLIZ7.append("PUSHER_ENCODE_NODE");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
        }
        if ((i & LJFF) != 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(strLIZIZ);
                sbLIZ8.append("|");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            }
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(strLIZIZ);
            sbLIZ9.append("RTC_ENCODE_NODE");
            return C2188811AlT.LIZIZ(sbLIZ9);
        }
        return strLIZIZ;
    }

    public static C1269610j8x LIZIZ(EnumC1269590j8v enumC1269590j8v, int i) {
        int iIncrementAndGet = LIZ.incrementAndGet();
        int i2 = C1269580j8u.LIZ[enumC1269590j8v.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return new C1269630j8z(iIncrementAndGet, EnumC1269590j8v.SimulcastUpdateLayoutConfig, i);
            }
            return new C1269620j8y(iIncrementAndGet, EnumC1269590j8v.EffectEnableSwitch, i);
        }
        return new C1269600j8w(iIncrementAndGet, EnumC1269590j8v.UpdateVideoParameters, i, null);
    }

    public static void LIZJ(VideoFrame videoFrame, List<C1269610j8x> list, C1269300j8S c1269300j8S) {
        videoFrame.clearSerializedEvents();
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            Iterator<C1269610j8x> it2 = list.iterator();
            while (it2.hasNext()) {
                C1269610j8x next = it2.next();
                InterfaceC1269480j8k interfaceC1269480j8k = next.LJI;
                if (interfaceC1269480j8k == null || interfaceC1269480j8k.LIZ()) {
                    linkedList.add(next);
                    it2.remove();
                    if (c1269300j8S != null) {
                        c1269300j8S.LIZIZ(next.LIZIZ(LIZLLL));
                    }
                }
            }
        }
        if (!linkedList.isEmpty()) {
            videoFrame.appendSerializedEvents(linkedList);
        }
    }
}
