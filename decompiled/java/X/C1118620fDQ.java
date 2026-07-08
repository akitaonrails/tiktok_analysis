package X;

import android.text.TextUtils;
import android.util.SparseLongArray;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeSection;
import com.bytedance.android.livesdk.dataChannel.GameRankTipsMessageEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.rank.LiveMusicSpotlightSetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.api.config.LiveFriendsRankingSuggestMatchCapsuleConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118620fDQ implements InterfaceC1842870y3Z {
    public final DataChannel LIZ;
    public C1118610fDP LIZIZ;
    public final C0JT6<Map<String, String>> LIZJ = InterfaceC1094280eaA.Cd;

    public final C1118630fDR LIZ() {
        Long lLJIILIIL;
        Integer numLJIIJJI;
        Map<String, String> mapLIZ = this.LIZJ.LIZ();
        if (mapLIZ == null) {
            mapLIZ = C2097608Jq.LJ();
        }
        String str = mapLIZ.get("seen_launch_count");
        int iIntValue = (str == null || (numLJIIJJI = C2095008Iq.LJIIJJI(str)) == null) ? 0 : numLJIIJJI.intValue();
        String str2 = mapLIZ.get("clicked_within_first_3");
        boolean z = str2 != null ? Boolean.parseBoolean(str2) : false;
        String str3 = mapLIZ.get("last_room_id");
        return new C1118630fDR(iIntValue, (str3 == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str3)) == null) ? 0L : lLJIILIIL.longValue(), z);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fDP] */
    @Override // X.InterfaceC1842870y3Z
    public final void init() {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C243200wo() { // from class: X.0fDP
                /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0126 A[PHI: r8
                  0x0126: PHI (r8v1 com.bytedance.android.live.base.model.user.User) = (r8v0 com.bytedance.android.live.base.model.user.User), (r8v8 com.bytedance.android.live.base.model.user.User) binds: [B:51:0x0122, B:25:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[PHI: r3 r8
                  0x012c: PHI (r3v4 long) = (r3v3 long), (r3v9 long) binds: [B:54:0x0128, B:28:0x00aa] A[DONT_GENERATE, DONT_INLINE]
                  0x012c: PHI (r8v2 com.bytedance.android.live.base.model.user.User) = (r8v1 com.bytedance.android.live.base.model.user.User), (r8v7 com.bytedance.android.live.base.model.user.User) binds: [B:54:0x0128, B:28:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x0132 A[PHI: r1 r3 r8
                  0x0132: PHI (r1v7 long) = (r1v6 long), (r1v11 long) binds: [B:57:0x012e, B:31:0x00b0] A[DONT_GENERATE, DONT_INLINE]
                  0x0132: PHI (r3v5 long) = (r3v4 long), (r3v8 long) binds: [B:57:0x012e, B:31:0x00b0] A[DONT_GENERATE, DONT_INLINE]
                  0x0132: PHI (r8v3 com.bytedance.android.live.base.model.user.User) = (r8v2 com.bytedance.android.live.base.model.user.User), (r8v6 com.bytedance.android.live.base.model.user.User) binds: [B:57:0x012e, B:31:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1112400f3O
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJIIIZ(X.C1112330f3H r23) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1118610fDP.LJIIIZ(X.0f3H):boolean");
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJIL(C1112330f3H c1112330f3H) {
                    long id;
                    CapsuleBizParamsCohost capsuleBizParamsCohost;
                    User user;
                    if (C500260Jjc.LJIIZILJ(this.LL.LIZ) && Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "game_daily_rank_sticker")) {
                        this.LL.getClass();
                        if (!InterfaceC1094280eaA.Qd.LIZIZ().booleanValue() && !InterfaceC1094280eaA.Md.LIZIZ().booleanValue() && !InterfaceC1094280eaA.Od.LIZIZ().booleanValue() && !InterfaceC1094280eaA.Nd.LIZIZ().booleanValue() && !InterfaceC1106030et7.B9.LIZIZ().booleanValue()) {
                            DataChannel dataChannel = this.LL.LIZ;
                            CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
                            SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                            dataChannel.LC0(GameRankTipsMessageEvent.class, new C776720UdS(capsuleMessage, C1810700xDg.LIZIZ(RankTypeV2.LJIILJJIL.type, false)));
                        }
                    }
                    if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "friend-guide")) {
                        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                        if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null && (user = capsuleBizParamsCohost.rivalUser) != null) {
                            id = user.getId();
                        } else {
                            id = 0;
                        }
                        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                        DataChannel dataChannel2 = this.LL.LIZ;
                        c1810690xDf.getClass();
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_live_notification_popup_show");
                        c474500IjALIZ.LJIJJLI(dataChannel2);
                        C1810690xDf.LIZ(c474500IjALIZ, dataChannel2);
                        c474500IjALIZ.LJJII(Long.valueOf(id), "suggested_anchor_id");
                        c474500IjALIZ.LJJII("bubble_guide", "show_type");
                        c474500IjALIZ.LJJII("friends_ranking_suggest_match", "guide_type");
                        c474500IjALIZ.LIZ();
                        C1810690xDf.LJIL(this.LL.LIZ, "suggest_capsule_quick_match", "suggest_match_capsule", true);
                        C1810690xDf.LJIJJLI(this.LL.LIZ, "suggest_capsule_quick_match", "suggest_match_capsule", true);
                        C1810690xDf.LJIJJ(this.LL.LIZ, "suggest_capsule_quick_match", true);
                    }
                }

                @Override // X.InterfaceC1112400f3O
                public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
                    String str;
                    CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
                    if (capsuleMessage != null) {
                        str = capsuleMessage.scene;
                    } else {
                        str = null;
                    }
                    RankTypeV2 rankTypeV2LJI = C1846800y9u.LJI(str);
                    if (rankTypeV2LJI != null) {
                        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                        map.put("rank_in_daily", String.valueOf(C1810700xDg.LIZIZ(rankTypeV2LJI.type, false)));
                    }
                    String creatorTypeName = LiveMusicSpotlightSetting.INSTANCE.getCreatorTypeName();
                    if (creatorTypeName != null) {
                        map.put("music_anchor_type", creatorTypeName);
                    }
                }

                @Override // X.C243200wo, X.InterfaceC1112400f3O
                public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
                    String str;
                    CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
                    if (capsuleMessage != null) {
                        str = capsuleMessage.scene;
                    } else {
                        str = null;
                    }
                    RankTypeV2 rankTypeV2LJI = C1846800y9u.LJI(str);
                    if (rankTypeV2LJI != null) {
                        SparseLongArray sparseLongArray = C1810700xDg.LIZ;
                        map.put("rank_in_daily", String.valueOf(C1810700xDg.LIZIZ(rankTypeV2LJI.type, false)));
                    }
                    String creatorTypeName = LiveMusicSpotlightSetting.INSTANCE.getCreatorTypeName();
                    if (creatorTypeName != null) {
                        map.put("music_anchor_type", creatorTypeName);
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.C243200wo, X.InterfaceC1112400f3O
                public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                    long id;
                    if (!TextUtils.isEmpty(capsuleMessage.scene)) {
                        String str = capsuleMessage.scene;
                        switch (str.hashCode()) {
                            case -1357157619:
                                if (!str.equals("friend-guide")) {
                                    return false;
                                }
                                C1118620fDQ c1118620fDQ = this.LL;
                                Room room = (Room) c1118620fDQ.LIZ.gg0(RoomChannel.class);
                                if (room != null) {
                                    id = room.getId();
                                } else {
                                    id = 0;
                                }
                                C1118630fDR c1118630fDRLIZ = c1118620fDQ.LIZ();
                                int value = LiveFriendsRankingSuggestMatchCapsuleConfig.INSTANCE.getValue();
                                boolean z = c1118630fDRLIZ.LIZIZ;
                                if (z) {
                                    return false;
                                }
                                int i = c1118630fDRLIZ.LIZ;
                                if (i >= value && id != c1118630fDRLIZ.LIZJ) {
                                    return true;
                                }
                                if (i >= value || id == c1118630fDRLIZ.LIZJ) {
                                    return false;
                                }
                                c1118620fDQ.LIZIZ(new C1118630fDR(i + 1, id, z));
                                return false;
                            case -1090784367:
                                if (!str.equals("class_rank_sticker")) {
                                    return false;
                                }
                                return InterfaceC1106030et7.B9.LIZIZ().booleanValue();
                            case -740831747:
                                if (!str.equals("game_daily_rank_sticker")) {
                                    return false;
                                }
                                return InterfaceC1094280eaA.Nd.LIZIZ().booleanValue();
                            case -285012848:
                                if (!str.equals("daily_rank_sticker")) {
                                    return false;
                                }
                                return InterfaceC1094280eaA.Md.LIZIZ().booleanValue();
                            case 702914360:
                                if (!str.equals("hourly_rank_sticker")) {
                                    return false;
                                }
                                return InterfaceC1094280eaA.Qd.LIZIZ().booleanValue();
                            default:
                                return false;
                        }
                    }
                    return false;
                }
            };
        }
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(6, this.LIZIZ);
    }

    @Override // X.InterfaceC1842870y3Z
    public final void release() {
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).cL0(6, this.LIZIZ);
    }

    public C1118620fDQ(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZIZ(C1118630fDR c1118630fDR) {
        this.LIZJ.LIZJ(C2097608Jq.LJIIJ(new Pair("seen_launch_count", String.valueOf(c1118630fDR.LIZ)), new Pair("clicked_within_first_3", String.valueOf(c1118630fDR.LIZIZ)), new Pair("last_room_id", String.valueOf(c1118630fDR.LIZJ))));
    }

    public static JSONObject LIZJ(User user, long j, long j2, GiftGalleryBadgeSection giftGalleryBadgeSection) throws JSONException {
        List urls;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j);
        jSONObject.put("channel_id", j2);
        jSONObject.put("user_id", user.getId());
        jSONObject.put("display_id", user.getDisplayId());
        jSONObject.put("sec_uid", user.getSecUid());
        jSONObject.put("nickname", user.getNickName());
        ImageModel avatarThumb = user.getAvatarThumb();
        if (avatarThumb == null || (urls = avatarThumb.getUrls()) == null) {
            urls = C13BV.INSTANCE;
        }
        jSONObject.put("avatar_urls", new JSONArray((Collection) urls));
        Gson gsonLIZ = C293501Bt.LIZ();
        GiftGalleryBadgeInfo giftGalleryBadgeInfo = new GiftGalleryBadgeInfo();
        giftGalleryBadgeInfo.leagueInfo = giftGalleryBadgeSection;
        jSONObject.put("badge", new JSONObject(GsonProtectorUtils.toJson(gsonLIZ, giftGalleryBadgeInfo)));
        return jSONObject;
    }
}
