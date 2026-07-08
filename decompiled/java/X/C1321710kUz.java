package X;

import Y.ARunnableS120S0100000_20;
import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyArray;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import j27.s;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.0kUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321710kUz {
    public final s LIZ;
    public ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ LIZIZ;
    public final float LIZJ;
    public boolean LIZLLL;
    public DialogC1321750kV3 LJ;
    public int LJFF;
    public int LJI;
    public final Rect LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public final WeakHashMap<Object, ViewTreeObserver.OnGlobalLayoutListener> LJIIJ = new WeakHashMap<>();
    public final WeakHashMap<Object, InterfaceC1321810kV9> LJIIJJI = new WeakHashMap<>();

    public final synchronized void LIZJ() {
        if (this.LIZLLL) {
            LynxLog.d("Lynx", "KeyboardEvent already started");
            return;
        }
        if (C1289620jfE.LIZIZ()) {
            LIZLLL();
        } else {
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 216));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010e A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0014, B:9:0x0023, B:10:0x0025, B:15:0x002d, B:17:0x005f, B:18:0x0065, B:29:0x00b7, B:31:0x00bf, B:35:0x00cb, B:38:0x00e3, B:39:0x00e5, B:42:0x010a, B:45:0x0115, B:46:0x011f, B:48:0x0125, B:50:0x0131, B:44:0x010e, B:37:0x00df, B:23:0x009f), top: B:54:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0125 A[Catch: Exception -> 0x013b, TryCatch #0 {Exception -> 0x013b, blocks: (B:3:0x0004, B:5:0x000e, B:7:0x0014, B:9:0x0023, B:10:0x0025, B:15:0x002d, B:17:0x005f, B:18:0x0065, B:29:0x00b7, B:31:0x00bf, B:35:0x00cb, B:38:0x00e3, B:39:0x00e5, B:42:0x010a, B:45:0x0115, B:46:0x011f, B:48:0x0125, B:50:0x0131, B:44:0x010e, B:37:0x00df, B:23:0x009f), top: B:54:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321710kUz.LIZ():void");
    }

    public final void LIZLLL() {
        LynxLog.d("Lynx", "KeyboardEvent starting");
        Activity activityLIZ = C1298530jtb.LIZ(this.LIZ);
        if (activityLIZ == null) {
            LynxLog.e("Lynx", "KeyboardEvent's context must be Activity");
            return;
        }
        if (this.LJ == null) {
            this.LJ = new DialogC1321750kV3(activityLIZ);
        }
        this.LIZIZ = new ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ(this, 4);
        DialogC1321750kV3 dialogC1321750kV3 = this.LJ;
        C786410Ut5.x3(dialogC1321750kV3.getWindow().getDecorView().getViewTreeObserver(), this.LIZIZ);
        DialogC1321750kV3 dialogC1321750kV32 = this.LJ;
        String str = DialogC1321750kV3.LL;
        if (!dialogC1321750kV32.isShowing()) {
            try {
                if (!DialogC1321750kV3.LJJLIIIJLLLLLLLZ(dialogC1321750kV32.getContext()).isFinishing()) {
                    dialogC1321750kV32.show();
                    C785410UrT.LIZIZ(dialogC1321750kV32);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1321750kV32);
                    C816490W1f.LIZ(dialogC1321750kV32);
                }
            } catch (WindowManager.BadTokenException e) {
                TryCatchGuardChecker.doCheck(e);
                LynxLog.w(str, e.toString());
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                LynxLog.w(str, e2.toString());
            }
        }
        this.LIZLLL = true;
    }

    public final void LJ() {
        DialogC1321750kV3 dialogC1321750kV3;
        LynxLog.d("Lynx", "KeyboardEvent stopping");
        try {
            ViewTreeObserverOnGlobalLayoutListenerC1339270kxJ viewTreeObserverOnGlobalLayoutListenerC1339270kxJ = this.LIZIZ;
            if (viewTreeObserverOnGlobalLayoutListenerC1339270kxJ != null && (dialogC1321750kV3 = this.LJ) != null) {
                C786410Ut5.C3(dialogC1321750kV3.getWindow().getDecorView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1339270kxJ);
                DialogC1321750kV3 dialogC1321750kV32 = this.LJ;
                String str = DialogC1321750kV3.LL;
                if (dialogC1321750kV32.isShowing()) {
                    try {
                        try {
                            dialogC1321750kV32.dismiss();
                            C785410UrT.LIZ(dialogC1321750kV32);
                        } catch (WindowManager.BadTokenException e) {
                            TryCatchGuardChecker.doCheck(e);
                            LynxLog.w(str, e.toString());
                        }
                    } catch (RuntimeException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        LynxLog.w(str, e2.toString());
                    }
                }
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop KeyboardEvent failed for ");
            sbLIZ.append(e3.toString());
            LynxLog.w("Lynx", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZLLL = false;
    }

    public C1321710kUz(s sVar) {
        LynxLog.d("Lynx", "KeyboardEvent initialized.");
        this.LIZ = sVar;
        this.LIZJ = sVar.LLJJJ.density;
        this.LJII = new Rect();
    }

    public final void LIZIZ(int i, boolean z) {
        String str;
        if (this.LIZ.LLIZ != null) {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            javaOnlyArray.pushString(str);
            javaOnlyArray.pushInt(i);
            javaOnlyArray.pushInt(i);
            this.LIZ.LJJIII("keyboardstatuschanged", javaOnlyArray);
        }
        Iterator<Map.Entry<Object, InterfaceC1321810kV9>> it2 = this.LJIIJJI.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC1321810kV9 value = it2.next().getValue();
            if (z) {
                value.LJJIIJ((int) (i * this.LIZJ));
            } else {
                value.LJIJ();
            }
        }
    }
}
