package X;

import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.pipfeed.assem.PipFeedMainActivityAssem;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620020sG8 extends C09AY implements Function0<FeedPipViewModel> {
    public final /* synthetic */ PipFeedMainActivityAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620020sG8(PipFeedMainActivityAssem pipFeedMainActivityAssem) {
        super(0);
        this.LL = pipFeedMainActivityAssem;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final FeedPipViewModel invoke() {
        return new SharedViewModelProvider(new ViewModelProvider.NewInstanceFactory()).get(this.LL.getLifecycle(), FeedPipViewModel.class);
    }
}
