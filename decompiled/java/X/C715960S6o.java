package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.assem.desc.bottom.DescBottomViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715960S6o extends C09AY implements Function0<DescBottomViewModel> {
    public final /* synthetic */ VideoDiggAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C715960S6o(VideoDiggAssem videoDiggAssem) {
        super(0);
        this.LL = videoDiggAssem;
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
