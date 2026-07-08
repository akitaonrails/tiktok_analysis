package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS105S0400000_7;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNJ {
    public static final List<C0KNL> LIZ = C1697810uHb.LJIIJJI(new C0KNL() { // from class: X.0KN2
        /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
        @Override // X.C0KNL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZLLL(X.C0KNO r13) {
            /*
                Method dump skipped, instruction units count: 284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0KN2.LIZLLL(X.0KNO):void");
        }

        @Override // X.C0KNL
        public final boolean LJ(C0KNO c0kno) {
            if (c0kno.LIZIZ == 0) {
                return true;
            }
            return false;
        }
    }, new C0KNL() { // from class: X.0KNI
        @Override // X.C0KNL
        public final void LIZLLL(C0KNO c0kno) {
            Context context = c0kno.LIZ;
            if (context == null) {
                C0JCX.LIZ(2131839337);
                return;
            }
            int i = c0kno.LIZJ;
            int i2 = c0kno.LJIIJJI;
            if (i != -202 && i != 208) {
                switch (i) {
                    case 203:
                        String str = "";
                        if (i2 != 3) {
                            if (i2 != 2032) {
                                if (i2 != 5) {
                                    if (i2 != 6) {
                                        String strLJII = C511520K4g.LJII(2131839333);
                                        if (strLJII == null) {
                                            strLJII = "";
                                        }
                                        String strLJII2 = C511520K4g.LJII(2131839751);
                                        if (strLJII2 != null) {
                                            str = strLJII2;
                                        }
                                        LIZ(c0kno, strLJII, str, "", AFwS193S0000000_7.get$arr$(378));
                                    } else {
                                        String strLJII3 = C511520K4g.LJII(2131836593);
                                        if (strLJII3 == null) {
                                            strLJII3 = "";
                                        }
                                        String strLJII4 = C511520K4g.LJII(2131836594);
                                        if (strLJII4 != null) {
                                            str = strLJII4;
                                        }
                                        LIZ(c0kno, strLJII3, str, "", AFwS193S0000000_7.get$arr$(378));
                                    }
                                } else {
                                    String strLJII5 = C511520K4g.LJII(2131836593);
                                    if (strLJII5 == null) {
                                        strLJII5 = "";
                                    }
                                    String strLJII6 = C511520K4g.LJII(2131836586);
                                    if (strLJII6 != null) {
                                        str = strLJII6;
                                    }
                                    LIZ(c0kno, strLJII5, str, "", AFwS193S0000000_7.get$arr$(378));
                                }
                            } else {
                                String strLJII7 = C511520K4g.LJII(2131836593);
                                if (strLJII7 == null) {
                                    strLJII7 = "";
                                }
                                String strLJII8 = C511520K4g.LJII(2131839395);
                                if (strLJII8 != null) {
                                    str = strLJII8;
                                }
                                LIZ(c0kno, strLJII7, str, "", AFwS193S0000000_7.get$arr$(378));
                            }
                        } else {
                            String strLJII9 = C511520K4g.LJII(2131839333);
                            if (strLJII9 == null) {
                                strLJII9 = "";
                            }
                            String strLJII10 = C511520K4g.LJII(2131836595);
                            if (strLJII10 == null) {
                                strLJII10 = "";
                            }
                            String strLJII11 = C511520K4g.LJII(2131836587);
                            if (strLJII11 != null) {
                                str = strLJII11;
                            }
                            LIZ(c0kno, strLJII9, strLJII10, str, new AwS408S0200000_7(this, context, 78));
                        }
                        break;
                    case 204:
                    case 205:
                        C0JCX.LIZIZ(2131839753, context);
                        break;
                    case 206:
                        String str2 = c0kno.LJIIIZ;
                        if (str2 != null && str2.length() != 0) {
                            C0K54.LIZ().LJ(context, str2, C2097608Jq.LJ());
                        } else {
                            C0JCX.LIZIZ(2131839394, context);
                        }
                        break;
                    default:
                        C0JCX.LIZIZ(2131839376, context);
                        break;
                }
                return;
            }
            C0JCX.LIZIZ(2131839752, context);
        }

        @Override // X.C0KNL
        public final boolean LJ(C0KNO c0kno) {
            if (c0kno.LIZIZ == 1) {
                return true;
            }
            return false;
        }
    });
    public static final List<C0KNL> LIZIZ = C1697810uHb.LJIIJJI(new C0KNL() { // from class: X.0KNK
        /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00bf  */
        @Override // X.C0KNL
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZLLL(X.C0KNO r16) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0KNK.LIZLLL(X.0KNO):void");
        }

        @Override // X.C0KNL
        public final boolean LJ(C0KNO c0kno) {
            if (c0kno.LIZIZ == 0) {
                return true;
            }
            return false;
        }

        public static void LJII(C0KNO c0kno, int i) throws JSONException {
            String strLJII;
            Exception exc = c0kno.LJFF;
            if (exc == null || (strLJII = C09OK.LIZ(null, exc).LIZJ) == null || strLJII.length() <= 0) {
                strLJII = null;
            }
            String str = "";
            if (strLJII == null && (strLJII = C511520K4g.LJII(i)) == null) {
                strLJII = "";
            }
            C0KOM c0kom = new Object() { // from class: X.0KOM
            };
            Context topContext = c0kno.LIZ;
            String strLJII2 = C511520K4g.LJII(2131848126);
            if (strLJII2 == null) {
                strLJII2 = "";
            }
            String strLJII3 = C511520K4g.LJII(2131848125);
            if (strLJII3 == null) {
                strLJII3 = "";
            }
            String strLJII4 = C511520K4g.LJII(2131822144);
            if (strLJII4 != null) {
                str = strLJII4;
            }
            AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(275);
            AFwS193S0000000_7 aFwS193S0000000_72 = AFwS193S0000000_7.get$arr$(276);
            c0kom.getClass();
            if (topContext == null || !C0K51.LJII(topContext)) {
                topContext = C1931507hR.LIZ().getTopContext();
            }
            if (topContext == null) {
                C0JCX.LIZ(2131839337);
                return;
            }
            try {
                C1397580mTM c1397580mTM = new C1397580mTM(C0HE8.LIZ(topContext));
                C1235760iGM.LIZ(c1397580mTM, R.raw.icon_exclamation_mark_circle, null, 6);
                c1397580mTM.LJI(strLJII2);
                c1397580mTM.LIZIZ(strLJII);
                c1397580mTM.LJII = false;
                C985403tE.LIZ(c1397580mTM, new AwS105S0400000_7((CharSequence) strLJII3, (CharSequence) str, (CharSequence) aFwS193S0000000_7, (Function0<Unit>) aFwS193S0000000_72, (Function0<Unit>) 1));
                new C1397510mTF(c1397580mTM).LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C0K6D.LIZJ(e, "PgcIapPopupDialogUtil#show", C2097608Jq.LJ());
                C0JCX.LIZ(2131839337);
            }
        }

        @Override // X.C0KNL
        public final void LIZ(C0KNO c0kno, String str, String str2, String str3, Function0<Unit> function0) throws JSONException {
            Exception exc;
            String message;
            Context topContext;
            Map<String, String> map;
            if (c0kno.LIZIZ == 0) {
                if (c0kno.LIZ == null) {
                    C0JCX.LIZ(2131839337);
                    return;
                }
                String strLJIIJJI = C0K7G.LJIIJJI();
                if (strLJIIJJI.length() == 0) {
                    strLJIIJJI = "aweme://webview?url=https%3A%2F%2Ffeedback.tiktokv.com%2Ffeedback%2Foffline%2Fsubmit%3Ftrans_status_bar%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26container_color_auto_dark%3D1%26entrance%3Dsubscription_submit%26enter_from%3Dsubscription_submit%26_pia_%3D1%26version%3D1.0.0%26bdhm_bid%3Dcsp_im_inapp_hybrid";
                }
                Uri uriLIZJ = C0KNL.LIZJ(strLJIIJJI, c0kno);
                C13DA c13da = new C13DA();
                C0KFM c0kfm = c0kno.LJIIJ;
                if (c0kfm != null && (map = c0kfm.LJ) != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (!Intrinsics.LJFF(key, "collection_id") && !Intrinsics.LJFF(key, "show_type")) {
                            c13da.put(key, value);
                        }
                    }
                }
                c13da.put("error_code", String.valueOf(c0kno.LIZJ));
                Exception exc2 = c0kno.LJFF;
                if ((exc2 == null || (message = C09OK.LIZ(null, exc2).LIZJ) == null) && ((exc = c0kno.LJFF) == null || (message = exc.getMessage()) == null)) {
                    message = "";
                }
                c13da.put("error_msg", message);
                Map mapBuild = c13da.build();
                Map mapLJIIL = C2097608Jq.LJIIL(mapBuild, C2097908Jt.LIZJ(new Pair("action_type", "click")));
                Map mapLJIIL2 = C2097608Jq.LJIIL(mapBuild, C2097908Jt.LIZJ(new Pair("action_type", "show")));
                try {
                    if (C0K51.LJII(c0kno.LIZ)) {
                        topContext = c0kno.LIZ;
                    } else {
                        topContext = C1931507hR.LIZ().getTopContext();
                    }
                    if (topContext == null) {
                        C0JCX.LIZ(2131839337);
                        return;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(C0HE8.LIZ(topContext));
                    C1235760iGM.LIZ(c1397580mTM, R.raw.icon_exclamation_mark_circle, null, 6);
                    if (str.length() > 0) {
                        c1397580mTM.LJI(str);
                    }
                    if (str2.length() > 0) {
                        c1397580mTM.LIZIZ(str2);
                    }
                    if (str3.length() > 0) {
                        C1397720mTa.LIZ(c1397580mTM, str3, new AwS216S0300000_7(this, (C0KNK) c0kno, (C0KNO) function0, (Function0<Unit>) 20));
                    }
                    c1397580mTM.LJII = false;
                    C985403tE.LIZ(c1397580mTM, new AwS105S0400000_7(c0kno, (C0KNO) uriLIZJ, (Uri) this, (C0KNK) mapLJIIL, (Map<String, String>) 5));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    C0KNL.LJFF(c0kno.LIZJ, c0kno.LJ, c0kno.LJIIIIZZ, c0kno.LJI);
                    C0KOO.LIZ.getClass();
                    C0KOO.LIZ(mapLJIIL2);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C0K6D.LIZJ(e, "CreateOrderExceptionHandlerV2#displayAlert", C2097608Jq.LJ());
                    C0JCX.LIZ(2131839337);
                    return;
                }
            }
            super.LIZ(c0kno, str, str2, str3, function0);
        }
    }, new C0KNL() { // from class: X.0KNI
        @Override // X.C0KNL
        public final void LIZLLL(C0KNO c0kno) {
            Context context = c0kno.LIZ;
            if (context == null) {
                C0JCX.LIZ(2131839337);
                return;
            }
            int i = c0kno.LIZJ;
            int i2 = c0kno.LJIIJJI;
            if (i != -202 && i != 208) {
                switch (i) {
                    case 203:
                        String str = "";
                        if (i2 != 3) {
                            if (i2 != 2032) {
                                if (i2 != 5) {
                                    if (i2 != 6) {
                                        String strLJII = C511520K4g.LJII(2131839333);
                                        if (strLJII == null) {
                                            strLJII = "";
                                        }
                                        String strLJII2 = C511520K4g.LJII(2131839751);
                                        if (strLJII2 != null) {
                                            str = strLJII2;
                                        }
                                        LIZ(c0kno, strLJII, str, "", AFwS193S0000000_7.get$arr$(378));
                                    } else {
                                        String strLJII3 = C511520K4g.LJII(2131836593);
                                        if (strLJII3 == null) {
                                            strLJII3 = "";
                                        }
                                        String strLJII4 = C511520K4g.LJII(2131836594);
                                        if (strLJII4 != null) {
                                            str = strLJII4;
                                        }
                                        LIZ(c0kno, strLJII3, str, "", AFwS193S0000000_7.get$arr$(378));
                                    }
                                } else {
                                    String strLJII5 = C511520K4g.LJII(2131836593);
                                    if (strLJII5 == null) {
                                        strLJII5 = "";
                                    }
                                    String strLJII6 = C511520K4g.LJII(2131836586);
                                    if (strLJII6 != null) {
                                        str = strLJII6;
                                    }
                                    LIZ(c0kno, strLJII5, str, "", AFwS193S0000000_7.get$arr$(378));
                                }
                            } else {
                                String strLJII7 = C511520K4g.LJII(2131836593);
                                if (strLJII7 == null) {
                                    strLJII7 = "";
                                }
                                String strLJII8 = C511520K4g.LJII(2131839395);
                                if (strLJII8 != null) {
                                    str = strLJII8;
                                }
                                LIZ(c0kno, strLJII7, str, "", AFwS193S0000000_7.get$arr$(378));
                            }
                        } else {
                            String strLJII9 = C511520K4g.LJII(2131839333);
                            if (strLJII9 == null) {
                                strLJII9 = "";
                            }
                            String strLJII10 = C511520K4g.LJII(2131836595);
                            if (strLJII10 == null) {
                                strLJII10 = "";
                            }
                            String strLJII11 = C511520K4g.LJII(2131836587);
                            if (strLJII11 != null) {
                                str = strLJII11;
                            }
                            LIZ(c0kno, strLJII9, strLJII10, str, new AwS408S0200000_7(this, context, 78));
                        }
                        break;
                    case 204:
                    case 205:
                        C0JCX.LIZIZ(2131839753, context);
                        break;
                    case 206:
                        String str2 = c0kno.LJIIIZ;
                        if (str2 != null && str2.length() != 0) {
                            C0K54.LIZ().LJ(context, str2, C2097608Jq.LJ());
                        } else {
                            C0JCX.LIZIZ(2131839394, context);
                        }
                        break;
                    default:
                        C0JCX.LIZIZ(2131839376, context);
                        break;
                }
                return;
            }
            C0JCX.LIZIZ(2131839752, context);
        }

        @Override // X.C0KNL
        public final boolean LJ(C0KNO c0kno) {
            if (c0kno.LIZIZ == 1) {
                return true;
            }
            return false;
        }
    });

    public static boolean LIZJ() {
        C844470XAv.LIZ.getClass();
        PackageManager packageManager = C844470XAv.LIZ().getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            C786410Ut5.Y3(packageManager, "com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZIZ(C0KNO c0kno) {
        String str;
        List<C0KNL> list;
        Map<String, String> map;
        C0KFM c0kfm = c0kno.LJIIJ;
        if (c0kfm != null && (map = c0kfm.LJ) != null) {
            str = map.get("iap_dialog_use_new_style");
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "true")) {
            list = LIZIZ;
        } else {
            list = LIZ;
        }
        for (C0KNL c0knl : list) {
            if (c0knl.LJ(c0kno)) {
                c0knl.LIZLLL(c0kno);
                return;
            }
        }
        new C0KNL() { // from class: X.0KNi
            @Override // X.C0KNL
            public final boolean LJ(C0KNO c0kno2) {
                return true;
            }

            @Override // X.C0KNL
            public final void LIZLLL(C0KNO c0kno2) {
                Exception exc = c0kno2.LJFF;
                if (exc != null) {
                    C511230K3d.LIZ(c0kno2.LIZ, exc, 2131839337);
                } else {
                    C0JCX.LIZ(2131839337);
                }
            }
        }.LIZLLL(c0kno);
    }

    public static void LIZLLL(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse("market://details"));
        if (context != null) {
            try {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm9YYzNzjswHj2F3VAulxUax+EwCUkho9UFtGld88TNsbVV08Rz3jw=", null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LIZ(int i, String str) {
        if (!C0K51.LJ(str)) {
            if (i != -1 && i != -2) {
                if (i == -3) {
                    if (LIZJ()) {
                        str = C511520K4g.LJII(2131836589);
                    } else {
                        str = C511520K4g.LJII(2131836590);
                    }
                } else {
                    str = C511520K4g.LJII(2131839391);
                }
            } else {
                str = C511520K4g.LJII(2131836591);
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
