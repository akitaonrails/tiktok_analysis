package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.AutoSelectedAnchorInfos;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.BackgroundVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.DiyPropVideoCompileConfigure;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.DiyPropUploadVideoAutoCutConfigure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import uxk.a;

/* JADX INFO: renamed from: X.0MUr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569350MUr {
    public static final C569350MUr LIZ = new C569350MUr();

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(C569220MUe c569220MUe, Intent intent) {
        MicroAppModel microAppModel;
        int iLIZIZ;
        int i;
        String str;
        Workspace workspace;
        c569220MUe.LJIIZILJ = C0MUK.LIZIZ(intent);
        intent.getLongExtra("min_duration", C566050MHz.LIZIZ());
        String strLIZ = LIZ(intent, "path");
        if (!TextUtils.isEmpty(strLIZ) && (workspace = c569220MUe.LJIIIIZZ) != null) {
            workspace.MC(strLIZ);
        }
        if (intent.getSerializableExtra("av_challenge") != null) {
            c569220MUe.LJ.clear();
            c569220MUe.LJ.add((AVChallenge) intent.getSerializableExtra("av_challenge"));
        }
        if (intent.getSerializableExtra("av_challenge_list") != null) {
            c569220MUe.LJ = (ArrayList) intent.getSerializableExtra("av_challenge_list");
        }
        String strLIZ2 = LIZ(intent, "micro_app_id");
        String str2 = null;
        if (strLIZ2 == null) {
            MicroAppModel microAppModel2 = c569220MUe.LJIIZILJ.microAppModel;
            if (microAppModel2 != null) {
                strLIZ2 = microAppModel2.getMicroAppId();
            } else {
                strLIZ2 = null;
            }
        }
        c569220MUe.LJFF = strLIZ2;
        if (intent.getSerializableExtra("micro_app_info") == null) {
            microAppModel = c569220MUe.LJIIZILJ.microAppModel;
        } else {
            microAppModel = (MicroAppModel) intent.getSerializableExtra("micro_app_info");
        }
        c569220MUe.LJI = microAppModel;
        c569220MUe.LJIL.setExtraShareOptions((HashMap) intent.getSerializableExtra("_aweme_open_sdk_extra_share_options"));
        c569220MUe.LJII = intent.getBooleanExtra("enter_record_from_other_platform", false);
        c569220MUe.LJIIIZ = (C1402840mbq) intent.getSerializableExtra("extra_share_context");
        c569220MUe.LJIIJ = intent.getIntExtra("extra_stick_point_type", 0);
        c569220MUe.LJIIJJI = LIZ(intent, "shoot_way");
        CreativeFlowData creativeFlowData = (CreativeFlowData) intent.getParcelableExtra("creative_flow_data");
        if (creativeFlowData != null) {
            c569220MUe.LJIL = creativeFlowData;
        } else {
            c569220MUe.LJIL = c569220MUe.LJIIZILJ.creativeFlowData;
        }
        c569220MUe.LJIJ = LIZ(intent, "music_origin");
        c569220MUe.LJIIL = intent.getBooleanExtra("from_background_video", false);
        c569220MUe.LJIILIIL = intent.getBooleanExtra("from_diy_prop_video", false);
        c569220MUe.LJJIII = (BackgroundVideoCompileConfigure) intent.getParcelableExtra("background_video_compile_configure");
        c569220MUe.LJJIIJ = (DiyPropVideoCompileConfigure) intent.getParcelableExtra("diy_prop_video_compile_configure");
        long longExtra = intent.getLongExtra("cut_video_max_length", 15000L);
        c569220MUe.LJIILJJIL = longExtra;
        if (longExtra == 59000) {
            c569220MUe.LJIILJJIL = 60000L;
        }
        c569220MUe.LJIILL = (DiyPropUploadVideoAutoCutConfigure) intent.getParcelableExtra("diy_prop_upload_video_configure");
        c569220MUe.LJIILLIIL = C537520L6g.LIZ(intent);
        c569220MUe.LJIJJ = LIZ(intent, "share_id");
        c569220MUe.LJIJJLI = LIZ(intent, "channel");
        if (ComplianceServiceProvider.LJIJJ().LJJIIZ()) {
            iLIZIZ = 1;
        } else if (C569240MUg.LIZ() && !c569220MUe.LJIIZILJ.draftInfoModel.isDraft) {
            a.LIZ.getClass();
            iLIZIZ = a.LIZ();
        } else {
            a.LIZ.getClass();
            iLIZIZ = a.LIZIZ();
        }
        c569220MUe.LJJ = intent.getIntExtra("is_private", iLIZIZ);
        intent.getBooleanExtra("draft_to_cut", false);
        c569220MUe.LJIJI = intent.getBooleanExtra("extra_enter_from_live", false);
        c569220MUe.LJJII = intent.getLongExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        c569220MUe.LJJI = LIZ(intent, "upload_next_method");
        AutoSelectedAnchorInfos autoSelectedAnchorInfos = c569220MUe.LJIL.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos != null && autoSelectedAnchorInfos.openPlatformShareId != null) {
            i = 5;
            str = "album_import";
        } else {
            i = 3;
            str = "jsb";
        }
        AutoSelectedAnchorInfos autoSelectedAnchorInfos2 = c569220MUe.LJIL.getAutoSelectedAnchorInfos();
        if (autoSelectedAnchorInfos2 != null) {
            if (autoSelectedAnchorInfos2.openPlatformClientKey == null) {
                autoSelectedAnchorInfos2.setOpenPlatformClientKey(LIZ(intent, "open_platform_client_key"));
            }
            if (autoSelectedAnchorInfos2.openPlatFormExtra == null) {
                autoSelectedAnchorInfos2.setOpenPlatFormExtra(LIZ(intent, "open_platform_extra"));
            }
            if (autoSelectedAnchorInfos2.anchorSourceType == null) {
                C1402840mbq c1402840mbq = c569220MUe.LJIIIZ;
                if (c1402840mbq != null) {
                    str2 = c1402840mbq.mAnchorSourceType;
                }
                autoSelectedAnchorInfos2.setAnchorSourceType(str2);
            }
            autoSelectedAnchorInfos2.setOpenPlatformAddFrom(Integer.valueOf(i));
            autoSelectedAnchorInfos2.setAnchorShootWay(str);
        }
    }

    public static Intent LIZJ(Intent intent, C569220MUe c569220MUe, C569360MUs c569360MUs, long j, boolean z) {
        boolean z2;
        int i;
        boolean z3;
        String stringExtra;
        List<VideoSegment> list = c569360MUs.LIZ;
        Workspace workspace = c569220MUe.LJIIIIZZ;
        Intent intent2 = new Intent(intent);
        C0MUK.LJIIIZ(intent2, c569220MUe.LJIIZILJ);
        C537520L6g.LIZLLL(intent2, c569220MUe.LJIILLIIL);
        intent2.putExtra("extra_start_enter_edit_page", j);
        intent2.putExtra("extra_import_compile_cost_time", System.currentTimeMillis() - j);
        intent2.putExtra("content_source", "upload");
        C574750MgT.LIZ.getClass();
        intent2.putExtra("content_type", C574750MgT.LIZIZ(false));
        intent2.putExtra("enable_music_path_check", false);
        C0MUK.LIZIZ(intent2).editModel.fromCut = true;
        intent2.putExtra("origin", 0);
        intent2.putExtra("extra_stick_point_type", c569220MUe.LJIIJ);
        intent2.putExtra("is_private", c569220MUe.LJJ);
        intent2.putExtra("share_id", c569220MUe.LJIJJ);
        intent2.putExtra("channel", c569220MUe.LJIJJLI);
        if (c569220MUe.LJI == null && TextUtils.isEmpty(c569220MUe.LJFF)) {
            z2 = true;
        } else {
            z2 = false;
        }
        intent2.putExtra("back_to_main_after_publish", z2);
        intent2.putExtra("challenge", c569220MUe.LJ);
        intent2.putExtra("enter_record_from_other_platform", C569230MUf.LIZ(c569220MUe));
        C0MUK.LIZIZ(intent2).microAppModel = c569220MUe.LJI;
        MicroAppModel microAppModel = C0MUK.LIZIZ(intent2).microAppModel;
        if (microAppModel != null) {
            microAppModel.setMicroAppId(c569220MUe.LJFF);
        }
        intent2.putExtra("music_origin", c569220MUe.LJIJ);
        C0MUK.LIZIZ(intent2).creativeFlowData = c569220MUe.LJIL;
        C0MUK.LIZIZ(intent2).albumModel.isMultiVideo = c569360MUs.LIZJ;
        intent2.putExtra("extra_is_change_speed", c569360MUs.LIZLLL);
        C0MUK.LIZIZ(intent2).editModel.fromMultiCut = c569360MUs.LIZJ;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator<VideoSegment> it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if (it2.next().isImageType && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        int size = list.size() - i;
        C0MUK.LIZIZ(intent2).albumModel.photoCount = i;
        C0MUK.LIZIZ(intent2).albumModel.videoCount = size;
        C0MUK.LIZIZ(intent2).editModel.videoDurationFromVideoCutPage = (int) c569360MUs.LIZIZ;
        LIZ.getClass();
        String strLIZ = LIZ(intent, "hashtag");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        C579490Mo7.LIZ(c569220MUe.LJI, sb, arrayList);
        if (sb.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && C123100dR.LIZ(strLIZ)) {
            String[] strArr = new String[1];
            if (strLIZ == null) {
                strLIZ = "";
            }
            strArr[0] = strLIZ;
            ArrayList<String> arrayListLJ = C1697810uHb.LJ(strArr);
            if (!arrayListLJ.isEmpty()) {
                for (String str : arrayListLJ) {
                    sb.append("#");
                    sb.append(str);
                    sb.append(" ");
                }
            }
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            intent2.putExtra("video_title", sb.toString());
        }
        if (!arrayList.isEmpty()) {
            intent2.putExtra("struct_list", arrayList);
        }
        LIZ.getClass();
        C0MUK.LIZIZ(intent2).stickPointModel.isStickPointMode = false;
        if (c569360MUs.LIZJ && !z) {
            if (workspace != null) {
                workspace.wQ();
            }
            C1452640nuA.LJI(null);
        }
        Iterator<VideoSegment> it3 = c569360MUs.LIZ.iterator();
        long j2 = 0;
        while (it3.hasNext()) {
            j2 += it3.next().duration;
        }
        intent2.putExtra("extra_import_total_video_duration", j2);
        EnumC569430MUz enumC569430MUz = EnumC569430MUz.CUT;
        EnumC569430MUz enumC569430MUz2 = EnumC569430MUz.EDIT;
        for (EnumC2273951DzV enumC2273951DzV : EnumC2273951DzV.values()) {
            String str2 = enumC2273951DzV.intentKey;
            InterfaceC569380MUu interfaceC569380MUu = (InterfaceC569380MUu) ((ConcurrentHashMap) C569390MUv.LIZ).get(enumC2273951DzV);
            if (interfaceC569380MUu == null) {
                interfaceC569380MUu = C569390MUv.LIZJ;
            }
            try {
                stringExtra = intent.getStringExtra(enumC2273951DzV.intentKey);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
            intent2.putExtra(str2, interfaceC569380MUu.LIZ(stringExtra, enumC569430MUz, enumC569430MUz2));
        }
        return intent2;
    }
}
