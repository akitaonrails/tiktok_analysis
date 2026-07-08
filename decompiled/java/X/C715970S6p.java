package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715970S6p extends C09AY implements Function0<DescBottomViewModel> {
    public final /* synthetic */ VideoCommentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715970S6p(VideoCommentAssem videoCommentAssem) {
        super(0);
        this.LL = videoCommentAssem;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.lifecycle.ViewModel, com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel] */
    @Override // kotlin.jvm.functions.Function0
    public final DescBottomViewModel invoke() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ != null) {
            return ViewModelProviders.of(c19egLIZ).get(DescBottomViewModel.class);
        }
        return null;
    }
}
