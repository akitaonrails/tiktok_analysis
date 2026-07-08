package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z1p.e;

/* JADX INFO: renamed from: X.13Ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20005513Ph {
    public static C20005513Ph LJI;
    public final C13RD LIZ;
    public final C20005913Pl LIZIZ;
    public C13NP LIZJ;
    public final C20006313Pp LIZLLL;
    public final C20008613Qm LJ;
    public e LJFF;

    public final C13NP LIZJ() {
        C13NP c13np = this.LIZJ;
        if (c13np != null) {
            return c13np;
        }
        C13NP c13np2 = new C13NP(this.LIZ, this.LIZIZ, this.LJ, this.LIZLLL);
        this.LIZJ = c13np2;
        return c13np2;
    }

    public final e LIZLLL() {
        e eVar = this.LJFF;
        if (eVar != null) {
            return eVar;
        }
        C20006313Pp c20006313Pp = this.LIZLLL;
        C20008613Qm c20008613Qm = this.LJ;
        this.LIZ.getClass();
        e eVar2 = new e(c20006313Pp, c20008613Qm, null);
        this.LJFF = eVar2;
        return eVar2;
    }

    public C20005513Ph(C13RD c13rd) {
        this.LIZ = c13rd;
        C20008613Qm c20008613Qm = new C20008613Qm(c13rd.LJJIIZI, c13rd.LJJIJIIJI, c13rd.LJJJJJL);
        this.LJ = c20008613Qm;
        if (C20005913Pl.LJIIIZ == null) {
            C20005913Pl.LJIIIZ = new C20005913Pl(c13rd);
        }
        this.LIZIZ = C13QA.LIZ();
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(c13rd.LJJIJIL);
        if (interfaceC20004513OxLIZ != null && (interfaceC20004513OxLIZ instanceof C20006313Pp)) {
            this.LIZLLL = (C20006313Pp) interfaceC20004513OxLIZ;
            return;
        }
        String str = c13rd.LJJIJIL;
        String str2 = c13rd.LIZIZ;
        C20006313Pp c20006313Pp = new C20006313Pp(c13rd, str, str2 != null ? str2.hashCode() : 0, c20008613Qm);
        this.LIZLLL = c20006313Pp;
        C19996613Lw.LIZ.put(c13rd.LJJIJIL, c20006313Pp);
    }

    public static void LJ(List list) {
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        if (((Boolean) C282430B5d.LIZ.getValue()).booleanValue() && (!list.isEmpty()) && (iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null)) != null) {
            iCKResourceVEPluginStatusService.LIZ();
        }
    }

    public final boolean LIZ(Effect effect) {
        boolean zLIZIZ;
        if (C19996913Lz.LIZJ(effect)) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decrypt error effect: ");
            sbLIZ.append(effect.getEffect_id());
            sbLIZ.append(", name: ");
            sbLIZ.append(effect.getName());
            sbLIZ.append(", requirements_sec: ");
            sbLIZ.append(effect.getRequirements_sec());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("AlgorithmRepository", strLIZIZ, null);
            return false;
        }
        String[] strArrLIZIZ = C19996913Lz.LIZIZ(effect, this.LIZ.LJIJI);
        if (strArrLIZIZ != null && strArrLIZIZ.length != 0) {
            C089E c089e = new C089E(strArrLIZIZ);
            while (c089e.hasNext()) {
                String str = (String) c089e.next();
                if (C13P7.LIZJ.LIZIZ()) {
                    String strLIZLLL = C20006413Pq.LIZLLL(str);
                    if (EnumC818700W9s.ANDROID != EnumC818700W9s.PC && strLIZLLL != null) {
                        C2278408wI c2278408wI = C13P7.LIZ;
                        c2278408wI.LIZ();
                        try {
                            C13QH c13qh = (C13QH) ((LinkedHashMap) C13P7.LIZIZ).get(strLIZLLL);
                            c2278408wI.LIZIZ();
                            if (c13qh == null) {
                                C13SS c13ss2 = C13SS.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("model: ");
                                sbLIZ2.append(strLIZLLL);
                                sbLIZ2.append(" not in cache!");
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                c13ss2.getClass();
                                C13SS.LIZIZ("AlgorithmModelInfoMemoryCache", strLIZIZ2, null);
                            } else {
                                C20006813Pu c20006813Pu = c13qh.LIZ;
                                ModelInfo modelInfo = c13qh.LIZIZ;
                                if (!Intrinsics.LJFF(c20006813Pu.LIZLLL(), modelInfo.getVersion())) {
                                    C13SS c13ss3 = C13SS.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("model: ");
                                    sbLIZ3.append(strLIZLLL);
                                    sbLIZ3.append(" version not match. local version: ");
                                    sbLIZ3.append(c20006813Pu.LIZLLL());
                                    sbLIZ3.append(", server version: ");
                                    sbLIZ3.append(modelInfo.getVersion());
                                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                                    c13ss3.getClass();
                                    C13SS.LIZIZ("AlgorithmModelInfoMemoryCache", strLIZIZ3, null);
                                } else if (c20006813Pu.LJFF) {
                                    continue;
                                } else if (c20006813Pu.LIZJ() != modelInfo.getType()) {
                                    C13SS c13ss4 = C13SS.LIZ;
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("model: ");
                                    sbLIZ4.append(strLIZLLL);
                                    sbLIZ4.append(" size not match. local size: ");
                                    sbLIZ4.append(c20006813Pu.LIZJ());
                                    sbLIZ4.append(", server size: ");
                                    sbLIZ4.append(modelInfo.getType());
                                    String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
                                    c13ss4.getClass();
                                    C13SS.LIZIZ("AlgorithmModelInfoMemoryCache", strLIZIZ4, null);
                                } else if (Intrinsics.LJFF(c20006813Pu.LIZ(), modelInfo.getMD5())) {
                                    continue;
                                } else {
                                    C13SS c13ss5 = C13SS.LIZ;
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("model: ");
                                    sbLIZ5.append(strLIZLLL);
                                    sbLIZ5.append(" md5 not match. local md5: ");
                                    sbLIZ5.append(c20006813Pu.LIZ());
                                    sbLIZ5.append(", server md5: ");
                                    sbLIZ5.append(modelInfo.getMD5());
                                    String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
                                    c13ss5.getClass();
                                    C13SS.LIZIZ("AlgorithmModelInfoMemoryCache", strLIZIZ5, null);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c2278408wI.LIZIZ();
                            throw th;
                        }
                    }
                    zLIZIZ = LIZIZ(str);
                } else {
                    zLIZIZ = LIZIZ(str);
                }
                if (!zLIZIZ) {
                    return false;
                }
            }
            return true;
        }
        C13SS c13ss6 = C13SS.LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("effect: ");
        sbLIZ6.append(effect.getEffect_id());
        sbLIZ6.append(", name: ");
        sbLIZ6.append(effect.getName());
        sbLIZ6.append(" returned empty resourceNameArrayOfEffect");
        String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ6);
        c13ss6.getClass();
        C13SS.LIZ("AlgorithmRepository", strLIZIZ6);
        return true;
    }

    public final boolean LIZIZ(String str) {
        boolean zIsResourceAvailable = LIZLLL().isResourceAvailable(str);
        try {
            Collection collectionLIZIZ = C13NP.LIZIZ(LIZJ(), new String[]{str});
            if (collectionLIZIZ != null) {
                if (collectionLIZIZ.isEmpty()) {
                    return zIsResourceAvailable;
                }
            } else {
                return zIsResourceAvailable;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }
}
