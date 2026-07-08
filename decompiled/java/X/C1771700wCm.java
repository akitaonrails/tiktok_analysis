package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixView$trackRDLoadMore$1", f = "ShopMallMixView.kt", l = {}, m = "invokeSuspend")
public final class C1771700wCm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1773310wFN LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1771590wCb LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771700wCm(InterfaceC1773310wFN interfaceC1773310wFN, long j, long j2, int i, C1771590wCb c1771590wCb, boolean z, String str, InterfaceC1364105Vn<? super C1771700wCm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1773310wFN;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = i;
        this.LLILZIL = c1771590wCb;
        this.LLILZLL = z;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771700wCm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        InterfaceC1773850wGF interfaceC1773850wGF;
        long j;
        C1C7U.LIZ("ShopMallMixView@f924.trackRDLoadMore$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1773310wFN interfaceC1773310wFN = this.LL;
        if (interfaceC1773310wFN != null && (interfaceC1773890wGJLIZJ = interfaceC1773310wFN.LIZJ()) != null && (interfaceC1773850wGF = (InterfaceC1773850wGF) interfaceC1773890wGJLIZJ.getService(InterfaceC1773850wGF.class)) != null) {
            Pair[] pairArr = new Pair[11];
            pairArr[0] = new Pair("t_loadmore_start", C2286608xc.LJFF(this.LLILLJJLI));
            pairArr[1] = new Pair("t_loadmore_end", C2286608xc.LJFF(this.LLILLL));
            pairArr[2] = new Pair("loading_visible", C2286608xc.LJ(this.LLILZ));
            String str = this.LLILZIL.LIZ;
            if (str == null) {
                str = "";
            }
            pairArr[3] = new Pair("tab_id", str);
            pairArr[4] = new Pair("load_success", C2286608xc.LJ(this.LLILZLL ? 1 : 0));
            pairArr[5] = new Pair("error_msg", this.LLIZ);
            pairArr[6] = new Pair("reason", this.LLILZIL.LJI);
            pairArr[7] = new Pair("t_loadmore_show", C2286608xc.LJFF(C1771590wCb.LJIIZILJ));
            long j2 = C1771590wCb.LJIIZILJ;
            long j3 = 0;
            if (j2 == 0) {
                j = 0;
            } else {
                j = j2 - this.LLILLJJLI;
            }
            pairArr[8] = new Pair("loading_show_befor_dur", C2286608xc.LJFF(j));
            long j4 = C1771590wCb.LJIIZILJ;
            if (j4 != 0) {
                j3 = this.LLILLL - j4;
            }
            pairArr[9] = new Pair("loading_show_dur", C2286608xc.LJFF(j3));
            pairArr[10] = new Pair("order", C2286608xc.LJ(this.LLILZIL.LJIILL));
            Boolean.valueOf(interfaceC1773850wGF.LJFF(new C1774950wI1("rd_mixmall_perf_loadmore", C2097608Jq.LJIIIIZZ(pairArr), 0, 0, null, 100).LIZ(), null));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixView@f924.trackRDLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
