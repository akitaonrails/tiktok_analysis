package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent;

/* JADX INFO: renamed from: X.0ble, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent", f = "CatchBeansGameComponent.kt", l = {301}, m = "stopGame")
public final class C986080ble extends AbstractC23140094w {
    public Object LL;
    public IEffectService LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CatchBeansGameComponent LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986080ble(CatchBeansGameComponent catchBeansGameComponent, InterfaceC1364105Vn<? super C986080ble> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = catchBeansGameComponent;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansGameComponent@7e04.stopGame$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIJI = this.LLILZ.LJIJI(this);
        C1C7U.LIZIZ("CatchBeansGameComponent@7e04.stopGame$1");
        return objLJIJI;
    }
}
