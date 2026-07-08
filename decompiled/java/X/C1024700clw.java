package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.log.repo.adsession.SessionInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0clw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024700clw extends C09AY implements Function0<Object> {
    public final /* synthetic */ SessionInfo LL;
    public final /* synthetic */ Gson LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1024700clw(SessionInfo sessionInfo, Gson gson) {
        super(0);
        this.LL = sessionInfo;
        this.LLILLJJLI = gson;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SessionInfo sessionInfo = this.LL;
        if (sessionInfo != null) {
            return GsonProtectorUtils.toJson(this.LLILLJJLI, sessionInfo);
        }
        return null;
    }
}
