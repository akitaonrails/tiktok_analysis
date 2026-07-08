package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineCommonCacheDelegate$asyncPoll$1", f = "OfflineCommonCacheDelegate.kt", l = {}, m = "invokeSuspend")
public final class C590790NFd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NEK LL;
    public final /* synthetic */ C0NII LLILLJJLI;
    public final /* synthetic */ C0NEN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C590790NFd(C0NEK c0nek, C0NII c0nii, C0NEN c0nen, InterfaceC1364105Vn<? super C590790NFd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nek;
        this.LLILLJJLI = c0nii;
        this.LLILLL = c0nen;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590790NFd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommonCacheDelegate@dbfe.asyncPoll$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI.LJFF(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommonCacheDelegate@dbfe.asyncPoll$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
