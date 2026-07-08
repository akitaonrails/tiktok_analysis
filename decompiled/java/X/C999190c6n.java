package X;

import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999190c6n extends C09AY implements Function0<LinearLayout> {
    public final /* synthetic */ LiveInfoContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999190c6n(LiveInfoContainerWidget liveInfoContainerWidget) {
        super(0);
        this.LL = liveInfoContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, android.widget.LinearLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LinearLayout invoke() {
        return this.LL.findViewById(R.id.mq9);
    }
}
