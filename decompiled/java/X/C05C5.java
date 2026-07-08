package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.05C5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.service.OfflineModeServiceImpl$getFirstUgApprovedAid$2", f = "OfflineModeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C05C5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public /* synthetic */ Object LL;

    public C05C5(InterfaceC1364105Vn<? super C05C5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05C5 c05c5 = new C05C5(interfaceC1364105Vn);
        c05c5.LL = obj;
        return c05c5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("OfflineModeServiceImpl@a1dd.getFirstUgApprovedAid$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C625530OgB.LIZ.getClass();
            c098200Yq = C625530OgB.LJII();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        String str = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 != null && !a0.LJJJIL(str2)) {
            str = str2;
        }
        C1C7U.LIZIZ("OfflineModeServiceImpl@a1dd.getFirstUgApprovedAid$2");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
