package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLivePreviewSettingFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492590JTl extends C09AY implements Function0<C492630JTp> {
    public final /* synthetic */ SubOnlyLivePreviewSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492590JTl(SubOnlyLivePreviewSettingFragment subOnlyLivePreviewSettingFragment) {
        super(0);
        this.LL = subOnlyLivePreviewSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C492630JTp invoke() {
        Context context = this.LL.getContext();
        this.LL.LLILZ.getValue();
        return new C492630JTp(context, this.LL.LL);
    }
}
