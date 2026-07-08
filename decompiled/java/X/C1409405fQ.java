package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsDeleteDialogService;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS72S1300000_2;

/* JADX INFO: renamed from: X.05fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1409405fQ extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ Fragment LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Aweme LLJ;
    public final /* synthetic */ Function1<String, Unit> LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1409405fQ(StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, String str, String str2, String str3, Integer num, Context context, Fragment fragment, Function0<Unit> function0, Aweme aweme, Function1<? super String, Unit> function1, String str4) {
        super(1);
        this.LL = storyHighlightsImmersiveActionServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = num;
        this.LLILZLL = context;
        this.LLIZ = fragment;
        this.LLIZLLLIL = function0;
        this.LLJ = aweme;
        this.LLJI = function1;
        this.LLJIJIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        storyHighlightsImmersiveActionServiceImpl.getClass();
        C06US.LIZ.getClass();
        C06US.LIZ(str, str2, str3, "remove");
        Integer num = this.LLILZIL;
        if (num != null && num.intValue() <= 1) {
            IStoryHighlightsDeleteDialogService iStoryHighlightsDeleteDialogService = (IStoryHighlightsDeleteDialogService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsDeleteDialogService.class, false, false, false, 14, null);
            if (iStoryHighlightsDeleteDialogService != null) {
                iStoryHighlightsDeleteDialogService.LIZ(this.LLILZLL, new AwS72S1300000_2(this.LL, (StoryHighlightsImmersiveActionServiceImpl) this.LLILZ, (String) this.LLIZ, (Fragment) this.LLIZLLLIL, (Function0<Unit>) 4));
            }
        } else {
            IStoryHighlightsDeleteDialogService iStoryHighlightsDeleteDialogService2 = (IStoryHighlightsDeleteDialogService) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsDeleteDialogService.class, false, false, false, 14, null);
            if (iStoryHighlightsDeleteDialogService2 != null) {
                iStoryHighlightsDeleteDialogService2.LIZIZ(this.LLILZLL, new C1408105fD(this.LL, this.LLILZ, this.LLJ, this.LLJI, this.LLIZ, this.LLJIJIL));
            }
        }
        return Unit.LIZ;
    }
}
