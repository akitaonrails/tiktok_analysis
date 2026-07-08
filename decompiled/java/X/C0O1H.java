package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O1H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1H extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoFavoriteAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O1H(VideoFavoriteAssem videoFavoriteAssem) {
        super(0);
        this.LL = videoFavoriteAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Aweme aweme;
        VideoFavoriteAssem videoFavoriteAssem = this.LL;
        VideoFavoriteVM videoFavoriteVMBp = videoFavoriteAssem.Bp();
        VideoItemParams item = videoFavoriteVMBp.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            String str = videoFavoriteVMBp.eventType;
            if (str == null) {
                str = "";
            }
            c2344009Gk.LJIIIIZZ("enter_from", str);
            String groupId = aweme.getGroupId();
            c2344009Gk.LJIIIIZZ("group_id", groupId != null ? groupId : "");
            C20684815ws.LJIILLIIL("long_press_favorite", c2344009Gk.LIZ);
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && ((Number) C296230BjJ.LIZ.getValue()).intValue() != 0) {
            int[] iArr = new int[4];
            Rect rect = new Rect();
            View viewFindViewById = videoFavoriteAssem.getContentView().findViewById(R.id.hpv);
            if (viewFindViewById != null) {
                viewFindViewById.getGlobalVisibleRect(rect);
            }
            iArr[0] = rect.left;
            iArr[1] = rect.top;
            iArr[2] = rect.right;
            iArr[3] = rect.bottom;
            C724270Sb3 c724270Sb3 = videoFavoriteAssem.LLJI;
            DataCenter dataCenter = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).dataCenter;
            if (dataCenter != null) {
                dataCenter.zQ2(iArr, "video_favorite_button_long_click");
            }
        }
        return Unit.LIZ;
    }
}
