package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M09, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryPostedDraftEntrance$draftsInfo$1", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0M09 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C553680Lna>, Object> {
    public C0M09(InterfaceC1364105Vn<? super C0M09> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M09(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.queryPostedDraftEntrance$draftsInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C553680Lna c553680LnaQueryDraftsInfo = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftsInfo(new C0M4M(false, false, EnumC562220M3g.POSTED, (C562260M3k) null, 27));
        C1C7U.LIZIZ("DraftViewModel@38a5.queryPostedDraftEntrance$draftsInfo$1");
        return c553680LnaQueryDraftsInfo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C553680Lna> interfaceC1364105Vn) {
        return new C0M09(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
