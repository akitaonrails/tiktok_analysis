package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01QW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.screen.HighlightsEditCoverScreenKt$CoverCell$1$1$1", f = "HighlightsEditCoverScreen.kt", l = {194}, m = "invokeSuspend")
public final class C01QW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ StoryHighlightAwemePreview LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QW(StoryHighlightsCreationVM storyHighlightsCreationVM, Context context, StoryHighlightAwemePreview storyHighlightAwemePreview, InterfaceC1364105Vn<? super C01QW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCreationVM;
        this.LLILLL = context;
        this.LLILZ = storyHighlightAwemePreview;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01QW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsEditCoverScreenKt@8af8.CoverCell$1$1$1");
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
            StoryHighlightsCreationVM storyHighlightsCreationVM = this.LLILLJJLI;
            Context context = this.LLILLL;
            StoryHighlightAwemePreview storyHighlightAwemePreview = this.LLILZ;
            this.LL = 1;
            if (storyHighlightsCreationVM.GQ2(context, storyHighlightAwemePreview, this) == objLJFF) {
                C1C7U.LIZIZ("HighlightsEditCoverScreenKt@8af8.CoverCell$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsEditCoverScreenKt@8af8.CoverCell$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
