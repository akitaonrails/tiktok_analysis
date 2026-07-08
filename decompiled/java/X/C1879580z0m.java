package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$openAweme$1$2$onSuccess$1", f = "WHFeedsBridgeModel.kt", l = {200, 206}, m = "invokeSuspend")
public final class C1879580z0m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public C118300cf LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C1884130z87 LLILZIL;
    public final /* synthetic */ InterfaceC1876740ywC LLILZLL;
    public final /* synthetic */ InterfaceC1876240yvO<InterfaceC1876690yw7> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879580z0m(C118300cf c118300cf, C1884130z87 c1884130z87, InterfaceC1876740ywC interfaceC1876740ywC, InterfaceC1876240yvO<InterfaceC1876690yw7> interfaceC1876240yvO, InterfaceC1364105Vn<? super C1879580z0m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c118300cf;
        this.LLILZIL = c1884130z87;
        this.LLILZLL = interfaceC1876740ywC;
        this.LLIZ = interfaceC1876240yvO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879580z0m(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C118300cf c118300cf;
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1879650z0t c1879650z0t = this.LLILZIL.LLJILJILJ;
                    String awemeId = this.LLILZLL.getAweme().getAwemeId();
                    int i2 = this.LLILZ.element;
                    c1879650z0t.getClass();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C20684815ws.LJIILLIIL("ac_open_detail_success", C2097608Jq.LJIIIIZZ(new Pair("start_timestamp", String.valueOf(c1879650z0t.LIZLLL)), new Pair("end_timestamp", String.valueOf(jCurrentTimeMillis2)), new Pair("duration", String.valueOf(jCurrentTimeMillis2 - c1879650z0t.LIZLLL)), new Pair("aweme_id", awemeId), new Pair("react_id", c1879650z0t.LIZ), new Pair("init_index", String.valueOf(i2)), new Pair("page_name", "watch_history"), new Pair("is_exp", String.valueOf(1))));
                    this.LLIZ.onSuccess((InterfaceC1876690yw7) C1909107dp.LIZJ(InterfaceC1876690yw7.class, this.LLILZLL.getReactId()));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            c118300cf = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            c118300cf = this.LLILZ;
            C1884130z87 c1884130z87 = this.LLILZIL;
            InterfaceC1876730ywB aweme = this.LLILZLL.getAweme();
            InterfaceC1876240yvO<InterfaceC1876690yw7> interfaceC1876240yvO = this.LLIZ;
            this.LLILLJJLI = c118300cf;
            this.LL = jCurrentTimeMillis;
            this.LLILLL = 1;
            obj = c1884130z87.LJIIL(aweme, interfaceC1876240yvO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1");
                return objLJFF;
            }
        }
        c118300cf.element = ((Number) obj).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Get aweme index [");
        sbLIZ.append(this.LLILZ.element);
        sbLIZ.append("], cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append("ms");
        C2188811AlT.LIZIZ(sbLIZ);
        C118300cf c118300cf2 = this.LLILZ;
        if (c118300cf2.element >= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1065810dqF c1065810dqF = new C1065810dqF(this.LLILZIL, c118300cf2, null);
            this.LLILLJJLI = null;
            this.LLILLL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1065810dqF) == objLJFF) {
                C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1");
                return objLJFF;
            }
            C1879650z0t c1879650z0t2 = this.LLILZIL.LLJILJILJ;
            String awemeId2 = this.LLILZLL.getAweme().getAwemeId();
            int i22 = this.LLILZ.element;
            c1879650z0t2.getClass();
            long jCurrentTimeMillis22 = System.currentTimeMillis();
            C20684815ws.LJIILLIIL("ac_open_detail_success", C2097608Jq.LJIIIIZZ(new Pair("start_timestamp", String.valueOf(c1879650z0t2.LIZLLL)), new Pair("end_timestamp", String.valueOf(jCurrentTimeMillis22)), new Pair("duration", String.valueOf(jCurrentTimeMillis22 - c1879650z0t2.LIZLLL)), new Pair("aweme_id", awemeId2), new Pair("react_id", c1879650z0t2.LIZ), new Pair("init_index", String.valueOf(i22)), new Pair("page_name", "watch_history"), new Pair("is_exp", String.valueOf(1))));
        }
        this.LLIZ.onSuccess((InterfaceC1876690yw7) C1909107dp.LIZJ(InterfaceC1876690yw7.class, this.LLILZLL.getReactId()));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.openAweme$1$2$onSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
