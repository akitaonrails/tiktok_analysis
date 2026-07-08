package X;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SSI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SSI {
    public final PostModeDetailParams LIZ;
    public final Context LIZIZ;
    public TuxSheet LIZJ;

    public C0SSI(Context context, PostModeDetailParams postModeDetailParams) {
        this.LIZ = postModeDetailParams;
        this.LIZIZ = context;
    }

    public final void LIZ(C19EG c19eg, Fragment fragment, Aweme aweme, MotionEvent motionEvent, String str, int i, C0HTT<C737030Svd> c0htt) {
        String aid;
        String str2;
        int size;
        List<PhotoModeImageUrlModel> imageList;
        long jLongValue;
        C0HTT<C737030Svd> c0htt2 = c0htt;
        int iLJIIJ = C12ES.LJIIJ(this.LIZIZ);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LIZIZ);
        float f = 100;
        int x = (int) ((motionEvent.getX() * f) / iLJIIJ);
        int y = (int) ((motionEvent.getY() * f) / iLJIIIIZZ);
        Aweme aweme2 = aweme;
        if (fragment != null && c19eg != null && aweme2 != null) {
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("panel_source", "long_press", bundle);
            C1355680lNm.LIZIZ(bundle, "long_press");
            C786410Ut5.LJJJI("enter_method", "long_press", bundle);
            int i2 = 1;
            bundle.putBoolean("has_overlay", true);
            bundle.putInt("longPressDownX", x);
            bundle.putInt("longPressDownY", y);
            if (C1EE2.LIZIZ.LIZLLL()) {
                bundle.putInt("is_enter_graphic_detail", i);
            }
            C721190SQr.LIZ.getClass();
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (c1er1.LJJJLL("")) {
                C1370890lmJ.LIZ.appendValues(bundle, c1er1.I(aweme2, ""));
            }
            PostModeDetailParams postModeDetailParams = this.LIZ;
            if (postModeDetailParams != null) {
                C786410Ut5.LJJJI("tab_name", postModeDetailParams.tabName, bundle);
                C786410Ut5.LJJJI("event_type", postModeDetailParams.eventType, bundle);
                bundle.putInt("page_type", postModeDetailParams.pageType);
            }
            C786410Ut5.LJJJI("from_page", "graphic_detail", bundle);
            C786410Ut5.LJJJI("content_type", C735370Ssx.LJFF(aweme2), bundle);
            if (C123100dR.LIZ(str)) {
                C786410Ut5.LJJJI("explore_from_group_id", str, bundle);
            }
            if (Intrinsics.LJFF(this.LIZ.eventType, "homepage_explore")) {
                Long l = this.LIZ.exploreTabId;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                bundle.putLong("explore_topic_id", jLongValue);
                C786410Ut5.LJJJI("explore_topic", this.LIZ.exploreTabName, bundle);
                C786410Ut5.LJJJI("from_explore_page", this.LIZ.fromExplorePage, bundle);
            }
            PostModeDetailParams postModeDetailParams2 = this.LIZ;
            TuxSheet tuxSheetLJIIJJI = null;
            if (postModeDetailParams2 != null) {
                str2 = postModeDetailParams2.eventType;
            } else {
                str2 = null;
            }
            for (Map.Entry<String, String> entry : c1er1.I(aweme2, str2).entrySet()) {
                C786410Ut5.LJJJI(entry.getKey(), entry.getValue(), bundle);
            }
            bundle.putInt("aweme_type", aweme2.getAwemeType());
            PhotoModeImageInfo photoModeImageInfo = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                size = imageList.size();
            } else {
                size = 0;
            }
            bundle.putInt("pic_cnt", size);
            PhotoModeImageInfo photoModeImageInfo2 = aweme2.getPhotoModeImageInfo();
            if (photoModeImageInfo2 == null || !photoModeImageInfo2.hasTitle()) {
                i2 = 0;
            }
            bundle.putInt("has_title", i2);
            bundle.putBoolean("use_common_share", ((Boolean) C276910AtF.LIZ.getValue()).booleanValue());
            TuxSheet tuxSheet = this.LIZJ;
            if (tuxSheet != null) {
                tuxSheet.dismiss();
            }
            if (C0SSJ.LIZ(aweme2)) {
                if (c0htt2 == null) {
                    c0htt2 = new C0HTT() { // from class: X.0RUg
                        @Override // X.C0HTT
                        public final /* bridge */ /* synthetic */ void LLIIL(Object obj) {
                        }
                    };
                }
                aweme2 = aweme2;
                tuxSheetLJIIJJI = C621180OYa.LIZ.LJIIJJI(c19eg, fragment, aweme2, c0htt2, bundle);
            } else {
                C621180OYa.LIZ.LJJIIJ(c19eg, fragment, aweme2, false, c0htt2, bundle);
            }
            this.LIZJ = tuxSheetLJIIJJI;
        }
        C721190SQr.LJIILL(C721190SQr.LIZ, "click_trans_layer", aweme2, this.LIZ, null, null, null, null, 0, 3832);
        if (aweme2 != null && (aid = aweme2.getAid()) != null) {
            C1360460lVU.LIZIZ.LJJII().LJIILJJIL(aid);
        }
    }
}
