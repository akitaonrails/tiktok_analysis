package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.authorize.I18nAuthorizeFragment;

/* JADX INFO: renamed from: X.1B3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3Z {
    public static I18nAuthorizeFragment LIZ(Bundle bundle, boolean z, boolean z2) {
        I18nAuthorizeFragment i18nAuthorizeFragment = new I18nAuthorizeFragment();
        if (bundle != null) {
            bundle.putBoolean("is_ttbc_auth", z);
            bundle.putBoolean("has_been_initialized", z2);
        }
        i18nAuthorizeFragment.setArguments(bundle);
        return i18nAuthorizeFragment;
    }
}
