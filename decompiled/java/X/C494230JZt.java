package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494230JZt extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C127A LL;
    public final /* synthetic */ SubOnlyLiveSettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494230JZt(C127A c127a, SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(0);
        this.LL = c127a;
        this.LLILLJJLI = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C0JYM c0jym;
        boolean z = false;
        if (!this.LL.LJIILIIL() && (c0jym = (C0JYM) DataChannelGlobal.LLILZ.gg0(C931350aLN.class)) != null) {
            final SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LLILLJJLI;
            C127A c127a = this.LL;
            Integer numLIZ = c0jym.LIZ();
            if (numLIZ != null && (numLIZ.intValue() == 1 || numLIZ.intValue() == 2)) {
                final int iIntValue = numLIZ.intValue();
                final C494300Ja0 c494300Ja0 = new C494300Ja0(c0jym, c127a);
                subOnlyLiveSettingFragment.getClass();
                C782110Um9 c782110Um9 = new C782110Um9(subOnlyLiveSettingFragment.getContext());
                c782110Um9.LJIIZILJ(2131856077);
                c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131856074));
                C494720Jag c494720Jag = new C494720Jag();
                C755620TkW c755620TkW = new C755620TkW();
                c755620TkW.LIZ = C497740JfY.LJIJI(2131856076);
                c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZy
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        subOnlyLiveSettingFragment.PR(iIntValue, "click", "switch");
                        c494300Ja0.invoke();
                        liveDialog.dismiss();
                    }
                };
                c494720Jag.LIZ(new C0TZ2(c755620TkW));
                C755630TkX c755630TkX = new C755630TkX();
                c755630TkX.LIZ = C497740JfY.LJIJI(2131856053);
                c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0JZz
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        subOnlyLiveSettingFragment.PR(iIntValue, "click", "cancel");
                        liveDialog.dismiss();
                    }
                };
                c494720Jag.LIZ(new C0TZ3(c755630TkX));
                c494720Jag.LIZIZ = 1;
                c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LJIILL = false;
                C786410Ut5.E4(c782110Um9.LIZ());
                subOnlyLiveSettingFragment.PR(iIntValue, "show", null);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
