package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01aa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.board.PCSBoardEffectService$cleanCache$job$1$1", f = "PCSBoardEffectService.kt", l = {}, m = "invokeSuspend")
public final class C360201aa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public /* synthetic */ Object LL;

    public C360201aa(InterfaceC1364105Vn<? super C360201aa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C360201aa c360201aa = new C360201aa(interfaceC1364105Vn);
        c360201aa.LL = obj;
        return c360201aa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object c098200Yq;
        C1C7U.LIZ("PCSBoardEffectService@8a7a.cleanCache$job$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            C0VSJ c0vsj = new C0VSJ(C2355009Kq.LJIIIZ(contextLIZ, "ttlive_board").getPath());
            if (c0vsj.exists()) {
                try {
                    c098200Yq = Boolean.valueOf(C08QA.LJIIZILJ(c0vsj));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clean file Cache failed -> ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
                    sbLIZ.append(": ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cleanCache.deleteRecursively threw ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
                    sbLIZ2.append(": ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    C470401sM.LIZIZ(-5014, 5, C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = false;
                }
                C1C7U.LIZIZ("PCSBoardEffectService@8a7a.cleanCache$job$1$1");
                return c098200Yq;
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PCSBoardEffectService@8a7a.cleanCache$job$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
