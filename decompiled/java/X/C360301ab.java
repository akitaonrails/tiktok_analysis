package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.record.history.handler.PhotoSearchHistoryRecordHandler$Companion$deletePhoto$1", f = "PhotoSearchRecordHandler.kt", l = {}, m = "invokeSuspend")
public final class C360301ab extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String[] LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C360301ab(String[] strArr, InterfaceC1364105Vn<? super C360301ab> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = strArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C360301ab(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoSearchHistoryRecordHandler$Companion@cba6.deletePhoto$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            for (String str : this.LL) {
                new C0VSJ(str).delete();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoSearchHistoryRecordHandler$Companion@cba6.deletePhoto$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
