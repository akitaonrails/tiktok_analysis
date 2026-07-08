package X;

import com.ss.android.ugc.aweme.search.fyp.insertcard.SearchInterestCardCurrentState;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.15b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.fyp.insertcard.SearchInsertTrendingCardProtocol$tryGetCardTypes$1$1", f = "SearchInsertTrendingCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C20549915b7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20549115az LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ CardShowInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20549915b7(C20549115az c20549115az, int i, int i2, long j, Integer num, CardShowInfo cardShowInfo, InterfaceC1364105Vn<? super C20549915b7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20549115az;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = j;
        this.LLILZIL = num;
        this.LLILZLL = cardShowInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20549915b7(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("SearchInsertTrendingCardProtocol@4a29.tryGetCardTypes$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20549115az c20549115az = this.LL;
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        long j = this.LLILZ;
        Integer num = this.LLILZIL;
        CardShowInfo cardShowInfo = this.LLILZLL;
        c20549115az.getClass();
        if (cardShowInfo != null) {
            if (i2 == EnumC20550015b8.STATE_FREQ_SUCCESS.getState()) {
                i = 1;
            } else {
                i = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(i, "pass");
            c2344009Gk.LJ(cardShowInfo, "freq_control_config");
            c2344009Gk.LJIIIIZZ("card_type", String.valueOf(i3));
            C20550115b9.LIZ.getClass();
            c2344009Gk.LJ(new SearchInterestCardCurrentState(num, Integer.valueOf(C20550115b9.LJIIIIZZ(i3)), Integer.valueOf(C20550115b9.LJIIJ(i3)), Integer.valueOf(C20550115b9.LIZJ(i3)), Long.valueOf(j), Long.valueOf(C20550115b9.LJFF(i3)), Integer.valueOf(C20550115b9.LIZIZ(i3)), Long.valueOf(C20550115b9.LJIIIZ(i3)), Integer.valueOf(cardShowInfo.intervalMaxShowCount - C20550115b9.LJI(i3))), "current_state_info");
            if (i == 0) {
                c2344009Gk.LIZJ(i2, "failed_reason");
            }
            C20684815ws.LJIILLIIL("feed_search_interest_card_freq_check", c2344009Gk.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchInsertTrendingCardProtocol@4a29.tryGetCardTypes$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
