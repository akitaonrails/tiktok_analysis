package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.PrivilegeCreatorRoomItemDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.settingpage.SubscriptionCommunityFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlyvideo.SubOnlyVideoListDialog;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.NewSubSpaceDetailSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.fragment.SubSpaceDetailDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.commonui.fragmentcontainer.SubContentFragmentSheetDialog;
import com.bytedance.android.livesdk.livesetting.level.LiveSuperFanUseNewSpaceDialogSetting;
import com.bytedance.android.livesdk.livesetting.level.SubPrivilegePageSchemaToSuperFanSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490100JJw extends C09AY implements Function0<List<? extends InterfaceC490020JJo>> {
    public C490100JJw() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC490020JJo> invoke() {
        List listLJIIJJI = C1697810uHb.LJIIJJI(new C0JK3() { // from class: X.0JK1
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/bindemail");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                C0JK6.LIZ(context, c2436109gd, map);
                return true;
            }
        }, new C0JK3() { // from class: X.0JKI
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/subscription_community");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                boolean zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_service_plus"), "1");
                C19EG c19egLIZ = C1124140fMK.LIZ(context);
                if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                    SubscriptionCommunityFragment subscriptionCommunityFragment = new SubscriptionCommunityFragment();
                    subscriptionCommunityFragment.LLLIIIIL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    subscriptionCommunityFragment.LLLIIIL = zLJFF;
                    subscriptionCommunityFragment.show(supportFragmentManager, "SubscriptionCommunityFragment");
                    return true;
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JKn
            public final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"/emote_poll_create", "/emote_poll_create_or_view"});

            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return C13LP.LJJJJ(uri.getPath(), this.LIZ);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static void LIZIZ(android.net.Uri r9, java.util.Map r10, boolean r11) {
                /*
                    Method dump skipped, instruction units count: 250
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C490270JKn.LIZIZ(android.net.Uri, java.util.Map, boolean):void");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String path = uri.getPath();
                if (path != null) {
                    int iHashCode = path.hashCode();
                    if (iHashCode != -121466650) {
                        if (iHashCode == 252448040 && path.equals("/emote_poll_create_or_view")) {
                            LIZIZ(uri, map, true);
                        }
                    } else if (path.equals("/emote_poll_create")) {
                        LIZIZ(uri, map, false);
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JKm
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/emote_poll_result");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_emote_poll_result", bundle);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                    return true;
                }
                C784440Upu.LIZ().LIZIZ(new C0JS1(EnumC492180JRw.SUB_EMOTE_POLL_RESULT_POPUP, EnumC492200JRy.OPEN, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle, null, null, null, 240));
                return true;
            }
        }, new C0JK3() { // from class: X.0JKG
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return Collections.singletonList(new C0JK4("sec_anchor_id", C0JKP.COMPULSORY));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_suggest_emote");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                int iIntValue;
                Integer numLJJLIIJ;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_sheet");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    iIntValue = numLJJLIIJ.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 1 && DataChannelGlobal.LLILZ.gg0(C930940aKi.class) != null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                    String str = "";
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "upload_user_type");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                    }
                    FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                    if (fragmentManagerLJIL != null) {
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        Fragment fragmentLJIIIIZZ = C494790Jan.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, iIntValue, new C0JKH(context), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, str);
                        if (fragmentLJIIIIZZ instanceof LiveDialogFragment) {
                            ((DialogFragment) fragmentLJIIIIZZ).show(fragmentManagerLJIL, "SuggestEmotePageFragment");
                        }
                    }
                    return true;
                }
                Bundle bundle = new Bundle();
                for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_suggest_emote", bundle);
                C786410Ut5.LJJJI("origin_uri", uri.toString(), bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JK3() { // from class: X.0JJt
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_only_live_popup");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                boolean z = false;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_super_fans");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        z = Boolean.parseBoolean(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                C494790Jan.LJFF(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z);
                return true;
            }
        }, new C0JK3() { // from class: X.0JK0
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_only_live");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                if (C0JK6.LIZ(context, c2436109gd, map)) {
                    return true;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_only_live", bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JK3() { // from class: X.0JM6
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return Collections.singletonList(new C0JK4("sec_anchor_id", C0JKP.COMPULSORY));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_space_detail");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_only_space_detail", bundle);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                } else {
                    C19EG c19egLIZ = C1124140fMK.LIZ(context);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        if (LiveSuperFanUseNewSpaceDialogSetting.INSTANCE.getValue()) {
                            NewSubSpaceDetailSheetDialogFragment.LLLFZ.getClass();
                            NewSubSpaceDetailSheetDialogFragment newSubSpaceDetailSheetDialogFragment = new NewSubSpaceDetailSheetDialogFragment();
                            newSubSpaceDetailSheetDialogFragment.LLLFFI = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                            newSubSpaceDetailSheetDialogFragment.setArguments(bundle);
                            C19322110iZ.LJFF(supportFragmentManager, newSubSpaceDetailSheetDialogFragment, "NewSubSpaceDetailSheetDialogFragment", null, 0);
                            return true;
                        }
                        SubSpaceDetailDialogFragment.LLIZLLLIL.getClass();
                        SubSpaceDetailDialogFragment subSpaceDetailDialogFragment = new SubSpaceDetailDialogFragment();
                        subSpaceDetailDialogFragment.LLIZ = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        subSpaceDetailDialogFragment.setArguments(bundle);
                        subSpaceDetailDialogFragment.show(supportFragmentManager, "SubSpaceDetailDialogFragment");
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JK2
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return Collections.singletonList(new C0JK4("sec_anchor_id", C0JKP.COMPULSORY));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_only_space");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                if (C0JK6.LIZ(context, c2436109gd, map)) {
                    return true;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_only_space", bundle);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                } else {
                    C19EG c19egLIZ = C1124140fMK.LIZ(context);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        C505720JsQ.LIZJ(bundle, supportFragmentManager, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JK5
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_only_videos");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                if (C0JK6.LIZ(context, c2436109gd, map)) {
                    return true;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                if (uri.getBooleanQueryParameter("is_full_screen", true)) {
                    C786410Ut5.LJJJI("fragment_type", "sub_only_video_list", bundle);
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                } else {
                    C19EG c19egLIZ = C1124140fMK.LIZ(context);
                    if (c19egLIZ != null && (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) != null) {
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                        }
                        SubOnlyVideoListDialog subOnlyVideoListDialog = new SubOnlyVideoListDialog();
                        subOnlyVideoListDialog.LL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        subOnlyVideoListDialog.setArguments(bundle);
                        subOnlyVideoListDialog.show(supportFragmentManager, "SubOnlyVideoListDialog");
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0Jxd
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                C0JKP c0jkp = C0JKP.COMPULSORY;
                return C1697810uHb.LJIIJJI(new C0JK4("sec_anchor_id", c0jkp), new C0JK4("package_id", c0jkp), new C0JK4("page_type", C0JKP.IMPORTANT));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_package_page");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                int i;
                Boolean boolValueOf;
                int iIntValue;
                Integer numLJJLIIJ;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_username");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "privilege_cache_timestamp");
                Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_previous_page_popup"), "1");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "allow_cache");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = CardStruct.IStatusCode.DEFAULT;
                }
                boolean zLJFF = Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, "1");
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sub_scene");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                        i = CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                    } else {
                        i = 0;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    i = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sub_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = "normal_sub";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "package_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_in_live_room");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 != null) {
                    boolValueOf = Boolean.valueOf(Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10, "1"));
                } else {
                    boolValueOf = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_sub_enter");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "subscribe_state");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "privilege_show_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "privilege_page");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = "";
                }
                boolean z = !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_back"), "false");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "backPage");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = "";
                }
                boolean zLJFF2 = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_native"), "1");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "open_benefit_page");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_param");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_log_pb");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 = "";
                }
                boolean z2 = Boolean.parseBoolean(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "use_default_package_id"));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "native_back_scheme");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "current_package_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23.length() == 0) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 = EnumC513390KBl.PACKAGE_PAGE.getPageName();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 = "";
                    }
                    linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_param");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 != null) {
                    linkedHashMap.putAll(C500260Jjc.LL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25));
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 != null && (numLJJLIIJ = C500260Jjc.LJJLIIJ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17)) != null) {
                    iIntValue = numLJJLIIJ.intValue();
                } else {
                    iIntValue = 0;
                }
                C0KCF c0kcf = new C0KCF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, zLJFF, i, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21, boolValueOf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15, z, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16, zLJFF2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20, iIntValue, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, 0, uri, 0L, 0L, z2, -1610611968, 13);
                FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
                if (fragmentManagerLJIL != null) {
                    if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23, EnumC513390KBl.PACKAGE_PAGE_V2.getPageName())) {
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
                        C0KBB.LIZLLL(fragmentManagerLJIL, c0kcf, linkedHashMap);
                    } else {
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
                        C0KBB.LIZJ(fragmentManagerLJIL, c0kcf, linkedHashMap);
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JPk
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C1697810uHb.LJIIJJI(new C0JK4("sec_anchor_id", C0JKP.COMPULSORY), new C0JK4("page_type", C0JKP.IMPORTANT), new C0JK4("is_anchor", C0JKP.OTHERS));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/privilege_page");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                Long lLJJLIL;
                Long lLJJLIL2;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "page_type");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (SubPrivilegePageSchemaToSuperFanSetting.INSTANCE.getValue()) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                    }
                    ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).i31(str, false);
                    return true;
                }
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "popup") && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "full_page")) {
                    Bundle bundle = new Bundle();
                    for (String str2 : UriProtector.getQueryParameterNames(uri)) {
                        C786410Ut5.LJJJI(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), bundle);
                    }
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                        }
                    }
                    C786410Ut5.LJJJI("original_url", uri.toString(), bundle);
                    C786410Ut5.LJJJI("fragment_type", "privilege_page", bundle);
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                    return true;
                }
                boolean zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_anchor"), "1");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "group_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "extra_log_pb");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "log_param");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = "";
                }
                UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "scenario");
                uri.getBooleanQueryParameter("use_new_style", false);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "package_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "liveSubOnlyLiveTier");
                long jLongValue2 = 0;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 != null && (lLJJLIL2 = C500260Jjc.LJJLIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10)) != null) {
                    jLongValue = lLJJLIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "liveSubOnlyLiveMonth");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 != null && (lLJJLIL = C500260Jjc.LJJLIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11)) != null) {
                    jLongValue2 = lLJJLIL.longValue();
                }
                C508400Jwk c508400Jwk = new C508400Jwk(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, jLongValue, jLongValue2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_dim"), "1"), uri, null, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, 1026);
                C494790Jan c494790JanW2 = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "demo_source");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12;
                }
                c494790JanW2.LIZIZ(context, zLJFF, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, str, c508400Jwk);
                return true;
            }
        }, new C0JK3() { // from class: X.0JK9
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                C0JKP c0jkp = C0JKP.OTHERS;
                return C1697810uHb.LJIIJJI(new C0JK4("anchor_id", c0jkp), new C0JK4("from_onboarding_completed", c0jkp), new C0JK4("open_sub_only_setting", c0jkp), new C0JK4("paypal_dialog", c0jkp));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/settings");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "subscribe", bundle);
                C786410Ut5.LJJJI("origin_uri", uri.toString(), bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JK3() { // from class: X.0JJv
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/spotlight");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "spotlight", bundle);
                C786410Ut5.LJJJI("origin_uri", uri.toString(), bundle);
                C786410Ut5.LJJJI("enter_from", "notification", bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C511750K5d(), new C0JK3() { // from class: X.0JJu
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_wave_emote");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_wave_emote", bundle);
                C786410Ut5.LJJJI("origin_uri", uri.toString(), bundle);
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                return true;
            }
        }, new C0JK3() { // from class: X.0JJp
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return Collections.singletonList(new C0JK4("sec_anchor_id", C0JKP.COMPULSORY));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/sub_space_activity_list");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                Bundle bundle = new Bundle();
                for (String str : UriProtector.getQueryParameterNames(uri)) {
                    C786410Ut5.LJJJI(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), bundle);
                }
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
                    }
                }
                C786410Ut5.LJJJI("fragment_type", "sub_space_activity_list", bundle);
                if (uri.getBooleanQueryParameter("is_fullscreen", true)) {
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, "aweme://live/container", bundle);
                } else {
                    C19EG c19egLIZ = C500260Jjc.LIZ(context);
                    if (c19egLIZ == null || (supportFragmentManager = c19egLIZ.getSupportFragmentManager()) == null) {
                        return false;
                    }
                    String str2 = SubContentFragmentSheetDialog._pnsPageId;
                    Pair pair = (Pair) ((LinkedHashMap) C1191704lP.LIZ).get("sub_space_activity_list_fragment");
                    if (pair != null) {
                        C786410Ut5.LJJJI("fragment_id", "sub_space_activity_list_fragment", bundle);
                        C19322110iZ.LIZLLL(supportFragmentManager, SubContentFragmentSheetDialog.class, (String) pair.getFirst(), null, bundle);
                        return true;
                    }
                }
                return true;
            }
        }, new C0JK3() { // from class: X.0JJq
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/creator_chat_group");
            }

            @Override // X.C0JK3, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Set<String> queryParameterNames;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Bundle bundle = new Bundle();
                Uri uri = c2436109gd.LIZ;
                if (uri != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri)) != null) {
                    for (String str : queryParameterNames) {
                        Uri uri2 = c2436109gd.LIZ;
                        if (uri2 != null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str);
                        } else {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        }
                        C786410Ut5.LJJJI(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                    }
                }
                C19EG c19egLJ = C500260Jjc.LJ(context);
                if (c19egLJ != null) {
                    C19322110iZ.LIZLLL(c19egLJ.getSupportFragmentManager(), PrivilegeCreatorRoomItemDetailFragment.class, "sub_privilege_discord_item_detail_dialog", null, bundle);
                    return true;
                }
                return false;
            }
        });
        ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).w2().LIZLLL();
        return C13LP.LJLIL(C0JJD.LIZ(), listLJIIJJI);
    }
}
