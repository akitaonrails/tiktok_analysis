package X;

import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999230c6r extends C09AY implements Function0<RemoteImageView> {
    public final /* synthetic */ LiveInfoContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999230c6r(LiveInfoContainerWidget liveInfoContainerWidget) {
        super(0);
        this.LL = liveInfoContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.ss.android.ugc.aweme.base.ui.RemoteImageView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ RemoteImageView invoke() {
        return this.LL.P1().findViewById(R.id.kd9);
    }
}
