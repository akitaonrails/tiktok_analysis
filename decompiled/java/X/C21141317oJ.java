package X;

import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21141317oJ extends C09AY implements Function0<ILikeEffectService> {
    public C21141317oJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ILikeEffectService invoke() {
        return PluggableExtentionKt.pluggableSpi$default(ILikeEffectService.class, false, false, false, 14, null);
    }
}
