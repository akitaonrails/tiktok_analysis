package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Ny, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1599206Ny {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1054));

    public static int LIZ(String str, C06O1 c06o1) {
        InterfaceC12999056v interfaceC12999056vLIZ;
        InterfaceC12997056t interfaceC12997056t;
        FrequencyMarkRecord frequencyMarkRecordLJ;
        Integer num;
        if (C1570606Cy.LIZ(str)) {
            C1599306Nz c1599306Nz = C1599306Nz.LIZ;
            c1599306Nz.getClass();
            EnumC12995056r enumC12995056rLIZJ = C1599306Nz.LIZJ(c06o1);
            if (enumC12995056rLIZJ != null && (interfaceC12999056vLIZ = c1599306Nz.LIZ(str)) != null && interfaceC12999056vLIZ.LIZJ().contains(enumC12995056rLIZJ) && (interfaceC12997056t = (InterfaceC12997056t) C13LP.LJJJLL(interfaceC12999056vLIZ.LIZ(enumC12995056rLIZJ))) != null && (frequencyMarkRecordLJ = interfaceC12997056t.LJ(C1599306Nz.LIZIZ())) != null && (num = frequencyMarkRecordLJ.count) != null) {
                return num.intValue();
            }
            return 0;
        }
        return LIZJ(str, c06o1);
    }

    public static long LIZIZ(String str, C06O1 c06o1) {
        InterfaceC12999056v interfaceC12999056vLIZ;
        InterfaceC12997056t interfaceC12997056t;
        FrequencyMarkRecord frequencyMarkRecordLJ;
        Long l;
        if (C1570606Cy.LIZ(str)) {
            C1599306Nz c1599306Nz = C1599306Nz.LIZ;
            c1599306Nz.getClass();
            EnumC12995056r enumC12995056rLIZJ = C1599306Nz.LIZJ(c06o1);
            if (enumC12995056rLIZJ == null || (interfaceC12999056vLIZ = c1599306Nz.LIZ(str)) == null || !interfaceC12999056vLIZ.LIZJ().contains(enumC12995056rLIZJ) || (interfaceC12997056t = (InterfaceC12997056t) C13LP.LJJJLL(interfaceC12999056vLIZ.LIZ(enumC12995056rLIZJ))) == null || (frequencyMarkRecordLJ = interfaceC12997056t.LJ(C1599306Nz.LIZIZ())) == null || (l = frequencyMarkRecordLJ.lastShowTimeMs) == null) {
                return 0L;
            }
            long jLongValue = l.longValue();
            if (jLongValue <= 0) {
                return 0L;
            }
            return jLongValue / 1000;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(c06o1);
        sbLIZ.append("_time");
        return ((Keva) LIZ.getValue()).getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static int LIZJ(String str, C06O1 c06o1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(c06o1);
        sbLIZ.append("_count");
        return ((Keva) LIZ.getValue()).getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
    }

    public static void LIZLLL(String str, C06O1 c06o1) {
        EnumC12995056r enumC12995056r;
        InterfaceC12999056v interfaceC12999056vLIZ;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        if (C1570606Cy.LIZ(str)) {
            C1599306Nz c1599306Nz = C1599306Nz.LIZ;
            c1599306Nz.getClass();
            int i = C06O0.LIZIZ[c06o1.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    enumC12995056r = EnumC12995056r.CLICK;
                } else {
                    throw new C1954807lC();
                }
            } else {
                enumC12995056r = EnumC12995056r.SHOW;
            }
            if (enumC12995056r != null && (interfaceC12999056vLIZ = c1599306Nz.LIZ(str)) != null) {
                String strLIZIZ = C1599306Nz.LIZIZ();
                IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi != null) {
                    jCurrentTimeMillis = iMHostApi.LIZIZ();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                if (iMHostApi2 != null) {
                    jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                } else {
                    jCurrentTimeMillis2 = System.currentTimeMillis();
                }
                interfaceC12999056vLIZ.LJ(enumC12995056r, strLIZIZ, jCurrentTimeMillis, jCurrentTimeMillis2);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(c06o1);
        sbLIZ.append("_count");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        C01GW c01gw = LIZ;
        ((Keva) c01gw.getValue()).storeInt(strLIZIZ2, LIZJ(str, c06o1) + 1);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append('_');
        sbLIZ2.append(c06o1);
        sbLIZ2.append("_time");
        ((Keva) c01gw.getValue()).storeLong(C2188811AlT.LIZIZ(sbLIZ2), System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
