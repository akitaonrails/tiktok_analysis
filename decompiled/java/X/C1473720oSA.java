package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.common.utility.collection.WeakHandler;
import com.lynx.base.log.LynxLog;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0oSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473720oSA extends AbstractC1473630oS1 implements InterfaceC1473740oSC {
    public final C1473730oSB LJFF;
    public FrameLayout LJI;
    public ViewGroup LJII;
    public int LJIIIIZZ;
    public Integer LJIIIZ;
    public Integer LJIIJ;

    @Override // X.InterfaceC1491100ouC
    public final void initialize() {
        this.LJFF.setTransformer(this);
        this.LIZIZ = this.LJFF;
    }

    public C1473720oSA(Context context) {
        super(context);
        this.LJFF = new C1473730oSB(context);
    }

    public static Activity LJIJJ(Context context) {
        if (context == null) {
            return null;
        }
        if (Activity.class.isInstance(context)) {
            return (Activity) context;
        }
        if (!ContextWrapper.class.isInstance(context)) {
            return null;
        }
        return LJIJJ(((ContextWrapper) context).getBaseContext());
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZJ(C1491120ouE c1491120ouE) {
        this.LJFF.LJ(Boolean.FALSE);
        c1491120ouE.LIZ(0, null, 0, null);
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJFF(C1491120ouE c1491120ouE) {
        if (!this.LJFF.LIZIZ()) {
            if (c1491120ouE != null) {
                c1491120ouE.LIZ(7, null, -1, "player is not prepared");
            }
        } else {
            this.LJFF.LJI();
            if (c1491120ouE != null) {
                c1491120ouE.LIZ(0, null, 0, null);
            }
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJI(C1491120ouE c1491120ouE) {
        WeakReference<InterfaceC1473740oSC> weakReference;
        InterfaceC1473740oSC interfaceC1473740oSC;
        C1473730oSB c1473730oSB = this.LJFF;
        if (c1473730oSB.LIZ() && c1473730oSB.LLILLJJLI.LLJJI && (weakReference = c1473730oSB.LLJI) != null && (interfaceC1473740oSC = weakReference.get()) != null) {
            c1473730oSB.LLILLJJLI.LLJJI = false;
            interfaceC1473740oSC.LJIILIIL(c1473730oSB);
            InterfaceC1473620oS0 interfaceC1473620oS0 = c1473730oSB.LLILZIL;
            if (interfaceC1473620oS0 != null) {
                interfaceC1473620oS0.LIZ(false);
            }
        }
        c1491120ouE.LIZ(0, null, 0, null);
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJII(InterfaceC1473700oS8 interfaceC1473700oS8) {
        final C1473730oSB c1473730oSB = this.LJFF;
        if (!c1473730oSB.LIZ()) {
            LynxLog.i("VideoMediaView", "Failed to trigger prepare due to not properly initialized");
        } else if (c1473730oSB.LLJILJILJ) {
            LynxLog.i("VideoMediaView", "Failed to trigger prepare due to already called");
        } else {
            c1473730oSB.LLILLJJLI.LJIILJJIL(false);
            C1471190oO5 c1471190oO5 = c1473730oSB.LLILLJJLI;
            if (c1471190oO5 == null || !c1471190oO5.LJIIZILJ()) {
                c1473730oSB.LJFF(new Runnable() { // from class: X.0oRw
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VideoMediaView@bb6d.prepare$1");
                        try {
                            Surface surface = c1473730oSB.getSurface();
                            C1471190oO5 c1471190oO52 = c1473730oSB.LLILLJJLI;
                            if (c1471190oO52 != null) {
                                c1471190oO52.LJIILLIIL(surface);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VideoMediaView@bb6d.prepare$1");
                    }
                });
            }
            LynxLog.i("VideoMediaView", "Did trigger VideoController prepare in VideoMediaView");
            c1473730oSB.LLJILJILJ = true;
        }
        if (interfaceC1473700oS8 != null) {
            interfaceC1473700oS8.LIZ(0, null, 0, null);
        }
        LynxLog.i("TTVideoEngineMediaPlayable", "Trigger prepare in MediaPlayable instance");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIIL(FrameLayout frameLayout) {
        frameLayout.addView(this.LJFF, -1, -1);
        this.LJFF.setParentLayout(frameLayout);
    }

    @Override // X.InterfaceC1473740oSC
    public final void LJIILIIL(C1473730oSB c1473730oSB) {
        WindowManager.LayoutParams attributes;
        View decorView;
        Activity activityLJIJJ;
        Activity activityLJIJJ2 = LJIJJ(this.LIZ);
        if (activityLJIJJ2 == null) {
            return;
        }
        activityLJIJJ2.getWindow().clearFlags(1024);
        Activity activityLJIJJ3 = LJIJJ(this.LIZ);
        if (activityLJIJJ3 != null && 1 != activityLJIJJ3.getRequestedOrientation() && (activityLJIJJ = LJIJJ(this.LIZ)) != null) {
            activityLJIJJ.setRequestedOrientation(1);
        }
        FrameLayout frameLayout = this.LJI;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        c1473730oSB.getParentLayout().addView(c1473730oSB, new ViewGroup.LayoutParams(-1, -1));
        Window window = activityLJIJJ2.getWindow();
        if (window != null && (attributes = window.getAttributes()) != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = this.LJIIIIZZ;
            }
            Integer num = this.LJIIIZ;
            if (num != null) {
                int iIntValue = num.intValue();
                Window window2 = activityLJIJJ2.getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    decorView.setSystemUiVisibility(iIntValue);
                }
            }
            Integer num2 = this.LJIIJ;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                Window window3 = activityLJIJJ2.getWindow();
                if (window3 != null) {
                    window3.setStatusBarColor(iIntValue2);
                }
            }
        }
    }

    @Override // X.InterfaceC1491100ouC
    public final void LJIILJJIL(C1491120ouE c1491120ouE) {
        this.LJFF.LJ(Boolean.TRUE);
        c1491120ouE.LIZ(0, null, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:246:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04b9  */
    @Override // X.InterfaceC1491100ouC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(java.util.Map<java.lang.String, ? extends java.lang.Object> r32) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473720oSA.LJIILL(java.util.Map):void");
    }

    @Override // X.AbstractC1473630oS1
    public final boolean LJIJI(Map<String, ? extends Object> map) {
        if (!super.LJIJI(map) && !map.containsKey("resolution")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x016a  */
    @Override // X.InterfaceC1473740oSC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(X.C1473730oSB r9, java.lang.Boolean r10) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1473720oSA.LJIILLIIL(X.0oSB, java.lang.Boolean):void");
    }

    @Override // X.InterfaceC1491100ouC
    public final void LIZIZ(long j, boolean z, C1491120ouE c1491120ouE) {
        if (!this.LJFF.LIZIZ()) {
            c1491120ouE.LIZ(7, null, -1, "player is not prepared");
            return;
        }
        C1473730oSB c1473730oSB = this.LJFF;
        int i = (int) j;
        if (c1473730oSB.LIZ()) {
            C1471190oO5 c1471190oO5 = c1473730oSB.LLILLJJLI;
            if (c1471190oO5.LL != null) {
                WeakHandler weakHandler = c1471190oO5.LLJJIJIL;
                if (weakHandler != null) {
                    weakHandler.removeMessages(201);
                }
                c1471190oO5.LLJIJIL = i;
                c1471190oO5.LL.LJIJJLI(i, c1471190oO5.LLJJIJI);
            }
        }
        if (z) {
            this.LJFF.LJI();
        } else {
            this.LJFF.LIZJ();
        }
        c1491120ouE.LIZ(0, null, 0, null);
    }
}
