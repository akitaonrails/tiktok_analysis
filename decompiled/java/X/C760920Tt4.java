package X;

import Y.AgS202S0200000_12;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.EffectFirstPanelHelper$fetchBackgroundPanelList$1$1", f = "EffectFirstPanelHelper.kt", l = {51}, m = "invokeSuspend")
public final class C760920Tt4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BgEffectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760920Tt4(BgEffectViewModel bgEffectViewModel, InterfaceC1364105Vn<? super C760920Tt4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bgEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C760920Tt4 c760920Tt4 = new C760920Tt4(this.LLILLL, interfaceC1364105Vn);
        c760920Tt4.LLILLJJLI = obj;
        return c760920Tt4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EffectFirstPanelHelper@4976.fetchBackgroundPanelList$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            BgEffectViewModel bgEffectViewModel = this.LLILLL;
            if (LiveBroadcastBackgroundPhase2.enable()) {
                str = "solo_new";
            } else {
                str = "solo";
            }
            bgEffectViewModel.ZQ2(str, null);
            BgEffectViewModel bgEffectViewModel2 = this.LLILLL;
            C2252331DDr c2252331DDr = bgEffectViewModel2.LLILLL;
            AgS202S0200000_12 agS202S0200000_12 = new AgS202S0200000_12(interfaceC497601wk, bgEffectViewModel2, 3);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS202S0200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("EffectFirstPanelHelper@4976.fetchBackgroundPanelList$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
