package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.draft.IDraftListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KU6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.service.DraftListenerServiceImpl$notifyDeleted$1", f = "DraftListenerServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0KU6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KU6(AwemeDraft awemeDraft, InterfaceC1364105Vn<? super C0KU6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KU6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftListenerServiceImpl@1fc5.notifyDeleted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IDraftListener> listLJLJJLL = C13LP.LJLJJLL(C0KU8.LIZIZ);
        AwemeDraft awemeDraft = this.LL;
        for (IDraftListener iDraftListener : listLJLJJLL) {
            if (iDraftListener != null) {
                iDraftListener.onDeleted(awemeDraft);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftListenerServiceImpl@1fc5.notifyDeleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
