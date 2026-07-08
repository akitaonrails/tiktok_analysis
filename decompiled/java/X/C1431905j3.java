package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1431905j3 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(919));

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Object obj;
        String string;
        Map<String, ? extends Object> map2 = map;
        if (map2 != null && (obj = map2.get("bulletin_board_id")) != null && (string = obj.toString()) != null) {
            C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C0ONC(string, null), 3);
            return new C1387205bq(null);
        }
        return new C1387205bq(null);
    }
}
