package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryManager$saveSingleHistoryOnCurrentAd$1$1", f = "AdWebHistoryManager.kt", l = {}, m = "invokeSuspend")
public final class C1315905Cz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1053550dWT LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1315905Cz(C1053550dWT c1053550dWT, int i, InterfaceC1364105Vn<? super C1315905Cz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1053550dWT;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1315905Cz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryManager@40b0.saveSingleHistoryOnCurrentAd$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1053550dWT c1053550dWT = this.LL;
        int i = this.LLILLJJLI;
        c1053550dWT.getClass();
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1053560dWU(c1053550dWT, i, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryManager@40b0.saveSingleHistoryOnCurrentAd$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
