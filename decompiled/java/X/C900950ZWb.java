package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.ability.PhotoSwapAnimationAbility;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS558S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0ZWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.view.IMPhotoSwapPongLottieView$1$onViewAttachedToWindow$1", f = "IMMediaMasksViews.kt", l = {}, m = "invokeSuspend")
public final class C900950ZWb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1295960jpS LL;
    public final /* synthetic */ C900940ZWa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C900950ZWb(C1295960jpS c1295960jpS, C900940ZWa c900940ZWa, InterfaceC1364105Vn<? super C900950ZWb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1295960jpS;
        this.LLILLJJLI = c900940ZWa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C900950ZWb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager;
        String strLIZ;
        C1C7U.LIZ("IMPhotoSwapPongLottieView@d691.<init>$1$onViewAttachedToWindow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1295960jpS c1295960jpS = this.LL;
        C786410Ut5.LLD(0, c1295960jpS);
        if (!c1295960jpS.isAnimating() && (iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpi$default(IDMGeckoCommonChannelManager.class, false, false, false, 14, null)) != null && (strLIZ = iDMGeckoCommonChannelManager.LIZ()) != null) {
            C20243914Iz.LIZ(c1295960jpS, strLIZ, new AwS558S0100000_14(c1295960jpS, 1465));
            c1295960jpS.addAnimatorListener(new C910690Zo3(c1295960jpS, new AwS558S0100000_14(c1295960jpS, 1466)));
        }
        try {
            PhotoSwapAnimationAbility photoSwapAnimationAbility = (PhotoSwapAnimationAbility) C1558520qew.LIZ(C1558360qeg.LJ(this.LLILLJJLI, null), PhotoSwapAnimationAbility.class, null);
            if (photoSwapAnimationAbility != null) {
                String str = this.LLILLJJLI.LLILLJJLI;
                if (str == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMPhotoSwapPongLottieView@d691.<init>$1$onViewAttachedToWindow$1");
                    return unit;
                }
                photoSwapAnimationAbility.gE0(str);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMPhotoSwapPongLottieView@d691.<init>$1$onViewAttachedToWindow$1");
        return unit2;
    }
}
