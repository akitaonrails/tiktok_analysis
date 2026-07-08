package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedPreviewCardWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998800c6A extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ EcLiveFeedPreviewCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C998800c6A(EcLiveFeedPreviewCardWidget ecLiveFeedPreviewCardWidget) {
        super(0);
        this.LL = ecLiveFeedPreviewCardWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        return this.LL.findViewById(R.id.mws);
    }
}
