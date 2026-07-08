package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.strategy.MvCoverStrategy$extractWithSeekAndGetDisplay$2", f = "MvCoverStrategy.kt", l = {186}, m = "invokeSuspend")
public final class C20176813x8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public C099F LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC1452170ntP LLILLL;
    public final /* synthetic */ C1457070o1J LLILZ;
    public final /* synthetic */ C20176713x7 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20176813x8(InterfaceC1452170ntP interfaceC1452170ntP, C1457070o1J c1457070o1J, C20176713x7 c20176713x7, InterfaceC1364105Vn<? super C20176813x8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1452170ntP;
        this.LLILZ = c1457070o1J;
        this.LLILZIL = c20176713x7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20176813x8(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Exception {
        /*
            r11 = this;
            java.lang.String r10 = "MvCoverStrategy@3a4d.extractWithSeekAndGetDisplay$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r2 = 30000(0x7530, double:1.4822E-319)
            r7 = 1
            r5 = 0
            if (r0 == 0) goto L1e
            if (r0 != r7) goto L16
            X.099F r4 = r11.LL
            goto L62
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r12)
            X.099F r4 = X.C090F.LIZIZ()
            X.0ntP r0 = r11.LLILLL
            r0.pause()
            X.13xB r9 = new X.13xB     // Catch: java.lang.Exception -> La9
            X.13x7 r1 = r11.LLILZIL     // Catch: java.lang.Exception -> La9
            X.0o1J r0 = r11.LLILZ     // Catch: java.lang.Exception -> La9
            r9.<init>()     // Catch: java.lang.Exception -> La9
            int r6 = r0.LJFF     // Catch: java.lang.Exception -> La9
            if (r6 <= 0) goto L40
            X.0ntP r1 = r11.LLILLL     // Catch: java.lang.Exception -> La9
            int r0 = r0.LJ     // Catch: java.lang.Exception -> La9
            int r6 = r1.Cf(r0, r6, r9)     // Catch: java.lang.Exception -> La9
            goto L48
        L40:
            X.0ntP r1 = r11.LLILLL     // Catch: java.lang.Exception -> La9
            int r0 = r0.LJ     // Catch: java.lang.Exception -> La9
            int r6 = r1.Ue(r0, r9)     // Catch: java.lang.Exception -> La9
        L48:
            if (r6 != 0) goto L93
            X.13x7 r0 = r11.LLILZIL     // Catch: java.lang.Exception -> La9
            r0.getClass()     // Catch: java.lang.Exception -> La9
            X.01pg r0 = new X.01pg     // Catch: java.lang.Exception -> La9
            r0.<init>(r4, r5)     // Catch: java.lang.Exception -> La9
            r11.LL = r4     // Catch: java.lang.Exception -> La9
            r11.LLILLJJLI = r7     // Catch: java.lang.Exception -> La9
            java.lang.Object r12 = X.C099A.LIZJ(r2, r0, r11)     // Catch: java.lang.Exception -> La9
            if (r12 != r8) goto L65
            X.C1C7U.LIZIZ(r10)
            return r8
        L62:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L91
        L65:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12     // Catch: java.lang.Exception -> L91
            if (r12 == 0) goto L6d
            X.C1C7U.LIZIZ(r10)
            return r12
        L6d:
            X.13x1 r7 = new X.13x1     // Catch: java.lang.Exception -> L91
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = "seekWithResult timeout after "
            r6.append(r0)     // Catch: java.lang.Exception -> L91
            X.13x7 r0 = r11.LLILZIL     // Catch: java.lang.Exception -> L91
            r0.getClass()     // Catch: java.lang.Exception -> L91
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0     // Catch: java.lang.Exception -> L91
            long r2 = r2 / r0
            r6.append(r2)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = " seconds"
            r6.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r6)     // Catch: java.lang.Exception -> L91
            r7.<init>(r0, r5)     // Catch: java.lang.Exception -> L91
            throw r7     // Catch: java.lang.Exception -> L91
        L91:
            r1 = move-exception
            goto Laa
        L93:
            X.13x1 r2 = new X.13x1     // Catch: java.lang.Exception -> La9
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = "seekWithResult failed with result: "
            r1.append(r0)     // Catch: java.lang.Exception -> La9
            r1.append(r6)     // Catch: java.lang.Exception -> La9
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> La9
            r2.<init>(r0, r5)     // Catch: java.lang.Exception -> La9
            throw r2     // Catch: java.lang.Exception -> La9
        La9:
            r1 = move-exception
        Laa:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r4.isCompleted()
            if (r0 != 0) goto Lb6
            r4.LJJJJJ(r1)
        Lb6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20176813x8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
