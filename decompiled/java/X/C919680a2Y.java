package X;

import android.app.Activity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS100S0201000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0a2Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C919680a2Y extends C09AY implements Function2<Long, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ MultiGuestV3GuestPresenter LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C919680a2Y(boolean z, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, String str) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = multiGuestV3GuestPresenter;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Integer num) {
        Activity activityLJIJ;
        Long l2 = l;
        int iIntValue = num.intValue();
        if (this.LL) {
            this.LLILLJJLI.showBeautySettingDialog(l2, iIntValue);
        } else {
            T t = this.LLILLJJLI.mView;
            if (t != 0 && (activityLJIJ = C520010KaN.LJIJ(((InterfaceC919320a1y) t).getContext(), false)) != null) {
                boolean z = C925080aBG.LIZ;
                MultiGuestV3GuestPresenter multiGuestV3GuestPresenter = this.LLILLJJLI;
                C925080aBG.LIZ(false, multiGuestV3GuestPresenter.mDataChannel, iIntValue, activityLJIJ, l2, this.LLILLL, new AwS100S0201000_15(multiGuestV3GuestPresenter, l2, iIntValue, 2), new AwS559S0100000_15(this.LLILLJJLI, 275));
            }
        }
        return Unit.LIZ;
    }
}
