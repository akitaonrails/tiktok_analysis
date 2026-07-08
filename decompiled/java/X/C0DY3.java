package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import j27.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DY3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.awemepool.SearchAwemePoolUltraProMax$createDualStreamModel$2$build$1$2$2$loadMore$2$1$2$2", f = "SearchAwemePoolUltraProMax.kt", l = {}, m = "invokeSuspend")
public final class C0DY3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Object, Unit> LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ s LLILLL;
    public final /* synthetic */ C0DQP LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C054000Hq LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DY3(Function1<Object, Unit> function1, List<? extends Aweme> list, s sVar, C0DQP c0dqp, Map<String, String> map, C054000Hq c054000Hq, InterfaceC1364105Vn<? super C0DY3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = list;
        this.LLILLL = sVar;
        this.LLILZ = c0dqp;
        this.LLILZIL = map;
        this.LLILZLL = c054000Hq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DY3(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        String str;
        C1C7U.LIZ("SearchAwemePoolUltraProMax@5df8.createDualStreamModel$2$build$1$2$2$loadMore$2$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        s sVar = this.LLILLL;
        if (sVar != null) {
            objLIZ = C0DYC.LIZ(sVar, "*_search_lynx_context_token_type");
        } else {
            objLIZ = null;
        }
        if (!(objLIZ instanceof String) || (str = (String) objLIZ) == null) {
            str = "";
        }
        if (C293270BeX.LIZ(str)) {
            C651640PhC c651640PhC = C651640PhC.LIZIZ;
            ArrayList<String> arrayList = this.LLILZ.LJII;
            c651640PhC.getClass();
            C651640PhC.LIZLLL(arrayList);
        }
        List<Aweme> list = this.LLILLJJLI;
        C0DQP c0dqp = this.LLILZ;
        s sVar2 = this.LLILLL;
        for (Aweme aweme : list) {
            C651640PhC.LIZIZ.getClass();
            C651640PhC.LIZ(aweme, c0dqp, false, false);
            C651640PhC.LIZIZ(aweme, sVar2);
            C651640PhC.LIZJ(aweme, c0dqp);
        }
        if (C301260BrQ.LIZ()) {
            C0QAQ.LIZ(this.LLILLJJLI, this.LLILZIL, this.LLILZLL, null, this.LLILZ.LJII.size() - this.LLILLJJLI.size());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAwemePoolUltraProMax@5df8.createDualStreamModel$2$build$1$2$2$loadMore$2$1$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
