package X;

import com.ss.android.ugc.aweme.services.ExternalService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C713850RzL extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C713850RzL() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        C0RF0 c0rf02 = c0rf0;
        return new C0T22((C0SZ8) ExternalService.INSTANCE.effectCardService().getEffectRecommendCardViewHolder(c0rf02.LIZ, c0rf02.LIZJ), c0rf02);
    }
}
