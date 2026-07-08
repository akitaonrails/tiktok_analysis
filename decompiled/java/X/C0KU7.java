package X;

import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KU7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.service.DraftListenerServiceImpl$notifyUpdated$1", f = "DraftListenerServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0KU7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IDraftListener.UpdateParams LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KU7(IDraftListener.UpdateParams updateParams, InterfaceC1364105Vn<? super C0KU7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = updateParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KU7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftListenerServiceImpl@1fc5.notifyUpdated$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IDraftListener> list = C0KU8.LIZIZ;
        IDraftListener.UpdateParams updateParams = this.LL;
        for (IDraftListener iDraftListener : list) {
            if (updateParams == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftListenerServiceImpl@1fc5.notifyUpdated$1");
                return unit;
            }
            if (iDraftListener != null) {
                iDraftListener.onUpdated(updateParams);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftListenerServiceImpl@1fc5.notifyUpdated$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
