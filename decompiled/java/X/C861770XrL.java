package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0XrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861770XrL {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, Function2 function2) {
        String creationId;
        String str2;
        SaveLocalHelper.LIZ.getClass();
        C1441320nbu.LJI(videoPublishEditModel, i);
        if (z) {
            C0CHQ.LIZ().getPublishService().LJJJIL();
            C1433920nPy.LIZ(str);
        }
        C0LAB c0lab = new C0LAB();
        String str3 = null;
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        c0lab.LJ("enter_from", "video_post_page");
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c0lab.LJ("to_status", str2);
        if (videoPublishEditModel != null) {
            str3 = videoPublishEditModel.mShootWay;
        }
        c0lab.LJ("shoot_way", str3);
        c0lab.LIZ(-1, "save_with_captions");
        C20684815ws.LJIILLIIL("click_react_download_control", c0lab.LIZ);
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, Boolean.valueOf(z));
        }
    }
}
