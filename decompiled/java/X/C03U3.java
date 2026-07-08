package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03U3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03U3 {
    public static final C03U3 LIZ = new C03U3();

    public static void LJII(Context context, boolean z, Function0 function0) {
        if (!z) {
            function0.invoke();
            return;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131848087);
        c1233040iBy.LIZLLL();
    }

    public final void LIZLLL(Context context, ExceptionUX exceptionUX, Function0<Unit> function0) {
        getClass();
        LJIIIIZZ(context, exceptionUX, true, 0, function0, null, null, "", null);
    }

    public static void LIZ(C1397620mTQ c1397620mTQ, String str, int i, C03JL c03jl) {
        if (C03VN.LIZ) {
            c1397620mTQ.LIZJ(0, str, c03jl);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                c1397620mTQ.LIZJ(1, str, c03jl);
                return;
            } else {
                c1397620mTQ.LIZJ(2, str, c03jl);
                return;
            }
        }
        c1397620mTQ.LIZJ(1, str, c03jl);
    }

    public static void LJ(C03O1 c03o1, String str, String str2, String str3, Map map, boolean z) {
        if (c03o1 != null) {
            C03O1.LJIIZILJ(c03o1, str, str2, str3, map, null, z, 16);
        } else {
            C03O0.LJJLIIIJILLIZJL(C03O0.LIZ, str, str2, str3, map, null, z, 16);
        }
    }

    public final void LIZJ(C03DB c03db, Context context, ExceptionUX exceptionUX, Function0<Unit> function0, Function0<Unit> function02, Function1<? super FetchInfo, Unit> function1, Boolean bool) {
        LJI(this, c03db, context, exceptionUX, true, function0, function02, function1, null, null, null, null, null, null, null, null, null, null, bool, 130944);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(android.content.Context r9, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r10, boolean r11, int r12, kotlin.jvm.functions.Function0 r13, X.InterfaceC1748810vbr r14, X.C037N r15, java.lang.String r16, java.util.HashMap r17) {
        /*
            Method dump skipped, instruction units count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03U3.LJIIIIZZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, boolean, int, kotlin.jvm.functions.Function0, X.0vbr, X.037N, java.lang.String, java.util.HashMap):void");
    }

    public static void LJI(C03U3 c03u3, C03DB c03db, Context context, ExceptionUX exceptionUX, boolean z, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function1 function12, Function0 function05, Function0 function06, Function0 function07, String str, InterfaceC1748810vbr interfaceC1748810vbr, HashMap map, C03O1 c03o1, Boolean bool, int i) {
        int iIntValue;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        C03O1 c03o12 = c03o1;
        HashMap map2 = map;
        InterfaceC1748810vbr interfaceC1748810vbr2 = interfaceC1748810vbr;
        Function0 function08 = function07;
        Function0 function09 = function05;
        String str2 = str;
        Function0 function010 = function06;
        Function1 function13 = function12;
        Function0 function011 = function04;
        Function0 function012 = function03;
        Boolean bool2 = null;
        if ((i & 128) != 0) {
            function012 = null;
        }
        if ((i & 256) != 0) {
            function011 = null;
        }
        if ((i & 512) != 0) {
            function13 = null;
        }
        if ((i & 1024) != 0) {
            function09 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function010 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            function08 = null;
        }
        if ((i & 8192) != 0) {
            str2 = "";
        }
        if ((i & 16384) != 0) {
            interfaceC1748810vbr2 = null;
        }
        if ((32768 & i) != 0) {
            map2 = null;
        }
        if ((65536 & i) != 0) {
            c03o12 = null;
        }
        if ((i & 131072) == 0) {
            bool2 = bool;
        }
        c03u3.getClass();
        DialogContent dialogContent = exceptionUX.dialogContent;
        if (dialogContent != null) {
            Integer num = dialogContent.dialogLevel;
            if (num != null && num.intValue() == 1) {
                Integer num2 = dialogContent.daInfoType;
                if (num2 != null && num2.intValue() == 1 && interfaceC1748810vbr2 != null) {
                    C1748720vbi.LIZIZ(interfaceC1748810vbr2, new C048B(), new AwS580S0100000_1(dialogContent, 982));
                }
                if (C7879035x.LIZLLL() || C7879035x.LJ()) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("ec_offline_dialog_switch", false)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Map mapLJIIJ = C1741890vQh.LJIIJ(dialogContent.daInfo);
            if (mapLJIIJ == null) {
                mapLJIIJ = new LinkedHashMap();
            }
            if (map2 != null) {
                mapLJIIJ.putAll(map2);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (c03db == C03DB.FROM_OSP) {
                C03PI.LJIJI.getClass();
                if (Intrinsics.LJFF(str2, String.valueOf(C03PI.LJIL))) {
                    LIZ.getClass();
                    LJ(c03o12, "first_order_buy_alone_error", str2, null, mapLJIIJ, false);
                } else {
                    LIZ.getClass();
                    LJ(c03o12, "server", str2, null, mapLJIIJ, true);
                }
            } else {
                C03PI.LJIJI.getClass();
                if (Intrinsics.LJFF(str2, String.valueOf(C03PI.LJIJJ))) {
                    C1018703yb.LIZLLL("tiktokec_popup_show", new AwS52S1000000_1("paid_successfully_notice", 13));
                } else if (Intrinsics.LJFF(str2, String.valueOf(C03PI.LJIJJLI))) {
                    C1018703yb.LIZLLL("tiktokec_popup_show", new AwS52S1000000_1("ongoing_payment_notice", 13));
                } else if (Intrinsics.LJFF(str2, String.valueOf(C03PI.LJIL))) {
                    LIZ.getClass();
                    LJ(c03o12, "first_order_buy_alone_error", str2, null, mapLJIIJ, false);
                } else if (c03db == C03DB.FROM_DOUBLE_PAYMENT) {
                    C03O0 c03o0 = C03O0.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    c03o0.getClass();
                    linkedHashMap.putAll(C03O0.LIZIZ);
                    linkedHashMap.put("popup_name", "server");
                    if (str2 != null) {
                        linkedHashMap.put("error_code", str2);
                    }
                    linkedHashMap.putAll(mapLJIIJ);
                    C03O0.LLF("tiktokec_popup_show", linkedHashMap);
                }
            }
            String str3 = dialogContent.title;
            if (str3 != null) {
                c1397580mTM.LJI(str3);
            }
            c1397580mTM.LIZIZ(dialogContent.message);
            Boolean bool3 = dialogContent.hasCloseButton;
            if (bool3 != null && (zBooleanValue2 = bool3.booleanValue())) {
                c1397580mTM.LJIIIIZZ = zBooleanValue2;
            }
            Integer num3 = dialogContent.buttonDirection;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 0;
            }
            List<DialogButton> list = dialogContent.dialogButtons;
            if (list != null) {
                Integer num4 = dialogContent.dialogType;
                if (num4 != null && num4.intValue() == 1) {
                    C1238130iKB.LIZ(c1397580mTM, new C03JN(list, c03db, context, function02, function1, function012, function09, str2, map2, function08, c03o12));
                } else {
                    C985403tE.LIZ(c1397580mTM, new C817103Hd(list, c03db, context, function02, function1, function012, function011, function13, function010, function09, str2, iIntValue, map2));
                }
            }
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c1397580mTM.LJII = zBooleanValue;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        LJII(context, z, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:201:0x03de A[PHI: r1
      0x03de: PHI (r1v36 java.lang.Double) = (r1v35 java.lang.Double), (r1v38 java.lang.Double) binds: [B:199:0x03da, B:153:0x027d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C03U3 r29, X.C03DB r30, android.content.Context r31, java.lang.String r32, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX r33, final boolean r34, kotlin.jvm.functions.Function0 r35, final kotlin.jvm.functions.Function0 r36, final kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function1 r39, kotlin.jvm.functions.Function0 r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function1 r42, kotlin.jvm.internal.AFwS185S0000000_1 r43, kotlin.jvm.functions.Function0 r44, kotlin.jvm.functions.Function0 r45, kotlin.jvm.functions.Function0 r46, kotlin.jvm.functions.Function2 r47, X.InterfaceC1740480vOQ r48, X.C037N r49, java.util.HashMap r50, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r51, kotlin.jvm.internal.AwS545S0100000_1 r52, X.C03O1 r53, int r54) {
        /*
            Method dump skipped, instruction units count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03U3.LIZIZ(X.03U3, X.03DB, android.content.Context, java.lang.String, com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.internal.AFwS185S0000000_1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, X.0vOQ, X.037N, java.util.HashMap, com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, kotlin.jvm.internal.AwS545S0100000_1, X.03O1, int):void");
    }
}
