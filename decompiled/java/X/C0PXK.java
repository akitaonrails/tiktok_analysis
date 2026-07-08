package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS95S1000000_10;

/* JADX INFO: renamed from: X.0PXK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PXK extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C259800zU<SearchRefreshPredictMobCanShowVM> LLILZ;
    public final /* synthetic */ Function1<View, Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PXK(String str, View view, Function0 function0, C259800zU c259800zU, AwS589S0100000_10 awS589S0100000_10) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = view;
        this.LLILLL = function0;
        this.LLILZ = c259800zU;
        this.LLILZIL = awS589S0100000_10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        AwS215S0300000_6 awS215S0300000_6;
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new AwS95S1000000_10(this.LL, 9);
        c20248814Kw2.LIZIZ(new C020F(this.LLILLJJLI, (View) this.LL, (String) this.LLILLL, (Function0<Unit>) 0));
        EnumC2211841BhW enumC2211841BhW = EnumC2211841BhW.CUSTOMIZE;
        if (C07GH.LIZ()) {
            awS215S0300000_6 = new AwS215S0300000_6((C259800zU) this.LLILZ, (C259800zU<SearchRefreshPredictMobCanShowVM>) this.LLILLJJLI, (View) this.LLILZIL, (Function1<? super View, Boolean>) 19);
        } else {
            awS215S0300000_6 = null;
        }
        C20248814Kw.LIZJ(c20248814Kw2, true, false, 0.0f, 0, enumC2211841BhW, awS215S0300000_6, null, 64);
        return Unit.LIZ;
    }
}
