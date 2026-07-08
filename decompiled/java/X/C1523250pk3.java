package X;

import java.security.SecureRandom;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523250pk3 implements InterfaceC1503700pEW {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ Object LIZIZ;

    public C1523250pk3(String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }

    @Override // X.InterfaceC1503700pEW
    public final Object LIZ(Class cls, String str) {
        Map mapLIZJ;
        C1530150pvB c1530150pvB;
        C1537480q70 c1537480q70;
        C1533020pzo c1533020pzoLJIILJJIL;
        SecureRandom secureRandom = C828590Wev.LIZ;
        Boolean bool = Boolean.TRUE;
        String str2 = this.LIZ;
        if (str2 != null) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair("origin_url", C1520080pew.LIZIZ(str2)));
        } else {
            mapLIZJ = null;
        }
        C828420Wee c828420WeeLIZIZ = C828590Wev.LIZIZ(bool, str, "PIA", "com.bytedance.pia.core.worker.network.WorkerDelegate#loadAsync", mapLIZJ);
        Object obj = this.LIZIZ;
        if ((obj instanceof C1530150pvB) && (c1530150pvB = (C1530150pvB) obj) != null && (c1537480q70 = c1530150pvB.LIZ) != null && (c1533020pzoLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) != null) {
            c828420WeeLIZIZ.LJFF.put("resource_group", c1533020pzoLJIILJJIL);
        }
        return ((C1499850p8J) C09S2.LIZIZ(C828590Wev.LIZJ(str, c828420WeeLIZIZ))).build().retrofit.LIZ(cls);
    }
}
