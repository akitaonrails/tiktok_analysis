package X;

import android.app.Activity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.touchpoint.data.parser.notify.DraftBoxDialogViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897780zU8 extends AbstractC1895130zPr {
    public static final C1897780zU8 LL = new C1897780zU8();
    public static boolean LLILLJJLI;
    public static boolean LLILLL;
    public static boolean LLILZ;
    public static final C736950SvV LLILZIL;
    public static DynamicDialog LLILZLL;
    public static DialogC1897810zUB LLIZ;
    public static boolean LLIZLLLIL;
    public static boolean LLJ;

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILZIL = new C736950SvV(C13LE.LIZ(DraftBoxDialogViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), AFwS271S0000000_28.get$arr$(383), null, null, null);
    }

    public static void LJIIJ() {
        Activity activityLJIILL;
        DynamicDialog dynamicDialog = LLILZLL;
        if (dynamicDialog != null) {
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP == null || (activityLJIILL = abstractC1896090zRP.LJIILL()) == null) {
                return;
            }
            LL.getClass();
            DynamicDialog dynamicDialog2 = LLILZLL;
            if (dynamicDialog2 != null) {
                String str = dynamicDialog2.name;
                if (dynamicDialog2 != null) {
                    if (LLILLJJLI) {
                        if (LLILZ) {
                            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                            if (interfaceC1897260zTILIZIZ != null) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("pop_name", str);
                                linkedHashMap.put("result", "have_popped");
                                C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
                                linkedHashMap.put("position", (c1897770zU7 == null || !c1897770zU7.LJ(LLILZLL)) ? "others" : "feed");
                                interfaceC1897260zTILIZIZ.LIZ("pop_filtered_reason", linkedHashMap);
                            }
                            LLILZ = true;
                            return;
                        }
                        return;
                    }
                    if (LLIZLLLIL) {
                        C1897770zU7 c1897770zU72 = (C1897770zU7) c1619720sFe.LIZ(4);
                        if (c1897770zU72 == null) {
                            C1897780zU8 c1897780zU8 = LL;
                            LJIIJJI(activityLJIILL, null);
                            return;
                        }
                        AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(activityLJIILL, 288);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(dynamicDialog.jsSource);
                        sbLIZ.append("&touchpointId=");
                        sbLIZ.append(dynamicDialog.LIZ);
                        sbLIZ.append("&launchPlanId=");
                        sbLIZ.append(dynamicDialog.LIZJ);
                        sbLIZ.append("&popupType=");
                        sbLIZ.append(dynamicDialog.name);
                        c1897770zU72.LJIIJ(activityLJIILL, C2188811AlT.LIZIZ(sbLIZ), awS607S0100000_28);
                        C1893680zNW.LIZ.getClass();
                        C1893680zNW.LJIIJJI(67, null);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC1895130zPr
    public final BaseTouchPointDataVM LJIIIZ() {
        return (BaseTouchPointDataVM) LLILZIL.getValue();
    }

    public static final void LJIIJJI(Activity activity, final Function0<Unit> function0) {
        try {
            final DynamicDialog dynamicDialog = LLILZLL;
            if (dynamicDialog != null) {
                C1897900zUK c1897900zUK = new C1897900zUK(dynamicDialog);
                c1897900zUK.LIZJ = new InterfaceC1897910zUL() { // from class: X.0zUE
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
                        C1897780zU8.LLILLJJLI = true;
                        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                        DynamicDialog dynamicDialog2 = dynamicDialog;
                        int i = dynamicDialog2.LIZ;
                        Integer num = dynamicDialog2.LIZJ;
                        int iIntValue = num != null ? num.intValue() : -1;
                        c1893680zNW.getClass();
                        C1893680zNW.LIZ(1, i, iIntValue, 1, "");
                    }

                    @Override // X.InterfaceC1897910zUL
                    public final void onDismiss() {
                    }

                    @Override // X.InterfaceC1897910zUL
                    public final void onShow() {
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        int i = dynamicDialog.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        DynamicDialog dynamicDialog2 = C1897780zU8.LLILZLL;
                        linkedHashMap.put("notification_name", dynamicDialog2 != null ? dynamicDialog2.notificationName : null);
                        DynamicDialog dynamicDialog3 = C1897780zU8.LLILZLL;
                        linkedHashMap.put("pop_name", dynamicDialog3 != null ? dynamicDialog3.popName : null);
                        DynamicDialog dynamicDialog4 = dynamicDialog;
                        Integer num = dynamicDialog4.LIZJ;
                        Integer num2 = dynamicDialog4.showAfter;
                        Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                        c1894320zOY.getClass();
                        C1894320zOY.LJIJJ(i, linkedHashMap, num, numValueOf, null, "");
                    }

                    @Override // X.InterfaceC1897910zUL
                    public final void LJIL(String str) {
                        int iIntValue;
                        String str2;
                        String str3;
                        C1897780zU8 c1897780zU8 = C1897780zU8.LL;
                        if (!Intrinsics.LJFF(str, "can not show after load finish")) {
                            C1897780zU8.LLILLJJLI = true;
                        }
                        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            DynamicDialog dynamicDialog2 = C1897780zU8.LLILZLL;
                            if (dynamicDialog2 != null) {
                                str2 = dynamicDialog2.name;
                            } else {
                                str2 = null;
                            }
                            linkedHashMap.put("pop_name", str2);
                            linkedHashMap.put("result", "wrong_info");
                            C1897770zU7 c1897770zU7 = (C1897770zU7) c1619720sFe.LIZ(4);
                            if (c1897770zU7 != null && c1897770zU7.LJ(C1897780zU8.LLILZLL)) {
                                str3 = "feed";
                            } else {
                                str3 = "others";
                            }
                            linkedHashMap.put("position", str3);
                            interfaceC1897260zTILIZIZ.LIZ("pop_filtered_reason", linkedHashMap);
                        }
                        C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                        DynamicDialog dynamicDialog3 = dynamicDialog;
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
                    }

                    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[PHI: r2
                      0x0055: PHI (r2v1 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v3 java.lang.Integer) binds: [B:17:0x003d, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1897910zUL
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ(X.InterfaceC1107590evd r7, java.lang.String r8) {
                        /*
                            r6 = this;
                            X.0zOY r5 = X.C1894320zOY.LIZ
                            com.bytedance.touchpoint.api.model.DynamicDialog r0 = X.C1897780zU8.LLILZLL
                            if (r0 == 0) goto L5b
                            int r4 = r0.LIZ
                        L8:
                            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                            r3.<init>()
                            java.lang.String r0 = "click_position"
                            r3.put(r0, r8)
                            com.bytedance.touchpoint.api.model.DynamicDialog r0 = X.C1897780zU8.LLILZLL
                            r2 = 0
                            if (r0 == 0) goto L59
                            java.lang.String r1 = r0.notificationName
                        L19:
                            java.lang.String r0 = "notification_name"
                            r3.put(r0, r1)
                            com.bytedance.touchpoint.api.model.DynamicDialog r0 = X.C1897780zU8.LLILZLL
                            if (r0 == 0) goto L57
                            java.lang.String r1 = r0.popName
                        L24:
                            java.lang.String r0 = "pop_name"
                            r3.put(r0, r1)
                            java.lang.String r1 = ""
                            if (r7 == 0) goto L36
                            java.lang.String r0 = "type"
                            java.lang.String r0 = X.C1871910yoP.LJFF(r7, r0, r1)
                            if (r0 == 0) goto L36
                            r1 = r0
                        L36:
                            java.lang.String r0 = "click_area"
                            r3.put(r0, r1)
                            com.bytedance.touchpoint.api.model.DynamicDialog r0 = X.C1897780zU8.LLILZLL
                            if (r0 == 0) goto L55
                            java.lang.Integer r2 = r0.LIZJ
                            java.lang.Integer r0 = r0.showAfter
                            if (r0 == 0) goto L55
                            int r0 = r0.intValue()
                        L49:
                            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                            r0 = 0
                            r5.getClass()
                            X.C1894320zOY.LJIILJJIL(r4, r3, r2, r1, r0)
                            return
                        L55:
                            r0 = 0
                            goto L49
                        L57:
                            r1 = r2
                            goto L24
                        L59:
                            r1 = r2
                            goto L19
                        L5b:
                            r4 = -1
                            goto L8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1897840zUE.LIZIZ(X.0evd, java.lang.String):void");
                    }
                };
                DialogC1897810zUB dialogC1897810zUB = new DialogC1897810zUB("DraftBoxDialogManager", activity, new C1897880zUI(c1897900zUK));
                dialogC1897810zUB.LLILZLL = true;
                dialogC1897810zUB.LLJ = true;
                LLIZ = dialogC1897810zUB;
            }
            DialogC1897810zUB dialogC1897810zUB2 = LLIZ;
            if (dialogC1897810zUB2 != null) {
                dialogC1897810zUB2.setOnDismissListener(new DialogInterfaceOnDismissListenerC19333210kM(function0, 16));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
