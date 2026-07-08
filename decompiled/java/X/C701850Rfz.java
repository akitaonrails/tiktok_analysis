package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Rfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701850Rfz {
    public static final C701850Rfz LIZ = new C701850Rfz();
    public static C15O7<Unit> LIZIZ;

    public static C702390Rgr LIZ(Aweme aweme) {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = -1L;
        C701830Rfx c701830Rfx = new C701830Rfx();
        c701830Rfx.LIZ(new C597080NbO(c238400w2, c238400w22));
        FeedComponentPriorityData feedComponentPriorityDataLIZ = C700590Rdx.LIZ("For You", AwemeExtKt.getGenreType(aweme));
        C701880Rg2 c701880Rg2 = c701830Rfx.LL;
        if (c701880Rg2 != null) {
            c701880Rg2.LIZ(new C702530Rh5(feedComponentPriorityDataLIZ), "cold_start_action");
        }
        C701880Rg2 c701880Rg22 = c701830Rfx.LL;
        if (c701880Rg22 != null) {
            c701880Rg22.LIZ(new C700680Re6(aweme, "For You"), "runtime_action");
        }
        AwemeBizExtKt.setFcpStoreSource(aweme, c701830Rfx);
        return new C702390Rgr(aweme.getAid(), c238400w2.element, c238400w22.element, 8);
    }

    public static final void LIZIZ(FeedItemList feedItemList, boolean z, boolean z2) {
        C08TN.LIZ().LJ("FcpFeedItemListHandler:handleData", true);
        LIZ.getClass();
        if (C0SVA.LIZ() && feedItemList != null) {
            try {
                int size = feedItemList.size();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map mapLIZJ = LIZJ(feedItemList, z, z2);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                if (size > 0) {
                    long j = jCurrentTimeMillis2 - jCurrentTimeMillis;
                    Iterator it2 = mapLIZJ.entrySet().iterator();
                    long j2 = 0;
                    long j3 = 0;
                    while (it2.hasNext()) {
                        C702390Rgr c702390Rgr = (C702390Rgr) ((Map.Entry) it2.next()).getValue();
                        long j4 = c702390Rgr.LIZIZ;
                        if (j4 != -1) {
                            j3 += j4;
                        }
                        long j5 = c702390Rgr.LIZJ;
                        if (j5 != -1) {
                            j2 += j5;
                        }
                    }
                    AnonymousClass0521.LIZ.getClass();
                    AnonymousClass0521.LIZ(size, z, j, j2, j3);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "FcpFeedItemListHandler:handleData");
            }
        }
        C08TN.LIZ().LJI("FcpFeedItemListHandler:handleData");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[Catch: Exception -> 0x00f0, TryCatch #0 {Exception -> 0x00f0, blocks: (B:29:0x0092, B:31:0x0098, B:32:0x00bc, B:33:0x00c7, B:35:0x00cd, B:37:0x00d9, B:38:0x00e6), top: B:49:0x0092 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZJ(com.ss.android.ugc.aweme.feed.model.FeedItemList r8, boolean r9, final boolean r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C701850Rfz.LIZJ(com.ss.android.ugc.aweme.feed.model.FeedItemList, boolean, boolean):java.util.Map");
    }
}
