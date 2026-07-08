package X;

import com.ss.android.ugc.aweme.favorites.guide.button.sensor.FavoriteGuideButtonSensor;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Nvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609830Nvx implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;

    public C609830Nvx(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Object obj;
        VideoFavoriteVM videoFavoriteVM;
        Map<String, Object> map2;
        C609840Nvy c609840Nvy = FavoriteGuideButtonSensor.LLJI;
        C704830Rkn c704830Rkn = this.LL;
        c609840Nvy.getClass();
        if (c704830Rkn != null && (map2 = c704830Rkn.LJFF) != null) {
            obj = map2.get("vm_video_favorite");
        } else {
            obj = null;
        }
        if (obj instanceof VideoFavoriteVM) {
            videoFavoriteVM = (VideoFavoriteVM) obj;
        } else {
            videoFavoriteVM = null;
        }
        C0CNO.LIZLLL(0L, new AwS553S0100000_9(videoFavoriteVM, 1760));
        return new C1387205bq(null);
    }
}
