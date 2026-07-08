package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Nfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599840Nfq implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;

    public C599840Nfq(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        final Aweme aweme;
        final Map<String, String> map2;
        String aid;
        C704840Rko c704840Rko;
        Map<String, Object> map3;
        VideoItemParams videoItemParams2 = videoItemParams;
        final Map<String, ? extends Object> map4 = map;
        C704830Rkn c704830Rkn = this.LL;
        if (c704830Rkn != null && (map3 = c704830Rkn.LJFF) != null) {
            map3.put("bottom_button_survey_show_time", C2286608xc.LJFF(System.currentTimeMillis()));
        }
        if (videoItemParams2 != null) {
            aweme = videoItemParams2.getAweme();
        } else {
            aweme = null;
        }
        C704830Rkn c704830Rkn2 = this.LL;
        if (c704830Rkn2 != null && (c704840Rko = c704830Rkn2.LJ) != null) {
            map2 = c704840Rko.LJIIIZ;
        } else {
            map2 = null;
        }
        C0NB9.LIZ(new C0NBA() { // from class: X.0NBC
            @Override // X.C0NBA
            public final void LIZ(C0NBB c0nbb) throws JSONException {
                String aid2;
                User author;
                Map<String, ? extends Object> map5 = map4;
                if (map5 != null) {
                    c0nbb.LIZIZ(map5);
                }
                Map<String, String> map6 = map2;
                if (map6 != null) {
                    c0nbb.LIZIZ(map6);
                }
                Aweme aweme2 = aweme;
                String uid = null;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                } else {
                    aid2 = null;
                }
                c0nbb.LIZ("group_id", aid2);
                Aweme aweme3 = aweme;
                if (aweme3 != null && (author = aweme3.getAuthor()) != null) {
                    uid = author.getUid();
                }
                c0nbb.LIZ("author_id", uid);
            }
        }, "survey_notify");
        if (aweme != null && (aid = aweme.getAid()) != null) {
            C599890Nfv.LIZ();
            HashMap<String, Integer> map5 = C599890Nfv.LIZJ;
            if (!map5.containsKey(aid)) {
                map5.put(aid, 0);
                C599890Nfv.LIZIZ().LIZJ("survey_key_vv_gap_count", 0);
                C599890Nfv.LIZIZ().LIZJ("survey_key_daily_show_count", C599890Nfv.LIZIZ().getInt("survey_key_daily_show_count", 0) + 1);
                C599890Nfv.LIZIZ().LJIIIIZZ("survey_key_last_show_time", System.currentTimeMillis());
            }
        }
        return new C1387205bq(null);
    }
}
