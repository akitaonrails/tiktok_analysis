package X;

import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LaX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.service.CreativeDraftUpdateServiceImpl$updateDB$2", f = "DraftUpdateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C545590LaX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DraftDBSaveResult>, Object> {
    public final /* synthetic */ C545640Lac LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545590LaX(C545640Lac c545640Lac, InterfaceC1364105Vn<? super C545590LaX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c545640Lac;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545590LaX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreativeDraftUpdateServiceImpl@1350.updateDB$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DraftDBSaveResult draftDBSaveResultLIZ = C0M2R.LIZ(this.LL);
        C1C7U.LIZIZ("CreativeDraftUpdateServiceImpl@1350.updateDB$2");
        return draftDBSaveResultLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DraftDBSaveResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
