package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D7Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7Y implements C0D7Q {
    public final C0D7H LIZ = C0D7H.LJFF;
    public Pair<String, C0D86> LIZIZ;

    public static void LJ(LinkedHashMap linkedHashMap) {
        Object c098200Yq;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            entry.getKey();
            try {
                c098200Yq = C051K.LIZLLL(true, false, false, entry.getValue());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("<json_encode_failed:");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                sbLIZ.append('>');
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public static C0D7J LJFF(AbstractC333960D7i abstractC333960D7i) {
        if (abstractC333960D7i instanceof C333950D7h) {
            return new C0D7L(((C333950D7h) abstractC333960D7i).LIZIZ);
        }
        if (abstractC333960D7i instanceof C333940D7g) {
            return new C0D7K(((C333940D7g) abstractC333960D7i).LIZIZ);
        }
        throw new C1954807lC();
    }

    public final C0D86 LJI(C0D5B c0d5b) {
        String str = c0d5b.LIZ;
        Pair<String, C0D86> pair = this.LIZIZ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), str)) {
            return pair.getSecond();
        }
        C0D86 c0d86 = new C0D86(str, c0d5b.LJ);
        this.LIZIZ = new Pair<>(str, c0d86);
        return c0d86;
    }

    @Override // X.C0D7Q
    public final void LIZ(C0D5B c0d5b, C0D5B c0d5b2) {
        if (!Intrinsics.LJFF(c0d5b.LIZ, c0d5b2.LIZ)) {
            this.LIZIZ = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0323  */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    @Override // X.C0D7Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0D5B r26, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r27, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r28, X.InterfaceC1364105Vn<? super X.C0D7J> r29) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D7Y.LIZIZ(X.0D5B, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    @Override // X.C0D7Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C0D5B r26, java.lang.String r27, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r28, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r29, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r30, X.InterfaceC1364105Vn<? super X.C0D7J> r31) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D7Y.LIZLLL(X.0D5B, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0329  */
    @Override // X.C0D7Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C0D5B r25, java.lang.String r26, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent r27, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress r28, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession r29, java.lang.String r30, java.lang.String r31, X.C0D7I r32, java.lang.String r33, java.lang.String r34, X.InterfaceC1364105Vn<? super X.C0D7J> r35) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0D7Y.LIZJ(X.0D5B, java.lang.String, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent, com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutStoredUserAddress, com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession, java.lang.String, java.lang.String, X.0D7I, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
