package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C535980L0i implements InterfaceC522520KeQ {
    public final C19EG LL;
    public final C1DRG LLILLJJLI;
    public long LLILLL = -1;
    public CreativeDialogWrapper LLILZ;
    public AnonymousClass0956 LLILZIL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public final void LIZJ() {
        CreativeDialogWrapper creativeDialogWrapper = this.LLILZ;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public C535980L0i(C19EG c19eg, C1DRG c1drg) {
        this.LL = c19eg;
        this.LLILLJJLI = c1drg;
    }

    public final void LJFF(int i, ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZ(1, "stage");
        c0lab.LJ("creation_id", shortVideoContext.creativeInfo.getCreationId());
        if (this.LLILLL > 0) {
            c0lab.LIZIZ(System.currentTimeMillis() - this.LLILLL, "interval_click_next");
        }
        C20684815ws.LJIILLIIL("tools_performance_pre_cut_opt_process", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    @Override // X.InterfaceC522520KeQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r16, int r17, android.content.Intent r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535980L0i.LIZ(int, int, android.content.Intent):void");
    }

    public final void LIZLLL(ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, boolean z, int i, int i2, Intent intent) {
        Long lValueOf;
        C524780Ki4.LIZ.step("av_image_edit", "end fetchLivePhotoEffect");
        C0L14 c0l14 = C0L14.LIZ;
        C19EG c19eg = this.LL;
        AwS252S0300000_8 awS252S0300000_8 = new AwS252S0300000_8(this, shortVideoContext, intent, 33);
        C535950L0f c535950L0f = new C535950L0f(this, shortVideoContext, intent, arrayList, i, i2);
        C1DRG c1drg = this.LLILLJJLI;
        long j = this.LLILLL;
        if (j == -1) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(j);
        }
        boolean booleanExtra = intent.getBooleanExtra("key_is_reuse_pre_download_music_in_stack", false);
        C523870Kgb.LIZ(intent);
        C0L13 c0l13 = new C0L13(c19eg, shortVideoContext, arrayList, z, awS252S0300000_8, c535950L0f, c1drg, lValueOf, booleanExtra);
        c0l14.getClass();
        C0L14.LIZ(c0l13);
    }

    public void LJ(int i, int i2, Intent intent, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, int i3) {
        LivePhotoModel livePhotoModel;
        Map<String, MediaModel> map;
        EditorProModel editorProModel;
        C013C c013c = new C013C();
        c013c.element = true;
        IPreDownloadMusic iPreDownloadMusicLIZ = C569270MUj.LIZ(this.LL, null, false);
        if (iPreDownloadMusicLIZ != null) {
            c013c.element = iPreDownloadMusicLIZ.isReEnterChoosePhoto();
        }
        shortVideoContext.singleImageCoverBitmapData = new SingleImageCoverBitmapData(((MediaModel) ListProtector.get(arrayList, 0)).LJFF(), i3, ((MediaModel) ListProtector.get(arrayList, 0)).date, ((MediaModel) ListProtector.get(arrayList, 0)).type, ((MediaModel) ListProtector.get(arrayList, 0)).width, ((MediaModel) ListProtector.get(arrayList, 0)).height, null, false);
        if (intent.hasExtra("key_story_canvas_bg_color_start") && intent.hasExtra("key_story_canvas_bg_color_end")) {
            shortVideoContext.creativeModel.editModel.storyCanvasBgColorFromAlbumStart = Integer.valueOf(intent.getIntExtra("key_story_canvas_bg_color_start", 0));
            shortVideoContext.creativeModel.editModel.storyCanvasBgColorFromAlbumEnd = Integer.valueOf(intent.getIntExtra("key_story_canvas_bg_color_end", 0));
        }
        if (intent.getIntExtra("key_choose_scene", -1) == 31) {
            AVMusic aVMusic = (AVMusic) intent.getSerializableExtra("aweme_music");
            MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
            musicBuzModel.musicOrigin = "mv_default";
            C1452640nuA.LJII(aVMusic, false, musicBuzModel);
        }
        if (intent.getIntExtra("key_choose_scene", -1) == 50) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            DMCameraModel dMCameraModel = creativeModel.initialModel.dmCameraModel;
            dMCameraModel.enterFromDM = true;
            dMCameraModel.isBulletin = true;
            creativeModel.editModel.singleImageCoverBitmapData = shortVideoContext.singleImageCoverBitmapData;
        }
        try {
            String stringExtra = intent.getStringExtra("editor_tab_tool_type");
            if (stringExtra != null && Intrinsics.LJFF(stringExtra, "photo_editor") && (editorProModel = shortVideoContext.creativeFlowData.getEditorProModel()) != null) {
                editorProModel.setOpenEditToolType(stringExtra);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJFF(0, shortVideoContext);
        if (C295670BiP.LIZ() && (livePhotoModel = shortVideoContext.creativeModel.livePhotoModel) != null && (map = livePhotoModel.embeddedVideoMap) != null && map.size() > 0) {
            AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLILZIL = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C535920L0c(i2, intent, shortVideoContext, this, arrayList, null, c013c), 2);
        } else {
            LIZLLL(shortVideoContext, arrayList, c013c.element, i2, i2, intent);
        }
        IPreDownloadMusic iPreDownloadMusicLIZ2 = C569270MUj.LIZ(this.LL, null, false);
        if (iPreDownloadMusicLIZ2 != null) {
            iPreDownloadMusicLIZ2.setIsReEnterChoosePhoto(false);
        }
    }
}
