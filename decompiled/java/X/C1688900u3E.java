package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS125S1000000_19;
import kotlin.jvm.internal.AwS140S1200000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS269S0300000_25;
import kotlin.jvm.internal.AwS42S1101000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0u3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688900u3E {
    public static final C13DR LIZ = new C13DR(AFwS189S0000000_3.get$arr$(543));

    public static final C1685380txY LJFF(C1668880tWw c1668880tWw, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-747320915);
        float f = 18;
        C1685380txY c1685380txYLIZ = C1668870tWv.LIZ(c1668880tWw, C1670400tZO.LIZIZ(interfaceC1680500tpg).Q3(), f, f, false, interfaceC1680500tpg, 3456, 16);
        interfaceC1680500tpg.LJ();
        return c1685380txYLIZ;
    }

    public static final void LIZIZ(C1688880u3C c1688880u3C, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String liveCoreVersion;
        String rtcVersion;
        String rtcDeviceID;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1485262473);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1688880u3C)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C1696980uGG.LIZ(0L);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            InterfaceC1675750ti1 interfaceC1675750ti1 = (InterfaceC1675750ti1) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (objLJJ2 == c1680520tpi) {
                objLJJ2 = C1696870uG5.LIZ(0);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            InterfaceC1676320tiw interfaceC1676320tiw = (InterfaceC1676320tiw) objLJJ2;
            c13zcLJIIJ.LJJJJL(false);
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LJIJI = c.LJIJI(c.LJ(c1685760tyA, 1.0f), null, 3);
            InterfaceC1668050tVb.LIZ.getClass();
            C1688130u1z c1688130u1zLIZ = C1665740tRs.LIZ(C1679930tol.LIZJ, C1668040tVa.LJIILJJIL, c13zcLJIIJ, 48);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIJI);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJI;
                C1665930tSB.LIZ(c13zcLJIIJ, c1688130u1zLIZ, aFwS311S0000000_25);
                AFwS311S0000000_25 aFwS311S0000000_252 = g.a.LJFF;
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, aFwS311S0000000_252);
                AFwS311S0000000_25 aFwS311S0000000_253 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_253);
                }
                AFwS311S0000000_25 aFwS311S0000000_254 = g.a.LIZLLL;
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, aFwS311S0000000_254);
                InterfaceC1685750ty9 interfaceC1685750ty9LJIIL = C1682520tsw.LJIIL(c.LJ(c1685760tyA, 1.0f), 0.0f, 5, 0.0f, 0.0f, 13);
                C1296870jqv c1296870jqv = C1668040tVa.LJFF;
                InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(c1296870jqv, false);
                int iLIZ2 = C0MXE.LIZ(c13zcLJIIJ);
                C13D2 c13d2LJJJIL2 = c13zcLJIIJ.LJJJIL();
                InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL2 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJIIL);
                if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                    c13zcLJIIJ.LJJIII();
                    if (c13zcLJIIJ.LJJJI) {
                        c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                    } else {
                        c13zcLJIIJ.LJIILJJIL();
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, aFwS311S0000000_25);
                    C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL2, aFwS311S0000000_252);
                    if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ2))) {
                        c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ2));
                        c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ2), aFwS311S0000000_253);
                    }
                    C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL2, aFwS311S0000000_254);
                    c13zcLJIIJ.LJJIIJZLJL(511838503);
                    if (c1688880u3C.LLILLJJLI) {
                        c13zcLJIIJ.LJJIIJZLJL(1849434622);
                        Object objLJJ3 = c13zcLJIIJ.LJJ();
                        if (objLJJ3 == c1680520tpi) {
                            String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                            if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId == null) {
                                strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = "";
                            }
                            IAVSettingsService iAVSettingsServiceAvsettingsConfig = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig();
                            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                            if (iLiveOuterService != null) {
                                interfaceC20673515v3K4 = iLiveOuterService.k4();
                            } else {
                                interfaceC20673515v3K4 = null;
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append("UserId: " + ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                            sb.append("\n");
                            sb.append("DeviceId: ".concat(strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId));
                            sb.append("\n");
                            StringBuilder sb2 = new StringBuilder("UpdateVersionCode: ");
                            C844470XAv.LIZ.getClass();
                            sb2.append(C844470XAv.LIZLLL());
                            sb.append(sb2.toString());
                            sb.append("\n");
                            StringBuilder sb3 = new StringBuilder("Hook Version Code: ");
                            int i4 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
                            if (C844470XAv.LJIIIZ == 1) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("202");
                                sbLIZ.append(i4);
                                sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                                i4 = CastIntegerProtector.parseInt(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            sb3.append(String.valueOf(i4));
                            sb.append(sb3.toString());
                            sb.append("\n");
                            sb.append("Channel: " + C844470XAv.LJIILL);
                            sb.append("\n");
                            sb.append("GitSHA: " + C844470XAv.LJIIL);
                            sb.append("\n");
                            sb.append("VESDK: " + iAVSettingsServiceAvsettingsConfig.getVESDKVersion());
                            sb.append("\n");
                            sb.append("EffectSdk: " + iAVSettingsServiceAvsettingsConfig.getEffectVersion());
                            sb.append("\nVmsdkAndroid: 3.9.2-tt\n");
                            if (interfaceC20673515v3K4 == null || (liveCoreVersion = interfaceC20673515v3K4.getLiveCoreVersion()) == null) {
                                liveCoreVersion = "";
                            }
                            sb.append("LiveCore: ".concat(liveCoreVersion));
                            sb.append("\n");
                            if (interfaceC20673515v3K4 == null || (rtcVersion = interfaceC20673515v3K4.getRtcVersion()) == null) {
                                rtcVersion = "";
                            }
                            sb.append("RtcVersion: ".concat(rtcVersion));
                            sb.append("\n");
                            if (interfaceC20673515v3K4 == null || (rtcDeviceID = interfaceC20673515v3K4.getRtcDeviceID()) == null) {
                                rtcDeviceID = "";
                            }
                            sb.append("RtcDeviceID: ".concat(rtcDeviceID));
                            sb.append("\n");
                            sb.append(C844320XAg.LIZ());
                            if (!TextUtils.isEmpty(C844470XAv.LJIILIIL)) {
                                sb.append(C09AZ.LIZJ("\n            \n            BitsMRID: " + C844470XAv.LJIILIIL + "\n            "));
                                sb.append("\n");
                            }
                            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIILLIIL();
                            String strLJFF = C19259610Wk.LIZ.LJFF();
                            if (!TextUtils.isEmpty(strLJFF)) {
                                sb.append("\nTag: ");
                                sb.append(strLJFF);
                            }
                            objLJJ3 = sb.toString();
                            c13zcLJIIJ.LJJIJIIJI(objLJJ3);
                        }
                        String str = (String) objLJJ3;
                        c13zcLJIIJ.LJJJJL(false);
                        View view = (View) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LJFF);
                        InterfaceC1685750ty9 interfaceC1685750ty9LJIILL = c.LJIILL(c1685760tyA, Float.NaN, 30, Float.NaN, Float.NaN);
                        c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                        boolean zLJII = c13zcLJIIJ.LJII(context) | c13zcLJIIJ.LJII(view);
                        Object objLJJ4 = c13zcLJIIJ.LJJ();
                        if (zLJII || objLJJ4 == c1680520tpi) {
                            objLJJ4 = new AwS140S1200000_25(context, view, str, 0);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ4);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1685190txF.LIZ(str, C634380OuS.LIZJ(interfaceC1685750ty9LJIILL, false, null, (Function0) objLJJ4, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).N3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 3, 0, false, 0, null, null, c13zcLJIIJ, 6, 0, 2000);
                    }
                    c13zcLJIIJ.LJJJJL(false);
                    c13zcLJIIJ.LJJJJL(true);
                    InterfaceC1685750ty9 interfaceC1685750ty9LJI = c.LJI(c.LJ(c1685760tyA, 1.0f), 50);
                    InterfaceC20053113dB interfaceC20053113dBLIZLLL2 = k.LIZLLL(c1296870jqv, false);
                    int iLIZ3 = C0MXE.LIZ(c13zcLJIIJ);
                    C13D2 c13d2LJJJIL3 = c13zcLJIIJ.LJJJIL();
                    InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL3 = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LJI);
                    if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                        c13zcLJIIJ.LJJIII();
                        if (c13zcLJIIJ.LJJJI) {
                            c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                        } else {
                            c13zcLJIIJ.LJIILJJIL();
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL2, aFwS311S0000000_25);
                        C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL3, aFwS311S0000000_252);
                        if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ3))) {
                            c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ3));
                            c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ3), aFwS311S0000000_253);
                        }
                        C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL3, aFwS311S0000000_254);
                        c13zcLJIIJ.LJJIIJZLJL(1849434622);
                        Object objLJJ5 = c13zcLJIIJ.LJJ();
                        if (objLJJ5 == c1680520tpi) {
                            String string = context.getString(2131847740);
                            C844470XAv.LIZ.getClass();
                            objLJJ5 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{C844470XAv.LJFF(), String.valueOf(C844470XAv.LJ())}, 2)) + "";
                            c13zcLJIIJ.LJJIJIIJI(objLJJ5);
                        }
                        String str2 = (String) objLJJ5;
                        c13zcLJIIJ.LJJJJL(false);
                        c13zcLJIIJ.LJJIIJZLJL(-1746271574);
                        if ((i2 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Object objLJJ6 = c13zcLJIIJ.LJJ();
                        if (z || objLJJ6 == c1680520tpi) {
                            objLJJ6 = new AwS269S0300000_25(interfaceC1675750ti1, interfaceC1676320tiw, c1688880u3C, 7);
                            c13zcLJIIJ.LJJIJIIJI(objLJJ6);
                        }
                        c13zcLJIIJ.LJJJJL(false);
                        C1685190txF.LIZ(str2, C634380OuS.LIZJ(c1685760tyA, false, null, (Function0) objLJJ6, 7), C1670400tZO.LIZIZ(c13zcLJIIJ).Q3(), C1670400tZO.LJ(c13zcLJIIJ).LJIIZILJ, 0L, 0, 0, false, 0, null, null, c13zcLJIIJ, 6, 0, 2032);
                        c13zcLJIIJ.LJJJJL(true);
                        c13zcLJIIJ.LJJJJL(true);
                    } else {
                        C0MXE.LIZIZ();
                        throw null;
                    }
                } else {
                    C0MXE.LIZIZ();
                    throw null;
                }
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(c1688880u3C, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(int r32, X.InterfaceC1680500tpg r33, java.lang.String r34) {
        /*
            r0 = -743381079(0xffffffffd3b0e7a9, float:-1.5196017E12)
            r1 = r33
            X.13ZC r0 = r1.LJIIJ(r0)
            r1 = r32
            r2 = r1 & 6
            r7 = 4
            r4 = 2
            r8 = r34
            if (r2 != 0) goto Lc2
            boolean r2 = r0.LJJIIJ(r8)
            if (r2 == 0) goto Lbf
            r3 = 4
        L1a:
            r3 = r3 | r1
        L1b:
            r2 = r3 & 3
            if (r2 != r4) goto L38
            boolean r2 = r0.LIZ()
            if (r2 == 0) goto L38
            r0.LIZJ()
        L28:
            X.13Ys r3 = r0.LJJJJZI()
            if (r3 == 0) goto L37
            kotlin.jvm.internal.AwS19S1001000_25 r2 = new kotlin.jvm.internal.AwS19S1001000_25
            r0 = 10
            r2.<init>(r8, r1, r0)
            r3.LIZLLL = r2
        L37:
            return
        L38:
            X.1ETK r2 = X.C1670400tZO.LIZIZ(r0)
            long r10 = r2.K3()
            X.0tyA r6 = X.InterfaceC1685750ty9.LIZ
            r2 = 5004770(0x4c5de2, float:7.013177E-39)
            r0.LJJIIJZLJL(r2)
            r2 = r3 & 14
            r5 = 0
            if (r2 != r7) goto Lbd
            r3 = 1
        L4e:
            java.lang.Object r4 = r0.LJJ()
            if (r3 != 0) goto L5d
            X.0tph r3 = X.InterfaceC1680500tpg.LIZ
            r3.getClass()
            X.0tpi r3 = X.C1680510tph.LIZIZ
            if (r4 != r3) goto L67
        L5d:
            kotlin.jvm.internal.AwS75S1000000_25 r4 = new kotlin.jvm.internal.AwS75S1000000_25
            r3 = 15
            r4.<init>(r8, r3)
            r0.LJJIJIIJI(r4)
        L67:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r0.LJJJJL(r5)
            X.0ty9 r5 = X.C1689740u4a.LIZIZ(r6, r5, r4)
            r3 = 32
            float r4 = (float) r3
            r3 = 8
            float r3 = (float) r3
            X.0ty9 r9 = X.C1682520tsw.LJIIJJI(r5, r4, r3, r4, r3)
            X.0tWC r3 = X.C1670400tZO.LJ(r0)
            X.0uAX r3 = r3.LIZ
            r23 = 0
            r4 = 28
            long r25 = X.C1682430tsn.LJ(r4)
            r19 = 0
            r15 = 0
            r4 = 35
            long r29 = X.C1682430tsn.LJ(r4)
            r22 = 16646141(0xfdfffd, float:2.3326212E-38)
            r20 = r15
            r21 = r15
            r27 = r23
            r31 = r19
            r32 = r3
            r33 = r19
            r34 = r19
            X.0uAX r12 = X.C1693430uAX.LIZ(r20, r21, r22, r23, r25, r27, r29, r31, r32, r33, r34)
            r13 = 0
            r24 = 2032(0x7f0, float:2.847E-42)
            r16 = r15
            r17 = r15
            r18 = r15
            r20 = r19
            r21 = r0
            r22 = r2
            r23 = r15
            X.C1685190txF.LIZ(r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L28
        Lbd:
            r3 = 0
            goto L4e
        Lbf:
            r3 = 2
            goto L1a
        Lc2:
            r3 = r1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688900u3E.LIZLLL(int, X.0tpg, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.lang.String r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10, X.InterfaceC1680500tpg r11, int r12) {
        /*
            r0 = 1247772064(0x4a5f7da0, float:3661672.0)
            X.13ZC r6 = r11.LJIIJ(r0)
            r0 = r12 & 6
            r2 = 4
            if (r0 != 0) goto L8f
            boolean r0 = r6.LJJIIJ(r9)
            if (r0 == 0) goto L8d
            r8 = 4
        L13:
            r8 = r8 | r12
        L14:
            r0 = r12 & 48
            r7 = 32
            if (r0 != 0) goto L23
            boolean r0 = r6.LJII(r10)
            if (r0 == 0) goto L8a
            r0 = 32
        L22:
            r8 = r8 | r0
        L23:
            r1 = r8 & 19
            r0 = 18
            if (r1 != r0) goto L41
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L41
            r6.LIZJ()
        L32:
            X.13Ys r2 = r6.LJJJJZI()
            if (r2 == 0) goto L40
            kotlin.jvm.internal.AwS43S1101000_25 r1 = new kotlin.jvm.internal.AwS43S1101000_25
            r0 = 1
            r1.<init>(r9, r12, r10, r0)
            r2.LIZLLL = r1
        L40:
            return
        L41:
            boolean r0 = X.C123100dR.LIZ(r9)
            if (r0 == 0) goto L32
            X.13DR r0 = X.C1688900u3E.LIZ
            java.lang.Object r5 = r6.LJJIL(r0)
            X.08sV r5 = (X.InterfaceC2254908sV) r5
            r0 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r6.LJJIIJZLJL(r0)
            boolean r4 = r6.LJII(r5)
            r0 = r8 & 14
            r3 = 0
            r1 = 1
            if (r0 != r2) goto L88
            r2 = 1
        L60:
            r2 = r2 | r4
            r0 = r8 & 112(0x70, float:1.57E-43)
            if (r0 == r7) goto L66
            r1 = 0
        L66:
            r2 = r2 | r1
            java.lang.Object r1 = r6.LJJ()
            if (r2 != 0) goto L76
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L7f
        L76:
            X.08sU r1 = new X.08sU
            r0 = 0
            r1.<init>(r5, r9, r10, r0)
            r6.LJJIJIIJI(r1)
        L7f:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r6.LJJJJL(r3)
            X.C1680540tpk.LJFF(r9, r1, r6)
            goto L32
        L88:
            r2 = 0
            goto L60
        L8a:
            r0 = 16
            goto L22
        L8d:
            r8 = 2
            goto L13
        L8f:
            r8 = r12
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688900u3E.LIZ(java.lang.String, kotlin.jvm.functions.Function0, X.0tpg, int):void");
    }

    public static final void LJ(String str, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-639990208);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1668060tVc.LIZ(null, false, 0L, C1670400tZO.LIZIZ(c13zcLJIIJ).I2(), null, C13Z4.LIZJ(-970348215, new AwS455S0200000_19((Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ), (Context) function0, (Function0<Unit>) 21), c13zcLJIIJ), C13Z4.LIZJ(1390412682, new AwS125S1000000_19(str, 2), c13zcLJIIJ), null, c13zcLJIIJ, 1769472, 151);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS42S1101000_19(str, i, function0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.lang.String r28, boolean r29, boolean r30, boolean r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.InterfaceC1680500tpg r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688900u3E.LIZJ(java.lang.String, boolean, boolean, boolean, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
