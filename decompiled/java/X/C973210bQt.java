package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchForceNotUseCacheSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import njp.a;

/* JADX INFO: renamed from: X.0bQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.basic.MatchStartAnimationComponent$loadAnimationResource$1$1", f = "MatchStartAnimationComponent.kt", l = {}, m = "invokeSuspend")
public final class C973210bQt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C978020bYe LL;
    public final /* synthetic */ C973200bQs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973210bQt(C978020bYe c978020bYe, C973200bQs c973200bQs, InterfaceC1364105Vn<? super C973210bQt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c978020bYe;
        this.LLILLJJLI = c973200bQs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C973210bQt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C978020bYe c978020bYe = this.LL;
        C973200bQs c973200bQs = this.LLILLJJLI;
        if (c973200bQs != null) {
            C1143680frq.LJIIL(c978020bYe.LLILZ, c973200bQs.LIZ, c973200bQs.LIZIZ, "images", true, new C987230bnV(c978020bYe, 1), Boolean.valueOf(LiveMatchForceNotUseCacheSetting.INSTANCE.isEnable()), new AwS381S0200000_15(c978020bYe, c973200bQs, 71));
        } else {
            c978020bYe.getClass();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.loadAnimationResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
