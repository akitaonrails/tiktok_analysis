package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bor, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C988070bor extends C09AY implements Function1<C988080bos, Unit> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C988070bor(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(1);
        this.LL = commerceVideoDelegateKt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C988080bos c988080bos) {
        C988080bos c988080bos2 = c988080bos;
        CommerceVideoDelegateKt commerceVideoDelegateKt = this.LL;
        c988080bos2.LIZ = commerceVideoDelegateKt.aweme;
        c988080bos2.LIZIZ = commerceVideoDelegateKt.fragment;
        c988080bos2.LIZJ = commerceVideoDelegateKt.eventType;
        return Unit.LIZ;
    }
}
