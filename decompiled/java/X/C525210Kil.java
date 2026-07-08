package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0Kil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525210Kil implements InterfaceC484050IyZ {
    public final /* synthetic */ MvChoosePhotoScene LL;

    public C525210Kil(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC484050IyZ
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        CreativeModel creativeModel;
        QuickGridModel quickGridModel;
        String str;
        C0L4W c0l4w;
        CreativeModel creativeModel2;
        ClipData clipData;
        C0L0I c0l0i = C0L0I.LIZ;
        int chooseScene$tools_camera_record_release = this.LL.getChooseScene$tools_camera_record_release();
        boolean zClearPreviousMediaIfAny = this.LL.clearPreviousMediaIfAny();
        C525220Kim c525220Kim = new C525220Kim(this.LL);
        c0l0i.getClass();
        if (i == 12353) {
            if (i2 != -1) {
                if (i2 == 0) {
                    c525220Kim.invoke(C13BV.INSTANCE);
                }
            } else if (intent != null && (clipData = intent.getClipData()) != null) {
                IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, clipData.getItemCount());
                ArrayList arrayList = new ArrayList();
                C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                while (it2.LLILLL) {
                    Uri uri = C2204961BRm.LJJIIZ(clipData, it2.nextInt(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkcfBgI0ODPb91LyjQZq8ouckNS06t23ZNOe/7M1Ff6XRJJRA3q91QC+oNA==", null)).getUri();
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                List<? extends Uri> listLLIIII = C13LP.LLIIII(arrayList);
                C0L0I.LIZLLL = chooseScene$tools_camera_record_release;
                if (zClearPreviousMediaIfAny) {
                    C0L0I.LIZIZ.clear();
                    C0L0I.LIZJ.clear();
                }
                if (C522640Kec.LIZ()) {
                    for (Uri uri2 : listLLIIII) {
                        C0L0I.LIZIZ.addIfAbsent(uri2);
                        C0CHQ.LIZ.getContentResolver().takePersistableUriPermission(uri2, 1);
                    }
                } else {
                    CopyOnWriteArrayList<Uri> copyOnWriteArrayList = C0L0I.LIZIZ;
                    copyOnWriteArrayList.clear();
                    copyOnWriteArrayList.addAll(listLLIIII);
                }
                c525220Kim.invoke(listLLIIII);
                return true;
            }
            return true;
        }
        if (this.LL.isCutSameMode()) {
            if (intent != null && !intent.hasExtra("key_short_video_context")) {
                intent.putExtra("key_short_video_context", this.LL.shortVideoContext);
            }
            MvChoosePhotoScene mvChoosePhotoScene = this.LL;
            InterfaceC522270Ke1 interfaceC522270Ke1 = mvChoosePhotoScene.cutSameController;
            if (interfaceC522270Ke1 != null) {
                interfaceC522270Ke1.LIZLLL(mvChoosePhotoScene.requireActivity(), i, i2, intent);
            }
            return true;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LL;
        if (i == mvChoosePhotoScene2.startActivityRequestCode) {
            if ((mvChoosePhotoScene2.getChooseScene$tools_camera_record_release() == 4 || this.LL.isCustomSticker() || this.LL.getChooseScene$tools_camera_record_release() == 37) && i2 != -1) {
                return true;
            }
            MvChoosePhotoScene mvChoosePhotoScene3 = this.LL;
            if (!mvChoosePhotoScene3.isOnlyUseMvChoosePhotoScene) {
                C2204961BRm.LJIIL(i2, mvChoosePhotoScene3.requireActivity(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbTleDEGc=", null));
            }
            this.LL.finishScene(false);
        }
        if (i == 12347) {
            ShortVideoContext shortVideoContext = this.LL.shortVideoContext;
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null) {
                creativeModel2.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
            }
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this.LL);
            if (c1drgLJIIIZ != null && (c0l4w = (C0L4W) c1drgLJIIIZ.LJIIL(null, C0L4W.class)) != null) {
                c0l4w.exit();
            }
            this.LL.recoverRecordMusic();
            return false;
        }
        if (i == 21114) {
            MvChoosePhotoScene mvChoosePhotoScene4 = this.LL;
            if (mvChoosePhotoScene4 instanceof SelectMaterialScene) {
                mvChoosePhotoScene4.setResult(i2, intent);
            }
            this.LL.finishScene(false);
            return true;
        }
        if (i == 21111) {
            if (i2 != 30001) {
                if (i2 == 30002) {
                    MvChoosePhotoScene mvChoosePhotoScene5 = this.LL;
                    if (mvChoosePhotoScene5 instanceof SelectMaterialScene) {
                        mvChoosePhotoScene5.setResult(i2, intent);
                    } else {
                        C2204961BRm.LJIIL(i2, mvChoosePhotoScene5.requireActivity(), intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uavXjSXEDau27GyYrPyK/QDSg9KKzkenDPbTleDEGc=", null));
                    }
                    this.LL.finishScene(false);
                    return true;
                }
            } else {
                MvChoosePhotoScene mvChoosePhotoScene6 = this.LL;
                if (mvChoosePhotoScene6 instanceof SelectMaterialScene) {
                    mvChoosePhotoScene6.setResult(i2, intent);
                }
                this.LL.finishScene(false);
                return true;
            }
        } else if (i == 12345 || i == 20) {
            return false;
        }
        if (this.LL.isFromPhotoComment() && ((Number) C277470Au9.LIZ.getValue()).intValue() > 0) {
            CommentService.LIZ.getClass();
            Pair pairLJJJJ = C523420Kfs.LIZ().LJJJJ(i, i2, this.LL.mActivity);
            if (pairLJJJJ != null && ((Number) pairLJJJJ.getFirst()).intValue() == 0 && (str = (String) pairLJJJJ.getSecond()) != null) {
                this.LL.handlePhotoCommentByShooting(str);
            }
            return true;
        }
        if (i != 12358) {
            return false;
        }
        C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this.LL)).LLJJI;
        if (c1drg != null) {
            ShortVideoContext shortVideoContext2 = this.LL.shortVideoContext;
            if (shortVideoContext2 != null && (creativeModel = shortVideoContext2.creativeModel) != null && (quickGridModel = creativeModel.quickGridModel) != null) {
                quickGridModel.isFromQuickGrid = false;
            }
            InterfaceC522500KeO interfaceC522500KeO = (InterfaceC522500KeO) c1drg.LJIIL(null, InterfaceC522500KeO.class);
            if (interfaceC522500KeO != null) {
                interfaceC522500KeO.OL(false);
            }
        }
        return true;
    }
}
