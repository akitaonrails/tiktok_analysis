package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipfeed.player.AnalyticsController$reportAwemeShowStatus$1", f = "AnalyticsController.kt", l = {}, m = "invokeSuspend")
public final class C590670NEr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0N3R LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0N3W LLILLL;
    public final /* synthetic */ C1480420ocy LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C590670NEr(C0N3R c0n3r, String str, C0N3W c0n3w, C1480420ocy c1480420ocy, Aweme aweme, InterfaceC1364105Vn<? super C590670NEr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0n3r;
        this.LLILLJJLI = str;
        this.LLILLL = c0n3w;
        this.LLILZ = c1480420ocy;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590670NEr(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnalyticsController@1751.reportAwemeShowStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LL.LLJ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportAwemeShowStatus] ");
        sbLIZ.append(this.LLILLJJLI);
        abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        C0N3W c0n3w = this.LLILLL;
        String str = c0n3w.LIZJ;
        int i = c0n3w.LIZIZ;
        String sourceId = this.LLILZ.getSourceId();
        int awemeType = this.LLILZIL.getAwemeType();
        Aweme aweme = this.LLILZIL;
        C1387270mCj.LIZ(i, awemeType, aweme, str, sourceId, aweme.getRequestId());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnalyticsController@1751.reportAwemeShowStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
