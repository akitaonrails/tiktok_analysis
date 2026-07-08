package X;

import android.view.View;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987920boc extends C09AY implements Function0<View> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987920boc(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        return this.LL.view.findViewById(R.id.a_4);
    }
}
