package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01W1, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.screen.HighlightsPreviewScreenKt$BottomBar$1$1$1", f = "HighlightsPreviewScreen.kt", l = {195, 199}, m = "invokeSuspend")
public final class C01W1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01W1(StoryHighlightsCreationVM storyHighlightsCreationVM, Context context, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C01W1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCreationVM;
        this.LLILLL = context;
        this.LLILZ = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01W1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsPreviewScreenKt@88bb.BottomBar$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.dl1()) {
                C1674480tfy c1674480tfy = this.LLILLJJLI.LLJILJILJ;
                Context context = this.LLILLL;
                this.LL = 1;
                if (c1674480tfy.LIZLLL(context, this) == objLJFF) {
                    C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.BottomBar$1$1$1");
                    return objLJFF;
                }
            } else if (this.LLILLJJLI.zQ2()) {
                C23250099c.LIZLLL(this.LLILZ, null, null, new C01W0(this.LLILLJJLI, this.LLILLL, null), 3);
            } else {
                C1674480tfy c1674480tfy2 = this.LLILLJJLI.LLJILJILJ;
                Context context2 = this.LLILLL;
                this.LL = 2;
                if (c1674480tfy2.LJ(context2, this) == objLJFF) {
                    C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.BottomBar$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsPreviewScreenKt@88bb.BottomBar$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
