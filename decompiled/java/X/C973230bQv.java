package X;

import Y.AAListenerS267S0200000_15;
import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMatchForceNotUseCacheSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS381S0200000_15;
import njp.a;

/* JADX INFO: renamed from: X.0bQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.basic.MatchStartAnimationComponent$show$1$2", f = "MatchStartAnimationComponent.kt", l = {}, m = "invokeSuspend")
public final class C973230bQv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C978020bYe LL;
    public final /* synthetic */ C973200bQs LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C973230bQv(C978020bYe c978020bYe, C973200bQs c973200bQs, InterfaceC1364105Vn<? super C973230bQv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c978020bYe;
        this.LLILLJJLI = c973200bQs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C973230bQv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1295960jpS c1295960jpS;
        C1C7U.LIZ("MatchStartAnimationComponent@2dd0.show$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C978020bYe c978020bYe = this.LL;
        C973200bQs c973200bQs = this.LLILLJJLI;
        c978020bYe.LJIIJ();
        ViewGroup viewGroup = c978020bYe.LLILLL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        C1295960jpS c1295960jpS2 = c978020bYe.LLILZ;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setProgress(0.0f);
        }
        C1295960jpS c1295960jpS3 = c978020bYe.LLILZ;
        if (c1295960jpS3 != null) {
            C786410Ut5.LLD(0, c1295960jpS3);
        }
        C1295960jpS c1295960jpS4 = c978020bYe.LLILZ;
        if (c1295960jpS4 != null) {
            c1295960jpS4.removeAllAnimatorListeners();
        }
        if (Build.VERSION.SDK_INT > 26 && (c1295960jpS = c978020bYe.LLILZ) != null) {
            c1295960jpS.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C1295960jpS c1295960jpS5 = c978020bYe.LLILZ;
        if (c1295960jpS5 != null) {
            c1295960jpS5.addAnimatorListener(new AAListenerS267S0200000_15(c978020bYe, c1295960jpS5, 4));
            C1143680frq.LJIIL(c978020bYe.LLILZ, c973200bQs.LIZ, c973200bQs.LIZIZ, "images", true, new C987220bnU(c978020bYe, new C118300cf(), 0), Boolean.valueOf(LiveMatchForceNotUseCacheSetting.INSTANCE.isEnable()), new AwS381S0200000_15(c978020bYe, c973200bQs, 72));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchStartAnimationComponent@2dd0.show$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
