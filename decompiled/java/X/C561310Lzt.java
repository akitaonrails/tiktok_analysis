package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.data.DraftLoader$getTotalPageFreeUpSpace$2", f = "DraftLoader.kt", l = {}, m = "invokeSuspend")
public final class C561310Lzt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Long>>, Object> {
    public final /* synthetic */ EnumC562200M3e LL;
    public final /* synthetic */ C0M03 LLILLJJLI;
    public final /* synthetic */ C562260M3k LLILLL;
    public final /* synthetic */ C0M0Z LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561310Lzt(EnumC562200M3e enumC562200M3e, C0M03 c0m03, C562260M3k c562260M3k, C0M0Z c0m0z, InterfaceC1364105Vn<? super C561310Lzt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC562200M3e;
        this.LLILLJJLI = c0m03;
        this.LLILLL = c562260M3k;
        this.LLILZ = c0m0z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561310Lzt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("DraftLoader@8d42.getTotalPageFreeUpSpace$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC562200M3e enumC562200M3e = this.LL;
        C0M03 c0m03 = this.LLILLJJLI;
        C562260M3k c562260M3k = this.LLILLL;
        C0M0Z c0m0z = this.LLILZ;
        try {
            c0m03.getClass();
            c098200Yq = C2286608xc.LJFF(C0M4A.LJI(new C0M4E(enumC562200M3e, null, null, false, EnumC562220M3g.NORMAL, null, c562260M3k, c0m0z, false, null, 814)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C0M03 c0m032 = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c0m032.LJIIIIZZ = ((Number) c098200Yq).longValue();
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201955140j.LJIIIIZZ(C0MAY.LIZIZ, "DraftLoader", "getTotalPageFreeUpSpace: " + thM5exceptionOrNullimpl);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("DraftLoader@8d42.getTotalPageFreeUpSpace$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
