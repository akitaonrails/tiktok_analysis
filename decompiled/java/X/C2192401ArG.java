package X;

import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1ArG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192401ArG {
    public static final C2192401ArG LIZ = new C2192401ArG();
    public static final ConcurrentHashMap<String, InterfaceC625970Ogt> LIZIZ = new ConcurrentHashMap<>();

    public static final InterfaceC625970Ogt LIZ(C589160N8w c589160N8w, String str) {
        String currentUid;
        LIZ.getClass();
        String currentUid2 = null;
        if (C2192411ArH.LIZ == null) {
            IUserAccount iUserAccountLIZIZ = UserAccountImpl.LIZIZ();
            C2192411ArH.LIZ = iUserAccountLIZIZ;
            if (iUserAccountLIZIZ != null) {
                currentUid2 = iUserAccountLIZIZ.getCurrentUid();
            }
            C2188841AlW.LIZIZ(currentUid2);
        }
        IUserAccount iUserAccount = C2192411ArH.LIZ;
        if (iUserAccount == null || (currentUid = iUserAccount.getCurrentUid()) == null) {
            currentUid = "unlogin";
        }
        return new C2192381ArE(currentUid, c589160N8w, str).LIZ();
    }
}
