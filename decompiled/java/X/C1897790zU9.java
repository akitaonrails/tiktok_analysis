package X;

import Y.ACallableS431S0100000_28;
import Y.ACallableS73S1100000_28;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.touchpoint.api.model.Title;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.PopupViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS177S1100000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zU9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897790zU9 extends AbstractC1895130zPr {
    public static final C1897790zU9 LL = new C1897790zU9();
    public static boolean LLILLJJLI;
    public static boolean LLILLL;
    public static int LLILZ;
    public static boolean LLILZIL;
    public static boolean LLILZLL;
    public static DynamicDialog LLIZ;
    public static boolean LLIZLLLIL;
    public static DialogC1897810zUB LLJ;
    public static boolean LLJI;
    public static boolean LLJIJIL;
    public static boolean LLJILJIL;
    public static final C736950SvV LLJILJILJ;

    public final void LJIIJ() {
        Integer num;
        LLJI = false;
        if (LLJIJIL) {
            DynamicDialog dynamicDialog = LLIZ;
            if ((dynamicDialog != null ? dynamicDialog.showAfter : null) == null || (dynamicDialog != null && (num = dynamicDialog.showAfter) != null && num.intValue() == 0)) {
                LLJILJIL = true;
            }
        } else {
            LJIILIIL();
        }
        LLJIJIL = false;
    }

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLJILJILJ = new C736950SvV(C13LE.LIZ(PopupViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1897940zUO(), null, null, null);
    }

    public static String LJIIJJI() {
        String str;
        DynamicDialog dynamicDialog = LLIZ;
        if (dynamicDialog == null || (str = dynamicDialog.popId) == null || !(!a0.LJJJIL(str))) {
            return null;
        }
        return str;
    }

    public static final void LJIILIIL() {
        Activity activityLJIILL;
        C1897770zU7 c1897770zU7;
        Map<String, String> map;
        Integer num;
        DynamicDialog dynamicDialog = LLIZ;
        if (dynamicDialog != null) {
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP == null || (activityLJIILL = abstractC1896090zRP.LJIILL()) == null) {
                return;
            }
            C1897790zU9 c1897790zU9 = LL;
            c1897790zU9.getClass();
            if (LLJI || LLJILJIL) {
                return;
            }
            C1893790zNh.LIZ.getClass();
            if (C1893790zNh.LJIIZILJ) {
                return;
            }
            DynamicDialog dynamicDialog2 = LLIZ;
            String str = dynamicDialog2 != null ? dynamicDialog2.name : null;
            String str2 = "others";
            if (LLILLJJLI || LLILLL) {
                if (LLILZLL) {
                    return;
                }
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("pop_name", str);
                    linkedHashMap.put("result", "have_popped");
                    C1897770zU7 c1897770zU72 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU72 != null && c1897770zU72.LJ(LLIZ)) {
                        str2 = "feed";
                    }
                    linkedHashMap.put("position", str2);
                    interfaceC1897260zTILIZIZ.LIZ("pop_filtered_reason", linkedHashMap);
                }
                LLILZLL = true;
                return;
            }
            C1897770zU7 c1897770zU73 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU73 != null) {
                c1897770zU73.LIZLLL();
            }
            C1897770zU7 c1897770zU74 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU74 != null && !c1897770zU74.LJ(LLIZ)) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ2 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("pop_name", str);
                    linkedHashMap2.put("result", "not_in_feed");
                    linkedHashMap2.put("position", "others");
                    interfaceC1897260zTILIZIZ2.LIZ("pop_filtered_reason", linkedHashMap2);
                    return;
                }
                return;
            }
            C1897770zU7 c1897770zU75 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU75 != null && c1897770zU75.LIZJ()) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ3 = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ3 != null) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("pop_name", str);
                    linkedHashMap3.put("result", "popup_occupied");
                    C1897770zU7 c1897770zU76 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU76 != null && c1897770zU76.LJ(LLIZ)) {
                        str2 = "feed";
                    }
                    linkedHashMap3.put("position", str2);
                    interfaceC1897260zTILIZIZ3.LIZ("pop_filtered_reason", linkedHashMap3);
                    return;
                }
                return;
            }
            C1897770zU7 c1897770zU77 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU77 != null && c1897770zU77.LJFF()) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ4 = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ4 != null) {
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.put("pop_name", str);
                    linkedHashMap4.put("result", "insert_card");
                    C1897770zU7 c1897770zU78 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU78 != null && c1897770zU78.LJ(LLIZ)) {
                        str2 = "feed";
                    }
                    linkedHashMap4.put("position", str2);
                    interfaceC1897260zTILIZIZ4.LIZ("pop_filtered_reason", linkedHashMap4);
                    return;
                }
                return;
            }
            C1897770zU7 c1897770zU79 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU79 != null && c1897770zU79.LJIIIIZZ()) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ5 = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ5 != null) {
                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                    linkedHashMap5.put("pop_name", str);
                    linkedHashMap5.put("result", "toast_occupied");
                    C1897770zU7 c1897770zU710 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU710 != null && c1897770zU710.LJ(LLIZ)) {
                        str2 = "feed";
                    }
                    linkedHashMap5.put("position", str2);
                    interfaceC1897260zTILIZIZ5.LIZ("pop_filtered_reason", linkedHashMap5);
                    return;
                }
                return;
            }
            if (LLILZ > 0) {
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ6 = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ6 != null) {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                    linkedHashMap6.put("pop_name", str);
                    linkedHashMap6.put("result", "popup_occupied");
                    C1897770zU7 c1897770zU711 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU711 != null && c1897770zU711.LJ(LLIZ)) {
                        str2 = "feed";
                    }
                    linkedHashMap6.put("position", str2);
                    interfaceC1897260zTILIZIZ6.LIZ("pop_filtered_reason", linkedHashMap6);
                    return;
                }
                return;
            }
            C1895020zPg.LL.getClass();
            C1897770zU7 c1897770zU712 = (C1897770zU7) c1619720sFe.LIZ(4);
            if (c1897770zU712 != null) {
                DynamicDialog dynamicDialog3 = LLIZ;
                int iIntValue = (dynamicDialog3 == null || (num = dynamicDialog3.showAfter) == null) ? 0 : num.intValue();
                DynamicDialog dynamicDialog4 = LLIZ;
                if (c1897770zU712.LJII(iIntValue, dynamicDialog4 != null ? dynamicDialog4.validPages : null)) {
                    DynamicDialog dynamicDialog5 = LLIZ;
                    if (Intrinsics.LJFF((dynamicDialog5 == null || (map = dynamicDialog5.LJ) == null) ? null : map.get("type"), "onelink_retry") && (c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4)) != null && c1897770zU7.LJI()) {
                        return;
                    }
                    C1897770zU7 c1897770zU713 = (C1897770zU7) c1619720sFe.LIZ(4);
                    if (c1897770zU713 == null) {
                        c1897790zU9.getClass();
                        LJIIZILJ(activityLJIILL, null);
                        return;
                    }
                    AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(activityLJIILL, 245);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(dynamicDialog.jsSource);
                    sbLIZ.append("&touchpointId=");
                    sbLIZ.append(dynamicDialog.LIZ);
                    sbLIZ.append("&launchPlanId=");
                    sbLIZ.append(dynamicDialog.LIZJ);
                    sbLIZ.append("&popupType=");
                    sbLIZ.append(dynamicDialog.name);
                    c1897770zU713.LJIIIZ(activityLJIILL, C2188811AlT.LIZIZ(sbLIZ), awS607S0100000_28);
                    C1893680zNW.LIZ.getClass();
                    C1893680zNW.LJIIJJI(4, null);
                }
            }
        }
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLJILJILJ.getValue();
    }

    public final void init() {
        if (LLILZIL) {
            return;
        }
        LLILZIL = true;
        C736950SvV c736950SvV = LLJILJILJ;
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C1895080zPm) obj).LL);
            }
        }, null, new C1897870zUH());
        ((BaseTouchPointDataVM) c736950SvV.getValue()).vQ2(new C2217381BqS() { // from class: X.0zRH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1895080zPm) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new C1897890zUJ());
    }

    public static void LJIILLIIL(DynamicDialog dynamicDialog) {
        String str;
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
        if (interfaceC1910807e6LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show popup in feed, id: ");
            if (dynamicDialog != null) {
                str = dynamicDialog.popId;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC1910807e6LIZ.LIZIZ();
        }
        C15O7.LIZJ(new ACallableS431S0100000_28(dynamicDialog, 25));
    }

    public static void LJIIL(String str, boolean z) {
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
        C1893790zNh.LJIIIZ(strLJIJJ, new InterfaceC1893800zNi() { // from class: X.0zNk
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

    public static final void LJIILJJIL(Activity activity, final Function0<Unit> function0) {
        DynamicDialog dynamicDialog = LLIZ;
        if (dynamicDialog != null) {
            final DynamicDialog dynamicDialogLIZ = dynamicDialog.LIZ();
            C1897900zUK c1897900zUK = new C1897900zUK(dynamicDialogLIZ);
            C1619720sFe.LIZ.LIZ(4);
            c1897900zUK.LJ = true;
            c1897900zUK.LIZJ = new InterfaceC1897910zUL() { // from class: X.0zUC
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
                public final void LJIJJLI() {
                    C1897790zU9.LLILLL = false;
                    C1897790zU9.LLILLJJLI = true;
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    DynamicDialog dynamicDialog2 = dynamicDialogLIZ;
                    int i = dynamicDialog2.LIZ;
                    Integer num = dynamicDialog2.LIZJ;
                    int iIntValue = num != null ? num.intValue() : -1;
                    c1893680zNW.getClass();
                    C1893680zNW.LIZ(1, i, iIntValue, 1, "");
                }

                @Override // X.InterfaceC1897910zUL
                public final void onDismiss() {
                    C1897790zU9.LLIZLLLIL = false;
                    if (C274810Apr.LIZ()) {
                        DialogC1897810zUB dialogC1897810zUB = C1897790zU9.LLJ;
                        if (dialogC1897810zUB != null) {
                            C1548820qPI.LJIIIIZZ("referral_popup_show", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_closed", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_present_page", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_click", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_resource_load_failed", dialogC1897810zUB);
                            C01U6.LIZIZ(new AwS572S0100000_28(dialogC1897810zUB, 1063));
                        }
                        C1897790zU9.LLJ = null;
                    }
                }

                @Override // X.InterfaceC1897910zUL
                public final void onShow() {
                    C1897790zU9.LLIZLLLIL = true;
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    int i = dynamicDialogLIZ.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DynamicDialog dynamicDialog2 = dynamicDialogLIZ;
                    linkedHashMap.put("notification_name", dynamicDialog2 != null ? dynamicDialog2.notificationName : null);
                    linkedHashMap.put("pop_name", dynamicDialog2 != null ? dynamicDialog2.popName : null);
                    DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                    Integer num = dynamicDialog3.LIZJ;
                    Integer num2 = dynamicDialog3.showAfter;
                    Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                    c1894320zOY.getClass();
                    C1894320zOY.LJIJJ(i, linkedHashMap, num, numValueOf, null, "");
                }

                @Override // X.InterfaceC1897910zUL
                public final void LJIL(String str) {
                    int iIntValue;
                    String str2;
                    String str3;
                    C1897790zU9.LLILLL = false;
                    if (!Intrinsics.LJFF(str, "can not show after load finish")) {
                        C1897790zU9.LLILLJJLI = true;
                    }
                    C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                    InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                    if (interfaceC1897260zTILIZIZ != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        DynamicDialog dynamicDialog2 = C1897790zU9.LLIZ;
                        if (dynamicDialog2 != null) {
                            str2 = dynamicDialog2.name;
                        } else {
                            str2 = null;
                        }
                        linkedHashMap.put("pop_name", str2);
                        linkedHashMap.put("result", "wrong_info");
                        C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
                        if (c1897770zU7 != null && c1897770zU7.LJ(C1897790zU9.LLIZ)) {
                            str3 = "feed";
                        } else {
                            str3 = "others";
                        }
                        linkedHashMap.put("position", str3);
                        interfaceC1897260zTILIZIZ.LIZ("pop_filtered_reason", linkedHashMap);
                    }
                    C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                    DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                    int i = dynamicDialog3.LIZ;
                    Integer num = dynamicDialog3.LIZJ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -1;
                    }
                    if (str == null) {
                        str = "";
                    }
                    c1893680zNW.getClass();
                    C1893680zNW.LIZ(0, i, iIntValue, 1, str);
                    Function0<Unit> function02 = function0;
                    if (function02 != null) {
                        function02.invoke();
                    }
                    if (C274810Apr.LIZ()) {
                        DialogC1897810zUB dialogC1897810zUB = C1897790zU9.LLJ;
                        if (dialogC1897810zUB != null) {
                            C1548820qPI.LJIIIIZZ("referral_popup_show", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_closed", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_present_page", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_click", dialogC1897810zUB);
                            C1548820qPI.LJIIIIZZ("referral_popup_resource_load_failed", dialogC1897810zUB);
                            C01U6.LIZIZ(new AwS572S0100000_28(dialogC1897810zUB, 1063));
                        }
                        C1897790zU9.LLJ = null;
                    }
                }

                @Override // X.InterfaceC1897910zUL
                public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, String str) {
                    String str2;
                    int iIntValue;
                    Integer num;
                    String strLJFF;
                    C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                    DynamicDialog dynamicDialog2 = dynamicDialogLIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                    linkedHashMap.put("click_position", str);
                    String str3 = null;
                    if (dynamicDialog3 != null) {
                        str2 = dynamicDialog3.notificationName;
                    } else {
                        str2 = null;
                    }
                    linkedHashMap.put("notification_name", str2);
                    if (dynamicDialog3 != null) {
                        str3 = dynamicDialog3.popName;
                    }
                    linkedHashMap.put("pop_name", str3);
                    String str4 = "";
                    if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "")) != null) {
                        str4 = strLJFF;
                    }
                    linkedHashMap.put("click_area", str4);
                    DynamicDialog dynamicDialog4 = dynamicDialogLIZ;
                    if (dynamicDialog4 != null && (num = dynamicDialog4.showAfter) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    C1894320zOY.LJIILLIIL(c1894320zOY, dynamicDialog2, linkedHashMap, Integer.valueOf(iIntValue), 16);
                }
            };
            DialogC1897810zUB dialogC1897810zUB = new DialogC1897810zUB("SpecActPopupManager", activity, new C1897880zUI(c1897900zUK));
            dialogC1897810zUB.LLILZLL = true;
            dialogC1897810zUB.LLJ = true;
            LLJ = dialogC1897810zUB;
        }
    }

    public static void LJIILL(DynamicDialog dynamicDialog, String str) {
        String str2;
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
        if (interfaceC1910807e6LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("click popup in feed, id: ");
            if (dynamicDialog != null) {
                str2 = dynamicDialog.popId;
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            sbLIZ.append(", type: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            interfaceC1910807e6LIZ.LIZIZ();
        }
        C15O7.LIZJ(new ACallableS73S1100000_28(dynamicDialog, str, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0zUP] */
    public static void LJIIZILJ(final Activity activity, final Function0 function0) {
        String str;
        final String strLJIIJJI;
        DynamicDialog dynamicDialog = LLIZ;
        if (dynamicDialog != null) {
            String str2 = dynamicDialog.jsSource;
            if (str2 != null && str2.length() != 0) {
                LL.getClass();
                boolean zLJI = MethodIDManager.LJI(71863);
                try {
                    strLJIIJJI = LJIIJJI();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (C293540Bey.LIZ() && strLJIIJJI != null && !a0.LJJJIL(strLJIIJJI)) {
                    DynamicDialog dynamicDialog2 = LLIZ;
                    if (dynamicDialog2 != null) {
                        final DynamicDialog dynamicDialogLIZ = dynamicDialog2.LIZ();
                        C1899920zXa.LJFF(C1899920zXa.LIZ, EnumC1899970zXf.FEED, strLJIIJJI, dynamicDialogLIZ, new InterfaceC1899900zXY() { // from class: X.0zUD
                            @Override // X.InterfaceC1899900zXY
                            public final void LIZ() {
                                C1897790zU9.LLILLL = true;
                            }

                            @Override // X.InterfaceC1899900zXY
                            public final void LJIJJLI() {
                                C1897790zU9.LLILLL = false;
                                C1897790zU9.LLILLJJLI = true;
                                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                                DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                                int i = dynamicDialog3.LIZ;
                                Integer num = dynamicDialog3.LIZJ;
                                int iIntValue = num != null ? num.intValue() : -1;
                                c1893680zNW.getClass();
                                C1893680zNW.LIZ(1, i, iIntValue, 1, "");
                            }

                            @Override // X.InterfaceC1899900zXY
                            public final void onDismiss() {
                                C1897790zU9.LLIZLLLIL = false;
                                Function0<Unit> function02 = function0;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                if (C0BIT.LIZ()) {
                                    C01U6.LIZIZ(new AwS572S0100000_28(activity, 818));
                                }
                            }

                            @Override // X.InterfaceC1899900zXY
                            public final void onShow() {
                                C1897790zU9.LLIZLLLIL = true;
                                C1897790zU9 c1897790zU9 = C1897790zU9.LL;
                                DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                                c1897790zU9.getClass();
                                C1897790zU9.LJIILLIIL(dynamicDialog3);
                                if (C0BIT.LIZ()) {
                                    C01U6.LIZIZ(new AwS572S0100000_28(activity, 819));
                                }
                                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                                int i = dynamicDialogLIZ.LIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                DynamicDialog dynamicDialog4 = dynamicDialogLIZ;
                                linkedHashMap.put("notification_name", dynamicDialog4 != null ? dynamicDialog4.notificationName : null);
                                linkedHashMap.put("pop_name", dynamicDialog4 != null ? dynamicDialog4.popName : null);
                                DynamicDialog dynamicDialog5 = dynamicDialogLIZ;
                                Integer num = dynamicDialog5.LIZJ;
                                Integer num2 = dynamicDialog5.showAfter;
                                Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                                c1894320zOY.getClass();
                                C1894320zOY.LJIJJ(i, linkedHashMap, num, numValueOf, null, "");
                            }

                            @Override // X.InterfaceC1899900zXY
                            public final void LJIL(String str3) {
                                int iIntValue;
                                String str4;
                                String str5;
                                C1897790zU9.LLILLL = false;
                                if (!Intrinsics.LJFF(str3, "can not show after load finish")) {
                                    C1897790zU9.LLILLJJLI = true;
                                }
                                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                                if (interfaceC1897260zTILIZIZ != null) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                                    if (dynamicDialog3 != null) {
                                        str4 = dynamicDialog3.name;
                                    } else {
                                        str4 = null;
                                    }
                                    linkedHashMap.put("pop_name", str4);
                                    linkedHashMap.put("result", "wrong_info");
                                    C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
                                    if (c1897770zU7 != null && c1897770zU7.LJ(C1897790zU9.LLIZ)) {
                                        str5 = "feed";
                                    } else {
                                        str5 = "others";
                                    }
                                    linkedHashMap.put("position", str5);
                                    interfaceC1897260zTILIZIZ.LIZ("pop_filtered_reason", linkedHashMap);
                                }
                                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                                DynamicDialog dynamicDialog4 = dynamicDialogLIZ;
                                int i = dynamicDialog4.LIZ;
                                Integer num = dynamicDialog4.LIZJ;
                                if (num != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = -1;
                                }
                                if (str3 == null) {
                                    str3 = "";
                                }
                                c1893680zNW.getClass();
                                C1893680zNW.LIZ(0, i, iIntValue, 1, str3);
                                Function0<Unit> function02 = function0;
                                if (function02 != null) {
                                    function02.invoke();
                                }
                            }

                            @Override // X.InterfaceC1899900zXY
                            public final void LIZIZ(InterfaceC1107590evd interfaceC1107590evd, String str3) {
                                String str4;
                                int iIntValue;
                                Integer num;
                                String strLJFF;
                                C1897790zU9 c1897790zU9 = C1897790zU9.LL;
                                DynamicDialog dynamicDialog3 = dynamicDialogLIZ;
                                c1897790zU9.getClass();
                                C1897790zU9.LJIILL(dynamicDialog3, str3);
                                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                                DynamicDialog dynamicDialog4 = dynamicDialogLIZ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                DynamicDialog dynamicDialog5 = dynamicDialogLIZ;
                                linkedHashMap.put("click_position", str3);
                                String str5 = null;
                                if (dynamicDialog5 != null) {
                                    str4 = dynamicDialog5.notificationName;
                                } else {
                                    str4 = null;
                                }
                                linkedHashMap.put("notification_name", str4);
                                if (dynamicDialog5 != null) {
                                    str5 = dynamicDialog5.popName;
                                }
                                linkedHashMap.put("pop_name", str5);
                                String str6 = "";
                                if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "type", "")) != null) {
                                    str6 = strLJFF;
                                }
                                linkedHashMap.put("click_area", str6);
                                DynamicDialog dynamicDialog6 = dynamicDialogLIZ;
                                if (dynamicDialog6 != null && (num = dynamicDialog6.showAfter) != null) {
                                    iIntValue = num.intValue();
                                } else {
                                    iIntValue = 0;
                                }
                                C1894320zOY.LJIILLIIL(c1894320zOY, dynamicDialog4, linkedHashMap, Integer.valueOf(iIntValue), 16);
                                if (Intrinsics.LJFF(str3, "confirm")) {
                                    C01U6.LIZIZ(new AwS177S1100000_28(dynamicDialogLIZ, strLJIIJJI, 12));
                                }
                            }
                        });
                        if (zLJI) {
                            MethodIDManager.LJ();
                            return;
                        }
                        return;
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
                LJIILJJIL(activity, function0);
                DialogC1897810zUB dialogC1897810zUB = LLJ;
                if (dialogC1897810zUB != null) {
                    dialogC1897810zUB.setOnDismissListener(new DialogInterfaceOnDismissListenerC19333210kM(function0, 13));
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            LL.getClass();
            try {
                if (LLIZ != null) {
                    DynamicDialog dynamicDialog3 = LLIZ;
                    String str3 = null;
                    if (dynamicDialog3 != null) {
                        str = dynamicDialog3.coverImage;
                    } else {
                        str = null;
                    }
                    if (C1723230uwb.LIZJ(str)) {
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != 0) {
                            DynamicDialog dynamicDialog4 = LLIZ;
                            if (dynamicDialog4 != null) {
                                str3 = dynamicDialog4.coverImage;
                            }
                            interfaceC1897260zTILIZIZ.LJI(UriProtector.parse(str3), activity, Bitmap.Config.ARGB_8888, new InterfaceC2281081EQg() { // from class: X.0zUP
                                @Override // X.InterfaceC2281081EQg
                                public final void onFailed() {
                                    C1897790zU9 c1897790zU9 = C1897790zU9.LL;
                                    Activity activity2 = activity;
                                    Function0<Unit> function02 = function0;
                                    c1897790zU9.getClass();
                                    C1897790zU9.LJIJ(activity2, null, function02);
                                }

                                @Override // X.InterfaceC2281081EQg
                                public final void LIZ(Bitmap bitmap) {
                                    if (bitmap != null) {
                                        BitmapDrawable bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                                        C1897790zU9 c1897790zU9 = C1897790zU9.LL;
                                        Activity activity2 = activity;
                                        Function0<Unit> function02 = function0;
                                        c1897790zU9.getClass();
                                        C1897790zU9.LJIJ(activity2, bitmapDrawable, function02);
                                        return;
                                    }
                                    C1897790zU9 c1897790zU92 = C1897790zU9.LL;
                                    Activity activity3 = activity;
                                    Function0<Unit> function03 = function0;
                                    c1897790zU92.getClass();
                                    C1897790zU9.LJIJ(activity3, null, function03);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    LJIJ(activity, null, function0);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void LJIJ(Activity activity, Drawable drawable, Function0 function0) {
        InviteCodeResponse.Button button;
        String str;
        Title title;
        Title title2;
        List<InviteCodeResponse.Button> list;
        DynamicDialog dynamicDialog = LLIZ;
        String str2 = null;
        if (dynamicDialog != null && (list = dynamicDialog.buttons) != null) {
            button = (InviteCodeResponse.Button) C13LP.LJJJJZI(list);
        } else {
            button = null;
        }
        LLILLJJLI = true;
        C1397580mTM c1397580mTM = new C1397580mTM(activity);
        if (drawable != null) {
            c1397580mTM.LJIIIZ = new C1391780mK0(activity, drawable, new Rect(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, 0));
        }
        DynamicDialog dynamicDialog2 = LLIZ;
        if (dynamicDialog2 == null || (title2 = dynamicDialog2.title) == null || (str = title2.text) == null) {
            str = "";
        }
        c1397580mTM.LJI(str);
        DynamicDialog dynamicDialog3 = LLIZ;
        if (dynamicDialog3 != null && (title = dynamicDialog3.description) != null) {
            str2 = title.text;
        }
        c1397580mTM.LIZIZ(str2);
        c1397580mTM.LJII = false;
        c1397580mTM.LJIIIIZZ = true;
        C1238130iKB.LIZ(c1397580mTM, new AwS394S0200000_28(button, activity, 69));
        c1397580mTM.LJ(AFwS271S0000000_28.get$arr$(308));
        c1397580mTM.LIZLLL(new AwS607S0100000_28(function0, (Function0<Unit>) 246));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
