package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchResponse;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.EcClickSearchWord;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.network.EcClickSearchApiHelper$sendRequest$2$1$1", f = "EcClickSearchApiHelper.kt", l = {}, m = "invokeSuspend")
public final class C0PQT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ EcClickSearchResponse LLILLJJLI;
    public final /* synthetic */ EnumC645610PTz LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C0PQX, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0PQT(int i, EcClickSearchResponse ecClickSearchResponse, EnumC645610PTz enumC645610PTz, String str, String str2, String str3, Function1<? super C0PQX, Unit> function1, InterfaceC1364105Vn<? super C0PQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = ecClickSearchResponse;
        this.LLILLL = enumC645610PTz;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PQT(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("EcClickSearchApiHelper@6a3d.sendRequest$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request consume in ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(", cardIndex #");
        sbLIZ.append(this.LL);
        sbLIZ.append(", words: ");
        List<EcClickSearchWord> list = this.LLILLJJLI.wordsList;
        if (list != null) {
            numLJ = C2286608xc.LJ(list.size());
        } else {
            numLJ = null;
        }
        sbLIZ.append(numLJ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1202104n5.LIZ().LJJ(this.LLILLL, this.LLILZ, "request", "end request", Boolean.TRUE);
        this.LLIZ.invoke(new C0PQX(this.LLILLL, this.LLILZIL, this.LLILZ, this.LL, this.LLILZLL, (C0QRC) null, new C0QRC(this.LLILLJJLI), (C0QRC) null, (C0PUB) null, 0, 1920));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcClickSearchApiHelper@6a3d.sendRequest$2$1$1");
        return unit;
    }
}
