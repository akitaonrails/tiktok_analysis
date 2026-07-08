package Y;

import X.C0IJT;
import X.C11NZ;
import X.C467130ITn;
import X.C474500IjA;
import X.C497120JeY;
import X.InterfaceC1487280oo2;
import X.InterfaceC781210Ukh;
import com.bytedance.android.live.network.combine.exp.LiveCombineRequestExp;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class AkS104S1100000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS104S1100000_7 akS104S1100000_7, Object obj) {
        Integer numValueOf;
        Object obj2;
        Object obj3;
        String string;
        Object obj4;
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        String str = akS104S1100000_7.s0;
        Map map = (Map) akS104S1100000_7.l1;
        Integer numValueOf2 = Integer.valueOf(baseListResponse.statusCode);
        List<T> list = baseListResponse.data;
        Object obj5 = null;
        if (list != 0) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        String str2 = baseListResponse.LIZLLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_live_bottom_banner_request_rooms");
        c474500IjALIZ.LJJII(str, "enter_from");
        if (map != null) {
            obj2 = map.get("draw_video_id");
        } else {
            obj2 = null;
        }
        c474500IjALIZ.LJJII(obj2, "group_id");
        if (map != null) {
            obj3 = map.get("draw_author_id");
        } else {
            obj3 = null;
        }
        c474500IjALIZ.LJJII(obj3, "author_id");
        if (numValueOf2 != null) {
            string = numValueOf2.toString();
        } else {
            string = null;
        }
        c474500IjALIZ.LJJII(string, "error_code");
        if (map != null) {
            obj4 = map.get("related_live_tag");
        } else {
            obj4 = null;
        }
        c474500IjALIZ.LJJII(obj4, "game_related_tag");
        if (map != null) {
            obj5 = map.get("tag_name");
        }
        c474500IjALIZ.LJJII(obj5, "game_name");
        c474500IjALIZ.LJJII(numValueOf, "room_cnt");
        c474500IjALIZ.LJJII(str2, "log_id");
        c474500IjALIZ.LIZ();
        ArrayList arrayList = new ArrayList();
        Collection collection = baseListResponse.data;
        if (collection != null) {
            arrayList.addAll(collection);
        }
        R r = baseListResponse.extra;
        C467130ITn.LIZJ(arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C467130ITn.LIZIZ((FeedItem) it2.next());
        }
        return new Pair(arrayList, r);
    }

    public static final Object apply$1(AkS104S1100000_7 akS104S1100000_7, Object obj) {
        C11NZ c11nzLJJJJZ;
        long dispatchDelayTimeMs = LiveCombineRequestExp.INSTANCE.getDispatchDelayTimeMs(akS104S1100000_7.s0);
        if (dispatchDelayTimeMs > 0) {
            c11nzLJJJJZ = C11NZ.LJJJJZ(obj).LJJI(dispatchDelayTimeMs, TimeUnit.MILLISECONDS);
        } else {
            c11nzLJJJJZ = C11NZ.LJJJJZ(obj);
        }
        final C497120JeY c497120JeY = (C497120JeY) akS104S1100000_7.l1;
        final String str = akS104S1100000_7.s0;
        return c11nzLJJJJZ.LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.0JeV
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C497060JeS.LJ(str, c497120JeY.LJIIJJI, true);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS104S1100000_7(String str, String str2, Map<String, String> map) {
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }
}
