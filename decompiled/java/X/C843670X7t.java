package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS246S0000000_13;

/* JADX INFO: renamed from: X.0X7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C843670X7t extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ClientSecurityServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843670X7t(ClientSecurityServiceImpl clientSecurityServiceImpl) {
        super(0);
        this.LL = clientSecurityServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Forest forestLIZ = C0T1N.LIZ();
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.channel = "pns_gecko_csp_config";
        requestParams.bundle = "ruleConfig.json";
        forestLIZ.fetchResourceAsync("", requestParams, new AwS246S0000000_13(this.LL, 0));
        return Unit.LIZ;
    }
}
