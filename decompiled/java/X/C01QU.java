package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01QU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01QU extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ InterfaceC497601wk LL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QU(InterfaceC497601wk interfaceC497601wk, StoryHighlightsCreationVM storyHighlightsCreationVM, Context context) {
        super(1);
        this.LL = interfaceC497601wk;
        this.LLILLJJLI = storyHighlightsCreationVM;
        this.LLILLL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        InterfaceC497601wk interfaceC497601wk = this.LL;
        StoryHighlightsCreationVM storyHighlightsCreationVM = this.LLILLJJLI;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C01QT(this.LLILLL, storyHighlightsCreationVM, str, null), 3);
        return Unit.LIZ;
    }
}
