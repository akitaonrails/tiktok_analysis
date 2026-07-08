package X;

import Y.AgS287S0100000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.TextInputSheetFragment$onViewCreated$2$1", f = "TextInputSheetFragment.kt", l = {550}, m = "invokeSuspend")
public final class C439960HNa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC440230HOb<? extends List<C440440HOw>> LLILLJJLI;
    public final /* synthetic */ TextInputSheetFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439960HNa(InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb, TextInputSheetFragment textInputSheetFragment, InterfaceC1364105Vn<? super C439960HNa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC440230HOb;
        this.LLILLL = textInputSheetFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439960HNa(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC435540H6a abstractC435540H6aLIZLLL;
        C1C7U.LIZ("TextInputSheetFragment@d367.onViewCreated$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!C440480HPa.LIZJ()) {
                InterfaceC440230HOb<? extends List<C440440HOw>> interfaceC440230HOb = this.LLILLJJLI;
                if ((interfaceC440230HOb instanceof C0HKU) || (interfaceC440230HOb instanceof C1372805Yw)) {
                    C05YD<C0HOM<? extends Object>> state = interfaceC440230HOb.getState();
                    AgS287S0100000_6 agS287S0100000_6 = new AgS287S0100000_6(this.LLILLL, 93);
                    this.LL = 1;
                    if (state.collect(agS287S0100000_6, this) == objLJFF) {
                        C1C7U.LIZIZ("TextInputSheetFragment@d367.onViewCreated$2$1");
                        return objLJFF;
                    }
                }
            } else {
                C439980HNc c439980HNc = this.LLILLL.LLJJIJIL;
                C0H6M c0h6mLIZIZ = null;
                if (c439980HNc != null) {
                    abstractC435540H6aLIZLLL = C439980HNc.LIZLLL(c439980HNc, this.LLILLJJLI);
                } else {
                    abstractC435540H6aLIZLLL = null;
                }
                C420500GeG c420500GeG = this.LLILLL.LLJ;
                if (c420500GeG != null) {
                    c420500GeG.setElementDisplayStrategy(abstractC435540H6aLIZLLL);
                }
                TextInputSheetFragment textInputSheetFragment = this.LLILLL;
                C420500GeG c420500GeG2 = textInputSheetFragment.LLJI;
                if (c420500GeG2 != null) {
                    C439980HNc c439980HNc2 = textInputSheetFragment.LLJJIJIL;
                    if (c439980HNc2 != null) {
                        c0h6mLIZIZ = c439980HNc2.LIZIZ(new C439970HNb(this.LLILLJJLI.LIZIZ(), null, null), C2286608xc.LJ(-2));
                    }
                    c420500GeG2.setElementDisplayStrategy(c0h6mLIZIZ);
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TextInputSheetFragment@d367.onViewCreated$2$1");
            return unit;
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
