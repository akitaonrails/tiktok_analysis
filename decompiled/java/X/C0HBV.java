package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.IProfileService;
import java.io.File;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HBV, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HBV {
    public static final C0HBV LIZ = new C0HBV();
    public static final C1910890zpH LIZIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(591));

    public static int LIZ(Context context) {
        int i;
        boolean z = C14LC.LJIIIZ;
        int i2 = ((int) (r2.widthPixels / context.getResources().getDisplayMetrics().density)) - 110;
        if (z) {
            i = 180;
        } else {
            i = 320;
        }
        if (i2 > i) {
            return i;
        }
        return i2;
    }

    public static Object LIZIZ(final String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        C1331660kl2.LJIIIZ(str).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.0HBY
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Downloading image is cancelled: ");
                sbLIZ.append(str);
                C098200Yq c098200Yq = new C098200Yq(new C0HDR(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
                if (file == null) {
                    InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Downloaded image is null: ");
                    sbLIZ.append(str);
                    C098200Yq c098200Yq = new C098200Yq(new C0HDR(C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                    return;
                }
                InterfaceC1364105Vn<String> interfaceC1364105Vn3 = c23260099m;
                String absolutePath = file.getAbsolutePath();
                C189200o6.m2constructorimpl(absolutePath);
                interfaceC1364105Vn3.resumeWith(absolutePath);
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                String message;
                InterfaceC1364105Vn<String> interfaceC1364105Vn2 = c23260099m;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C098200Yq c098200Yq = new C098200Yq(new C0HDR(message));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static String LJI(Bitmap bitmap, File file) {
        Boolean boolValueOf;
        String absolutePath;
        try {
            IProfileService iProfileService = (IProfileService) PluggableExtentionKt.pluggableSpi$default(IProfileService.class, false, false, false, 14, null);
            if (iProfileService != null) {
                boolValueOf = Boolean.valueOf(iProfileService.checkAndHandleSaveFile(bitmap, file));
            } else {
                boolValueOf = null;
            }
            absolutePath = file.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return null;
        }
        return absolutePath;
    }

    public static Object LIZLLL(Context context, String str, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJLIIJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded bitmap is null: ");
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        c1331670kl3LJIIIZ.LJJIJL(context);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0HBN
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                    C098200Yq c098200Yq = new C098200Yq(new C0HDR(strLIZIZ));
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC1364105Vn2.resumeWith(c098200Yq);
                    return;
                }
                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn3 = c23260099m;
                C189200o6.m2constructorimpl(bitmap);
                interfaceC1364105Vn3.resumeWith(bitmap);
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                InterfaceC1364105Vn<Bitmap> interfaceC1364105Vn2 = c23260099m;
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                C098200Yq c098200Yq = new C098200Yq(new C0HDR(message));
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn2.resumeWith(c098200Yq);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(android.content.Context r6, java.lang.String r7, X.InterfaceC1364105Vn r8, boolean r9) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C0HBU
            if (r0 == 0) goto L20
            r4 = r8
            X.0HBU r4 = (X.C0HBU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.0HBU r4 = new X.0HBU
            r4.<init>(r5, r8)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = LIZLLL(r6, r7, r4, r9)     // Catch: java.lang.Exception -> L40
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
        L3d:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L40
            return r3
        L40:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBV.LIZJ(android.content.Context, java.lang.String, X.05Vn, boolean):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.00zU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r12, X.C0VSJ r13, java.lang.String r14, X.C0HFS r15, X.InterfaceC1364105Vn r16) throws java.lang.Throwable {
        /*
            r11 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C0HBX
            if (r0 == 0) goto L2a
            r4 = r3
            X.0HBX r4 = (X.C0HBX) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L14:
            java.lang.Object r0 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILZLL
            r1 = 1
            if (r2 == 0) goto L38
            if (r2 != r1) goto L30
            X.00zU r1 = r4.LLILLL
            X.00zU r2 = r4.LLILLJJLI
            java.lang.Object r13 = r4.LL
            java.io.File r13 = (java.io.File) r13
            goto L5d
        L2a:
            X.0HBX r4 = new X.0HBX
            r4.<init>(r11, r3)
            goto L14
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r0)
            X.00zU r2 = new X.00zU
            r2.<init>()
            r10 = 0
            r4.LL = r13     // Catch: java.lang.Throwable -> L83
            r4.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L83
            r4.LLILLL = r2     // Catch: java.lang.Throwable -> L83
            r4.LLILZLL = r1     // Catch: java.lang.Throwable -> L83
            X.1DFB r0 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L83
            X.0HBD r5 = new X.0HBD     // Catch: java.lang.Throwable -> L83
            r9 = 0
            r7 = r15
            r8 = r14
            r6 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = X.C23250099c.LJI(r4, r0, r5)     // Catch: java.lang.Throwable -> L83
            if (r0 != r3) goto L5b
            return r3
        L5b:
            r1 = r2
            goto L60
        L5d:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L88
        L60:
            r1.element = r0     // Catch: java.lang.Throwable -> L88
            T r1 = r2.element     // Catch: java.lang.Throwable -> L88
            r0 = r1
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L75
            X.0HBV r0 = X.C0HBV.LIZ     // Catch: java.lang.Throwable -> L88
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch: java.lang.Throwable -> L88
            r0.getClass()     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = LJI(r1, r13)     // Catch: java.lang.Throwable -> L88
            goto L76
        L75:
            r1 = 0
        L76:
            T r0 = r2.element
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L82
            r0.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r0)
        L82:
            return r1
        L83:
            r1 = move-exception
        L84:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L88
            goto L8a
        L88:
            r1 = move-exception
            goto L84
        L8a:
            T r0 = r2.element
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L96
            r0.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r0)
        L96:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBV.LJ(android.content.Context, X.0VSJ, java.lang.String, X.0HFS, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(android.content.Context r14, X.C0VSJ r15, X.C436960HBm r16, X.C0HFS r17, X.InterfaceC1364105Vn r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HBV.LJFF(android.content.Context, X.0VSJ, X.0HBm, X.0HFS, X.05Vn):java.lang.Object");
    }
}
