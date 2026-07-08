package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIX, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.service.OfflineModeServiceImpl$hasUgApprovedVideo$2", f = "OfflineModeServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0NIX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C0NIX(InterfaceC1364105Vn<? super C0NIX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0NIX c0nix = new C0NIX(interfaceC1364105Vn);
        c0nix.LL = obj;
        return c0nix;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        int iLJIJI;
        boolean z;
        C1C7U.LIZ("OfflineModeServiceImpl@a1dd.hasUgApprovedVideo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C625530OgB.LIZ.getClass();
            InterfaceC625570OgF interfaceC625570OgFLIZLLL = C625530OgB.LIZLLL();
            String curSecUserId = C625530OgB.LIZLLL.getCurSecUserId();
            if (curSecUserId != null) {
                long jLJI = C625530OgB.LJI();
                C625470Og5.LL.getClass();
                iLJIJI = interfaceC625570OgFLIZLLL.LJIJI(jLJI, C625470Og5.LLILZIL, curSecUserId);
            } else {
                iLJIJI = 0;
            }
            if (iLJIJI > 0) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        C1C7U.LIZIZ("OfflineModeServiceImpl@a1dd.hasUgApprovedVideo$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
