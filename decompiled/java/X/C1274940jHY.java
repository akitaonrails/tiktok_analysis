package X;

import Y.ARunnableS120S0100000_20;
import android.text.TextUtils;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274940jHY {
    public final Map<String, C1275150jHt> LIZ = new ConcurrentHashMap();
    public final String LIZIZ;
    public final C1274890jHT LIZJ;
    public final InterfaceC1275920jJ8 LIZLLL;
    public final C1274830jHN LJ;
    public final VPassInteractCfg LJFF;
    public final C1274250jGR LJI;

    public static boolean LIZJ(int i) {
        if (i >= StreamIndex.STREAM_INDEX_3RD.value() && i < StreamIndex.STREAM_INDEX_MAX.value()) {
            return true;
        }
        return false;
    }

    public final int LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyAuxStream:");
        sbLIZ.append(str);
        AVLog.logKibana(4, "AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            ((C1275150jHt) ((ConcurrentHashMap) this.LIZ).get(str)).LIZIZ();
            ((ConcurrentHashMap) this.LIZ).remove(str);
            C1275550jIX c1275550jIX = ((C1274990jHd) this.LIZLLL).LIZIZ;
            if (c1275550jIX != null) {
                synchronized (c1275550jIX) {
                    if (((ConcurrentHashMap) c1275550jIX.LIZ).containsKey(str)) {
                        ((ConcurrentHashMap) c1275550jIX.LIZ).remove(str);
                    }
                }
            }
            C1274830jHN c1274830jHN = this.LJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mInteractId:");
            sbLIZ2.append(this.LIZIZ);
            sbLIZ2.append(" ,streamId:");
            sbLIZ2.append(str);
            sbLIZ2.append(" ,result:");
            sbLIZ2.append(0);
            c1274830jHN.LJIIIIZZ("destroyAuxStream", C2188811AlT.LIZIZ(sbLIZ2));
            return 0;
        }
        C1274830jHN c1274830jHN2 = this.LJ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("mInteractId:");
        sbLIZ3.append(this.LIZIZ);
        sbLIZ3.append(" ,streamId:");
        sbLIZ3.append(str);
        sbLIZ3.append(" ,result:");
        sbLIZ3.append(-1);
        c1274830jHN2.LJIIIIZZ("destroyAuxStream", C2188811AlT.LIZIZ(sbLIZ3));
        return -1;
    }

    public final C1275150jHt LIZIZ(String str) {
        if (!TextUtils.isEmpty(str) && ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            return (C1275150jHt) ((ConcurrentHashMap) this.LIZ).get(str);
        }
        return null;
    }

    public final void LIZLLL(EnumC1276080jJO enumC1276080jJO) {
        if (enumC1276080jJO == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setAnchorNetRtcScene: ");
        sbLIZ.append(enumC1276080jJO);
        AVLog.logKibana(4, "AuxStreamManager", C2188811AlT.LIZIZ(sbLIZ), null);
        for (C1275150jHt c1275150jHt : ((ConcurrentHashMap) this.LIZ).values()) {
            if (enumC1276080jJO != c1275150jHt.LJJ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setRtcScene: ");
                sbLIZ2.append(c1275150jHt.LJJ);
                sbLIZ2.append(" -> ");
                sbLIZ2.append(enumC1276080jJO);
                AVLog.logKibana(4, "AuxStream", C2188811AlT.LIZIZ(sbLIZ2), null);
                c1275150jHt.LJJ = enumC1276080jJO;
                if (enumC1276080jJO == EnumC1276080jJO.LinkMic) {
                    C786410Ut5.LJJZZIII(c1275150jHt.LJIILLIIL, new ARunnableS120S0100000_20(c1275150jHt, 306));
                }
            }
        }
    }

    public static String LJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1274940jHY(String str, C1274890jHT c1274890jHT, InterfaceC1275920jJ8 interfaceC1275920jJ8, C1274830jHN c1274830jHN, VPassInteractCfg vPassInteractCfg, C1274250jGR c1274250jGR) {
        new ArrayList();
        this.LIZIZ = str;
        this.LIZJ = c1274890jHT;
        this.LIZLLL = interfaceC1275920jJ8;
        this.LJ = c1274830jHN;
        this.LJFF = vPassInteractCfg;
        this.LJI = c1274250jGR;
    }
}
