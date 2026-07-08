package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Nti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class CallableC608440Nti<V> implements Callable {
    public final /* synthetic */ List<Aweme> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public CallableC608440Nti(List<? extends Aweme> list, String str) {
        this.LL = list;
        this.LLILLJJLI = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("FeedFiledMobForServerUtil@c896.mobFieldReceived$1");
        Iterator<Aweme> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            Aweme next = it2.next();
            C608450Ntj.LIZ.getClass();
            int i = !C608450Ntj.LIZ(next) ? 1 : 0;
            int i2 = ((next == null || next.getAuthor() == null || next.getAuthor().getNickname() == null) && C608450Ntj.LIZ(next)) ? 1 : 0;
            int i3 = !C608450Ntj.LIZJ(next) ? 1 : 0;
            int i4 = ((next == null || next.getMusic() == null || C2105908Mv.LIZ(next.getMusic().getMusicName())) && C608450Ntj.LIZJ(next)) ? 1 : 0;
            int i5 = ((next == null || next.getAuthor() == null || next.getAuthor().getUniqueId() == null) && C608450Ntj.LIZ(next)) ? 1 : 0;
            int i6 = (C608450Ntj.LIZIZ(next) || !C608450Ntj.LIZ(next)) ? 0 : 1;
            int i7 = ((next == null || next.getDesc() == null || C2105908Mv.LIZ(next.getDesc())) ? 0 : 1) ^ 1;
            int i8 = (C608450Ntj.LIZLLL(next) || !C608450Ntj.LIZJ(next)) ? 0 : 1;
            C0NET c0net = C0NET.LIZ;
            String aid = next != null ? next.getAid() : null;
            c0net.getClass();
            boolean zLJIIIIZZ = C0NET.LJIIIIZZ(aid);
            int i9 = (i == 1 || i2 == 1 || i3 == 1 || i4 == 1 || i6 == 1 || i7 == 1 || i8 == 1) ? 1 : 0;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
            c2344009Gk.LIZJ(zLJIIIIZZ ? 1 : 0, "cache");
            c2344009Gk.LIZJ(i9, "is_success");
            c2344009Gk.LIZJ(next.isAd() ? 1 : 0, "is_ad");
            c2344009Gk.LJIIIIZZ("aid", next.getAid());
            LogPbBean logPbBean = next.getLogPbBean();
            c2344009Gk.LJIIIIZZ("log_id", logPbBean != null ? logPbBean.getImprId() : null);
            c2344009Gk.LIZJ(next.getAwemeType(), "aweme_type");
            if (i == 1) {
                c2344009Gk.LIZJ(i, "author_miss");
            }
            if (i2 == 1) {
                c2344009Gk.LIZJ(i2, "nickname_miss");
            }
            if (i5 == 1) {
                c2344009Gk.LIZJ(i5, "uniqueid_miss");
            }
            if (i6 == 1) {
                c2344009Gk.LIZJ(i6, "avatar_miss");
            }
            if (i3 == 1) {
                c2344009Gk.LIZJ(i3, "music_miss");
            }
            if (i4 == 1) {
                c2344009Gk.LIZJ(i4, "music_title_miss");
            }
            if (i7 == 1) {
                c2344009Gk.LIZJ(i7, "desc_miss");
            }
            if (i8 == 1) {
                c2344009Gk.LIZJ(i8, "music_turntable_miss");
            }
            if (next.getVideo() == null || next.getVideo().getPlayAddr() == null) {
                c2344009Gk.LIZJ(1, "video_miss");
            }
            Map<String, String> map = c2344009Gk.LIZ;
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("field_receive=");
            sbLIZ.append(map);
            c2276471E8n.LIZIZ("common_feed", "FeedFiledMobForServerUtil", C2188811AlT.LIZIZ(sbLIZ));
            C20684815ws.LJIILLIIL("field_receive", map);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedFiledMobForServerUtil@c896.mobFieldReceived$1");
        return unit;
    }
}
