package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0S8V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0S8V {
    public final C05P0 LIZ = C20028913Yh.LJI(EnumC716470S8n.LOADING);
    public Function0<Unit> LIZIZ;

    public abstract C0SBU LIZIZ();

    public abstract boolean LIZJ(Aweme aweme);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.C0S8V r11, java.util.List<java.lang.String> r12, X.InterfaceC1364105Vn<? super java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>> r13) {
        /*
            boolean r0 = r13 instanceof X.C0S8U
            if (r0 == 0) goto L20
            r3 = r13
            X.0S8U r3 = (X.C0S8U) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            goto L87
        L20:
            X.0S8U r3 = new X.0S8U
            r3.<init>(r11, r13)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L92
            java.lang.Class<com.bytedance.ies.ugc.aweme.network.IRetrofitFactory> r0 = com.bytedance.ies.ugc.aweme.network.IRetrofitFactory.class
            java.lang.Object r2 = r1.getService(r0)     // Catch: java.lang.Throwable -> L92
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r2 = (com.bytedance.ies.ugc.aweme.network.IRetrofitFactory) r2     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = "https://"
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            X.0CQU r0 = X.C844470XAv.LJIIIIZZ     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Throwable -> L92
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
            X.011f r1 = r2.LIZ(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.Class<X.0Src> r0 = X.InterfaceC734540Src.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Throwable -> L92
            X.0Src r2 = (X.InterfaceC734540Src) r2     // Catch: java.lang.Throwable -> L92
            r7 = 0
            java.lang.String r8 = "["
            java.lang.String r9 = "]"
            r10 = 0
            r13 = 57
            r6 = r12
            r11 = r7
            r12 = r7
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L92
            r0 = 16
            X.11Kz r1 = r2.LIZ(r1, r0)     // Catch: java.lang.Throwable -> L92
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L92
            X.11Ks r0 = r1.LJJIJIIJI(r0)     // Catch: java.lang.Throwable -> L92
            X.11NZ r0 = r0.LJJIJLIJ()     // Catch: java.lang.Throwable -> L92
            r3.LLILLL = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = X.C11UD.LJI(r0, r3)     // Catch: java.lang.Throwable -> L92
            if (r1 != r5) goto L8a
            return r5
        L87:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
        L8a:
            com.ss.android.ugc.aweme.videohotswap.model.FullAwemeVideosResponse r1 = (com.ss.android.ugc.aweme.videohotswap.model.FullAwemeVideosResponse) r1     // Catch: java.lang.Throwable -> L92
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r1.awemes     // Catch: java.lang.Throwable -> L92
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L92
            goto L9e
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L9e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto La5
            r1 = 0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S8V.LIZ(X.0S8V, java.util.List, X.05Vn):java.lang.Object");
    }
}
