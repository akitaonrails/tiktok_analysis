package X;

import Y.ARunnableS127S0100000_27;
import Y.AcS498S0100000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.livesetting.wallet.RomaWebRedirectForCustomErrorSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0x0x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802810x0x implements InterfaceC1797320ws6 {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC1802860x12 LIZIZ(final int i, final C1802410x0J c1802410x0J) {
        switch (i) {
            case 4005189:
            case 4005272:
                return new InterfaceC1802860x12() { // from class: X.0x0e
                    public final /* synthetic */ String LIZIZ = "other";
                    public final /* synthetic */ String LIZJ = "risk";

                    @Override // X.InterfaceC1802860x12
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void LIZ() {
                        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                        C1802410x0J c1802410x0J2 = c1802410x0J;
                        int i2 = c1802410x0J2.LJFF;
                        String str = this.LIZIZ;
                        String str2 = this.LIZJ;
                        String str3 = c1802410x0J2.LJ;
                        int i3 = c1802410x0J2.LIZIZ;
                        int i4 = c1802410x0J2.LIZJ;
                        c1803800x2Y.getClass();
                        C1803800x2Y.LJIILLIIL(i2, i3, i4, str, str2, str3);
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void onShow() {
                        String message;
                        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                        C1802410x0J c1802410x0J2 = c1802410x0J;
                        int i2 = c1802410x0J2.LJFF;
                        String str = this.LIZIZ;
                        String str2 = this.LIZJ;
                        String str3 = c1802410x0J2.LJ;
                        int i3 = c1802410x0J2.LIZIZ;
                        int i4 = c1802410x0J2.LIZJ;
                        int i5 = c1802410x0J2.LJIIIZ;
                        Exception exc = c1802410x0J2.LIZLLL;
                        if (exc == null || (message = exc.getMessage()) == null) {
                            message = "";
                        }
                        c1803800x2Y.getClass();
                        C1803800x2Y.LJIJI(str, i2, i3, str2, str3, message, "unknown", null, i4, i5);
                    }
                };
            case 4005284:
            case 4005285:
                return new InterfaceC1802860x12() { // from class: X.0g3u
                    @Override // X.InterfaceC1802860x12
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void LIZ() {
                        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                        C1802410x0J c1802410x0J2 = c1802410x0J;
                        c1803800x2Y.getClass();
                        C1803800x2Y.LJJ("contact_us", c1802410x0J2);
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void LIZIZ() {
                        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                        C1802410x0J c1802410x0J2 = c1802410x0J;
                        c1803800x2Y.getClass();
                        C1803800x2Y.LJJ("cancel", c1802410x0J2);
                    }

                    @Override // X.InterfaceC1802860x12
                    public final void onShow() {
                        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                        C1802410x0J c1802410x0J2 = c1802410x0J;
                        c1803800x2Y.getClass();
                        String strLJIIJJI = C1803800x2Y.LJIIJJI(c1802410x0J2);
                        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                        boolean z = room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_ban_popup_show");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_anchor");
                        c474500IjALIZ.LJJII(strLJIIJJI, "popup_entrance");
                        c474500IjALIZ.LJJII("gpppa", "ban_reason");
                        c474500IjALIZ.LIZ();
                    }
                };
            default:
                if (C1802460x0O.LIZ(i)) {
                    return new InterfaceC1802860x12() { // from class: X.0x0L
                        @Override // X.InterfaceC1802860x12
                        public final void LIZ() {
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            int i2 = i;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            c1803800x2Y.getClass();
                            C1803800x2Y.LJJIIJZLJL(i2, c1802410x0J2, true, false);
                        }

                        @Override // X.InterfaceC1802860x12
                        public final void LIZIZ() {
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            int i2 = i;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            c1803800x2Y.getClass();
                            C1803800x2Y.LJJIIJZLJL(i2, c1802410x0J2, false, false);
                        }

                        @Override // X.InterfaceC1802860x12
                        public final void LIZJ() {
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            int i2 = i;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            c1803800x2Y.getClass();
                            C1803800x2Y.LJJIIJZLJL(i2, c1802410x0J2, false, true);
                        }

                        @Override // X.InterfaceC1802860x12
                        public final void onShow() {
                            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                            int i2 = i;
                            C1802410x0J c1802410x0J2 = c1802410x0J;
                            c1803800x2Y.getClass();
                            C1803800x2Y.LJJIIZ(i2, c1802410x0J2);
                        }
                    };
                }
                return null;
        }
    }

    @Override // X.InterfaceC1797320ws6
    public final InterfaceC1797280ws2 LIZ(Context context, InterfaceC1151090g3n interfaceC1151090g3n, String str) {
        String str2 = "";
        InterfaceC1802860x12 interfaceC1802860x12LIZIZ = null;
        boolean z = false;
        if (interfaceC1151090g3n instanceof C1797250wrz) {
            C1797250wrz c1797250wrz = (C1797250wrz) interfaceC1151090g3n;
            if (context == null) {
                return C1802890x15.LIZ();
            }
            C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
            if (c1802410x0J != null && c1802410x0J.LIZ == -1) {
                return new C1802880x14(true, true);
            }
            Exception exc = c1797250wrz.LIZJ;
            if (!(exc instanceof C501470JlZ)) {
                return C1802890x15.LIZ();
            }
            CustomErrorExtra customErrorExtra = CustomErrorExtra.getCustomErrorExtra(exc);
            C501470JlZ c501470JlZ = (C501470JlZ) c1797250wrz.LIZJ;
            if (c501470JlZ.getExtra().length() != 0 && customErrorExtra != null) {
                int errorCode = c501470JlZ.getErrorCode();
                C1802410x0J c1802410x0J2 = c1797250wrz.LJIIIIZZ;
                if (c1802410x0J2 != null) {
                    interfaceC1802860x12LIZIZ = LIZIZ(errorCode, c1802410x0J2);
                }
                String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, c1797250wrz.LJII);
                if (json != null) {
                    str2 = json;
                }
                return LIZJ(context, customErrorExtra, interfaceC1802860x12LIZIZ, c1797250wrz.LJFF, c1797250wrz.LJ, c1797250wrz.LJIIIIZZ, str, str2);
            }
            return C1802890x15.LIZ();
        }
        if (interfaceC1151090g3n instanceof C1151120g3q) {
            C1151120g3q c1151120g3q = (C1151120g3q) interfaceC1151090g3n;
            if (context == null) {
                return C1802890x15.LIZ();
            }
            C1802410x0J c1802410x0J3 = c1151120g3q.LJFF;
            if (c1802410x0J3 != null && c1802410x0J3.LIZ == -1) {
                return new C1802880x14(true, true);
            }
            Exception exc2 = c1151120g3q.LIZIZ;
            if (!(exc2 instanceof C501470JlZ)) {
                return C1802890x15.LIZ();
            }
            CustomErrorExtra customErrorExtra2 = CustomErrorExtra.getCustomErrorExtra(exc2);
            if (((C501470JlZ) c1151120g3q.LIZIZ).getExtra().length() == 0) {
                z = true;
            }
            boolean z2 = !z;
            C501520Jle c501520Jle = (C501520Jle) c1151120g3q.LIZIZ;
            if (z2 && customErrorExtra2 != null) {
                int errorCode2 = c501520Jle.getErrorCode();
                C1802410x0J c1802410x0J4 = c1151120g3q.LJFF;
                if (c1802410x0J4 != null) {
                    interfaceC1802860x12LIZIZ = LIZIZ(errorCode2, c1802410x0J4);
                }
                String json2 = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, c1151120g3q.LJ);
                if (json2 != null) {
                    str2 = json2;
                }
                return LIZJ(context, customErrorExtra2, interfaceC1802860x12LIZIZ, c1151120g3q.LIZLLL, c1151120g3q.LIZJ, c1151120g3q.LJFF, str, str2);
            }
            return C1802890x15.LIZ();
        }
        return C1802640x0g.LIZ();
    }

    public static C1802880x14 LIZJ(Context context, CustomErrorExtra customErrorExtra, InterfaceC1802860x12 interfaceC1802860x12, Runnable runnable, Runnable runnable2, C1802410x0J c1802410x0J, String str, String str2) {
        Exception exc;
        int errorCode;
        String str3;
        String str4;
        int errorCode2;
        C08HV c08hv;
        Map<String, String> map;
        Exception exc2;
        int errorCode3;
        boolean z;
        String str5;
        boolean z2;
        InterfaceC467740IVw<C0IR5> interfaceC467740IVw;
        Map<String, String> map2;
        C501520Jle c501520Jle;
        if (c1802410x0J != null) {
            exc = c1802410x0J.LIZLLL;
        } else {
            exc = null;
        }
        if ((exc instanceof C501470JlZ) && (c501520Jle = (C501520Jle) exc) != null) {
            errorCode = c501520Jle.getErrorCode();
        } else {
            errorCode = -1;
        }
        String str6 = "";
        if (RomaWebRedirectForCustomErrorSetting.INSTANCE.shouldRedirectToRoma(String.valueOf(errorCode))) {
            C1802840x10 c1802840x10 = new C1802840x10(context, customErrorExtra, c1802410x0J, str2);
            C474540IjE c474540IjE = new C474540IjE();
            c474540IjE.LIZ.LIZJ("customError", C1516000pYM.LIZJ(customErrorExtra));
            if (c1802410x0J != null) {
                exc2 = c1802410x0J.LIZLLL;
            } else {
                exc2 = null;
            }
            if (exc2 instanceof C501470JlZ) {
                errorCode3 = ((C501520Jle) c1802410x0J.LIZLLL).getErrorCode();
                Map<String, CustomErrorExtra.PopContentReplace> contentReplace = customErrorExtra.getContentReplace();
                if (contentReplace != null) {
                    c474540IjE.LIZ.LIZJ("additionalContentReplace", C1516000pYM.LIZJ(contentReplace));
                }
            } else {
                errorCode3 = -1;
            }
            c474540IjE.LIZIZ.put("error_code", Integer.valueOf(errorCode3));
            c474540IjE.LIZIZ.put("fail_from", "create_order");
            c474540IjE.LIZIZ.put("fail_reason", "penalty");
            C08HV c08hv2 = customErrorExtra.extraMap;
            if (c08hv2 != null && (map2 = c08hv2.LIZIZ) != null) {
                for (Map.Entry entry : ((HashMap) map2).entrySet()) {
                    c474540IjE.LIZIZ.put((String) entry.getKey(), entry.getValue());
                }
            }
            if (c1802410x0J != null) {
                String strLIZ = C1802850x11.LIZ(c1802410x0J);
                c474540IjE.LIZIZ.put("entry_type", strLIZ);
                if (Intrinsics.LJFF(strLIZ, "send_gift")) {
                    c474540IjE.LIZIZ.put("gift_enter_from", C1123580fLQ.LIZ(c1802410x0J.LJII.get("gift_enter_from")));
                }
                C1803800x2Y.LIZ.getClass();
                c474540IjE.LIZIZ.put("hit_entry", C1803800x2Y.LJIIJJI(c1802410x0J));
            }
            w.LIZ.getClass();
            c474540IjE.LIZIZ.put("anchor_id", Long.valueOf(w.LJ()));
            c474540IjE.LIZIZ.put("room_id", Long.valueOf(w.LJIJJ()));
            c474540IjE.LIZIZ.put("enter_from_merge", w.LJIIIZ());
            c474540IjE.LIZIZ.put("enter_method", w.LJIIL());
            c474540IjE.LIZIZ.put("action_type", w.LIZLLL());
            c474540IjE.LIZIZ.put("request_id", w.LJIJI());
            c474540IjE.LIZIZ.put("video_id", w.LJJII());
            Object objGg0 = DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
            if (objGg0 != null && (interfaceC467740IVw = c474540IjE.LIZJ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                interfaceC467740IVw.LIZ(objGg0, "", linkedHashMap);
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    c474540IjE.LIZIZ.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            C1802410x0J c1802410x0J2 = c1802840x10.LIZIZ;
            if (c1802410x0J2 != null) {
                z = c1802410x0J2.LJIILIIL;
            } else {
                z = false;
            }
            String str7 = c1802840x10.LIZJ;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (z) {
                str5 = "chargeForLive";
            } else {
                str5 = "exchangeCoinsForLive";
            }
            linkedHashMap2.put("name", str5);
            linkedHashMap2.put("params", str7);
            c474540IjE.LIZ.LIZJ("jsbCallback", C1516000pYM.LIZJ(linkedHashMap2));
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("click", "livesdk_recharge_fail_hint_click");
            linkedHashMap3.put("show", "livesdk_recharge_fail_hint_show");
            c474540IjE.LIZ.LIZJ("actionLogEvent", C1516000pYM.LIZJ(linkedHashMap3));
            Context context2 = c1802840x10.LIZ;
            c474540IjE.LIZ.LIZJ("roma_group_key", "roma_schema_group_one_wallet");
            c474540IjE.LIZ.LIZJ("roma_page_key", "roma_schema_page_custom_error_popup");
            c474540IjE.LIZ.LIZJ("trackParams", C1516000pYM.LIZJ(c474540IjE.LIZIZ));
            SmartRouter.buildRoute(context2, c474540IjE.LIZ.LIZLLL()).open();
            if (customErrorExtra.getPromptType() == CustomErrorExtra.PROMPT_TYPE_TOAST) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new C1802880x14(true, z2);
        }
        int promptType = customErrorExtra.getPromptType();
        if (promptType == CustomErrorExtra.PROMPT_TYPE_TOAST) {
            C1802830x0z c1802830x0z = new C1802830x0z(customErrorExtra, interfaceC1802860x12, c1802410x0J, str);
            if (c1802830x0z.LIZ != null) {
                C786410Ut5.LJJZZIII(C820670WHh.LIZ, new ARunnableS127S0100000_27(c1802830x0z, 43));
                return new C1802880x14(true, true);
            }
        } else if (promptType == CustomErrorExtra.PROMPT_TYPE_DIALOG) {
            C1802820x0y c1802820x0y = new C1802820x0y(context, customErrorExtra, interfaceC1802860x12, c1802410x0J, str);
            if (!Intrinsics.LJFF(c1802820x0y.LJ, "") && (!Intrinsics.LJFF(c1802820x0y.LJI, "") || !Intrinsics.LJFF(c1802820x0y.LJFF, ""))) {
                c1802820x0y.LJIIJJI = runnable;
                c1802820x0y.LJIIL = runnable2;
                InterfaceC782330UmV interfaceC782330UmV = c1802820x0y.LJIILLIIL;
                if (interfaceC782330UmV == null) {
                    interfaceC782330UmV = null;
                }
                c1802820x0y.LIZJ = interfaceC782330UmV.LIZIZ(context, c1802820x0y.LJ, c1802820x0y.LJIIIIZZ, c1802820x0y);
                C782110Um9 c782110Um9 = new C782110Um9(context);
                AcS498S0100000_27 acS498S0100000_27 = new AcS498S0100000_27(c1802820x0y, 9);
                AcS498S0100000_27 acS498S0100000_272 = new AcS498S0100000_27(c1802820x0y, 10);
                c782110Um9.LJIJI = new DialogInterfaceOnCancelListenerC1864700ycm(c1802820x0y, 5);
                InterfaceC782330UmV interfaceC782330UmV2 = c1802820x0y.LJIILLIIL;
                if (interfaceC782330UmV2 == null) {
                    interfaceC782330UmV2 = null;
                }
                C782320UmU icon = interfaceC782330UmV2.getIcon();
                if (icon != null) {
                    C753530Th9 c753530Th9 = icon.LIZ;
                    c782110Um9.LIZIZ();
                    c753530Th9.LIZJ = 1;
                    c782110Um9.LJFF = c753530Th9;
                    c782110Um9.LJIIIZ = (int) C497740JfY.LIZIZ(67.0f);
                    c782110Um9.LJIIIIZZ = (int) C497740JfY.LIZIZ(158.0f);
                }
                c782110Um9.LJIILLIIL = false;
                c782110Um9.LIZJ = c1802820x0y.LIZLLL;
                SpannableStringBuilder spannableStringBuilder = c1802820x0y.LIZJ;
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = null;
                }
                c782110Um9.LJIIIZ(spannableStringBuilder);
                InterfaceC782330UmV interfaceC782330UmV3 = c1802820x0y.LJIILLIIL;
                if (interfaceC782330UmV3 == null) {
                    interfaceC782330UmV3 = null;
                }
                C773790UWz c773790UWzLIZ = interfaceC782330UmV3.LIZ(c1802820x0y.LJI, acS498S0100000_27, c1802820x0y.LJFF, acS498S0100000_272);
                if (c773790UWzLIZ != null) {
                    c782110Um9.LIZLLL(c773790UWzLIZ);
                } else {
                    c782110Um9.LJIIJJI(c1802820x0y.LJFF, acS498S0100000_272);
                    c782110Um9.LJIILJJIL(c1802820x0y.LJI, acS498S0100000_27);
                }
                C786410Ut5.E4(c782110Um9.LIZ());
                if (interfaceC1802860x12 != null) {
                    interfaceC1802860x12.onShow();
                }
                C1802410x0J c1802410x0J3 = c1802820x0y.LJIILIIL;
                if (c1802410x0J3 != null) {
                    C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
                    CustomErrorExtra customErrorExtra2 = c1802820x0y.LJIILJJIL;
                    String str8 = c1802820x0y.LJIILL;
                    c1803800x2Y.getClass();
                    String strLIZ2 = C1802850x11.LIZ(c1802410x0J3);
                    Exception exc3 = c1802410x0J3.LIZLLL;
                    if (exc3 instanceof C501470JlZ) {
                        errorCode2 = ((C501520Jle) exc3).getErrorCode();
                    } else {
                        errorCode2 = -1;
                    }
                    String strLIZ3 = C1123580fLQ.LIZ(c1802410x0J3.LJII.get("gift_enter_from"));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_wallet_limit_popup_show");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(C1803800x2Y.LJIIL(Integer.valueOf(c1802410x0J3.LJIIJJI)), "strategy_task_type");
                    c474500IjALIZ.LJJII(Integer.valueOf(errorCode2), "error_code");
                    c474500IjALIZ.LJJII(strLIZ2, "entry_type");
                    if (C500260Jjc.LJJIIZ(str8) && str8 != null) {
                        c474500IjALIZ.LJJII(str8, "panel_channel");
                        c474500IjALIZ.LJJII(String.valueOf(((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).getRechargeService().LIZJ()), "recharge_v3_version");
                    }
                    if (Intrinsics.LJFF(strLIZ2, "send_gift")) {
                        c474500IjALIZ.LJJII(strLIZ3, "gift_enter_from");
                    }
                    c474500IjALIZ.LJJII(C1803800x2Y.LJIIJJI(c1802410x0J3), "hit_entry");
                    if (customErrorExtra2 != null && (c08hv = customErrorExtra2.extraMap) != null && (map = c08hv.LIZIZ) != null) {
                        for (Map.Entry entry3 : ((HashMap) map).entrySet()) {
                            c474500IjALIZ.LJJII(entry3.getValue(), (String) entry3.getKey());
                        }
                    }
                    C1803800x2Y.LIZIZ(c474500IjALIZ);
                    c474500IjALIZ.LIZ();
                }
                return new C1802880x14(true, false);
            }
        } else if (promptType == CustomErrorExtra.PROMPT_TYPE_FE) {
            CustomErrorExtra.ExtraEntity extraEntity = customErrorExtra.getExtraEntity();
            if (extraEntity != null && (str3 = extraEntity.linkToJump) != null) {
                C1802870x13 c1802870x13 = new C1802870x13(str3);
                if (c1802410x0J != null) {
                    C1803800x2Y.LIZ.getClass();
                    if (c1802410x0J.LJIILIIL) {
                        str4 = "recharge";
                    } else if (c1802410x0J.LJIIJJI == 11) {
                        str4 = "send_gift";
                    } else {
                        str4 = "exchange";
                    }
                    c1802870x13.LIZ.LIZJ("entry_type", str4);
                    if (Intrinsics.LJFF(str4, "send_gift")) {
                        String str9 = c1802410x0J.LJII.get("gift_enter_from");
                        if (str9 != null) {
                            str6 = str9;
                        }
                        c1802870x13.LIZ.LIZJ("gift_enter_from", str6);
                    }
                    c1802870x13.LIZ.LIZJ("hit_entry", C1803800x2Y.LJIIJJI(c1802410x0J));
                    c1802870x13.LIZ.LIZJ("custom_error", customErrorExtra.getRawJson());
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c1802870x13.LIZ.LIZLLL());
            }
            return new C1802880x14(true, false);
        }
        return C1802890x15.LIZ();
    }
}
