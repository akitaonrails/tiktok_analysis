package X;

import android.view.View;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;

/* JADX INFO: renamed from: X.15Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20521515Rt extends AbstractViewOnClickListenerC1637610siV {
    public final /* synthetic */ ExploreRecommendTopicListComponent LLILZ;
    public final /* synthetic */ String LLILZIL;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        if (view != null) {
            this.LLILZ.pq(this.LLILZIL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20521515Rt(ExploreRecommendTopicListComponent exploreRecommendTopicListComponent, String str) {
        super(1500L);
        this.LLILZ = exploreRecommendTopicListComponent;
        this.LLILZIL = str;
    }
}
