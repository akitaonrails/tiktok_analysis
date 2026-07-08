package X;

import com.lynx.tasm.LynxEnv;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0hEC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195980hEC {
    public static final C1195980hEC LIZ = new C1195980hEC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(740));

    public static C1187710h0r LIZ(String str) {
        String string;
        C01GW c01gw = LIZIZ;
        C1187710h0r c1187710h0r = (C1187710h0r) ((ConcurrentHashMap) c01gw.getValue()).get(str);
        if (c1187710h0r != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchGeckoInfoByChannel, channel=");
            sbLIZ.append(str);
            sbLIZ.append(", res=");
            sbLIZ.append(c1187710h0r);
            C2188811AlT.LIZIZ(sbLIZ);
            return c1187710h0r;
        }
        C1553670qX7.LIZ.getClass();
        Long lLJIIL = C1552050qUV.LJIIL(C1553670qX7.LIZ(), str);
        if (lLJIIL != null) {
            string = lLJIIL.toString();
        } else {
            string = null;
        }
        C1187710h0r c1187710h0r2 = new C1187710h0r(string, "1.7.2", LynxEnv.inst().getLynxVersion(), str);
        ((ConcurrentHashMap) c01gw.getValue()).put(str, c1187710h0r2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchGeckoInfoByChannel, channel=");
        sbLIZ2.append(str);
        sbLIZ2.append(", res=");
        sbLIZ2.append(c1187710h0r2);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c1187710h0r2;
    }
}
