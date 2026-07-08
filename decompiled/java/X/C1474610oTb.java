package X;

import Y.AComparatorS28S0000000_9;
import Y.AComparatorS42S0000000_23;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474610oTb implements InterfaceC1476900oXI {
    public C1470240oMY LIZ;

    @Override // X.InterfaceC1476900oXI
    public final List<Pair<EnumC2281141EQm, SimBitRate>> LIZIZ() {
        C1473400oRe c1473400oRe;
        List<C1474520oTS> listLJIIJ;
        ArrayList arrayList = new ArrayList();
        C1470240oMY c1470240oMY = this.LIZ;
        if (c1470240oMY != null && (c1473400oRe = c1470240oMY.LIZJ) != null && (listLJIIJ = c1473400oRe.LJIIJ()) != null && listLJIIJ.size() > 0) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS.LJFF() == 0 || !C1474810oTv.LJJJI()) {
                    SimBitRate simBitRate = new SimBitRate();
                    simBitRate.setBitRate(c1474520oTS.LIZIZ(3));
                    simBitRate.setQualityType(c1474520oTS.LIZIZ(41));
                    simBitRate.setQuality(c1474520oTS.LIZ(18));
                    arrayList.add(new Pair(C2281211EQt.LIZIZ(c1474520oTS.getResolution()), simBitRate));
                }
            }
        }
        if (C1474810oTv.LJJJIL()) {
            Collections.sort(arrayList, new AComparatorS42S0000000_23(0));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1476900oXI
    public final int getDuration() {
        C1470240oMY c1470240oMY = this.LIZ;
        if (c1470240oMY != null) {
            return c1470240oMY.LJIIZILJ(3);
        }
        return 0;
    }

    @Override // X.InterfaceC1476900oXI
    public final String getVideoId() {
        C1473400oRe c1473400oRe;
        C1470240oMY c1470240oMY = this.LIZ;
        if (c1470240oMY == null || (c1473400oRe = c1470240oMY.LIZJ) == null) {
            return null;
        }
        return c1473400oRe.LJIJJ;
    }

    @Override // X.InterfaceC1476900oXI
    public final List<Pair<EnumC2281141EQm, Integer>> LJ() {
        C1473400oRe c1473400oRe;
        List<C1474520oTS> listLJIIJ;
        C1473400oRe c1473400oRe2;
        if (!C1474810oTv.LJIJJLI()) {
            ArrayList arrayList = new ArrayList();
            C1470240oMY c1470240oMY = this.LIZ;
            if (c1470240oMY != null && (c1473400oRe = c1470240oMY.LIZJ) != null && (listLJIIJ = c1473400oRe.LJIIJ()) != null && listLJIIJ.size() > 0) {
                for (C1474520oTS c1474520oTS : listLJIIJ) {
                    if (c1474520oTS.LJFF() == 0 || !C1474810oTv.LJJJI()) {
                        arrayList.add(new Pair(C2281211EQt.LIZIZ(c1474520oTS.getResolution()), Integer.valueOf(c1474520oTS.LIZIZ(3))));
                    }
                }
            }
            if (C1474810oTv.LJJJIL()) {
                Collections.sort(arrayList, new AComparatorS28S0000000_9(2));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        C1470240oMY c1470240oMY2 = this.LIZ;
        C1474520oTS c1474520oTS2 = null;
        if (c1470240oMY2 != null && (c1473400oRe2 = c1470240oMY2.LIZJ) != null) {
            List<C1474520oTS> listLJIIJ2 = c1473400oRe2.LJIIJ();
            List listLJII = c1473400oRe2.LJII();
            if (listLJIIJ2 != null && !listLJIIJ2.isEmpty()) {
                if (listLJII != null && !listLJII.isEmpty()) {
                    c1474520oTS2 = (C1474520oTS) ListProtector.get(listLJII, 0);
                }
                for (C1474520oTS c1474520oTS3 : listLJIIJ2) {
                    if (c1474520oTS3 != null && c1474520oTS3.LJFF() == 0) {
                        int iLIZIZ = c1474520oTS3.LIZIZ(3);
                        if (c1474520oTS2 != null) {
                            iLIZIZ += c1474520oTS2.LIZIZ(3);
                        }
                        arrayList2.add(new Pair(C2281211EQt.LIZIZ(c1474520oTS3.getResolution()), Integer.valueOf(iLIZIZ)));
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1476900oXI
    public final C1470240oMY getTag() {
        return this.LIZ;
    }

    public C1474610oTb(C1470240oMY c1470240oMY) {
        C1473400oRe c1473400oRe;
        this.LIZ = c1470240oMY;
        if (c1470240oMY != null && (c1473400oRe = c1470240oMY.LIZJ) != null && !TextUtils.isEmpty(c1473400oRe.LJIJJ)) {
            List<C1474520oTS> listLJIIJ = c1473400oRe.LJIIJ();
            if (listLJIIJ != null && listLJIIJ.size() > 0) {
                for (C1474520oTS c1474520oTS : listLJIIJ) {
                    C1474670oTh.LIZIZ(c1474520oTS.LJIL, c1473400oRe.LJIJJ, c1474520oTS.LJIILL, c1474520oTS.LJJIIJ, new C1474640oTe(c1474520oTS.getResolution().toString(0)));
                }
            }
            List<C1474520oTS> listLJII = c1473400oRe.LJII();
            if (listLJII != null && listLJII.size() > 0) {
                for (C1474520oTS c1474520oTS2 : listLJII) {
                    C1474670oTh.LIZIZ(c1474520oTS2.LJIL, c1473400oRe.LJIJJ, c1474520oTS2.LJIILL, c1474520oTS2.LJJIIJ, new C1474620oTc(c1474520oTS2.getResolution().toString(1)));
                }
            }
        }
    }

    @Override // X.InterfaceC1476900oXI
    public final Pair<EnumC2281141EQm, String> LIZJ(int i) {
        C1473400oRe c1473400oRe;
        List<C1474520oTS> listLJIIJ;
        Pair<EnumC2281141EQm, String> pair = new Pair<>(EnumC2281141EQm.Undefine, "");
        C1470240oMY c1470240oMY = this.LIZ;
        if (c1470240oMY != null && (c1473400oRe = c1470240oMY.LIZJ) != null && (listLJIIJ = c1473400oRe.LJIIJ()) != null && listLJIIJ.size() > 0) {
            for (C1474520oTS c1474520oTS : listLJIIJ) {
                if (c1474520oTS.LIZIZ(3) == i) {
                    return new Pair<>(C2281211EQt.LIZIZ(c1474520oTS.getResolution()), c1474520oTS.LIZ(18));
                }
            }
        }
        return pair;
    }

    @Override // X.InterfaceC1476900oXI
    public final EnumC2281141EQm LIZLLL(EnumC2281141EQm enumC2281141EQm) {
        return C2281211EQt.LIZIZ(TTVideoEngine.LJJIJL(this.LIZ, C2281211EQt.LIZ(enumC2281141EQm), 1));
    }

    @Override // X.InterfaceC1476900oXI
    public final void LIZ(SimVideoUrlModel simVideoUrlModel, List<SimBitRate> list, List<SimAudioBitrate> list2) {
        if (C1474810oTv.LJLLI()) {
            Map<String, Object> mapLIZJ = C1475930oVj.LIZJ(simVideoUrlModel, list, list2);
            if (mapLIZJ != null && !mapLIZJ.isEmpty()) {
                C1470240oMY c1470240oMY = new C1470240oMY();
                try {
                    c1470240oMY.LJJIJIL(mapLIZJ);
                    this.LIZ = c1470240oMY;
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            }
            return;
        }
        String strLIZIZ = C1475930oVj.LIZIZ(simVideoUrlModel, list, list2);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            C1470240oMY c1470240oMY2 = new C1470240oMY();
            try {
                c1470240oMY2.LJJIJIIJIL(new JSONObject(strLIZIZ));
                this.LIZ = c1470240oMY2;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }
}
