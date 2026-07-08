package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.commentlist.util.CommentPageLoadTimer;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.d1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0l5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344450l5f implements InterfaceC1344310l5R {
    public final /* synthetic */ Aweme LIZ;
    public final /* synthetic */ C1349800lEI LIZIZ;

    public C1344450l5f(C1349800lEI c1349800lEI, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = c1349800lEI;
    }

    @Override // X.InterfaceC1344310l5R
    public final void LIZ(int i, long j, boolean z) {
        String str;
        String enterFrom;
        C0W93 c0w93;
        String enterFrom2;
        boolean z2;
        long jLIZJ;
        long jLIZ;
        long jLIZIZ;
        int i2;
        String str2;
        Integer numValueOf;
        Aweme aweme = this.LIZ;
        if (aweme != null) {
            if (z) {
                if (i == 0) {
                    str = "empty";
                } else {
                    str = "success";
                }
            } else {
                str = "fail";
            }
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(this.LIZ);
            C1349800lEI c1349800lEI = this.LIZIZ;
            if (c1349800lEI != null) {
                enterFrom = c1349800lEI.getEnterFrom();
            } else {
                enterFrom = null;
            }
            C1350920lG6.LIZ.getClass();
            if (!C1350920lG6.LJJIJIL(1, "comment_latency")) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
                c2344009Gk.LIZLLL(j, "duration");
                c2344009Gk.LJIIIIZZ("result", str);
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                c2344009Gk.LJIIIIZZ("group_id", aid);
                C1350920lG6.LJJJ(c2344009Gk, "comment_latency");
            }
            if (z) {
                c0w93 = C0W93.SUCCESS;
            } else {
                c0w93 = C0W93.FAIL;
            }
            int i3 = !z ? 1 : 0;
            C1349800lEI c1349800lEI2 = this.LIZIZ;
            if (c1349800lEI2 == null || (enterFrom2 = c1349800lEI2.getEnterFrom()) == null) {
                enterFrom2 = "";
            }
            C1344440l5e c1344440l5e = CommentPageLoadTimer.LIZJ;
            if (c1344440l5e != null && c1344440l5e.LJIIIIZZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (c1344440l5e != null) {
                    c1344440l5e.LJIIIIZZ = false;
                }
                if (C20684815ws.LJI("page_load_time")) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("page_type", "comment");
                    c2344009Gk2.LIZJ(i3, "result");
                    c2344009Gk2.LJIIIIZZ("enter_from", enterFrom2);
                    CommentPageLoadTimer.LIZ.getClass();
                    C1344440l5e c1344440l5e2 = CommentPageLoadTimer.LIZJ;
                    long jLIZLLL = -1;
                    if (c1344440l5e2 != null) {
                        jLIZJ = c1344440l5e2.LIZJ();
                    } else {
                        jLIZJ = -1;
                    }
                    c2344009Gk2.LIZLLL(jLIZJ, "duration");
                    C1344440l5e c1344440l5e3 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e3 != null) {
                        jLIZ = c1344440l5e3.LIZ();
                    } else {
                        jLIZ = -1;
                    }
                    c2344009Gk2.LIZLLL(jLIZ, "duration_before_network");
                    C1344440l5e c1344440l5e4 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e4 != null) {
                        jLIZIZ = c1344440l5e4.LIZIZ();
                    } else {
                        jLIZIZ = -1;
                    }
                    c2344009Gk2.LIZLLL(jLIZIZ, "duration_network");
                    d1 d1Var = CommentPageLoadTimer.LIZLLL;
                    if (d1Var != null) {
                        for (Map.Entry entry : ((LinkedHashMap) d1Var.LIZJ()).entrySet()) {
                            c2344009Gk2.LIZLLL(((Number) entry.getValue()).longValue(), (String) entry.getKey());
                        }
                    }
                    d1 d1Var2 = CommentPageLoadTimer.LIZLLL;
                    if (d1Var2 != null) {
                        i2 = d1Var2.LIZLLL;
                    } else {
                        i2 = -1;
                    }
                    c2344009Gk2.LIZJ(i2, "hit_cache_type");
                    CommentPageLoadTimer.LIZ.getClass();
                    C1344440l5e c1344440l5e5 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e5 != null) {
                        jLIZLLL = c1344440l5e5.LIZLLL();
                    }
                    c2344009Gk2.LIZLLL(jLIZLLL, "duration_after_network");
                    CommentPerfMonitorUtil.LIZ.getClass();
                    c2344009Gk2.LJ(Boolean.valueOf(CommentPerfMonitorUtil.LJI()), "is_poor_network");
                    C1344440l5e c1344440l5e6 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e6 != null && c1344440l5e6.LIZ) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c2344009Gk2.LJIIIIZZ("is_first", str2);
                    C1344440l5e c1344440l5e7 = CommentPageLoadTimer.LIZJ;
                    if (c1344440l5e7 != null) {
                        numValueOf = Integer.valueOf(c1344440l5e7.LIZJ);
                    } else {
                        numValueOf = null;
                    }
                    c2344009Gk2.LJ(numValueOf, "list_count");
                    C20684815ws.LJIILLIIL("page_load_time", c2344009Gk2.LIZ);
                }
            }
            C818480W8w.LIZJ("comment", c0w93, null, C2097608Jq.LJ());
            if ((C294200Bg2.LIZIZ() & 4) == 4) {
                C1344540l5o.LIZ.getClass();
                Activity activityLJFF = C2214201BlK.LJFF();
                if ((activityLJFF instanceof C19EG) && activityLJFF != null && !C1344540l5o.LJIIIIZZ.contains(Integer.valueOf(activityLJFF.hashCode()))) {
                    C01GW<Map<String, Integer>> c01gw = C1357700lR2.LJFF;
                    for (Pair pair : C1356320lOo.LIZIZ(C1354730lMF.LIZIZ(activityLJFF), C1344540l5o.LJFF)) {
                        C21146717pB.LJFF((Context) pair.getFirst(), "comment_refactor_group_1234567", (List) pair.getSecond());
                    }
                    C1344540l5o.LJIIIIZZ.add(Integer.valueOf(activityLJFF.hashCode()));
                }
            }
        }
    }
}
