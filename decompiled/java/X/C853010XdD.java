package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C853010XdD extends C09AY implements Function0<Bundle> {
    public final /* synthetic */ CommonFlowActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C853010XdD(CommonFlowActivity commonFlowActivity) {
        super(0);
        this.LL = commonFlowActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Bundle invoke() {
        Bundle bundle;
        try {
            bundle = this.LL.getIntent().getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.remove("next_page");
        return bundle;
    }
}
