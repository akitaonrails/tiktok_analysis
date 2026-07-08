package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;

/* JADX INFO: renamed from: X.1BI9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BI9 {
    public Context LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public InterfaceC2202491BHz LIZLLL;
    public Bundle LJ;
    public final AccessToken LJFF;

    public C1BI9(C19EG c19eg, String str, Bundle bundle) {
        AccessToken.Companion.getClass();
        this.LJFF = C2202721BIw.LIZIZ();
        if (!C2202721BIw.LIZJ()) {
            C0W7K.LIZLLL(c19eg, "context");
            this.LIZIZ = FacebookSdk.LIZLLL();
        }
        this.LIZ = c19eg;
        this.LIZJ = str;
        if (bundle != null) {
            this.LJ = bundle;
        } else {
            this.LJ = new Bundle();
        }
    }

    public C1BI9(C19EG c19eg, String str, Bundle bundle, int i) {
        if (str == null) {
            C0W7K.LIZLLL(c19eg, "context");
            str = FacebookSdk.LIZLLL();
        }
        C0W7K.LJ(str, "applicationId");
        this.LIZIZ = str;
        this.LIZ = c19eg;
        this.LIZJ = "oauth";
        this.LJ = bundle;
    }
}
