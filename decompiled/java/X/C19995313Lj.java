package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.BaseInfo;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13Lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19995313Lj {
    public final C13RD LIZ;
    public final ConcurrentHashMap<String, List<C13MA<String>>> LIZIZ = new ConcurrentHashMap<>();

    public C19995313Lj(C13RD c13rd) {
        Set<String> setLIZJ;
        String strLJJZ;
        int iHashCode;
        this.LIZ = c13rd;
        String str = c13rd.LJJIJL;
        if (!C13SB.LJ(str)) {
            C13SB.LJIIJ(str);
        }
        if (C19996613Lw.LIZ(str) == null) {
            String str2 = c13rd.LIZIZ;
            if (str2 != null) {
                iHashCode = str2.hashCode();
            } else {
                iHashCode = 0;
            }
            C19996613Lw.LIZ.put(str, new C13LJ(c13rd, str, iHashCode, c13rd.LJJIJLIJ));
        }
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(str);
        if (interfaceC20004513OxLIZ != null && (setLIZJ = interfaceC20004513OxLIZ.LIZJ()) != null) {
            for (String str3 : setLIZJ) {
                String strLIZLLL = C19995213Li.LIZLLL(str3);
                String str4 = "";
                Integer numLJIIJJI = null;
                if (C19995213Li.LJFF(str3)) {
                    String strLIZIZ = C19995213Li.LIZIZ(str3);
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJL(C19995213Li.LJIIIZ(str3), e3.d, C19995213Li.LJIIIZ(str3)), new String[]{"_"}, 0, 6);
                    if (listLJJLIIIJILLIZJL.size() > 2 && Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 0), "asset")) {
                        numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                    }
                    if (strLIZIZ.length() > 0) {
                        C13LI.LIZJ("", numLJIIJJI, strLIZIZ, true, strLIZLLL);
                    }
                } else {
                    if (C19995213Li.LJFF(str3)) {
                        strLJJZ = C19995213Li.LIZIZ(str3);
                    } else {
                        Pair pairLJIIIIZZ = C19995213Li.LJIIIIZZ(str3);
                        List list = (List) pairLJIIIIZZ.getFirst();
                        int iIntValue = ((Number) pairLJIIIIZZ.getSecond()).intValue();
                        if (iIntValue > 0) {
                            strLJJZ = C13LP.LJJLIIIJ(list.subList(0, iIntValue), "_", null, null, 0, null, null, 62);
                        } else {
                            strLJJZ = a0.LJJZ(str3, "_", str3);
                        }
                    }
                    String str5 = str4;
                    if (!C19995213Li.LJFF(str3)) {
                        Pair pairLJIIIIZZ2 = C19995213Li.LJIIIIZZ(str3);
                        List list2 = (List) pairLJIIIIZZ2.getFirst();
                        int iIntValue2 = ((Number) pairLJIIIIZZ2.getSecond()).intValue();
                        if (iIntValue2 >= 0) {
                            str5 = (String) ListProtector.get(list2, iIntValue2);
                        } else {
                            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str3, new String[]{"_"}, 0, 6);
                            str5 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL((String) (1 < listLJJLIIIJILLIZJL2.size() ? ListProtector.get(listLJJLIIIJILLIZJL2, 1) : str4), new String[]{e3.d}, 0, 6), 0);
                        }
                    }
                    if (strLJJZ.length() > 0 && str5.length() > 0) {
                        C13LI.LIZJ(str5, null, strLJJZ, false, strLIZLLL);
                    }
                }
            }
        }
    }

    public static String LIZJ(String str) {
        String strLJJLJLI = a0.LJJLJLI(str, "_", "");
        if (strLJJLJLI.length() > 0) {
            return C19995213Li.LJI(str, strLJJLJLI);
        }
        return str;
    }

    public final String LIZ(MaterialResource materialResource, C13MA<String> c13ma) {
        boolean z;
        String first;
        boolean z2;
        String ext;
        String strLIZ = C1528550psb.LIZ();
        String resourceKey = materialResource.getResourceKey();
        if (resourceKey != null && resourceKey.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String uri = materialResource.getUri();
            String resourceKey2 = materialResource.getResourceKey();
            BaseInfo baseInfo = materialResource.getBaseInfo();
            if (baseInfo == null || (ext = baseInfo.getExt()) == null) {
                ext = "";
            }
            C13LI.LIZJ(uri, materialResource.getAssetType(), resourceKey2, materialResource.isAssetMaterial(), ext);
        }
        Pair<String, Boolean> pairLIZIZ = LIZIZ(materialResource.getResourceKey(), materialResource.getUri());
        if (pairLIZIZ != null) {
            first = pairLIZIZ.getFirst();
        } else {
            first = null;
        }
        if (first != null && first.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && C13SB.LJ(first)) {
            if (c13ma != null) {
                c13ma.onSuccess(first);
            }
            return strLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(materialResource.getResourceKey());
        sbLIZ.append('_');
        sbLIZ.append(materialResource.getUri());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        synchronized (this.LIZIZ) {
            try {
                List<C13MA<String>> list = this.LIZIZ.get(strLIZIZ);
                if (list != null) {
                    C13SS c13ss = C13SS.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("downloadMaterialResource deduplicate mapKey=");
                    sbLIZ2.append(strLIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c13ss.getClass();
                    C13SS.LIZ("MaterialResRepo", strLIZIZ2);
                    list.add(c13ma);
                    return strLIZ;
                }
                this.LIZIZ.put(strLIZIZ, C1697810uHb.LJIILJJIL(c13ma));
                this.LIZ.LJJJIL.LIZIZ(strLIZ, new C13MA<String>() { // from class: X.13Lk
                    @Override // X.C13MA
                    public final void onSuccess(String str) {
                        List<C13MA<String>> listRemove;
                        C19995313Lj c19995313Lj = this.LIZ;
                        ConcurrentHashMap<String, List<C13MA<String>>> concurrentHashMap = c19995313Lj.LIZIZ;
                        String str2 = strLIZIZ;
                        synchronized (concurrentHashMap) {
                            try {
                                listRemove = c19995313Lj.LIZIZ.remove(str2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (listRemove != null) {
                            for (C13MA<String> c13ma2 : listRemove) {
                                if (c13ma2 != null) {
                                    c13ma2.onSuccess(str);
                                }
                            }
                        }
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void preProcess(String str) {
                    }

                    @Override // X.C13MA
                    public final void onFail(String str, C1662010tLr c1662010tLr) {
                        List<C13MA<String>> listRemove;
                        C19995313Lj c19995313Lj = this.LIZ;
                        ConcurrentHashMap<String, List<C13MA<String>>> concurrentHashMap = c19995313Lj.LIZIZ;
                        String str2 = strLIZIZ;
                        synchronized (concurrentHashMap) {
                            try {
                                listRemove = c19995313Lj.LIZIZ.remove(str2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (listRemove != null) {
                            for (C13MA<String> c13ma2 : listRemove) {
                                if (c13ma2 != null) {
                                    c13ma2.onFail(str, c1662010tLr);
                                }
                            }
                        }
                    }
                });
                C19995713Ln c19995713Ln = new C19995713Ln(materialResource, this.LIZ, strLIZ);
                C20001113Np c20001113Np = this.LIZ.LJJIIJ;
                if (c20001113Np != null) {
                    c20001113Np.LIZIZ(c19995713Ln);
                }
                return strLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> LIZIZ(java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19995313Lj.LIZIZ(java.lang.String, java.lang.String):kotlin.Pair");
    }
}
