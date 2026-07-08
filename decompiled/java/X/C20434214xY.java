package X;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: X.14xY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20434214xY extends C20434114xX {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZLLL;
    public final String LJ;

    public C20434214xY(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5, bundle);
        C786410Ut5.LJJJI("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6, bundle);
        C786410Ut5.LJJIJL(bundle, "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.LIZLLL = str;
        this.LJ = str2;
        if (str.length() > 0) {
            if (str2.length() > 0) {
                return;
            } else {
                throw new IllegalArgumentException("idToken should not be empty");
            }
        }
        throw new IllegalArgumentException("id should not be empty");
    }
}
