package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity;

/* JADX INFO: renamed from: X.0Kwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C533860Kwi {
    public static void LIZ(Activity activity, ShortVideoContext shortVideoContext, C0JEO c0jeo) {
        C0ML8 c0ml8 = C0ML8.LIZ;
        CreativeModel creativeModel = shortVideoContext.creativeModel;
        c0ml8.getClass();
        C0ML8.LIZIZ("view_all_page_click_plus", creativeModel);
        C0ML8.LIZ("on_this_day_view_all_page", shortVideoContext.creativeModel);
        if (c0jeo.LIZ <= 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(activity.getString(2131827421, String.valueOf(c0jeo.LIZIZ)));
            c1389890mGx.LJIIJJI();
            return;
        }
        String str = MvChoosePhotoActivity._pnsPageId;
        Bundle bundle = new Bundle();
        int i = c0jeo.LIZJ;
        int i2 = c0jeo.LIZ;
        bundle.putInt("key_photo_select_min_count", i);
        bundle.putInt("key_video_select_min_count", i);
        bundle.putInt("key_photo_select_max_count", i2);
        bundle.putInt("key_video_select_max_count", i2);
        shortVideoContext.enterFrom = "on_this_day_view_all_page";
        C786410Ut5.LJJIJL(bundle, "key_short_video_context", shortVideoContext);
        bundle.putInt("key_default_landing_tab", EnumC538250L9b.ALL.getType());
        bundle.putInt("key_choose_scene", 47);
        C0L0F.LIZJ(activity, bundle, 37, 12356);
    }
}
