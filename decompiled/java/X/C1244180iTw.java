package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S0312000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS57S0310000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: renamed from: X.0iTw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244180iTw {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, X.0iTt] */
    public static final void LIZ(Context context, C1244220iU0 c1244220iU0, PushSettingsLoginVM pushSettingsLoginVM, boolean z, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Activity activityLIZIZ;
        final Activity activityLIZ;
        boolean z2;
        boolean z3 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1389071351);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(context)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(c1244220iU0)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(pushSettingsLoginVM)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z3)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                z3 = false;
            }
            if (!c1244220iU0.LLJJIII) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS0S0312000_19(context, c1244220iU0, pushSettingsLoginVM, z3, i, i2, 0);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            C05P0 c05p02 = (C05P0) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            EnumC1244190iTx enumC1244190iTx = ((C20304914ch) C1244280iU6.LIZ(pushSettingsLoginVM, null, c13zcLJIIJ, (i3 >> 6) & 14, 7).getValue()).LLILZ;
            c13zcLJIIJ.LJJIIJZLJL(-837249139);
            if (enumC1244190iTx == EnumC1244190iTx.CHECK_EMAIL) {
                if (((Boolean) c05p0.getValue()).booleanValue()) {
                    C1244170iTv.LIZ.getClass();
                    if (!TextUtils.isEmpty(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getEmail())) {
                        C1244170iTv.LIZ();
                    }
                    c05p0.setValue(Boolean.FALSE);
                }
                pushSettingsLoginVM.AQ2(C1244200iTy.LIZ);
            } else if (enumC1244190iTx == EnumC1244190iTx.SHOW_POP) {
                C1245240iVe.LIZ.getClass();
                DialogC1244150iTt dialogC1244150iTt = (DialogC1244150iTt) c05p02.getValue();
                if (dialogC1244150iTt == null) {
                    C1244170iTv c1244170iTv = C1244170iTv.LIZ;
                    c13zcLJIIJ.LJJIIJZLJL(5004770);
                    Object objLJJ3 = c13zcLJIIJ.LJJ();
                    if (objLJJ3 == c1680520tpi) {
                        objLJJ3 = new AwS563S0100000_19(c05p0, (C05P0<AbstractC1220800hsE>) 3409);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                    }
                    final Function0 function0 = (Function0) objLJJ3;
                    c13zcLJIIJ.LJJJJL(false);
                    c1244170iTv.getClass();
                    C259800zU c259800zU = new C259800zU();
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        ?? dialogC1244150iTt2 = new DialogC1244150iTt(activityLIZ);
                        dialogC1244150iTt2.LL = new InterfaceC1244160iTu() { // from class: X.0iFu
                            @Override // X.InterfaceC1244160iTu
                            public final void LJJJJ() {
                                Bundle bundle = new Bundle();
                                bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_EMAIL_NOTIFICATION.getValue());
                                C0XQ7.LIZ().bindEmail(activityLIZ, "email_notification", "click", bundle, null);
                                function0.invoke();
                            }
                        };
                        c259800zU.element = dialogC1244150iTt2;
                    }
                    dialogC1244150iTt = (DialogC1244150iTt) c259800zU.element;
                    if (dialogC1244150iTt != null) {
                        c05p02.setValue(dialogC1244150iTt);
                        dialogC1244150iTt.show();
                        C785410UrT.LIZIZ(dialogC1244150iTt);
                        PopupMonitorServiceImpl.LIZ.getClass();
                        PopupMonitorServiceImpl.LJJJ(dialogC1244150iTt);
                        C816490W1f.LIZ(dialogC1244150iTt);
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("page_name", "notification_setting_page");
                    c2344009Gk.LJIIIIZZ("exp_name", "email_notification_phase2");
                    C20684815ws.LJIILLIIL("show_email_bind_popup_page", c2344009Gk.LIZ);
                    pushSettingsLoginVM.AQ2(C1244200iTy.LIZ);
                } else {
                    dialogC1244150iTt.show();
                    C785410UrT.LIZIZ(dialogC1244150iTt);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1244150iTt);
                    C816490W1f.LIZ(dialogC1244150iTt);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("page_name", "notification_setting_page");
                    c2344009Gk2.LJIIIIZZ("exp_name", "email_notification_phase2");
                    C20684815ws.LJIILLIIL("show_email_bind_popup_page", c2344009Gk2.LIZ);
                    pushSettingsLoginVM.AQ2(C1244200iTy.LIZ);
                }
            } else if (enumC1244190iTx == EnumC1244190iTx.ENTER_PAGE) {
                C1244170iTv.LIZ.getClass();
                C1244170iTv.LIZIZ();
                pushSettingsLoginVM.AQ2(C1244200iTy.LIZ);
            }
            c13zcLJIIJ.LJJJJL(false);
            String str = c1244220iU0.LLJILJILJ;
            String str2 = c1244220iU0.LLJJIJIL;
            if (str2 == null) {
                str2 = "";
            }
            boolean z4 = c1244220iU0.LLJJJ;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zLJII = z2 | c13zcLJIIJ.LJII(c1244220iU0) | c13zcLJIIJ.LJII(context) | c13zcLJIIJ.LJII(pushSettingsLoginVM);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS57S0310000_19(z3, c1244220iU0, context, pushSettingsLoginVM, 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, str, 0, str2, false, false, null, false, null, z4, null, false, false, null, null, null, null, null, (Function0) objLJJ4, null, null, null, null, false, C13Z4.LIZJ(-620426056, new AwS633S0100000_19(c1244220iU0, 317), c13zcLJIIJ), c13zcLJIIJ, 0, 0, 24576, 16514549);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS0S0312000_19(context, c1244220iU0, pushSettingsLoginVM, z3, i, i2, 1);
        }
    }
}
