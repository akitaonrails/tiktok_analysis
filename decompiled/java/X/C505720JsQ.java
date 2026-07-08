package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import com.bytedance.android.livesdk.comp.impl.subscription.OpenPackagePageEvent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.NewSubSpaceFeedSheetDialogFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.fragment.SubSpaceFeedDialogFragment;
import com.bytedance.android.livesdk.livesetting.level.LiveSuperFanUseNewSpaceDialogSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JsQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505720JsQ {
    public static final String LIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (str == null || C504670Jqj.LIZIZ(str)) {
            return "";
        }
        Uri uri = UriProtector.parse(str);
        C495520Jby c495520Jby = new C495520Jby(str);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = null;
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_super_fans");
        } else {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        }
        if (C504670Jqj.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
            c495520Jby.LIZJ("is_super_fans", "true");
            return c495520Jby.LIZLLL();
        }
        if (uri != null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_fullscreen");
        }
        if (C504670Jqj.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) {
            c495520Jby.LIZJ("is_fullscreen", "false");
        }
        return c495520Jby.LIZLLL();
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void LIZIZ(C504510JqT c504510JqT, Context context) {
        String str;
        ?? r0;
        if (c504510JqT.LLJJJJLIIL) {
            return;
        }
        if (c504510JqT.LLJ) {
            C766270U4b.LIZLLL(2131849256);
            return;
        }
        if (LiveSubOnlySpacePreviewSetting.INSTANCE.displaySubOnlyPreviewTab() && Intrinsics.LJFF(c504510JqT.LLJJLIIIJLLLLLLLZ, "privilege_page")) {
            DataChannelGlobal.LLILZ.FQ2(OpenPackagePageEvent.class, "sub_only_space");
        } else {
            boolean zLJJIIZ = C500260Jjc.LJJIIZ(c504510JqT.LLJJJJJIL);
            String str2 = CardStruct.IStatusCode.DEFAULT;
            String str3 = "";
            if (zLJJIIZ) {
                String str4 = c504510JqT.LLILZ;
                if (str4 == null) {
                    str4 = "";
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str5 = c504510JqT.LLJIJIL;
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put("show_entrance", str5);
                String str6 = c504510JqT.LLJJJJJIL;
                if (str6 != null) {
                    str3 = str6;
                }
                linkedHashMap.put("package_id", str3);
                if (Intrinsics.LJFF(c504510JqT.LLJJLIIIJLLLLLLLZ, "onboarding_page")) {
                    linkedHashMap.put("open_benefit_page", CardStruct.IStatusCode.DEFAULT);
                } else {
                    linkedHashMap.put("open_benefit_page", "1");
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, C508940Jxc.LIZLLL(str4, linkedHashMap));
            } else {
                if (!Intrinsics.LJFF(c504510JqT.LLJJLIIIJLLLLLLLZ, "onboarding_page")) {
                    str2 = "1";
                }
                String str7 = c504510JqT.LLILZ;
                if (str7 != null) {
                    str3 = str7;
                }
                boolean z = !c504510JqT.LLJJIII;
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("show_entrance", c504510JqT.LLJIJIL), new Pair("open_benefit_page", str2));
                C495520Jby c495520Jby = new C495520Jby("sslocal://webcast_subscribe/privilege_page?");
                c495520Jby.LIZJ("sec_anchor_id", str3);
                if (z) {
                    str = "full_page";
                } else {
                    str = "popup";
                }
                c495520Jby.LIZJ("page_type", str);
                for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                    c495520Jby.LIZJ((String) entry.getKey(), (String) entry.getValue());
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c495520Jby.LIZLLL());
            }
        }
        if (c504510JqT.LLJJIII && (r0 = c504510JqT.LLJL) != 0) {
            r0.invoke();
        }
    }

    public static final void LIZJ(Bundle bundle, FragmentManager fragmentManager, String str) {
        if (LiveSuperFanUseNewSpaceDialogSetting.INSTANCE.getValue()) {
            NewSubSpaceFeedSheetDialogFragment.LLLFF.getClass();
            NewSubSpaceFeedSheetDialogFragment newSubSpaceFeedSheetDialogFragment = new NewSubSpaceFeedSheetDialogFragment();
            newSubSpaceFeedSheetDialogFragment.LLLF = str;
            newSubSpaceFeedSheetDialogFragment.setArguments(bundle);
            newSubSpaceFeedSheetDialogFragment.LLJLLL = fragmentManager;
            if (fragmentManager != null) {
                C19322110iZ.LJFF(fragmentManager, newSubSpaceFeedSheetDialogFragment, "NewSubSpaceFeedSheetDialogFragment", null, 0);
                return;
            }
            return;
        }
        SubSpaceFeedDialogFragment.LLILZLL.getClass();
        SubSpaceFeedDialogFragment subSpaceFeedDialogFragment = new SubSpaceFeedDialogFragment();
        subSpaceFeedDialogFragment.LLILZIL = str;
        subSpaceFeedDialogFragment.setArguments(bundle);
        subSpaceFeedDialogFragment.LL = fragmentManager;
        if (fragmentManager == null) {
            return;
        }
        subSpaceFeedDialogFragment.show(fragmentManager, "SubOnlySpaceFeedDialogFragment");
    }
}
