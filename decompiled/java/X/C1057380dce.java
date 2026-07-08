package X;

import com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057380dce extends C09AY implements Function0<ICoinCloseCommerceSettings> {
    public C1057380dce() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.service.ICoinCloseCommerceSettings, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICoinCloseCommerceSettings invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ICoinCloseCommerceSettings.class, false, false, false, 14, null);
    }
}
