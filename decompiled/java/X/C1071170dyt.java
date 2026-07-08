package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.relation.auth.multiapp.IAuthExService;

/* JADX INFO: renamed from: X.0dyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071170dyt implements IAuthExService {
    public static final C1071170dyt LIZIZ = new C1071170dyt();
    public final /* synthetic */ IAuthExService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.auth.multiapp.IAuthExService
    public final boolean LIZ(C1071130dyp c1071130dyp) {
        return this.LIZ.LIZ(c1071130dyp);
    }

    @Override // com.ss.android.ugc.aweme.relation.auth.multiapp.IAuthExService
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    public C1071170dyt() {
        IAuthExService iAuthExService = (IAuthExService) PluggableExtentionKt.pluggableSpi$default(IAuthExService.class, false, false, false, 14, null);
        if (iAuthExService != null) {
            this.LIZ = iAuthExService;
        } else {
            "no implementation IAuthExService".toString();
            throw new IllegalStateException("no implementation IAuthExService");
        }
    }
}
