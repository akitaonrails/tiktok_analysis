package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxOrganizerComponent$loadIntroStats$2", f = "DraftBoxOrganizerComponent.kt", l = {816}, m = "invokeSuspend")
public final class C561850M1v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0M29>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0M22 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561850M1v(C0M22 c0m22, InterfaceC1364105Vn<? super C561850M1v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0m22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C561850M1v c561850M1v = new C561850M1v(this.LLILLL, interfaceC1364105Vn);
        c561850M1v.LLILLJJLI = obj;
        return c561850M1v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<String> listLJLIL;
        Object c098200Yq;
        Object c098200Yq2;
        List<String> listLJLIL2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object objLIZJ = obj;
        C1C7U.LIZ("DraftBoxOrganizerComponent@6d25.loadIntroStats$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            this.LLILLJJLI = this.LLILLJJLI;
            this.LL = 1;
            objLIZJ = C0M2F.LIZJ(this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.loadIntroStats$2");
                return objLJFF;
            }
        }
        List list = (List) objLIZJ;
        EnumC562220M3g enumC562220M3g = EnumC562220M3g.NORMAL;
        if (list.isEmpty()) {
            listLJLIL = C0M4D.LJIIIIZZ();
        } else {
            listLJLIL = C13LP.LJLIL(list, C0M4D.LJIIIIZZ());
        }
        C0M4E c0m4e = new C0M4E(null, null, listLJLIL, false, enumC562220M3g, null, null, null, false, null, 1003);
        try {
            c098200Yq = C2286608xc.LJ(C0M4A.LIZLLL(c0m4e));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Integer numLJ = C2286608xc.LJ(0);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = numLJ;
        }
        int iIntValue = ((Number) c098200Yq).intValue();
        try {
            c098200Yq2 = C2286608xc.LJFF(C0M4A.LJI(c0m4e));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Long lLJFF = C2286608xc.LJFF(0L);
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = lLJFF;
        }
        long jLongValue = ((Number) c098200Yq2).longValue();
        long jCurrentTimeMillis = System.currentTimeMillis() - (((long) this.LLILLL.LIZ()) * 2592000000L);
        EnumC562220M3g enumC562220M3g2 = EnumC562220M3g.NORMAL;
        if (list.isEmpty()) {
            listLJLIL2 = C0M4D.LJIIIIZZ();
        } else {
            listLJLIL2 = C13LP.LJLIL(list, C0M4D.LJIIIIZZ());
        }
        C0M4E c0m4e2 = new C0M4E(null, null, listLJLIL2, false, enumC562220M3g2, null, null, null, false, C2286608xc.LJFF(jCurrentTimeMillis), 491);
        try {
            c098200Yq3 = C2286608xc.LJ(C0M4A.LIZLLL(c0m4e2));
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        Integer numLJ2 = C2286608xc.LJ(0);
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = numLJ2;
        }
        int iIntValue2 = ((Number) c098200Yq3).intValue();
        try {
            c098200Yq4 = C2286608xc.LJFF(C0M4A.LJI(c0m4e2));
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        Long lLJFF2 = C2286608xc.LJFF(0L);
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = lLJFF2;
        }
        C0M29 c0m29 = new C0M29(iIntValue, iIntValue2, jLongValue, ((Number) c098200Yq4).longValue());
        C1C7U.LIZIZ("DraftBoxOrganizerComponent@6d25.loadIntroStats$2");
        return c0m29;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0M29> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
