package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.13XC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13XC extends AbstractC836950WsP {
    public final String LJFF;

    public C13XC() {
        throw null;
    }

    public C13XC(String str) {
        C08CX c08cx = C08CX.INSTANCE;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", bundle);
        C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str, bundle);
        C786410Ut5.LJJIJ(bundle, "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", bundle2);
        C786410Ut5.LJJJI("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str, bundle2);
        C786410Ut5.LJJIJ(bundle2, "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, c08cx);
        this.LJFF = str;
        if (C1212290heV.LIZ(str)) {
            return;
        }
        "requestJson must not be empty, and must be a valid JSON".toString();
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
