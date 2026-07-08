package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ZC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.aiagent.card.AgentCardView$setAvatar$1", f = "AgentCardView.kt", l = {}, m = "invokeSuspend")
public final class C06ZC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ViewOnClickListenerC1021220cgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZC(String str, ViewOnClickListenerC1021220cgK viewOnClickListenerC1021220cgK, InterfaceC1364105Vn<? super C06ZC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = viewOnClickListenerC1021220cgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AgentCardView@a45b.setAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(24)));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(24)));
        c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
        c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI.getAvatarIvFromXml());
        c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
        c1331670kl3LJIIIZ.LIZLLL("anole_ai_agent_card");
        c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI.getContext());
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AgentCardView@a45b.setAvatar$1");
        return unit;
    }
}
