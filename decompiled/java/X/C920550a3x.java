package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0a3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920550a3x extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ MultiGuestV3GuestPresenter LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C920550a3x(int i, MultiGuestV3GuestPresenter multiGuestV3GuestPresenter, String str) {
        super(1);
        this.LL = multiGuestV3GuestPresenter;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        num.intValue();
        this.LL.showApplyDialog(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
