package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674460tfw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1686540tzQ LL;
    public final /* synthetic */ InterfaceC1679450tnz LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674460tfw(InterfaceC1686540tzQ interfaceC1686540tzQ, InterfaceC1679450tnz interfaceC1679450tnz, InterfaceC497601wk interfaceC497601wk, StoryHighlightsCreationVM storyHighlightsCreationVM, Context context, C05P0<Boolean> c05p0) {
        super(0);
        this.LL = interfaceC1686540tzQ;
        this.LLILLJJLI = interfaceC1679450tnz;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = storyHighlightsCreationVM;
        this.LLILZIL = context;
        this.LLILZLL = c05p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIJJ(false);
        InterfaceC1679450tnz interfaceC1679450tnz = this.LLILLJJLI;
        if (interfaceC1679450tnz != null) {
            interfaceC1679450tnz.hide();
        }
        C23250099c.LIZLLL(this.LLILLL, null, null, new C1674470tfx(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3);
        this.LLILZ.zJ("create", ((C1674510tg1) this.LLILZ.LLILLL.getValue()).LJ == StoryHighlightCollection.CoverType.ALBUM_PHOTO ? "upload_image" : "story_image");
        return Unit.LIZ;
    }
}
