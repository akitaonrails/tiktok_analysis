package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailFragment;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubHideBackContainerSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504940JrA extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ SubSpaceDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504940JrA(SubSpaceDetailFragment subSpaceDetailFragment) {
        super(1);
        this.LL = subSpaceDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        View view;
        boolean zBooleanValue = bool.booleanValue();
        C504880Jr4 c504880Jr4RR = this.LL.RR();
        if (c504880Jr4RR != null && !c504880Jr4RR.LLJJJ) {
            C504880Jr4 c504880Jr4RR2 = this.LL.RR();
            if (c504880Jr4RR2 != null) {
                c504880Jr4RR2.LLJJJ = zBooleanValue;
            }
            if (zBooleanValue && LiveFansClubHideBackContainerSettings.INSTANCE.getValue() && (view = this.LL.LLJI) != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
        }
        return Unit.LIZ;
    }
}
