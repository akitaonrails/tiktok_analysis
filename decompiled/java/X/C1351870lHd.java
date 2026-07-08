package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentAudioModel;
import com.ss.android.ugc.aweme.comment.model.CommentExtKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.comment.model.Volume;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1351870lHd {
    public static int LIZIZ(User user) {
        if (user == null) {
            return -1;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(user.getUid())) {
            return 4;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static CommentSharePackage LIZJ(Aweme aweme, Comment comment, boolean z, C1350970lGB c1350970lGB) {
        String string;
        String uniqueId;
        String uid;
        UrlModel cover;
        UrlModel avatarThumb;
        boolean z2;
        String uniqueId2;
        int i;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String rootCommentId;
        Video video;
        StickerUrlStruct animatedUrl;
        CommentAudioModel audioModel;
        String string7;
        Double d;
        Double d2;
        String str;
        String str2;
        CommentImageStruct commentImageStruct;
        C1370940lmO c1370940lmO = new C1370940lmO();
        c1370940lmO.LIZ = "comment";
        String str3 = c1350970lGB.LIZ;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        c1370940lmO.LIZIZ = str3;
        String str5 = c1350970lGB.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        c1370940lmO.LIZLLL = str5;
        String str6 = c1350970lGB.LIZJ;
        if (str6 == null) {
            str6 = "";
        }
        c1370940lmO.LJ = str6;
        String str7 = c1350970lGB.LIZLLL;
        if (str7 == null) {
            str7 = "";
        }
        String strLJFF = C1375500ltk.LJFF(C1375500ltk.LJ(str7));
        if (strLJFF == null) {
            strLJFF = "";
        }
        String strLIZIZ = C1375500ltk.LIZIZ(aweme, strLJFF);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        c1370940lmO.LJFF = strLIZIZ;
        CommentSharePackage commentSharePackage = new CommentSharePackage(c1370940lmO);
        commentSharePackage.comment = comment;
        commentSharePackage.aweme = aweme;
        Bundle bundle = c1350970lGB.LJ;
        Bundle bundle2 = commentSharePackage.extras;
        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
            string = "";
        }
        C786410Ut5.LJJJI("enter_from", string, bundle2);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        C786410Ut5.LJJJI("aweme_id", aid, bundle2);
        C786410Ut5.LJJJI("aweme_author_uid", AwemeExtKt.getAuthorUid(aweme), bundle2);
        String text = comment.getText();
        if (text == null) {
            text = "";
        }
        C786410Ut5.LJJJI("comment_text", text, bundle2);
        String cid = comment.getCid();
        if (cid == null) {
            cid = "";
        }
        C786410Ut5.LJJJI("comment_id", cid, bundle2);
        User user = comment.getUser();
        ArrayList arrayList = null;
        string = null;
        String string8 = null;
        urlModel = null;
        UrlModel urlModel = null;
        cover = null;
        UrlModel cover2 = null;
        if (user == null || (uniqueId = user.getUniqueId()) == null) {
            uniqueId = "";
        }
        C786410Ut5.LJJJI("comment_author_name", uniqueId, bundle2);
        User user2 = comment.getUser();
        if (user2 == null || (uid = user2.getUid()) == null) {
            uid = "";
        }
        C786410Ut5.LJJJI("comment_author_id", uid, bundle2);
        String replyToUserName = comment.getReplyToUserName();
        if (replyToUserName == null) {
            replyToUserName = "";
        }
        C786410Ut5.LJJJI("comment_reply_user_name", replyToUserName, bundle2);
        String replyToUserId = comment.getReplyToUserId();
        if (replyToUserId == null) {
            replyToUserId = "";
        }
        C786410Ut5.LJJJI("comment_reply_user_id", replyToUserId, bundle2);
        C1351870lHd c1351870lHd = CommentSharePackage.Companion;
        User user3 = comment.getUser();
        c1351870lHd.getClass();
        C786410Ut5.LJJJI("comment_follow_status_to_user", String.valueOf(LIZIZ(user3)), bundle2);
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            cover = video2.getCover();
        } else {
            cover = null;
        }
        C786410Ut5.LJJIZ(bundle2, "video_cover", cover);
        User user4 = comment.getUser();
        if (user4 != null) {
            avatarThumb = user4.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C786410Ut5.LJJIZ(bundle2, "comment_author_avatar_url", avatarThumb);
        bundle2.putInt("aweme_type", aweme.getAwemeType());
        bundle2.putBoolean("comment_is_sub_comment", C703302op.LIZ(comment.getReplyToUserName()));
        if (comment.getAliasAweme() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bundle2.putBoolean("comment_is_reply_with_video", z2);
        if (comment.getIsPhotoContained() == 1) {
            C786410Ut5.LJJJI("photo_type", CommentExtKt.getPhotoType(comment), bundle2);
            List<CommentImageStruct> imageList = comment.getImageList();
            if (imageList != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
                str = "live_once";
            } else {
                str = "static";
            }
            C786410Ut5.LJJJI("sub_photo_type", str, bundle2);
            if (Intrinsics.LJFF(CommentExtKt.isAIImageComment(comment), Boolean.TRUE)) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C786410Ut5.LJJJI("is_visual_poet", str2, bundle2);
        }
        User author = aweme.getAuthor();
        if (author == null || (uniqueId2 = author.getUniqueId()) == null) {
            uniqueId2 = "";
        }
        C786410Ut5.LJJJI("author_user_name", uniqueId2, bundle2);
        C735280Sso.LIZ.getClass();
        if (C735280Sso.LJIIIIZZ(aweme)) {
            i = 3;
        } else if (C735280Sso.LIZJ(aweme)) {
            i = 2;
        } else {
            User author2 = aweme.getAuthor();
            if (author2 != null && author2.isSecret()) {
                i = 1;
            } else {
                i = -1;
            }
        }
        bundle2.putInt("share_im_limit_tip_type", i);
        bundle2.putBoolean("comment_direct_share", z);
        if (bundle == null || (string2 = bundle.getString("enter_method")) == null) {
            string2 = "";
        }
        C786410Ut5.LJJJI("enter_method", string2, bundle2);
        bundle2.putInt("comment_media_type", comment.getCommentMediaType());
        if (bundle == null || (string3 = bundle.getString("is_internal_image_comment")) == null) {
            string3 = "";
        }
        C786410Ut5.LJJJI("is_internal_image_comment", string3, bundle2);
        if (bundle == null || (string4 = bundle.getString("is_ad")) == null) {
            string4 = "";
        }
        C786410Ut5.LJJJI("is_ad", string4, bundle2);
        if (bundle == null || (string5 = bundle.getString("story_type")) == null) {
            string5 = "";
        }
        C786410Ut5.LJJJI("story_type", string5, bundle2);
        if (bundle == null || (string6 = bundle.getString("log_follow_status")) == null) {
            string6 = "";
        }
        C786410Ut5.LJJJI("log_follow_status", string6, bundle2);
        if (comment.getCommentType() == 2) {
            rootCommentId = comment.getRootCommentId();
        } else {
            rootCommentId = null;
        }
        if (C123100dR.LIZ(rootCommentId)) {
            C786410Ut5.LJJJI("parent_comment_id", comment.getRootCommentId(), bundle2);
        }
        int commentMediaType = comment.getCommentMediaType();
        if (commentMediaType != 1) {
            if (commentMediaType != 3) {
                if (commentMediaType != 4) {
                    if (commentMediaType == 5) {
                        AudioCommentModel audioCommentModelLIZJ = C1345110l6j.LIZJ(comment.getAudioStruct());
                        if (audioCommentModelLIZJ != null) {
                            C786410Ut5.LJJJI("audio_duration", String.valueOf(audioCommentModelLIZJ.totalDurationMillis), bundle2);
                            C786410Ut5.LJJJI("audio_volume", String.valueOf(C1345110l6j.LIZLLL(audioCommentModelLIZJ.waveformData)), bundle2);
                        }
                        CmtAudioStruct audioStruct = comment.getAudioStruct();
                        if (audioStruct != null && (audioModel = audioStruct.getAudioModel()) != null) {
                            Volume volume = audioModel.volume;
                            if (volume != null && (d2 = volume.loudness) != null) {
                                string7 = d2.toString();
                            } else {
                                string7 = null;
                            }
                            C786410Ut5.LJJJI("audio_ori_loudness", string7, bundle2);
                            Volume volume2 = audioModel.volume;
                            if (volume2 != null && (d = volume2.peak) != null) {
                                string8 = d.toString();
                            }
                            C786410Ut5.LJJJI("audio_ori_peak_loudness", string8, bundle2);
                        }
                    }
                } else {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    CommentStickerStruct stickerStruct = comment.getStickerStruct();
                    if (stickerStruct != null && (animatedUrl = stickerStruct.getAnimatedUrl()) != null) {
                        urlModel = animatedUrl.midResolutionUrl;
                    }
                    List listLJIIL = C1697810uHb.LJIIL(urlModel);
                    c1227904rF.getClass();
                    C786410Ut5.LJJJI("comment_images", C1227904rF.LJI(listLJIIL), bundle2);
                }
            } else {
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme != null && (video = aliasAweme.getVideo()) != null) {
                    cover2 = video.getCover();
                }
                C786410Ut5.LJJIZ(bundle2, "comment_reply_video_cover", cover2);
                String aid2 = comment.getAliasAweme().getAid();
                if (aid2 != null) {
                    str4 = aid2;
                }
                C786410Ut5.LJJJI("comment_reply_aweme_id", str4, bundle2);
            }
        } else {
            C1227904rF c1227904rF2 = C1227904rF.LIZ;
            List<CommentImageStruct> imageList2 = comment.getImageList();
            if (imageList2 != null) {
                arrayList = new ArrayList();
                Iterator<CommentImageStruct> it2 = imageList2.iterator();
                while (it2.hasNext()) {
                    UrlModel originUrl = it2.next().getOriginUrl();
                    if (originUrl != null) {
                        arrayList.add(originUrl);
                    }
                }
            }
            c1227904rF2.getClass();
            C786410Ut5.LJJJI("comment_images", C1227904rF.LJI(arrayList), bundle2);
        }
        bundle2.putInt("comment_likes", comment.getDiggCount());
        bundle2.putLong("comment_replies", comment.getReplyCommentTotal());
        CommentService.LIZ.getClass();
        C786410Ut5.LJJJI("comment_message_type", C523420Kfs.LIZ().LJJLIIIJJIZ(comment), bundle2);
        CommentSharePackage.Companion.getClass();
        String uid2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid();
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            C786410Ut5.LJJJI("item_author_type", CardStruct.IStatusCode.DEFAULT, commentSharePackage.extras);
            return commentSharePackage;
        }
        if (Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), uid2)) {
            C786410Ut5.LJJJI("item_author_type", "1", commentSharePackage.extras);
            return commentSharePackage;
        }
        C786410Ut5.LJJJI("item_author_type", "2", commentSharePackage.extras);
        return commentSharePackage;
    }

    public static C1360500lVY LIZ(Context context, String str, String str2, Bitmap bitmap, int i, int i2) {
        int iIntValue;
        Bitmap bitmapDecodeResource = bitmap;
        C1360520lVa c1360520lVa = new C1360520lVa();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(context.getString(2131835525, str));
        sbLIZ.append(": ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str2);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c1360520lVa.LIZLLL(strLIZIZ);
        c1360520lVa.LIZLLL(str2);
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        int iLJJJ = a0.LJJJ(strLIZIZ2, strLIZIZ, 0, false, 6);
        c1360500lVY.LIZJ(iLJJJ, strLIZIZ.length() + iLJJJ, new C444920HcY(43, false));
        if (bitmapDecodeResource == null) {
            bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.c5w);
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        int width = bitmapDecodeResource.getWidth();
        int i3 = width + iLIZIZ;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = iLIZIZ;
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.FILL);
        float f2 = 2;
        float f3 = i3 / f2;
        float f4 = iLIZIZ / 2;
        float f5 = (width / f2) - f4;
        canvas.drawCircle(f3, f3, f5, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        float f6 = f4 + 0.0f;
        canvas.drawBitmap(bitmapDecodeResource, f6, f6, paint);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(iIntValue);
        paint2.setStrokeWidth(f);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        canvas.drawCircle(f3, f3, f5, paint2);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, i, i);
        C419890GdH c419890GdH = new C419890GdH(bitmapDrawable, 2);
        c419890GdH.LIZIZ(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C444960Hcc.LIZIZ());
        C786410Ut5.r2(c1360500lVY, c419890GdH, 0, 1, 18);
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 == 4) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(' ');
                    sbLIZ3.append(context.getResources().getString(2131829123));
                    c1360500lVY.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ3));
                }
                return c1360500lVY;
            }
            c1360500lVY.append((CharSequence) context.getResources().getString(2131835770));
            return c1360500lVY;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(' ');
        sbLIZ4.append(context.getResources().getString(2131829121));
        c1360500lVY.append((CharSequence) C2188811AlT.LIZIZ(sbLIZ4));
        return c1360500lVY;
    }
}
