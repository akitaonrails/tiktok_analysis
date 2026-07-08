package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493930JYp extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493930JYp(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(1);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C127M accessory;
        C127K c127k;
        boolean zBooleanValue = bool.booleanValue();
        C127K c127k2 = this.LL.LLIZLLLIL;
        C127M accessory2 = null;
        if (c127k2 != null) {
            accessory = c127k2.getAccessory();
        } else {
            accessory = null;
        }
        if (accessory instanceof C11G4) {
            C127K c127k3 = this.LL.LLIZLLLIL;
            if (c127k3 != null) {
                accessory2 = c127k3.getAccessory();
            }
            C11G4 c11g4 = (C11G4) accessory2;
            SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
            if (!zBooleanValue) {
                if (C494680Jac.LIZ(subOnlyLiveSettingDialogNew.LLJJJIL) && (c127k = subOnlyLiveSettingDialogNew.LLIZLLLIL) != null) {
                    c127k.setCellEnabled(false);
                }
                c11g4.LJIILJJIL(C497740JfY.LJIJI(2131844230));
            } else {
                c11g4.LJIILJJIL(C497740JfY.LJIJI(2131844231));
            }
            c11g4.LJIILLIIL(true);
        }
        return Unit.LIZ;
    }
}
