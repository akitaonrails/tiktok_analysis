package X;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import j27.s;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XR8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XR8 {
    public static final Long LIZ(String str) {
        Long lValueOf = null;
        if (u.LJJIIJZLJL(str, "#", false)) {
            String strLJJIFFI = u.LJJIFFI(str, "#", "", false);
            if (strLJJIFFI.length() != 8 && strLJJIFFI.length() != 6) {
                return null;
            }
            if (strLJJIFFI.length() == 6) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                sbLIZ.append("FF");
                strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ);
            }
            try {
                CharsKt__CharJVMKt.checkRadix(16);
                long j = CastLongProtector.parseLong(strLJJIFFI, 16);
                lValueOf = Long.valueOf(((j >> 8) & 16777215) | ((j << 24) & 4278190080L));
                return lValueOf;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return lValueOf;
            }
        }
        return lValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LIZJ(s sVar) throws Throwable {
        Object objH2;
        WindowManager windowManager;
        Display displayLLILZIL = null;
        if (sVar instanceof Activity) {
            windowManager = ((Activity) sVar).getWindowManager();
        } else if (sVar != 0 && (objH2 = C786410Ut5.H2(sVar, "window")) != null) {
            windowManager = (WindowManager) objH2;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        if (windowManager != null) {
            displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxBOEVHfB25cN9xCkoirmaUOJbwkjIgzWv5ipf", null));
        }
        int i = 0;
        if (displayLLILZIL == null) {
            return 0;
        }
        try {
            Point point = new Point();
            displayLLILZIL.getSize(point);
            i = point.x;
            return i;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    public static final int LIZIZ(s sVar, String str) {
        float f;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (u.LJIIZILJ(str, "rpx", false)) {
            try {
                f = (CastFloatProtector.parseFloat(u.LJJIFFI(str, "rpx", "", false)) * LIZJ(sVar)) / 750;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return 0;
            }
        } else {
            if (u.LJIIZILJ(str, "px", false)) {
                f = CastFloatProtector.parseFloat(u.LJJIFFI(str, "px", "", false)) * sVar.getResources().getDisplayMetrics().density;
            }
            return 0;
        }
        return (int) f;
    }
}
