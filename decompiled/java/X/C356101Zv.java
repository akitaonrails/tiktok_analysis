package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel$bannerUiStateFlow$2$1", f = "BaseTopGuestGamePlayViewModel.kt", l = {}, m = "invokeSuspend")
public final class C356101Zv extends C09AX implements InterfaceC1631630sYr<Integer, Long, Boolean, InterfaceC1364105Vn<? super C356201Zw>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ long LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BaseTopGuestGamePlayViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C356101Zv(BaseTopGuestGamePlayViewModel baseTopGuestGamePlayViewModel, InterfaceC1364105Vn<? super C356101Zv> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = baseTopGuestGamePlayViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseTopGuestGamePlayViewModel@dcd6.bannerUiStateFlow$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        long j = this.LLILLJJLI;
        C356201Zw c356201Zw = new C356201Zw(i, C2286608xc.LJFF(j), this.LLILLL);
        this.LLILZ.LL = c356201Zw;
        C1C7U.LIZIZ("BaseTopGuestGamePlayViewModel@dcd6.bannerUiStateFlow$2$1");
        return c356201Zw;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Integer num, Long l, Boolean bool, InterfaceC1364105Vn<? super C356201Zw> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        long jLongValue = l.longValue();
        boolean zBooleanValue = bool.booleanValue();
        C356101Zv c356101Zv = new C356101Zv(this.LLILZ, interfaceC1364105Vn);
        c356101Zv.LL = iIntValue;
        c356101Zv.LLILLJJLI = jLongValue;
        c356101Zv.LLILLL = zBooleanValue;
        return c356101Zv.invokeSuspend(Unit.LIZ);
    }
}
