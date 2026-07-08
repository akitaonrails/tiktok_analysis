package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponentDisplayStrategy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0lFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350520lFS {
    public static final Map<String, InterfaceC1350540lFU> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        Integer numValueOf = Integer.valueOf(EnumC766410U4p.ACTIVITY.getValue());
        InterfaceC1350540lFU interfaceC1350540lFU = new InterfaceC1350540lFU() { // from class: X.05Fz
            public final Set<Long> LIZ = new LinkedHashSet();
            public final Keva LIZIZ = Keva.getRepo("comment_top_bar_activity");

            @Override // X.InterfaceC1350540lFU
            public final void LIZ(String str) {
                Long lLJIILIIL;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    lLJIILIIL.longValue();
                    ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
                }
            }

            @Override // X.InterfaceC1350540lFU
            public final void LIZJ(String str) {
                Long lLJIILIIL;
                if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                    String strLIZLLL = LIZLLL(lLJIILIIL.longValue(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), "");
                    this.LIZIZ.storeInt(strLIZLLL, this.LIZIZ.getInt(strLIZLLL, 0) + 1);
                }
            }

            @Override // X.InterfaceC1350540lFU
            public final boolean LIZIZ(String str, CommentTopBarComponentDisplayStrategy commentTopBarComponentDisplayStrategy) {
                Long lLJIILIIL;
                if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
                    return false;
                }
                long jLongValue = lLJIILIIL.longValue();
                if (commentTopBarComponentDisplayStrategy == null || this.LIZ.contains(Long.valueOf(jLongValue))) {
                    return true;
                }
                int i = this.LIZIZ.getInt(LIZLLL(jLongValue, ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), ""), 0);
                Long l = commentTopBarComponentDisplayStrategy.exposures;
                if (l != null) {
                    long jLongValue2 = l.longValue();
                    if (jLongValue2 != 0 && i >= jLongValue2) {
                        return false;
                    }
                }
                this.LIZ.add(Long.valueOf(jLongValue));
                return true;
            }

            public static String LIZLLL(long j, String str, String str2) {
                boolean z;
                if (str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(j);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append('_');
                sbLIZ2.append(j);
                sbLIZ2.append('_');
                sbLIZ2.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        };
        String strLIZ = LIZ(numValueOf, "comment_activity");
        if (strLIZ != null) {
            linkedHashMap.put(strLIZ, interfaceC1350540lFU);
        }
    }

    public static void LIZIZ(CommentTopBarComponent commentTopBarComponent) {
        Map<String, InterfaceC1350540lFU> map = LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        InterfaceC1350540lFU interfaceC1350540lFU = (InterfaceC1350540lFU) linkedHashMap.get(LIZ(commentTopBarComponent.bizType, commentTopBarComponent.name));
        if (interfaceC1350540lFU != null) {
            interfaceC1350540lFU.LIZ(commentTopBarComponent.bizId);
        }
    }

    public static String LIZ(Integer num, String str) {
        if (num == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(num);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
