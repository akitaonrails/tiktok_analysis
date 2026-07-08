package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment$multiImagePreviewAbility$1$saveImage$4", f = "TakoSharePageFragment.kt", l = {}, m = "invokeSuspend")
public final class C325290Cp5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ TakoSharePageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325290Cp5(Context context, TakoSharePageFragment takoSharePageFragment, InterfaceC1364105Vn<? super C325290Cp5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = takoSharePageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325290Cp5(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$saveImage$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0DQF.LJI(this.LLILLJJLI, this.LL.getResources().getString(2131822517), C2286608xc.LJ(R.raw.icon_exclamation_mark_circle_fill), C2286608xc.LJ(R.attr.a1h));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$saveImage$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
