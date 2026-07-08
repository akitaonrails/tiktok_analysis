package X;

import android.app.Activity;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.core.model.DynamicToast;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zUA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897800zUA {
    public static final C1897800zUA LIZ = new C1897800zUA();
    public static DynamicDialog LIZIZ;
    public static DynamicToast LIZJ;
    public static boolean LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4 A[PHI: r1
      0x00c4: PHI (r1v4 java.lang.Integer) = (r1v3 java.lang.Integer), (r1v6 java.lang.Integer) binds: [B:54:0x00c1, B:49:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1897800zUA.LIZLLL():void");
    }

    public static void LIZ(String str, boolean z) {
        String strLJIJJ;
        boolean z2;
        C1893790zNh c1893790zNh = C1893790zNh.LIZ;
        c1893790zNh.getClass();
        if (!C1893790zNh.LIZIZ(str)) {
            return;
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP == null || (strLJIJJ = abstractC1896090zRP.LJIJJ()) == null) {
            strLJIJJ = "";
        }
        C1893790zNh.LJIIIZ(strLJIJJ, new InterfaceC1893800zNi() { // from class: X.0zNl
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
        AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP2 != null && abstractC1896090zRP2.LJIIZILJ() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1893790zNh.LJIIIIZZ(str, "", "retry_dialog", z2, false);
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

    public static void LIZIZ(Activity activity, final DynamicDialog dynamicDialog, boolean z, Integer num, Integer num2, final Function0 function0) {
        int iLIZIZ;
        final String str = dynamicDialog.popId;
        if (str == null || !(!a0.LJJJIL(str))) {
            str = null;
        }
        if (C293540Bey.LIZ() && str != null && !a0.LJJJIL(str)) {
            C1899920zXa.LJFF(C1899920zXa.LIZ, EnumC1899970zXf.FEED, str, dynamicDialog, new InterfaceC1899900zXY() { // from class: X.0zUF
                @Override // X.InterfaceC1899900zXY
                public final void LIZ() {
                }

                @Override // X.InterfaceC1899900zXY
                public final void LJIJJLI() {
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    DynamicDialog dynamicDialog2 = dynamicDialog;
                    int i = dynamicDialog2.LIZ;
                    Integer num3 = dynamicDialog2.LIZJ;
                    int iIntValue = num3 != null ? num3.intValue() : -1;
                    c1893680zNW.getClass();
                    C1893680zNW.LIZ(1, i, iIntValue, 1, "");
                }

                @Override // X.InterfaceC1899900zXY
                public final void onDismiss() {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // X.InterfaceC1899900zXY
                public final void onShow() {
                    C1897800zUA.LIZ.getClass();
                    C1897800zUA.LIZLLL = true;
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    int i = dynamicDialog.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DynamicDialog dynamicDialog2 = dynamicDialog;
                    linkedHashMap.put("notification_name", dynamicDialog2.notificationName);
                    linkedHashMap.put("pop_name", dynamicDialog2.popName);
                    DynamicDialog dynamicDialog3 = dynamicDialog;
                    Integer num3 = dynamicDialog3.LIZJ;
                    Integer num4 = dynamicDialog3.showAfter;
                    Integer numValueOf = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                    c1894320zOY.getClass();
                    C1894320zOY.LJIJJ(i, linkedHashMap, num3, numValueOf, null, "");
                }

                @Override // X.InterfaceC1899900zXY
                public final void LJIL(String str2) {
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                }

                @Override // X.InterfaceC1899900zXY
                public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, String str2) {
                    int iIntValue;
                    String strLJFF;
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    int i = dynamicDialog.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DynamicDialog dynamicDialog2 = dynamicDialog;
                    linkedHashMap.put("click_position", str2);
                    linkedHashMap.put("notification_name", dynamicDialog2.notificationName);
                    linkedHashMap.put("pop_name", dynamicDialog2.popName);
                    String str3 = "";
                    if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "")) != null) {
                        str3 = strLJFF;
                    }
                    linkedHashMap.put("click_area", str3);
                    DynamicDialog dynamicDialog3 = dynamicDialog;
                    Integer num3 = dynamicDialog3.LIZJ;
                    Integer num4 = dynamicDialog3.showAfter;
                    if (num4 != null) {
                        iIntValue = num4.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    c1894320zOY.getClass();
                    C1894320zOY.LJIILJJIL(i, linkedHashMap, num3, numValueOf, null);
                    if (Intrinsics.LJFF(str2, "confirm")) {
                        C1897800zUA c1897800zUA = C1897800zUA.LIZ;
                        DynamicDialog dynamicDialog4 = dynamicDialog;
                        String str4 = str;
                        c1897800zUA.getClass();
                        C01U6.LIZIZ(new AwS177S1100000_28(dynamicDialog4, str4, 13));
                    }
                }
            });
            return;
        }
        C1897900zUK c1897900zUK = new C1897900zUK(dynamicDialog);
        c1897900zUK.LIZLLL = z;
        int iLIZIZ2 = -1;
        if (num != null) {
            C1546210qL5.LIZ.getClass();
            iLIZIZ = C814420VxA.LIZIZ(C1546210qL5.LIZ(num));
        } else {
            iLIZIZ = -1;
        }
        if (num2 != null) {
            C1546210qL5.LIZ.getClass();
            iLIZIZ2 = C814420VxA.LIZIZ(C1546210qL5.LIZ(num2));
        }
        c1897900zUK.LIZIZ = new C1897930zUN(iLIZIZ, iLIZIZ2);
        C1619720sFe.LIZ.LIZ(4);
        c1897900zUK.LJ = true;
        c1897900zUK.LIZJ = new InterfaceC1897910zUL() { // from class: X.0zUG
            @Override // X.InterfaceC1897910zUL
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1897910zUL
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1897910zUL
            public final void LJ(InterfaceC1107590evd interfaceC1107590evd, DialogC1897810zUB dialogC1897810zUB) {
            }

            @Override // X.InterfaceC1897910zUL
            public final void onDismiss() {
            }

            @Override // X.InterfaceC1897910zUL
            public final void LJIJJLI() {
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                DynamicDialog dynamicDialog2 = dynamicDialog;
                int i = dynamicDialog2.LIZ;
                Integer num3 = dynamicDialog2.LIZJ;
                int iIntValue = num3 != null ? num3.intValue() : -1;
                c1893680zNW.getClass();
                C1893680zNW.LIZ(1, i, iIntValue, 1, "");
            }

            @Override // X.InterfaceC1897910zUL
            public final void onShow() {
                C1897800zUA.LIZ.getClass();
                C1897800zUA.LIZLLL = true;
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                int i = dynamicDialog.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                DynamicDialog dynamicDialog2 = dynamicDialog;
                linkedHashMap.put("notification_name", dynamicDialog2.notificationName);
                linkedHashMap.put("pop_name", dynamicDialog2.popName);
                DynamicDialog dynamicDialog3 = dynamicDialog;
                Integer num3 = dynamicDialog3.LIZJ;
                Integer num4 = dynamicDialog3.showAfter;
                Integer numValueOf = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                c1894320zOY.getClass();
                C1894320zOY.LJIJJ(i, linkedHashMap, num3, numValueOf, null, "");
            }

            @Override // X.InterfaceC1897910zUL
            public final void LJIL(String str2) {
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }

            @Override // X.InterfaceC1897910zUL
            public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, String str2) {
                int iIntValue;
                String strLJFF;
                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                int i = dynamicDialog.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                DynamicDialog dynamicDialog2 = dynamicDialog;
                linkedHashMap.put("click_position", str2);
                linkedHashMap.put("notification_name", dynamicDialog2.notificationName);
                linkedHashMap.put("pop_name", dynamicDialog2.popName);
                String str3 = "";
                if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "")) != null) {
                    str3 = strLJFF;
                }
                linkedHashMap.put("click_area", str3);
                DynamicDialog dynamicDialog3 = dynamicDialog;
                Integer num3 = dynamicDialog3.LIZJ;
                Integer num4 = dynamicDialog3.showAfter;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                c1894320zOY.getClass();
                C1894320zOY.LJIILJJIL(i, linkedHashMap, num3, numValueOf, null);
            }
        };
        DialogC1897810zUB dialogC1897810zUB = new DialogC1897810zUB("TaskEventPopupManager", activity, new C1897880zUI(c1897900zUK));
        dialogC1897810zUB.LLILZLL = true;
        dialogC1897810zUB.LLJ = true;
        dialogC1897810zUB.setOnDismissListener(new DialogInterfaceOnDismissListenerC19333210kM(function0, 14));
    }
}
