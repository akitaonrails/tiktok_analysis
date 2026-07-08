package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;

/* JADX INFO: renamed from: X.0pNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509430pNl {
    public static final AbstractC1509490pNr LIZ(Aweme aweme) {
        String aid = aweme.getAid();
        if (aid == null) {
            return null;
        }
        AbstractC1509490pNr abstractC1509490pNrLIZ = C1509480pNq.LIZ(aid);
        if (abstractC1509490pNrLIZ == null) {
            abstractC1509490pNrLIZ = new C1510370pPH(aid);
        }
        abstractC1509490pNrLIZ.LIZIZ(aweme);
        C1509480pNq.LIZIZ(abstractC1509490pNrLIZ, aid);
        return abstractC1509490pNrLIZ;
    }

    public static final AbstractC1509490pNr LIZIZ(String str) {
        boolean z;
        Aweme awemeLIZ;
        AbstractC1509490pNr abstractC1509490pNrLIZ = C1509480pNq.LIZ(str);
        if (abstractC1509490pNrLIZ != null) {
            return abstractC1509490pNrLIZ;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        MLCommonService.Companion.getClass();
        if (C0NAL.LIZ.getAwemeAdapter() != null && (awemeLIZ = C581560MrS.LIZ(str)) != null) {
            return LIZ(awemeLIZ);
        }
        C1510370pPH c1510370pPH = new C1510370pPH(str);
        C1509480pNq.LIZIZ(c1510370pPH, str);
        return c1510370pPH;
    }
}
