package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Cjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238791Cjt extends C09AY implements Function0<IGatekeeperService> {
    public C2238791Cjt() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IGatekeeperService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
    }
}
