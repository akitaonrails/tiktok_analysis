package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.13xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20177213xC implements InterfaceC20175613ww {
    @Override // X.InterfaceC20175613ww
    public final String getStrategyName() {
        return "ImageMode";
    }

    @Override // X.InterfaceC20175613ww
    public final long getTimeout() {
        return Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    @Override // X.InterfaceC20175613ww
    public final boolean LIZIZ(C1457070o1J c1457070o1J) {
        if (C1428470nHB.LJJZZI(c1457070o1J.LIZ) && c1457070o1J.LIZIZ == null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC20175613ww
    public final Object LIZ(C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C20177313xD(this, c1457070o1J, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1457070o1J r7, X.InterfaceC1364105Vn<? super kotlin.Pair<android.graphics.Bitmap, java.lang.Boolean>> r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1473905pp
            if (r0 == 0) goto L22
            r5 = r8
            X.05pp r5 = (X.C1473905pp) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2c
            X.099F r3 = r5.LL
            goto L28
        L22:
            X.05pp r5 = new X.05pp
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L5a
            return r2
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            X.099F r3 = X.C090F.LIZIZ()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r7.LIZ     // Catch: java.lang.Exception -> L58
            kotlin.Pair r0 = X.C1444180ngW.LIZ(r0)     // Catch: java.lang.Exception -> L58
            r3.LJJLIIIJILLIZJL(r0)     // Catch: java.lang.Exception -> L58
            X.05cC r2 = new X.05cC     // Catch: java.lang.Exception -> L58
            r0 = 0
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L58
            r5.LL = r3     // Catch: java.lang.Exception -> L58
            r5.LLILZ = r1     // Catch: java.lang.Exception -> L58
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r5)     // Catch: java.lang.Exception -> L58
            if (r2 != r4) goto L57
            return r4
        L57:
            return r2
        L58:
            r1 = move-exception
            goto L5b
        L5a:
            r1 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r3.isCompleted()
            if (r0 != 0) goto L67
            r3.LJJJJJ(r1)
        L67:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20177213xC.LIZJ(X.0o1J, X.05Vn):java.lang.Object");
    }
}
