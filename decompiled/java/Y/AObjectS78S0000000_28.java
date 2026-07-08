package Y;

import X.AbstractC19979113Fd;
import X.C06W5;
import X.C0C59;
import X.C10R7;
import X.C10VH;
import X.C10ZU;
import X.C1239450iMJ;
import X.C13BV;
import X.C13GI;
import X.C13IV;
import X.C13J2;
import X.C13K5;
import X.C15438062q;
import X.C1653260t7k;
import X.C1697810uHb;
import X.C1865740yeS;
import X.C1904820zfU;
import X.C1904840zfW;
import X.C19245010Qu;
import X.C19246810Rm;
import X.C19247910Rx;
import X.C19248010Ry;
import X.C19253410Ua;
import X.C19282110c7;
import X.C19979613Fi;
import X.C2188811AlT;
import X.C307990C5l;
import X.C531650Kt9;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.q;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes29.dex */
public class AObjectS78S0000000_28 implements Function0 {
    public final int $t;

    public static final Object invoke$15(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "switch is false";
    }

    public static final Object invoke$19(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "create delay task";
    }

    public static final Object invoke$20(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "user change time forward";
    }

    public static final Object invoke$21(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "task is running, not create";
    }

    public static final Object invoke$26(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "run delay task";
    }

    public static final Object invoke$27(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return "app is background, not run delay task";
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            default:
                return null;
        }
    }

    public AObjectS78S0000000_28(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C10ZU("push_video_preload_save_ab");
    }

    public static final Object invoke$1(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C10ZU("push_video_preload_read_ab");
    }

    public static final Object invoke$10(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        C1653260t7k.LIZJ("click_publish_setting_entrance", true);
        return null;
    }

    public static final Object invoke$11(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAgeSubmitted=");
        sbLIZ.append(C19245010Qu.LIZIZ);
        sbLIZ.append(", isInterestSubmitted=");
        sbLIZ.append(C19245010Qu.LIZJ);
        sbLIZ.append(", isNUJAgeGatePassed=");
        sbLIZ.append(C19245010Qu.LIZLLL);
        sbLIZ.append(", isAutoLoginSuccess=");
        sbLIZ.append(false);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$12(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C19247910Rx(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final Object invoke$13(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        C19247910Rx c19247910RxLIZIZ = C10R7.LIZIZ();
        c19247910RxLIZIZ.getClass();
        Object arrayList = C13BV.INSTANCE;
        int size = c19247910RxLIZIZ.LIZLLL("code_list", arrayList).size();
        C19247910Rx c19247910RxLIZIZ2 = C10R7.LIZIZ();
        c19247910RxLIZIZ2.getClass();
        int size2 = c19247910RxLIZIZ2.LIZLLL("en_name_list", arrayList).size();
        C19247910Rx c19247910RxLIZIZ3 = C10R7.LIZIZ();
        c19247910RxLIZIZ3.getClass();
        int size3 = c19247910RxLIZIZ3.LIZLLL("local_name_list", arrayList).size();
        if (size == size2 && size2 == size3) {
            C19247910Rx c19247910RxLIZIZ4 = C10R7.LIZIZ();
            c19247910RxLIZIZ4.getClass();
            IntRange intRangeLJIIIZ = C1697810uHb.LJIIIZ(c19247910RxLIZIZ4.LIZLLL("code_list", arrayList));
            arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIIIZ, 10));
            C531650Kt9 it2 = intRangeLJIIIZ.iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                C19247910Rx c19247910RxLIZIZ5 = C10R7.LIZIZ();
                c19247910RxLIZIZ5.getClass();
                C13BV c13bv = C13BV.INSTANCE;
                String str = (String) ListProtector.get(c19247910RxLIZIZ5.LIZLLL("code_list", c13bv), iNextInt);
                C19247910Rx c19247910RxLIZIZ6 = C10R7.LIZIZ();
                c19247910RxLIZIZ6.getClass();
                String str2 = (String) ListProtector.get(c19247910RxLIZIZ6.LIZLLL("en_name_list", c13bv), iNextInt);
                C19247910Rx c19247910RxLIZIZ7 = C10R7.LIZIZ();
                c19247910RxLIZIZ7.getClass();
                arrayList.add(new C19246810Rm(str, str2, (String) ListProtector.get(c19247910RxLIZIZ7.LIZLLL("local_name_list", c13bv), iNextInt)));
            }
        } else {
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ()) {
                throw new RuntimeException("ContentLanguageConfig content language list size wrong!");
            }
        }
        return arrayList;
    }

    public static final Object invoke$14(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C19248010Ry(0);
    }

    public static final Object invoke$16(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
    }

    public static final Object invoke$17(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        boolean zIsOpen;
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        if (iNewUserDebugService != null) {
            zIsOpen = iNewUserDebugService.isOpen();
        } else {
            zIsOpen = false;
        }
        return Boolean.valueOf(zIsOpen);
    }

    public static final Object invoke$18(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C19282110c7();
    }

    public static final Object invoke$2(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new LinkedHashMap();
    }

    public static final Object invoke$22(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        C1865740yeS.LIZ.getClass();
        return Boolean.valueOf(C1865740yeS.LIZ());
    }

    public static final Object invoke$23(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new LinkedHashMap();
    }

    public static final Object invoke$24(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new ArrayList();
    }

    public static final Object invoke$25(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new ArrayList();
    }

    public static final Object invoke$3(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        String str = ScanQRCodeActivityV2._pnsPageId;
        return new C1239450iMJ();
    }

    public static final Object invoke$4(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        String str = ScanQRCodeActivityV2._pnsPageId;
        return new C06W5(0);
    }

    public static final Object invoke$5(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        boolean zIsOpen;
        INewUserDebugService iNewUserDebugService = (INewUserDebugService) PluggableExtentionKt.pluggableSpi$default(INewUserDebugService.class, false, false, false, 14, null);
        if (iNewUserDebugService != null) {
            zIsOpen = iNewUserDebugService.isOpen();
        } else {
            zIsOpen = false;
        }
        return Boolean.valueOf(zIsOpen);
    }

    public static final Object invoke$6(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        boolean z;
        String strLJIL;
        INewUserDebugService iNewUserDebugServiceLIZIZ2;
        String string;
        INewUserDebugService iNewUserDebugServiceLIZIZ3;
        C1904820zfU.LIZ.getClass();
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            c0c59LJ.LJIILJJIL(0, false);
            if (!C307990C5l.LJ) {
                z = false;
            } else {
                z = true;
            }
            Object objLJIIL = c0c59LJ.LJIIL("shortcut_entry_for_feed_refresh_settings", true, z, true);
            if (objLJIIL instanceof String) {
                strLJIL = (String) objLJIIL;
            } else {
                if (objLJIIL instanceof q) {
                    try {
                        strLJIL = ((q) objLJIIL).LJIL();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1865740yeS.LIZ.getClass();
                if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ2 = C1865740yeS.LIZIZ()) != null) {
                    iNewUserDebugServiceLIZIZ2.LJI("ShortcutRefreshEntryManager", "getSettingsData: use default settings, missing shortcut_entry_for_feed_refresh_settings");
                }
                return new C10VH(0);
            }
            if (strLJIL != null) {
                try {
                    AbstractC19979113Fd abstractC19979113Fd = (AbstractC19979113Fd) C13J2.LIZ(new AObjectS126S0000000_28(5)).LIZIZ(C13GI.LIZ, strLJIL);
                    if (abstractC19979113Fd != null && (string = abstractC19979113Fd.toString()) != null && string.length() != 0 && !Intrinsics.LJFF(string, "null")) {
                        C13IV c13iv = C19253410Ua.LIZ;
                        c13iv.getClass();
                        Object objLIZIZ = c13iv.LIZIZ(C10VH.Companion.serializer(), string);
                        C10VH c10vh = (C10VH) objLIZIZ;
                        C1865740yeS.LIZ.getClass();
                        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ3 = C1865740yeS.LIZIZ()) != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("getSettingsData: ");
                            sbLIZ.append(c10vh);
                            iNewUserDebugServiceLIZIZ3.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return (C10VH) objLIZIZ;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ()) {
                iNewUserDebugServiceLIZIZ2.LJI("ShortcutRefreshEntryManager", "getSettingsData: use default settings, missing shortcut_entry_for_feed_refresh_settings");
            }
            return new C10VH(0);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1865740yeS.LIZ.getClass();
            if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getSettingsData: error, ");
                sbLIZ2.append(e2);
                iNewUserDebugServiceLIZIZ.LJI("ShortcutRefreshEntryManager", C2188811AlT.LIZIZ(sbLIZ2));
            }
            return new C10VH(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(Y.AObjectS78S0000000_28 r6) {
        /*
            X.0zfU r0 = X.C1904820zfU.LIZ
            r0.getClass()
            X.10UB r0 = X.C10UB.LIZ
            r0.getClass()
            long r5 = X.C1514430pVp.LIZ()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L70
            X.10Zm r0 = X.C19267610Zm.LIZ
            X.13Jn r0 = r0.now()
            long r3 = r0.toEpochMilliseconds()
            long r3 = r3 - r5
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            long r0 = (long) r0
            long r0 = r3 / r0
            X.C1904820zfU.LIZIZ = r0
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L70
            r5 = 1
            java.lang.String r4 = "shortcut_entry_for_feed_refresh_dnu"
        L31:
            int r3 = X.C10UB.LIZIZ(r4)
            X.0yeS r0 = X.C1865740yeS.LIZ
            r0.getClass()
            boolean r0 = X.C1865740yeS.LIZ()
            if (r0 == 0) goto L6b
            com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService r2 = X.C1865740yeS.LIZIZ()
            if (r2 == 0) goto L6b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getABValue: isDNU3Day="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", key="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", value="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "ShortcutRefreshEntryManager"
            r2.LJI(r0, r1)
        L6b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L70:
            r5 = 0
            java.lang.String r4 = "shortcut_entry_for_feed_refresh_low_active"
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS78S0000000_28.invoke$7(Y.AObjectS78S0000000_28):java.lang.Object");
    }

    public static final Object invoke$8(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C1904840zfW();
    }

    public static final Object invoke$9(AObjectS78S0000000_28 aObjectS78S0000000_28) {
        return new C19979613Fi(C13K5.LIZ);
    }
}
