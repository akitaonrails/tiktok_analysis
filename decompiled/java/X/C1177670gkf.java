package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.api.ILocationServiceForLS;

/* JADX INFO: renamed from: X.0gkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177670gkf {
    public static final C1177670gkf LIZ = new C1177670gkf();

    public static boolean LIZ() {
        if (C300190Bph.LIZ()) {
            ILocationServiceForLS iLocationServiceForLS = (ILocationServiceForLS) PluggableExtentionKt.pluggableSpi$default(ILocationServiceForLS.class, false, false, false, 14, null);
            return (iLocationServiceForLS != null ? iLocationServiceForLS.LIZJ(C1177680gkg.LJ) : null) == EnumC1205470hTV.SUCCESS;
        }
        C1207340hWW c1207340hWW = C1207340hWW.LIZ;
        String str = C1177680gkg.LIZJ;
        String str2 = C1177680gkg.LIZLLL;
        c1207340hWW.getClass();
        return C1207340hWW.LJI(str, str2);
    }
}
