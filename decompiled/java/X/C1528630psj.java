package X;

import com.google.api.client.googleapis.GoogleUtils;

/* JADX INFO: renamed from: X.0psj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528630psj extends AbstractC1528640psk {
    static {
        boolean z = GoogleUtils.LIZIZ.intValue() == 1 && GoogleUtils.LIZJ.intValue() >= 15;
        Object[] objArr = {GoogleUtils.LIZ};
        if (!z) {
            throw new IllegalStateException(C08KM.LIZ("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.19.0 of the YouTube Data API library.", objArr));
        }
    }

    public C1528630psj(final C136T c136t) {
        new C136O(c136t) { // from class: X.0psk
        };
    }
}
