package X;

import X.InterfaceC1112050f2p;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.publicscreen.impl.api.PublicScreenApi;
import com.bytedance.android.live.publicscreen.impl.api.model.CommentTranslationResult;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0Ts4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760300Ts4<T extends InterfaceC1112050f2p> {
    public static void LIZJ(DataChannel dataChannel, String str) {
        if (dataChannel.gg0(C753280Tgk.class) == Boolean.FALSE) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_long_press_comment_click");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII("au_u16_live_comment_privacy_panel", "current_panel_page");
            c474500IjALIZ.LJJII(str, "action");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LIZ(DataChannel dataChannel, C1109770ez9 c1109770ez9, PinMessageViewModel pinMessageViewModel, C1111350f1h c1111350f1h) {
        String str;
        String str2;
        if (dataChannel != null && c1111350f1h != null) {
            try {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pin_comment_icon_click");
                c474500IjALIZ.LJIJJLI(dataChannel);
                if (c1109770ez9.LJJ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str, "is_extended_comment_filed");
                c474500IjALIZ.LJJII(C0KYR.LIZIZ(c1109770ez9.LJII, dataChannel), "admin_type");
                if (c1111350f1h.LIZIZ.equals("click")) {
                    str2 = "click_msg";
                } else {
                    str2 = "long_press_msg";
                }
                c474500IjALIZ.LJJII(str2, "method");
                C1109600eys<? extends InterfaceC1112060f2q> c1109600eys = pinMessageViewModel.LLILZIL;
                if (c1109600eys != null) {
                    c474500IjALIZ.LJJII(Boolean.valueOf(c1109600eys.LIZ() instanceof C1110490f0J), "is_whisper");
                }
                c474500IjALIZ.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static Pair LIZLLL(InterfaceC1112060f2q interfaceC1112060f2q, PinMessageViewModel pinMessageViewModel, C1111930f2d c1111930f2d, Function1 function1) {
        boolean zHr1;
        C1109610eyt<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1109610eyt;
        C1109600eys<? extends InterfaceC1112060f2q> c1109600eys;
        int iIntValue = ((Integer) function1.invoke(interfaceC1112060f2q)).intValue();
        if (pinMessageViewModel != null && (((c1109610eyt = pinMessageViewModel.LLILZ) != null && c1109610eyt.LJIIJ == interfaceC1112060f2q) || ((c1109600eys = pinMessageViewModel.LLILZIL) != null && c1109600eys.LIZ() == interfaceC1112060f2q))) {
            return new Pair(Boolean.TRUE, Boolean.FALSE);
        }
        boolean z = false;
        if (iIntValue != -1) {
            zHr1 = ((InterfaceC1112050f2p) c1111930f2d.mView).hr1(iIntValue);
        } else {
            zHr1 = false;
        }
        if (iIntValue != -1) {
            z = true;
        }
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(zHr1));
    }

    public final void LIZIZ(final InterfaceC759280TqQ interfaceC759280TqQ, final AbstractC1110800f0o<? extends AbstractC1136060ffY> abstractC1110800f0o, final long j, C1111350f1h c1111350f1h, final C1109770ez9 c1109770ez9, DataChannel dataChannel, final PinMessageViewModel pinMessageViewModel, final C1111930f2d<T> c1111930f2d, final Function1<InterfaceC1112060f2q, Integer> function1) {
        Object obj;
        String str;
        String str2;
        String strLJZL;
        String strLJJLIIIJ;
        String strLJJLIIIJ2;
        if (c1109770ez9 != null && c1109770ez9.LJIIIZ != null) {
            String str3 = "anchor";
            if (interfaceC759280TqQ.LJLLL()) {
                interfaceC759280TqQ.LJJIIJZLJL(false);
                LIZLLL(interfaceC759280TqQ, pinMessageViewModel, c1111930f2d, function1);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_undo_translate_comment");
                c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
                if (!c1109770ez9.LJI) {
                    str3 = "user";
                }
                c474500IjALIZ.LJJII(str3, "user_type");
                c474500IjALIZ.LJJII("undo_translate", "click_icon");
                c474500IjALIZ.LJJII("comment", "click_position");
                c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
                c474500IjALIZ.LJJII(c1111350f1h.LIZIZ, "comment");
                c474500IjALIZ.LJJII(C0KYR.LIZIZ(c1109770ez9.LJII, dataChannel), "admin_type");
                c474500IjALIZ.LIZ();
            } else {
                String str4 = "click_msg";
                if (TextUtils.isEmpty(interfaceC759280TqQ.LJLJLLL())) {
                    if (!interfaceC759280TqQ.LJIILLIIL() && interfaceC759280TqQ.LJLLJ()) {
                        interfaceC759280TqQ.LJJLI(true);
                        function1.invoke(interfaceC759280TqQ);
                        StringBuilder sb = new StringBuilder();
                        String string = "";
                        if (!(abstractC1110800f0o instanceof C1110310f01)) {
                            strLJJLIIIJ = "";
                            strLJJLIIIJ2 = "";
                        } else {
                            List<User> list = ((ChatMessage) abstractC1110800f0o.LJIL).mentionUsers;
                            if (list == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS245S0000000_12.get$arr$(190), 30)) == null) {
                                strLJJLIIIJ = "";
                            }
                            List<User> list2 = ((ChatMessage) abstractC1110800f0o.LJIL).mentionUsers;
                            if (list2 == null || (strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS245S0000000_12.get$arr$(189), 30)) == null) {
                                strLJJLIIIJ2 = "";
                            }
                        }
                        if (abstractC1110800f0o instanceof AbstractC1110520f0M) {
                            List<EmoteWithIndex> listLLJZ = ((AbstractC1110520f0M) abstractC1110800f0o).LLJZ();
                            for (int i = 0; i < listLLJZ.size(); i++) {
                                if (ListProtector.get(listLLJZ, i) != null) {
                                    if (sb.length() != 0) {
                                        sb.append(",");
                                    }
                                    sb.append(((EmoteWithIndex) ListProtector.get(listLLJZ, i)).index);
                                }
                            }
                        }
                        C480460Ism.LIZ().getClass();
                        PublicScreenApi publicScreenApi = (PublicScreenApi) C480460Ism.LIZLLL(PublicScreenApi.class);
                        if (interfaceC759280TqQ.LJLLI() != null) {
                            string = interfaceC759280TqQ.LJLLI().toString();
                        }
                        ((C0J1N) publicScreenApi.translateComment(string, c1109770ez9.LJIL, c1109770ez9.LJIIZILJ, interfaceC759280TqQ.getMessageId(), abstractC1110800f0o.LJIL.baseMessage.roomMessageHeatLevel, strLJJLIIIJ, strLJJLIIIJ2, sb.toString()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LIZJ(C11RD.LJ(c1109770ez9.LIZIZ))).LIZ(new C09JN() { // from class: X.0Ts3
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                int i2;
                                boolean z;
                                String str5;
                                Object obj3;
                                String str6;
                                T t;
                                C760300Ts4 c760300Ts4 = this.LL;
                                InterfaceC759280TqQ interfaceC759280TqQ2 = interfaceC759280TqQ;
                                PinMessageViewModel pinMessageViewModel2 = pinMessageViewModel;
                                C1111930f2d c1111930f2d2 = c1111930f2d;
                                Function1 function12 = function1;
                                C1109770ez9 c1109770ez92 = c1109770ez9;
                                AbstractC1110800f0o abstractC1110800f0o2 = abstractC1110800f0o;
                                long j2 = j;
                                BaseResponse baseResponse = (BaseResponse) obj2;
                                c760300Ts4.getClass();
                                C1C7U.LIZ("PublicScreenDialogUtils@3af6.onClickTranslation$1L");
                                if (baseResponse != null && (t = baseResponse.data) != 0) {
                                    interfaceC759280TqQ2.LJJZZIII(((CommentTranslationResult) t).translationText);
                                    interfaceC759280TqQ2.LJLJI(((CommentTranslationResult) baseResponse.data).map);
                                    i2 = -1;
                                    z = true;
                                } else {
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844581));
                                    interfaceC759280TqQ2.LJJZZIII(null);
                                    i2 = C386801es.DEFAULT;
                                    z = false;
                                }
                                interfaceC759280TqQ2.LJJLI(false);
                                interfaceC759280TqQ2.LJJIIJZLJL(true);
                                Pair pairLIZLLL = C760300Ts4.LIZLLL(interfaceC759280TqQ2, pinMessageViewModel2, c1111930f2d2, function12);
                                if (!((Boolean) pairLIZLLL.getFirst()).booleanValue()) {
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844582));
                                    i2 = -1001;
                                    z = false;
                                }
                                if (c1109770ez92 != null) {
                                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_translate_comment");
                                    c474500IjALIZ2.LJIJJLI(c1109770ez92.LJIIIZ);
                                    if (c1109770ez92.LJI) {
                                        str5 = "anchor";
                                    } else {
                                        str5 = "user";
                                    }
                                    c474500IjALIZ2.LJJII(str5, "user_type");
                                    String str7 = "1";
                                    if (z) {
                                        obj3 = "1";
                                    } else {
                                        obj3 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    c474500IjALIZ2.LJJII(obj3, "translation_succeed");
                                    if (interfaceC759280TqQ2.LJJLIIIJJIZ().LIZIZ) {
                                        str6 = "pin_comment";
                                    } else {
                                        str6 = "normal";
                                    }
                                    c474500IjALIZ2.LJJII(str6, "translate_type");
                                    if (!((Boolean) pairLIZLLL.getSecond()).booleanValue()) {
                                        str7 = CardStruct.IStatusCode.DEFAULT;
                                    }
                                    c474500IjALIZ2.LJJII(str7, "is_top");
                                    c474500IjALIZ2.LJJII(Long.valueOf(abstractC1110800f0o2.LJIL.getMessageId()), "message_id");
                                    c474500IjALIZ2.LJJII(Long.valueOf(abstractC1110800f0o2.LJIJ.LIZ), "message_release_id");
                                    c474500IjALIZ2.LJJII(Long.valueOf(j2), "to_user_id");
                                    Activity activityLJIJ = C520010KaN.LJIJ(c1109770ez92.LIZ, false);
                                    if (activityLJIJ != null) {
                                        c474500IjALIZ2.LJJII(C500260Jjc.LJZL(Integer.valueOf(activityLJIJ.getRequestedOrientation())), "room_orientation");
                                    }
                                    if (!z) {
                                        c474500IjALIZ2.LJJII(Integer.valueOf(i2), "fail_type");
                                    }
                                    c474500IjALIZ2.LIZ();
                                }
                                C1C7U.LIZIZ("PublicScreenDialogUtils@3af6.onClickTranslation$1L");
                            }
                        }, new C09JN() { // from class: X.0Ts2
                            @Override // X.C09JN
                            public final void accept(Object obj2) {
                                int errorCode;
                                String strLJZL2;
                                String str5;
                                String str6;
                                InterfaceC759280TqQ interfaceC759280TqQ2 = interfaceC759280TqQ;
                                Function1 function12 = function1;
                                C1109770ez9 c1109770ez92 = c1109770ez9;
                                long j2 = j;
                                AbstractC1110800f0o abstractC1110800f0o2 = abstractC1110800f0o;
                                Throwable th = (Throwable) obj2;
                                C1C7U.LIZ("PublicScreenDialogUtils@3af6.onClickTranslation$2L");
                                interfaceC759280TqQ2.LJJLI(false);
                                interfaceC759280TqQ2.LJJIIJZLJL(false);
                                function12.invoke(interfaceC759280TqQ2);
                                String prompt = "";
                                if (th instanceof C501470JlZ) {
                                    C501470JlZ c501470JlZ = (C501470JlZ) th;
                                    if (!TextUtils.isEmpty(c501470JlZ.getPrompt())) {
                                        prompt = c501470JlZ.getPrompt();
                                        C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
                                    } else {
                                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844581));
                                    }
                                    errorCode = c501470JlZ.getErrorCode();
                                } else {
                                    C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131844581));
                                    errorCode = C386801es.DEFAULT;
                                }
                                if (c1109770ez92 != null) {
                                    Activity activityLJIJ = C520010KaN.LJIJ(c1109770ez92.LIZ, false);
                                    if (activityLJIJ != null) {
                                        strLJZL2 = C500260Jjc.LJZL(Integer.valueOf(activityLJIJ.getRequestedOrientation()));
                                    } else {
                                        strLJZL2 = "portrait";
                                    }
                                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_translate_comment");
                                    c474500IjALIZ2.LJIJJLI(c1109770ez92.LJIIIZ);
                                    if (c1109770ez92.LJI) {
                                        str5 = "anchor";
                                    } else {
                                        str5 = "user";
                                    }
                                    c474500IjALIZ2.LJJII(str5, "user_type");
                                    c474500IjALIZ2.LJJII(Long.valueOf(j2), "to_user_id");
                                    if (interfaceC759280TqQ2.LJJLIIIJJIZ().LIZIZ) {
                                        str6 = "pin_comment";
                                    } else {
                                        str6 = "normal";
                                    }
                                    c474500IjALIZ2.LJJII(str6, "translate_type");
                                    c474500IjALIZ2.LJJII(Integer.valueOf(errorCode), "fail_type");
                                    c474500IjALIZ2.LJJII(Long.valueOf(abstractC1110800f0o2.LJIL.getMessageId()), "message_id");
                                    c474500IjALIZ2.LJJII(Long.valueOf(abstractC1110800f0o2.LJIJ.LIZ), "message_release_id");
                                    c474500IjALIZ2.LJJII(prompt, "translation_failed_reason");
                                    c474500IjALIZ2.LJJII(CardStruct.IStatusCode.DEFAULT, "translation_succeed");
                                    c474500IjALIZ2.LJJII(strLJZL2, "room_orientation");
                                    c474500IjALIZ2.LIZ();
                                }
                                C1C7U.LIZIZ("PublicScreenDialogUtils@3af6.onClickTranslation$2L");
                            }
                        });
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_translate_comment_click");
                        c474500IjALIZ2.LJIJJLI(c1109770ez9.LJIIIZ);
                        if (!c1109770ez9.LJI) {
                            str3 = "user";
                        }
                        c474500IjALIZ2.LJJII(str3, "user_type");
                        c474500IjALIZ2.LJJII(Long.valueOf(j), "to_user_id");
                        if (!c1111350f1h.LIZIZ.equals("click")) {
                            str4 = "long_press_msg";
                        }
                        c474500IjALIZ2.LJJII(str4, "method");
                        c474500IjALIZ2.LJJII("comment", "click_position");
                        c474500IjALIZ2.LJJII(c1111350f1h.LIZIZ, "comment");
                        c474500IjALIZ2.LJJII(C0KYR.LIZIZ(c1109770ez9.LJII, dataChannel), "admin_type");
                        c474500IjALIZ2.LIZ();
                    }
                } else {
                    interfaceC759280TqQ.LJJIIJZLJL(true);
                    C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_translate_comment_click");
                    c474500IjALIZ3.LJIJJLI(c1109770ez9.LJIIIZ);
                    if (c1109770ez9.LJI) {
                        obj = "anchor";
                    } else {
                        obj = "user";
                    }
                    c474500IjALIZ3.LJJII(obj, "user_type");
                    c474500IjALIZ3.LJJII(Long.valueOf(j), "to_user_id");
                    if (!c1111350f1h.LIZIZ.equals("click")) {
                        str4 = "long_press_msg";
                    }
                    c474500IjALIZ3.LJJII(str4, "method");
                    c474500IjALIZ3.LJJII("comment", "click_position");
                    c474500IjALIZ3.LJJII(c1111350f1h.LIZIZ, "comment");
                    c474500IjALIZ3.LJJII(C0KYR.LIZIZ(c1109770ez9.LJII, dataChannel), "admin_type");
                    c474500IjALIZ3.LIZ();
                    Pair pairLIZLLL = LIZLLL(interfaceC759280TqQ, pinMessageViewModel, c1111930f2d, function1);
                    Activity activityLJIJ = C520010KaN.LJIJ(c1109770ez9.LIZ, false);
                    C474500IjA c474500IjALIZ4 = C0IJT.LIZ("livesdk_translate_comment");
                    c474500IjALIZ4.LJIJJLI(c1109770ez9.LJIIIZ);
                    if (!c1109770ez9.LJI) {
                        str3 = "user";
                    }
                    c474500IjALIZ4.LJJII(str3, "user_type");
                    if (interfaceC759280TqQ.LJJLIIIJJIZ().LIZIZ) {
                        str = "pin_comment";
                    } else {
                        str = "normal";
                    }
                    c474500IjALIZ4.LJJII(str, "translate_type");
                    if (((Boolean) pairLIZLLL.getSecond()).booleanValue()) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c474500IjALIZ4.LJJII(str2, "is_top");
                    c474500IjALIZ4.LJJII(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId()), "message_id");
                    c474500IjALIZ4.LJJII(Long.valueOf(abstractC1110800f0o.LJIJ.LIZ), "message_release_id");
                    c474500IjALIZ4.LJJII(Long.valueOf(j), "to_user_id");
                    if (activityLJIJ == null) {
                        strLJZL = "portrait";
                    } else {
                        strLJZL = C500260Jjc.LJZL(Integer.valueOf(activityLJIJ.getRequestedOrientation()));
                    }
                    c474500IjALIZ4.LJJII(strLJZL, "room_orientation");
                    c474500IjALIZ4.LIZ();
                }
            }
            LIZJ(dataChannel, "translate");
        }
    }
}
