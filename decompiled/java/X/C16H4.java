package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.music.v2.panel.MusicListPanelFragment;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.16H4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16H4 extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        if (2 - this.$t != 0) {
            super.onFailed();
        } else {
            onFailed$0(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            case 2:
                onLoad$2(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public static final void onFailed$0(C16H4 c16h4) {
        ((C15OG) c16h4.l2).LJ();
    }

    public static final void onLoad$0(C16H4 c16h4, AsyncAVService asyncAVService, long j) {
        String str;
        boolean booleanExtra;
        C20684815ws.LJIJI("music_detail_trace", new Pair("skip_to_video_progress_start_record", "stage"));
        String str2 = "share_from_resso";
        if (Intrinsics.LJFF("share_from_resso", ((MusicShootAssem) c16h4.l0).getFrom())) {
            str = "share_from_resso";
        } else {
            str = "single_song";
        }
        Intent intentLIZJ = C629480OmY.LIZJ(((MusicShootAssem) c16h4.l0).getFragment());
        if (intentLIZJ != null) {
            booleanExtra = intentLIZJ.getBooleanExtra("story type", false);
        } else {
            booleanExtra = false;
        }
        String strAq = ((MusicShootAssem) c16h4.l0).aq(null);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(((MusicShootAssem) c16h4.l0).LLLFFI);
        builder.startRecordTime(((MusicShootAssem) c16h4.l0).LLLFZ);
        builder.decompressTime(j);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        if (!Intrinsics.LJFF("share_from_resso", ((MusicShootAssem) c16h4.l0).getFrom())) {
            str2 = "single_song";
        }
        builder.shootWay(str2);
        builder.enterFrom("single_song");
        builder.enterMethod("click_play_music");
        builder.relationEnterMethod(strAq);
        builder.translationType(C298070BmH.LIZ());
        builder.musicWithSticker((Effect) c16h4.l1);
        builder.musicOrigin(str);
        builder.videoLength(Integer.valueOf(((MusicShootAssem) c16h4.l0).jq()));
        builder.recordFromFeed(((Boolean) ((MusicShootAssem) c16h4.l0).LLLLLLIL.getValue()).booleanValue());
        builder.isUsedFullSong(((MusicShootAssem) c16h4.l0).LLLIIII);
        String strDq = ((MusicShootAssem) c16h4.l0).dq();
        if (!TextUtils.isEmpty(strDq)) {
            builder.shootFrom(strDq);
        }
        if (!TextUtils.isEmpty(((MusicShootAssem) c16h4.l0).fq())) {
            MusicShootAssem musicShootAssem = (MusicShootAssem) c16h4.l0;
            builder.stickers(musicShootAssem.Ap(musicShootAssem.fq()));
            MusicShootAssem musicShootAssem2 = (MusicShootAssem) c16h4.l0;
            ArrayList<String> arrayListAp = musicShootAssem2.Ap(musicShootAssem2.fq());
            if (!arrayListAp.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(arrayListAp, 0));
            }
        }
        MusicShootAssem musicShootAssem3 = (MusicShootAssem) c16h4.l0;
        builder.propData((String) musicShootAssem3.LLLLII.getValue(), (String) musicShootAssem3.LLLLIIIILLL.getValue(), (String) musicShootAssem3.LLLL.getValue());
        MusicStickerStruct musicStickerStruct = (MusicStickerStruct) ((MusicShootAssem) c16h4.l0).LLLLLLLZIL.getValue();
        if (musicStickerStruct != null) {
            builder.musicStickerStruct(musicStickerStruct);
        }
        LyricStickerStruct lyricStickerStruct = (LyricStickerStruct) ((MusicShootAssem) c16h4.l0).LLLLZI.getValue();
        if (lyricStickerStruct != null) {
            builder.lyricStickerStruct(lyricStickerStruct);
        }
        ISearchService iSearchService = C1ER1.LIZIZ;
        String from = ((MusicShootAssem) c16h4.l0).getFrom();
        String strXp = ((MusicShootAssem) c16h4.l0).Xp();
        if (strXp == null) {
            strXp = "";
        }
        HashMap mapLJLILLLLZI = iSearchService.LJLILLLLZI(from, strXp);
        if (mapLJLILLLLZI != null && mapLJLILLLLZI.size() > 0) {
            builder.extraLogParams(mapLJLILLLLZI);
        }
        if (booleanExtra) {
            builder.landingTab("story");
        }
        builder.recordPresetResource(new RecordPresetResource(builder.build().getMusicSticker(), (Effect) c16h4.l1, ((MusicModel) c16h4.l2).getMusicId(), (MusicModel) c16h4.l2));
        builder.isFavouriteMusic(((MusicShootAssem) c16h4.l0).kq());
        if (((Effect) c16h4.l1) != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().isEffectControlGame((Effect) c16h4.l1)) {
            asyncAVService.uiService().recordService().startRecord(((MusicShootAssem) c16h4.l0).getActivity(), builder.build());
            MusicShootAssem musicShootAssem4 = (MusicShootAssem) c16h4.l0;
            C1398280mUU.LJIIL(musicShootAssem4.LLLLZLL, musicShootAssem4.LLLFFI);
        } else {
            asyncAVService.uiService().recordService().startRecord(((MusicShootAssem) c16h4.l0).getActivity(), builder.build(), (MusicModel) c16h4.l2, true);
            MusicShootAssem musicShootAssem5 = (MusicShootAssem) c16h4.l0;
            C1398280mUU.LJIIL(musicShootAssem5.LLLLZLL, musicShootAssem5.LLLFFI);
        }
        String musicId = ((MusicModel) c16h4.l2).getMusicId();
        String strXp2 = ((MusicShootAssem) c16h4.l0).Xp();
        MusicShootAssem musicShootAssem6 = (MusicShootAssem) c16h4.l0;
        C1398280mUU.LJIILL(0L, musicId, strXp2, musicShootAssem6.LLLFFI, musicShootAssem6.getAwemeId());
    }

    public static final void onLoad$1(C16H4 c16h4, AsyncAVService asyncAVService, long j) {
        C20684815ws.LJIJI("music_detail_trace", new Pair("skip_to_video_progress_start_record", "stage"));
        String str = "share_from_resso";
        if (!Intrinsics.LJFF("share_from_resso", ((MusicListPanelFragment) c16h4.l0).getFrom())) {
            str = "single_song";
        }
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(((MusicListPanelFragment) c16h4.l0).getCreationId());
        builder.startRecordTime(((MusicListPanelFragment) c16h4.l0).LLLIIL);
        builder.decompressTime(j);
        builder.reshootConfig(new ReshootConfig(true, Boolean.TRUE));
        builder.shootWay("single_song");
        builder.enterFrom("single_song");
        builder.enterMethod("click_play_music");
        builder.translationType(C298070BmH.LIZ());
        builder.musicWithSticker((Effect) c16h4.l1);
        builder.musicOrigin(str);
        builder.videoLength(Integer.valueOf(((Number) ((MusicListPanelFragment) c16h4.l0).LLJJ.getValue()).intValue()));
        builder.recordFromFeed(((Boolean) ((MusicListPanelFragment) c16h4.l0).LLJJLIIIJLLLLLLLZ.getValue()).booleanValue());
        builder.isUsedFullSong(((Boolean) ((MusicListPanelFragment) c16h4.l0).LLJLLL.getValue()).booleanValue());
        String strAS = ((MusicListPanelFragment) c16h4.l0).aS();
        if (!TextUtils.isEmpty(strAS)) {
            builder.shootFrom(strAS);
        }
        if (!TextUtils.isEmpty(((MusicListPanelFragment) c16h4.l0).bS())) {
            MusicListPanelFragment musicListPanelFragment = (MusicListPanelFragment) c16h4.l0;
            builder.stickers(musicListPanelFragment.UR(musicListPanelFragment.bS()));
            MusicListPanelFragment musicListPanelFragment2 = (MusicListPanelFragment) c16h4.l0;
            ArrayList<String> arrayListUR = musicListPanelFragment2.UR(musicListPanelFragment2.bS());
            if (!arrayListUR.isEmpty()) {
                builder.musicSticker((String) ListProtector.get(arrayListUR, 0));
            }
        }
        MusicStickerStruct musicStickerStruct = (MusicStickerStruct) ((MusicListPanelFragment) c16h4.l0).LLJJIJI.getValue();
        if (musicStickerStruct != null) {
            builder.musicStickerStruct(musicStickerStruct);
        }
        ISearchService iSearchService = C1ER1.LIZIZ;
        String from = ((MusicListPanelFragment) c16h4.l0).getFrom();
        String str2 = (String) ((MusicListPanelFragment) c16h4.l0).LLJJJJ.getValue();
        if (str2 == null) {
            str2 = "";
        }
        HashMap mapLJLILLLLZI = iSearchService.LJLILLLLZI(from, str2);
        if (mapLJLILLLLZI != null && mapLJLILLLLZI.size() > 0) {
            builder.extraLogParams(mapLJLILLLLZI);
        }
        builder.recordPresetResource(new RecordPresetResource(builder.build().getMusicSticker(), (Effect) c16h4.l1, ((MusicModel) c16h4.l2).getMusicId(), (MusicModel) c16h4.l2));
        if (((Effect) c16h4.l1) != null && ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService().isEffectControlGame((Effect) c16h4.l1)) {
            C19EG activity = ((MusicListPanelFragment) c16h4.l0).getActivity();
            if (activity != null) {
                asyncAVService.uiService().recordService().startRecord(activity, builder.build());
            }
            MusicListPanelFragment musicListPanelFragment3 = (MusicListPanelFragment) c16h4.l0;
            C1398280mUU.LJIIL(musicListPanelFragment3.LLLIIIL, musicListPanelFragment3.getCreationId());
        } else {
            C19EG activity2 = ((MusicListPanelFragment) c16h4.l0).getActivity();
            if (activity2 != null) {
                asyncAVService.uiService().recordService().startRecord(activity2, builder.build(), (MusicModel) c16h4.l2, true);
            }
            MusicListPanelFragment musicListPanelFragment4 = (MusicListPanelFragment) c16h4.l0;
            C1398280mUU.LJIIL(musicListPanelFragment4.LLLIIIL, musicListPanelFragment4.getCreationId());
        }
        C1398280mUU.LJIILL(0L, ((MusicModel) c16h4.l2).getMusicId(), (String) ((MusicListPanelFragment) c16h4.l0).LLJJJJ.getValue(), ((MusicListPanelFragment) c16h4.l0).getCreationId(), (String) ((MusicListPanelFragment) c16h4.l0).LLJILLL.getValue());
    }

    public static final void onLoad$2(C16H4 c16h4, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        C15OG c15og = (C15OG) c16h4.l2;
        Activity activity = c15og.LJIIJJI;
        RecordConfig recordConfig = (RecordConfig) c16h4.l0;
        iRecordServiceRecordService.startDuet(activity, recordConfig, (DuetConfig) c16h4.l1, c15og.LJJIJ, c15og.LJIILLIIL, recordConfig.getShootway());
    }

    public C16H4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
