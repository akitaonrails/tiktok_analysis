package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftRestoreHelper$restoreNLEData$1", f = "DraftRestoreHelper.kt", l = {}, m = "invokeSuspend")
public final class C570600MZm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ InterfaceC570740Ma0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C570600MZm(AwemeDraft awemeDraft, InterfaceC570740Ma0 interfaceC570740Ma0, InterfaceC1364105Vn<? super C570600MZm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = interfaceC570740Ma0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C570600MZm(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftRestoreHelper@a88e.restoreNLEData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C570580MZk c570580MZk = C570580MZk.LIZ;
        AwemeDraft awemeDraft = this.LL;
        InterfaceC570740Ma0 interfaceC570740Ma0 = this.LLILLJJLI;
        c570580MZk.getClass();
        C570580MZk.LIZJ(awemeDraft, interfaceC570740Ma0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftRestoreHelper@a88e.restoreNLEData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
