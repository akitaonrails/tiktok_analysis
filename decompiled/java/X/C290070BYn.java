package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C290070BYn extends C09AY implements Function0<Integer> {
    public C290070BYn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJFF() ? -1 : KevaImpl.getRepo("ab_repo_cold_boot_muti", 1).getInt("push_start_opt_strategy", 0));
    }
}
