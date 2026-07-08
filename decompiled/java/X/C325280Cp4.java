package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.share.ui.TakoSharePageFragment$multiImagePreviewAbility$1$saveImage$3", f = "TakoSharePageFragment.kt", l = {}, m = "invokeSuspend")
public final class C325280Cp4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ TakoSharePageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325280Cp4(Context context, TakoSharePageFragment takoSharePageFragment, InterfaceC1364105Vn<? super C325280Cp4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = takoSharePageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325280Cp4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$saveImage$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Resources resources = this.LL.getResources();
        C07QI.LIZ.getClass();
        if (C07QI.LIZ()) {
            i = 2131822518;
        } else {
            C325310Cp7.LIZ.getClass();
            if (C325310Cp7.LIZ()) {
                i = 2131849626;
            } else {
                i = 2131822456;
            }
        }
        C0DQF.LJI(this.LLILLJJLI, resources.getString(i), C2286608xc.LJ(R.raw.icon_tick_circle_fill), C2286608xc.LJ(R.attr.a1h));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoSharePageFragment@c5e2.multiImagePreviewAbility$1$saveImage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
