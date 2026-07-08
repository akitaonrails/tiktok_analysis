package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS106S0400000_8;
import kotlin.jvm.internal.AwS167S0400000_8;
import kotlin.jvm.internal.AwS16S0120000_22;
import kotlin.jvm.internal.AwS217S0300000_8;
import kotlin.jvm.internal.AwS286S0300000_8;
import kotlin.jvm.internal.AwS2S2500000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS587S0100000_8;
import lth.o;

/* JADX INFO: renamed from: X.0LGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540290LGx {
    public static boolean LIZIZ;
    public static final C540290LGx LIZ = new C540290LGx();
    public static final Keva LIZJ = KevaImpl.getRepo("record_setting_dialog_helper", 0);

    public static Map LIZIZ(Context context) {
        return C2097608Jq.LJIIIIZZ(new Pair("android.permission.CAMERA", context.getString(2131849196)), new Pair("android.permission.RECORD_AUDIO", context.getString(2131849200)), new Pair("android.permission.WRITE_EXTERNAL_STORAGE", context.getString(2131849198)));
    }

    public static void LIZJ(boolean z) {
        String str;
        InterfaceC1589330rSd interfaceC1589330rSdLIZJ = C849850XVn.LIZIZ.LIZJ();
        if (z) {
            str = "positive";
        } else {
            str = "negative";
        }
        interfaceC1589330rSdLIZJ.LJIJI("730", str, z);
    }

    public static void LJIILIIL(C19EG c19eg) {
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131849189));
        c1397580mTM.LIZIZ(LIZ(c19eg, C2097908Jt.LIZJ(new Pair("android.permission.RECORD_AUDIO", c19eg.getString(2131849200))), new String[]{"android.permission.RECORD_AUDIO"}));
        C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(c19eg, 269));
        new AutoDismissPermissionDialog(c19eg, c1397580mTM).LIZ();
    }

    public final void LJIIJJI(C19EG c19eg, Function0<Unit> function0) {
        String[] strArrLIZ = C527810Kmx.LIZ();
        if (!C533930Kwp.LIZIZ(strArrLIZ)) {
            String[] strArrLJI = C533930Kwp.LJI(C533930Kwp.LJ(strArrLIZ), strArrLIZ);
            Map mapLIZIZ = LIZIZ(c19eg);
            String string = c19eg.getString(2131849201);
            String strLIZ = LIZ(c19eg, mapLIZIZ, strArrLJI);
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(183);
            AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(185);
            getClass();
            LJIILJJIL(c19eg, strArrLJI, string, strLIZ, aFwS194S0000000_8, aFwS194S0000000_82, function0, "");
        }
    }

    public static String LIZ(Context context, Map map, String[] strArr) {
        int length = strArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "";
                }
                return context.getString(2131849204, map.get(strArr[0]), map.get(strArr[1]), map.get(strArr[2]));
            }
            return context.getString(2131849203, map.get(strArr[0]), map.get(strArr[1]));
        }
        return context.getString(2131849202, map.get(strArr[0]));
    }

    public final void LJIIL(C19GS c19gs, Function0 function0, String[] strArr) {
        if (strArr.length == 0) {
            strArr = C527810Kmx.LIZ();
        }
        if (!C533930Kwp.LIZIZ(strArr)) {
            String[] strArrLJI = C533930Kwp.LJI(C533930Kwp.LJ(strArr), strArr);
            Map mapLIZIZ = LIZIZ(c19gs);
            String string = c19gs.getString(2131849201);
            String strLIZ = LIZ(c19gs, mapLIZIZ, strArrLJI);
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(183);
            AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(185);
            getClass();
            LJIILJJIL(c19gs, strArrLJI, string, strLIZ, aFwS194S0000000_8, aFwS194S0000000_82, function0, "");
        }
    }

    public static void LJII(C19EG c19eg, Function0 function0, Function0 function02, Function0 function03) {
        String[] strArrLIZ = C527810Kmx.LIZ();
        String[] strArrLJI = C533930Kwp.LJI(C533930Kwp.LJ(strArrLIZ), strArrLIZ);
        Map mapLIZIZ = LIZIZ(c19eg);
        C533800Kwc.LJII(strArrLIZ, c19eg, "");
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131849201));
        c1397580mTM.LIZIZ(LIZ(c19eg, mapLIZIZ, strArrLJI));
        C985403tE.LIZ(c1397580mTM, new AwS106S0400000_8(strArrLIZ, (String[]) c19eg, (C19EG) function03, (Function0<Unit>) function0, (Function0<Unit>) 1));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function02, (Function0<Unit>) 266);
        if (autoDismissPermissionDialog.LIZ()) {
            LIZIZ = true;
        }
    }

    public static void LJIIIIZZ(C19EG c19eg, Function0 function0, Function0 function02, Function0 function03) {
        String[] strArr = {"android.permission.CAMERA"};
        String[] strArrLJI = C533930Kwp.LJI(C533930Kwp.LJ(strArr), strArr);
        Map mapLIZIZ = LIZIZ(c19eg);
        C533800Kwc.LJII(strArr, c19eg, "");
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131849201));
        c1397580mTM.LIZIZ(LIZ(c19eg, mapLIZIZ, strArrLJI));
        C985403tE.LIZ(c1397580mTM, new AwS106S0400000_8(strArr, (String[]) c19eg, (C19EG) function03, (Function0<Unit>) function0, (Function0<Unit>) 2));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function02, (Function0<Unit>) 267);
        if (autoDismissPermissionDialog.LIZ()) {
            LIZIZ = true;
        }
    }

    public static AutoDismissPermissionDialog LJIIIZ(C19EG c19eg, Function0 function0, Function0 function02, Function0 function03) {
        String string;
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            string = c19eg.getString(2131829667);
        } else {
            string = c19eg.getString(2131829664);
        }
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LIZIZ(string);
        C985403tE.LIZ(c1397580mTM, new AwS217S0300000_8(c19eg, (C19EG) function03, (Function0<Unit>) function0, (Function0<Unit>) 20));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function02, (Function0<Unit>) 268);
        if (autoDismissPermissionDialog.LIZ()) {
            LIZIZ = true;
        }
        return autoDismissPermissionDialog;
    }

    public static void LJIIJ(C19EG c19eg, Function0 function0, Function0 function02, Function0 function03) {
        LJIILJJIL(c19eg, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, c19eg.getString(2131849191), c19eg.getString(2131849190), function0, function02, function03, "shoot_page");
    }

    public final void LIZLLL(final C19EG c19eg, final C0LH5 c0lh5, final Function0<Unit> function0, final Function0<Unit> function02, final TokenCert tokenCert) {
        final String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        if (C849850XVn.LIZIZ.LIZJ().LJJ("video")) {
            PopupManager.LJIJ(new C10GR() { // from class: X.0MAj
                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return 0;
                }

                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    C19EG c19eg2 = c19eg;
                    if (!(c19eg2 instanceof C19EG) || c19eg2 == null) {
                        return null;
                    }
                    return new C688120Qyw(c19eg2, c19eg2, null);
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    C540290LGx c540290LGx = C540290LGx.LIZ;
                    C19EG c19eg2 = c19eg;
                    C540290LGx.LJFF(c540290LGx, c19eg2, strArr, new AwS167S0400000_8(c19eg2, (C19EG) function0, (Function0<Unit>) c20656615sK, (C20656615sK) function02, (Function0<Unit>) 1), c0lh5, tokenCert, new AwS552S0100000_8(c20656615sK, 355), 80);
                }
            }, "video", new C1668306g5("creator_video_general"));
        } else {
            LJFF(this, c19eg, strArr, new AwS286S0300000_8(c19eg, (C19EG) function0, function02, (Function0<Unit>) 1), c0lh5, tokenCert, null, 208);
        }
    }

    public static void LJFF(C540290LGx c540290LGx, C19EG c19eg, String[] strArr, Function2 function2, C0LH5 c0lh5, TokenCert tokenCert, Function0 function0, int i) {
        AFwS194S0000000_8 aFwS194S0000000_8;
        String str;
        Function0 function02 = function0;
        Map<String, String> mapLIZJ = null;
        if ((i & 16) != 0) {
            aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(184);
        } else {
            aFwS194S0000000_8 = null;
        }
        if ((i & 64) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            function02 = AFwS194S0000000_8.get$arr$(186);
        }
        c540290LGx.getClass();
        if (!LIZIZ) {
            if (C533930Kwp.LIZIZ(strArr)) {
                ArrayList arrayList = new ArrayList(strArr.length);
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(0);
                }
                c0lh5.LIZ(C13LP.LLII(arrayList), strArr);
                function02.invoke();
                return;
            }
            o.LJJ.LJ().LIZ();
            C533800Kwc.LJFF(strArr, c19eg, str, null);
            C540300LGy c540300LGy = new C540300LGy(c19eg, str, c0lh5, aFwS194S0000000_8, function02, function2);
            if (C849850XVn.LIZIZ.LIZJ().LJJ("")) {
                if (C13LQ.LJJIJIIJI("android.permission.CAMERA", strArr) >= 0) {
                    mapLIZJ = C2097908Jt.LIZJ(new Pair("blacklist", "android.permission.CAMERA"));
                }
                C19514511Wl c19514511WlLIZIZ = C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length));
                c19514511WlLIZIZ.LIZJ.LJI = mapLIZJ;
                c19514511WlLIZIZ.LIZJ(new C581140Mqm(c540300LGy, 3));
                return;
            }
            C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArr, strArr.length)).LIZJ(new C581140Mqm(c540300LGy, 4));
        }
    }

    public static void LJI(C540290LGx c540290LGx, C19EG c19eg, C0LH5 c0lh5, AwS566S0100000_22 awS566S0100000_22, AwS16S0120000_22 awS16S0120000_22, AwS16S0120000_22 awS16S0120000_222, TokenCert tokenCert, int i) {
        Function0 function0 = awS16S0120000_222;
        Function0 function02 = awS16S0120000_22;
        Function0 function03 = awS566S0100000_22;
        if ((i & 4) != 0) {
            function03 = AFwS194S0000000_8.get$arr$(187);
        }
        if ((i & 8) != 0) {
            function02 = AFwS194S0000000_8.get$arr$(188);
        }
        if ((i & 16) != 0) {
            function0 = AFwS194S0000000_8.get$arr$(189);
        }
        c540290LGx.getClass();
        LJFF(c540290LGx, c19eg, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new AwS167S0400000_8(c19eg, function03, function02, function0, 2), c0lh5, tokenCert, null, 208);
    }

    public static void LJIILJJIL(C19EG c19eg, String[] strArr, String str, String str2, Function0 function0, Function0 function02, Function0 function03, String str3) {
        C533800Kwc.LJII(strArr, c19eg, str3);
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(str);
        c1397580mTM.LIZIZ(str2);
        c1397580mTM.LJII = true;
        C985403tE.LIZ(c1397580mTM, new C537320L5m(strArr, c19eg, str3, function0, function02));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function03, (Function0<Unit>) 270);
        if (autoDismissPermissionDialog.LIZ()) {
            LIZIZ = true;
        }
    }

    public static void LJ(C540290LGx c540290LGx, final C19EG c19eg, ShortVideoContext shortVideoContext, final C0LH5 c0lh5, Function0 function0, Function0 function02, Function0 function03, Function0 function04, AwS552S0100000_8 awS552S0100000_8, boolean z, boolean z2, boolean z3, boolean z4, final boolean z5, String str, String str2, TokenCert tokenCert, boolean z6, int i) {
        final boolean z7 = z4;
        final boolean z8 = z6;
        final boolean z9 = z3;
        final Function0 function05 = awS552S0100000_8;
        final String str3 = str;
        final Function0 function06 = function04;
        final boolean z10 = z2;
        final boolean z11 = z;
        final Function0 function07 = function03;
        final Function0 function08 = function02;
        final Function0 function09 = function0;
        final ShortVideoContext shortVideoContext2 = shortVideoContext;
        if ((i & 2) != 0) {
            shortVideoContext2 = null;
        }
        if ((i & 8) != 0) {
            function09 = AFwS194S0000000_8.get$arr$(178);
        }
        if ((i & 16) != 0) {
            function08 = AFwS194S0000000_8.get$arr$(179);
        }
        if ((i & 32) != 0) {
            function07 = AFwS194S0000000_8.get$arr$(180);
        }
        if ((i & 64) != 0) {
            function06 = AFwS194S0000000_8.get$arr$(181);
        }
        if ((i & 128) != 0) {
            function05 = AFwS194S0000000_8.get$arr$(182);
        }
        if ((i & 256) != 0) {
            z11 = false;
        }
        if ((i & 512) != 0) {
            z10 = false;
        }
        if ((i & 1024) != 0) {
            z9 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z7 = false;
        }
        final String str4 = "";
        if ((i & 8192) != 0) {
            str3 = "";
        }
        if ((i & 16384) == 0) {
            str4 = str2;
        }
        if ((i & 65536) != 0) {
            z8 = true;
        }
        c540290LGx.getClass();
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        final boolean z12 = z8;
        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0L5k
            @Override // X.InterfaceC540100LGe
            public final void LIZ(int[] iArr, String[] strArr) {
                String[] strArr2;
                String str5;
                String[] strArr3;
                String str6;
                if (z8) {
                    C533800Kwc.LJFF(strArr, c19eg, "shoot_page", null);
                    C533800Kwc.LIZLLL(strArr, iArr, c19eg, "shoot_page", null);
                }
                if (!z5) {
                    C540290LGx c540290LGx2 = C540290LGx.LIZ;
                    C19EG c19eg2 = c19eg;
                    Function0<Unit> function010 = function09;
                    Function0<Unit> function011 = function08;
                    Function0<Unit> function012 = function07;
                    c540290LGx2.getClass();
                    C540290LGx.LJIIJ(c19eg2, function010, function011, function012);
                } else if (z10) {
                    C540290LGx c540290LGx3 = C540290LGx.LIZ;
                    C19EG c19eg3 = c19eg;
                    ShortVideoContext shortVideoContext3 = shortVideoContext2;
                    Function0<Unit> function013 = function09;
                    Function0<Unit> function014 = function06;
                    Function0<Unit> function015 = function07;
                    String str7 = str4;
                    String str8 = str3;
                    c540290LGx3.getClass();
                    if (Build.VERSION.SDK_INT >= 33) {
                        strArr3 = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                    } else {
                        strArr3 = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                    }
                    String string = c19eg3.getString(2131829679);
                    String string2 = c19eg3.getString(2131829678);
                    if (!C540290LGx.LIZJ.getBoolean("should_open_private_album_from_not_now", true)) {
                        function014.invoke();
                    } else {
                        C533800Kwc.LJII(strArr3, c19eg3, str7);
                        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
                        if (shortVideoContext3 != null) {
                            str6 = shortVideoContext3.shootWay;
                        } else {
                            str6 = null;
                        }
                        C523280Kfe.LJ(c523280Kfe, str6, str8);
                        C1397580mTM c1397580mTM = new C1397580mTM(c19eg3);
                        c1397580mTM.LJI(string);
                        c1397580mTM.LIZIZ(string2);
                        c1397580mTM.LJII = true;
                        C985403tE.LIZ(c1397580mTM, new AwS2S2500000_8(strArr3, (String[]) c19eg3, (C19EG) str7, (String) function013, (Function0<Unit>) shortVideoContext3, (ShortVideoContext) str8, (String) function014, (Function0<Unit>) 0));
                        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg3, c1397580mTM);
                        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(function015, (Function0<Unit>) 262);
                        if (autoDismissPermissionDialog.LIZ()) {
                            C540290LGx.LIZIZ = true;
                        }
                    }
                } else if (z9) {
                    C540290LGx c540290LGx4 = C540290LGx.LIZ;
                    C19EG c19eg4 = c19eg;
                    ShortVideoContext shortVideoContext4 = shortVideoContext2;
                    Function0<Unit> function016 = function09;
                    Function0<Unit> function017 = function06;
                    Function0<Unit> function018 = function07;
                    String str9 = str4;
                    String str10 = str3;
                    c540290LGx4.getClass();
                    if (Build.VERSION.SDK_INT >= 33) {
                        strArr2 = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                    } else {
                        strArr2 = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                    }
                    String string3 = c19eg4.getString(2131829679);
                    String string4 = c19eg4.getString(2131829678);
                    if (!C540290LGx.LIZJ.getBoolean("should_open_private_album_from_select_photos_cta", true)) {
                        function017.invoke();
                    } else {
                        C533800Kwc.LJII(strArr2, c19eg4, str9);
                        C523280Kfe c523280Kfe2 = C523280Kfe.LIZ;
                        if (shortVideoContext4 != null) {
                            str5 = shortVideoContext4.shootWay;
                        } else {
                            str5 = null;
                        }
                        C523280Kfe.LJ(c523280Kfe2, str5, str10);
                        C1397580mTM c1397580mTM2 = new C1397580mTM(c19eg4);
                        c1397580mTM2.LJI(string3);
                        c1397580mTM2.LIZIZ(string4);
                        c1397580mTM2.LJII = true;
                        C985403tE.LIZ(c1397580mTM2, new C537310L5l(function017, shortVideoContext4, str10, strArr2, c19eg4, str9, function016, function018));
                        AutoDismissPermissionDialog autoDismissPermissionDialog2 = new AutoDismissPermissionDialog(c19eg4, c1397580mTM2);
                        autoDismissPermissionDialog2.LLILZ = new AwS587S0100000_8(function018, (Function0<Unit>) 265);
                        if (autoDismissPermissionDialog2.LIZ()) {
                            C540290LGx.LIZIZ = true;
                        }
                    }
                } else if (z7) {
                    C540290LGx c540290LGx5 = C540290LGx.LIZ;
                    C19EG c19eg5 = c19eg;
                    Function0<Unit> function019 = function09;
                    Function0<Unit> function020 = function08;
                    Function0<Unit> function021 = function07;
                    c540290LGx5.getClass();
                    C540290LGx.LJIIJ(c19eg5, function019, function020, function021);
                } else if (z11) {
                    function06.invoke();
                }
                function05.invoke();
            }
        };
        C0LGZ c0lgz = new C0LGZ() { // from class: X.0LEG
            @Override // X.C0LGZ
            public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                if (z12 && c0l9u == C0L9U.GRANTED_AFTER_REQUEST) {
                    C533800Kwc.LJFF(strArr, c19eg, "shoot_page", null);
                }
                if (z12) {
                    C533800Kwc.LIZLLL(strArr, iArr, c19eg, "shoot_page", null);
                }
                c0lh5.LIZ(iArr, strArr);
            }
        };
        c0lgy.getClass();
        C0LGY.LJIIJ(c19eg, tokenCert, c0l91, interfaceC540100LGe, c0lgz);
    }
}
