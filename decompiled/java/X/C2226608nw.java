package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.service.MentionRiskController$quickMentionRisk$1$1", f = "MentionRiskController.kt", l = {}, m = "invokeSuspend")
public final class C2226608nw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Exception LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226608nw(Exception exc, InterfaceC1364105Vn<? super C2226608nw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2226608nw(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionRiskController@8dc9.quickMentionRisk$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Exception exc = this.LL;
        if (exc != null) {
            C2226708nx.LIZ.LIZIZ(exc, null);
        } else {
            C2226708nx.LIZ.LJ(null, false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MentionRiskController@8dc9.quickMentionRisk$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
