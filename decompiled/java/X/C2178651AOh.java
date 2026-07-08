package X;

import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.videoshop.context.VideoContext;

/* JADX INFO: renamed from: X.1AOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178651AOh implements WeakHandler.IHandler, C1APF {
    public final C2178731AOp LL;
    public C1AMG LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLIZ;
    public VideoContext LLIZLLLIL;
    public final Context LLJ;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJJ;
    public boolean LLJJIII;
    public VideoContext LLJJJ;
    public boolean LLJJJJ;
    public final WeakHandler LLILLJJLI = new WeakHandler(this);
    public int LLILZLL = 0;
    public int LLJI = -1;
    public int LLJILLL = -1;
    public int LLJJI = 0;
    public int LLJJIJI = 200;
    public final boolean LLJJIJIIJIL = true;
    public final boolean LLJJIJIL = true;
    public boolean LLJJJIL = false;
    public int LLJJJJJIL = -1;
    public final C1APE LLJJJJLIIL = new Object() { // from class: X.1APE
    };

    public static boolean LJIIIZ() {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.equals("SM-G9910") || str.equals("SM-G9980") || str.equals("SM-G9960");
    }

    public final void LIZJ() {
        Window window;
        EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), C1471760oP0.LIZIZ("EnterFullScreenHideNavigation", EnumC1474430oTJ.ENTER_FULLSCREEN, 0));
        C1AMG c1amg = this.LLILLL;
        C1AMH c1amh = c1amg != null ? c1amg.LJIIJ : null;
        Activity activityLIZ = C1474460oTM.LIZ(this.LLJ);
        if (activityLIZ == null || (window = activityLIZ.getWindow()) == null) {
            return;
        }
        int i = (c1amh == null || c1amh.LIZ) ? 514 : 0;
        View decorView = window.getDecorView();
        if (decorView != null) {
            if (C21517719Ix.LIZ(window)) {
                window.clearFlags(1024);
            }
            int systemUiVisibility = decorView.getSystemUiVisibility();
            int i2 = i != 0 ? 5124 | i : 5124;
            if (systemUiVisibility != i2) {
                decorView.setSystemUiVisibility(i2);
            }
        }
    }

    public final void LJFF() {
        Window window;
        Activity activityLIZ = C1474460oTM.LIZ(this.LLJ);
        if (activityLIZ == null || (window = activityLIZ.getWindow()) == null) {
            return;
        }
        EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), C1471760oP0.LIZIZ("FOExitFullScreenMode", EnumC1474430oTJ.EXIT_FULLSCREEN, 0));
        if (!this.LLJJIII && C21517719Ix.LIZ(window)) {
            window.clearFlags(1024);
        }
        if (this.LLJJIJIL) {
            window.getDecorView().setSystemUiVisibility(this.LLJJ);
        }
    }

    public final void LJIIIIZZ() {
        Activity activityLIZ = C1474460oTM.LIZ(this.LLJ);
        if (Build.VERSION.SDK_INT < 28 || activityLIZ == null || activityLIZ.getWindow() == null || !LJIIIZ()) {
            return;
        }
        Window window = activityLIZ.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = this.LLJJI;
        window.setAttributes(attributes);
    }

    public final void LJIIJ() {
        if (this.LLILZ && this.LLJIJIL) {
            this.LL.LIZ.LJ(this);
            this.LL.LIZ.LIZJ(this);
            C2178731AOp c2178731AOp = this.LL;
            if (c2178731AOp.LIZLLL) {
                return;
            }
            try {
                C2178721AOo c2178721AOo = c2178731AOp.LIZIZ;
                if (c2178721AOo != null) {
                    c2178721AOo.enable();
                    c2178731AOp.LIZLLL = true;
                }
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1APE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2178651AOh(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            com.bytedance.common.utility.collection.WeakHandler r0 = new com.bytedance.common.utility.collection.WeakHandler
            r0.<init>(r4)
            r4.LLILLJJLI = r0
            r3 = 0
            r4.LLILZLL = r3
            r1 = -1
            r4.LLJI = r1
            r4.LLJILJIL = r1
            r4.LLJILLL = r1
            r4.LLJJI = r3
            r0 = 200(0xc8, float:2.8E-43)
            r4.LLJJIJI = r0
            r2 = 1
            r4.LLJJIJIIJIL = r2
            r4.LLJJIJIL = r2
            r4.LLJJJIL = r3
            r4.LLJJJJJIL = r1
            X.1APE r0 = new X.1APE
            r0.<init>()
            r4.LLJJJJLIIL = r0
            android.app.Activity r0 = X.C1474460oTM.LIZ(r5)
            if (r0 == 0) goto L7c
            r4.LLJ = r5
            android.app.Activity r0 = X.C1474460oTM.LIZ(r5)
            if (r0 == 0) goto L61
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Exception -> L5d
            android.content.ComponentName r0 = r0.getComponentName()     // Catch: java.lang.Exception -> L5d
            android.content.pm.ActivityInfo r0 = r1.getActivityInfo(r0, r3)     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L61
            int r1 = r0.screenOrientation     // Catch: java.lang.Exception -> L5d
            r4.LLJILJIL = r1     // Catch: java.lang.Exception -> L5d
            boolean r0 = X.C1486280omQ.LJ(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L5a
            boolean r0 = X.C1486280omQ.LJFF(r1)     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L5a
            r0 = 14
            if (r1 != r0) goto L5b
        L5a:
            r3 = 1
        L5b:
            r2 = r3
            goto L61
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            r4.LLJIJIL = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "fixedOrientation:"
            r1.append(r0)
            boolean r0 = r4.LLJIJIL
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.1AOp r0 = new X.1AOp
            r0.<init>(r5)
            r4.LL = r0
            return
        L7c:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "FullScreenOperator context must be activity"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2178651AOh.<init>(android.content.Context):void");
    }

    @Override // X.C1APF
    public final void LIZ(int i) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScreenOrientationChanged orientation:");
        sbLIZ.append(C1AP9.LIZ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZ && !this.LLILZIL && this.LLJJJJLIIL != null) {
            if (this.LLJJJJJIL < 0 || this.LLJI == 2 || this.LLJJJJ) {
                this.LLJJJJJIL = C1486280omQ.LIZIZ(this.LLJ);
            }
            C2178731AOp c2178731AOp = this.LL;
            if (c2178731AOp != null) {
                try {
                    if (Settings.System.getInt(c2178731AOp.LIZJ.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                        z = true;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                z = false;
            } else {
                z = true;
            }
            if (!this.LLIZ && z) {
                this.LLILLJJLI.removeMessages(1);
                WeakHandler weakHandler = this.LLILLJJLI;
                weakHandler.sendMessageDelayed(Message.obtain(weakHandler, 1, i, 0), 300L);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        int systemUiVisibility;
        Window window;
        View decorView;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterfullscreen videoScreenState:");
        sbLIZ.append(this.LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZLL != 0) {
            return;
        }
        EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), C1471760oP0.LIZIZ("FOEnterFullScreen", EnumC1474430oTJ.ENTER_FULLSCREEN, 6));
        boolean z2 = true;
        this.LLILZLL = 1;
        Activity activityLIZ = C1474460oTM.LIZ(this.LLJ);
        if (activityLIZ != null) {
            this.LLJJIII = C21517719Ix.LIZ(activityLIZ.getWindow());
            if (Build.VERSION.SDK_INT >= 28 && activityLIZ.getWindow() != null && LJIIIZ()) {
                Window window2 = activityLIZ.getWindow();
                WindowManager.LayoutParams attributes = window2.getAttributes();
                this.LLJJI = attributes.layoutInDisplayCutoutMode;
                attributes.layoutInDisplayCutoutMode = 1;
                window2.setAttributes(attributes);
                this.LLJJJIL = true;
            } else {
                this.LLJJJIL = false;
            }
        } else {
            this.LLJJIII = false;
        }
        Activity activityLIZ2 = C1474460oTM.LIZ(this.LLJ);
        if (activityLIZ2 != null && (window = activityLIZ2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            systemUiVisibility = decorView.getSystemUiVisibility();
        } else {
            systemUiVisibility = -1;
        }
        this.LLJJ = systemUiVisibility;
        this.LLJILJILJ = z;
        int iLJI = LJI(true);
        this.LLJILLL = iLJI;
        VideoContext videoContext = this.LLIZLLLIL;
        if (videoContext != null) {
            videoContext.LJJLIIIJILLIZJL(iLJI, true, z, false);
        }
        int i = this.LLJILLL;
        int iLIZIZ = C1486280omQ.LIZIZ(this.LLJ);
        if (i == -1 || i == iLIZIZ) {
            z2 = false;
        }
        if (z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enterfullscreen needRequestOrientation targetOrientation:");
            sbLIZ2.append(C1AP9.LIZ(this.LLJILLL));
            sbLIZ2.append(" halfScreenUiFlags:");
            sbLIZ2.append(this.LLJJ);
            C2188811AlT.LIZIZ(sbLIZ2);
            LJII(this.LLJILLL);
            this.LLILLJJLI.sendMessageDelayed(Message.obtain(this.LLILLJJLI, 2, Boolean.valueOf(z)), this.LLJJIJI);
            this.LLJJJJ = false;
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("enterfullscreen do not needRequestOrientation targetOrientation:");
        sbLIZ3.append(C1AP9.LIZ(this.LLJILLL));
        sbLIZ3.append(" halfScreenUiFlags:");
        sbLIZ3.append(this.LLJJ);
        C2188811AlT.LIZIZ(sbLIZ3);
        C2178641AOg c2178641AOg = this.LLJJJ.LLILLL;
        if (c2178641AOg != null && c2178641AOg.LJJL() && c2178641AOg.LJJJLZIJ()) {
            this.LLILLJJLI.sendMessageDelayed(Message.obtain(this.LLILLJJLI, 2, Boolean.valueOf(z)), this.LLJJIJI);
            this.LLJJJJ = false;
        } else {
            LIZLLL(z);
            this.LLILZLL = 2;
        }
    }

    public final void LIZLLL(boolean z) {
        EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), C1471760oP0.LIZIZ("FOEnteringFullScreen", EnumC1474430oTJ.ENTER_FULLSCREEN, 0));
        if (this.LLJJJIL) {
            C786410Ut5.LJJZZIII(C2044307zd.LIZ(), new ARunnableS128S0100000_28(this, 59));
        } else {
            LIZJ();
        }
        VideoContext videoContext = this.LLIZLLLIL;
        if (videoContext != null) {
            videoContext.LJJLIIIIJ(this.LLJILLL, true, z, false);
        }
        this.LLJJJ.LJJJ();
    }

    public final int LJI(boolean z) {
        int i;
        int i2;
        if (z) {
            if (this.LLJJJ.LLJJIJIIJIL) {
                C2178721AOo c2178721AOo = this.LL.LIZIZ;
                if (c2178721AOo != null && (i2 = c2178721AOo.LIZ) != -1) {
                    if (i2 == 8 || i2 == 0) {
                        return i2;
                    }
                } else {
                    int i3 = this.LLJILJIL;
                    if (i3 == 8 || i3 == 0) {
                        return i3;
                    }
                }
                return this.LLJILJIL;
            }
            if (this.LLIZ) {
                if (C1486280omQ.LJFF(this.LLJILJIL) || !C1486280omQ.LJ(this.LLJILJIL)) {
                    return 1;
                }
                return this.LLJILJIL;
            }
            C2178721AOo c2178721AOo2 = this.LL.LIZIZ;
            if (c2178721AOo2 != null && (i = c2178721AOo2.LIZ) != -1) {
                if (i == 9) {
                    Activity activityLIZ = C1474460oTM.LIZ(this.LLJ);
                    if (activityLIZ != null) {
                        int requestedOrientation = activityLIZ.getRequestedOrientation();
                        if (requestedOrientation == 8 || requestedOrientation == 0) {
                            return requestedOrientation;
                        }
                        return 0;
                    }
                    return 0;
                }
                if (8 == i) {
                    return 8;
                }
                return 0;
            }
            int i4 = this.LLJILJIL;
            if (i4 == 8 || i4 == 0) {
                return i4;
            }
            return 0;
        }
        if (this.LLJJJ.LLJJIJIIJIL) {
            return this.LLJILJIL;
        }
        if (C1486280omQ.LJFF(this.LLJILJIL) || !C1486280omQ.LJ(this.LLJILJIL)) {
            return 1;
        }
        return this.LLJILJIL;
    }

    public final void LJII(int i) {
        this.LLILZIL = true;
        this.LLILLJJLI.postDelayed(new ARunnableS128S0100000_28(this, 60), 300L);
        try {
            C1474460oTM.LIZ(this.LLJ).setRequestedOrientation(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestOrientation orientation:");
            sbLIZ.append(C1AP9.LIZ(i));
            C2188811AlT.LIZIZ(sbLIZ);
            EnumC1474430oTJ enumC1474430oTJ = EnumC1474430oTJ.ENTER_FULLSCREEN;
            if (this.LLILZLL == 3) {
                enumC1474430oTJ = EnumC1474430oTJ.EXIT_FULLSCREEN;
            }
            C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("FORequestOrientation", enumC1474430oTJ, 6);
            if (c1471760oP0LIZIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append(i);
                c1471760oP0LIZIZ.LIZ("orientation", C2188811AlT.LIZIZ(sbLIZ2));
                EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), c1471760oP0LIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2 && this.LLILZLL == 1) {
                LIZLLL(((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue());
                this.LLILZLL = 2;
                this.LLJJJJ = true;
                return;
            }
            return;
        }
        int i2 = message.arg1;
        if (this.LLILZ) {
            if (this.LLJJJJJIL < 0 || this.LLJI == 2 || this.LLJJJJ) {
                this.LLJJJJJIL = C1486280omQ.LIZIZ(this.LLJ);
            }
            if (i2 != this.LLJJJJJIL && i2 != -1 && i2 != 9) {
                if (i2 == 1 && (!this.LLJJJ.LLJJIJIIJIL || this.LLJILJILJ)) {
                    if (this.LLILZLL != 2) {
                        return;
                    }
                    VideoContext videoContext = this.LLIZLLLIL;
                    if ((videoContext != null && videoContext.LJJLIIIJ(false, i2, true)) || this.LLIZ) {
                        return;
                    }
                    LJ(true, false);
                    return;
                }
                if (this.LLILZLL == 2) {
                    int iLIZIZ = C1486280omQ.LIZIZ(this.LLJ);
                    if (i2 != -1 && i2 != iLIZIZ) {
                        LJII(i2);
                    }
                    LIZJ();
                    return;
                }
                VideoContext videoContext2 = this.LLIZLLLIL;
                if ((videoContext2 != null && videoContext2.LJJLIIIJ(true, i2, true)) || this.LLIZ) {
                    return;
                }
                this.LLJJJ.LJJJJJ(new ARunnableS128S0100000_28(this, 58));
                return;
            }
        }
        VideoContext videoContext3 = this.LLIZLLLIL;
        if (videoContext3 == null) {
            return;
        }
        videoContext3.LJJJJIZL(i2, this.LLILZ);
    }

    public final void LJ(final boolean z, final boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exitfullscreen videoScreenState:");
        sbLIZ.append(this.LLILZLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILZLL != 2) {
            return;
        }
        final C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("FOExitFullScreen", EnumC1474430oTJ.EXIT_FULLSCREEN, 6);
        EnumC1471750oOz.INS.addTrace(this.LLJJJ.LJJJJLI(), c1471760oP0LIZIZ);
        this.LLILZLL = 3;
        int iLJI = LJI(false);
        this.LLJILLL = iLJI;
        this.LLJILJILJ = z;
        VideoContext videoContext = this.LLIZLLLIL;
        if (videoContext != null) {
            videoContext.LJJLIIIJILLIZJL(iLJI, false, z, z2);
        }
        LJII(this.LLJILLL);
        Runnable runnable = new Runnable() { // from class: X.1AOm
            public final void LIZ() {
                if (this.LLILZ.LLIZ) {
                    C1471760oP0 c1471760oP0 = c1471760oP0LIZIZ;
                    if (c1471760oP0 != null) {
                        c1471760oP0.LIZ("portrait", "true");
                    }
                    C2178651AOh c2178651AOh = this.LLILZ;
                    VideoContext videoContext2 = c2178651AOh.LLIZLLLIL;
                    if (videoContext2 != null) {
                        videoContext2.LJJLIIIIJ(c2178651AOh.LLJILLL, false, z, z2);
                    }
                    this.LLILZ.getClass();
                    this.LLILZ.LJFF();
                    C2178651AOh c2178651AOh2 = this.LLILZ;
                    c2178651AOh2.LLILZLL = 0;
                    c2178651AOh2.LJIIIIZZ();
                    return;
                }
                C1471760oP0 c1471760oP02 = c1471760oP0LIZIZ;
                if (c1471760oP02 != null) {
                    c1471760oP02.LIZ("portrait", "false");
                }
                C2178651AOh c2178651AOh3 = this.LLILZ;
                VideoContext videoContext3 = c2178651AOh3.LLIZLLLIL;
                if (videoContext3 != null) {
                    videoContext3.LJJLIIIIJ(c2178651AOh3.LLJILLL, false, z, z2);
                }
                this.LLILZ.LJFF();
                C2178651AOh c2178651AOh4 = this.LLILZ;
                c2178651AOh4.LLILZLL = 0;
                c2178651AOh4.LJIIIIZZ();
                this.LLILZ.LLJJJ.LJJJ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FullScreenOperator@599d.exitFullScreen$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FullScreenOperator@599d.exitFullScreen$1");
            }
        };
        C2178641AOg c2178641AOg = this.LLJJJ.LLILLL;
        if (c2178641AOg != null && c2178641AOg.LJJL()) {
            this.LLILLJJLI.post(runnable);
        } else {
            runnable.run();
        }
    }
}
