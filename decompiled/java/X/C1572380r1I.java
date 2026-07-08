package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedEntranceViewModel$fetchVibeFeedConfig$1$2$1$2", f = "VibeFeedEntranceViewModel.kt", l = {206}, m = "invokeSuspend")
public final class C1572380r1I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VibeFeedEntranceViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC912680ZrG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572380r1I(VibeFeedEntranceViewModel vibeFeedEntranceViewModel, String str, String str2, EnumC912680ZrG enumC912680ZrG, InterfaceC1364105Vn<? super C1572380r1I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedEntranceViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = enumC912680ZrG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1572380r1I(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedEntranceViewModel@aaa3.fetchVibeFeedConfig$1$2$1$2");
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
            long j = C1576040r7C.LJFF().configFetchInterval * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchVibeFeedConfig$1$2$1$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.xQ2(this.LLILLL, this.LLILZ, this.LLILZIL, true, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VibeFeedEntranceViewModel@aaa3.fetchVibeFeedConfig$1$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
