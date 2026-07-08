package X;

import Y.ARunnableS46S0300000_13;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.awemepushlib.manager.MessageShowHandler;

/* JADX INFO: renamed from: X.0Vqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810570Vqx extends AbstractC810630Vr3 {
    public final InterfaceC810510Vqr LIZ;
    public final C810580Vqy LIZIZ;

    public C810570Vqx(InterfaceC810510Vqr interfaceC810510Vqr, InterfaceC810600Vr0 interfaceC810600Vr0) {
        this.LIZ = interfaceC810510Vqr;
        this.LIZIZ = new C810580Vqy(interfaceC810600Vr0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054 A[Catch: Exception -> 0x00c1, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x0006, B:7:0x001b, B:8:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:43:0x00bd, B:34:0x009b, B:19:0x0046, B:9:0x002a, B:11:0x002e, B:13:0x0038, B:15:0x003e, B:36:0x00a3, B:40:0x00b5), top: B:52:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: Exception -> 0x00c1, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x0006, B:7:0x001b, B:8:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:43:0x00bd, B:34:0x009b, B:19:0x0046, B:9:0x002a, B:11:0x002e, B:13:0x0038, B:15:0x003e, B:36:0x00a3, B:40:0x00b5), top: B:52:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: Exception -> 0x00c1, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x0006, B:7:0x001b, B:8:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:43:0x00bd, B:34:0x009b, B:19:0x0046, B:9:0x002a, B:11:0x002e, B:13:0x0038, B:15:0x003e, B:36:0x00a3, B:40:0x00b5), top: B:52:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[Catch: Exception -> 0x00c1, TryCatch #2 {Exception -> 0x00c1, blocks: (B:5:0x0006, B:7:0x001b, B:8:0x0025, B:24:0x0050, B:26:0x0054, B:27:0x0059, B:29:0x0078, B:30:0x0082, B:32:0x0092, B:33:0x0098, B:43:0x00bd, B:34:0x009b, B:19:0x0046, B:9:0x002a, B:11:0x002e, B:13:0x0038, B:15:0x003e, B:36:0x00a3, B:40:0x00b5), top: B:52:0x0006, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC810630Vr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Notification LIZ(android.content.Context r8, com.bytedance.push.PushBody r9, android.graphics.Bitmap r10) {
        /*
            r7 = this;
            X.0Vqr r0 = r7.LIZ
            r6 = 0
            if (r0 == 0) goto L6
            return r6
        L6:
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = r8.getPackageName()     // Catch: java.lang.Exception -> Lc1
            r5 = 0
            android.content.pm.PackageInfo r1 = X.C786410Ut5.Y3(r1, r0, r5)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = r9.title     // Catch: java.lang.Exception -> Lc1
            boolean r0 = X.C2093608Ic.LJ(r0)     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto L25
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo     // Catch: java.lang.Exception -> Lc1
            int r0 = r0.labelRes     // Catch: java.lang.Exception -> Lc1
            java.lang.String r0 = r8.getString(r0)     // Catch: java.lang.Exception -> Lc1
            r9.title = r0     // Catch: java.lang.Exception -> Lc1
        L25:
            java.lang.String r2 = r9.mNotificationChannelId     // Catch: java.lang.Exception -> Lc1
            r4 = 26
            r3 = 1
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L45
            if (r0 < r4) goto L4b
            java.lang.String r0 = "notification"
            java.lang.Object r1 = X.C786410Ut5.H2(r8, r0)     // Catch: java.lang.Exception -> L45
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1     // Catch: java.lang.Exception -> L45
            if (r1 == 0) goto L49
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L45
            if (r0 != 0) goto L49
            android.app.NotificationChannel r0 = r1.getNotificationChannel(r2)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L49
            goto L4b
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Lc1
        L49:
            r0 = 0
            goto L4c
        L4b:
            r0 = 1
        L4c:
            if (r0 != 0) goto L50
            java.lang.String r2 = "push"
        L50:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lc1
            if (r0 < r4) goto L9b
            android.app.Notification$Builder r4 = new android.app.Notification$Builder     // Catch: java.lang.Exception -> Lc1
            r4.<init>(r8, r2)     // Catch: java.lang.Exception -> Lc1
        L59:
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lc1
            java.lang.String r2 = r9.title     // Catch: java.lang.Exception -> Lc1
            android.app.Notification$Builder r2 = r4.setTicker(r2)     // Catch: java.lang.Exception -> Lc1
            r2.setAutoCancel(r3)     // Catch: java.lang.Exception -> Lc1
            r4.setWhen(r0)     // Catch: java.lang.Exception -> Lc1
            boolean r0 = r9.showWhen     // Catch: java.lang.Exception -> Lc1
            r4.setShowWhen(r0)     // Catch: java.lang.Exception -> Lc1
            r0 = 2130973538(0x7f041362, float:1.7555874E38)
            r4.setSmallIcon(r0)     // Catch: java.lang.Exception -> Lc1
            boolean r0 = r9.useLED     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto L82
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 2500(0x9c4, float:3.503E-42)
            r4.setLights(r2, r1, r0)     // Catch: java.lang.Exception -> Lc1
        L82:
            r4.setPriority(r3)     // Catch: java.lang.Exception -> Lc1
            long[] r0 = new long[r5]     // Catch: java.lang.Exception -> Lc1
            r4.setVibrate(r0)     // Catch: java.lang.Exception -> Lc1
            android.app.Notification r2 = X.AbstractC810630Vr3.LIZJ(r4, r8, r9, r10)     // Catch: java.lang.Exception -> Lc1
            boolean r0 = r9.useSound     // Catch: java.lang.Exception -> Lc1
            if (r0 == 0) goto L98
            int r0 = r2.defaults     // Catch: java.lang.Exception -> Lc1
            r0 = r0 | 1
            r2.defaults = r0     // Catch: java.lang.Exception -> Lc1
        L98:
            boolean r0 = r9.useVibrator     // Catch: java.lang.Exception -> Lc1
            goto La1
        L9b:
            android.app.Notification$Builder r4 = new android.app.Notification$Builder     // Catch: java.lang.Exception -> Lc1
            r4.<init>(r8)     // Catch: java.lang.Exception -> Lc1
            goto L59
        La1:
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "audio"
            java.lang.Object r0 = X.C786410Ut5.H2(r8, r0)     // Catch: java.lang.Throwable -> Lbc
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch: java.lang.Throwable -> Lbc
            int r1 = r0.getRingerMode()     // Catch: java.lang.Throwable -> Lbc
            r0 = 2
            if (r1 == r3) goto Lb5
            if (r1 == r0) goto Lb5
        Lb4:
            return r2
        Lb5:
            int r0 = r2.defaults     // Catch: java.lang.Throwable -> Lbc
            r0 = r0 | 2
            r2.defaults = r0     // Catch: java.lang.Throwable -> Lbc
            return r2
        Lbc:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Lc1
            return r2
        Lc1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C810570Vqx.LIZ(android.content.Context, com.bytedance.push.PushBody, android.graphics.Bitmap):android.app.Notification");
    }

    public final void LJ(Context context, int i, PushBody pushBody) {
        if (this.LIZ != null) {
            MessageShowHandler messageShowHandler = C808570Vnj.LIZ;
            String strLIZ = pushBody.LIZ();
            messageShowHandler.getClass();
            MessageShowHandler.LIZJ(context, 1, strLIZ, i);
            return;
        }
        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show message :");
        sbLIZ.append(pushBody);
        C2188811AlT.LIZIZ(sbLIZ);
        c809150Vof.getClass();
        if (pushBody.imageType != 0 && !TextUtils.isEmpty(pushBody.imageUrl)) {
            String str = pushBody.imageUrl;
            C810590Vqz c810590Vqz = new C810590Vqz(this, context, i, pushBody);
            C810580Vqy c810580Vqy = this.LIZIZ;
            C810610Vr1 c810610Vr1 = new C810610Vr1(UriProtector.parse(str));
            if (c810580Vqy.LLILLJJLI == null) {
                c810580Vqy.LLILLJJLI = new BPEAHandler(Looper.getMainLooper(), c810580Vqy);
            }
            RunnableC823120WQs.LIZIZ(new ARunnableS46S0300000_13(c810610Vr1, c810590Vqz, c810580Vqy, 5));
            return;
        }
        LIZLLL(context, i, pushBody, null);
    }
}
