package X;

import com.bytedance.pipo.verify.base.model.DTOVerifyInfo;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0uh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713620uh6 {
    public static final C1713570uh1 LIZ(C1713520ugw c1713520ugw, InterfaceC1713650uh9 interfaceC1713650uh9) {
        C1713580uh2 c1713580uh2;
        String str;
        String str2;
        boolean z;
        try {
            DTOVerifyInfo dTOVerifyInfo = (DTOVerifyInfo) C309820CCm.LIZ.LJII(c1713520ugw.LIZ.LIZJ, DTOVerifyInfo.class);
            List<C1713640uh8> listLIZJ = dTOVerifyInfo.LIZJ();
            C1713640uh8 c1713640uh8LIZIZ = dTOVerifyInfo.LIZIZ();
            if (listLIZJ == null || listLIZJ.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            String str3 = "";
            if (z) {
                if (c1713640uh8LIZIZ != null) {
                    String str4 = dTOVerifyInfo.verifyId;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    c1713580uh2 = new C1713580uh2(str3, dTOVerifyInfo.LIZ(), dTOVerifyInfo.LIZLLL(), Collections.singletonList(c1713640uh8LIZIZ));
                } else {
                    throw new IllegalArgumentException("invalid legacy verify_info");
                }
            } else {
                Iterator<C1713640uh8> it2 = listLIZJ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL = dTOVerifyInfo.actionType;
                }
                if (c1713640uh8LIZIZ != null) {
                    List listSingletonList = Collections.singletonList(c1713640uh8LIZIZ);
                    ArrayList arrayList = new ArrayList();
                    for (C1713640uh8 c1713640uh8 : listLIZJ) {
                        if (!u.LJIJI(c1713640uh8.LIZ, c1713640uh8LIZIZ.LIZ, true)) {
                            arrayList.add(c1713640uh8);
                        }
                    }
                    listLIZJ = C13LP.LJLIL(arrayList, listSingletonList);
                }
                String str5 = dTOVerifyInfo.verifyId;
                if (str5 != null) {
                    str3 = str5;
                }
                c1713580uh2 = new C1713580uh2(str3, dTOVerifyInfo.LIZ(), dTOVerifyInfo.LIZLLL(), listLIZJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1713600uh4.LIZIZ(th);
            c1713580uh2 = null;
        }
        if (c1713580uh2 == null) {
            interfaceC1713650uh9.LIZ(C1713490ugt.LIZ("invalid verify_info", null, 6));
            return null;
        }
        C1713630uh7 c1713630uh7 = new C1713630uh7(c1713580uh2, 0);
        VerifyInfo verifyInfo = (VerifyInfo) c1713630uh7.LIZLLL.getValue();
        VerifyDetail verifyDetail = verifyInfo.verifyDetail;
        if (verifyDetail != null) {
            str = verifyDetail.verifyCenterHost;
            str2 = verifyDetail.pinHost;
        } else {
            str = null;
            str2 = null;
        }
        if ((str == null || a0.LJJJIL(str)) && (str2 == null || a0.LJJJIL(str2))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid host: host-");
            sbLIZ.append(str);
            sbLIZ.append(" pinHost-");
            sbLIZ.append(str2);
            interfaceC1713650uh9.LIZ(C1713490ugt.LIZ(C2188811AlT.LIZIZ(sbLIZ), null, 6));
            return null;
        }
        String str6 = verifyInfo.verifyType;
        if (str6 != null && !a0.LJJJIL(str6)) {
            return new C1713570uh1(c1713520ugw, c1713630uh7, interfaceC1713650uh9, C1714380uiK.LJ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("invalid verify type: ");
        sbLIZ2.append(verifyInfo.verifyType);
        interfaceC1713650uh9.LIZ(C1713490ugt.LIZ(C2188811AlT.LIZIZ(sbLIZ2), null, 6));
        return null;
    }
}
