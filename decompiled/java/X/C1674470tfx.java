package X;

import android.content.Context;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.screen.HighlightsCreationScreenKt$BottomBar$1$2$1$1", f = "HighlightsCreationScreen.kt", l = {508, 511}, m = "invokeSuspend")
public final class C1674470tfx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674470tfx(StoryHighlightsCreationVM storyHighlightsCreationVM, Context context, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1674470tfx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsCreationVM;
        this.LLILLL = context;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1674470tfx(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsCreationScreenKt@fa16.BottomBar$1$2$1$1");
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
                if (((C1674510tg1) this.LLILLJJLI.LLILZ.getValue()).LIZIZ.isEmpty()) {
                    this.LLILZ.setValue(Boolean.TRUE);
                } else {
                    StoryHighlightsCreationVM storyHighlightsCreationVM = this.LLILLJJLI;
                    Context context = this.LLILLL;
                    this.LL = 1;
                    if (storyHighlightsCreationVM.IQ2(context, this) == objLJFF) {
                        C1C7U.LIZIZ("HighlightsCreationScreenKt@fa16.BottomBar$1$2$1$1");
                        return objLJFF;
                    }
                }
            } else {
                StoryHighlightsCreationVM storyHighlightsCreationVM2 = this.LLILLJJLI;
                Context context2 = this.LLILLL;
                this.LL = 2;
                if (storyHighlightsCreationVM2.vQ2(context2, this) == objLJFF) {
                    C1C7U.LIZIZ("HighlightsCreationScreenKt@fa16.BottomBar$1$2$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsCreationScreenKt@fa16.BottomBar$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
