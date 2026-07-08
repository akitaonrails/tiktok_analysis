package X;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.WalletPackage;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.EventUserInfo;

/* JADX INFO: renamed from: X.1DgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262061DgK implements InterfaceC2183511Acv<User> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC2183511Acv
    public final User LIZ(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            return null;
        }
        User user = new User();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -2106776814:
                        if (strNextName.equals("enigma_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.enigmaInfo = C2261781Dfs.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -2106552549:
                        if (strNextName.equals("combo_badge_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.comboBadgeInfo = C2261791Dft.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -2084080173:
                        if (strNextName.equals("constellation")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.constellation = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1994383672:
                        if (strNextName.equals("verified")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isVerified = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1866680164:
                        if (strNextName.equals("comment_restrict")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.commentRestrict = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1842481765:
                        if (strNextName.equals("share_qrcode_uri")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.shareQrcodeUri = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1690655204:
                        if (strNextName.equals("ticket_count")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.fanTicketCount = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1544567816:
                        if (strNextName.equals("anchor_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.anchorInfo = C2261801Dfu.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1517447189:
                        if (strNextName.equals("allow_find_by_contacts")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowFindByContacts = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1383304148:
                        if (strNextName.equals("border")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.border = C2261571DfX.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1345264599:
                        if (strNextName.equals("push_video_post")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushVideoPost = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1337458824:
                        if (strNextName.equals("nobleLevelInfo")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.nobleLevelInfo = C2261871Dg1.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1199361656:
                        if (strNextName.equals("shareLinkReceiver")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.shareLinkReceiver = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1193609971:
                        if (strNextName.equals("id_str")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.idStr = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1186684643:
                        if (strNextName.equals("allow_show_my_action")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowShowMyAction = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1091176654:
                        if (strNextName.equals("modify_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.modifyTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -1020146894:
                        if (strNextName.equals("deprecated21")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.payScores = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -997963167:
                        if (strNextName.equals("special_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.specialId = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -966435734:
                        if (strNextName.equals("top_fans")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.topFans = C2261301Df6.LIZIZ(jsonReader, new C2262061DgK());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -962123310:
                        if (strNextName.equals("avatar_border")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.avatarBorder = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -914519624:
                        if (strNextName.equals("display_id")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.username = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -906277200:
                        if (strNextName.equals("secret")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.secret = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -892481550:
                        if (strNextName.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.status = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -853517914:
                        if (strNextName.equals("webcast_anchor_level")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.anchorLevel = C2262091DgN.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -796264331:
                        if (strNextName.equals("is_subscribe")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isSubscribe = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -770141485:
                        if (strNextName.equals("push_video_recommend")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushVideoRecommend = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -769100246:
                        if (strNextName.equals("push_digg")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushDigg = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -757017881:
                        if (strNextName.equals("with_car_management_permission")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.enableCarManagementPermission = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -656849637:
                        if (strNextName.equals("avatar_medium")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.avatarMedium = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -620648865:
                        if (strNextName.equals("ichat_restrict_type")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.ichatRestrictType = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -601407516:
                        if (strNextName.equals("block_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.blockStatus = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -576407339:
                        if (strNextName.equals("avatar_large")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.avatarLarge = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -568807568:
                        if (strNextName.equals("avatar_thumb")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.avatarThumb = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -566305971:
                        if (strNextName.equals("top_vip_no")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.topVipNo = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -549282388:
                        if (strNextName.equals("mint_type_label")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.mintTypeLabel = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZIZ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -545190468:
                        if (strNextName.equals("is_following")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isFollowing = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -508235990:
                        if (strNextName.equals("disable_ichat")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.disableIchat = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -493574096:
                        if (strNextName.equals("create_time")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.createTime = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -485378688:
                        if (strNextName.equals("pay_grade")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.userHonor = C2262051DgJ.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -474729413:
                        if (strNextName.equals("pay_score")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.payScore = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -442563903:
                        if (strNextName.equals("mAvatarThumbStr")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.mAvatarThumbStr = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -433228909:
                        if (strNextName.equals("is_follower")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isFollower = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -406667365:
                        if (strNextName.equals("verified_reason")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.verifiedReason = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -402835461:
                        if (strNextName.equals("avatar_jpg")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.avatarJpg = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -387443899:
                        if (strNextName.equals("bio_description")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.signature = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -308004746:
                        if (strNextName.equals("push_follow")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushFollow = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -198550059:
                        if (strNextName.equals("fans_club")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.fansClub = C2261451DfL.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -183151534:
                        if (strNextName.equals("scm_label")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.scmLabel = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -179123674:
                        if (strNextName.equals("upcoming_event_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.upcomingEventList = C2261301Df6.LIZIZ(jsonReader, new InterfaceC2183511Acv<LiveEventInfo>() { // from class: X.1DfS
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    @Override // X.InterfaceC2183511Acv
                                    public final LiveEventInfo LIZ(JsonReader jsonReader2) throws IOException {
                                        if (jsonReader2.peek() == JsonToken.NULL) {
                                            return null;
                                        }
                                        LiveEventInfo liveEventInfo = new LiveEventInfo();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName2 = jsonReader2.nextName();
                                            if (strNextName2 != null) {
                                                switch (strNextName2.hashCode()) {
                                                    case -2069481060:
                                                        if (strNextName2.equals("is_paid_event")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.isPaidEvent = Boolean.valueOf(jsonReader2.nextBoolean());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -2001498024:
                                                        if (strNextName2.equals("pay_method")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.payMethod = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1992012396:
                                                        if (strNextName2.equals("duration")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.duration = Long.valueOf(jsonReader2.nextLong());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1963502358:
                                                        if (strNextName2.equals("subscribed_count")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.subscribedCount = jsonReader2.nextLong();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1900623073:
                                                        if (strNextName2.equals("has_subscribed")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.subscribed = Boolean.valueOf(jsonReader2.nextBoolean());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1724546052:
                                                        if (strNextName2.equals("description")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.description = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1573145462:
                                                        if (strNextName2.equals("start_time")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.startTime = Long.valueOf(jsonReader2.nextLong());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1389901994:
                                                        if (strNextName2.equals("register_type")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.registerType = jsonReader2.nextLong();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -929981205:
                                                        if (strNextName2.equals("ticket_amount")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.ticketAmount = Long.valueOf(jsonReader2.nextLong());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -250439729:
                                                        if (strNextName2.equals("wallet_pkg_dict")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.walletPkgDict = C2261341DfA.LIZIZ(jsonReader2, C2261421DfI.LIZJ, new InterfaceC2183511Acv<WalletPackage>() { // from class: X.1DfT
                                                                    public static WalletPackage LIZIZ(JsonReader jsonReader3) throws IOException {
                                                                        if (jsonReader3.peek() == JsonToken.NULL) {
                                                                            return null;
                                                                        }
                                                                        WalletPackage walletPackage = new WalletPackage();
                                                                        jsonReader3.beginObject();
                                                                        while (jsonReader3.hasNext()) {
                                                                            String strNextName3 = jsonReader3.nextName();
                                                                            if (Intrinsics.LJFF(strNextName3, "iap_id")) {
                                                                                if (jsonReader3.peek() != JsonToken.NULL) {
                                                                                    walletPackage.iapId = jsonReader3.nextString();
                                                                                } else {
                                                                                    jsonReader3.nextNull();
                                                                                }
                                                                            } else if (Intrinsics.LJFF(strNextName3, "usd_price_show")) {
                                                                                if (jsonReader3.peek() != JsonToken.NULL) {
                                                                                    walletPackage.usdPriceShow = jsonReader3.nextString();
                                                                                } else {
                                                                                    jsonReader3.nextNull();
                                                                                }
                                                                            } else {
                                                                                jsonReader3.skipValue();
                                                                            }
                                                                        }
                                                                        jsonReader3.endObject();
                                                                        return walletPackage;
                                                                    }

                                                                    @Override // X.InterfaceC2183511Acv
                                                                    public final /* bridge */ /* synthetic */ WalletPackage LIZ(JsonReader jsonReader3) {
                                                                        return LIZIZ(jsonReader3);
                                                                    }
                                                                });
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -113484174:
                                                        if (strNextName2.equals("periodic_shows")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.periodicShows = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 67052272:
                                                        if (strNextName2.equals("paid_event_preview")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.paidEventPreview = C2261541DfU.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 110371416:
                                                        if (strNextName2.equals("title")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.title = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 278118624:
                                                        if (strNextName2.equals("event_id")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.eventId = Long.valueOf(jsonReader2.nextLong());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 720129341:
                                                        if (strNextName2.equals("event_user_info")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.eventUserInfo = C2261301Df6.LIZIZ(jsonReader2, new InterfaceC2183511Acv<EventUserInfo>() { // from class: X.1DfR
                                                                    @Override // X.InterfaceC2183511Acv
                                                                    public final EventUserInfo LIZ(JsonReader jsonReader3) throws IOException {
                                                                        if (jsonReader3.peek() == JsonToken.NULL) {
                                                                            return null;
                                                                        }
                                                                        EventUserInfo eventUserInfo = new EventUserInfo();
                                                                        jsonReader3.beginObject();
                                                                        while (jsonReader3.hasNext()) {
                                                                            String strNextName3 = jsonReader3.nextName();
                                                                            if (Intrinsics.LJFF(strNextName3, "avatar_uri")) {
                                                                                if (jsonReader3.peek() != JsonToken.NULL) {
                                                                                    eventUserInfo.avatarUri = jsonReader3.nextString();
                                                                                } else {
                                                                                    jsonReader3.nextNull();
                                                                                }
                                                                            } else if (Intrinsics.LJFF(strNextName3, "user_id")) {
                                                                                if (jsonReader3.peek() != JsonToken.NULL) {
                                                                                    eventUserInfo.userId = jsonReader3.nextLong();
                                                                                } else {
                                                                                    jsonReader3.nextNull();
                                                                                }
                                                                            } else {
                                                                                jsonReader3.skipValue();
                                                                            }
                                                                        }
                                                                        jsonReader3.endObject();
                                                                        return eventUserInfo;
                                                                    }
                                                                });
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1104876871:
                                                        if (strNextName2.equals("periodic_settings")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.periodicSettings = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1503405568:
                                                        if (strNextName2.equals("wallet_package")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                liveEventInfo.walletPackage = C2261531DfT.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            jsonReader2.skipValue();
                                        }
                                        jsonReader2.endObject();
                                        return liveEventInfo;
                                    }
                                });
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -159950707:
                        if (strNextName.equals("allow_unfollower_comment")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowUnfollowerComment = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -60041795:
                        if (strNextName.equals("allow_show_in_gossip")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowShowInGossip = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case -4683530:
                        if (strNextName.equals("mAvatarMediumStr")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.mAvatarMediumStr = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 3355:
                        if (strNextName.equals(FollowStatusChangeMethod.PARAM_UID)) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.id = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 100893:
                        if (strNextName.equals("exp")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.exp = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2166229:
                        if (strNextName.equals("ecommerce_entrance")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.ecommerceEntrance = C2261231Dez.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 42004114:
                        if (strNextName.equals("push_friend_action")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushFriendAction = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 68471991:
                        if (strNextName.equals("push_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushStatus = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 70690926:
                        if (strNextName.equals("nickname")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.nickName = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 103148630:
                        if (strNextName.equals("logPb")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.setLogPb(jsonReader.nextString());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 103771895:
                        if (strNextName.equals("medal")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.medal = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 108801336:
                        if (strNextName.equals("is_block")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isBlock = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 119700931:
                        if (strNextName.equals("fold_stranger_chat")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.foldStrangerChat = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 134422781:
                        if (strNextName.equals("need_profile_guide")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.needProfileGuide = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 148877826:
                        if (strNextName.equals("verified_content")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.verifiedContent = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 184139289:
                        if (strNextName.equals("media_badge_image_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.mediaBadgeImageList = C2261301Df6.LIZIZ(jsonReader, new C2261331Df9());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 225717655:
                        if (strNextName.equals("push_comment_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushCommentStatus = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 271884198:
                        if (strNextName.equals("allow_strange_comment")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowStrangeComment = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 338972133:
                        if (strNextName.equals("user_attr")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.userAttr = C2261461DfM.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 339473514:
                        if (strNextName.equals("user_role")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.userRole = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 537437498:
                        if (strNextName.equals("fraternityInfo")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.fraternityInfo = C2261841Dfy.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 551736993:
                        if (strNextName.equals("is_anchor_marked")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.isAnchorMarked = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 580711855:
                        if (strNextName.equals("personal_card")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.personalCard = C2261331Df9.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 632927467:
                        if (strNextName.equals("author_stats")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.authorInfo = C2261901Dg4.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 635279967:
                        if (strNextName.equals("activity_reward")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.rewardInfo = C2261851Dfz.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 682243746:
                        if (strNextName.equals("link_mic_stats")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.linkMicStats = jsonReader.nextInt();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 693933066:
                        if (strNextName.equals("requestId")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.setRequestId(jsonReader.nextString());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 712806649:
                        if (strNextName.equals("bg_img_url")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.backgroundImgUrl = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 722963807:
                        if (strNextName.equals("allow_use_linkmic")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowUseLinkmic = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 748597457:
                        if (strNextName.equals("border_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.borders = C2261301Df6.LIZIZ(jsonReader, new InterfaceC2183511Acv<BorderInfo>() { // from class: X.1DfX
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    public static BorderInfo LIZIZ(JsonReader jsonReader2) throws IOException {
                                        if (jsonReader2.peek() == JsonToken.NULL) {
                                            return null;
                                        }
                                        BorderInfo borderInfo = new BorderInfo();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName2 = jsonReader2.nextName();
                                            if (strNextName2 != null) {
                                                switch (strNextName2.hashCode()) {
                                                    case -2087549482:
                                                        if (strNextName2.equals("desc_starling_key")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.descStarlingKey = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1835022415:
                                                        if (strNextName2.equals("profile_privilege_log_extra")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.ribbonLogExtra = C2261561DfW.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1724546052:
                                                        if (strNextName2.equals("description")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.description = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1261808972:
                                                        if (strNextName2.equals("border_privilege_log_extra")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.borderLogExtra = C2261561DfW.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1196479688:
                                                        if (strNextName2.equals("avatar_background_color")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.avatarBackgroundColor = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1020448741:
                                                        if (strNextName2.equals("avatar_background_border_color")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.avatarBackgroundBorderColor = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -896505829:
                                                        if (strNextName2.equals("source")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.source = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -863711204:
                                                        if (strNextName2.equals("name_starling_key")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.nameStarlingKey = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 3226745:
                                                        if (strNextName2.equals("icon")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.icon = C2261331Df9.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (strNextName2.equals("name")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.name = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 102865796:
                                                        if (strNextName2.equals("level")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.level = jsonReader2.nextLong();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 481033775:
                                                        if (strNextName2.equals("profile_decoration_ribbon")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.profileDecorationRibbon = C2261331Df9.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1519301220:
                                                        if (strNextName2.equals("is_taller_avatar_background")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                borderInfo.isTallerAvatarBackground = jsonReader2.nextBoolean();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            jsonReader2.skipValue();
                                        }
                                        jsonReader2.endObject();
                                        return borderInfo;
                                    }

                                    @Override // X.InterfaceC2183511Acv
                                    public final /* bridge */ /* synthetic */ BorderInfo LIZ(JsonReader jsonReader2) {
                                        return LIZIZ(jsonReader2);
                                    }
                                });
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 780233163:
                        if (strNextName.equals("with_fusion_shop_entry")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.withFusionShopEntry = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 785924924:
                        if (strNextName.equals("mAvatarLargeStr")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.mAvatarLargeStr = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 847939770:
                        if (strNextName.equals("with_commerce_permission")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.enableShowCommerceSale = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 967580888:
                        if (strNextName.equals("fans_club_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.fansClubInfo = C2261761Dfq.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1028143168:
                        if (strNextName.equals("follow_status")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.followStatus = Long.valueOf(jsonReader.nextLong());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1080662970:
                        if (strNextName.equals("badge_list")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.badgeList = C2261301Df6.LIZIZ(jsonReader, new InterfaceC2183511Acv<BadgeStruct>() { // from class: X.1Dfa
                                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                                    @Override // X.InterfaceC2183511Acv
                                    public final BadgeStruct LIZ(JsonReader jsonReader2) throws IOException {
                                        if (jsonReader2.peek() == JsonToken.NULL) {
                                            return null;
                                        }
                                        BadgeStruct badgeStruct = new BadgeStruct();
                                        jsonReader2.beginObject();
                                        while (jsonReader2.hasNext()) {
                                            String strNextName2 = jsonReader2.nextName();
                                            if (strNextName2 != null) {
                                                switch (strNextName2.hashCode()) {
                                                    case -1852744571:
                                                        if (strNextName2.equals("OpenWebURL")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.schemaUrl = jsonReader2.nextString();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -1549474446:
                                                        if (strNextName2.equals("greyed_by_client")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.greyedByClient = jsonReader2.nextLong();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case -693690553:
                                                        if (strNextName2.equals("privilege_log_extra")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.logExtra = C2261561DfW.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 114225:
                                                        if (strNextName2.equals("str")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.stringBadge = C2261691Dfj.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 3556653:
                                                        if (strNextName2.equals("text")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.textBadge = C2261591DfZ.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 100313435:
                                                        if (strNextName2.equals("image")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.imageBadge = C2261651Dff.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 228752298:
                                                        if (strNextName2.equals("exhibition_type")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.exhibitionType = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 724321974:
                                                        if (strNextName2.equals("is_customized")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.isCustomized = jsonReader2.nextBoolean();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 747804969:
                                                        if (strNextName2.equals("position")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.position = Integer.valueOf(jsonReader2.nextInt());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 841430261:
                                                        if (strNextName2.equals("priority_type")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.badgePriorityType = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 950074687:
                                                        if (strNextName2.equals("combine")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.combineBadgeStruct = C2261611Dfb.LIZIZ(jsonReader2);
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1615288471:
                                                        if (strNextName2.equals("display_type")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.badgeDisplayType = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1671764162:
                                                        if (strNextName2.equals("display")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.display = jsonReader2.nextBoolean();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 1775351311:
                                                        if (strNextName2.equals("display_status")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.displayStatus = Integer.valueOf(jsonReader2.nextInt());
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                    case 2080614157:
                                                        if (strNextName2.equals("scene_type")) {
                                                            if (jsonReader2.peek() != JsonToken.NULL) {
                                                                badgeStruct.badgeScene = jsonReader2.nextInt();
                                                            } else {
                                                                jsonReader2.nextNull();
                                                            }
                                                        }
                                                        break;
                                                }
                                            }
                                            jsonReader2.skipValue();
                                        }
                                        jsonReader2.endObject();
                                        return badgeStruct;
                                    }
                                });
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1120692329:
                        if (strNextName.equals("real_time_icons")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.userBadges = C2261301Df6.LIZIZ(jsonReader, new C2261331Df9());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1132832587:
                        if (strNextName.equals("commerce_webcast_config_ids")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.commerceWebcastConfigIds = C2261301Df6.LIZIZ(jsonReader, C2261421DfI.LIZIZ);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1211551241:
                        if (strNextName.equals("enable_ichat_img")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.enableIchatImg = jsonReader.nextLong();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1260947946:
                        if (strNextName.equals("allow_others_download_video")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowOthersDownloadVideo = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1344734741:
                        if (strNextName.equals("authentication_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.authenticationInfo = C2261891Dg3.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1499790979:
                        if (strNextName.equals("subscribe_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.subscribeInfo = C2261911Dg5.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1596295292:
                        if (strNextName.equals("follow_info")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.followInfo = C2261831Dfx.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1657622004:
                        if (strNextName.equals("own_room")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.ownRoom = C2261751Dfp.LIZIZ(jsonReader);
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1671964618:
                        if (strNextName.equals("new_real_time_icons")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.newUserBadges = C2261301Df6.LIZIZ(jsonReader, new C2261331Df9());
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1876344701:
                        if (strNextName.equals("allow_share_show_profile")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowShareShowProfile = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1932135900:
                        if (strNextName.equals("push_ichat")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.pushIchat = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 1969626978:
                        if (strNextName.equals("sec_uid")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.secUid = jsonReader.nextString();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                    case 2020653572:
                        if (strNextName.equals("allow_others_download_when_sharing_video")) {
                            if (jsonReader.peek() != JsonToken.NULL) {
                                user.allowOthersDownloadWhenSharingVideo = jsonReader.nextBoolean();
                            } else {
                                jsonReader.nextNull();
                            }
                        }
                        break;
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return user;
    }
}
