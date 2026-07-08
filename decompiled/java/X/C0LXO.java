package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCStatusHandler$logAiTaskCreate$1$1", f = "AIGCStatusHandler.kt", l = {389}, m = "invokeSuspend")
public final class C0LXO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1623720sM6 LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LXO(C1623720sM6 c1623720sM6, Effect effect, InterfaceC1364105Vn<? super C0LXO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1623720sM6;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LXO(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCStatusHandler@5733.logAiTaskCreate$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCStatusHandler@5733.logAiTaskCreate$1$1");
                return objLJFF;
            }
        }
        C0LXN c0lxn = C0LXN.LIZ;
        ShortVideoContext shortVideoContext = this.LLILLJJLI.LLILLJJLI;
        Effect effect = this.LLILLL;
        c0lxn.getClass();
        C0LXP c0lxpLIZLLL = C0LXN.LIZLLL(shortVideoContext, effect);
        if (C123100dR.LIZ(c0lxpLIZLLL.LJIIIIZZ)) {
            C0LXN.LJ("ai_task_create", c0lxpLIZLLL, C2097608Jq.LJ());
        } else {
            C0LXN.LJ("ai_task_create", new C0LXP(c0lxpLIZLLL.LIZ, c0lxpLIZLLL.LIZIZ, c0lxpLIZLLL.LIZJ, c0lxpLIZLLL.LIZLLL, c0lxpLIZLLL.LJ, c0lxpLIZLLL.LJFF, c0lxpLIZLLL.LJI, c0lxpLIZLLL.LJII, C0LXV.LONG_PRESS_TO_RECORD.getType(), "shooting_effect", c0lxpLIZLLL.LJIIJ, c0lxpLIZLLL.LJIIJJI, c0lxpLIZLLL.LJIIL, c0lxpLIZLLL.LJIILIIL, c0lxpLIZLLL.LJIILJJIL), C2097608Jq.LJ());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCStatusHandler@5733.logAiTaskCreate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
