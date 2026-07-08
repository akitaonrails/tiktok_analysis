package X;

import Y.AcS110S1100000_12;
import Y.AfS148S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.AgeBlockEvent;
import com.bytedance.android.livesdk.broadcast.AgeGateNotifyEvent;
import com.bytedance.android.livesdk.broadcast.LiveStatusPerceptionChannel;
import com.bytedance.android.livesdk.dataChannel.DOBChangedChannel;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import webcast.api.room.CreateInfoRequest;

/* JADX INFO: renamed from: X.0UPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771830UPl {
    public static final C771830UPl LIZ = new C771830UPl();

    public static String LIZ() {
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?url=https://webcast.tiktokv.com/falcon/webcast_mt/page/proactive_appeal_redirect/index.html?web_bg_color=#ffffffff&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
        }
        if (!TextUtils.isEmpty(value)) {
            try {
                Uri.Builder builderBuildUpon = UriProtector.parse(value).buildUpon();
                builderBuildUpon.appendQueryParameter("enter_from", "toast");
                value = builderBuildUpon.build().toString();
                return value;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("linkmic_appeal", e.toString());
            }
        }
        return value;
    }

    public static final void LIZJ(Activity activity, DataChannel dataChannel) {
        dataChannel.FQ2(AgeBlockEvent.class);
        LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131840924));
        sbLIZ.append(" >");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C497740JfY.LJIJJ(2131840932, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue())));
        sbLIZ2.append('\n');
        sbLIZ2.append(strLIZIZ);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
        C786410Ut5.p2(spannableString, new C785780Us4(activity, dataChannel, 1), spannableString.length() - strLIZIZ.length(), spannableString.length(), 17);
        C1119920fFW.LJIIIIZZ(spannableString, spannableString.length() - strLIZIZ.length(), spannableString.length(), 17, 500);
        dataChannel.LC0(AgeGateNotifyEvent.class, new C771790UPh(0, EnumC771760UPe.AGE_GATE_BLOCK, spannableString, 8));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_banned_toast_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJIILL("show");
        c474500IjALIZ.LJJII("age_appeal", "show_scene");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(final C19EG c19eg, int i, final DataChannel dataChannel, boolean z) {
        if (i != 1) {
            if (i == 3) {
                LIZJ(c19eg, dataChannel);
                if (!z && C760180Trs.LJII()) {
                    LIZ();
                    String strLJIJJ = C497740JfY.LJIJJ(2131840932, Integer.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C497740JfY.LJIJI(2131840924));
                    sbLIZ.append(" >");
                    dataChannel.zW(LiveStatusPerceptionChannel.class, new C0UOK(0L, 0L, 0, new C771740UPc(strLJIJJ, C2188811AlT.LIZIZ(sbLIZ), LIZ(), "", "", "", 0L)));
                    return;
                }
                return;
            }
            return;
        }
        LIZLLL(c19eg, "live_host", "live_takepage", new C0UZN() { // from class: X.0UPQ
            @Override // X.C0UZN
            public final Unit LJJIFFI() {
                C0UJY c0ujyLIZ = C770730ULf.LIZ(dataChannel);
                if (c0ujyLIZ != null) {
                    c0ujyLIZ.l();
                }
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit onFailed(String str) {
                if (str.length() > 0) {
                    C766270U4b.LJIIJJI(str);
                }
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit LJJI(String str, String str2) {
                long jLongValue;
                Long l;
                C766270U4b.LIZLLL(2131840931);
                dataChannel.zW(DOBChangedChannel.class, Boolean.TRUE);
                Hashtag hashtag = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class);
                if (hashtag != null && (l = hashtag.id) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApi broadcastRoomApiLIZ = C01QD.LIZ().LIZ();
                CreateInfoRequest createInfoRequest = new CreateInfoRequest();
                createInfoRequest.lastTimeHashtagId = jLongValue;
                HashMap<String, String> mapLIZ = C0USY.LIZ.LIZ();
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                }
                createInfoRequest.bannerShowStats = mapLIZ;
                HashMap<String, String> mapLIZ2 = C0USY.LIZIZ.LIZ();
                if (mapLIZ2 == null) {
                    mapLIZ2 = new HashMap<>();
                }
                createInfoRequest.bannerClickStats = mapLIZ2;
                HashMap<String, String> mapLIZ3 = C0USY.LIZJ.LIZ();
                if (mapLIZ3 == null) {
                    mapLIZ3 = new HashMap<>();
                }
                createInfoRequest.bannerCloseStats = mapLIZ3;
                createInfoRequest.isTeen = C781270Ukn.LJIIL().isNeedProtectMinor();
                createInfoRequest.inviterId = 0L;
                createInfoRequest.hasEnteredTryMode = InterfaceC772600USk.zf.LIZIZ().booleanValue();
                broadcastRoomApiLIZ.getPreviewRoomCreateInfo(createInfoRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS148S0200000_12(c19eg, dataChannel, 7), new C09JN() { // from class: X.00LO
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("PreviewAgeBlockHelper@46f0.handleAgeBlockInfo$1$onSuccess$3");
                        C1C7U.LIZIZ("PreviewAgeBlockHelper@46f0.handleAgeBlockInfo$1$onSuccess$3");
                    }
                });
                return Unit.LIZ;
            }
        });
    }

    public static void LIZLLL(final Context context, final String str, final String str2, C0UZN c0uzn) {
        C771910UPt c771910UPt = C771910UPt.LIZ;
        final C0UZC c0uzc = new C0UZC(c0uzn);
        final C0UZD c0uzd = new C0UZD(c0uzn);
        C0UZF c0uzf = new C0UZF(c0uzn);
        c771910UPt.getClass();
        if (!C771910UPt.LIZIZ) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIILLIIL = false;
            c782110Um9.LJIILL = false;
            c782110Um9.LJIIZILJ(2131840930);
            c782110Um9.LJII(2131840929);
            c782110Um9.LJIILIIL(2131840928, new InterfaceC743640TFa() { // from class: X.0UPn
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C771910UPt c771910UPt2 = C771910UPt.LIZ;
                    String str3 = str2;
                    c771910UPt2.getClass();
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_window_click");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(str3, "request_page");
                    c474500IjALIZ.LJJII("add", "click_type");
                    c474500IjALIZ.LIZ();
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ == null) {
                        return;
                    }
                    IHostAction iHostActionLJIIJ = C781270Ukn.LJIIJ();
                    String str4 = str;
                    final Function2<String, String, Unit> function2 = c0uzc;
                    final Function1<String, Unit> function1 = c0uzd;
                    iHostActionLJIIJ.goEditDoBAgeGatePage(activityLIZ, str4, new C10JU() { // from class: X.0UPq
                        @Override // X.C10JU
                        public final void onFailed() {
                            function1.invoke("");
                        }

                        @Override // X.C10JU
                        public final void onSuccess(String str5) {
                            function2.invoke(str5, "");
                        }
                    });
                }
            });
            c782110Um9.LJIIJ(2131840927, new AcS110S1100000_12(c0uzf, str2, 1));
            c782110Um9.LJIJ = new DialogInterface.OnDismissListener() { // from class: X.0UPp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C771910UPt.LIZ.getClass();
                    C771910UPt.LIZIZ = false;
                    boolean z = C0URD.LJ;
                    C0UQ2.LIZ().LIZJ();
                }
            };
            c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0UPr
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C771910UPt.LIZ.getClass();
                    C771910UPt.LIZIZ = true;
                }
            };
            LiveDialog liveDialogLIZ = c782110Um9.LIZ();
            boolean z = C0URD.LJ;
            C0UQ2.LIZ().LIZ(liveDialogLIZ, C0URF.HIGH, null, null);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_add_birth_popup_window_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str2, "request_page");
            c474500IjALIZ.LIZ();
        }
    }
}
