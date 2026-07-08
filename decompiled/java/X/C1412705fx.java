package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCreationSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.immersivesheet.StoryHighlightsCreationSheetFragment$initObservers$1", f = "StoryHighlightsCreationSheetFragment.kt", l = {133}, m = "invokeSuspend")
public final class C1412705fx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsCreationSheetFragment LLILLJJLI;
    public final /* synthetic */ C1615806Ui LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412705fx(StoryHighlightsCreationSheetFragment storyHighlightsCreationSheetFragment, C1615806Ui c1615806Ui, InterfaceC1364105Vn<? super C1412705fx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCreationSheetFragment;
        this.LLILLL = c1615806Ui;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1412705fx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCreationSheetFragment@2006.initObservers$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1412605fw c1412605fw = new C1412605fw(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c1412605fw, this) == objLJFF) {
                C1C7U.LIZIZ("StoryHighlightsCreationSheetFragment@2006.initObservers$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsCreationSheetFragment@2006.initObservers$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
