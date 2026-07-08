package X;

import android.animation.ValueAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Hq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.bot.chat.title.BotTitleBarCenterAssem$initSubscribe$6$1", f = "BotTitleBarCenterAssem.kt", l = {140}, m = "invokeSuspend")
public final class C1328005Hq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ValueAnimator LLILLJJLI;
    public final /* synthetic */ C291001Au<C05YD<Integer>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1328005Hq(ValueAnimator valueAnimator, C291001Au<? extends C05YD<Integer>> c291001Au, InterfaceC1364105Vn<? super C1328005Hq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = valueAnimator;
        this.LLILLL = c291001Au;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1328005Hq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BotTitleBarCenterAssem@884c.initSubscribe$6$1");
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
            ValueAnimator valueAnimator = this.LLILLJJLI;
            C05YD<Integer> c05yd = this.LLILLL.LIZ;
            this.LL = 1;
            if (C1590306Kn.LIZIZ(valueAnimator, c05yd, this) == objLJFF) {
                C1C7U.LIZIZ("BotTitleBarCenterAssem@884c.initSubscribe$6$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotTitleBarCenterAssem@884c.initSubscribe$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
