package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.066p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.amberalert.v2.manager.AmberAlertMusicManager$resumeMusic$1", f = "AmberAlertMusicManager.kt", l = {}, m = "invokeSuspend")
public final class C15541066p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15542066q LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15541066p(C15542066q c15542066q, InterfaceC1364105Vn<? super C15541066p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15542066q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15541066p(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmberAlertMusicManager@7d2b.resumeMusic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20498815Ja c20498815Ja = this.LL.LIZJ;
        if (c20498815Ja != null) {
            c20498815Ja.resume();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AmberAlertMusicManager@7d2b.resumeMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
