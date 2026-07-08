package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0Nw3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609890Nw3 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(495));

    public C609890Nw3(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        Aweme aweme;
        String aid;
        C704830Rkn c704830Rkn = this.LL;
        if (c704830Rkn != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null && (aweme = videoItemParamsInvoke.getAweme()) != null && (aid = aweme.getAid()) != null && !((List) this.LLILLJJLI.getValue()).contains(aid)) {
            ((List) this.LLILLJJLI.getValue()).add(aid);
            long j = C308810C8p.LIZ().LIZ().getLong("week_end_timestamp", -1L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C308820C8q c308820C8qLIZ = C308810C8p.LIZ();
            c308820C8qLIZ.LIZ().storeInt("favorite_guide_shown_all_count", c308820C8qLIZ.LIZ().getInt("favorite_guide_shown_all_count", 0) + 1);
            if (j != -1 && jCurrentTimeMillis <= j) {
                C308820C8q c308820C8qLIZ2 = C308810C8p.LIZ();
                c308820C8qLIZ2.LIZ().storeInt("favorite_guide_shown_count_per_week", c308820C8qLIZ2.LIZ().getInt("favorite_guide_shown_count_per_week", 0) + 1);
            } else {
                C308810C8p.LIZ().LIZ().storeLong("week_end_timestamp", System.currentTimeMillis() + ((long) 604800000));
                C308810C8p.LIZ().LIZ().storeInt("favorite_guide_shown_count_per_week", 1);
            }
        }
        return new C1387205bq(null);
    }
}
