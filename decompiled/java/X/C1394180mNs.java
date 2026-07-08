package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394180mNs {
    public final C1394130mNn LIZ;
    public final InterfaceC1394190mNt LIZIZ;
    public final IPropReuseService LIZJ;

    public C1394180mNs() {
        C1394130mNn c1394130mNn = new C1394130mNn();
        C1394200mNu c1394200mNu = C1394200mNu.LIZ;
        IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
        this.LIZ = c1394130mNn;
        this.LIZIZ = c1394200mNu;
        this.LIZJ = iPropReuseService;
    }

    public final void LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, Music music, AVMusic aVMusic, String str, String str2, AnchorCommonStruct anchorCommonStruct2, boolean z, String str3, Function1<? super SmartRoute, Unit> function1) {
        String id;
        String extra;
        Integer numValueOf;
        UrlModel cover;
        String logExtra;
        String strLIZ;
        Intent intent;
        String strLIZIZ;
        boolean zLJI = MethodIDManager.LJI(71781);
        Intent intent2 = null;
        if (anchorCommonStruct != null) {
            id = anchorCommonStruct.getId();
        } else {
            id = null;
        }
        String str4 = "";
        if (id == null) {
            id = "";
        }
        if (C123100dR.LIZ(id)) {
            boolean zLJI2 = MethodIDManager.LJI(71953);
            this.LIZJ.LJII(id);
            if (zLJI2) {
                MethodIDManager.LJ();
            }
        }
        C1387380mCu c1387380mCuLJIIZILJ = C1394340mO8.LJIIZILJ(aweme);
        SmartRoute smartRouteLIZ = this.LIZIZ.LIZ(context, id, str2);
        smartRouteLIZ.withParam("aweme_id", aweme.getAid());
        if (z) {
            music = null;
        }
        smartRouteLIZ.withParam("music_model", music);
        smartRouteLIZ.withParam("sticker_music", aVMusic);
        int iOptInt = 0;
        smartRouteLIZ.withParam("extra_stickers", C1697810uHb.LJ(id));
        smartRouteLIZ.withParam("extra_log_pb", str);
        C1394130mNn c1394130mNn = this.LIZ;
        if (anchorCommonStruct != null) {
            extra = anchorCommonStruct.getExtra();
        } else {
            extra = null;
        }
        c1394130mNn.getClass();
        JSONObject jSONObjectLIZ = C1394130mNn.LIZ(extra);
        if (jSONObjectLIZ != null) {
            try {
                iOptInt = jSONObjectLIZ.optInt("green_screen_materials_type");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        smartRouteLIZ.withParam("media_type", iOptInt);
        Video video = aweme.getVideo();
        if (video != null) {
            numValueOf = Integer.valueOf(video.getVideoLength());
        } else {
            numValueOf = null;
        }
        smartRouteLIZ.withParam("EXTRA_VIDEO_LENGTH", numValueOf);
        smartRouteLIZ.withParam("extra_previous_page", str2);
        smartRouteLIZ.withParam("shoot_enter_from", str2);
        smartRouteLIZ.withParam("enter_record_from_feed", true);
        Video video2 = aweme.getVideo();
        if (video2 != null) {
            cover = video2.getCover();
        } else {
            cover = null;
        }
        smartRouteLIZ.withParam("extra_url_icon", cover);
        smartRouteLIZ.withParam("author_id", AwemeExtKt.getSecAuthorUid(aweme));
        smartRouteLIZ.withParam("extra_related_item", aweme);
        smartRouteLIZ.withParam("extra_enter_edp_from_video_feed", true);
        smartRouteLIZ.withParam("prop_page_enter_method", "profile_tab_anchor");
        smartRouteLIZ.withParam("tt_template_type", c1387380mCuLJIIZILJ.LIZJ);
        smartRouteLIZ.withParam("tt_template_id", c1387380mCuLJIIZILJ.LIZLLL);
        if (anchorCommonStruct != null) {
            logExtra = anchorCommonStruct.getLogExtra();
        } else {
            logExtra = null;
        }
        smartRouteLIZ.withParam("anchor_type", new C1065100dp6(logExtra).LJ());
        smartRouteLIZ.withParam("sticker_title", str3);
        if (!z || anchorCommonStruct2 == null || (strLIZ = new C1065100dp6(anchorCommonStruct2.getLogExtra()).LIZ()) == null) {
            strLIZ = "";
        }
        smartRouteLIZ.withParam("voice_conversion_effect_id", strLIZ);
        if (z && anchorCommonStruct2 != null && (strLIZIZ = new C1065100dp6(anchorCommonStruct2.getLogExtra()).LIZIZ()) != null) {
            str4 = strLIZIZ;
        }
        smartRouteLIZ.withParam("voice_conversion_effect_name", str4);
        if (C1388190mED.LIZ(context) != null && C636090OxD.LIZ()) {
            MusicDetailCommonModel musicDetailCommonModel = MusicDetailCommonModel.INSTANCE;
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                intent = activityLIZ.getIntent();
            } else {
                intent = null;
            }
            String strCurSquareActionPositionOnInnerFeed = musicDetailCommonModel.curSquareActionPositionOnInnerFeed(aweme, intent);
            if (C123100dR.LIZ(strCurSquareActionPositionOnInnerFeed)) {
                smartRouteLIZ.withParam("transport_mdp_square_action_position", strCurSquareActionPositionOnInnerFeed);
                Activity activityLIZ2 = C1388190mED.LIZ(context);
                if (activityLIZ2 != null) {
                    intent2 = activityLIZ2.getIntent();
                }
                smartRouteLIZ.withParam("followup_square_rec_type", musicDetailCommonModel.squareRecTypeInnerFeed(aweme, intent2));
                smartRouteLIZ.withParam("followup_square_rec_reason", musicDetailCommonModel.squareRecReasonInnerFeed(aweme, C1388190mED.LIZ(context)));
            }
        }
        function1.invoke(smartRouteLIZ);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
