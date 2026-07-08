package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;

/* JADX INFO: renamed from: X.05jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1432705jB implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Fragment fragment;
        VideoItemParams videoItemParams2 = videoItemParams;
        Map<String, ? extends Object> map2 = map;
        IEcommerceLiveService iEcommerceLiveService = (IEcommerceLiveService) PluggableExtentionKt.pluggableSpi$default(IEcommerceLiveService.class, false, false, false, 14, null);
        if (iEcommerceLiveService != null) {
            if (videoItemParams2 != null) {
                fragment = videoItemParams2.fragment;
            } else {
                fragment = null;
            }
            iEcommerceLiveService.LJJIJIL(fragment, map2);
        }
        return new C1387205bq(null);
    }
}
