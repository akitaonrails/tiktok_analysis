package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService$logSearchAdKeywordEvent$1", f = "SearchAdMainService.kt", l = {}, m = "invokeSuspend")
public final class C1002760cCY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002760cCY(Aweme aweme, String str, InterfaceC1364105Vn<? super C1002760cCY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002760cCY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdMainService@1d03.logSearchAdKeywordEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1002770cCZ c1002770cCZ = new C1002770cCZ(this.LL, this.LLILLJJLI);
        Aweme aweme = c1002770cCZ.LIZ;
        if (aweme != null && aweme.isAd()) {
            try {
                c1002770cCZ.logAd(C1002780cCa.LIZ, c1002770cCZ.LIZ.getAwemeRawAd());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdMainService@1d03.logSearchAdKeywordEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
