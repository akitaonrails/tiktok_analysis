package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987810boR extends C09AY implements Function0<TextView> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987810boR(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.widget.TextView] */
    @Override // kotlin.jvm.functions.Function0
    public final TextView invoke() {
        return this.LL.view.findViewById(R.id.hs6);
    }
}
