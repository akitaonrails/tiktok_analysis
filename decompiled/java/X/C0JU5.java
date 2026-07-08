package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JU5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JU5 extends C09AY implements Function2<C03H5, Boolean, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JU5(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(2);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C197039127h c197039127h = this.LL.LLILZLL;
        if (c197039127h != null) {
            c197039127h.setEnabled(zBooleanValue);
        }
        C127K c127k = this.LL.LLJJIJIL;
        if (c127k != null) {
            c127k.setCellEnabled(zBooleanValue);
        }
        if (!zBooleanValue) {
            SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
            if (subOnlyLiveSettingDialogNew.LLJJL) {
                C197039127h c197039127h2 = subOnlyLiveSettingDialogNew.LLILZLL;
                if (c197039127h2 != null) {
                    c197039127h2.setText(C497740JfY.LJIJI(2131856611));
                }
            } else {
                C197039127h c197039127h3 = subOnlyLiveSettingDialogNew.LLILZLL;
                if (c197039127h3 != null) {
                    c197039127h3.setText(C497740JfY.LJIJI(2131857036));
                }
            }
            C197039127h c197039127h4 = this.LL.LLILZLL;
            if (c197039127h4 != null) {
                c197039127h4.setButtonStartIcon(Integer.valueOf(R.raw.icon_tick_fill));
            }
        } else {
            SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew2 = this.LL;
            if (subOnlyLiveSettingDialogNew2.LLJJL) {
                C197039127h c197039127h5 = subOnlyLiveSettingDialogNew2.LLILZLL;
                if (c197039127h5 != null) {
                    c197039127h5.setText(C497740JfY.LJIJI(2131856610));
                }
            } else {
                C197039127h c197039127h6 = subOnlyLiveSettingDialogNew2.LLILZLL;
                if (c197039127h6 != null) {
                    c197039127h6.setText(C497740JfY.LJIJI(2131857035));
                }
            }
            C197039127h c197039127h7 = this.LL.LLILZLL;
            if (c197039127h7 != null) {
                c197039127h7.setButtonStartIcon(null);
            }
        }
        return Unit.LIZ;
    }
}
