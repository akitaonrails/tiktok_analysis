package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Uj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780190Uj3 extends C09AY implements Function0<FrameLayout> {
    public final /* synthetic */ GameRewardsPreviewCardWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C780190Uj3(GameRewardsPreviewCardWidget gameRewardsPreviewCardWidget) {
        super(0);
        this.LL = gameRewardsPreviewCardWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, android.widget.FrameLayout] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ FrameLayout invoke() {
        View view = this.LL.getView();
        if (view != null) {
            return view.findViewById(R.id.myf);
        }
        return null;
    }
}
