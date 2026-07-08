package X;

import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardComment;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MMO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMO {
    public static final C0MMO LIZ = new C0MMO();

    static {
        C1446930nkx.LJII(new C0MMQ());
    }

    public static ForwardComment LIZ(C0MMK c0mmk, ForwardMedia forwardMedia) {
        String cid;
        User user;
        String uid = null;
        if (!(c0mmk instanceof C0MN4)) {
            return null;
        }
        C0MN4 c0mn4 = (C0MN4) c0mmk;
        Comment commentInfo = c0mn4.getCommentInfo();
        if (commentInfo != null) {
            cid = commentInfo.getCid();
        } else {
            cid = null;
        }
        Comment commentInfo2 = c0mn4.getCommentInfo();
        if (commentInfo2 != null && (user = commentInfo2.getUser()) != null) {
            uid = user.getUid();
        }
        return new ForwardComment(cid, uid, forwardMedia.video.getAwemeId(), forwardMedia.author.getUid(), true);
    }

    public static Pair LIZIZ(Pair pair, Pair pair2) {
        if (pair2 == null) {
            return pair;
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue() / ((Number) pair.getSecond()).intValue();
        float fFloatValue2 = ((Number) pair2.getFirst()).floatValue() / ((Number) pair2.getSecond()).intValue();
        if (fFloatValue2 > fFloatValue) {
            return new Pair(pair.getFirst(), Integer.valueOf((int) (((Number) pair.getFirst()).floatValue() / fFloatValue2)));
        }
        return new Pair(Integer.valueOf((int) (((Number) pair.getSecond()).floatValue() * fFloatValue2)), pair.getSecond());
    }

    public static CanvasVideoData LIZJ(C0MMO c0mmo, C0MKE c0mke, int i) {
        int i2;
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        CanvasBackground canvasBackgroundLIZ;
        int i3;
        int i4;
        int value;
        ForwardCanvasExtra forwardCanvasExtra;
        C1453400nvO c1453400nvO;
        EnumC1453440nvS enumC1453440nvS;
        int scenario;
        if ((i & 2) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            f = 0.7f;
        } else {
            f = 0.0f;
        }
        c0mmo.getClass();
        boolean zLJFF = Intrinsics.LJFF(c0mke.LIZIZ.author.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        MentionStruct videoShareBackwardsMentionStruct = c0mke.LIZJ.getVideoShareBackwardsMentionStruct();
        if (videoShareBackwardsMentionStruct != null && ((scenario = videoShareBackwardsMentionStruct.getScenario()) == EnumC19597511lt.POST_BACKWARDS_MENTION.getValue() || scenario == EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((zLJFF && C1238304sv.LIZ()) || (z2 && (((Number) C1238304sv.LIZ.getValue()).intValue() & 1) != 0)) {
            z3 = true;
            CanvasBackground.Companion.getClass();
            canvasBackgroundLIZ = C567420MNg.LIZ(-16777216);
        } else {
            z3 = false;
            canvasBackgroundLIZ = c0mke.LIZLLL.LIZIZ;
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(c0mke.LIZLLL.LIZ);
        CanvasExtra canvasExtra = null;
        pair = null;
        Pair pair = null;
        if (z) {
            if (c0mke.LIZIZ.isStory()) {
                i3 = 5;
            } else {
                i3 = c0mke.LJII;
            }
            int i5 = c0mke.LJIIIIZZ;
            if (c0mke.LIZIZ.video.getSourceWidth() != 0 && c0mke.LIZIZ.video.getSourceHeight() != 0) {
                pair = new Pair(Integer.valueOf(c0mke.LIZIZ.video.getSourceWidth()), Integer.valueOf(c0mke.LIZIZ.video.getSourceHeight()));
            }
            Pair pairLIZIZ = LIZIZ(c0mke.LJFF, pair);
            int iIntValue = ((Number) pairLIZIZ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZIZ.getSecond()).intValue();
            int sourceDuration = c0mke.LIZIZ.video.getSourceDuration();
            if (C0B0H.LIZ()) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            CanvasGestureConfig canvasGestureConfig = new CanvasGestureConfig(true, true, true, false, false, i4, false, true, false);
            String sourceMeta = c0mke.LIZIZ.video.getSourceMeta();
            ForwardMedia forwardMedia = c0mke.LIZIZ;
            int i6 = forwardMedia.awemeType;
            boolean zLJFF2 = Intrinsics.LJFF(forwardMedia.author.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            VideoShareInfoStruct videoShareInfoStruct = c0mke.LIZJ.getVideoShareInfoStruct();
            MentionStruct videoShareBackwardsMentionStruct2 = c0mke.LIZJ.getVideoShareBackwardsMentionStruct();
            ForwardMedia forwardMedia2 = c0mke.LIZIZ;
            ForwardMusic forwardMusic = forwardMedia2.forwardMusic;
            float f2 = forwardMedia2.targetVolumeLoud;
            ForwardVideo forwardVideo = forwardMedia2.video;
            ForwardComment forwardCommentLIZ = LIZ(c0mke.LIZJ, forwardMedia2);
            C0MM6 c0mm6 = c0mke.LJ;
            if (c0mm6 != null && (c1453400nvO = c0mm6.LIZLLL) != null && (enumC1453440nvS = c1453400nvO.LIZ) != null) {
                value = enumC1453440nvS.getValue();
            } else {
                value = 8;
            }
            canvasExtra = new CanvasExtra(0, iIntValue, iIntValue2, 0, sourceDuration, 0.4f, 0.8f, true, canvasGestureConfig, new ForwardCanvasExtra(i3, 0, sourceMeta, i6, zLJFF2, videoShareInfoStruct, videoShareBackwardsMentionStruct2, forwardMusic, f2, forwardVideo, forwardCommentLIZ, value, false, i5), 1.0f, 0L, 0);
            if (z3 && (forwardCanvasExtra = canvasExtra.forwardCanvasExtra) != null) {
                forwardCanvasExtra.setEditorFullscreen(true);
            }
        }
        CanvasVideoData canvasVideoData = new CanvasVideoData(listLJIILJJIL, null, canvasBackgroundLIZ, null, canvasExtra, i2, null, c0mke.LJI, null, null, null, null, 3912, null);
        if (z3) {
            CanvasFilterParam canvasFilterParam = new CanvasFilterParam();
            canvasFilterParam.setClipIndex(0);
            canvasFilterParam.setScaleFactor(1.0f);
            canvasFilterParam.setTransX(0.0f);
            canvasFilterParam.setTransY(0.0f);
            canvasFilterParam.setBorderColor(-1);
            canvasFilterParam.setBorderWidthPx(0);
            canvasFilterParam.setAnimStartTime(0);
            canvasFilterParam.setAnimEndTime(Integer.MAX_VALUE);
            canvasFilterParam.setNickNameStyle(1);
            canvasVideoData.putTransform(canvasFilterParam);
        } else {
            C0MM6 c0mm62 = c0mke.LJ;
            if (c0mm62 != null) {
                LIZ.getClass();
                CanvasFilterParam canvasFilterParam2 = new CanvasFilterParam();
                canvasFilterParam2.setClipIndex(0);
                canvasFilterParam2.setBorderColor(-1);
                canvasFilterParam2.setBorderWidthPx(0);
                canvasFilterParam2.setScaleFactor(f);
                canvasFilterParam2.setTransX(0.0f);
                canvasFilterParam2.setTransY(0.0f);
                canvasFilterParam2.setAnimPath(c0mm62.LIZIZ);
                canvasFilterParam2.setAnimJsonParam(C786410Ut5.J3(c0mm62.LIZLLL.LIZ()));
                canvasFilterParam2.setEffectId(c0mm62.LIZ);
                canvasFilterParam2.setAnimStartTime(0);
                canvasFilterParam2.setAnimEndTime(Integer.MAX_VALUE);
                canvasFilterParam2.setNickNameStyle(1);
                canvasVideoData.putTransform(canvasFilterParam2);
                return canvasVideoData;
            }
        }
        return canvasVideoData;
    }
}
