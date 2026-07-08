package X;

import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10TF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10TF extends C09AY implements Function0<IMandatoryLoginService> {
    public C10TF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.IMandatoryLoginService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMandatoryLoginService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(IMandatoryLoginService.class, false, false, false, 14, null);
    }
}
