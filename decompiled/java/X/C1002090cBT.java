package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS16S2000000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.realtimeres.CommerceLandPageRealtimeResourceModule$prefetchHTML$1", f = "CommerceLandPageRealtimeResourceModule.kt", l = {}, m = "invokeSuspend")
public final class C1002090cBT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AwemeRawAd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002090cBT(String str, AwemeRawAd awemeRawAd, InterfaceC1364105Vn<? super C1002090cBT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = awemeRawAd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002090cBT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchHTML$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1042130dE3 c1042130dE3 = C1042130dE3.LIZ;
        String str = this.LL;
        c1042130dE3.getClass();
        new AdWebEventLogger().logAd(C1002100cBU.LIZ, this.LLILLJJLI, new AwS16S2000000_16(this.LL, C1042130dE3.LJFF(str), 5));
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, AFwS252S0000000_16.get$arr$(575));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandPageRealtimeResourceModule@7cec.prefetchHTML$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
