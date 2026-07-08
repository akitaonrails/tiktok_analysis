package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0Rdk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700460Rdk {
    public static final String LIZIZ(String str) {
        C700410Rdf.LIZ.getClass();
        String str2 = C700410Rdf.LIZJ.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    public static final void LIZ(C2344009Gk c2344009Gk, Aweme aweme) {
        String aid;
        String requestId = null;
        if (aweme != null) {
            aid = aweme.getAid();
            requestId = aweme.getRequestId();
        } else {
            aid = null;
        }
        C20649115r7.LIZ(c2344009Gk, aid, requestId);
    }
}
