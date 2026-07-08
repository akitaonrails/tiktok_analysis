package X;

import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01B1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01B1 extends C09AY implements Function2<C03H5, Pair<? extends String, ? extends String>, Unit> {
    public final /* synthetic */ StoryGuideCardFilterPanelComponentA2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01B1(StoryGuideCardFilterPanelComponentA2 storyGuideCardFilterPanelComponentA2) {
        super(2);
        this.LL = storyGuideCardFilterPanelComponentA2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Pair<? extends String, ? extends String> pair) {
        if (pair != null) {
            this.LL.m324do(false);
        }
        return Unit.LIZ;
    }
}
