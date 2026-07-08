package X;

import com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent$onBind$1", f = "StoryPaywallComponentTrigger.kt", l = {323}, m = "invokeSuspend")
public final class C2450509ix extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent LLILLJJLI;
    public final /* synthetic */ Function2<Set<String>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2450509ix(StoryPaywallComponentTrigger.StoryPaywallCellOverlayComponent storyPaywallCellOverlayComponent, Function2<? super Set<String>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C2450509ix> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = storyPaywallCellOverlayComponent;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2450509ix(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951LJIIJ;
        C1C7U.LIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onBind$1");
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
            C0K77 c0k77 = (C0K77) this.LLILLJJLI.LLJLLIL.getValue();
            if (c0k77 != null && (anonymousClass0951LJIIJ = c0k77.LJIIJ()) != null) {
                C1629806Zs c1629806Zs = new C1629806Zs(anonymousClass0951LJIIJ);
                C2450609iy c2450609iy = new C2450609iy(this.LLILLL);
                this.LL = 1;
                if (c1629806Zs.collect(c2450609iy, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onBind$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryPaywallComponentTrigger$StoryPaywallCellOverlayComponent@c7e.onBind$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
