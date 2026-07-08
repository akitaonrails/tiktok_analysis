package X;

import com.bytedance.forest.model.RequestParams;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: renamed from: X.0paB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517130paB {
    public static final C1517130paB LIZ = new C1517130paB();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(285));
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, AnonymousClass0957<File>> LIZLLL = new ConcurrentHashMap<>();

    public static C099G LIZIZ(String str) {
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_CHILD_RESOURCE);
        requestParams.disableCdn = true;
        requestParams.consumeType = File.class;
        requestParams.channel = str;
        requestParams.bundle = "protobuf/protobuf.json";
        return C23250099c.LIZIZ(LIZJ, null, C099V.LAZY, new C365801bU(requestParams, null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r6, X.InterfaceC1364105Vn r7, X.AnonymousClass0957 r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1517120paA
            if (r0 == 0) goto L24
            r4 = r7
            X.0paA r4 = (X.C1517120paA) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r3 = r4.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            X.0957 r8 = r4.LLILLJJLI
            java.lang.Object r6 = r4.LL
            goto L42
        L24:
            X.0paA r4 = new X.0paA
            r4.<init>(r5, r7)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LL = r6     // Catch: java.lang.Exception -> L48
            r4.LLILLJJLI = r8     // Catch: java.lang.Exception -> L48
            r4.LLILZIL = r0     // Catch: java.lang.Exception -> L48
            java.lang.Object r3 = r8.LJLIIIL(r4)     // Catch: java.lang.Exception -> L48
            if (r3 != r2) goto L45
            return r2
        L42:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L48
        L45:
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Exception -> L48
            return r3
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.0957<java.io.File>> r2 = X.C1517130paB.LIZLLL
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L59
            r2.remove(r6, r8)
        L57:
            r3 = 0
            return r3
        L59:
            monitor-enter(r2)
            java.lang.Object r0 = r2.get(r6)     // Catch: java.lang.Throwable -> L6b
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L69
            r2.remove(r6)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)
            goto L57
        L69:
            monitor-exit(r2)
            goto L57
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1517130paB.LIZ(java.lang.String, X.05Vn, X.0957):java.lang.Object");
    }
}
