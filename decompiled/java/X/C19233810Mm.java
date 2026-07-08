package X;

import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19233810Mm {
    public static final C19233810Mm LIZ = new C19233810Mm();
    public static Map<String, C10QI> LIZIZ = new LinkedHashMap();

    public static boolean LIZIZ() {
        Integer numLIZIZ;
        C19233110Mf c19233110Mf = new C19233110Mf();
        C10MU.LIZ.getClass();
        if (c19233110Mf.LIZ("need_force_use_local_config", ((Number) C10MU.LIZIZ.getValue()).intValue() > 0) || c19233110Mf.LIZ("need_force_use_local_config", false)) {
            C1911410zq7.LIZ("ConsistencyManager", "force use local config");
            return true;
        }
        if (c19233110Mf.LIZ("need_force_cover_nuj_config", false)) {
            C1911410zq7.LIZ("ConsistencyManager", "force use server config");
            return false;
        }
        IHybridABInfoService iHybridABInfoService = (IHybridABInfoService) PluggableExtentionKt.pluggableSpi$default(IHybridABInfoService.class, false, false, false, 14, null);
        return iHybridABInfoService == null || (numLIZIZ = iHybridABInfoService.LIZIZ()) == null || numLIZIZ.intValue() != 1;
    }

    public static C10QI LIZ(Class cls) {
        C10QI c10n4 = (C10QI) ((LinkedHashMap) LIZIZ).get(cls.getName());
        if (c10n4 == null) {
            boolean zLIZIZ = LIZIZ();
            if (Intrinsics.LJFF(cls, C19233310Mh.class)) {
                c10n4 = new C19233310Mh(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10MR.class)) {
                c10n4 = new C10MR(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N5.class)) {
                c10n4 = new C10N5(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234110Mp.class)) {
                c10n4 = new C19234110Mp(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19233910Mn.class)) {
                c10n4 = new C19233910Mn(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10HH.class)) {
                c10n4 = new C10HH(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234010Mo.class)) {
                c10n4 = new C19234010Mo(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19233710Ml.class)) {
                c10n4 = new C19233710Ml(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234210Mq.class)) {
                c10n4 = new C19234210Mq(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234310Mr.class)) {
                c10n4 = new C19234310Mr(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234810Mw.class)) {
                c10n4 = new C19234810Mw(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234510Mt.class)) {
                c10n4 = new C19234510Mt(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234410Ms.class)) {
                c10n4 = new C19234410Ms(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234710Mv.class)) {
                c10n4 = new C19234710Mv(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234910Mx.class)) {
                c10n4 = new C19234910Mx(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19235010My.class)) {
                c10n4 = new C19235010My(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19235110Mz.class)) {
                c10n4 = new C19235110Mz(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N0.class)) {
                c10n4 = new C10N0(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N1.class)) {
                c10n4 = new C10N1(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C19234610Mu.class)) {
                c10n4 = new C19234610Mu(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N2.class)) {
                c10n4 = new C10N2(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N3.class)) {
                c10n4 = new C10N3(zLIZIZ);
            } else if (Intrinsics.LJFF(cls, C10N4.class)) {
                c10n4 = new C10N4(zLIZIZ);
            } else {
                C1955907lN c1955907lN = C1955907lN.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NUJPageStrategyConsistencyManager not support class ");
                sbLIZ.append(cls);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1955907lN.getClass();
                C844470XAv.LIZ.getClass();
                if (!Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                    c10n4 = null;
                } else {
                    throw new RuntimeException(strLIZIZ);
                }
            }
            if (!(c10n4 instanceof C10QI)) {
                return null;
            }
            if (c10n4 != null) {
                LIZIZ.put(cls.getName(), c10n4);
            }
        }
        return c10n4;
    }
}
