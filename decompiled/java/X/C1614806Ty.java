package X;

import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCollectionListSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCollectionListSheetFragment$initObservers$1$1", f = "StoryHighlightsCollectionListSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C1614806Ty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsCollectionListSheetFragment LLILLJJLI;
    public final /* synthetic */ C06U2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614806Ty(StoryHighlightsCollectionListSheetFragment storyHighlightsCollectionListSheetFragment, C06U2 c06u2, InterfaceC1364105Vn<? super C1614806Ty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCollectionListSheetFragment;
        this.LLILLL = c06u2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1614806Ty c1614806Ty = new C1614806Ty(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1614806Ty.LL = obj;
        return c1614806Ty;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCollectionListSheetFragment@474d.initObservers$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614906Tz(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614606Tw(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614406Tu(this.LLILLJJLI, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1614706Tx(this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsCollectionListSheetFragment@474d.initObservers$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
