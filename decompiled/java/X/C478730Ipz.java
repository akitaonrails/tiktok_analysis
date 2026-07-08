package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel;

/* JADX INFO: renamed from: X.0Ipz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel", f = "HangoutRoomFeedViewModel.kt", l = {170}, m = "fetchPlayFeedData")
public final class C478730Ipz extends AbstractC23140094w {
    public EnumC479370Ir1 LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ HangoutRoomFeedViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478730Ipz(HangoutRoomFeedViewModel hangoutRoomFeedViewModel, InterfaceC1364105Vn<? super C478730Ipz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = hangoutRoomFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HangoutRoomFeedViewModel@eeb0.fetchPlayFeedData$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZIL.wQ2(null, null, this);
        C1C7U.LIZIZ("HangoutRoomFeedViewModel@eeb0.fetchPlayFeedData$1");
        return objWQ2;
    }
}
