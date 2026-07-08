package X;

import Y.ARunnableS78S0200000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O1F, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1F extends C09AY implements Function2<VideoFavoriteAssem, C737030Svd, Unit> {
    public C0O1F() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoFavoriteAssem videoFavoriteAssem, C737030Svd c737030Svd) {
        String string;
        Object obj;
        Aweme aweme;
        VideoFavoriteAssem videoFavoriteAssem2 = videoFavoriteAssem;
        C737030Svd c737030Svd2 = c737030Svd;
        if (c737030Svd2 != null) {
            videoFavoriteAssem2.getClass();
            Object obj2 = null;
            if (c737030Svd2.LIZ == 105) {
                Bundle bundle = c737030Svd2.LIZJ;
                if (bundle != null) {
                    string = bundle.getString("group_id");
                } else {
                    string = null;
                }
                C724270Sb3 c724270Sb3 = videoFavoriteAssem2.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(string, C735370Ssx.LIZJ(((VideoItemParams) obj).getAweme()))) {
                    IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
                    if (iFavoriteService != null) {
                        iFavoriteService.LJIJI(videoFavoriteAssem2.getContentView().findViewById(R.id.hpp), C724240Sb0.LIZ(videoFavoriteAssem2));
                    }
                    VideoFavoriteVM videoFavoriteVMBp = videoFavoriteAssem2.Bp();
                    VideoItemParams item = videoFavoriteVMBp.getItem();
                    if (item != null && (aweme = item.getAweme()) != null) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        String str = videoFavoriteVMBp.eventType;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_from", str);
                        String groupId = aweme.getGroupId();
                        if (groupId != null) {
                            str2 = groupId;
                        }
                        c2344009Gk.LJIIIIZZ("group_id", str2);
                        C20684815ws.LJIILLIIL("long_press_favorite_toast_show", c2344009Gk.LIZ);
                    }
                }
            }
            if (c737030Svd2.LIZ == 107) {
                Object obj3 = ((HashMap) c737030Svd2.LJIJI).get("group_id");
                C724270Sb3 c724270Sb32 = videoFavoriteAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                if (Intrinsics.LJFF(obj3, C735370Ssx.LIZJ(((VideoItemParams) obj2).getAweme()))) {
                    C786410Ut5.LJJZZIII(videoFavoriteAssem2.Fp(), new ARunnableS78S0200000_9(videoFavoriteAssem2, c737030Svd2, 110));
                }
            }
        }
        return Unit.LIZ;
    }
}
