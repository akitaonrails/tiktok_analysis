package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.RecordingRuleMatchHandler$onFormSubmit$1", f = "RecordingRuleMatchHandler.kt", l = {}, m = "invokeSuspend")
public final class C315050CWp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1042410dEV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315050CWp(C1042410dEV c1042410dEV, InterfaceC1364105Vn<? super C315050CWp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1042410dEV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315050CWp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingRuleMatchHandler@8539.onFormSubmit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1042400dEU.LIZ("form_submit", "", "", 0, 0L, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordingRuleMatchHandler@8539.onFormSubmit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
