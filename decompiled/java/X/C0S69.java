package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S69, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S69 extends C09AY implements Function0<DescBottomViewModel> {
    public final /* synthetic */ VideoDescAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S69(VideoDescAssem videoDescAssem) {
        super(0);
        this.LL = videoDescAssem;
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
