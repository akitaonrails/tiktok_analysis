package X;

import Y.ARunnableS23S1200000_19;
import Y.ARunnableS9S2100000_19;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.creative.model.photomode.inspiration.InspirationInfo;
import com.ss.android.ugc.aweme.model.BannerDisplayInfo;
import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;

/* JADX INFO: renamed from: X.0iuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1260470iuD extends RecyclerView.ViewHolder {
    public final InterfaceC1259540isi LL;
    public final C1259360isQ LLILLJJLI;
    public final View LLILLL;
    public BannerDisplayInfo LLILZ;
    public String LLILZIL;
    public Integer LLILZLL;

    public final void I5() {
        if (!C295490Bi7.LIZ()) {
            BannerDisplayInfo bannerDisplayInfo = this.LLILZ;
            if (bannerDisplayInfo != null) {
                this.LL.Ct(PhotoTopicBannerReadStatus.ENTER);
                SmartRouter.buildRoute(this.itemView.getContext(), bannerDisplayInfo.url).open();
                BannerDisplayInfo bannerDisplayInfo2 = this.LLILZ;
                if (bannerDisplayInfo2 != null) {
                    C823050WQl.LIZJ().execute(new ARunnableS9S2100000_19(bannerDisplayInfo2, "click_personal_homepage_banner", "click_join", 0));
                    return;
                }
                return;
            }
            return;
        }
        BannerDisplayInfo bannerDisplayInfo3 = this.LLILZ;
        if (bannerDisplayInfo3 != null) {
            this.LL.Ct(PhotoTopicBannerReadStatus.ENTER);
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "aweme://createPhoto");
            smartRouteBuildRoute.withParam("shoot_way", "educate_phase_iii");
            smartRouteBuildRoute.withParam("enter_from", "personal_homepage");
            smartRouteBuildRoute.withParam("shoot_enter_from", "personal_homepage");
            smartRouteBuildRoute.withParam("creation_path", "photo");
            smartRouteBuildRoute.withParam("add_yours_topic_text", bannerDisplayInfo3.title);
            smartRouteBuildRoute.withParam("add_yours_topic_id", bannerDisplayInfo3.trendId);
            smartRouteBuildRoute.withParam("category_name", String.valueOf(bannerDisplayInfo3.category));
            InspirationInfo inspirationInfo = bannerDisplayInfo3.inspiration;
            if (!(inspirationInfo instanceof Parcelable)) {
                inspirationInfo = null;
            }
            smartRouteBuildRoute.withParam("add_yours_inspiration_info", (Parcelable) inspirationInfo);
            smartRouteBuildRoute.withParam("topic_type", bannerDisplayInfo3.getTopicTypeActual());
            smartRouteBuildRoute.withParam("shoot_enter_method", "click_top_banner");
            smartRouteBuildRoute.withParam("session_id", this.LLILZIL);
            smartRouteBuildRoute.withParam("debuginfo", bannerDisplayInfo3.debugInfo);
            smartRouteBuildRoute.withParam("search_topic_id", bannerDisplayInfo3.searchTopicId);
            smartRouteBuildRoute.open();
            C1260250itr.LIZ().LIZ(Integer.valueOf(bannerDisplayInfo3.hashCode()));
            C1260250itr.LIZ().LIZ.storeInt(C1260490iuF.LJ("photo_mode_banner_auto_show_times"), 0);
            C1260250itr.LIZ().LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_auto_show_timeout"), -1L);
            C1260250itr.LIZ().LJFF(0);
            C1260250itr.LIZ().LIZ.storeLong(C1260490iuF.LJ("photo_mode_banner_show_timestamp"), -1L);
            BannerDisplayInfo bannerDisplayInfo4 = this.LLILZ;
            if (bannerDisplayInfo4 != null) {
                C823050WQl.LIZJ().execute(new ARunnableS23S1200000_19(bannerDisplayInfo4, this, "educate_creators_iii_banner_click", 1));
            }
        }
    }

    public C1260470iuD(InterfaceC1259540isi interfaceC1259540isi, C1259360isQ c1259360isQ, View view) {
        super(view);
        this.LL = interfaceC1259540isi;
        this.LLILLJJLI = c1259360isQ;
        this.LLILLL = view;
    }
}
