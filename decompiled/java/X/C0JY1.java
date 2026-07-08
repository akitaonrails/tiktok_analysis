package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JY1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JY1 extends C09AY implements Function2<C03H5, C493830JYf, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JY1(SubOnlyLiveSettingFragment subOnlyLiveSettingFragment) {
        super(2);
        this.LL = subOnlyLiveSettingFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C493830JYf c493830JYf) {
        C127M accessory;
        C493830JYf c493830JYf2 = c493830JYf;
        if (c493830JYf2 != null) {
            SubOnlyLiveSettingFragment subOnlyLiveSettingFragment = this.LL;
            C127K c127k = subOnlyLiveSettingFragment.LLJILLL;
            C127M accessory2 = null;
            if (c127k != null) {
                accessory = c127k.getAccessory();
            } else {
                accessory = null;
            }
            if (accessory instanceof C11G4) {
                C127K c127k2 = subOnlyLiveSettingFragment.LLJILLL;
                if (c127k2 != null) {
                    accessory2 = c127k2.getAccessory();
                }
                ((C11G4) accessory2).LJIILJJIL(c493830JYf2.LIZ);
            }
        }
        return Unit.LIZ;
    }
}
