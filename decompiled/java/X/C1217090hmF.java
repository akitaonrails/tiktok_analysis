package X;

import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1217090hmF extends C09AY implements Function0<String> {
    public C1217090hmF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AccountUserService accountUserServiceLJIIJ;
        String uid;
        C1208440hYI.LIZ.getClass();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || !accountUserServiceLJIIJ.isLogin() || (uid = accountUserServiceLJIIJ.getCurUser().getUid()) == null) ? CardStruct.IStatusCode.DEFAULT : uid;
    }
}
