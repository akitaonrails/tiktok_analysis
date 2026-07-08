package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08YR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.order.psp.ShareRecordKevaHelper$getShareList$2", f = "SmartSortStoreShareRecordHelper.kt", l = {}, m = "invokeSuspend")
public final class C08YR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C08YW>>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08YR(String str, InterfaceC1364105Vn<? super C08YR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08YR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareRecordKevaHelper@cfe0.getShareList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C08YU c08yu = C08YU.LIZ;
        List listLLIIII = C13LP.LLIIII(C08YU.LIZJ(this.LL));
        C1C7U.LIZIZ("ShareRecordKevaHelper@cfe0.getShareList$2");
        return listLLIIII;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C08YW>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
