package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.data.repository.MusicGiftRepository$fetchLyrics$2", f = "MusicGiftRepository.kt", l = {121}, m = "invokeSuspend")
public final class C1147660fyG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1147530fy3<? extends String>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1147690fyJ LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147660fyG(C1147690fyJ c1147690fyJ, String str, InterfaceC1364105Vn<? super C1147660fyG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1147690fyJ;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1147660fyG c1147660fyG = new C1147660fyG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1147660fyG.LLILLJJLI = obj;
        return c1147660fyG;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MusicGiftRepository@a574.fetchLyrics$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LL
            r2 = 1
            r4 = 0
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L2f
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r7)
            X.0fyJ r0 = r6.LLILLL
            java.lang.String r1 = r6.LLILZ
            com.bytedance.android.livesdk.comp.impl.musicgift.data.network.MusicGiftRetrofitApi r0 = r0.LIZ     // Catch: java.lang.Throwable -> L6c
            r6.LL = r2     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r0.getLyrics(r1, r6)     // Catch: java.lang.Throwable -> L6c
            if (r7 != r3) goto L32
            X.C1C7U.LIZIZ(r5)
            return r3
        L2f:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L6c
        L32:
            com.bytedance.retrofit2.mime.TypedInput r7 = (com.bytedance.retrofit2.mime.TypedInput) r7     // Catch: java.lang.Throwable -> L6c
            java.io.InputStream r1 = r7.in()     // Catch: java.lang.Throwable -> L6c
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Throwable -> L6c
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L6c
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L46
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Throwable -> L6c
            goto L4e
        L46:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6c
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6c
            r2 = r1
        L4e:
            java.lang.String r3 = X.C08KC.LIZJ(r2)     // Catch: java.lang.Throwable -> L59
            X.C2107108Nh.LIZ(r2, r4)     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L6c
            goto L7a
        L59:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L60
            throw r1     // Catch: java.lang.Throwable -> L5e
        L5e:
            r0 = move-exception
            goto L62
        L60:
            r0 = move-exception
            r1 = r4
        L62:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r0 = move-exception
            goto L62
        L68:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L6e
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6c:
            r0 = move-exception
            goto L6f
        L6e:
            r0 = move-exception
        L6f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L7a:
            java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r2 != 0) goto L94
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            if (r0 == 0) goto L8e
            X.0fy7 r1 = X.C1147570fy7.LIZ
        L8a:
            X.C1C7U.LIZIZ(r5)
            return r1
        L8e:
            X.0fy9 r1 = new X.0fy9
            r1.<init>(r3)
            goto L8a
        L94:
            X.0fy4 r1 = new X.0fy4
            r0 = 2
            r1.<init>(r2, r4, r0)
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1147660fyG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1147530fy3<? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
