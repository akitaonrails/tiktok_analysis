package X;

import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.0SqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733860SqW<S> extends C09AY implements Function1<S, S> {
    public final /* synthetic */ FeedBaseHolderViewModel<S> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733860SqW(FeedBaseHolderViewModel<S> feedBaseHolderViewModel, VideoItemParams videoItemParams) {
        super(1);
        this.LL = feedBaseHolderViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.LL.defaultState();
    }
}
