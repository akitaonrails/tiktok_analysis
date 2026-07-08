package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05e4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager$internalCreateCollection$2", f = "StoryHighlightsMyDataManager.kt", l = {}, m = "invokeSuspend")
public final class C1401005e4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightCollection LL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1401005e4(StoryHighlightCollection storyHighlightCollection, StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C1401005e4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightCollection;
        this.LLILLJJLI = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1401005e4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.internalCreateCollection$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StoryHighlightCollection storyHighlightCollection = this.LL;
        if (storyHighlightCollection != null && storyHighlightCollection.collectionId.length() != 0) {
            this.LLILLJJLI.LIZIZ.setValue(C13LP.LJLIL((Iterable) this.LLILLJJLI.LIZIZ.getValue(), Collections.singletonList(this.LL)));
            StoryHighlightCollection storyHighlightCollection2 = this.LL;
            List<String> list = storyHighlightCollection2.awemeIds;
            if (list != null) {
                StoryHighlightsMyDataManager storyHighlightsMyDataManager = this.LLILLJJLI;
                for (String str : list) {
                    storyHighlightsMyDataManager.getClass();
                    StoryHighlightsMyDataManager.LJJJ(str, storyHighlightCollection2);
                }
            }
            this.LLILLJJLI.LJII.LIZJ(EnumC1401405e8.NEED_REFRESH);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.internalCreateCollection$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.internalCreateCollection$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
