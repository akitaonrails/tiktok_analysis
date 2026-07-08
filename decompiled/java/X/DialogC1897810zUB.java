package X;

import Y.ACallableS431S0100000_28;
import Y.ACallableS73S1100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.incentive.crossplatform.headless.PrefetchUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class DialogC1897810zUB extends DialogC1899840zXS implements InterfaceC1141530foN {
    public final Activity LLILZ;
    public final C1897880zUI LLILZIL;
    public boolean LLILZLL;
    public final boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final DynamicDialog LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJJI;

    public final void LJJLIIIJLLLLLLLZ() {
        if (Intrinsics.LJFF(this.LLJI.needLoginGate, Boolean.TRUE) && !C1894310zOX.LIZIZ()) {
            C1893580zNM.LJ(C1893580zNM.LIZ, getContext(), Integer.valueOf(this.LLJI.LIZ), this.LLJILJIL, "sparkDialog", true, this.LLJI.LJ, new AwS607S0100000_28(this, 370), null, 128);
            LJJLIIJ(true);
        } else {
            C1893580zNM.LJ(C1893580zNM.LIZ, getContext(), Integer.valueOf(this.LLJI.LIZ), this.LLJILJIL, "sparkDialog", false, this.LLJI.LJ, null, null, 192);
            LJJLIIJ(false);
            dismiss();
            C785410UrT.LIZ(this);
        }
    }

    public final boolean LJJLJ() throws Throwable {
        Object obj;
        C1897770zU7 c1897770zU7 = (C1897770zU7) C1619720sFe.LIZ.LIZ(4);
        if (c1897770zU7 == null || !c1897770zU7.LIZIZ(Integer.valueOf(this.LLJI.LIZ), this.LLJI)) {
            InterfaceC1897910zUL interfaceC1897910zUL = this.LLILZIL.LJ;
            if (interfaceC1897910zUL != null) {
                interfaceC1897910zUL.LJIL("can not show after load finish");
            }
            return false;
        }
        if (!this.LLILZ.isFinishing() && !isShowing()) {
            if (C0BIT.LIZ()) {
                C01U6.LIZIZ(new AwS572S0100000_28(this, 1064));
            }
            C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyQafke3hNgW94d+J46/XhLOdnuYZRbOuTHUyBsfKw8", null);
            C0WST c0wst = new C0WST();
            Object[] objArr = new Object[0];
            C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
            C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", this, objArr, "void", c0wzw);
            if (c0wsuLIZIZ.LIZ) {
                c0wst.LIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", null, objArr, this, c0wzw, false);
            } else {
                Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                DialogC19728412Gs dialogC19728412Gs = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC19728412Gs) obj;
                dialogC19728412Gs.show();
                c0wst.LIZ(300000, "com/bytedance/touchpoint/ui/popup/ResizableDialog", "show", null, objArr, dialogC19728412Gs, c0wzw, true);
            }
            InterfaceC1897910zUL interfaceC1897910zUL2 = this.LLILZIL.LJ;
            if (interfaceC1897910zUL2 != null) {
                interfaceC1897910zUL2.onShow();
            }
            C15O7.LIZJ(new ACallableS431S0100000_28(this, 33));
            C0J3B.LIZ(URLDecoder.decode(this.LLJILJIL, "UTF-8"), "dialog");
        }
        InterfaceC1897910zUL interfaceC1897910zUL3 = this.LLILZIL.LJ;
        if (interfaceC1897910zUL3 != null) {
            interfaceC1897910zUL3.LJIJJLI();
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            if (this.LLJ) {
                C1548820qPI.LJIIIIZZ("referral_popup_show", this);
                C1548820qPI.LJIIIIZZ("referral_popup_closed", this);
                C1548820qPI.LJIIIIZZ("referral_popup_present_page", this);
                C1548820qPI.LJIIIIZZ("referral_popup_click", this);
                C1548820qPI.LJIIIIZZ("referral_popup_resource_load_failed", this);
            }
            if (this.LLIZ || C274810Apr.LIZ()) {
                C01U6.LIZIZ(new AwS572S0100000_28(this, 1063));
            }
            if (C0BIT.LIZ()) {
                C01U6.LIZIZ(new AwS572S0100000_28(this, 1062));
            }
            InterfaceC1897910zUL interfaceC1897910zUL = this.LLILZIL.LJ;
            if (interfaceC1897910zUL != null) {
                interfaceC1897910zUL.onDismiss();
            }
            super.dismiss();
        }
    }

    public final void LJJLIIJ(boolean z) {
        String strLJIJJ;
        boolean z2;
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        String str = this.LLJILJIL;
        c1893790zNh.getClass();
        if (!C1893790zNh.LIZIZ(str)) {
            return;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP == null || (strLJIJJ = abstractC1896090zRP.LJIJJ()) == null) {
            strLJIJJ = "";
        }
        C1893790zNh.LJIIIZ(strLJIJJ, new InterfaceC1893800zNi() { // from class: X.0zNo
            @Override // X.InterfaceC1893800zNi
            public final boolean isDebug() {
                return false;
            }

            @Override // X.InterfaceC1893800zNi
            public final void LIZ(String str2, Map<String, String> map) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ(str2, map);
                }
            }
        });
        String str2 = this.LLJILJIL;
        AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP2 != null && abstractC1896090zRP2.LJIIZILJ() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1893790zNh.LJIIIIZZ(str2, "", "retry_dialog", z2, false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1893790zNh.getClass();
        C1893790zNh.LJIIJ("inc_activity_start", null, linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        c1893790zNh.getClass();
        C1893790zNh.LJIIJ("inc_activity_deep_link_start", null, linkedHashMap2);
        if (!z) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            c1893790zNh.getClass();
            C1893790zNh.LJIIJ("inc_activity_deep_link_end", null, linkedHashMap3);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) throws Throwable {
        Map<String, Object> mapLJIIIIZZ;
        String strLJFF;
        String strLJFF2;
        InterfaceC1897910zUL interfaceC1897910zUL;
        String strLJFF3;
        String strLJFF4;
        InterfaceC1871920yoQ interfaceC1871920yoQLIZ;
        List<Object> list;
        String strLJIJJ;
        String strLJFF5;
        String strLJIJJ2 = null;
        try {
            String str = "";
            if (this.LLILZIL.LIZLLL) {
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null) {
                    strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd, "touchpointId", "");
                } else {
                    strLJFF5 = null;
                }
                if (!Intrinsics.LJFF(strLJFF5, String.valueOf(this.LLJI.LIZ))) {
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive JsEvent: ");
            sbLIZ.append(c262100zr.LIZ);
            sbLIZ.append(", ");
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                mapLJIIIIZZ = C1871910yoP.LJIIIIZZ(interfaceC1107590evd2);
            } else {
                mapLJIIIIZZ = null;
            }
            sbLIZ.append(mapLJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                } else {
                    strLJIJJ = null;
                }
                linkedHashMap.put("region", strLJIJJ);
                linkedHashMap.put("event", c262100zr.LIZ);
                interfaceC1897260zTILIZIZ.LIZ("lynx_dialog_event", linkedHashMap);
            }
            String str2 = c262100zr.LIZ;
            switch (str2.hashCode()) {
                case -2008970598:
                    if (str2.equals("referral_popup_resource_load_failed")) {
                        InterfaceC1897910zUL interfaceC1897910zUL2 = this.LLILZIL.LJ;
                        if (interfaceC1897910zUL2 != null) {
                            InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                            if (interfaceC1107590evd3 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd3, "error_msg", "")) != null) {
                                str = strLJFF2;
                            }
                            interfaceC1897910zUL2.LJIL(str);
                        }
                        if (C274810Apr.LIZ()) {
                            dismiss();
                            C785410UrT.LIZ(this);
                        }
                    }
                    break;
                case 145295809:
                    if (str2.equals("referral_popup_closed")) {
                        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd4 != null && (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd4, "type", "")) != null) {
                            str = strLJFF3;
                        }
                        if (Intrinsics.LJFF(str, "close") && (interfaceC1897910zUL = this.LLILZIL.LJ) != null) {
                            interfaceC1897910zUL.LIZLLL();
                        }
                        dismiss();
                        C785410UrT.LIZ(this);
                    }
                    break;
                case 697417363:
                    if (str2.equals("referral_popup_click")) {
                        InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd5 != null && (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd5, "type", "")) != null) {
                            str = strLJFF4;
                        }
                        InterfaceC1897910zUL interfaceC1897910zUL3 = this.LLILZIL.LJ;
                        if (interfaceC1897910zUL3 != null) {
                            interfaceC1897910zUL3.LIZIZ(c262100zr.LIZIZ, str);
                        }
                        C15O7.LIZJ(new ACallableS73S1100000_28(this, str, 3));
                        if (Intrinsics.LJFF(str, "confirm")) {
                            InterfaceC1897910zUL interfaceC1897910zUL4 = this.LLILZIL.LJ;
                            if (interfaceC1897910zUL4 != null && interfaceC1897910zUL4.LIZJ()) {
                                this.LLILZIL.LJ.LJ(c262100zr.LIZIZ, this);
                            } else {
                                LJJLIIIJLLLLLLLZ();
                            }
                        } else if (Intrinsics.LJFF(str, "close")) {
                            InterfaceC1897910zUL interfaceC1897910zUL5 = this.LLILZIL.LJ;
                            if (interfaceC1897910zUL5 != null) {
                                interfaceC1897910zUL5.LIZLLL();
                            }
                            dismiss();
                            C785410UrT.LIZ(this);
                        }
                    }
                    break;
                case 1269896338:
                    if (str2.equals("referral_popup_show")) {
                        this.LLJILLL = true;
                        if (!this.LLJILJILJ) {
                            if (this.LLILZLL) {
                                LJJLJ();
                            } else {
                                InterfaceC1897910zUL interfaceC1897910zUL6 = this.LLILZIL.LJ;
                                if (interfaceC1897910zUL6 != null) {
                                    interfaceC1897910zUL6.LJIJJLI();
                                }
                            }
                        }
                        InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd6 != null && (interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evd6, "jumpUrls", null)) != null && (list = interfaceC1871920yoQLIZ.toList()) != null) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (obj instanceof String) {
                                    arrayList.add(obj);
                                }
                            }
                            PrefetchUtils.LIZ(arrayList);
                            break;
                        }
                    }
                    break;
                case 1383314472:
                    if (str2.equals("referral_popup_present_page")) {
                        InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                        if (interfaceC1107590evd7 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd7, "url", "")) != null) {
                            str = strLJFF;
                        }
                        if (str.length() > 0) {
                            C1893580zNM c1893580zNM = C1893580zNM.LIZ;
                            Context context = getContext();
                            Integer numValueOf = Integer.valueOf(this.LLJI.LIZ);
                            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("incentive_no_saf", "1"));
                            c1893580zNM.getClass();
                            C1893580zNM.LJ(c1893580zNM, context, numValueOf, C1893580zNM.LIZ(str, mapLIZJ), "sparkDialog", false, this.LLJI.LJ, null, null, 192);
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe2.LIZIZ();
            if (interfaceC1897260zTILIZIZ2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                if (abstractC1896090zRP2 != null) {
                    strLJIJJ2 = abstractC1896090zRP2.LJIJJ();
                }
                linkedHashMap2.put("region", strLJIJJ2);
                linkedHashMap2.put("event", e.toString());
                interfaceC1897260zTILIZIZ2.LIZ("lynx_dialog_event", linkedHashMap2);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.8f);
        }
    }

    public /* synthetic */ DialogC1897810zUB(String str, Activity activity, C1897880zUI c1897880zUI) {
        this(str, activity, c1897880zUI, true, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC1897810zUB(java.lang.String r10, android.app.Activity r11, X.C1897880zUI r12, boolean r13, boolean r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC1897810zUB.<init>(java.lang.String, android.app.Activity, X.0zUI, boolean, boolean):void");
    }
}
