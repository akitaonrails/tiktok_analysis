package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620070sGD extends C09AY implements Function1<Aweme, Boolean> {
    public final /* synthetic */ FeedPipViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620070sGD(FeedPipViewModel feedPipViewModel) {
        super(1);
        this.LL = feedPipViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        return Boolean.valueOf(this.LL.LLJJIJIIJIL.contains(aweme.getAid()));
    }
}
