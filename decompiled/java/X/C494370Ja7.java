package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ja7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494370Ja7 extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494370Ja7(SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew) {
        super(2);
        this.LL = subOnlyLivePreviewSettingDialogNew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        C127M accessory;
        T t = c291001Au.LIZ;
        SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew = this.LL;
        boolean zBooleanValue = ((Boolean) t).booleanValue();
        C494680Jac.LJIL(zBooleanValue);
        C127K c127k = subOnlyLivePreviewSettingDialogNew.LLIZ;
        C127M accessory2 = null;
        if (c127k != null) {
            accessory = c127k.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C127A) {
            C127K c127k2 = subOnlyLivePreviewSettingDialogNew.LLIZ;
            if (c127k2 != null) {
                accessory2 = c127k2.getAccessory();
            }
            ((C11GO) accessory2).LJIILJJIL(zBooleanValue);
        }
        return Unit.LIZ;
    }
}
