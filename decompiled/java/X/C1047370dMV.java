package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S2001000_16;
import kotlin.jvm.internal.AwS225S0300000_16;
import kotlin.jvm.internal.AwS24S1101000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dMV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1047370dMV {
    public static final C1047370dMV LIZ = new C1047370dMV();

    public static final int LIZ(C1035880d3y c1035880d3y, String str) {
        AwemeRawAd awemeRawAd;
        boolean zLJIIIZ;
        String str2;
        Activity activityLIZIZ;
        Activity activityLIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1367751899) {
            if (iHashCode != 93166550) {
                if (iHashCode == 1901043637 && str.equals("location")) {
                    zLJIIIZ = true;
                }
            } else if (str.equals("audio")) {
                try {
                    zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "enable_iab_audio_permission", true, false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zLJIIIZ = false;
                }
            }
            zLJIIIZ = false;
        } else {
            if (str.equals("camera")) {
                if (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || !awemeRawAd.getWebApplyCamera()) {
                    try {
                        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_iab_camera_permission", true, false)) {
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                zLJIIIZ = true;
            }
            zLJIIIZ = false;
        }
        System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "location")) {
            C844470XAv.LIZ.getClass();
            return C145T.LIZ(C844470XAv.LIZ());
        }
        if (zLJIIIZ) {
            if (Intrinsics.LJFF(str, "camera")) {
                str2 = "android.permission.CAMERA";
            } else if (Intrinsics.LJFF(str, "audio")) {
                str2 = "android.permission.RECORD_AUDIO";
            } else {
                str2 = "";
            }
            C19741112Lp c19741112Lp = C19741112Lp.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            c19741112Lp.getClass();
            if (C19741112Lp.LIZLLL(contextLIZ, str2)) {
                return 3;
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                if (!C19741112Lp.LJI(activityLIZ, str2, true)) {
                    return 1;
                }
                return 2;
            }
            return 0;
        }
        return 0;
    }

    public static final void LIZIZ(final String str, final C1035880d3y c1035880d3y, final C1040740dBo c1040740dBo, final Function1 function1) {
        String[] strArr;
        Activity activityLIZIZ;
        final Activity activityLIZ;
        if (Intrinsics.LJFF(str, "audio")) {
            strArr = new String[]{"android.permission.RECORD_AUDIO"};
        } else if (Intrinsics.LJFF(str, "camera")) {
            strArr = new String[]{"android.permission.CAMERA"};
        } else {
            strArr = new String[]{""};
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(activityLIZ, TokenCert.Companion.with("bpea-third_ad_landing_page")).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length));
            c19514511WlLIZIZ.LIZJ.LIZ(new AbstractC838380Wui() { // from class: X.0dMU
                @Override // X.AbstractC838380Wui
                public final void LIZIZ(C19514611Wm c19514611Wm, C0HWO... c0hwoArr) {
                    AwemeRawAd awemeRawAd;
                    int i = C449220HjU.LIZ[c0hwoArr[0].LIZIZ.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                if (c19514611Wm != null) {
                                    c19514611Wm.LIZIZ();
                                }
                                function1.invoke(new C1044260dHU((Integer) 1, str, false));
                                C1047370dMV c1047370dMV = C1047370dMV.LIZ;
                                String str2 = str;
                                C1035880d3y c1035880d3y2 = c1035880d3y;
                                Activity activity = activityLIZ;
                                InterfaceC1029330ctP interfaceC1029330ctP = c1040740dBo;
                                c1047370dMV.getClass();
                                if (Intrinsics.LJFF(str2, "audio")) {
                                    if (!C1831507Fh.LIZ()) {
                                        C1397580mTM c1397580mTM = new C1397580mTM(activity);
                                        c1397580mTM.LJFF(2131824777);
                                        c1397580mTM.LIZ(2131824776);
                                        C985403tE.LIZ(c1397580mTM, new AwS382S0200000_16(activity, c1035880d3y2, 82));
                                        c1397580mTM.LJII = false;
                                        new C1397510mTF(c1397580mTM).LIZLLL();
                                        return;
                                    }
                                    return;
                                }
                                if (C1831507Fh.LIZ() && (c1035880d3y2 == null || (awemeRawAd = c1035880d3y2.getAwemeRawAd()) == null || !awemeRawAd.getWebApplyCamera())) {
                                    return;
                                }
                                C1397580mTM c1397580mTM2 = new C1397580mTM(activity);
                                c1397580mTM2.LJFF(2131824769);
                                c1397580mTM2.LIZ(2131824768);
                                C985403tE.LIZ(c1397580mTM2, new AwS225S0300000_16(activity, c1035880d3y2, interfaceC1029330ctP, 22));
                                c1397580mTM2.LJII = false;
                                new C1397510mTF(c1397580mTM2).LIZLLL();
                                return;
                            }
                            return;
                        }
                        if (c19514611Wm == null) {
                            return;
                        }
                        c19514611Wm.LIZJ();
                        return;
                    }
                    if (c19514611Wm != null) {
                        c19514611Wm.LIZIZ();
                    }
                    C1047370dMV c1047370dMV2 = C1047370dMV.LIZ;
                    String str3 = str;
                    C1035880d3y c1035880d3y3 = c1035880d3y;
                    Activity activity2 = activityLIZ;
                    InterfaceC1029330ctP interfaceC1029330ctP2 = c1040740dBo;
                    Function1<C1044260dHU, Unit> function12 = function1;
                    c1047370dMV2.getClass();
                    C1047370dMV.LJFF(str3, c1035880d3y3, activity2, interfaceC1029330ctP2, function12);
                }
            });
            c19514511WlLIZIZ.LIZJ(new InterfaceC19515111Wr() { // from class: X.0dHV
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    InterfaceC1029330ctP interfaceC1029330ctP;
                    if (!c0hwoArr[0].LIZ()) {
                        function1.invoke(new C1044260dHU((Integer) 1, str, false));
                        C1047370dMV.LIZJ(c1035880d3y, str, 0, 0);
                        if (Intrinsics.LJFF(str, "camera") && (interfaceC1029330ctP = c1040740dBo) != null) {
                            C1043510dGH.LIZ.getClass();
                            interfaceC1029330ctP.LJIILLIIL(C1043510dGH.LJIJI);
                            return;
                        }
                        return;
                    }
                    C1047370dMV.LIZJ(c1035880d3y, str, 0, 1);
                    InterfaceC1029330ctP interfaceC1029330ctP2 = c1040740dBo;
                    if (interfaceC1029330ctP2 != null) {
                        C1043510dGH.LIZ.getClass();
                        interfaceC1029330ctP2.LJIILLIIL(C1043510dGH.LJIJ);
                    }
                    C1047370dMV c1047370dMV = C1047370dMV.LIZ;
                    String str2 = str;
                    C1035880d3y c1035880d3y2 = c1035880d3y;
                    Activity activity = activityLIZ;
                    InterfaceC1029330ctP interfaceC1029330ctP3 = c1040740dBo;
                    Function1<C1044260dHU, Unit> function12 = function1;
                    c1047370dMV.getClass();
                    C1047370dMV.LJFF(str2, c1035880d3y2, activity, interfaceC1029330ctP3, function12);
                }
            });
        }
    }

    public static final void LIZJ(C1035880d3y c1035880d3y, String str, int i, int i2) {
        AwemeRawAd awemeRawAd;
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        C1023960ckk c1023960ckk = C2266261Dn6.LIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new C1047380dMW(str, i, i2));
    }

    public static final void LIZLLL(C1035880d3y c1035880d3y, String str, String str2, int i) {
        AwemeRawAd awemeRawAd;
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        C1023960ckk c1023960ckk = C2266281Dn8.LIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS0S2001000_16(str, str2, i, 1));
    }

    public static final void LJ(C1035880d3y c1035880d3y, String str, int i, Integer num) {
        AwemeRawAd awemeRawAd;
        AdWebEventLogger adWebEventLogger = new AdWebEventLogger(c1035880d3y);
        C1023960ckk c1023960ckk = C2266301DnA.LIZ;
        if (c1035880d3y != null) {
            awemeRawAd = c1035880d3y.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        adWebEventLogger.logAd(c1023960ckk, awemeRawAd, new AwS24S1101000_16(str, num, i, 2));
    }

    public static void LJFF(String str, C1035880d3y c1035880d3y, Context context, InterfaceC1029330ctP interfaceC1029330ctP, Function1 function1) {
        AwemeRawAd awemeRawAd;
        if (Intrinsics.LJFF(str, "audio")) {
            if ((c1035880d3y != null && c1035880d3y.getAudioGranted()) || C1831507Fh.LIZ()) {
                function1.invoke(new C1044260dHU(4, "audio", true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJFF(2131824775);
            c1397580mTM.LIZ(2131824774);
            C985403tE.LIZ(c1397580mTM, new AwS382S0200000_16(function1, (Function1<? super C1044260dHU, Unit>) c1035880d3y, (C1035880d3y) 78));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        if ((c1035880d3y != null && c1035880d3y.getCameraGranted()) || (C1831507Fh.LIZ() && (c1035880d3y == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || !awemeRawAd.getWebApplyCamera()))) {
            function1.invoke(new C1044260dHU(4, "camera", true));
            return;
        }
        C1397580mTM c1397580mTM2 = new C1397580mTM(context);
        c1397580mTM2.LJFF(2131824767);
        c1397580mTM2.LIZ(2131824774);
        C985403tE.LIZ(c1397580mTM2, new AwS225S0300000_16(function1, (Function1<? super C1044260dHU, Unit>) c1035880d3y, (C1035880d3y) interfaceC1029330ctP, (InterfaceC1029330ctP) 18));
        c1397580mTM2.LJII = false;
        new C1397510mTF(c1397580mTM2).LIZLLL();
    }
}
