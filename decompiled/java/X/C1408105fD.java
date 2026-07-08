package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1408105fD extends C09AY implements Function0<Unit> {
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1408105fD(StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, String str, Aweme aweme, Function1<? super String, Unit> function1, Fragment fragment, String str2) {
        super(0);
        this.LL = storyHighlightsImmersiveActionServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
        this.LLILZ = function1;
        this.LLILZIL = fragment;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = this.LL;
        C23250099c.LIZLLL(storyHighlightsImmersiveActionServiceImpl.LIZ, null, null, new C1407905fB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, storyHighlightsImmersiveActionServiceImpl, this.LLILZLL, null), 3);
        return Unit.LIZ;
    }
}
