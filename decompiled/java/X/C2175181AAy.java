package X;

import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175181AAy extends C09AY implements Function0<RemoteImageView> {
    public final /* synthetic */ LabelContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2175181AAy(LabelContainerWidget labelContainerWidget) {
        super(0);
        this.LL = labelContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.ss.android.ugc.aweme.base.ui.RemoteImageView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ RemoteImageView invoke() {
        return this.LL.findViewById(R.id.i0m);
    }
}
