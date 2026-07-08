package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999240c6s extends C09AY implements Function0<TuxTextView> {
    public final /* synthetic */ LiveInfoContainerWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999240c6s(LiveInfoContainerWidget liveInfoContainerWidget) {
        super(0);
        this.LL = liveInfoContainerWidget;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, com.bytedance.tux.input.TuxTextView] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ TuxTextView invoke() {
        return this.LL.P1().findViewById(R.id.zv3);
    }
}
