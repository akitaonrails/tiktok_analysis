package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.EditorProRecordVideoContext;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LJM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJM implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public Activity activity;
    public final EditorProRecordVideoContext editorProRecordInfo;
    public final Function0<C0L0V> lyricEffectApiProvider;

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
    }

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.c1w;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needFullSpan() {
        return false;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needGray() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public void onRecoverFromGray() {
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return new ACListenerS143S0100000_8(this, 122);
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
        this.activity = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LJM(EditorProRecordVideoContext editorProRecordVideoContext, Function0<? extends C0L0V> function0) {
        this.editorProRecordInfo = editorProRecordVideoContext;
        this.lyricEffectApiProvider = function0;
    }

    public final void jumpToRetake(EditorProRecordVideoContext editorProRecordVideoContext, Activity activity) {
        VideoPublishEditModel videoPublishEditModel;
        if (!editorProRecordVideoContext.isRetake) {
            return;
        }
        C0E48 c0e48 = C0E6V.LIZ;
        C0E6V.LIZ = null;
        if (c0e48 == null) {
            return;
        }
        C0F1Z c0f1z = C0F1Z.LIZ;
        boolean z = editorProRecordVideoContext.isPip;
        c0f1z.getClass();
        RetakeVideoContext retakeVideoContextLIZJ = C0F1Z.LIZJ(c0e48, true, z);
        if (retakeVideoContextLIZJ == null || (videoPublishEditModel = C0F1Z.LIZLLL) == null) {
            return;
        }
        c0f1z.getClass();
        C0F1Z.LJ(c0e48, retakeVideoContextLIZJ);
        C350870DpF.LJI(c0e48);
        C361680EFy.LJLJI("enter_reshoot_video_time", String.valueOf(System.currentTimeMillis()));
        retakeVideoContextLIZJ.isRetakeOriginUploadSource = editorProRecordVideoContext.isRetakeOriginUploadSource;
        CreativeModel creativeModel = editorProRecordVideoContext.creativeModel;
        boolean z2 = false;
        if (creativeModel != null && creativeModel.nowsShootModel != null) {
            z2 = true;
        }
        retakeVideoContextLIZJ.originFromNowsPage = z2;
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438900nY0 c1438900nY0 = new C1438900nY0(activity, retakeVideoContextLIZJ, videoPublishEditModel, true, C350870DpF.LJI(c0e48));
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438900nY0);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", editorProRecordVideoContext.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", editorProRecordVideoContext.shootWay);
        c0lab.LJ("enter_from", "upload_page");
        c0lab.LIZ(1, "is_editor_pro");
        c0lab.LIZ(1, "is_replace");
        c0lab.LIZ(editorProRecordVideoContext.isPip ? 1 : 0, "is_pip");
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }

    public final void performJumpToRecord(EditorProRecordVideoContext editorProRecordVideoContext, Activity activity) {
        boolean z;
        boolean z2;
        String str;
        EditorProSchemeModel editorProSchemeModel;
        CreativeModel creativeModel = editorProRecordVideoContext.creativeModel;
        if (creativeModel != null && (editorProSchemeModel = creativeModel.editorProSchemeModel) != null && C537970L7z.LJFF(editorProSchemeModel)) {
            z = true;
        } else {
            z = false;
            editorProRecordVideoContext.recordDir = C20021913Vp.LIZJ(editorProRecordVideoContext.creativeInfo, "editor_pro", EnumC20228214Cy.RECORD);
        }
        CreativeModel creativeModel2 = editorProRecordVideoContext.creativeModel;
        if (creativeModel2 != null && creativeModel2.nowsShootModel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        editorProRecordVideoContext.isNows = z2;
        Intent intent = new Intent();
        intent.putExtra("extra_editor_pro_to_record", true);
        intent.putExtra("extra_editor_pro_to_record_data", editorProRecordVideoContext);
        if (!Intrinsics.LJFF(editorProRecordVideoContext.shootWay, "ugc_template") && !Intrinsics.LJFF(editorProRecordVideoContext.shootWay, "pugc_template")) {
            str = editorProRecordVideoContext.shootWay;
        } else {
            str = "direct_shoot";
        }
        intent.putExtra("shoot_way", str);
        intent.putExtra("enter_from", "upload_page");
        intent.putExtra("enter_method", "click_ep_add_material");
        CreativeModel creativeModel3 = editorProRecordVideoContext.creativeModel;
        Integer num = null;
        if (creativeModel3 != null) {
            CreativeModel creativeModelLIZ = creativeModel3.LIZ();
            creativeModelLIZ.isCopiedModel = true;
            creativeModelLIZ.editSaveLocalModel.flowId = C1017903yT.LIZ();
            creativeModelLIZ.editSaveLocalModel.saveLocalProgress = -1;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(creativeModelLIZ.musicBuzModel);
            if (aVMusicExtractAVMusic != null) {
                aVMusicExtractAVMusic.setMusicEndTime(aVMusicExtractAVMusic.getDuration());
            } else {
                aVMusicExtractAVMusic = null;
            }
            MusicBeanUtilKt.updateAVMusic(creativeModelLIZ.musicBuzModel, aVMusicExtractAVMusic);
            if (z) {
                C537520L6g.LIZLLL(intent, creativeModel3.creativeInfo);
            }
            C0MUK.LJIIIZ(intent, creativeModelLIZ);
            intent.putExtra("music_origin", creativeModelLIZ.musicBuzModel.musicOrigin);
        }
        if (!z) {
            num = 21111;
        }
        C1438950nY5 c1438950nY5 = new C1438950nY5(activity, intent, num);
        C1438840nXu.LIZ.getClass();
        C1438840nXu.LIZ(c1438950nY5);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", editorProRecordVideoContext.creativeInfo.getCreationId());
        c0lab.LJ("shoot_way", editorProRecordVideoContext.shootWay);
        c0lab.LJ("enter_from", "upload_page");
        c0lab.LIZ(1, "is_editor_pro");
        c0lab.LIZ(0, "is_replace");
        c0lab.LIZ(editorProRecordVideoContext.isPip ? 1 : 0, "is_pip");
        C20684815ws.LJIILLIIL("click_record_entrance", c0lab.LIZ);
    }
}
