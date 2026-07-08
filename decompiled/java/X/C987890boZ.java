package X;

import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0boZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C987890boZ extends C09AY implements Function0<RemoteImageView> {
    public final /* synthetic */ CommerceVideoDelegateKt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C987890boZ(CommerceVideoDelegateKt commerceVideoDelegateKt) {
        super(0);
        this.LL = commerceVideoDelegateKt;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.base.ui.RemoteImageView] */
    @Override // kotlin.jvm.functions.Function0
    public final RemoteImageView invoke() {
        return this.LL.view.findViewById(R.id.a9d);
    }
}
