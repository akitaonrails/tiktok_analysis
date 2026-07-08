package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1474050oSh {
    public static String LIZ() {
        if (!C1473020oR2.LIZIZ() && !((Boolean) C1474810oTv.v0.getValue()).booleanValue()) {
            return "-_-";
        }
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        StringBuilder sb = new StringBuilder();
        for (int iIntValue = ((Number) C1474810oTv.w0.getValue()).intValue(); iIntValue <= ((Number) C1474810oTv.x0.getValue()).intValue() && iIntValue < stackTrace.length; iIntValue++) {
            sb.append(stackTrace[iIntValue].getClassName());
            sb.append(":");
            sb.append(stackTrace[iIntValue].getMethodName());
            sb.append("->");
        }
        return sb.toString();
    }

    public static void LJII(InterfaceC1474060oSi interfaceC1474060oSi) {
        if (!interfaceC1474060oSi.LJ()) {
            return;
        }
        SimRadar.keyScan("VideoView", "stAnim", interfaceC1474060oSi.getStackTraceString());
    }

    public static void LIZJ(InterfaceC1474060oSi interfaceC1474060oSi, float f) {
        if (f == 1.0f || !interfaceC1474060oSi.LJ()) {
            return;
        }
        String stackTraceString = interfaceC1474060oSi.getStackTraceString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(stackTraceString);
        sbLIZ.append(":");
        sbLIZ.append(f);
        SimRadar.keyScan("VideoView", "scaleX", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZLLL(InterfaceC1474060oSi interfaceC1474060oSi, float f) {
        if (f == 1.0f || !interfaceC1474060oSi.LJ()) {
            return;
        }
        String stackTraceString = interfaceC1474060oSi.getStackTraceString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(stackTraceString);
        sbLIZ.append(":");
        sbLIZ.append(f);
        SimRadar.keyScan("VideoView", "scaleY", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJI(InterfaceC1474060oSi interfaceC1474060oSi, int i) {
        if (i == 0 || !interfaceC1474060oSi.LJ()) {
            return;
        }
        String stackTraceString = interfaceC1474060oSi.getStackTraceString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(stackTraceString);
        sbLIZ.append(":");
        sbLIZ.append(i);
        SimRadar.keyScan("VideoView", "visible", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(InterfaceC1474060oSi interfaceC1474060oSi, String str, ViewGroup.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            i = ((FrameLayout.LayoutParams) layoutParams).gravity;
        } else {
            i = 17;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 = marginLayoutParams.leftMargin;
            i4 = marginLayoutParams.rightMargin;
            i5 = marginLayoutParams.topMargin;
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if ((i == 17 && i3 == 0 && i4 == 0 && i5 == 0 && i2 == 0) || !interfaceC1474060oSi.LJ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(",w:");
        sbLIZ.append(layoutParams.width);
        sbLIZ.append(",h:");
        sbLIZ.append(layoutParams.height);
        sbLIZ.append(",g:");
        sbLIZ.append(i);
        sbLIZ.append(",m:[");
        sbLIZ.append(i3);
        sbLIZ.append(",");
        sbLIZ.append(i5);
        sbLIZ.append(",");
        sbLIZ.append(i4);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append(e3.f);
        SimRadar.keyScan("VideoView", "setLp", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJ(InterfaceC1474060oSi interfaceC1474060oSi, String str, float f) {
        if (f == 0.0f || !interfaceC1474060oSi.LJ()) {
            return;
        }
        if ("UNKNOWN".equals(str)) {
            str = interfaceC1474060oSi.getStackTraceString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(":");
        sbLIZ.append(f);
        SimRadar.keyScan("VideoView", "transX", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJFF(InterfaceC1474060oSi interfaceC1474060oSi, String str, float f) {
        if (f == 0.0f || !interfaceC1474060oSi.LJ()) {
            return;
        }
        if ("UNKNOWN".equals(str)) {
            str = interfaceC1474060oSi.getStackTraceString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(":");
        sbLIZ.append(f);
        SimRadar.keyScan("VideoView", "transY", C2188811AlT.LIZIZ(sbLIZ));
    }
}
