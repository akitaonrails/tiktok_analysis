package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0g4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151430g4L {
    public static final List<InterfaceC1816020xMG> LIZ(C1804840x4E c1804840x4E, Integer num, String str) {
        Object c098200Yq;
        C1151400g4I c1151400g4I;
        String strLJI;
        boolean z;
        boolean z2;
        List<Diamond> listLJIIJJI = c1804840x4E.LJIIJJI(str, false);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Diamond diamond : listLJIIJJI) {
            try {
                String str2 = diamond.iapId;
                int i = diamond.id;
                int i2 = diamond.count;
                int i3 = diamond.givingCount;
                if (diamond.LIZIZ()) {
                    strLJI = C1804850x4F.LJI(diamond);
                } else {
                    strLJI = diamond.price;
                }
                int i4 = diamond.id;
                if (num != null && i4 == num.intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = diamond.id;
                if (num != null && i5 == num.intValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1151400g4I = new C1151400g4I(str2, strLJI, i, i2, i3, z, z2, diamond, false);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(e.getMessage());
                    sbLIZ.append(" with diamond id: ");
                    sbLIZ.append(diamond.id);
                    c098200Yq = C2188811AlT.LIZIZ(sbLIZ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                c1151400g4I = null;
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                map.put("error_detail", c098200Yq);
            }
            if (c1151400g4I != null) {
                arrayList.add(c1151400g4I);
            }
        }
        if (arrayList.size() < listLJIIJJI.size()) {
            C1134320fck.LJFF(EnumC1134330fcl.WALLET_IAP_ID_CONVERSION_FAIL, map);
        }
        return arrayList;
    }
}
