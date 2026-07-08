package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Pg9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C650990Pg9 {
    public static void LIZ(InterfaceC663910Q2j interfaceC663910Q2j, C650960Pg6 c650960Pg6) {
        Object c098200Yq;
        C650960Pg6 c650960Pg62;
        if (!C0Q46.LJI) {
            C664410Q4h.LIZIZ(EnumC654470Pll.COMMON, EnumC664420Q4i.SEARCH_CONTEXT, new IllegalStateException(), "SearchSignalRepositoryInit", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
        try {
            for (C0Q46<?> c0q46 : C0Q46.LJFF) {
                if (c650960Pg6 == null) {
                    c650960Pg62 = new C650960Pg6(new C664000Q2s("discovery", null, true, true, "", "", 0, 0, false, "", "", ""), new C0Q8L(null, null, null), new C664030Q2v(null, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE), new C650940Pg4(null, "", Boolean.FALSE, ""), new C0PYE(0L), new C669560QOc(new C672110QXx(null, null, null, null, null), false, "", false, false, "", "", "", "", "", "", "", null, "", null, "", null, null, false, null, null, false, null, "", null), new C0QJN("", null, null, null, null, null));
                } else {
                    c650960Pg62 = c650960Pg6;
                }
                c0q46.LIZJ(interfaceC663910Q2j, c650960Pg62);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C664410Q4h.LIZIZ(EnumC654470Pll.COMMON, EnumC664420Q4i.SEARCH_CONTEXT, new IllegalStateException(), "SearchSignalRepositoryInitDispatchAction", C2097608Jq.LJ(), C2097608Jq.LJ(), "search");
        }
    }
}
