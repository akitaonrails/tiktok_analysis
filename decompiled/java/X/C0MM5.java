package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MinisGameModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0MM5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MM5 {
    public static final C0MM5 LIZ = new C0MM5();
    public static final C0MKL LIZIZ = new C0MKL();

    public static String LIZLLL(C0MM9 c0mm9) {
        String renderName = c0mm9.getRenderName();
        if ((renderName != null && renderName.length() > 0) || (renderName = c0mm9.getNickName()) != null) {
            return renderName;
        }
        return "";
    }

    public static void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ForwardEnvironment->");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C0MMG LJIIIZ(C0MMH c0mmh) {
        return new C0MMG(c0mmh.LIZ, c0mmh.LIZIZ, c0mmh.LIZJ, 8);
    }

    public static void LIZJ(Context context, C0MKE c0mke) {
        boolean zBooleanValue;
        long jLIZ = LIZIZ.LIZ();
        Intent intent = new Intent();
        C0MUK.LJIIIZ(intent, C0MUK.LJIIIIZZ());
        C537520L6g.LIZLLL(intent, c0mke.LIZ);
        C0MMP.LIZIZ(intent, c0mke.LIZIZ, c0mke.LIZ, c0mke.LJFF);
        C0MUK.LIZIZ(intent).canvasVideoData = C0MMO.LIZJ(C0MMO.LIZ, c0mke, 12);
        C0MMP.LIZ(intent, c0mke, jLIZ, c0mke.LIZIZ.shootWay, "share", "upload");
        CommonMobParamModel commonMobParamModel = C0MUK.LIZIZ(intent).commonMobModel;
        commonMobParamModel.isUploadDirectEnter = true;
        commonMobParamModel.isFromIMShareToStory = true;
        Boolean boolIsIMShareMentionVideoToPost = c0mke.LIZIZ.isIMShareMentionVideoToPost();
        if (boolIsIMShareMentionVideoToPost != null) {
            zBooleanValue = boolIsIMShareMentionVideoToPost.booleanValue();
        } else {
            zBooleanValue = false;
        }
        commonMobParamModel.isIMShareVideoToPost = zBooleanValue;
        C0MM8 c0mm8 = c0mke.LIZIZ.miniGameSnapShot;
        if (c0mm8 != null) {
            C0MUK.LIZIZ(intent).eventData.shootEnterMethod = "minis_game_to_story";
            C0MUK.LIZIZ(intent).miniGameData = new MinisGameModel(c0mm8.LIZIZ, c0mm8.LIZJ);
        }
        if (C0MKI.LIZ()) {
            C1660680tJi.LIZ().LJIIZILJ(context, intent, false);
        } else {
            C1660680tJi.LIZ().LJIILIIL(context, intent);
        }
    }

    public static Object LJII(C0MML c0mml, AbstractC23140094w abstractC23140094w) {
        C0MMM c0mmm;
        CommentVideoModel commentInfo;
        Object objLIZJ;
        if ((c0mml instanceof C0MMM) && (c0mmm = (C0MMM) c0mml) != null && (commentInfo = c0mmm.getCommentInfo()) != null && (objLIZJ = C19610311nx.LIZJ(commentInfo, abstractC23140094w)) == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    public static void LJFF(ForwardMedia forwardMedia, CreativeInfo creativeInfo, C0MML c0mml) {
        String str;
        ForwardMusic forwardMusic;
        String musicId;
        Map<String, String> map;
        String str2 = forwardMedia.eventType;
        String str3 = forwardMedia.enterMethod;
        String creationId = creativeInfo.getCreationId();
        VideoShareInfoStruct videoShareInfoStruct = c0mml.getVideoShareInfoStruct();
        String str4 = "";
        if (videoShareInfoStruct == null || (str = videoShareInfoStruct.authorId) == null) {
            str = "";
        }
        int i = forwardMedia.awemeType;
        boolean zLJFF = Intrinsics.LJFF(str, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_source", "upload");
        c0lab.LJ("enter_method", str3);
        c0lab.LJ("content_type", "share");
        c0lab.LIZ(i, "repost_aweme_type");
        c0lab.LIZ(zLJFF ? 1 : 0, "is_own_video");
        c0lab.LIZ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
        C0MM8 c0mm8 = forwardMedia.miniGameSnapShot;
        if (c0mm8 != null && (map = c0mm8.LIZJ) != null) {
            c0lab.LJI(map);
        }
        if (forwardMedia.isStreakShareToStory()) {
            c0lab.LJ("shared_content_type", "streak");
        }
        IRecordMobService iRecordMobService = (IRecordMobService) ServiceManager.get().getService(IRecordMobService.class);
        String str5 = forwardMedia.shootWay;
        if (C298260Bma.LIZ() && (forwardMusic = forwardMedia.forwardMusic) != null && (musicId = forwardMusic.getMusicId()) != null) {
            str4 = musicId;
        }
        iRecordMobService.LIZIZ(new C1449410nox(creationId, str5, str2, null, null, new C1449430noz(str4, "others_share"), null, null, 216), c0lab, null);
    }

    public static C566810MKx LJI(Context context, ForwardMedia forwardMedia, boolean z) {
        boolean z2;
        boolean z3;
        if (!z) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null || (activityLIZ = C19713312Ax.LIZIZ()) != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.m25);
                    C1390380mHk.LIZ(activityLIZ, 6001, creativeToastBuilder);
                }
                return new C566810MKx(false, -4000, "error for network invalid");
            }
        }
        if (forwardMedia.awemeType == 501 && forwardMedia.video.getSourceCoverList().isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!forwardMedia.video.getPlayAddressList().isEmpty() && ((String) C13LP.LJJLIIIJJI(forwardMedia.video.getPlayAddressList())).length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2 && z3) {
            return new C566810MKx(false, -5000, "error for url invalid");
        }
        return new C566810MKx(true, 0, "");
    }

    public static void LJIIIIZZ(C0MM5 c0mm5, C094D c094d, C0MMS c0mms) {
        c0mm5.getClass();
        if (!c094d.LJ()) {
            try {
                C094C.LIZIZ(c094d, c0mms);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendBlockingSafely, ");
                sbLIZ.append(e);
                LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            c094d.LJIIJJI(null);
        }
    }

    public static b LIZIZ(C0MMG c0mmg, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Context context) {
        C138P c138p = LIZIZ.LIZJ;
        if (!c138p.LIZIZ) {
            C0MMB.LIZ(c138p);
        }
        return C09IC.LJ(new C566840MLa(context, creativeInfo, c0mmk, forwardMedia, c0mmg, null));
    }

    public static C0MM6 LIZ(ForwardMedia forwardMedia, String str, C0MMG c0mmg, Context context, C0MM6 c0mm6, C0MML c0mml) {
        boolean z;
        String str2;
        C0MM7 c0mm7 = new C0MM7();
        if (!c0mml.getUseCanVasNewStyle()) {
            c0mm7.LIZ = EnumC1453440nvS.TYPE8;
        } else {
            int primaryColor = c0mmg.LIZIZ.getPrimaryColor();
            double dRed = ((((double) Color.red(primaryColor)) / 255.0d) * 0.2126d) + ((((double) Color.green(primaryColor)) / 255.0d) * 0.7152d) + ((((double) Color.blue(primaryColor)) / 255.0d) * 0.0722d);
            Color.colorToHSV(primaryColor, new float[3]);
            if (r0[1] >= 0.4d ? dRed < 0.45d : dRed < 0.8d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = "#FFFFFF";
            } else {
                str2 = "#000000";
            }
            c0mm7.LIZ = EnumC1453440nvS.TYPE1;
            c0mm7.LIZIZ = str;
            c0mm7.LJ = c0mmg.LIZJ;
            c0mm7.LIZJ = forwardMedia.desc;
            c0mm7.LIZLLL = C423170GiZ.LIZ(context);
            int primaryColor2 = c0mmg.LIZIZ.getPrimaryColor();
            c0mm7.LJII = C786410Ut5.j4("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((primaryColor2 >> 16) & 255), Integer.valueOf((primaryColor2 >> 8) & 255), Integer.valueOf(primaryColor2 & 255)}, 3));
            c0mm7.LJFF = "#FFFFFF";
            c0mm7.LJI = str2;
        }
        return new C0MM6(c0mm6.LIZ, c0mm6.LIZIZ, c0mm6.LIZJ, new C1453400nvO(c0mm7.LIZ, c0mm7.LIZIZ, c0mm7.LIZJ, c0mm7.LIZLLL, c0mm7.LJ, c0mm7.LJFF, c0mm7.LJI, c0mm7.LJII));
    }
}
