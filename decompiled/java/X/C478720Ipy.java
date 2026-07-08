package X;

import com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ipy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.viewmodel.HangoutRoomFeedViewModel$refreshPlayFeedData$2", f = "HangoutRoomFeedViewModel.kt", l = {141}, m = "invokeSuspend")
public final class C478720Ipy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ HangoutRoomFeedViewModel LLILLJJLI;
    public final /* synthetic */ EnumC479370Ir1 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478720Ipy(HangoutRoomFeedViewModel hangoutRoomFeedViewModel, EnumC479370Ir1 enumC479370Ir1, String str, InterfaceC1364105Vn<? super C478720Ipy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = hangoutRoomFeedViewModel;
        this.LLILLL = enumC479370Ir1;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478720Ipy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HangoutRoomFeedViewModel@eeb0.refreshPlayFeedData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            HangoutRoomFeedViewModel hangoutRoomFeedViewModel = this.LLILLJJLI;
            EnumC479370Ir1 enumC479370Ir1 = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            if (hangoutRoomFeedViewModel.wQ2(enumC479370Ir1, str, this) == objLJFF) {
                C1C7U.LIZIZ("HangoutRoomFeedViewModel@eeb0.refreshPlayFeedData$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HangoutRoomFeedViewModel@eeb0.refreshPlayFeedData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
