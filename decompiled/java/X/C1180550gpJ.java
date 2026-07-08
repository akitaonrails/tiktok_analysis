package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180550gpJ {
    public final SmartImageView LIZ;
    public final TuxTextView LIZIZ;
    public final View LIZJ;
    public final Context LIZLLL;
    public boolean LJ;
    public String LJFF;

    public C1180550gpJ(View view) {
        this.LIZ = (SmartImageView) view.findViewById(R.id.ld7);
        this.LIZIZ = (TuxTextView) view.findViewById(R.id.tv_topic_tag);
        this.LIZJ = view.findViewById(R.id.ffk);
        this.LIZLLL = view.getContext();
    }

    public final void LIZ(PoiListApi.PoiMergedListItem poiMergedListItem) {
        String aid;
        Aweme aweme = poiMergedListItem.getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, this.LJFF)) {
            this.LJ = false;
            this.LJFF = aid;
        }
        if (!this.LJ) {
            ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(poiMergedListItem.getCropAwemeCover());
            Context context = this.LIZLLL;
            if (context != null) {
                C1180560gpK c1180560gpK = new C1180560gpK(context, EnumC1177490gkN.FALLBACK_32_PX, new C1180580gpM(Float.valueOf(C418440Gaw.LIZIZ(12))), null);
                c1180560gpK.LJ = imageUrlModelLIZ;
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
                Drawable drawableLIZ = c384050F3z.LIZ(context);
                EnumC1177510gkP enumC1177510gkP = EnumC1177510gkP.LIGHT;
                C1189390h3Z c1189390h3Z = new C1189390h3Z(new LayerDrawable(new Drawable[]{drawableLIZ, C1180570gpL.LIZIZ(c1180560gpK, enumC1177510gkP)}));
                C1189390h3Z c1189390h3Z2 = new C1189390h3Z(new LayerDrawable(new Drawable[]{drawableLIZ, C1180570gpL.LIZ(c1180560gpK, enumC1177510gkP)}));
                SmartImageView smartImageView = this.LIZ;
                if (smartImageView != null) {
                    smartImageView.setBackground(drawableLIZ);
                }
                C1189360h3W c1189360h3WLIZ = new C1180600gpO("poi_detail", "poi_detail_top_video_cover", null).LIZ(imageUrlModelLIZ);
                c1189360h3WLIZ.LIZ.LJJIJL(context);
                c1189360h3WLIZ.LIZ.LJJIIZI(c1189390h3Z);
                c1189360h3WLIZ.LIZ.LJIL(c1189390h3Z2);
                c1189360h3WLIZ.LIZLLL(this.LIZ);
                c1189360h3WLIZ.LIZJ(new C1208600hYY(this, 1));
            }
        }
        String awemeTopicTag = poiMergedListItem.getAwemeTopicTag();
        if (awemeTopicTag != null && !a0.LJJJIL(awemeTopicTag)) {
            TuxTextView tuxTextView = this.LIZIZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            View view = this.LIZJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TuxTextView tuxTextView2 = this.LIZIZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(awemeTopicTag);
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LIZIZ;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        View view2 = this.LIZJ;
        if (view2 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view2);
    }
}
