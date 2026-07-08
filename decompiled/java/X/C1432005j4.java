package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1432005j4 implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public static final Set<String> LLILLJJLI = new LinkedHashSet();
    public final C01GW LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(920));

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        Object obj;
        String string;
        Aweme aweme;
        String aid;
        VideoItemParams videoItemParams2 = videoItemParams;
        Map<String, ? extends Object> map2 = map;
        if (map2 != null && (obj = map2.get("bulletin_board_id")) != null && (string = obj.toString()) != null) {
            if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null && (aid = aweme.getAid()) != null) {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                C013C c013c = new C013C();
                c013c.element = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aid);
                sbLIZ.append('_');
                sbLIZ.append(string);
                sbLIZ.append('_');
                sbLIZ.append(curUserId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Set<String> set = LLILLJJLI;
                if (!set.contains(strLIZIZ)) {
                    Boolean.valueOf(set.add(strLIZIZ));
                } else {
                    c013c.element = false;
                }
                C23250099c.LIZLLL((InterfaceC497601wk) this.LL.getValue(), null, null, new C0OND(string, null, c013c), 3);
                return new C1387205bq(null);
            }
            return new C1387205bq(null);
        }
        return new C1387205bq(null);
    }
}
