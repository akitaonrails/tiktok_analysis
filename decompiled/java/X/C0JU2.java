package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JU2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JU2 extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU2(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(2);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        C127M accessory;
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            boolean zBooleanValue = ((Boolean) c291001Au2.LIZ).booleanValue();
            C127K c127k = this.LL.LLJI;
            C127M accessory2 = null;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            if (accessory instanceof C127A) {
                C127K c127k2 = this.LL.LLJI;
                if (c127k2 != null) {
                    accessory2 = c127k2.getAccessory();
                }
                ((C11GO) accessory2).LJIILJJIL(zBooleanValue);
            }
        }
        return Unit.LIZ;
    }
}
