package X;

import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.09ET, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09ET {
    public static final Gson LIZ = new Gson();
    public static volatile boolean LIZIZ = false;

    public static void LIZ() {
        try {
            if (LIZIZ) {
                return;
            }
            LIZIZ((h) SettingsManager.LIZLLL().LJIIIIZZ("safe_cushion_config", h.class, null));
            LIZIZ = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(h hVar) {
        String[] strArrSplit;
        if (hVar == null) {
            return;
        }
        PrintStream printStream = System.out;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("safe air cushion config:");
        sbLIZ.append(hVar);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        C09EU.LIZIZ = true;
        C09EU.LIZ = true;
        C09EU.LIZJ = new C09EY() { // from class: X.09EX
            @Override // X.C09EY
            public final void LIZ() {
            }

            @Override // X.C09EY
            public final void LIZJ() {
            }

            @Override // X.C09EY
            public final void LIZLLL() {
            }

            @Override // X.C09EY
            public final void LJ() {
            }

            @Override // X.C09EY
            public final void LIZIZ(Throwable th) {
                C805380Via.LJFF("AIR_CUSHION_UNPROTECT", "AIR_CUSHION_UNPROTECT", th);
            }

            @Override // X.C09EY
            public final void LJI(Throwable th) {
                C805380Via.LJFF("AIR_CUSHION_PROTECTED", "AIR_CUSHION_PROTECTED", th);
            }

            @Override // X.C09EY
            public final void LJFF(Throwable th, Map map) {
                C805380Via.LIZLLL(th, "safe_protector_internal_exception", map);
            }
        };
        C09EU.LIZJ.LIZLLL();
        C09EQ c09eq = C09EQ.LIZIZ;
        c09eq.getClass();
        if (hVar.size() == 0) {
            ((CopyOnWriteArrayList) c09eq.LIZ).clear();
        } else {
            ((CopyOnWriteArrayList) c09eq.LIZ).clear();
            for (k kVar : hVar) {
                if (kVar != null) {
                    kVar.LJIILIIL();
                    C09ES c09es = new C09ES();
                    try {
                        if (kVar.LJIILIIL().LJJIJIIJIL("stackFeatures")) {
                            String strLJIL = kVar.LJIILIIL().LJJIIZ("stackFeatures").LJIL();
                            if (strLJIL != null) {
                                strArrSplit = strLJIL.split("\n");
                            } else {
                                strArrSplit = new String[0];
                            }
                            c09es.LIZ = strArrSplit;
                            if (kVar.LJIILIIL().LJJIJIIJIL("protectorType")) {
                                c09es.LIZIZ = kVar.LJIILIIL().LJJIIZ("protectorType").LJIL();
                                if (kVar.LJIILIIL().LJJIJIIJIL("returnType")) {
                                    c09es.LIZJ = kVar.LJIILIIL().LJJIIZ("returnType").LJIL();
                                    if (kVar.LJIILIIL().LJJIJIIJIL("returnValue")) {
                                        c09es.LIZLLL = kVar.LJIILIIL().LJJIIZ("returnValue");
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("create ConfItem ");
                                        sbLIZ2.append(c09es.toString());
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        C09EU.LIZJ.LJ();
                                        ((CopyOnWriteArrayList) c09eq.LIZ).add(c09es);
                                    } else {
                                        C09EZ.LIZ(C786410Ut5.j4("ConfItem can't find key %s in %s", new Object[]{"returnValue", kVar.toString()}));
                                    }
                                } else {
                                    C09EZ.LIZ(C786410Ut5.j4("ConfItem can't find key %s in %s", new Object[]{"returnType", kVar.toString()}));
                                }
                            } else {
                                C09EZ.LIZ(C786410Ut5.j4("ConfItem can't find key %s in %s", new Object[]{"protectorType", kVar.toString()}));
                            }
                        } else {
                            C09EZ.LIZ(C786410Ut5.j4("ConfItem can't find key %s in %s", new Object[]{"stackFeatures", kVar.toString()}));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("create ConfItem has exception ");
                        sbLIZ3.append(e.toString());
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C09EU.LIZJ.LJ();
                    }
                }
            }
        }
        KevaImpl.getRepo("safe_protector_config_repo", 1).storeString("safe_protector_config_key", hVar.toString());
        Npth.addAttachUserData(new AttachUserData() { // from class: X.09EV
            @Override // com.bytedance.crash.AttachUserData
            public final Map getUserData(CrashType crashType) {
                HashMap map = new HashMap();
                map.put("Protector/SelfData", SelfDataManager.LJ.LIZJ(null).toString());
                return map;
            }
        }, CrashType.ALL);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("SafeCushionSettings: ");
        sbLIZ4.append(hVar.toString());
        C2188811AlT.LIZIZ(sbLIZ4);
    }
}
