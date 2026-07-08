package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS252S0000000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cBX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.realtimeres.AdOnlineInterceptor$logWithPrefetchedResource$2", f = "AdOnlineInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C1002130cBX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1041250dCd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002130cBX(C1041250dCd c1041250dCd, InterfaceC1364105Vn<? super C1002130cBX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1041250dCd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002130cBX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdOnlineInterceptor@ad94.logWithPrefetchedResource$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger();
        C1043510dGH.LIZ.getClass();
        adWebEventLogger.logAd(C1043510dGH.LJJIII, String.valueOf(this.LL.LIZLLL.getRealCreativeId()), this.LL.LIZLLL.getRealLogExtra(), CardStruct.IStatusCode.DEFAULT);
        C1001830cB3 c1001830cB3 = new C1001830cB3(new Object[0]);
        C1042680dEw.LIZ.getClass();
        c1001830cB3.log(C1042680dEw.LJIIJ, AFwS252S0000000_16.get$arr$(574));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdOnlineInterceptor@ad94.logWithPrefetchedResource$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
