package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Cxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330590Cxd {
    public static boolean LIZ(InterfaceC330680Cxm interfaceC330680Cxm, Aweme aweme) {
        C330530CxX cache = interfaceC330680Cxm.getCache();
        if (cache != null) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            return cache.LIZIZ().containsKey(aid);
        }
        return false;
    }
}
