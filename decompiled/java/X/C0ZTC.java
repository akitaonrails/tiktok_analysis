package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BrandInvitationContent;
import com.ss.android.ugc.aweme.im.message.content.CommentContent;
import com.ss.android.ugc.aweme.im.message.content.GifContent;
import com.ss.android.ugc.aweme.im.message.content.GroupInviteCardContent;
import com.ss.android.ugc.aweme.im.message.content.SayHelloContent;
import com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareChallengeContent;
import com.ss.android.ugc.aweme.im.message.content.ShareCompilationContent;
import com.ss.android.ugc.aweme.im.message.content.ShareEffectContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveEventContent;
import com.ss.android.ugc.aweme.im.message.content.ShareMusicContent;
import com.ss.android.ugc.aweme.im.message.content.ShareProductContent;
import com.ss.android.ugc.aweme.im.message.content.ShareQnAContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSearchContent;
import com.ss.android.ugc.aweme.im.message.content.ShareStoryContent;
import com.ss.android.ugc.aweme.im.message.content.ShareSubscribeInviteContent;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.ShareWebContent;
import com.ss.android.ugc.aweme.im.message.content.SystemCardContent;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.saas.host.api.share.ISharePackageWrapper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZTC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTC extends C09AY implements Function0<C900530ZUl> {
    public C0ZTC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ZUl] */
    @Override // kotlin.jvm.functions.Function0
    public final C900530ZUl invoke() {
        return new InterfaceC896020ZDc() { // from class: X.0ZUl
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
            
                if (r4.equals("multi_live") == false) goto L4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
            
                if (r4.equals("aweme_photo") == false) goto L4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:200:0x0617, code lost:
            
                if (r29.extras.getBoolean("is_sub_only_video", false) == false) goto L215;
             */
            /* JADX WARN: Code restructure failed: missing block: B:201:0x0619, code lost:
            
                r14 = new com.ss.android.ugc.aweme.im.message.content.ShareSubOnlyVideoContent();
                r14.setUser(r29.extras.getString("uid_for_share"));
                r14.setSecUid(r29.extras.getString("sec_user_id"));
                r14.setItemId(r29.extras.getString("item_id_string"));
                r1 = r29.extras.getSerializable("video_cover");
             */
            /* JADX WARN: Code restructure failed: missing block: B:202:0x0641, code lost:
            
                if ((r1 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L214;
             */
            /* JADX WARN: Code restructure failed: missing block: B:203:0x0643, code lost:
            
                r1 = (com.ss.android.ugc.aweme.base.model.UrlModel) r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:204:0x0645, code lost:
            
                r14.setCoverUrl(r1);
                r1 = r29.extras.getSerializable("thumb_for_share");
             */
            /* JADX WARN: Code restructure failed: missing block: B:205:0x0650, code lost:
            
                if ((r1 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L213;
             */
            /* JADX WARN: Code restructure failed: missing block: B:206:0x0652, code lost:
            
                r1 = (com.ss.android.ugc.aweme.base.model.UrlModel) r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:207:0x0654, code lost:
            
                r14.setContentThumb(r1);
                r14.setContentName(r29.extras.getString("author_name"));
                r14.setAuthorUsername(r29.extras.getString("author_username"));
                r14.setAdFake(r29.extras.getBoolean("is_ad_fake"));
                r14.setWidth(r29.extras.getInt("aweme_width"));
                r14.setHeight(r29.extras.getInt("aweme_height"));
                r14.setHotSpotVideo(r29.extras.getBoolean("is_hot_spot_video"));
                r14.setHotSpotCreateTime(java.lang.System.currentTimeMillis());
             */
            /* JADX WARN: Code restructure failed: missing block: B:208:0x069e, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.LJFF(r29.itemType, "aweme_photo") == false) goto L212;
             */
            /* JADX WARN: Code restructure failed: missing block: B:209:0x06a0, code lost:
            
                r14.setAwemeType(150);
                r14.type = 810;
                r2 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:210:0x06aa, code lost:
            
                r14.setTitle(r29.extras.getString("desc"));
                r14.setDiamondGameId(r29.extras.getString("diamond_game_id"));
                r14.setNeedSkipStrange(r29.extras.getInt("key_message_source", r2));
             */
            /* JADX WARN: Code restructure failed: missing block: B:211:0x06c9, code lost:
            
                return r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:212:0x06ca, code lost:
            
                r2 = 0;
                r14.setAwemeType(0);
                r14.type = 800;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x06d3, code lost:
            
                r1 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x06d5, code lost:
            
                r1 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:216:0x06e4, code lost:
            
                if (r29.extras.getBoolean("is_story", false) == false) goto L227;
             */
            /* JADX WARN: Code restructure failed: missing block: B:217:0x06e6, code lost:
            
                r14 = new com.ss.android.ugc.aweme.im.message.content.ShareStoryContent();
                r6 = r29.extras;
                r14.setUser(r6.getString("uid_for_share"));
                r14.setSecUid(r6.getString("sec_user_id"));
                r14.setItemId(r6.getString("item_id_string"));
                r2 = r6.getSerializable("video_cover");
             */
            /* JADX WARN: Code restructure failed: missing block: B:218:0x0708, code lost:
            
                if ((r2 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L226;
             */
            /* JADX WARN: Code restructure failed: missing block: B:219:0x070a, code lost:
            
                r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:220:0x070c, code lost:
            
                r14.setCoverUrl(r2);
                r2 = r6.getSerializable("thumb_for_share");
             */
            /* JADX WARN: Code restructure failed: missing block: B:221:0x0715, code lost:
            
                if ((r2 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L225;
             */
            /* JADX WARN: Code restructure failed: missing block: B:222:0x0717, code lost:
            
                r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:223:0x0719, code lost:
            
                r14.setContentThumb(r2);
                r14.setContentName(r6.getString("author_name"));
                r14.setWidth(r6.getInt("aweme_width"));
                r14.setHeight(r6.getInt("aweme_height"));
                r14.setTitle(r6.getString("desc"));
                r14.setExpireAt(java.lang.Long.valueOf(r6.getLong("expired_at", 0)));
                r14.setSourceType(java.lang.Integer.valueOf(r6.getInt("source_type", 0)));
                r14.setAwemeType(r6.getInt("aweme_type"));
                r14.type = com.ss.android.ugc.aweme.im.message.content.ShareStoryContent.Companion.getAweType(r14.getSourceType());
                r14.setStory(r6.getBoolean("is_story"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:224:0x0773, code lost:
            
                return r14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:225:0x0774, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:226:0x0776, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:227:0x0778, code lost:
            
                r1 = new com.ss.android.ugc.aweme.im.message.content.ShareAwemeContent();
                r1.setUser(r29.extras.getString("uid_for_share"));
                r1.setSecUid(r29.extras.getString("sec_user_id"));
                r1.setItemId(r29.extras.getString("item_id_string"));
                r2 = r29.extras.getSerializable("video_cover");
             */
            /* JADX WARN: Code restructure failed: missing block: B:228:0x07a0, code lost:
            
                if ((r2 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L240;
             */
            /* JADX WARN: Code restructure failed: missing block: B:229:0x07a2, code lost:
            
                r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:230:0x07a4, code lost:
            
                r1.setCoverUrl(r2);
                r2 = r29.extras.getSerializable("thumb_for_share");
             */
            /* JADX WARN: Code restructure failed: missing block: B:231:0x07af, code lost:
            
                if ((r2 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L239;
             */
            /* JADX WARN: Code restructure failed: missing block: B:232:0x07b1, code lost:
            
                r2 = (com.ss.android.ugc.aweme.base.model.UrlModel) r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:233:0x07b3, code lost:
            
                r1.setContentThumb(r2);
                r1.setContentName(r29.extras.getString("author_name"));
                r1.setAuthorUsername(r29.extras.getString("author_username"));
                r1.setAdFake(r29.extras.getBoolean("is_ad_fake"));
                r1.setWidth(r29.extras.getInt("aweme_width"));
                r1.setHeight(r29.extras.getInt("aweme_height"));
                r1.setHotSpotVideo(r29.extras.getBoolean("is_hot_spot_video"));
                r1.setHotSpotCreateTime(java.lang.System.currentTimeMillis());
             */
            /* JADX WARN: Code restructure failed: missing block: B:234:0x07fd, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.LJFF(r29.itemType, "aweme_photo") == false) goto L238;
             */
            /* JADX WARN: Code restructure failed: missing block: B:235:0x07ff, code lost:
            
                r1.setAwemeType(150);
                r1.type = 810;
                r3 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:236:0x0809, code lost:
            
                r1.setTitle(r29.extras.getString("desc"));
                r1.setDiamondGameId(r29.extras.getString("diamond_game_id"));
                r1.setNeedSkipStrange(r29.extras.getInt("key_message_source", r3));
             */
            /* JADX WARN: Code restructure failed: missing block: B:237:0x0828, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:238:0x0829, code lost:
            
                r3 = 0;
                r1.setAwemeType(0);
                r1.type = 800;
             */
            /* JADX WARN: Code restructure failed: missing block: B:239:0x0832, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:240:0x0834, code lost:
            
                r2 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:241:0x0837, code lost:
            
                r13 = new com.ss.android.ugc.aweme.im.message.content.ShareLiveContent(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                r13.setRoomId(r29.identifier);
                r13.setRoomOwnerId(r29.extras.getString("live_id"));
                r13.setRoomSecOwnerId(r29.extras.getString("sec_user_id"));
                r13.setRoomOwnerName(r29.extras.getString("author_name"));
                r13.setShareLiveIntent(r29.extras.getString("share_live_intent"));
                r13.setShareLiveTraceId(r29.extras.getString("share_live_trace_id"));
                r2 = r29.extras.getString("live_referral_key");
             */
            /* JADX WARN: Code restructure failed: missing block: B:242:0x0896, code lost:
            
                if (r2 == null) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:244:0x089c, code lost:
            
                if (kotlin.text.a0.LJJJIL(r2) != false) goto L246;
             */
            /* JADX WARN: Code restructure failed: missing block: B:245:0x089e, code lost:
            
                r13.setExtraJump(new com.ss.android.ugc.aweme.im.message.content.LiveExtraJump(2, r2));
             */
            /* JADX WARN: Code restructure failed: missing block: B:247:0x08af, code lost:
            
                if (X.C895820ZCi.LIZIZ(r13) == false) goto L249;
             */
            /* JADX WARN: Code restructure failed: missing block: B:248:0x08b1, code lost:
            
                r13.type = 2101;
             */
            /* JADX WARN: Code restructure failed: missing block: B:250:0x08bf, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.LJFF(r13.getShareLiveIntent(), "play_together_invite") == false) goto L258;
             */
            /* JADX WARN: Code restructure failed: missing block: B:251:0x08c1, code lost:
            
                r0 = r13.getRoomOwnerId();
             */
            /* JADX WARN: Code restructure failed: missing block: B:252:0x08c5, code lost:
            
                if (r0 == null) goto L258;
             */
            /* JADX WARN: Code restructure failed: missing block: B:253:0x08c7, code lost:
            
                r0 = X.C2095008Iq.LJIILIIL(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:254:0x08cb, code lost:
            
                if (r0 == null) goto L258;
             */
            /* JADX WARN: Code restructure failed: missing block: B:256:0x08d7, code lost:
            
                if (X.C461720I8s.LIZJ() != r0.longValue()) goto L258;
             */
            /* JADX WARN: Code restructure failed: missing block: B:257:0x08d9, code lost:
            
                r13.type = 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:258:0x08dc, code lost:
            
                r13.setItemType(r29.itemType);
                r4 = r29.extras.getSerializable("thumb_for_share");
                r3 = r4 instanceof com.ss.android.ugc.aweme.base.model.UrlModel;
             */
            /* JADX WARN: Code restructure failed: missing block: B:259:0x08e9, code lost:
            
                if (r3 == false) goto L261;
             */
            /* JADX WARN: Code restructure failed: missing block: B:260:0x08eb, code lost:
            
                r13.setRoomOwnerAvatar((com.ss.android.ugc.aweme.base.model.UrlModel) r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:261:0x08f1, code lost:
            
                r13.setPushDetail(r29.extras.getString("author_name"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:262:0x0902, code lost:
            
                if (r29.extras.containsKey("room_title") == false) goto L264;
             */
            /* JADX WARN: Code restructure failed: missing block: B:263:0x0904, code lost:
            
                r13.setRoomDesc(r29.extras.getString("room_title"));
             */
            /* JADX WARN: Code restructure failed: missing block: B:265:0x0919, code lost:
            
                if (r29.extras.getLong("room_id", 0) != 0) goto L267;
             */
            /* JADX WARN: Code restructure failed: missing block: B:266:0x091b, code lost:
            
                r13.setRoomDesc(X.C20642515q3.LJI(2131847867));
             */
            /* JADX WARN: Code restructure failed: missing block: B:267:0x0925, code lost:
            
                r1 = r29.extras.getSerializable("video_cover");
             */
            /* JADX WARN: Code restructure failed: missing block: B:268:0x092d, code lost:
            
                if ((r1 instanceof com.ss.android.ugc.aweme.base.model.UrlModel) == false) goto L271;
             */
            /* JADX WARN: Code restructure failed: missing block: B:269:0x092f, code lost:
            
                r13.setRoomCover((com.ss.android.ugc.aweme.base.model.UrlModel) r1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:270:0x0934, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:271:0x0935, code lost:
            
                if (r3 == false) goto L274;
             */
            /* JADX WARN: Code restructure failed: missing block: B:272:0x0937, code lost:
            
                r13.setRoomCover((com.ss.android.ugc.aweme.base.model.UrlModel) r4);
             */
            /* JADX WARN: Code restructure failed: missing block: B:273:0x093c, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:274:0x093d, code lost:
            
                r13.setRoomCover(null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:275:0x0940, code lost:
            
                return r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
            
                if (r4.equals("story_highlight") == false) goto L4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x02c5, code lost:
            
                if (r4.equals("aweme") == false) goto L4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x0330, code lost:
            
                if (r4.equals("live") == false) goto L4;
             */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC896020ZDc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.ss.android.ugc.aweme.im.message.content.BaseContent LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r29) {
                /*
                    Method dump skipped, instruction units count: 2518
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C900530ZUl.LIZIZ(com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):com.ss.android.ugc.aweme.im.message.content.BaseContent");
            }

            public static SharePackage LIZLLL(Bundle bundle, String str) {
                C1370940lmO c1370940lmO = new C1370940lmO();
                c1370940lmO.LJII = bundle;
                c1370940lmO.LIZ = str;
                return new SharePackage(c1370940lmO);
            }

            @Override // X.InterfaceC896020ZDc
            public final SharePackage LIZ(C869590Y9l c869590Y9l, BaseContent baseContent, Bundle bundle) {
                long jLongValue;
                String uniqueId;
                String nickname;
                UrlModel urlModel = null;
                if ((baseContent instanceof BrandInvitationContent) || (baseContent instanceof SystemCardContent) || (baseContent instanceof SystemContent) || (baseContent instanceof SayHelloContent)) {
                    return null;
                }
                if (baseContent instanceof CommentContent) {
                    CommentContent commentContent = (CommentContent) baseContent;
                    ISharePackageWrapper.LIZ.getClass();
                    ISharePackageWrapper value = C900540ZUm.LIZIZ.getValue();
                    if (value == null) {
                        return null;
                    }
                    return value.LIZ(commentContent);
                }
                String strLJIILJJIL = "";
                if (baseContent instanceof GroupInviteCardContent) {
                    GroupInviteCardContent groupInviteCardContent = (GroupInviteCardContent) baseContent;
                    SharePackage sharePackageLIZLLL = LIZLLL(bundle, "group");
                    Bundle bundle2 = sharePackageLIZLLL.extras;
                    C786410Ut5.LJJJI("invite_id", groupInviteCardContent.getInviteId(), bundle2);
                    Long expiredAt = groupInviteCardContent.getExpiredAt();
                    if (expiredAt != null) {
                        bundle2.putLong("expired_at", expiredAt.longValue());
                    }
                    C786410Ut5.LJJIZ(bundle2, "group", String.valueOf(groupInviteCardContent.getGroup()));
                    User userLIZLLL = C461720I8s.LIZLLL();
                    if (userLIZLLL != null && (nickname = userLIZLLL.getNickname()) != null) {
                        strLJIILJJIL = nickname;
                    } else {
                        User userLIZLLL2 = C461720I8s.LIZLLL();
                        if (userLIZLLL2 != null && (uniqueId = userLIZLLL2.getUniqueId()) != null) {
                            strLJIILJJIL = uniqueId;
                        }
                    }
                    C786410Ut5.LJJJI("inviter_name", strLJIILJJIL, bundle2);
                    return sharePackageLIZLLL;
                }
                if (baseContent instanceof GifContent) {
                    GifContent gifContent = (GifContent) baseContent;
                    if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIILLIIL(c869590Y9l)) {
                        SharePackage sharePackageLIZLLL2 = LIZLLL(bundle, "nudge");
                        Bundle bundle3 = sharePackageLIZLLL2.extras;
                        C786410Ut5.LJJIZ(bundle3, "video_cover", sharePackageLIZLLL2.url);
                        bundle3.putInt("aweme_type", gifContent.type);
                        if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIIZILJ(c869590Y9l)) {
                            strLJIILJJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJ(false);
                        } else if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIIIZ(c869590Y9l)) {
                            strLJIILJJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJJ(true);
                        } else if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIJI(c869590Y9l)) {
                            strLJIILJJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIILJJIL(false);
                        } else if (C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIJ(c869590Y9l)) {
                            strLJIILJJIL = C1336205Ku.LIZ(false).getImNudgeAndStreakService().LJIILJJIL(true);
                        }
                        C786410Ut5.LJJJI("a:src", strLJIILJJIL, bundle3);
                        bundle3.putBoolean("is_receive", !C0ZDX.LJJJJIZL(c869590Y9l));
                        return sharePackageLIZLLL2;
                    }
                    SharePackage sharePackageLIZLLL3 = LIZLLL(bundle, "gif");
                    Bundle bundle4 = sharePackageLIZLLL3.extras;
                    C786410Ut5.LJJIZ(bundle4, "video_cover", gifContent.getUrl());
                    bundle4.putInt("aweme_type", gifContent.type);
                    String stickerId = gifContent.getStickerId();
                    if (stickerId != null) {
                        strLJIILJJIL = stickerId;
                    }
                    C786410Ut5.LJJJI("sticker_id", strLJIILJJIL, bundle4);
                    return sharePackageLIZLLL3;
                }
                if (baseContent instanceof ShareStoryContent) {
                    ShareStoryContent shareStoryContent = (ShareStoryContent) baseContent;
                    SharePackage sharePackageLIZLLL4 = LIZLLL(bundle, "story_video");
                    Bundle bundle5 = sharePackageLIZLLL4.extras;
                    bundle5.putInt("aweme_type", shareStoryContent.getAwemeType());
                    C786410Ut5.LJJJI("item_id_string", shareStoryContent.getItemId(), bundle5);
                    C786410Ut5.LJJJI("author_id", shareStoryContent.getUser(), bundle5);
                    C786410Ut5.LJJJI("author_name", shareStoryContent.getContentName(), bundle5);
                    C786410Ut5.LJJIZ(bundle5, "video_cover", shareStoryContent.getCoverUrl());
                    C786410Ut5.LJJIZ(bundle5, "thumb_for_share", shareStoryContent.getContentThumb());
                    C786410Ut5.LJJJI("desc", sharePackageLIZLLL4.title, bundle5);
                    Long expireAt = shareStoryContent.getExpireAt();
                    if (expireAt != null) {
                        jLongValue = expireAt.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    bundle5.putLong("expired_at", jLongValue);
                    bundle5.putInt("source_type", 3);
                    bundle5.putInt("aweme_height", (int) shareStoryContent.getHeight());
                    bundle5.putInt("aweme_width", (int) shareStoryContent.getWidth());
                    bundle5.putInt("aweme_type", shareStoryContent.type);
                    bundle5.putBoolean("is_story", shareStoryContent.isStory());
                    return sharePackageLIZLLL4;
                }
                if (baseContent instanceof ShareAwemeContent) {
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
                    SharePackage sharePackageLIZLLL5 = LIZLLL(bundle, "aweme");
                    Bundle bundle6 = sharePackageLIZLLL5.extras;
                    bundle6.putInt("aweme_type", shareAwemeContent.getAwemeType());
                    C786410Ut5.LJJJI("item_id_string", shareAwemeContent.getItemId(), bundle6);
                    C786410Ut5.LJJJI("author_id", shareAwemeContent.getUser(), bundle6);
                    C786410Ut5.LJJIZ(bundle6, "video_cover", shareAwemeContent.getCoverUrl());
                    C786410Ut5.LJJJI("diamond_game_id", shareAwemeContent.getDiamondGameId(), bundle6);
                    bundle6.putBoolean("is_hot_spot_video", shareAwemeContent.isHotSpotVideo());
                    return sharePackageLIZLLL5;
                }
                if (baseContent instanceof ShareChallengeContent) {
                    return LIZLLL(bundle, "challenge");
                }
                if (baseContent instanceof ShareCompilationContent) {
                    return LIZLLL(bundle, "mix_videos");
                }
                if (baseContent instanceof ShareEffectContent) {
                    SharePackage sharePackageLIZLLL6 = LIZLLL(bundle, "sticker");
                    C786410Ut5.LJJIZ(sharePackageLIZLLL6.extras, "video_cover", ((ShareEffectContent) baseContent).getCover());
                    return sharePackageLIZLLL6;
                }
                if (baseContent instanceof ShareLiveContent) {
                    ShareLiveContent shareLiveContent = (ShareLiveContent) baseContent;
                    C1370940lmO c1370940lmO = new C1370940lmO();
                    String itemType = shareLiveContent.getItemType();
                    if (itemType == null || itemType.length() == 0) {
                        itemType = "live";
                    }
                    c1370940lmO.LIZ = itemType;
                    String roomId = shareLiveContent.getRoomId();
                    if (roomId != null) {
                        strLJIILJJIL = roomId;
                    }
                    c1370940lmO.LIZIZ = strLJIILJJIL;
                    SharePackage sharePackage = new SharePackage(c1370940lmO);
                    Bundle bundle7 = sharePackage.extras;
                    C786410Ut5.LJJJI("live_id", shareLiveContent.getRoomOwnerId(), bundle7);
                    C786410Ut5.LJJIZ(bundle7, "video_cover", shareLiveContent.getRoomCover());
                    C786410Ut5.LJJJI("author_name", shareLiveContent.getRoomOwnerName(), bundle7);
                    C786410Ut5.LJJIZ(bundle7, "thumb_for_share", shareLiveContent.getRoomOwnerAvatar());
                    C786410Ut5.LJJJI("share_live_intent", shareLiveContent.getShareLiveIntent(), bundle7);
                    C786410Ut5.LJJJI("share_live_trace_id", shareLiveContent.getShareLiveTraceId(), bundle7);
                    if (!TextUtils.isEmpty(shareLiveContent.getRoomDesc())) {
                        C786410Ut5.LJJJI("room_title", shareLiveContent.getRoomDesc(), bundle7);
                    }
                    return sharePackage;
                }
                if (baseContent instanceof ShareLiveEventContent) {
                    SharePackage sharePackageLIZLLL7 = LIZLLL(bundle, "live_event");
                    C786410Ut5.LJJJI("live_event_title", sharePackageLIZLLL7.title, sharePackageLIZLLL7.extras);
                    return sharePackageLIZLLL7;
                }
                if (baseContent instanceof ShareMusicContent) {
                    SharePackage sharePackageLIZLLL8 = LIZLLL(bundle, "music");
                    C786410Ut5.LJJIZ(sharePackageLIZLLL8.extras, "video_cover", ((ShareMusicContent) baseContent).getCoverThumb());
                    return sharePackageLIZLLL8;
                }
                if (baseContent instanceof ShareProductContent) {
                    ShareProductContent shareProductContent = (ShareProductContent) baseContent;
                    C1370940lmO c1370940lmO2 = new C1370940lmO();
                    c1370940lmO2.LIZ = "product";
                    SharePackage sharePackage2 = new SharePackage(c1370940lmO2);
                    Bundle bundle8 = sharePackage2.extras;
                    C786410Ut5.LJJJI("product_id", shareProductContent.getProductId(), bundle8);
                    C786410Ut5.LJJJI("product_title", shareProductContent.getTitle(), bundle8);
                    C786410Ut5.LJJJI("product_price", shareProductContent.getPrice(), bundle8);
                    C786410Ut5.LJJJI("product_sales", shareProductContent.getSales(), bundle8);
                    C786410Ut5.LJJJI("product_query_params", shareProductContent.getQueryParams(), bundle8);
                    C786410Ut5.LJJIZ(bundle8, "product_picture", shareProductContent.getPicture());
                    C786410Ut5.LJJJI("seller_name", shareProductContent.getSellerName(), bundle8);
                    C786410Ut5.LJJIZ(bundle8, "seller_avatar", shareProductContent.getSellerAvatar());
                    return sharePackage2;
                }
                if (baseContent instanceof ShareQnAContent) {
                    SharePackage sharePackageLIZLLL9 = LIZLLL(bundle, "qna");
                    Bundle bundle9 = sharePackageLIZLLL9.extras;
                    List<UrlModel> awemeCoverList = ((ShareQnAContent) baseContent).getAwemeCoverList();
                    if (awemeCoverList != null) {
                        urlModel = (UrlModel) C13LP.LJJJLL(awemeCoverList);
                    }
                    C786410Ut5.LJJIZ(bundle9, "video_cover", urlModel);
                    return sharePackageLIZLLL9;
                }
                if (baseContent instanceof ShareSearchContent) {
                    SharePackage sharePackageLIZLLL10 = LIZLLL(bundle, "search");
                    Bundle bundle10 = sharePackageLIZLLL10.extras;
                    String image = ((ShareSearchContent) baseContent).getImage();
                    if (image != null) {
                        strLJIILJJIL = image;
                    }
                    C786410Ut5.LJJIZ(bundle10, "thumb_url", strLJIILJJIL);
                    return sharePackageLIZLLL10;
                }
                if (baseContent instanceof ShareSubscribeInviteContent) {
                    SharePackage sharePackageLIZLLL11 = LIZLLL(bundle, "subscribe_invite");
                    C786410Ut5.LJJIZ(sharePackageLIZLLL11.extras, "thumb_url", ((ShareSubscribeInviteContent) baseContent).getImage());
                    return sharePackageLIZLLL11;
                }
                if (baseContent instanceof ShareUserContent) {
                    SharePackage sharePackageLIZLLL12 = LIZLLL(bundle, "user");
                    C786410Ut5.LJJIZ(sharePackageLIZLLL12.extras, "video_cover", ((ShareUserContent) baseContent).getAvatar());
                    return sharePackageLIZLLL12;
                }
                if (baseContent instanceof ShareWebContent) {
                    SharePackage sharePackageLIZLLL13 = LIZLLL(bundle, "web");
                    C786410Ut5.LJJIZ(sharePackageLIZLLL13.extras, "thumb_url", ((ShareWebContent) baseContent).getImage());
                    return sharePackageLIZLLL13;
                }
                if (!(baseContent instanceof TextContent)) {
                    return null;
                }
                SharePackage sharePackageLIZLLL14 = LIZLLL(bundle, "text");
                C786410Ut5.LJJJI("share_text", ((TextContent) baseContent).getText(), sharePackageLIZLLL14.extras);
                return sharePackageLIZLLL14;
            }

            @Override // X.InterfaceC896020ZDc
            public final BaseContent LIZJ(BaseSharePackage baseSharePackage, BaseContent baseContent, Map<String, String> map) {
                if (baseContent instanceof TextContent) {
                    baseContent = TextContent.Companion.obtain((TextContent) baseContent);
                    if (map != null && ShareAwemeContent.Companion.isEncourageMufInteractionASrc(map.get("a:src"))) {
                        baseContent.setRefVideo(null);
                        map.remove("a:src");
                    }
                } else if (baseContent == null) {
                    return LIZIZ(baseSharePackage);
                }
                return baseContent;
            }
        };
    }
}
