package X;

import android.content.Context;
import android.text.SpannableString;
import android.util.ArrayMap;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00x6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C245000x6 extends AbstractC1110800f0o<SubNotifyMessage> implements InterfaceC1110040eza {
    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.drawable.eyk;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 2;
    }

    @Override // X.InterfaceC1110040eza
    public final void LIZIZ() throws JSONException {
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9.LIZLLL) {
            Context context = c1109770ez9.LIZ;
            Room room = c1109770ez9.LJII;
            if (room != null) {
                ISubscriptionStatusService.LJIIIZ.getClass();
                if (C0K9Q.LIZ().m70(room).LIZ) {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                    C494790Jan.LJIIJJI(context, room, "interaction_msg", null);
                } else {
                    ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ(context, room, "interaction_msg", null, null, 0L, 0L);
                }
            }
        } else {
            C784440Upu.LIZ().LIZIZ(new C0IF2("subscribe_entrance_interaction_msg"));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_interaction_message_click");
        c474500IjALIZ.LJJII(Long.valueOf(LJZL()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLJJIII()), "room_id");
        c474500IjALIZ.LJJII(this.LJIILL.LIZ ? "fold" : "unfold", "msg_position");
        c474500IjALIZ.LJJII(2, "msg_type");
        c474500IjALIZ.LJJII("content", "click_position");
        c474500IjALIZ.LJJII(LLIILII() ? "anchor" : "viewer", "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJIJLIJ() {
        return ((SubNotifyMessage) this.LJIL).exhibitionType == 1;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        String strLIZ = C0KVU.LIZ(((SubNotifyMessage) this.LJIL).user);
        Long l = ((SubNotifyMessage) this.LJIL).subMonth;
        if (l == null) {
            return "";
        }
        String strLJIIL = C497740JfY.LJIIL(2131755607, l.intValue(), strLIZ, ((SubNotifyMessage) this.LJIL).subMonth);
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Fo2().getClass();
        C1110020ezY c1110020ezYLJIILJJIL = LJIILJJIL(C175200lq.LIZ(R.color.aag), ((SubNotifyMessage) this.LJIL).user);
        SpannableString spannableString = new SpannableString(strLJIIL);
        int iIndexOf = strLJIIL.indexOf(strLIZ);
        C786410Ut5.o2(spannableString, c1110020ezYLJIILJJIL, iIndexOf, strLIZ.length() + iIndexOf, 33);
        return spannableString;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((SubNotifyMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJ() {
        return ((SubNotifyMessage) this.LJIL).exhibitionType < 2;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public final boolean LLJJIJIL() {
        MESSAGE message = this.LJIL;
        return (message.baseMessage == null || message.baseMessage.displayText == null) ? false : true;
    }

    public final Map<String, String> LLJLIL() {
        ArrayMap arrayMap = new ArrayMap();
        MESSAGE message = this.LJIL;
        String str = ((SubNotifyMessage) message).subscribeType == 0 ? "one_month" : ((SubNotifyMessage) message).subscribeType == 1 ? "auto_sub" : "";
        int i = ((SubNotifyMessage) message).oldSubscribeStatus;
        String str2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "resubscribe_beyond_grace_period" : "resubscribe_within_grace_period" : "resubscribe" : "first_subscribe";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((SubNotifyMessage) this.LJIL).subscribingStatus);
        sbLIZ.append("");
        arrayMap.put("subscribing_status", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(((SubNotifyMessage) this.LJIL).subscribeMessageType);
        sbLIZ2.append("");
        arrayMap.put("new_sub_message_type", C2188811AlT.LIZIZ(sbLIZ2));
        arrayMap.put("subscribe_type", str);
        arrayMap.put("sub_message_type", str2);
        return arrayMap;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((SubNotifyMessage) this.LJIL).user;
    }

    @Override // X.AbstractC1110790f0n
    public final InterfaceC1110040eza LLD() {
        if (LLIILII()) {
            return this;
        }
        return null;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        int i;
        super.onAttach();
        SubNotifyMessage subNotifyMessage = (SubNotifyMessage) this.LJIL;
        if (subNotifyMessage.subscribeMessageType == 0 && (((i = subNotifyMessage.oldSubscribeStatus) == 0 || i == 3) && getUser() != null && UserService.getInstance().user() != null && UserService.getInstance().user().getCurrentUser() != null && getUser().getId() != UserService.getInstance().user().getCurrentUser().getId())) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            System.currentTimeMillis();
            getUser();
            dataChannelGlobal.JQ2(C931000aKo.class, new Object() { // from class: X.00x7
            });
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_message_show");
        c474500IjALIZ.LJJII(Integer.valueOf(((SubNotifyMessage) this.LJIL).exhibitionType), "fold_type");
        c474500IjALIZ.LJJIIZI(LLJLIL());
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(LLIILII() ? "anchor" : "user", "user_type");
        c474500IjALIZ.LIZ();
        MESSAGE message = this.LJIL;
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF("message_from", String.valueOf(message.getMessageFrom()), jSONObject);
        C0K04.LJ("message_create_time", message.baseMessage.createTime, jSONObject);
        C0K04.LJ("message_fetch_time", message.timestamp, jSONObject);
        C0K04.LJ("fetch_delay_time", C963140bAe.LIZIZ() - message.timestamp, jSONObject);
        C0K04.LJFF("message", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, message), jSONObject);
        C510380Jzw.LJIL("subscription_notify_message", jSONObject);
    }

    public C245000x6(SubNotifyMessage subNotifyMessage) {
        super(subNotifyMessage);
    }

    @Override // X.AbstractC1110790f0n
    public final void LJZI(UserProfileEvent userProfileEvent) {
        Text text;
        TextPieceUser textPieceUser;
        User user;
        if (getUser() != null) {
            userProfileEvent.user = getUser();
        }
        if (getUser() == null && (text = this.LJIL.baseMessage.displayText) != null) {
            List<TextPiece> list = text.pieces;
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1133830fbx.LJIILL("", list, arrayList, linkedHashMap, this);
            if (arrayList.size() > 0 && arrayList.size() == linkedHashMap.size()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ListProtector.get(arrayList, i);
                    TextPiece textPiece = (TextPiece) linkedHashMap.get(Integer.valueOf(i));
                    if (textPiece.type == EnumC1133850fbz.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null && (user = textPieceUser.user) != null) {
                        userProfileEvent.user = user;
                        break;
                    }
                    i++;
                }
            }
        }
        userProfileEvent.setClickUserPosition("subscribe_message");
        userProfileEvent.setExtraParams(LLJLIL());
    }
}
