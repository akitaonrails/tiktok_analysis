package X;

import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule;
import j27.s;

/* JADX INFO: renamed from: X.0jeu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289420jeu {
    public static C1289410jet LIZ(LynxView lynxView) {
        s lynxContext = lynxView.getLynxContext();
        if (lynxContext == null) {
            LynxLog.e("LynxKryptonUtils", "context is null");
            return null;
        }
        LynxKryptonModule lynxKryptonModule = (LynxKryptonModule) lynxContext.LJIIIIZZ();
        if (lynxKryptonModule == null) {
            LynxLog.e("LynxKryptonUtils", "krypton module is null");
            return null;
        }
        return lynxKryptonModule.LIZJ;
    }
}
