package X;

import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699180Rbg {
    public static final C699180Rbg LIZ = new C699180Rbg();

    public static void LIZ(Function0 function0, String str, RuleHitState ruleHitState) {
        String strLJLI;
        String str2;
        String str3;
        InterfaceC699200Rbi interfaceC699200Rbi;
        List<String> listSingletonList;
        InterfaceC699200Rbi interfaceC699200Rbi2;
        List<String> listSingletonList2;
        InterfaceC699200Rbi interfaceC699200Rbi3;
        List<String> listSingletonList3;
        List<String> list;
        InterfaceC699200Rbi interfaceC699200Rbi4;
        InterfaceC700020Rd2 interfaceC700020Rd2LIZ;
        String strLJJLIIIJ = null;
        if (function0 != null && (interfaceC699200Rbi4 = (InterfaceC699200Rbi) function0.invoke()) != null && (interfaceC700020Rd2LIZ = interfaceC699200Rbi4.LIZ()) != null) {
            strLJLI = interfaceC700020Rd2LIZ.LJLI();
        } else {
            strLJLI = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        EnumC699110RbZ enumC699110RbZ = EnumC699110RbZ.OUTREACH_ENABLE;
        C0RZ2 c0rz2 = C0RZ2.FAILED;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Outreach filter failed! ruleId: ");
        if (ruleHitState != null && (list = ruleHitState.hitRuleIds) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        }
        sbLIZ.append(strLJJLIIIJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C697890RZb.LIZIZ(strLJLI, str2, enumC699110RbZ, c0rz2);
        if (ruleHitState != null && (str3 = ruleHitState.ruleStrategy) != null) {
            int iHashCode = str3.hashCode();
            if (iHashCode != -1099392764) {
                if (iHashCode != -70023844) {
                    if (iHashCode == 3127582 && str3.equals("exit") && function0 != null && (interfaceC699200Rbi3 = (InterfaceC699200Rbi) function0.invoke()) != null) {
                        EnumC699120Rba enumC699120Rba = EnumC699120Rba.GLOBAL;
                        EnumC699150Rbd enumC699150Rbd = EnumC699150Rbd.EXIT_FILTER;
                        if (str == null || (listSingletonList3 = Collections.singletonList(str)) == null) {
                            listSingletonList3 = C13BV.INSTANCE;
                        }
                        interfaceC699200Rbi3.LIZIZ(enumC699120Rba, enumC699150Rbd, listSingletonList3);
                        return;
                    }
                    return;
                }
                if (!str3.equals("frequency") || function0 == null || (interfaceC699200Rbi2 = (InterfaceC699200Rbi) function0.invoke()) == null) {
                    return;
                }
                EnumC699120Rba enumC699120Rba2 = EnumC699120Rba.GLOBAL;
                EnumC699150Rbd enumC699150Rbd2 = EnumC699150Rbd.FREQUENCY_FILTER;
                if (str == null || (listSingletonList2 = Collections.singletonList(str)) == null) {
                    listSingletonList2 = C13BV.INSTANCE;
                }
                interfaceC699200Rbi2.LIZIZ(enumC699120Rba2, enumC699150Rbd2, listSingletonList2);
                return;
            }
            if (!str3.equals("dispersion") || function0 == null || (interfaceC699200Rbi = (InterfaceC699200Rbi) function0.invoke()) == null) {
                return;
            }
            EnumC699120Rba enumC699120Rba3 = EnumC699120Rba.GLOBAL;
            EnumC699150Rbd enumC699150Rbd3 = EnumC699150Rbd.DISPERSION_FILTER;
            if (str == null || (listSingletonList = Collections.singletonList(str)) == null) {
                listSingletonList = C13BV.INSTANCE;
            }
            interfaceC699200Rbi.LIZIZ(enumC699120Rba3, enumC699150Rbd3, listSingletonList);
        }
    }
}
