package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987780boO extends C09AY implements Function0<C423090GiR> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987780boO(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0GiR, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C423090GiR invoke() {
        return this.LL.view.findViewById(R.id.aax);
    }
}
