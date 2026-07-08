package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS59S1000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl$saveDraft$draftByTaskMatcher$1", f = "AITheaterAutoTaskServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C535430KzF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535430KzF(String str, InterfaceC1364105Vn<? super C535430KzF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535430KzF(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterAutoTaskServiceImpl@5fbc.saveDraft$draftByTaskMatcher$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objLJJJLL = C13LP.LJJJLL(C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, true, EnumC562220M3g.NORMAL, null, new AwS59S1000000_8(this.LL, 9), 56)));
        C1C7U.LIZIZ("AITheaterAutoTaskServiceImpl@5fbc.saveDraft$draftByTaskMatcher$1");
        return objLJJJLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
