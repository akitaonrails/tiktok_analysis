package X;

import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987870boX extends C09AY implements Function0<C430310Gu5> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987870boX(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0Gu5, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C430310Gu5 invoke() {
        return this.LL.view.findViewById(R.id.a7q);
    }
}
