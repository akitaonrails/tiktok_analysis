package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13x9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.MvCoverStrategy$extractWithGetImages$2", f = "MvCoverStrategy.kt", l = {118}, m = "invokeSuspend")
public final class C20176913x9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1452170ntP LLILLL;
    public final /* synthetic */ C1457070o1J LLILZ;
    public final /* synthetic */ C20176713x7 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20176913x9(InterfaceC1452170ntP interfaceC1452170ntP, C1457070o1J c1457070o1J, C20176713x7 c20176713x7, InterfaceC1364105Vn<? super C20176913x9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1452170ntP;
        this.LLILZ = c1457070o1J;
        this.LLILZIL = c20176713x7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20176913x9(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Exception {
        /*
            r17 = this;
            r5 = r18
            java.lang.String r10 = "MvCoverStrategy@3a4d.extractWithGetImages$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            r6 = r17
            int r2 = r6.LLILLJJLI
            r0 = 30000(0x7530, double:1.4822E-319)
            r7 = 1
            r4 = 0
            if (r2 == 0) goto L22
            if (r2 != r7) goto L1a
            X.099F r3 = r6.LL
            goto L6c
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            X.C155000ia.LIZIZ(r5)
            X.099F r3 = X.C090F.LIZIZ()
            X.0ntP r2 = r6.LLILLL     // Catch: java.lang.Exception -> Lb3
            r2.cancelGetVideoFrames()     // Catch: java.lang.Exception -> Lb3
            X.0o1J r9 = r6.LLILZ     // Catch: java.lang.Exception -> Lb3
            int r13 = r9.LJFF     // Catch: java.lang.Exception -> Lb3
            if (r13 > 0) goto L35
            r13 = -1
        L35:
            int r14 = r9.LJI     // Catch: java.lang.Exception -> Lb3
            if (r14 > 0) goto L3a
            r14 = -1
        L3a:
            X.0ntP r11 = r6.LLILLL     // Catch: java.lang.Exception -> Lb3
            int[] r12 = new int[r7]     // Catch: java.lang.Exception -> Lb3
            int r5 = r9.LJ     // Catch: java.lang.Exception -> Lb3
            r2 = 0
            r12[r2] = r5     // Catch: java.lang.Exception -> Lb3
            com.ss.android.vesdk.VEEditor$GET_FRAMES_FLAGS r15 = com.ss.android.vesdk.VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL     // Catch: java.lang.Exception -> Lb3
            X.13xA r5 = new X.13xA     // Catch: java.lang.Exception -> Lb3
            X.13x7 r2 = r6.LLILZIL     // Catch: java.lang.Exception -> Lb3
            r5.<init>()     // Catch: java.lang.Exception -> Lb3
            r16 = r5
            int r5 = r11.lg(r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> Lb3
            if (r5 != 0) goto L9d
            X.13x7 r2 = r6.LLILZIL     // Catch: java.lang.Exception -> Lb3
            r2.getClass()     // Catch: java.lang.Exception -> Lb3
            X.01pf r2 = new X.01pf     // Catch: java.lang.Exception -> Lb3
            r2.<init>(r3, r4)     // Catch: java.lang.Exception -> Lb3
            r6.LL = r3     // Catch: java.lang.Exception -> Lb3
            r6.LLILLJJLI = r7     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r5 = X.C099A.LIZJ(r0, r2, r6)     // Catch: java.lang.Exception -> Lb3
            if (r5 != r8) goto L6f
            X.C1C7U.LIZIZ(r10)
            return r8
        L6c:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Exception -> L9b
        L6f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5     // Catch: java.lang.Exception -> L9b
            if (r5 == 0) goto L77
            X.C1C7U.LIZIZ(r10)
            return r5
        L77:
            X.13x1 r8 = new X.13x1     // Catch: java.lang.Exception -> L9b
            java.lang.StringBuilder r7 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L9b
            java.lang.String r2 = "getImages timeout after "
            r7.append(r2)     // Catch: java.lang.Exception -> L9b
            X.13x7 r2 = r6.LLILZIL     // Catch: java.lang.Exception -> L9b
            r2.getClass()     // Catch: java.lang.Exception -> L9b
            r2 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r2     // Catch: java.lang.Exception -> L9b
            long r0 = r0 / r5
            r7.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = " seconds"
            r7.append(r0)     // Catch: java.lang.Exception -> L9b
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r7)     // Catch: java.lang.Exception -> L9b
            r8.<init>(r0, r4)     // Catch: java.lang.Exception -> L9b
            throw r8     // Catch: java.lang.Exception -> L9b
        L9b:
            r1 = move-exception
            goto Lb4
        L9d:
            X.13x1 r2 = new X.13x1     // Catch: java.lang.Exception -> Lb3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r0 = "getImages failed with result: "
            r1.append(r0)     // Catch: java.lang.Exception -> Lb3
            r1.append(r5)     // Catch: java.lang.Exception -> Lb3
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb3
            r2.<init>(r0, r4)     // Catch: java.lang.Exception -> Lb3
            throw r2     // Catch: java.lang.Exception -> Lb3
        Lb3:
            r1 = move-exception
        Lb4:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r3.isCompleted()
            if (r0 != 0) goto Lc0
            r3.LJJJJJ(r1)
        Lc0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20176913x9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
