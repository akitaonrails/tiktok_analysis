package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C492720JTy extends C2217421BqW implements Function0<Unit> {
    public C492720JTy(Object obj) {
        super(0, obj, SubOnlyLiveSettingFragment.class, "onPreviewPageExit", "onPreviewPageExit()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = (SubOnlyLiveSettingFragment) this.receiver;
        if (subOnlyLiveSettingFragment.LLJJJIL) {
            ((InterfaceC492700JTw) subOnlyLiveSettingFragment.LLJJJ.getValue()).LIZ(subOnlyLiveSettingFragment, new C492730JTz(subOnlyLiveSettingFragment));
        }
        return Unit.LIZ;
    }
}
