package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateAlbumService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import lth.o;

/* JADX INFO: renamed from: X.0Kdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522080Kdi {
    public final /* synthetic */ MvChoosePhotoScene LIZ;
    public final /* synthetic */ Bundle LIZIZ;

    public final void LIZ() {
        this.LIZ.finishScene(false);
    }

    public C522080Kdi(MvChoosePhotoScene mvChoosePhotoScene, Bundle bundle) {
        this.LIZ = mvChoosePhotoScene;
        this.LIZIZ = bundle;
    }

    public final void LIZIZ(int i, int i2) {
        String strLIZJ;
        ITemplateAlbumService iTemplateAlbumService;
        ArrayList<CutSameVideoImageExtraData> arrayListLIZIZ;
        Bundle bundle = new Bundle();
        int i3 = this.LIZIZ.getInt("key_photo_select_min_count", i2);
        int i4 = this.LIZIZ.getInt("key_video_select_min_count", i2);
        bundle.putInt("key_photo_select_min_count", i3);
        bundle.putInt("key_photo_select_max_count", i2);
        bundle.putInt("key_video_select_min_count", i4);
        bundle.putInt("key_video_select_max_count", i2);
        bundle.putInt("key_support_flag", 6);
        bundle.putBoolean("Key_enable_multi_video", true);
        bundle.putInt("key_choose_scene", 6);
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC522270Ke1 interfaceC522270Ke1 = mvChoosePhotoScene.cutSameController;
        ArrayList arrayList = null;
        if (interfaceC522270Ke1 != null && (arrayListLIZIZ = interfaceC522270Ke1.LIZIZ()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayListLIZIZ, 10));
            Iterator<CutSameVideoImageExtraData> it2 = arrayListLIZIZ.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf((int) it2.next().extraDuration));
            }
        }
        mvChoosePhotoScene.clipProcessItems = C09HN.LIZ(arrayList);
        if (!o.LJI() && C529980KqS.LIZJ(this.LIZ.getChooseScene$tools_camera_record_release()) && !C529980KqS.LIZIZ(this.LIZ.getChooseScene$tools_camera_record_release(), this.LIZ.shortVideoContext) && C298870BnZ.LIZ()) {
            this.LIZ.getString(2131850073);
        } else if (i == 2) {
            C786410Ut5.LJJJI("key_mv_hint_text", this.LIZ.getString(2131837856), bundle);
            bundle.putBoolean("Key_replace_item", true);
        } else if (i == 1) {
            Context sceneContext = this.LIZ.getSceneContext();
            if (sceneContext == null || (iTemplateAlbumService = C523300Kfg.LIZ) == null || (strLIZJ = iTemplateAlbumService.LIZJ(i2, C0LE5.LIZIZ(), sceneContext)) == null) {
                strLIZJ = "";
            }
            C786410Ut5.LJJJI("key_mv_hint_text", strLIZJ, this.LIZIZ);
        }
        C786410Ut5.LJJIIJZLJL(this.LIZIZ, bundle);
    }
}
