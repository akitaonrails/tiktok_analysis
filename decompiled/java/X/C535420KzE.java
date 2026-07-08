package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS122S1100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KzE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.DraftServiceImpl$queryDraftByServerTaskId$draftByTaskMatcher$1", f = "DraftServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C535420KzE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function1<CreativeModel, String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C535420KzE(String str, Function1<? super CreativeModel, String> function1, InterfaceC1364105Vn<? super C535420KzE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535420KzE(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftServiceImpl@2753.queryDraftByServerTaskId$draftByTaskMatcher$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLL = C13LP.LJJJLL(C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, true, EnumC562220M3g.NORMAL, null, new AwS122S1100000_8(this.LL, (String) this.LLILLJJLI, (Function1<? super CreativeModel, String>) 1), 56)));
        C1C7U.LIZIZ("DraftServiceImpl@2753.queryDraftByServerTaskId$draftByTaskMatcher$1");
        return objLJJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
