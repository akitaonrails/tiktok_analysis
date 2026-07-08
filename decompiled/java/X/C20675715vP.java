package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20675715vP extends C09AY implements Function0<Unit> {
    public C20675715vP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object objLJIIIIZZ;
        synchronized (C20675815vQ.LIZ) {
            Type type = new TypeToken<List<? extends OutreachFlowReportItem>>() { // from class: X.15vA
            }.getType();
            Object objLJIIIIZZ2 = null;
            try {
                String string = C20675815vQ.LIZ().getString("unreported_items", "[]");
                C1227904rF.LIZ.getClass();
                objLJIIIIZZ = C1227904rF.LIZLLL().LJIIIIZZ(string, type);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20571615ec c20571615ec = C20571615ec.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OutreachRecordCache recoverForColdStart lastActiveCache trans error:");
                sbLIZ.append(e.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c20571615ec.getClass();
                C20571615ec.LIZIZ(strLIZIZ);
                objLJIIIIZZ = null;
            }
            try {
                String string2 = C20675815vQ.LIZ().getString("unreported_items_cold_start", "[]");
                C1227904rF.LIZ.getClass();
                objLJIIIIZZ2 = C1227904rF.LIZLLL().LJIIIIZZ(string2, type);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20571615ec c20571615ec2 = C20571615ec.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("OutreachRecordCache recoverForColdStart oldCache trans error:");
                sbLIZ2.append(e2.getMessage());
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c20571615ec2.getClass();
                C20571615ec.LIZIZ(strLIZIZ2);
            }
            C20675815vQ.LIZ().storeString("unreported_items", "[]");
            ArrayList arrayList = new ArrayList();
            List list = (List) objLJIIIIZZ;
            if (list != null) {
                arrayList.addAll(list);
            }
            List list2 = (List) objLJIIIIZZ2;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            try {
                Keva kevaLIZ = C20675815vQ.LIZ();
                C1227904rF.LIZ.getClass();
                kevaLIZ.storeString("unreported_items_cold_start", C1227904rF.LIZLLL().LJIILL(arrayList));
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C20571615ec c20571615ec3 = C20571615ec.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("OutreachRecordCache recoverForColdStart oldCache json error:");
                sbLIZ3.append(e3.getMessage());
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c20571615ec3.getClass();
                C20571615ec.LIZIZ(strLIZIZ3);
            }
            if (!arrayList.isEmpty()) {
                InterfaceC20676615vY interfaceC20676615vY = C20676915vb.LIZ;
                C20676915vb.LIZ(arrayList, AFwS276S0000000_31.get$arr$(332), AFwS221S0000000_31.get$arr$(496));
            }
        }
        return Unit.LIZ;
    }
}
