package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0WrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836290WrL {
    public static final Bundle LIZ(String str, String str2, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2, bundle);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null, bundle);
        C786410Ut5.LJJJIL(bundle, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z2);
        return bundle;
    }
}
