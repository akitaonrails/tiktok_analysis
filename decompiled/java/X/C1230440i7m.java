package X;

import Y.ARunnableS23S1200000_19;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.feed.IMCommonFeedBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import com.ss.android.ugc.aweme.invitation.newdesign.fragment.GroupInvitationFragment;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS420S0200000_19;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0i7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230440i7m implements InterfaceC1230510i7t {
    public static AnonymousClass0956 LIZLLL;
    public static WeakReference<TuxSheet> LJFF;
    public static final C1230440i7m LIZJ = new C1230440i7m();
    public static final C900550ZUn LJ = new C900550ZUn();

    @Override // X.InterfaceC1230510i7t
    public final InterfaceC900570ZUp LJJIIZI() {
        throw null;
    }

    @Override // X.InterfaceC1230510i7t
    public final PriorityProtocol LJJII() {
        IMCommonFeedBridgeApi.LIZ.getClass();
        IMCommonFeedBridgeApi value = C913490ZsZ.LIZIZ.getValue();
        if (value != null) {
            return value.LIZIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1230510i7t
    public final GroupInvitePopupResponse LJIILJJIL(String str) {
        return (GroupInvitePopupResponse) ((LinkedHashMap) C1230160i7K.LIZIZ).get(str);
    }

    public static void LJI(ViewGroup viewGroup, WeakReference weakReference) {
        ViewGroup viewGroup2;
        Function0 function0 = (Function0) weakReference.get();
        if (function0 != null) {
            function0.invoke();
            return;
        }
        C1390410mHn c1390410mHn = (C1390410mHn) viewGroup.findViewById(R.id.k81);
        if (c1390410mHn == null) {
            return;
        }
        c1390410mHn.LIZLLL();
        ViewParent parent = c1390410mHn.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup2 = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(c1390410mHn, viewGroup2);
    }

    @Override // X.InterfaceC1230510i7t
    public final Object LJIILL(GroupInvitePopupRequest groupInvitePopupRequest, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn) {
        return C1230160i7K.LIZ.LIZ(groupInvitePopupRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230510i7t
    public final void LJJI(Context context, C1230810i8N c1230810i8N) {
        long jLongValue;
        Long lLJIILIIL;
        EnterChatParams enterChatParams = new EnterChatParams(context, 3, c1230810i8N.LIZ);
        enterChatParams.setEnterMethodForMob("click_join_group_button");
        enterChatParams.setEnterFromForMob("homepage_hot");
        enterChatParams.setGroupId(c1230810i8N.LIZJ);
        enterChatParams.setQuickChat(true);
        enterChatParams.setInviteeGroupStatus(1);
        String str = c1230810i8N.LIZ;
        String str2 = c1230810i8N.LIZIZ;
        if (str != null) {
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            interfaceC876950YajLIZIZ.LJJI(str, jLongValue, AbstractC1711506n3.LIZIZ, new C1769306wN(enterChatParams, 0));
        }
        IMWebSocketBridgeApi.LIZ.getClass();
        IMWebSocketBridgeApi iMWebSocketBridgeApiLIZ = C892310YzV.LIZ();
        if (iMWebSocketBridgeApiLIZ != null) {
            iMWebSocketBridgeApiLIZ.LIZ();
        }
    }

    @Override // X.InterfaceC1230510i7t
    public final Object LJJIJ(GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn) {
        return C1230140i7I.LIZ.LJI(groupJoinRequestV2, interfaceC1364105Vn);
    }

    public static void LJ(Context context, C1229500i6G c1229500i6G, String str) {
        C1481605r4.LIZIZ(new ARunnableS23S1200000_19(context, c1229500i6G, str, 0));
    }

    public static void LJII(ViewGroup viewGroup, String str, InterfaceC1230230i7R interfaceC1230230i7R) {
        ViewGroup viewGroup2;
        TuxSheet tuxSheet;
        Dialog dialog;
        WeakReference<TuxSheet> weakReference;
        TuxSheet tuxSheet2;
        try {
            WeakReference<TuxSheet> weakReference2 = LJFF;
            if (weakReference2 != null && (tuxSheet = weakReference2.get()) != null && (dialog = tuxSheet.getDialog()) != null && dialog.isShowing() && (weakReference = LJFF) != null && (tuxSheet2 = weakReference.get()) != null) {
                tuxSheet2.dismiss();
            }
            LJFF = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
        }
        String string = viewGroup.getContext().getString(2131835079);
        C1390410mHn c1390410mHn = (C1390410mHn) viewGroup.findViewById(R.id.k81);
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
            ViewParent parent = c1390410mHn.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1390410mHn, viewGroup2);
            }
        }
        C1390410mHn c1390410mHn2 = new C1390410mHn(viewGroup.getContext(), null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)));
        layoutParams.gravity = 17;
        C786410Ut5.V6(c1390410mHn2, layoutParams);
        c1390410mHn2.LIZJ();
        c1390410mHn2.setId(R.id.k81);
        viewGroup.addView(c1390410mHn2);
        AwS420S0200000_19 awS420S0200000_19 = new AwS420S0200000_19(viewGroup, c1390410mHn2, 3);
        c1390410mHn2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1265900j2y(c1390410mHn2, 0));
        WeakReference weakReference3 = new WeakReference(awS420S0200000_19);
        AnonymousClass0956 anonymousClass0956 = LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1230190i7N(weakReference3, viewGroup, interfaceC1230230i7R, string, str, null), 3);
    }

    @Override // X.InterfaceC1230510i7t
    public final void LIZIZ(final C19EG c19eg, final String str, final String str2) {
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        ViewGroup viewGroup;
        Uri uri;
        if ((c19eg.getWindow().getDecorView().getRootView() instanceof ViewGroup) && str != null && str.length() != 0) {
            InterfaceC1230510i7t.LIZ.getClass();
            if (!C1230680i8A.LIZIZ.remove(str)) {
                return;
            }
            try {
                uri = UriProtector.parse(str2);
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "utm_source");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "params_url");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2), "utm_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "empty_source";
                }
            }
            View decorView = c19eg.getWindow().getDecorView();
            if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                C1229320i5y.LJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "notification_page", "open_app_pop_up");
                LJII(viewGroup, str, new InterfaceC1230230i7R() { // from class: X.0i7n
                    @Override // X.InterfaceC1230230i7R
                    public final void onFail() {
                    }

                    @Override // X.InterfaceC1230230i7R
                    public final void LIZ(GroupInvitePopupResponse groupInvitePopupResponse) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                        C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                        String str3 = str2;
                        c1230440i7m.getClass();
                        try {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str3), "external_share_group_aweme_id");
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                        }
                        C1230090i7D c1230090i7DLIZLLL = C1229780i6i.LIZLLL(groupInvitePopupResponse.popupMeta);
                        EnumC1230500i7s enumC1230500i7s = EnumC1230500i7s.JOIN_NORMAL_URL_OR_QR_CODE;
                        C900560ZUo c900560ZUo = new C900560ZUo("share_group_via", "invite_link_page", "share_link");
                        C1230570i7z c1230570i7z = new C1230570i7z(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "notification_page", "open_app_pop_up", c1230090i7DLIZLLL, new C1229500i6G(0, 0, 116, "notification_page", "open_app_pop_up", (String) null, true), enumC1230500i7s, c900560ZUo, false, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, null);
                        C1230440i7m c1230440i7m2 = C1230440i7m.LIZJ;
                        C1230330i7b c1230330i7b = GroupInvitationFragment.LLJJ;
                        C19EG c19eg2 = c19eg;
                        c1230330i7b.getClass();
                        WeakReference<TuxSheet> weakReferenceLIZ = C1230330i7b.LIZ(c19eg2, c1230570i7z);
                        c1230440i7m2.getClass();
                        C1230440i7m.LJFF = weakReferenceLIZ;
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1230510i7t
    public final void LIZLLL(final C19EG c19eg, final String str, final String str2, final String str3) {
        ViewGroup viewGroup;
        String str4;
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpiForReal(IQuickChatRoomSheetFactory.class);
            if (iQuickChatRoomSheetFactory != null) {
                iQuickChatRoomSheetFactory.LIZ(c19eg.getSupportFragmentManager());
            }
            Map<String, C1230610i83> map = C1230620i84.LIZ;
            C1230610i83 c1230610i83 = new C1230610i83(str3, str);
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("invite_id", str);
            c830490Whz.put("aid", str2);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("external_aweme_and_group_share_reflow_begin", c830490Whz);
            C1230620i84.LIZ.put(str2, c1230610i83);
            View decorView = c19eg.getWindow().getDecorView();
            if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                if (str3 == null) {
                    str4 = "empty_source";
                } else {
                    str4 = str3;
                }
                C1229320i5y.LJ(str4, "homepage_hot", "open_app_pop_up");
                LJII(viewGroup, str, new InterfaceC1230230i7R() { // from class: X.0i7p
                    @Override // X.InterfaceC1230230i7R
                    public final void onFail() {
                    }

                    @Override // X.InterfaceC1230230i7R
                    public final void LIZ(GroupInvitePopupResponse groupInvitePopupResponse) {
                        String str5 = str3;
                        if (str5 == null) {
                            str5 = "empty_source";
                        }
                        C1230090i7D c1230090i7DLIZLLL = C1229780i6i.LIZLLL(groupInvitePopupResponse.popupMeta);
                        EnumC1230500i7s enumC1230500i7s = EnumC1230500i7s.JOIN_FYP_URL;
                        C900560ZUo c900560ZUo = new C900560ZUo("share_group_via", "external_video_share", "share_link");
                        C1229500i6G c1229500i6G = new C1229500i6G(0, 0, 116, "homepage_hot", "open_app_pop_up", (String) null, true);
                        final String str6 = str2;
                        C1230570i7z c1230570i7z = new C1230570i7z(str, str5, "homepage_hot", "open_app_pop_up", c1230090i7DLIZLLL, c1229500i6G, enumC1230500i7s, c900560ZUo, true, str6, new InterfaceC1229620i6S() { // from class: X.0i86
                            @Override // X.InterfaceC1229620i6S
                            public final void LIZ(C0YMW c0ymw) {
                            }

                            @Override // X.InterfaceC1229620i6S
                            public final void LIZJ(EnumC1229960i70 enumC1229960i70, PopupDisplayMeta popupDisplayMeta) {
                            }

                            @Override // X.InterfaceC1229620i6S
                            public final void LIZIZ(String str7) {
                                EventBus.LIZLLL().LJIILL(new C1230830i8P(str6));
                            }
                        });
                        C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                        C1230330i7b c1230330i7b = GroupInvitationFragment.LLJJ;
                        C19EG c19eg2 = c19eg;
                        c1230330i7b.getClass();
                        WeakReference<TuxSheet> weakReferenceLIZ = C1230330i7b.LIZ(c19eg2, c1230570i7z);
                        c1230440i7m.getClass();
                        C1230440i7m.LJFF = weakReferenceLIZ;
                    }
                });
            }
        }
    }

    public static void LJFF(ViewGroup viewGroup, C0Y8T c0y8t, GroupInvitePopupResponse groupInvitePopupResponse, InterfaceC1230230i7R interfaceC1230230i7R, WeakReference weakReference) {
        Integer numValueOf;
        LJI(viewGroup, weakReference);
        if (c0y8t != null && c0y8t.getInboxType() != 4) {
            interfaceC1230230i7R.LIZ(groupInvitePopupResponse);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fan group detected, inboxType: ");
        if (c0y8t != null) {
            numValueOf = Integer.valueOf(c0y8t.getInboxType());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C0I0B.LJFF.LIZJ();
        interfaceC1230230i7R.onFail();
    }

    @Override // X.InterfaceC1230510i7t
    public final void LJIJ(final Activity activity, final String str, final long j, GroupInfo groupInfo, String str2, String str3, final String str4, final C900560ZUo c900560ZUo) {
        ViewGroup viewGroup;
        if ((activity instanceof C19EG) && (activity.getWindow().getDecorView().getRootView() instanceof ViewGroup) && str != null && str.length() != 0) {
            View decorView = activity.getWindow().getDecorView();
            if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
                C1229320i5y.LJ("share_group_card", "chat", "invite_card");
                LJII(viewGroup, str, new InterfaceC1230230i7R() { // from class: X.0i7r
                    @Override // X.InterfaceC1230230i7R
                    public final void onFail() {
                    }

                    @Override // X.InterfaceC1230230i7R
                    public final void LIZ(GroupInvitePopupResponse groupInvitePopupResponse) {
                        C1230090i7D c1230090i7DLIZLLL = C1229780i6i.LIZLLL(groupInvitePopupResponse.popupMeta);
                        EnumC1230500i7s enumC1230500i7s = EnumC1230500i7s.JOIN_CLICK_INVITE_CARD;
                        C1230560i7y c1230560i7y = new C1230560i7y(str, "share_group_card", "chat", "invite_card", c1230090i7DLIZLLL, new C1229500i6G(0, 0, 116, "chat", "invite_card", (String) null, true), enumC1230500i7s, c900560ZUo, j, str4, null);
                        C1230440i7m c1230440i7m = C1230440i7m.LIZJ;
                        C1230330i7b c1230330i7b = GroupInvitationFragment.LLJJ;
                        Activity activity2 = activity;
                        c1230330i7b.getClass();
                        WeakReference<TuxSheet> weakReferenceLIZ = C1230330i7b.LIZ(activity2, c1230560i7y);
                        c1230440i7m.getClass();
                        C1230440i7m.LJFF = weakReferenceLIZ;
                    }
                });
            }
        }
    }
}
