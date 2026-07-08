package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ja8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494380Ja8 extends C09AY implements Function2<C03H5, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494380Ja8(SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew) {
        super(2);
        this.LL = subOnlyLivePreviewSettingDialogNew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        C127K c127k = this.LL.LLIZ;
        if (c127k != null) {
            c127k.setCellEnabled(((Boolean) c291001Au2.LIZ).booleanValue());
        }
        return Unit.LIZ;
    }
}
