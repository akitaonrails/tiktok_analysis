package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.ogc.news.anchor.producer.repo.NewsAnchorContent;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19513011Vw {
    public static final C19513011Vw LIZ = new C19513011Vw();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(439));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(438));
    public static NewsAnchorContent LIZLLL;

    public static String LIZ() {
        Object c098200Yq;
        StringBuilder sb = new StringBuilder("KEY_NEWS_ANCHOR_CONFIG_CONTENT_");
        try {
            C0XQ7.LJ();
            AccountUserService accountUserServiceLJIIJ = C0XQ7.LIZ.LJIIJ();
            c098200Yq = accountUserServiceLJIIJ != null ? accountUserServiceLJIIJ.getCurUserId() : null;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        sb.append((String) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq));
        return sb.toString();
    }
}
