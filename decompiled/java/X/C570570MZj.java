package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DetailPageRecallDraftModel;
import com.ss.android.ugc.aweme.creative.model.DraftBoxModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.Intrinsics;
import l5a.a;

/* JADX INFO: renamed from: X.0MZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570570MZj {
    public static final C570570MZj LIZ = new C570570MZj();

    public static Intent LIZ(C570700MZw c570700MZw) {
        String str;
        Function1<CreativeModel, Boolean> function1;
        VideoPublishEditModel videoPublishEditModel = c570700MZw.LIZIZ;
        AwemeDraft awemeDraft = c570700MZw.LIZ;
        int i = c570700MZw.LIZLLL;
        C570750Ma1.LIZ.getClass();
        Intent intentLIZJ = C570750Ma1.LIZJ(i, videoPublishEditModel);
        if (c570700MZw.LIZLLL == 5) {
            str = "click_notification";
        } else {
            str = "click_draft";
        }
        intentLIZJ.putExtra("enter_edit_page_method", str);
        intentLIZJ.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        intentLIZJ.putExtra("translation_type", 3);
        intentLIZJ.putExtra("fromDraft", 1);
        intentLIZJ.putExtra("draft_to_edit_from", i);
        intentLIZJ.putExtra("edit_publish_session_end_together", true);
        intentLIZJ.putExtra("draft_to_edit_start_time", c570700MZw.LJ);
        intentLIZJ.putExtra("draft_modify_time", awemeDraft.lastEditTime);
        C571770Mbf c571770Mbf = new C571770Mbf();
        c571770Mbf.LIZ = awemeDraft;
        intentLIZJ.putExtra("draft_file_size", c571770Mbf.LIZIZ());
        intentLIZJ.putExtra("open_platform_extra", videoPublishEditModel.getOpenPlatformExtra());
        intentLIZJ.putExtra("open_platform_client_key", videoPublishEditModel.getOpenPlatformClientKey());
        intentLIZJ.putExtra("from_prop_id", videoPublishEditModel.fromPropId);
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        ArrayList<C546400Lbq> arrayList = new ArrayList(C15438062q.LJIJJ(listLJFF, 10));
        Iterator<C546230LbZ> it2 = listLJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZJ());
        }
        for (C546400Lbq c546400Lbq : arrayList) {
            if (c546400Lbq != null && (function1 = c546400Lbq.LJIIL) != null && function1.invoke(awemeDraft.LIZ).booleanValue()) {
                intentLIZJ.putExtra("start_saa_with_single_top", true);
            }
        }
        return intentLIZJ;
    }

    public static Intent LIZIZ(C570700MZw c570700MZw) {
        int i;
        VideoPublishEditModel videoPublishEditModel = c570700MZw.LIZIZ;
        AwemeDraft awemeDraft = c570700MZw.LIZ;
        int i2 = c570700MZw.LIZLLL;
        Intent intent = new Intent();
        intent.putExtra("shoot_way", "edit_draft");
        intent.putExtra("translation_type", 3);
        intent.putExtra("fromDraft", 1);
        intent.putExtra("draft_to_edit_from", i2);
        intent.putExtra("edit_publish_session_end_together", true);
        intent.putExtra("draft_to_edit_start_time", c570700MZw.LJ);
        intent.putExtra("draft_modify_time", awemeDraft.lastEditTime);
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        if (aVDraftExtras != null) {
            i = aVDraftExtras.applyVoiceToAllTextSwitch;
        } else {
            i = 0;
        }
        videoPublishEditModel.setApplyVoiceToAllTextSwitch(i);
        videoPublishEditModel.setClickGoNextBtnTime(c570700MZw.LJ);
        Text2ImageModel text2ImageModel = videoPublishEditModel.creativeModel.text2ImageModel;
        text2ImageModel.curPathPage = "draft_page";
        text2ImageModel.curPathPageType = "page";
        C571770Mbf c571770Mbf = new C571770Mbf();
        c571770Mbf.LIZ = awemeDraft;
        intent.putExtra("draft_file_size", c571770Mbf.LIZIZ());
        return intent;
    }

    public static void LIZJ(C570700MZw c570700MZw) {
        String creationId;
        String creationId2;
        CreativeModel creativeModel;
        VideoPublishEditModel videoPublishEditModel = c570700MZw.LIZIZ;
        AwemeDraft awemeDraft = c570700MZw.LIZ;
        int i = c570700MZw.LIZLLL;
        a aVar = a.LIZIZ;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        aVar.LIZ(creationId);
        if (videoPublishEditModel != null) {
            creationId2 = videoPublishEditModel.getCreationId();
        } else {
            creationId2 = null;
        }
        aVar.LIZIZ(creationId2, new C1429980nJc(EnumC1429920nJW.DRAFT_BACK, videoPublishEditModel, null), null);
        List<String> listLIZLLL = C0CHQ.LIZ().getPublishService().LJIIL().LIZLLL();
        boolean z = false;
        if (!listLIZLLL.isEmpty()) {
            if (Intrinsics.LJFF(awemeDraft.LIZJ(), ListProtector.get(listLIZLLL, 0))) {
                C0CHQ.LIZ().getPublishService().LJIIL();
                C1436830nUf.LJIJI(new C572660Md6(awemeDraft));
                C1403010mc7.LIZ.getPublishService().LJIIIIZZ(false, false);
            }
        }
        C1404800mf0.LIZIZ(awemeDraft.LIZ());
        videoPublishEditModel.mDraftToEditFrom = i;
        if (i == 5) {
            z = true;
        }
        videoPublishEditModel.setPostDraftPrompt(z);
        videoPublishEditModel.setEnterFrom("draft_again");
        CreativeModel creativeModel2 = awemeDraft.LIZ;
        if (creativeModel2 != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            DetailPageRecallDraftModel detailPageRecallDraftModel = creativeModel.detailPageRecallDraftModel;
            DetailPageRecallDraftModel detailPageRecallDraftModel2 = creativeModel2.detailPageRecallDraftModel;
            detailPageRecallDraftModel.isDetailPageRecallDraft = detailPageRecallDraftModel2.isDetailPageRecallDraft;
            detailPageRecallDraftModel.isDetailPageRecallPath = detailPageRecallDraftModel2.isDetailPageRecallPath;
            DraftBoxModel draftBoxModel = creativeModel.draftBoxModel;
            DraftBoxModel draftBoxModel2 = creativeModel2.draftBoxModel;
            draftBoxModel.sortBy = draftBoxModel2.sortBy;
            draftBoxModel.filterBy = draftBoxModel2.filterBy;
            draftBoxModel.draftAgainType = draftBoxModel2.draftAgainType;
            draftBoxModel.isPostInDraftBox = draftBoxModel2.isPostInDraftBox;
        }
    }

    public static void LJ(C570700MZw c570700MZw) {
        MusicBuzModel musicBuzModel;
        AVMusic aVMusic = c570700MZw.LIZ.LJ;
        CreativeModel creativeModel = c570700MZw.LIZIZ.creativeModel;
        if (creativeModel != null) {
            musicBuzModel = creativeModel.musicBuzModel;
        } else {
            musicBuzModel = null;
        }
        C1452640nuA.LJII(aVMusic, false, musicBuzModel);
    }

    public static void LJFF(C570570MZj c570570MZj, C570700MZw c570700MZw) {
        c570570MZj.getClass();
        C2342609Fw.LIZ = new C2342509Fv("edit_draft", c570700MZw.LIZ.LIZ());
    }

    public static void LIZLLL(Context context, Intent intent, VideoPublishEditModel videoPublishEditModel) {
        C1202040hNy.LIZ.getClass();
        C1202040hNy.LIZ(videoPublishEditModel);
        C391370FWd.LIZ("", new AwS252S0300000_8(context, intent, videoPublishEditModel, 43));
        C391360FWc.LJ("restore_nle_data", new AwS252S0300000_8(context, intent, videoPublishEditModel, 44));
    }
}
