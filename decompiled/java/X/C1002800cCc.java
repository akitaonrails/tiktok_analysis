package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0000100_16;
import njp.a;

/* JADX INFO: renamed from: X.0cCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService$logSearchAdLiveDurationEvent$1", f = "SearchAdMainService.kt", l = {279}, m = "invokeSuspend")
public final class C1002800cCc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002800cCc(Aweme aweme, long j, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002800cCc(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdMainService@1d03.logSearchAdLiveDurationEvent$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdMainService@1d03.logSearchAdLiveDurationEvent$1");
                return objLJFF;
            }
        }
        Aweme aweme = this.LLILLL;
        SearchAdEventLogger searchAdEventLogger = new SearchAdEventLogger(aweme, C1010120cOQ.LJIIIIZZ(aweme));
        long j2 = this.LLILLJJLI;
        C1009980cOC.LIZ.getClass();
        searchAdEventLogger.logAd(C1009980cOC.LJIIZILJ, new AwS31S0000100_16(j2, 14));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("log EVENT_LIVE_INTERNAL_CLICK, delay time =  ");
        sbLIZ.append(j2);
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C2510609se.LIZ;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdMainService@1d03.logSearchAdLiveDurationEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
