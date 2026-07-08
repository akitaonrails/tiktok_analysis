package X;

import Y.ARunnableS119S0100000_19;
import android.os.Looper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iEJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234490iEJ {
    public static C1234490iEJ LIZLLL;
    public static int LJ = -1;
    public final BaseListFragmentPanel LIZ;
    public final Aweme LIZIZ;
    public final Function0<Unit> LIZJ;

    public final void LIZ() {
        Aweme aweme;
        Function0<Unit> function0;
        LJ = -1;
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C2487409ou.LIZJ(new ARunnableS119S0100000_19(this, 64));
            return;
        }
        C19EG activity = this.LIZ.getFragment().getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (this.LIZ.LLJL.Fg().isEmpty()) {
            LIZLLL = this;
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "feed items not ready, cache aweme!");
            return;
        }
        if (!SharedVideoDeepLinkHelper.LLJILJIL) {
            LIZLLL = this;
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "first frame not ready, cache aweme!");
            return;
        }
        Aweme aweme2 = this.LIZIZ;
        C0SZ8 c0sz8LJLIL = this.LIZ.LJLIL();
        Aweme aweme3 = c0sz8LJLIL != null ? c0sz8LJLIL.getAweme() : null;
        User sharer = AwemeBizExtKt.getSharer(aweme2);
        if (aweme3 != null && Intrinsics.LJFF(aweme2.getAid(), aweme3.getAid())) {
            if (sharer != null) {
                if (!((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJLI() && (function0 = this.LIZJ) != null) {
                    function0.invoke();
                }
                BaseListFragmentPanel baseListFragmentPanel = this.LIZ;
                String aid = aweme2.getAid();
                new C0S2W(baseListFragmentPanel, aid != null ? aid : "", sharer).LIZ();
            }
            C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current play aweme（");
            sbLIZ.append(aweme3.getAid());
            sbLIZ.append(") is target, sharer: ");
            sbLIZ.append(sharer);
            sbLIZ.append(", might refresh the view!");
            c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        List listLLIIII = C13LP.LLIIII(this.LIZ.LLJL.Fg());
        int size = listLLIIII.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (ListProtector.get(listLLIIII, i2) != null && (aweme = (Aweme) ListProtector.get(listLLIIII, i2)) != null && aweme.getAid() != null) {
                Aweme aweme4 = (Aweme) ListProtector.get(listLLIIII, i2);
                if (Intrinsics.LJFF(aweme4 != null ? aweme4.getAid() : null, aweme2.getAid())) {
                    if (i2 != -1) {
                        this.LIZ.LLJL.LJJJJL(i2);
                    }
                }
            }
            i2++;
        }
        String requestId = aweme2.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        int iLJLLJ = this.LIZ.LJLLJ() + 1;
        Feed0VVManager.LJ(0, requestId, C1697810uHb.LJIILJJIL(aweme2), false);
        C2276471E8n c2276471E8n2 = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("curIndex: ");
        sbLIZ2.append(this.LIZ.LJLLJ());
        sbLIZ2.append(", insert aweme(");
        sbLIZ2.append(aweme2.getAid());
        sbLIZ2.append(") to ");
        sbLIZ2.append(iLJLLJ);
        c2276471E8n2.LIZIZ("recommend_feed", "@LinkRelation_Video", C2188811AlT.LIZIZ(sbLIZ2));
        C1234510iEL c1234510iEL = new Object() { // from class: X.0iEL
        };
        String aid2 = aweme2.getAid();
        if (aid2 == null) {
            aid2 = "";
        }
        c1234510iEL.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("aweme_id", aid2);
        C20684815ws.LJIILLIIL("dp_aweme_insert_start", c2344009Gk.LIZ);
        try {
            this.LIZ.LLILIL(new C739280SzG<>(iLJLLJ, "shared_video", Collections.singletonList(aweme2)));
            Iterator<Aweme> it2 = this.LIZ.LLJL.Fg().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().getAid(), aweme2.getAid())) {
                    i++;
                } else if (i != -1) {
                    this.LIZ.LLFFF(i, true);
                    if (C07HK.LIZ()) {
                        LJ = i;
                        return;
                    }
                    return;
                }
            }
            C1234510iEL c1234510iEL2 = new Object() { // from class: X.0iEL
            };
            String aid3 = aweme2.getAid();
            if (aid3 == null) {
                aid3 = "";
            }
            c1234510iEL2.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LIZJ(2, "result");
            c2344009Gk2.LJIIIIZZ("aweme_id", aid3);
            C20684815ws.LJIILLIIL("dp_aweme_insert_result", c2344009Gk2.LIZ);
            C2276471E8n.LIZIZ.LIZ("recommend_feed", "@LinkRelation_Video", "Error case found that no desired aweme found in panel.");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1234510iEL c1234510iEL3 = new Object() { // from class: X.0iEL
            };
            String aid4 = aweme2.getAid();
            String str = aid4 != null ? aid4 : "";
            c1234510iEL3.getClass();
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LIZJ(1, "result");
            c2344009Gk3.LJIIIIZZ("aweme_id", str);
            C20684815ws.LJIILLIIL("dp_aweme_insert_result", c2344009Gk3.LIZ);
            C2276471E8n.LIZIZ.LIZJ("recommend_feed", e, "@LinkRelation_Video", "insert aweme error");
        }
    }

    public C1234490iEJ(BaseListFragmentPanel baseListFragmentPanel, Aweme aweme, Function0<Unit> function0) {
        this.LIZ = baseListFragmentPanel;
        this.LIZIZ = aweme;
        this.LIZJ = function0;
    }
}
