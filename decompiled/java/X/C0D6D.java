package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.CheckoutOrderDetails;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D6D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6D {
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.CheckoutOrderDetails LIZ(java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D6D.LIZ(java.lang.String):com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.CheckoutOrderDetails");
    }

    public static Long LIZJ(n nVar) {
        Object c098200Yq;
        Object c098200Yq2;
        k kVarLJJIIZ = nVar.LJJIIZ("tiktok_order_id");
        Object obj = null;
        if (kVarLJJIIZ != null) {
            if (!(!(kVarLJJIIZ instanceof m))) {
                kVarLJJIIZ = null;
            }
            if (kVarLJJIIZ != null) {
                try {
                    c098200Yq = Long.valueOf(kVarLJJIIZ.LJIIZILJ());
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Long l = (Long) c098200Yq;
                if (l == null) {
                    try {
                        c098200Yq2 = Long.valueOf(CastLongProtector.parseLong(kVarLJJIIZ.LJIL()));
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj = c098200Yq2;
                    }
                    return (Long) obj;
                }
                return l;
            }
        }
        return null;
    }

    public static String LIZIZ(CheckoutSession checkoutSession, CheckoutIntent checkoutIntent) {
        Object c098200Yq;
        try {
            c098200Yq = C051K.LIZLLL(false, false, false, new CheckoutOrderDetails(checkoutSession, checkoutIntent));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static n LIZLLL(n nVar, String str) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null || !(kVarLJJIIZ instanceof n)) {
            return null;
        }
        return kVarLJJIIZ.LJIILIIL();
    }

    public static String LJ(n nVar, String str) {
        String strLJIL;
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ == null || !(!(kVarLJJIIZ instanceof m)) || (strLJIL = kVarLJJIIZ.LJIL()) == null || !(!a0.LJJJIL(strLJIL))) {
            return null;
        }
        return strLJIL;
    }
}
