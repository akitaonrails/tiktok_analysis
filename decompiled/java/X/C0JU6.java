package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JU6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JU6 extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU6(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(2);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C127K c127k = this.LL.LLJI;
        if (c127k != null) {
            c127k.setCellEnabled(zBooleanValue);
        }
        return Unit.LIZ;
    }
}
