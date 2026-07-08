package X;

import Y.AgS204S0200000_16;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.media.impl.view.CommerceRecommendMusicViewDelegate$inflateRecommendViewV2$1$2$1", f = "CommerceRecommendMusicViewDelegate.kt", l = {94}, m = "invokeSuspend")
public final class C1006020cHo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecommendMusicV2ViewModel LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ ViewStub LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1006020cHo(RecommendMusicV2ViewModel recommendMusicV2ViewModel, TextView textView, ViewStub viewStub, InterfaceC1364105Vn<? super C1006020cHo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recommendMusicV2ViewModel;
        this.LLILLL = textView;
        this.LLILZ = viewStub;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1006020cHo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceRecommendMusicViewDelegate@f949.inflateRecommendViewV2$1$2$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C1077440e90(C09IC.LIZIZ(this.LLILLJJLI.LLILZIL), 9));
            AgS204S0200000_16 agS204S0200000_16 = new AgS204S0200000_16(this.LLILLL, this.LLILZ, 15);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS204S0200000_16, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceRecommendMusicViewDelegate@f949.inflateRecommendViewV2$1$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceRecommendMusicViewDelegate@f949.inflateRecommendViewV2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
