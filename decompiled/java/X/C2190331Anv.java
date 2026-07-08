package X;

import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPhotoLandingPrefetchConfig;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Anv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190331Anv {
    public static final C2190331Anv LIZ = new C2190331Anv();
    public static final SearchPhotoLandingPrefetchConfig LIZIZ = new SearchPhotoLandingPrefetchConfig(2, 4, 6, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3400, 8);
    public static final C01GW LIZJ;

    static {
        new SearchPhotoLandingPrefetchConfig(2, 3, 4, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3400, 6);
        new SearchPhotoLandingPrefetchConfig(3, 6, 9, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 3400, 12);
        LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(290));
    }

    public static SearchPhotoLandingPrefetchConfig LIZ() {
        return (SearchPhotoLandingPrefetchConfig) LIZJ.getValue();
    }
}
