package X;

import android.view.View;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19746612Ns extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C21646519nb LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ long LLILLL = 250;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19746612Ns(C21646519nb c21646519nb, View view, AwS577S0100000_33 awS577S0100000_33) {
        super(0);
        this.LL = c21646519nb;
        this.LLILLJJLI = view;
        this.LLILZ = awS577S0100000_33;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Pair<Float, Float> pairLJFF = this.LL.LJFF(this.LLILLJJLI);
        float fFloatValue = pairLJFF.getFirst().floatValue();
        float fFloatValue2 = pairLJFF.getSecond().floatValue();
        this.LLILLJJLI.setPivotX(fFloatValue);
        this.LLILLJJLI.setPivotY(fFloatValue2);
        C21647019ng c21647019ng = this.LL.LJIILLIIL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        List listLJIIJJI = C1697810uHb.LJIIJJI(new C19746412Nq("small_bubble_enter_scale_x", new C0HIW(0.2f, 1.0f)), new C19746412Nq("small_bubble_enter_scale_y", new C0HIX(0.2f, 1.0f)), new C19746412Nq("small_bubble_enter_alpha", new C0HUY(0.0f, 1.0f)));
        final C21647019ng c21647019ng2 = new C21647019ng(this.LLILLJJLI.getContext(), this.LLILLJJLI, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(631.65f), new C1342130l1v(50.22f)), listLJIIJJI), false);
        c21647019ng2.LJI = c21647019ng2.LIZIZ(new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), this.LLILLL), listLJIIJJI));
        final C21646519nb c21646519nb = this.LL;
        c21646519nb.LJIILLIIL = c21647019ng2;
        final View view = this.LLILLJJLI;
        final Function0<Unit> function0 = this.LLILZ;
        c21647019ng2.LIZJ("small_bubble_enter_alpha", new InterfaceC21641019mi() { // from class: X.0y9H
            @Override // X.InterfaceC21641019mi
            public final void LIZIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
            }

            @Override // X.InterfaceC21641019mi
            public final void LIZ(InterfaceC1844880y6o interfaceC1844880y6o) {
                if (!Intrinsics.LJFF(interfaceC1844880y6o.W5(), Boolean.TRUE) && Intrinsics.LJFF(c21646519nb.LJIILLIIL, c21647019ng2)) {
                    c21646519nb.LJIILLIIL = null;
                    C786410Ut5.Ob(view, 1.0f);
                    C786410Ut5.pc(view, 1.0f);
                    C786410Ut5.T4(view, 1.0f);
                    function0.invoke();
                }
            }
        });
        c21647019ng2.LJI(true);
        return Unit.LIZ;
    }
}
