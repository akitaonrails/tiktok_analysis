package X;

import com.ss.android.ugc.aweme.im.common.model.Flag;
import com.ss.android.ugc.aweme.minis.model.CheckEligibilityResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383240m6E {
    public static final C1383240m6E LIZ = new C1383240m6E();
    public static CheckEligibilityResponse LIZIZ;
    public static C11NZ<CheckEligibilityResponse> LIZJ;

    public static boolean LIZJ(Set set) {
        String str;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                Flag flag = (Flag) it2.next();
                if (Intrinsics.LJFF(flag.key, "minis_invalid_age") && (str = flag.value) != null && Boolean.parseBoolean(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LIZLLL(Set set) {
        String str;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                Flag flag = (Flag) it2.next();
                if (Intrinsics.LJFF(flag.key, "minis_invalid_region") && (str = flag.value) != null && Boolean.parseBoolean(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab A[Catch: Exception -> 0x0103, TryCatch #0 {Exception -> 0x0103, blocks: (B:23:0x0048, B:24:0x004b, B:25:0x004d, B:29:0x005e, B:31:0x0062, B:33:0x006e, B:39:0x007c, B:41:0x0086, B:43:0x008a, B:45:0x0096, B:50:0x00a2, B:52:0x00ab, B:55:0x00b1, B:57:0x00b5, B:59:0x00c4, B:65:0x00d2, B:67:0x00dc, B:69:0x00e0, B:71:0x00ee, B:76:0x00fa, B:15:0x0033, B:17:0x0037, B:19:0x003b), top: B:81:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r9, X.InterfaceC1364105Vn<? super java.util.Set<com.ss.android.ugc.aweme.im.common.model.Flag>> r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383240m6E.LIZ(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r8, X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1383250m6F
            if (r0 == 0) goto L60
            r6 = r9
            X.0m6F r6 = (X.C1383250m6F) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r1 = r6.LLILZ
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZLL
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto L98
            java.lang.Object r3 = r6.LLILLL
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r6.LLILLJJLI
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r6.LL
            java.util.Set r0 = (java.util.Set) r0
            X.C155000ia.LIZIZ(r1)
        L2e:
            java.util.Collection r1 = (java.util.Collection) r1
            r3.addAll(r1)
            r3 = r0
        L34:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r1 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMContact) r1
            X.0m6E r0 = X.C1383240m6E.LIZ
            r6.LL = r3
            r6.LLILLJJLI = r2
            r6.LLILLL = r3
            r6.LLILZLL = r4
            java.lang.Object r1 = r0.LIZ(r1, r6)
            if (r1 != r5) goto L51
            return r5
        L51:
            r0 = r3
            goto L2e
        L53:
            X.C155000ia.LIZIZ(r1)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
            goto L34
        L60:
            X.0m6F r6 = new X.0m6F
            r6.<init>(r7, r9)
            goto L12
        L66:
            boolean r0 = LIZLLL(r3)
            if (r0 == 0) goto L7a
            boolean r0 = LIZJ(r3)
            if (r0 == 0) goto L7a
            r0 = 2131822344(0x7f110708, float:1.9277457E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            return r0
        L7a:
            boolean r0 = LIZLLL(r3)
            if (r0 == 0) goto L88
            r0 = 2131822346(0x7f11070a, float:1.927746E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            return r0
        L88:
            boolean r0 = LIZJ(r3)
            if (r0 == 0) goto L96
            r0 = 2131822345(0x7f110709, float:1.9277459E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            return r0
        L96:
            r0 = 0
            return r0
        L98:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383240m6E.LIZIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}
