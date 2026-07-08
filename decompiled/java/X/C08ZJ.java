package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.nativegame.MinisNativeGameDownloadManager$recordPluginOpen$2", f = "MinisNativeGameDownloadManager.kt", l = {1482, 1245}, m = "invokeSuspend")
public final class C08ZJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZJ(String str, InterfaceC1364105Vn<? super C08ZJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZJ(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[Catch: all -> 0x00ba, LOOP:0: B:32:0x0091->B:34:0x00a1, LOOP_END, TryCatch #1 {all -> 0x00ba, blocks: (B:27:0x0072, B:28:0x0075, B:30:0x008a, B:32:0x0091, B:34:0x00a1, B:35:0x00a4, B:39:0x00b6), top: B:46:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4 A[EDGE_INSN: B:47:0x00a4->B:35:0x00a4 BREAK  A[LOOP:0: B:32:0x0091->B:34:0x00a1], SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "MinisNativeGameDownloadManager@99.recordPluginOpen$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r3 = 0
            r1 = 2
            r5 = 0
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 == r7) goto L22
            if (r0 != r1) goto L1a
            java.lang.Object r2 = r9.LLILLJJLI
            X.01eN r6 = r9.LL
            goto L72
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            java.lang.Object r2 = r9.LLILLJJLI
            X.01eN r6 = r9.LL
            X.C155000ia.LIZIZ(r10)
            goto L56
        L2a:
            X.C155000ia.LIZIZ(r10)
            java.lang.String r0 = r9.LLILZ
            if (r0 == 0) goto L40
            int r0 = r0.length()
            if (r0 == 0) goto L40
            r0 = 0
        L38:
            if (r0 == 0) goto L42
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L40:
            r0 = 1
            goto L38
        L42:
            X.1DEV r6 = X.C2390509Yh.LJI
            java.lang.String r2 = r9.LLILZ
            r9.LL = r6
            r9.LLILLJJLI = r2
            r9.LLILLL = r7
            java.lang.Object r0 = r6.LIZLLL(r5, r9)
            if (r0 != r4) goto L56
            X.C1C7U.LIZIZ(r8)
            return r4
        L56:
            X.09Yh r0 = X.C2390509Yh.LIZ     // Catch: java.lang.Throwable -> Lb5
            r9.LL = r6     // Catch: java.lang.Throwable -> Lb5
            r9.LLILLJJLI = r2     // Catch: java.lang.Throwable -> Lb5
            r9.LLILLL = r1     // Catch: java.lang.Throwable -> Lb5
            r0.getClass()     // Catch: java.lang.Throwable -> Lb5
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> Lb5
            X.08X4 r0 = new X.08X4     // Catch: java.lang.Throwable -> Lb5
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r10 = X.C23250099c.LJI(r9, r1, r0)     // Catch: java.lang.Throwable -> Lb5
            if (r10 != r4) goto L75
            X.C1C7U.LIZIZ(r8)
            return r4
        L72:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> Lba
        L75:
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lba
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Lba
            r4.remove(r2)     // Catch: java.lang.Throwable -> Lba
            r4.add(r3, r2)     // Catch: java.lang.Throwable -> Lba
            com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings$MinisTtmgConfigModel r0 = com.ss.android.ugc.aweme.minis.settings.MinisTtmgConfigSettings.LIZ()     // Catch: java.lang.Throwable -> Lba
            int r3 = r0.pluginCacheCount     // Catch: java.lang.Throwable -> Lba
            if (r3 <= 0) goto La4
            int r2 = r4.size()     // Catch: java.lang.Throwable -> Lba
            int r2 = r2 - r7
            if (r3 > r2) goto La4
        L91:
            java.lang.Object r1 = r4.get(r2)     // Catch: java.lang.Throwable -> Lba
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lba
            X.09Yh r0 = X.C2390509Yh.LIZ     // Catch: java.lang.Throwable -> Lba
            r0.LJ(r1)     // Catch: java.lang.Throwable -> Lba
            r4.remove(r2)     // Catch: java.lang.Throwable -> Lba
            if (r2 == r3) goto La4
            int r2 = r2 + (-1)
            goto L91
        La4:
            X.09Yh r0 = X.C2390509Yh.LIZ     // Catch: java.lang.Throwable -> Lba
            r0.getClass()     // Catch: java.lang.Throwable -> Lba
            X.C2390509Yh.LJJIIZ(r4)     // Catch: java.lang.Throwable -> Lba
            r6.LIZIZ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        Lb5:
            r0 = move-exception
        Lb6:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lba
            goto Lbc
        Lba:
            r0 = move-exception
            goto Lb6
        Lbc:
            r6.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08ZJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
