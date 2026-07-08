package X;

import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomInCellEntrance;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS625S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.0RsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.TakoRightBottomInCellEntrance$onViewCreated$1", f = "TakoRightBottomInCellEntrance.kt", l = {}, m = "invokeSuspend")
public final class C709490RsJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoRightBottomInCellEntrance LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C709490RsJ(TakoRightBottomInCellEntrance takoRightBottomInCellEntrance, InterfaceC1364105Vn<? super C709490RsJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoRightBottomInCellEntrance;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C709490RsJ(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        ViewStub viewStub;
        C1C7U.LIZ("TakoRightBottomInCellEntrance@d18f.onViewCreated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0RF0 c0rf0 = this.LL.jm().LIZLLL;
        if (c0rf0 != null && (view = c0rf0.LIZ) != null && (viewStub = (ViewStub) view.findViewById(R.id.vs_tako_entrance)) != null) {
            viewStub.setInflatedId(R.id.x7g);
            viewStub.setLayoutResource(R.layout.fo5);
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            if (viewLJLLLL != null) {
                C2271391DvN.LIZ(viewLJLLLL, (C1A5L) C2271381DvM.Q0.getValue());
                this.LL.Fp(viewLJLLLL);
                C786410Ut5.I7(new ACListenerS115S0200000_11(this.LL, viewLJLLLL, 12), viewLJLLLL);
                TakoRightBottomInCellEntrance takoRightBottomInCellEntrance = this.LL;
                C736680Sv4.LJIIIIZZ(takoRightBottomInCellEntrance, takoRightBottomInCellEntrance.Bp(), new C2217381BqS() { // from class: X.0RsK
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C709570RsR) obj2).LLILLJJLI);
                    }
                }, null, new AwS625S0100000_11(viewLJLLLL, 76), 6);
                TakoRightBottomInCellEntrance takoRightBottomInCellEntrance2 = this.LL;
                C736680Sv4.LJIIIIZZ(takoRightBottomInCellEntrance2, takoRightBottomInCellEntrance2.Bp(), new C2217381BqS() { // from class: X.0RsL
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Integer.valueOf(((C709570RsR) obj2).LLILZIL);
                    }
                }, null, new AwS625S0100000_11(viewLJLLLL, 77), 6);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoRightBottomInCellEntrance@d18f.onViewCreated$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoRightBottomInCellEntrance@d18f.onViewCreated$1");
        return unit2;
    }
}
