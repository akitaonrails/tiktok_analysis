package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.publish.EditDescMobModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.functions.Function1;
import lth.o;

/* JADX INFO: renamed from: X.0L5F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L5F {
    public static final C0L5F LIZ = new C0L5F();

    public static final C0LAB LIZ(VideoPublishEditModel videoPublishEditModel) {
        int iIntValue;
        List<SingleImageData> imageList;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("author_id", o.LJIIZILJ.getCurrentUserID());
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            iIntValue = imageList.size();
        } else {
            iIntValue = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond().intValue();
        }
        c0lab.LIZ(iIntValue, "pic_cnt");
        return c0lab;
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        EditDescMobModel editDescMobModel = videoPublishEditModel.creativeModel.commonMobModel.editDescMobModel;
        if (!editDescMobModel.isMobExceedDescLimitToastPopUp) {
            editDescMobModel.isMobExceedDescLimitToastPopUp = true;
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2341909Fp.LIZ("exceed_desc_limit_toast_pop_up", LIZ(videoPublishEditModel).LIZ);
        }
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z, String str2, Function1<? super C0LAB, ? extends C0LAB> function1) {
        Integer second;
        List<SingleImageData> imageList;
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        if (z) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                second = Integer.valueOf(imageList.size());
            } else {
                second = null;
            }
        } else {
            second = C580270MpN.LJIIJJI(videoPublishEditModel).getSecond();
        }
        c0lab.LIZLLL(second, "pic_cnt");
        C2341909Fp.LIZ(str, function1.invoke(c0lab).LIZ);
    }
}
