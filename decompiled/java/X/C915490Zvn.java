package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Zvn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915490Zvn {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void LIZ(EnumC919170a1j enumC919170a1j, Context context, Throwable th) {
        int i;
        String strLJIJI;
        if (th instanceof C501470JlZ) {
            C501520Jle c501520Jle = (C501520Jle) th;
            int errorCode = c501520Jle.getErrorCode();
            if (errorCode != 10023) {
                if (errorCode == 4029020) {
                    if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 2) {
                        i = 2131851821;
                        strLJIJI = C497740JfY.LJIJI(i);
                    }
                    strLJIJI = "";
                } else {
                    switch (errorCode) {
                        case 4029022:
                            i = 2131851706;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029023:
                            i = 2131851704;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029024:
                            i = 2131851705;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029025:
                            int i2 = C915470Zvl.LIZ[enumC919170a1j.ordinal()];
                            if (i2 != 1 && i2 == 2) {
                                i = 2131851707;
                                strLJIJI = C497740JfY.LJIJI(i);
                            }
                            strLJIJI = "";
                            break;
                        case 4029026:
                            i = 2131851720;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029027:
                            i = 2131851721;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029028:
                            i = 2131851722;
                            strLJIJI = C497740JfY.LJIJI(i);
                            break;
                        case 4029029:
                            if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 2) {
                                i = 2131851806;
                                strLJIJI = C497740JfY.LJIJI(i);
                            }
                            strLJIJI = "";
                            break;
                        case 4029030:
                            if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 2) {
                                i = 2131851807;
                                strLJIJI = C497740JfY.LJIJI(i);
                            }
                            strLJIJI = "";
                            break;
                        case 4029031:
                            if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 2) {
                                i = 2131851729;
                                strLJIJI = C497740JfY.LJIJI(i);
                            }
                            strLJIJI = "";
                            break;
                        case 4029032:
                            if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 2) {
                                i = 2131851730;
                                strLJIJI = C497740JfY.LJIJI(i);
                            }
                            strLJIJI = "";
                            break;
                        default:
                            strLJIJI = "";
                            break;
                    }
                }
            } else {
                if (C915470Zvl.LIZ[enumC919170a1j.ordinal()] == 1) {
                    i = 2131851557;
                    strLJIJI = C497740JfY.LJIJI(i);
                }
                strLJIJI = "";
            }
            if (strLJIJI.length() > 0) {
                C766270U4b.LJIIJJI(strLJIJI);
            }
            for (EnumC2010607uC enumC2010607uC : EnumC2010607uC.values()) {
                if (enumC2010607uC.getErrorCode() == c501520Jle.getErrorCode()) {
                    return;
                }
            }
        }
        C501540Jlg.LIZJ(context, th);
    }
}
