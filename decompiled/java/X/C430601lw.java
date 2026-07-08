package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem$processRatio$1", f = "SearchCardVideoPlayerAssem.kt", l = {530}, m = "invokeSuspend")
public final class C430601lw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCardVideoPlayerAssem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C430601lw(SearchCardVideoPlayerAssem searchCardVideoPlayerAssem, int i, int i2, InterfaceC1364105Vn<? super C430601lw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCardVideoPlayerAssem;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C430601lw(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCardVideoPlayerAssem@2296.processRatio$1");
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
            View contentView = this.LLILLJJLI.getContentView();
            this.LL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (contentView.getWidth() != 0 && contentView.getHeight() != 0) {
                Pair pair = new Pair(C2286608xc.LJ(contentView.getWidth()), C2286608xc.LJ(contentView.getHeight()));
                C189200o6.m2constructorimpl(pair);
                c23260099m.resumeWith(pair);
            } else {
                C786410Ut5.x3(contentView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC512901zD(contentView, c23260099m, 1));
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchCardVideoPlayerAssem@2296.processRatio$1");
                return objLJFF;
            }
        }
        int iIntValue = ((Number) ((Pair) obj).getSecond()).intValue();
        float f = this.LLILLL / this.LLILZ;
        View view = (View) this.LLILLJJLI.LLJJLIIIJLLLLLLLZ.getValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) (iIntValue * f);
            C786410Ut5.W5(view, layoutParams);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchCardVideoPlayerAssem@2296.processRatio$1");
            return unit;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
