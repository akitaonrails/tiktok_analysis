package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.14xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20434514xb extends AbstractC20432914xL {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZLLL;

    public C20434514xb(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.LIZLLL = str;
        if (C1212290heV.LIZ(str)) {
            return;
        }
        "authenticationResponseJson must not be empty, and must be a valid JSON".toString();
        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
    }
}
