package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertMusicManager$init$4$1", f = "AmberAlertMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C15538066m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15542066q LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15538066m(C15542066q c15542066q, InterfaceC1364105Vn<? super C15538066m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15542066q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15538066m(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20498815Ja c20498815Ja;
        C1C7U.LIZ("AmberAlertMusicManager@7d2b.init$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15542066q c15542066q = this.LL;
        C1485060okS c1485060okS = c15542066q.LIZLLL;
        if (c1485060okS != null && (c20498815Ja = c15542066q.LIZJ) != null) {
            c20498815Ja.LIZIZ(c1485060okS);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.init$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
