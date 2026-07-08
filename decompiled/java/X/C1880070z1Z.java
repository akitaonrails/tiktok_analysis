package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameFeedMixedDetailPageHalfFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameMixedDetailPageFullFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameMixedDetailPageHalfFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880070z1Z {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(int i) {
        return i != 1 ? i != 2 ? i != 5 ? i != 6 ? i != 7 ? i != 9 ? i != 10 ? "" : "steam" : "epic_games_store" : "nintendo_store" : "playstation_store" : "microsoft_store" : "apple_app_store" : "google_play";
    }

    public static C474500IjA LIZ(C474500IjA c474500IjA, InterfaceC1881340z3c interfaceC1881340z3c) {
        C1881590z41 c1881590z41;
        String str;
        InterfaceC1882450z5P host = null;
        if (interfaceC1881340z3c != null) {
            host = interfaceC1881340z3c.getHost();
        }
        if ((host instanceof C1881590z41) && (c1881590z41 = (C1881590z41) host) != null) {
            GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment = c1881590z41.LLJJIJIL;
            if (!(gameDetailMixPageBaseFragment instanceof GameFeedMixedDetailPageHalfFragment) && !(gameDetailMixPageBaseFragment instanceof GameMixedDetailPageHalfFragment)) {
                if (gameDetailMixPageBaseFragment instanceof GameMixedDetailPageFullFragment) {
                    str = "full_page";
                }
            } else {
                str = "float";
            }
            if (str.length() != 0) {
                c474500IjA.LJJII(str, "show_type");
            }
        }
        return c474500IjA;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0062 A[PHI: r3
      0x0062: PHI (r3v1 boolean) = (r3v0 boolean), (r3v7 boolean), (r3v7 boolean) binds: [B:45:0x005f, B:27:0x003e, B:29:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066 A[PHI: r2 r3
      0x0066: PHI (r2v2 boolean) = (r2v1 boolean), (r2v6 boolean), (r2v6 boolean) binds: [B:48:0x0063, B:32:0x0047, B:34:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x0066: PHI (r3v2 boolean) = (r3v1 boolean), (r3v6 boolean), (r3v6 boolean) binds: [B:48:0x0063, B:32:0x0047, B:34:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006a A[PHI: r1 r2 r3
      0x006a: PHI (r1v12 boolean) = (r1v11 boolean), (r1v14 boolean), (r1v14 boolean) binds: [B:51:0x0067, B:37:0x0051, B:39:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r2v3 boolean) = (r2v2 boolean), (r2v5 boolean), (r2v5 boolean) binds: [B:51:0x0067, B:37:0x0051, B:39:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r3v3 boolean) = (r3v2 boolean), (r3v5 boolean), (r3v5 boolean) binds: [B:51:0x0067, B:37:0x0051, B:39:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.InterfaceC1881340z3c r7, com.bytedance.android.livesdk.game.model.GameStationGameInfo r8) {
        /*
            X.0z5L r1 = X.C1882380z5I.LJIIIIZZ(r7)
            r2 = 0
            if (r1 != 0) goto L72
            r1 = r2
        L8:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r5 = 1
            if (r8 == 0) goto Lbe
            int r0 = r8.gameSource
            if (r0 != 0) goto L6e
            r6 = 1
        L16:
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L6c
            int r0 = r0.ctaType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L6c
            if (r8 == 0) goto Lbe
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L6c
            int r0 = r0.gameCtaStatus
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L6c
            r4 = 0
        L31:
            if (r8 == 0) goto L5e
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L5e
            int r0 = r0.ctaType
            if (r0 != r5) goto L5e
            r3 = 1
        L3c:
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L62
            int r0 = r0.ctaType
            if (r0 != 0) goto L62
            r2 = 1
        L45:
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L66
            int r1 = r0.ctaType
            r0 = 2
            if (r1 != r0) goto L66
            r1 = 1
        L4f:
            com.bytedance.android.livesdk.game.model.GameCTAInfo r0 = r8.gameCtaInfo
            if (r0 == 0) goto L6a
            int r0 = r0.gameCtaStatus
            if (r0 != r5) goto L6a
        L57:
            if (r4 != 0) goto Lbe
            if (r6 != 0) goto L98
            java.lang.String r0 = "third_party"
            return r0
        L5e:
            r3 = 0
            if (r8 == 0) goto L62
            goto L3c
        L62:
            r2 = 0
            if (r8 == 0) goto L66
            goto L45
        L66:
            r1 = 0
            if (r8 == 0) goto L6a
            goto L4f
        L6a:
            r5 = 0
            goto L57
        L6c:
            r4 = 1
            goto L31
        L6e:
            r6 = 0
            if (r8 == 0) goto Lbe
            goto L16
        L72:
            X.0z3c r0 = r1.LIZ
            java.lang.String r1 = r1.LIZIZ
            if (r0 == 0) goto L96
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L85
            r1 = r2
        L85:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L96
            java.lang.String r0 = "is_registered_user"
            java.lang.Object r1 = r1.get(r0)
        L8f:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L8
            r1 = r2
            goto L8
        L96:
            r1 = r2
            goto L8f
        L98:
            if (r3 == 0) goto La7
            if (r5 == 0) goto L9f
            java.lang.String r0 = "grey_register"
            return r0
        L9f:
            if (r7 == 0) goto La4
            java.lang.String r0 = "registered"
            return r0
        La4:
            java.lang.String r0 = "pre_register"
            return r0
        La7:
            if (r2 == 0) goto Lb1
            if (r5 == 0) goto Lae
            java.lang.String r0 = "grey_download"
            return r0
        Lae:
            java.lang.String r0 = "normal"
            return r0
        Lb1:
            if (r1 == 0) goto Lbb
            if (r5 == 0) goto Lb8
            java.lang.String r0 = "grey_intervene"
            return r0
        Lb8:
            java.lang.String r0 = "intervene"
            return r0
        Lbb:
            java.lang.String r0 = ""
            return r0
        Lbe:
            java.lang.String r0 = "no_cta"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1880070z1Z.LIZIZ(X.0z3c, com.bytedance.android.livesdk.game.model.GameStationGameInfo):java.lang.String");
    }

    public static void LJ(InterfaceC1881340z3c interfaceC1881340z3c, String str) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_game_info_card_click");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LJJII(str, "btn_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(long j, InterfaceC1881340z3c interfaceC1881340z3c) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_page_duration");
        LIZ(c474500IjALIZ, interfaceC1881340z3c);
        c474500IjALIZ.LJJIFFI(Float.valueOf(j / LSPassThroughRecordSizeConfig.DEFAULT), "duration");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(InterfaceC1881340z3c interfaceC1881340z3c, String str) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_pre_register_show");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(InterfaceC1881340z3c interfaceC1881340z3c, Integer num) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_videos_sub_tab_click");
        C1882410z5L c1882410z5LLJIIIIZZ = null;
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LJJII(num, "is_default");
        if (interfaceC1881340z3c != null) {
            c1882410z5LLJIIIIZZ = C1882380z5I.LJIIIIZZ(interfaceC1881340z3c);
        }
        String strLJFF = C1882380z5I.LJFF(c1882410z5LLJIIIIZZ, "sub_tab_name");
        if (strLJFF == null) {
            strLJFF = "";
        }
        c474500IjALIZ.LJJII(strLJFF, "sub_tab_name");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(InterfaceC1881340z3c interfaceC1881340z3c, String str) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_see_all_click");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LJJII(str, "module_name");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.InterfaceC1881340z3c r4, boolean r5, java.lang.Boolean r6) {
        /*
            r3 = 0
            if (r4 == 0) goto L74
            X.0z5L r1 = X.C1882380z5I.LJIIIIZZ(r4)
            if (r1 == 0) goto L74
            X.0z3c r0 = r1.LIZ
            java.lang.String r1 = r1.LIZIZ
            if (r0 == 0) goto L72
            X.0z5U r0 = r0.LJJIIZI()
            java.lang.Object r1 = r0.LIZ(r1)
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentHashMap
            if (r0 != 0) goto L1c
            r1 = r3
        L1c:
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L72
            java.lang.String r0 = "is_registered_user"
            java.lang.Object r1 = r1.get(r0)
        L26:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L2b
            r1 = r3
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r5 == 0) goto L6a
            java.lang.String r1 = "pre_install"
        L35:
            java.lang.String r0 = "livesdk_gamepad_btn_click"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            LIZ(r2, r4)
            if (r4 == 0) goto L44
            X.0z5M r3 = X.C1882380z5I.LIZLLL(r4)
        L44:
            java.util.Map r0 = X.C1882380z5I.LIZ(r3)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r2.LJJIIZI(r0)
            java.lang.String r0 = "btn_name"
            r2.LJJII(r1, r0)
            if (r6 == 0) goto L63
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L67
            java.lang.String r1 = "1"
        L5e:
            java.lang.String r0 = "is_shop_support"
            r2.LJJII(r1, r0)
        L63:
            r2.LIZ()
            return
        L67:
            java.lang.String r1 = "0"
            goto L5e
        L6a:
            if (r0 == 0) goto L6f
            java.lang.String r1 = "registered"
            goto L35
        L6f:
            java.lang.String r1 = "pre_register"
            goto L35
        L72:
            r1 = r3
            goto L26
        L74:
            r1 = r3
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1880070z1Z.LJI(X.0z3c, boolean, java.lang.Boolean):void");
    }

    public static void LJIIJ(InterfaceC1881340z3c interfaceC1881340z3c, int i, String str) {
        String str2;
        String str3;
        C1883060z6O c1883060z6OLJIIJJI;
        C1881800z4M c1881800z4MLJIIIZ;
        C1883060z6O c1883060z6OLJIIJJI2;
        C1881800z4M c1881800z4MLJIIL;
        if (interfaceC1881340z3c == null || (c1883060z6OLJIIJJI2 = interfaceC1881340z3c.LJIIJJI()) == null || (c1881800z4MLJIIL = c1883060z6OLJIIJJI2.LJIIL(i)) == null || (str2 = c1881800z4MLJIIL.LIZIZ) == null) {
            str2 = "";
        }
        C1882420z5M c1882420z5MLIZLLL = null;
        if (interfaceC1881340z3c != null && (c1883060z6OLJIIJJI = interfaceC1881340z3c.LJIIJJI()) != null && (c1881800z4MLJIIIZ = c1883060z6OLJIIJJI.LJIIIZ()) != null) {
            str3 = c1881800z4MLJIIIZ.LIZIZ;
        } else {
            str3 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str3, str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_tab_click");
        LIZ(c474500IjALIZ, interfaceC1881340z3c);
        c474500IjALIZ.LJJII(Integer.valueOf(zLJFF ? 1 : 0), "is_default");
        c474500IjALIZ.LJJII(str2, "tab_name");
        c474500IjALIZ.LJJII(str, "tab_enter_method");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(InterfaceC1881340z3c interfaceC1881340z3c, String str, Boolean bool) {
        C1882420z5M c1882420z5MLIZLLL;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_intro_module_click");
        c474500IjALIZ.LJJII(str, "button_name");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_shop_support");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJII(InterfaceC1881340z3c interfaceC1881340z3c, String str, String str2, Map map) {
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_pre_register_click");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        c474500IjALIZ.LJJII(str2, "btn_name");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(InterfaceC1881340z3c interfaceC1881340z3c, Integer num, String str, String str2, boolean z, String str3) {
        Object obj;
        C1882420z5M c1882420z5MLIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
        LIZ(c474500IjALIZ, interfaceC1881340z3c);
        c474500IjALIZ.LJJII("download", "btn_name");
        c474500IjALIZ.LJJII(str, "host_id");
        String str4 = "1";
        if (num != null && num.intValue() == 1) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_grey");
        c474500IjALIZ.LJJII(str2, "game_task_id");
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str4, "is_success");
        if (interfaceC1881340z3c != null) {
            c1882420z5MLIZLLL = C1882380z5I.LIZLLL(interfaceC1881340z3c);
        } else {
            c1882420z5MLIZLLL = null;
        }
        c474500IjALIZ.LJJIIZI(C476770Imp.LJFF(C1882380z5I.LIZ(c1882420z5MLIZLLL)));
        if (str3 != null && str3.length() != 0) {
            try {
                c474500IjALIZ.LJJIIJZLJL(new JSONObject(str3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c474500IjALIZ.LIZ();
    }
}
