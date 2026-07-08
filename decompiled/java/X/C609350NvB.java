package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0NvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609350NvB implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Aweme aweme;
        VideoItemParams videoItemParams2 = videoItemParams;
        C609370NvD.LIZ.getClass();
        C609370NvD.LIZIZ().storeInt(C609370NvD.LIZ("button_show_count"), 0);
        String string = C609370NvD.LIZIZ().getString(C609370NvD.LIZ("button_collection_id"), null);
        String string2 = C609370NvD.LIZIZ().getString(C609370NvD.LIZ("button_collection_name"), null);
        if (string != null && string2 != null) {
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.getAweme();
            } else {
                aweme = null;
            }
            C1440005kM.LIZ(new C609900Nw4(string, string2, C609370NvD.LIZIZ().getString(C609370NvD.LIZ("button_collection_type"), null), aweme));
        }
        return new C1387205bq(null);
    }
}
