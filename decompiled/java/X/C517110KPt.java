package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.subscribe.model.GetSubInfoResponse;
import com.bytedance.android.livesdk.subscribe.model.SubscribingInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.n;
import com.zhiliaoapp.musically.R;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.APPBAppLaunchNotificationResponse;
import webcast.api.sub.SubPriceChangeConfirmRequest;

/* JADX INFO: renamed from: X.0KPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517110KPt {
    public boolean LIZ;
    public boolean LIZIZ;

    public static final GetSubInfoResponse LIZIZ() {
        n nVar = C490180JKe.LLILLJJLI.get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (nVar == null) {
            return null;
        }
        C490290JKp.LIZ.getClass();
        return C490290JKp.LIZ(nVar);
    }

    public static final void LJIIIIZZ() {
        C1119850fFP c1119850fFP = C011Z.LIZ;
        C783420UoG c783420UoG = new C783420UoG();
        c1119850fFP.getClass();
        C1119850fFP.LJJIFFI(R.drawable.dgn, c783420UoG);
    }

    public static final void LJIIJJI() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        final Context context = iHostAppContext != null ? iHostAppContext.context() : null;
        Long lLIZIZ = C0KPJ.Le.LIZIZ();
        if (Build.VERSION.SDK_INT >= 26) {
            if ((lLIZIZ == null || lLIZIZ.longValue() != -1) && Intrinsics.LJFF(LocalDate.now(), Instant.ofEpochMilli(lLIZIZ.longValue()).atZone(ZoneId.systemDefault()).toLocalDate())) {
                return;
            }
        } else if ((lLIZIZ == null || lLIZIZ.longValue() != -1) && Intrinsics.LJFF(new Date(), new Date(lLIZIZ.longValue()))) {
            return;
        }
        if (Intrinsics.LJFF(C1108870exh.LIZIZ.getValue(), Boolean.FALSE)) {
            return;
        }
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
        LIZLLL().LJJLJLI(new C09JN() { // from class: X.0Jbw
            @Override // X.C09JN
            public final void accept(Object obj) {
                List<SubscribingInfo> list;
                C1C7U.LIZ("LiveSdkSubscriptionOtherService@c1ad.subscriptionCreatorSpecificSkuNotification$d$1");
                T t = ((BaseResponse) obj).data;
                if (t != null && (list = ((APPBAppLaunchNotificationResponse.Data) t).priceChangeNotificationList) != null) {
                    Context context2 = context;
                    if (list.size() > 0 && context2 != null) {
                        C0KPJ.Le.LJFF(Long.valueOf(System.currentTimeMillis()));
                        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).ZR0(context2, list);
                    }
                }
                C1C7U.LIZIZ("LiveSdkSubscriptionOtherService@c1ad.subscriptionCreatorSpecificSkuNotification$d$1");
            }
        });
    }

    public static final void LJIIL() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            iHostAppContext.context();
        }
        Long lLIZIZ = C0KPJ.Le.LIZIZ();
        if (Build.VERSION.SDK_INT >= 26) {
            if ((lLIZIZ == null || lLIZIZ.longValue() != -1) && Intrinsics.LJFF(LocalDate.now(), Instant.ofEpochMilli(lLIZIZ.longValue()).atZone(ZoneId.systemDefault()).toLocalDate())) {
                return;
            }
        } else if ((lLIZIZ == null || lLIZIZ.longValue() != -1) && Intrinsics.LJFF(new Date(), new Date(lLIZIZ.longValue()))) {
            return;
        }
        if (Intrinsics.LJFF(C1108870exh.LIZIZ.getValue(), Boolean.FALSE)) {
            return;
        }
        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Go0();
    }

    public static final C11NZ<C470590Icr<APPBAppLaunchNotificationResponse.Data>> LIZLLL() {
        C480460Ism.LIZ().getClass();
        return C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getPriceChangeNotification(4), EnumC510330Jzr.GENERAL, "app_launch", "sub/user/price_change_notification/appb_app_launch", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0());
    }

    public static final void LIZ(Map<String, ? extends Object> map) {
        String str;
        C490480JLi c490480JLi = C490180JKe.LLILLL;
        c490480JLi.getClass();
        Object obj = null;
        if (map != null) {
            obj = map.get("source");
        }
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            str = "creator_tools_page";
        }
        c490480JLi.LLILL(0, str).LJJLL(new C09JN() { // from class: X.00MA
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$3");
                C1C7U.LIZIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$3");
            }
        }, new C09JN() { // from class: X.00MB
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$4");
                C1C7U.LIZIZ("SubInfoRepoOperator@bd49.operator$1$fetchSubInfo$4");
            }
        });
    }

    public static final n LIZJ(String str) {
        return C490180JKe.LLILLJJLI.get(str);
    }

    public static final String LJ(String str) {
        C0KQ2 next;
        Iterator<C0KQ2> it2 = C499330Ji7.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.m3(str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0KQ2 c0kq2 = next;
        if (c0kq2 == null) {
            return null;
        }
        return c0kq2.getValue();
    }

    public static final boolean LJI(DataChannel dataChannel) {
        return ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).kI1(dataChannel);
    }

    public static final void LJII(DataChannel dataChannel) {
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        String strLJIJI = C497740JfY.LJIJI(2131842230);
        String strLJIJI2 = C497740JfY.LJIJI(2131842229);
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        capsuleMessage.isLocalInsertMsg = true;
        capsuleMessage.capsuleType = 10;
        capsuleMessage.scene = "live_sub_only_use_music";
        capsuleMessage.schema = "";
        Text text = new Text();
        text.key = null;
        text.defaultPattern = strLJIJI;
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.key = "pm_jpSubLiveMusic_livePage_capsule_btn";
        text2.defaultPattern = strLJIJI2;
        capsuleMessage.buttonText = text2;
        int i = 0;
        C1112330f3H c1112330f3H = new C1112330f3H(capsuleMessage, Integer.valueOf(R.drawable.eyl), null, i, i, new C494040JZa(room, dataChannel), 28);
        C0KQ1 c0kq1 = new C0KQ1();
        c0kq1.LIZ = EnumC517130KPv.MUSIC;
        c1112330f3H.LJJIIJZLJL = c0kq1;
        if (room != null) {
            ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).XK(room.getId(), c1112330f3H);
        }
    }

    public final boolean LJFF(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                return this.LIZ;
            }
            boolean z = this.LIZ;
            this.LIZIZ = false;
            this.LIZ = false;
            return z;
        }
        this.LIZIZ = true;
        SubOnlyLiveSettingDialogNew.LLJLL.getClass();
        boolean z2 = SubOnlyLiveSettingDialogNew.LLJLLL;
        this.LIZ = z2;
        return z2;
    }

    public static final boolean LJIIJ(String str, String str2) {
        C0KQ2 next;
        Iterator<C0KQ2> it2 = C499330Ji7.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.m3(str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0KQ2 c0kq2 = next;
        if (c0kq2 != null) {
            c0kq2.setValue(str2);
            return true;
        }
        return false;
    }

    public static final void LJIILIIL(Activity activity, C0KFS c0kfs) {
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).triggerInAppMessages(activity, c0kfs.getKey());
    }

    public static final Fragment LJIIIZ(Context context, C0K8N c0k8n, SubPriceChangeConfirmRequest subPriceChangeConfirmRequest, String str) {
        C0K8F.LIZ.getClass();
        View viewSd = C786410Ut5.Sd(R.layout.hni, C786410Ut5.ne(context), null);
        C480460Ism.LIZ().getClass();
        C11NZ c11nzLJIILIIL = C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).confirmPriceChange(subPriceChangeConfirmRequest), EnumC510330Jzr.GENERAL, str, "sub/contract/sub_price_change_confirm", C2097608Jq.LJ(), AFwS237S0000000_7.get$arr$(353)).LJIILIIL(new C0UO0());
        ((TextView) viewSd.findViewById(R.id.f7u)).setText(c0k8n.LIZJ);
        C1819620xS4.LIZ().setUrl(c0k8n.LIZIZ).LJJI(viewSd.findViewById(R.id.s08));
        ((TextView) viewSd.findViewById(R.id.ql9)).setText(c0k8n.LIZLLL);
        ((TextView) viewSd.findViewById(R.id.pki)).setText(C786410Ut5.j4(context.getString(2131840631), Arrays.copyOf(new Object[]{c0k8n.LJFF}, 1)));
        ((TextView) viewSd.findViewById(R.id.p7g)).setText(C786410Ut5.j4(context.getString(2131840631), Arrays.copyOf(new Object[]{c0k8n.LJ}, 1)));
        ((TextView) viewSd.findViewById(R.id.hgk)).setText(c0k8n.LJI);
        TextView textView = (TextView) viewSd.findViewById(R.id.pcc);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.j4(context.getString(2131840629), Arrays.copyOf(new Object[]{c0k8n.LJII}, 1)));
        sbLIZ.append(' ');
        sbLIZ.append(context.getString(2131840630));
        textView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C770750ULh c770750ULh = new C770750ULh();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.f624v7;
        c770750ULh.LIZ = c0hti.LIZ(context);
        c770750ULh.LIZLLL = 1;
        c770750ULh.LJ = context.getString(2131840621);
        c770750ULh.LJIILIIL = viewSd;
        c770750ULh.LJIILJJIL = false;
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJI(context.getString(2131840632), new C517140KPw(subPriceChangeConfirmRequest, c0k8n));
        c770750ULh.LJII(context.getString(2131840628), new C517150KPx(subPriceChangeConfirmRequest, c0k8n));
        c770750ULh.LJIJ = true;
        if (c0k8n.LIZ) {
            return c770750ULh.LIZ();
        }
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context, false);
        if (fragmentManagerLJIL == null) {
            return null;
        }
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.show(fragmentManagerLJIL, "");
        c11nzLJIILIIL.LJJLJ();
        return tuxSheet;
    }
}
