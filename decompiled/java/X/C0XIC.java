package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.account.login.v2.network.CheckUserNameResponse;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0XIC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XIC {
    public AbstractC19489511Mv<CheckUserNameResponse> LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(82));
    public final C0XIB LIZJ = C0XIB.LL;

    public final void LIZ(String str, AbstractC19489511Mv<CheckUserNameResponse> abstractC19489511Mv) {
        boolean zLJI = MethodIDManager.LJI(202241);
        AbstractC19489511Mv<CheckUserNameResponse> abstractC19489511Mv2 = this.LIZ;
        if (abstractC19489511Mv2 != null && !abstractC19489511Mv2.isDisposed()) {
            this.LIZ.dispose();
        }
        this.LIZ = abstractC19489511Mv;
        ((HashMap) this.LIZIZ.getValue()).put("unique_id", str);
        NetworkProxyAccount.LIZ.LIZJ("/aweme/v1/unique/id/check/", (HashMap) this.LIZIZ.getValue()).LJ(this.LIZJ).LJIIJ(C1701940uOG.LIZIZ()).LJIILL(abstractC19489511Mv);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
