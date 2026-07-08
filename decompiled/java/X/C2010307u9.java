package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.07u9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2010307u9 {
    public static final C2010307u9 LIZ = new C2010307u9();
    public static final n LIZIZ = new n();

    public static List LIZ() {
        Object obj;
        LinkedList linkedList;
        h hVarLJJIIZI;
        try {
            n nVar = (C1253204vK.LIZ() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).contains("tiktok_font_interception")) ? (n) C08JS.LIZIZ().LJII(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("tiktok_font_interception", ""), n.class) : null;
            if (nVar == null) {
                nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_font_interception", n.class, LIZIZ);
            }
            if (nVar == null || (hVarLJJIIZI = nVar.LJJIIZI("regex")) == null) {
                linkedList = null;
            } else {
                linkedList = new LinkedList();
                Iterator<k> it2 = hVarLJJIIZI.iterator();
                while (it2.hasNext()) {
                    linkedList.add(PatternProtector.compile(it2.next().LJIL()));
                }
            }
            C189200o6.m2constructorimpl(linkedList);
            obj = linkedList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        return (List) (C189200o6.m7isFailureimpl(obj) ? null : obj);
    }
}
