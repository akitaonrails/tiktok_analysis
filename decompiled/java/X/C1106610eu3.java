package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0eu3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.views.LiveBottomTipsView$onResume$3", f = "LiveBottomTipsView.kt", l = {296}, m = "invokeSuspend")
public final class C1106610eu3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21629019km LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1106610eu3(C21629019km c21629019km, InterfaceC1364105Vn<? super C1106610eu3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21629019km;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1106610eu3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBottomTipsView@d46f.onResume$3");
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
            long delayShowTime = LivePreviewCTASmartDisplayManager.INSTANCE.getDelayShowTime();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(delayShowTime, this) == objLJFF) {
                C1C7U.LIZIZ("LiveBottomTipsView@d46f.onResume$3");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getFadeInPartialAnimator().start();
        C1AC7 c1ac7 = C1AC7.LIZ;
        C1ACA previewContextData = this.LLILLJJLI.getPreviewContextData();
        c1ac7.getClass();
        C1AC7.LJIJI(previewContextData);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBottomTipsView@d46f.onResume$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
