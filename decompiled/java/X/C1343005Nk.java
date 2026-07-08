package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.sparkpreload.ViewCleanupManager$schedule$job$1$1", f = "ViewCleanupManager.kt", l = {}, m = "invokeSuspend")
public final class C1343005Nk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343005Nk(String str, String str2, InterfaceC1364105Vn<? super C1343005Nk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343005Nk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewCleanupManager@d500.schedule$job$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LIZIZ(this.LL, this.LLILLJJLI, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ViewCleanupManager@d500.schedule$job$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
