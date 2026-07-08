package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15TX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TX implements InterfaceC736910SvR<InterfaceC1575410r6B> {
    public static final C15TX LLILZLL = new C15TX();
    public volatile boolean LL;
    public volatile boolean LLILLJJLI;
    public C15VE LLILZ;
    public final C054G LLILLL = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C20524915Tb LLILZIL = new C20524915Tb(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
        C20524815Ta c20524815Ta = C20524815Ta.LIZ;
        C2153908cD c2153908cD = C2153908cD.LIZ;
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(455);
        c2153908cD.getClass();
        C2153908cD.LIZIZ("explore_main_topic_chunk_process_request", aFwS221S0000000_31);
        C20524815Ta.LIZIZ.set(EnumC1568420quu.COMPLETE);
        C20524815Ta.LIZJ = null;
        C20524815Ta.LJI.LIZ();
        AnonymousClass0956 anonymousClass0956 = C20524815Ta.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C20524815Ta.LJ = null;
        C2296808zG.LIZJ(this.LLILLL, null);
        C15UV.LIZ.LJ();
        C15VE c15ve = this.LLILZ;
        if (c15ve != null) {
            c15ve.LIZLLL();
        }
        this.LLILZ = null;
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLILZIL;
    }

    public final void LIZIZ(int i) {
        if (!this.LL && !this.LLILLJJLI) {
            if (!C20524515Sx.LIZ().enablePreload && C15T8.LL.LJIIL(false)) {
                Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.HAS_DATA);
            } else {
                this.LL = true;
                C23250099c.LIZLLL(this.LLILLL, null, null, new C20526415Tq(this, i, null), 3);
            }
        }
    }

    public final void LIZJ(int i, ExploreAwemeList exploreAwemeList) {
        List<ExplorePostItem> list;
        String aid;
        Video video;
        C15TA.LIZ.getClass();
        C20684815ws.LJIILLIIL("explore_prefetch_success", new C2344009Gk().LIZ);
        C2153908cD c2153908cD = C2153908cD.LIZ;
        Explore0VVTrackerMonitor.INSTANCE.networkStatus(C15UN.REQUEST_SUCCESS);
        C15UU.LIZ.getClass();
        if (!C15UU.LIZLLL(i) || this.LLILLJJLI) {
            return;
        }
        C15UV.LIZ.LJ();
        if (!C20530215Vc.LIZIZ() && exploreAwemeList != null && (list = exploreAwemeList.items) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (ExplorePostItem explorePostItem : list) {
                Aweme aweme = explorePostItem.aweme;
                UrlModel cover = null;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                Aweme aweme2 = explorePostItem.aweme;
                if (aweme2 != null && (video = aweme2.getVideo()) != null) {
                    cover = video.getCover();
                }
                arrayList.add(new C20530015Va(aid, C438710HIf.LIZ(cover), explorePostItem.aweme, true, 8));
            }
            C15VE c15ve = new C15VE();
            c15ve.LIZLLL = this.LLILLL;
            c15ve.LJFF(arrayList);
            c15ve.LJ(0);
            this.LLILZ = c15ve;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c9, code lost:
    
        if (r7 != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.explore.data.ExploreAwemeList r6, final boolean r7, com.ss.android.ugc.aweme.feed.model.Aweme r8, boolean r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15TX.LIZ(com.ss.android.ugc.aweme.explore.data.ExploreAwemeList, boolean, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, int, boolean):void");
    }
}
