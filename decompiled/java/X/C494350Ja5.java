package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingDialogNew;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ja5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494350Ja5 extends C09AY implements Function0<C492630JTp> {
    public final /* synthetic */ SubOnlyLivePreviewSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494350Ja5(SubOnlyLivePreviewSettingDialogNew subOnlyLivePreviewSettingDialogNew) {
        super(0);
        this.LL = subOnlyLivePreviewSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C492630JTp invoke() {
        return new C492630JTp(this.LL.getContext(), this.LL.LL);
    }
}
