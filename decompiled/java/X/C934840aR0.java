package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C934840aR0 extends C2217421BqW implements Function0<Unit> {
    public C934840aR0(Object obj) {
        super(0, obj, MultiGuestModeratorSettingDialog.class, "updateDialogHeight", "updateDialogHeight()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BaseMultiLiveSettingView baseMultiLiveSettingView = (BaseMultiLiveSettingView) this.receiver;
        baseMultiLiveSettingView.LL.uC(baseMultiLiveSettingView.LLIZLLLIL, baseMultiLiveSettingView.LLIZ);
        baseMultiLiveSettingView.LLIZLLLIL = baseMultiLiveSettingView.LLIZ;
        return Unit.LIZ;
    }
}
