package X;

import Y.ARunnableS30S1200000_27;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0yBU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847780yBU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC1847507Ll interfaceC1847507Ll, C1847770yBT c1847770yBT, EnumC1847910yBh enumC1847910yBh) {
        C1848090yBz c1848090yBz;
        InterfaceC1847650yBH interfaceC1847650yBH;
        int i;
        int i2;
        C1848110yC1 c1848110yC1;
        C1848110yC1 c1848110yC12;
        String strLJI;
        Boolean boolValueOf;
        String str = null;
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("eventType=");
            sbLIZ.append(interfaceC1847507Ll.getEvent());
            sbLIZ.append(", node_oid=");
            if (c1847770yBT != null) {
                strLJI = c1847770yBT.LJI();
            } else {
                strLJI = null;
            }
            sbLIZ.append(strLJI);
            sbLIZ.append(" isPage: ");
            if (c1847770yBT != null) {
                boolValueOf = Boolean.valueOf(c1847770yBT.LJIIIIZZ());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        LinkedList<C1848090yBz> linkedList = C1848090yBz.LIZJ;
        synchronized (linkedList) {
            try {
                if (!linkedList.isEmpty()) {
                    c1848090yBz = linkedList.pop();
                } else {
                    c1848090yBz = new C1848090yBz();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c1848090yBz.LIZ = interfaceC1847507Ll.getEvent();
        C1847830yBZ.LIZ(c1848090yBz, interfaceC1847507Ll.getParams(), null);
        if (c1847770yBT != null) {
            c1848090yBz.LIZ("nxet_spm", c1847770yBT.LJII());
            Pair<String, Boolean> pair = c1847770yBT.LJIIL;
            c1848090yBz.LIZ("nxet_scm", pair.getFirst());
            if (pair.getSecond().booleanValue()) {
                c1848090yBz.LIZ("nxet_scm_enc", Boolean.TRUE);
            }
            int i3 = -1;
            if (c1847770yBT.LJIIIIZZ()) {
                C1848300yCK c1848300yCK = c1847770yBT.LJIIIIZZ;
                if ((c1848300yCK instanceof C1848110yC1) && (c1848110yC12 = (C1848110yC1) c1848300yCK) != null) {
                    i2 = c1848110yC12.LJ;
                } else {
                    i2 = -1;
                }
                c1848090yBz.LIZ("nxet_pgstep", Integer.valueOf(i2));
                C1848300yCK c1848300yCK2 = c1847770yBT.LJIIIIZZ;
                if ((c1848300yCK2 instanceof C1848110yC1) && (c1848110yC1 = (C1848110yC1) c1848300yCK2) != null) {
                    str = c1848110yC1.LJFF;
                }
                c1848090yBz.LIZ("nxet_psrefer", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = c1847770yBT.getMultirefers().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                c1848090yBz.LIZ("nxet_multirefers", jSONArray.toString());
                c1848090yBz.LIZ("nxet_page_type", c1847770yBT.LIZ.LIZLLL);
            }
            C2097508Jp params = c1847770yBT.getParams();
            if (params != null) {
                C1847830yBZ.LIZ(c1848090yBz, params, c1847770yBT);
            }
            if (enumC1847910yBh != null && ((i = C1848000yBq.LIZ[enumC1847910yBh.ordinal()]) == 1 || i == 2)) {
                C1848300yCK c1848300yCK3 = c1847770yBT.LJIIIIZZ;
                if (c1848300yCK3 != null) {
                    i3 = c1848300yCK3.LIZJ;
                }
                c1848090yBz.LIZ("nxet_show_seq", String.valueOf(i3));
            }
        }
        Pair<String, String> pair2 = C1085080eLK.LIZ;
        c1848090yBz.LIZ(pair2.getFirst(), pair2.getSecond());
        c1848090yBz.LIZ("nxet_sessid", C1848140yC4.LIZJ.getValue());
        c1848090yBz.LIZ("nxet_sidrefer", C1848140yC4.LIZIZ.getValue());
        if (!C1847990yBp.LIZIZ) {
            c1848090yBz.LIZ("nxet_ib", Boolean.TRUE);
        }
        int i4 = C1848410yCV.LIZIZ;
        C1848410yCV.LIZIZ = i4 + 1;
        c1848090yBz.LIZ("nxet_seq", Integer.valueOf(i4));
        c1848090yBz.LIZ("nxet_sess_time_offset", Long.valueOf(SystemClock.uptimeMillis() - C1848410yCV.LIZJ));
        c1848090yBz.LIZ("nxet_acrefer", C1847820yBY.LJ);
        String str2 = c1848090yBz.LIZ;
        if (str2 != null && str2.length() != 0) {
            ARunnableS30S1200000_27 aRunnableS30S1200000_27 = new ARunnableS30S1200000_27(c1848090yBz, str2, c1847770yBT, enumC1847910yBh, 2);
            C1847960yBm c1847960yBm = C1847960yBm.LJII;
            if (c1847960yBm != null && (interfaceC1847650yBH = c1847960yBm.LJFF) != null) {
                interfaceC1847650yBH.LIZIZ(aRunnableS30S1200000_27);
            }
        }
    }
}
