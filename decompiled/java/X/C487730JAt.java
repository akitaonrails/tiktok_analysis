package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487730JAt extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487730JAt(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(2);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        ((Boolean) c291001Au.LIZ).booleanValue();
        this.LL.close(1);
        return Unit.LIZ;
    }
}
