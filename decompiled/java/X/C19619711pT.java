package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.groupchat.DMGroupChatStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19619711pT extends AbstractC19589811ke<DMGroupChatStickerModel> implements InterfaceC19608111nb {
    public Aweme LJFF;

    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C20280014Ww(LJ().LIZLLL, LJ(), this.LJFF);
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        JSONObject jSONObject;
        boolean z;
        long jLongValue;
        int iIntValue;
        DMGroupChatStickerStruct groupChatStickerStruct = interactStickerStruct.getGroupChatStickerStruct();
        if (groupChatStickerStruct != null) {
            String str = "";
            try {
                String eventTracking = groupChatStickerStruct.getEventTracking();
                if (eventTracking == null) {
                    eventTracking = "";
                }
                jSONObject = new JSONObject(eventTracking);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("group_type");
            String strOptString2 = jSONObject.optString("group_owner_account_type");
            C13DA c13da = new C13DA();
            String strOptString3 = jSONObject.optString("shoot_enter_from");
            int iIntValue2 = 0;
            if (strOptString3.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c13da.put("shoot_enter_from", strOptString3);
            }
            String strOptString4 = jSONObject.optString("shoot_enter_method");
            if (strOptString4.length() > 0) {
                c13da.put("shoot_enter_method", strOptString4);
            }
            String strOptString5 = jSONObject.optString("source_enter_method");
            if (strOptString5.length() > 0) {
                c13da.put("source_enter_method", strOptString5);
            }
            Map mapBuild = c13da.build();
            BaseStickerModel baseStickerModel = new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null);
            Long conversationShortId = groupChatStickerStruct.getConversationShortId();
            if (conversationShortId != null) {
                jLongValue = conversationShortId.longValue();
            } else {
                jLongValue = 0;
            }
            Long lValueOf = Long.valueOf(jLongValue);
            String groupName = groupChatStickerStruct.getGroupName();
            if (groupName == null) {
                groupName = "";
            }
            String accessCriteriaCopy = groupChatStickerStruct.getAccessCriteriaCopy();
            if (accessCriteriaCopy == null) {
                accessCriteriaCopy = "";
            }
            String groupAvatar = groupChatStickerStruct.getGroupAvatar();
            if (groupAvatar != null) {
                str = groupAvatar;
            }
            Integer groupStatus = groupChatStickerStruct.getGroupStatus();
            if (groupStatus != null) {
                iIntValue = groupStatus.intValue();
            } else {
                iIntValue = 0;
            }
            DMGroupChatStickerGroupInfo dMGroupChatStickerGroupInfo = new DMGroupChatStickerGroupInfo(lValueOf, groupName, accessCriteriaCopy, str, Integer.valueOf(iIntValue), strOptString, strOptString2, groupChatStickerStruct.getGroupMemberCount(), groupChatStickerStruct.getGroupDesc());
            Integer uiStyle = groupChatStickerStruct.getUiStyle();
            if (uiStyle != null) {
                iIntValue2 = uiStyle.intValue();
            }
            return new DMGroupChatStickerModel(baseStickerModel, dMGroupChatStickerGroupInfo, iIntValue2, false, false, mapBuild);
        }
        return new DMGroupChatStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.DM_GROUP_CHAT, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -5, 15, null), null, EnumC19620411pa.STICKER_WITH_BUTTON_WITH_WHITE.getValue(), false, false, C2097608Jq.LJ());
    }

    @Override // X.InterfaceC19608111nb
    public final void LJIILIIL(Aweme aweme) {
        this.LJFF = aweme;
    }

    @Override // X.AbstractC19589811ke
    public final void LIZIZ(InteractStickerStruct interactStickerStruct, StickerModel stickerModel) {
        if (!C729510SjV.LJJIJIL(this.LJFF) && !C294790Bgz.LIZ()) {
            return;
        }
        super.LIZIZ(interactStickerStruct, stickerModel);
    }
}
