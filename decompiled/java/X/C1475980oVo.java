package X;

import Y.AObjectS163S0000000_23;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1475980oVo {
    public static final ConcurrentHashMap<String, InterfaceC1476060oVw> LIZ = new ConcurrentHashMap<>();
    public static Function2<? super String, ? super Long, ? extends InterfaceC1476030oVt> LIZIZ = new AObjectS163S0000000_23(2);

    public static InterfaceC1476030oVt LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        C1474680oTi c1474680oTi;
        List<C1474690oTj> listLLIIII;
        if (!simVideoUrlModel.hasVideoModel()) {
            InterfaceC1476030oVt interfaceC1476030oVtLIZ = LIZ(simVideoUrlModel, EnumC1476080oVy.FromMemory);
            if (!Intrinsics.LJFF(interfaceC1476030oVtLIZ, C1476040oVu.LIZ)) {
                LIZIZ.invoke(interfaceC1476030oVtLIZ.key(), Long.valueOf(interfaceC1476030oVtLIZ.LIZLLL()));
            } else {
                List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
                if (bitRate != null) {
                    for (SimBitRate simBitRate : bitRate) {
                        if (simBitRate.getUrlKey() != null && LIZIZ.invoke(simBitRate.getUrlKey(), Long.valueOf(simBitRate.getSize())).LIZJ() > 0) {
                            break;
                        }
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC1476060oVw> concurrentHashMap = LIZ;
            String strLJ = LJ(simVideoUrlModel);
            if (concurrentHashMap.get(strLJ) == null) {
                LJ(simVideoUrlModel);
                concurrentHashMap.putIfAbsent(strLJ, new C1476010oVr());
            }
        } else {
            InterfaceC1476030oVt interfaceC1476030oVtLIZ2 = LIZ(simVideoUrlModel, EnumC1476080oVy.FromMemory);
            if (!Intrinsics.LJFF(interfaceC1476030oVtLIZ2, C1476040oVu.LIZ)) {
                Iterator<InterfaceC1476030oVt> it2 = interfaceC1476030oVtLIZ2.LIZ().iterator();
                while (it2.hasNext()) {
                    LIZIZ.invoke(it2.next().key(), Long.valueOf(interfaceC1476030oVtLIZ2.LIZLLL()));
                }
            } else {
                String originUri = simVideoUrlModel.getOriginUri();
                if (originUri != null && (c1474680oTi = C1474670oTh.LIZIZ.get(originUri)) != null && (listLLIIII = C13LP.LLIIII(c1474680oTi.LIZ.values())) != null) {
                    for (C1474690oTj c1474690oTj : listLLIIII) {
                        LIZIZ.invoke(c1474690oTj.LIZ, Long.valueOf(c1474690oTj.LIZJ));
                    }
                }
            }
            ConcurrentHashMap<String, InterfaceC1476060oVw> concurrentHashMap2 = LIZ;
            String strLJ2 = LJ(simVideoUrlModel);
            if (concurrentHashMap2.get(strLJ2) != null || concurrentHashMap2.putIfAbsent(strLJ2, new C1475990oVp(LJ(simVideoUrlModel))) == null) {
            }
        }
        return LIZJ(simVideoUrlModel);
    }

    public static InterfaceC1476030oVt LIZJ(SimVideoUrlModel simVideoUrlModel) {
        InterfaceC1476060oVw interfaceC1476060oVw = LIZ.get(LJ(simVideoUrlModel));
        if (interfaceC1476060oVw == null) {
            return C1476040oVu.LIZ;
        }
        return interfaceC1476060oVw;
    }

    public static String LIZLLL(String str) {
        String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"_"}, 0, 6).toArray(new String[0]);
        if (strArr.length > 1) {
            return strArr[0];
        }
        return str;
    }

    public static String LJ(SimVideoUrlModel simVideoUrlModel) {
        String originUri = simVideoUrlModel.getOriginUri();
        if (originUri == null) {
            String dashVideoId = simVideoUrlModel.getDashVideoId();
            if (dashVideoId == null) {
                String urlKey = simVideoUrlModel.getUrlKey();
                if (urlKey == null) {
                    urlKey = "";
                }
                return LIZLLL(urlKey);
            }
            return dashVideoId;
        }
        return originUri;
    }

    public static InterfaceC1476030oVt LIZ(SimVideoUrlModel simVideoUrlModel, EnumC1476080oVy enumC1476080oVy) {
        if (simVideoUrlModel == null) {
            return C1476040oVu.LIZ;
        }
        int i = C1476020oVs.LIZ[enumC1476080oVy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    InterfaceC1476030oVt interfaceC1476030oVtLIZJ = LIZJ(simVideoUrlModel);
                    if (Intrinsics.LJFF(interfaceC1476030oVtLIZJ, C1476040oVu.LIZ)) {
                        return LIZIZ(simVideoUrlModel);
                    }
                    return interfaceC1476030oVtLIZJ;
                }
                throw new C1954807lC();
            }
            return LIZIZ(simVideoUrlModel);
        }
        return LIZJ(simVideoUrlModel);
    }

    public static void LJFF(long j, long j2, String str) {
        InterfaceC1476060oVw interfaceC1476060oVw;
        InterfaceC1476060oVw interfaceC1476060oVwPutIfAbsent;
        InterfaceC1476060oVw interfaceC1476060oVwPutIfAbsent2;
        if (j2 > 0 && j > 0 && str != null) {
            String str2 = C1474670oTh.LIZ.get(str);
            if (str2 != null) {
                ConcurrentHashMap<String, InterfaceC1476060oVw> concurrentHashMap = LIZ;
                InterfaceC1476060oVw c1475990oVp = concurrentHashMap.get(str2);
                if (c1475990oVp == null && (interfaceC1476060oVwPutIfAbsent2 = concurrentHashMap.putIfAbsent(str2, (c1475990oVp = new C1475990oVp(str2)))) != null) {
                    c1475990oVp = interfaceC1476060oVwPutIfAbsent2;
                }
                interfaceC1476060oVw = c1475990oVp;
            } else {
                String strLIZLLL = LIZLLL(str);
                ConcurrentHashMap<String, InterfaceC1476060oVw> concurrentHashMap2 = LIZ;
                InterfaceC1476060oVw c1476010oVr = concurrentHashMap2.get(strLIZLLL);
                if (c1476010oVr == null && (interfaceC1476060oVwPutIfAbsent = concurrentHashMap2.putIfAbsent(strLIZLLL, (c1476010oVr = new C1476010oVr()))) != null) {
                    c1476010oVr = interfaceC1476060oVwPutIfAbsent;
                }
                interfaceC1476060oVw = c1476010oVr;
            }
            interfaceC1476060oVw.LIZIZ(j, j2, str);
        }
    }
}
