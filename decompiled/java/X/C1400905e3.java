package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05e3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager$internalDeleteCollection$2", f = "StoryHighlightsMyDataManager.kt", l = {}, m = "invokeSuspend")
public final class C1400905e3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1400905e3(String str, StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C1400905e3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1400905e3(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.internalDeleteCollection$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        if (str != null && str.length() != 0) {
            C2252321DDq c2252321DDq = this.LLILLJJLI.LIZIZ;
            Iterable iterable = (Iterable) c2252321DDq.getValue();
            String str2 = this.LL;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (!Intrinsics.LJFF(((StoryHighlightCollection) obj2).collectionId, str2)) {
                    arrayList.add(obj2);
                }
            }
            c2252321DDq.setValue(arrayList);
            this.LLILLJJLI.LJII.LIZJ(EnumC1401405e8.NEED_REFRESH);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.internalDeleteCollection$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.internalDeleteCollection$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
