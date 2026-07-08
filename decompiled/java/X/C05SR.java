package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.widget.HighlightsCoverCropperKt$HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1", f = "HighlightsCoverCropper.kt", l = {}, m = "invokeSuspend")
public final class C05SR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ C1677480tko<C1378605aS, C1677270tkT> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SR(C1677480tko<Float, C1677280tkU> c1677480tko, C1677480tko<C1378605aS, C1677270tkT> c1677480tko2, InterfaceC1364105Vn<? super C05SR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c1677480tko2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05SR c05sr = new C05SR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05sr.LL = obj;
        return c05sr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsCoverCropperKt@f4fc.HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05SQ(this.LLILLJJLI, null), 3);
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05SS(this.LLILLL, null), 3);
        C1C7U.LIZIZ("HighlightsCoverCropperKt@f4fc.HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
