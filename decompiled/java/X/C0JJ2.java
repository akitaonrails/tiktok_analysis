package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.PreviewDecorationCreateSchemeEvent;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.PcsServicePlusOptinPageParams;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbServiceBioDesignOptSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog.CalendlyMeetingDmDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.onestopshop.OneStopSheetFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0JJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJ2 extends C09AY implements Function0<List<? extends InterfaceC490020JJo>> {
    public C0JJ2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC490020JJo> invoke() {
        return C13LP.LJLIL(C0JJD.LIZ(), C1697810uHb.LJIIJJI(new C0JKB() { // from class: X.0JII
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/course");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                int iIntValue;
                Integer numLJIIJJI;
                Integer numLJIIJJI2;
                Long lLJIILIIL;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                int iIntValue2 = 0;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                long jLongValue2 = 0;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "course_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                    jLongValue2 = lLJIILIIL.longValue();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "previous_page");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ui_version");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) != null) {
                    iIntValue = numLJIIJJI2.intValue();
                } else {
                    iIntValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "theme_config");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) != null) {
                    iIntValue2 = numLJIIJJI.intValue();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("anchor_id", jLongValue);
                bundle.putLong("course_id", jLongValue2);
                C786410Ut5.LJJJI("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, bundle);
                C786410Ut5.LJJJI("previous_page", str, bundle);
                bundle.putInt("ui_version", iIntValue);
                bundle.putInt("theme_config", iIntValue2);
                ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).u60(context, bundle);
                return true;
            }
        }, new C0JKB() { // from class: X.0JJM
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/course/detail");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                long jLongValue2;
                Long lLJIILIIL;
                Long lLJIILIIL2;
                Long lLJIILIIL3;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "course_id");
                long jLongValue3 = -1;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                    jLongValue = lLJIILIIL3.longValue();
                } else {
                    jLongValue = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                    jLongValue2 = lLJIILIIL2.longValue();
                } else {
                    jLongValue2 = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) != null) {
                    jLongValue3 = lLJIILIIL.longValue();
                }
                boolean zLJFF = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_full_page"), "1");
                boolean zLJFF2 = Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "has_purchased"), "1");
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                }
                boolean z = !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_back_button"), CardStruct.IStatusCode.DEFAULT);
                if (zLJFF) {
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJJI("fragment_type", "pcs_course_detail", bundle);
                    C786410Ut5.LJJJI("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                    C786410Ut5.LJJJI("enter_from", str, bundle);
                    bundle.putLong("course_id", jLongValue);
                    bundle.putLong("anchor_id", jLongValue2);
                    C786410Ut5.LJJJI("sec_anchor_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, bundle);
                    bundle.putBoolean("is_full_page", true);
                    bundle.putBoolean("has_purchased", zLJFF2);
                    ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).In1(context, bundle);
                    return true;
                }
                if (LiveSmbServiceBioDesignOptSetting.INSTANCE.useNewBioPage()) {
                    ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIJ(new C1822010xVv(EnumC1785280wYg.COURSE, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z, false, false, str, Long.valueOf(jLongValue2), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, Long.valueOf(jLongValue3), Long.valueOf(jLongValue), null, null, false, null, null, Boolean.valueOf(zLJFF2), null, null, 424984));
                    return true;
                }
                ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).KC0(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str, jLongValue, jLongValue2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, jLongValue3, zLJFF2);
                return true;
            }
        }, new C0JKB() { // from class: X.0JIK
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/course/video_player");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                int iIntValue;
                Integer numLJIIJJI;
                Long lLJIILIIL;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                long jLongValue2 = -1;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "course_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                    jLongValue2 = lLJIILIIL.longValue();
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "selected_position");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id_list");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    Long lLJIILIIL3 = C2095008Iq.LJIILIIL(a0.LJLIIIL((String) it2.next()).toString());
                    if (lLJIILIIL3 != null) {
                        arrayList.add(lLJIILIIL3);
                    }
                }
                long[] jArrLLIIIILZ = C13LP.LLIIIILZ(arrayList);
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("fragment_type", "pcs_course_video_player", bundle);
                C786410Ut5.LJJJI("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                bundle.putLong("anchor_id", jLongValue);
                bundle.putLong("course_id", jLongValue2);
                bundle.putLongArray("video_id_list", jArrLLIIIILZ);
                bundle.putInt("selected_position", iIntValue);
                ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).In1(context, bundle);
                return true;
            }
        }, new C0JKB() { // from class: X.0JIH
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/course/music_peel");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "course_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "video_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                C0JIJ c0jij = new C0JIJ(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                C0JIG c0jig = new C0JIG(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0JI6(c0jij, c0jig, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, null), 3);
                return true;
            }
        }, new C0JKB() { // from class: X.0JJ8
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/decoration/item_editor");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                DataChannel dataChannelProvideDataChannel;
                Object objGg0;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null || !C500260Jjc.LJJIL()) {
                    return false;
                }
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                if (c0ip3LIZIZ != null && (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) != null && (objGg0 = dataChannelProvideDataChannel.gg0(LiveModeChannel.class)) != null && objGg0 != LiveMode.VIDEO) {
                    return false;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Pair[] pairArr = new Pair[4];
                pairArr[0] = new Pair("deeplink_origin", "go_live");
                pairArr[1] = new Pair("deeplink_start_time", String.valueOf(System.currentTimeMillis()));
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                pairArr[2] = new Pair("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "text");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                pairArr[3] = new Pair("text", str);
                dataChannelGlobal.FQ2(PreviewDecorationCreateSchemeEvent.class, C2097608Jq.LJIIIIZZ(pairArr));
                return true;
            }
        }, new C0JKB() { // from class: X.0JJn
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                C0JKP c0jkp = C0JKP.COMPULSORY;
                return C1697810uHb.LJIIJJI(new C0JK4("dsl", c0jkp), new C0JK4("mode", c0jkp));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/decoration/board_dsl");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Object c098200Yq;
                InterfaceC1814530xJr boardsDisplayStateManager;
                DataChannel dataChannelProvideDataChannel;
                Object objGg0;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null || !C500260Jjc.LJJIL()) {
                    return false;
                }
                C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(C1388190mED.LIZIZ(context));
                if (c0ip3LIZIZ != null && (dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel()) != null && (objGg0 = dataChannelProvideDataChannel.gg0(LiveModeChannel.class)) != null && objGg0 != LiveMode.VIDEO) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "mode");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "edit") && !Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "render")) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "dsl");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
                }
                if (a0.LJJJIL(str)) {
                    return false;
                }
                try {
                    c098200Yq = (Board) C19748512Ol.LIZJ.LJII(str, Board.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to parse Board from `dsl` query param: ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    C20441214yg.LJIIL("PcsBoardDslSchemaHandler", C2188811AlT.LIZIZ(sbLIZ));
                    if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Schema error: invalid `dsl` JSON — ");
                        sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                        C766270U4b.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Board board = (Board) c098200Yq;
                if (board == null || (boardsDisplayStateManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getBoardsDisplayStateManager()) == null) {
                    return false;
                }
                if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "edit")) {
                    boardsDisplayStateManager.LJI(board, null);
                    return true;
                }
                if (!Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "render")) {
                    return true;
                }
                boardsDisplayStateManager.LJIIIZ(board, false, AFwS237S0000000_7.get$arr$(365), null);
                return true;
            }
        }, new C0JKB() { // from class: X.0JIh
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/one_stop_shop");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
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
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "enter_from_merge")) == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                C786410Ut5.LJJJI("enter_from", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                    return false;
                }
                OneStopSheetFragment oneStopSheetFragmentLIZLLL = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZLLL(null);
                if ((oneStopSheetFragmentLIZLLL instanceof LiveSheetFragment) && oneStopSheetFragmentLIZLLL != null) {
                    C19322110iZ.LIZLLL(supportFragmentManager, oneStopSheetFragmentLIZLLL.getClass(), "live_smb_one_stop_sheet", null, bundle);
                }
                return true;
            }
        }, new C0JKB() { // from class: X.0JIi
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/decoration/foundation_bulletin_click");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                HashMap map2 = new HashMap();
                Iterator<String> it2 = UriProtector.getQueryParameterNames(uri).iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    map2.put(next, str);
                }
                String str2 = (String) map2.get("show_entrance");
                if (str2 != null) {
                    str = str2;
                }
                C784440Upu.LIZ().LIZIZ(new C489710JIj(str));
                return true;
            }
        }, new C0JKB() { // from class: X.0JIL
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/decoration/foundation_bulletin_edit");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                C784440Upu.LIZ().LIZIZ(new Object() { // from class: X.01v3
                });
                return true;
            }
        }, new C0JKB() { // from class: X.0JJJ
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/contact");
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:25:0x004b, B:27:0x0061), top: B:41:0x004b }] */
            @Override // X.C0JKB, X.InterfaceC490020JJo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean nd(android.content.Context r15, X.C2436109gd r16, java.util.Map<java.lang.String, java.lang.String> r17) {
                /*
                    r14 = this;
                    r0 = r17
                    r1 = r16
                    super.nd(r15, r1, r0)
                    android.net.Uri r2 = r1.LIZ
                    r1 = 0
                    if (r2 != 0) goto Ld
                    return r1
                Ld:
                    java.lang.String r0 = "anchor_id"
                    java.lang.String r6 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    java.lang.String r5 = ""
                    if (r6 != 0) goto L18
                    r6 = r5
                L18:
                    java.lang.String r0 = "show_entrance"
                    java.lang.String r7 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r7 != 0) goto L21
                    r7 = r5
                L21:
                    java.lang.String r0 = "panel_type"
                    java.lang.String r8 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r8 != 0) goto L2a
                    r8 = r5
                L2a:
                    java.lang.String r0 = "title"
                    java.lang.String r9 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r9 != 0) goto L33
                    r9 = r5
                L33:
                    java.lang.String r0 = "leads_id"
                    java.lang.String r10 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r10 != 0) goto L3c
                    r10 = r5
                L3c:
                    java.lang.String r0 = "options"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r0 != 0) goto L45
                    r0 = r5
                L45:
                    java.lang.String r4 = android.net.Uri.decode(r0)
                    if (r4 == 0) goto L61
                    com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L64
                    r3.<init>()     // Catch: java.lang.Exception -> L64
                    X.04XA r0 = new X.04XA     // Catch: java.lang.Exception -> L64
                    r0.<init>()     // Catch: java.lang.Exception -> L64
                    java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L64
                    java.lang.Object r11 = r3.LJIIIIZZ(r4, r0)     // Catch: java.lang.Exception -> L64
                    java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L64
                    if (r11 != 0) goto L6a
                L61:
                    X.13BV r11 = X.C13BV.INSTANCE     // Catch: java.lang.Exception -> L64
                    goto L6a
                L64:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.13BV r11 = X.C13BV.INSTANCE
                L6a:
                    java.lang.String r0 = "action_info"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r0 != 0) goto L73
                    r0 = r5
                L73:
                    java.util.Map r12 = X.C196300pF.LIZ(r0)
                    java.lang.String r0 = "extra_params"
                    java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)
                    if (r0 == 0) goto L80
                    r5 = r0
                L80:
                    java.util.Map r13 = X.C196300pF.LIZ(r5)
                    androidx.fragment.app.FragmentManager r0 = X.C520010KaN.LJIL(r15, r1)
                    if (r0 == 0) goto L99
                    java.lang.Class<com.bytedance.android.livesdk.comp.api.pcs.IPcsService> r0 = com.bytedance.android.livesdk.comp.api.pcs.IPcsService.class
                    X.006A r0 = X.C1161920gLG.LIZJ(r0)
                    com.bytedance.android.livesdk.comp.api.pcs.IPcsService r0 = (com.bytedance.android.livesdk.comp.api.pcs.IPcsService) r0
                    X.0JJO r5 = r0.xf()
                    r5.LJIILLIIL(r6, r7, r8, r9, r10, r11, r12, r13)
                L99:
                    r0 = 1
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0JJJ.nd(android.content.Context, X.09gd, java.util.Map):boolean");
            }
        }, new C0JKB() { // from class: X.0JJG
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/meeting/calendly_booking");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                FragmentManager supportFragmentManager;
                Long lLJIILIIL;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "booking_description");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "booking_title");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                }
                PcsCalendlyBookingData pcsCalendlyBookingData = new PcsCalendlyBookingData(jLongValue, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_back_button"), CardStruct.IStatusCode.DEFAULT));
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                    return false;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIIIZZ(context, supportFragmentManager, pcsCalendlyBookingData);
                return true;
            }
        }, new C0JKB() { // from class: X.0JIp
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/meeting/booking_barrage_click");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String string;
                Long lLJIILIIL;
                long jLongValue;
                Long lValueOf;
                FragmentManager supportFragmentManager;
                User owner;
                String secUid;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Room roomLJJLI = C500260Jjc.LJJLI();
                String str = "";
                if (roomLJJLI == null || (string = Long.valueOf(roomLJJLI.getOwnerUserId()).toString()) == null) {
                    string = "";
                }
                try {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "booking_user_id");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                        long jLongValue2 = lLJIILIIL.longValue();
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "booking_user_sec_uid");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                        }
                        UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "event_id");
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_id");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3)) != null) {
                            jLongValue = lLJIILIIL2.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                        if (interfaceC500940JkiUser != null) {
                            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(String.valueOf(lValueOf), string)) {
                            ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(jLongValue2, C2097908Jt.LIZJ(new Pair("sec_user_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)));
                        } else {
                            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                            if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                                Room roomLJJLI2 = C500260Jjc.LJJLI();
                                if (roomLJJLI2 != null && (owner = roomLJJLI2.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                                    str = secUid;
                                }
                                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIIIZZ(context, supportFragmentManager, new PcsCalendlyBookingData(jLongValue, string, str, "barrage_message", (String) null, (String) null, 112));
                                return true;
                            }
                        }
                    }
                    return true;
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return true;
                }
            }
        }, new C0JKB() { // from class: X.0JJI
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/meeting/calendly_booking_details");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                FragmentManager supportFragmentManager;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_name");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "duration");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "start_timestamp");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "end_timestamp");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "contact_number");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "email");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "event_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "from_user_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "to_user_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "user_type");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "event_template_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14;
                }
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("title", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, bundle);
                C786410Ut5.LJJJI("user_name", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, bundle);
                C786410Ut5.LJJJI("duration", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, bundle);
                C786410Ut5.LJJJI("start_timestamp", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, bundle);
                C786410Ut5.LJJJI("end_timestamp", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, bundle);
                C786410Ut5.LJJJI("contact_number", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, bundle);
                C786410Ut5.LJJJI("email", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7, bundle);
                C786410Ut5.LJJJI("event_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8, bundle);
                C786410Ut5.LJJJI("from_user_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10, bundle);
                C786410Ut5.LJJJI("to_user_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11, bundle);
                C786410Ut5.LJJJI("user_type", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12, bundle);
                C786410Ut5.LJJJI("sku_id", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13, bundle);
                C786410Ut5.LJJJI("event_template_id", str, bundle);
                C786410Ut5.LJJJI("show_entrance", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, bundle);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                    if (((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIIZ() != null) {
                        C19322110iZ.LIZLLL(supportFragmentManager, CalendlyMeetingDmDialog.class, "CalendlyMeetingDmDialog", null, bundle);
                        return true;
                    }
                    return true;
                }
                return false;
            }
        }, new C0JKB() { // from class: X.0JJN
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/service/form");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                User userLJIJJLI;
                long id;
                long jLongValue;
                boolean z;
                Uri uri;
                Long lLJIILIIL;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Uri uri2 = c2436109gd.LIZ;
                if (uri2 == null) {
                    return false;
                }
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                Long lLJIILIIL3 = null;
                if (interfaceC500940JkiUser != null) {
                    userLJIJJLI = interfaceC500940JkiUser.LJIJJLI();
                } else {
                    userLJIJJLI = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) != null) {
                    id = lLJIILIIL2.longValue();
                } else if (userLJIJJLI != null) {
                    id = userLJIJJLI.getId();
                } else {
                    id = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "avatar");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "sec_anchor_id");
                if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null || Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, CardStruct.IStatusCode.DEFAULT) || !(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4))) && (userLJIJJLI == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = userLJIJJLI.getSecUid()) == null)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "sku_schema");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 == null || !(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6))) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = null;
                }
                boolean z2 = !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "show_back_button"), CardStruct.IStatusCode.DEFAULT);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "sku_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null) {
                    lLJIILIIL3 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "title");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "enter_mode");
                if (userLJIJJLI != null && id == userLJIJJLI.getId()) {
                    z = true;
                } else {
                    z = false;
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null && (uri = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6)) != null) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "avatar");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10.length() == 0) {
                        builderBuildUpon.appendQueryParameter("avatar", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "title");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11.length() == 0) {
                        builderBuildUpon.appendQueryParameter("title", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                    }
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = builderBuildUpon.build().toString();
                }
                C490590JLt c490590JLt = C490590JLt.LIZ;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
                }
                c490590JLt.getClass();
                if (C490590JLt.LJII(str)) {
                    if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                        return true;
                    }
                    ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, new Bundle());
                    return true;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIJ(new C1822010xVv(EnumC1785280wYg.FORM, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z2, false, false, null, Long.valueOf(id), strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4, Long.valueOf(jLongValue), lLJIILIIL3, Boolean.valueOf(z), null, false, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9, null, null, null, 497720));
                return true;
            }
        }, new C0JKB() { // from class: X.0JKE
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return Collections.singletonList(new C0JK4("old_schema", C0JKP.IMPORTANT));
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/form_revamp");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "old_schema")) == null) {
                    return false;
                }
                C490590JLt.LIZ.getClass();
                String strLIZLLL = C490590JLt.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                String strLIZ = C425101l3.LIZ(strLIZLLL, new C0JMG(this, strLIZLLL));
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, strLIZ);
                    return true;
                }
                ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(context, strLIZ, new Bundle());
                return true;
            }
        }, new C0JKB() { // from class: X.0JJL
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/service/dm");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                User userLJIJJLI;
                Long lValueOf;
                long jLongValue;
                Long lLJIILIIL;
                boolean z;
                Integer numLJIIJJI;
                Integer numLJIIJJI2;
                boolean z2;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                Boolean boolValueOf = null;
                if (interfaceC500940JkiUser != null) {
                    userLJIJJLI = interfaceC500940JkiUser.LJIJJLI();
                } else {
                    userLJIJJLI = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || (lValueOf = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)) == null) {
                    if (userLJIJJLI != null) {
                        lValueOf = Long.valueOf(userLJIJJLI.getId());
                    } else {
                        lValueOf = null;
                    }
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if ((strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null || Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, CardStruct.IStatusCode.DEFAULT) || !(!a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3))) && (userLJIJJLI == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = userLJIJJLI.getSecUid()) == null)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = -1;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_schema");
                boolean z3 = !Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_back_button"), CardStruct.IStatusCode.DEFAULT);
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 != null) {
                    lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                } else {
                    lLJIILIIL = null;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_anchor");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7)) != null) {
                    if (numLJIIJJI2.intValue() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_preview");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8)) != null && numLJIIJJI.intValue() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIIJ(new C1822010xVv(EnumC1785280wYg.DM, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, z3, false, false, null, lValueOf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, Long.valueOf(jLongValue), lLJIILIIL, boolValueOf, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5, z, null, null, null, null, null, 516152));
                return true;
            }
        }, new C0JKB() { // from class: X.0JJ3
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/service_moderator_panel");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null) {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LIZIZ(new C0JLC(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id")));
                return true;
            }
        }, new C0JKB() { // from class: X.0JJA
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/opt_in_result");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                String str;
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                HashMap map2 = new HashMap();
                Iterator<String> it2 = UriProtector.getQueryParameterNames(uri).iterator();
                while (true) {
                    str = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    String next = it2.next();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, next);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    map2.put(next, str);
                }
                String str2 = (String) map2.get("show_entrance");
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) map2.get("anchor_id");
                if (str3 != null) {
                    str = str3;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIJ(context, new PcsServicePlusOptinPageParams(str, "", str2, 0L, "", map2));
                return true;
            }
        }, new C0JKB() { // from class: X.0JJ0
            public static final /* synthetic */ int LIZ = 0;

            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/third_party_biolink");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                long jLongValue;
                Long lLJIILIIL;
                User owner;
                String secUid;
                User owner2;
                Long lLJIILIIL2;
                super.nd(context, c2436109gd, map);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sku_id");
                long id = 0;
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) != null) {
                    jLongValue = lLJIILIIL2.longValue();
                } else {
                    jLongValue = 0;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                String str = "";
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null && (room == null || (owner2 = room.getOwner()) == null || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = Long.valueOf(owner2.getId()).toString()) == null)) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "";
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sec_anchor_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 == null) {
                    if (room != null && (owner = room.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                        str = secUid;
                    }
                } else {
                    str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "room_id");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5)) != null) {
                    id = lLJIILIIL.longValue();
                } else if (room != null) {
                    id = room.getId();
                }
                PcsThirdPartyLinkData pcsThirdPartyLinkData = new PcsThirdPartyLinkData(jLongValue, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, str, Long.valueOf(id), 32);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ == null || c19egLIZIZ.getSupportFragmentManager() == null) {
                    return false;
                }
                ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).xf().LJIILJJIL(pcsThirdPartyLinkData);
                return true;
            }
        }, new C0JKB() { // from class: X.0JJE
            @Override // X.InterfaceC490020JJo
            public final List<C0JK4> LIZ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC490020JJo
            public final boolean canHandle(Uri uri) {
                return Intrinsics.LJFF(uri.getPath(), "/industry_select");
            }

            @Override // X.C0JKB, X.InterfaceC490020JJo
            public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
                super.nd(context, c2436109gd, map);
                Uri uri = c2436109gd.LIZ;
                if (uri == null) {
                    return false;
                }
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "show_entrance");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                Intent intentLIZ = C497350Jev.LIZ(context, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_smb_opt_in"), "1"), Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "guide_industry_verify"), "1"), Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "guide_industry_status_check"), "1"), Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_from_smb_management_redirect"), "1"), 12);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZ, "Context_startActivity_1");
                C1701330uNH.LIZ(intentLIZ, context);
                C2204961BRm.LJJJJJL(context, intentLIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSePE4qAkAHkvhoPDXzszdkRe7BLFK2FcF6rdD6wQXZY2U5FzYQFcvpYPe/8G3PyjnuMj2B87PHB5GmBkFIPxyoIvBqv2M0=", null));
                return true;
            }
        }));
    }
}
