package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.14xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20436914xz extends AbstractC20432914xL {
    public static final /* synthetic */ int LIZLLL = 0;

    public C20436914xz(String str, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        if (str.length() > 0) {
            return;
        }
        "password should not be empty".toString();
        throw new IllegalArgumentException("password should not be empty");
    }
}
