package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.commercialize.service.IAdInteractiveAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987430bnp extends C09AY implements Function0<IAdInteractiveAbility> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987430bnp(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01wD, com.ss.android.ugc.aweme.commercialize.service.IAdInteractiveAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IAdInteractiveAbility invoke() {
        return C1558520qew.LIZ(C1558420qem.LIZIZ(this.LL.baseHolder), IAdInteractiveAbility.class, null);
    }
}
