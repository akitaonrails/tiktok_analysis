package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491680JPy extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491680JPy(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(1);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        c062p.LIZ = new C491690JPz(C500260Jjc.LJJLIIIIJ(C475510Ikn.LJ(this.LL)), this.LL.LLJLLL);
        return Unit.LIZ;
    }
}
