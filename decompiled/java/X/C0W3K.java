package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0W3K, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3K {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZIZ, this.LIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LIZIZ, "applicationId");
        c0w3l.LIZ(this.LIZ, "apiKey");
        c0w3l.LIZ(this.LIZJ, "databaseUrl");
        c0w3l.LIZ(this.LJ, "gcmSenderId");
        c0w3l.LIZ(this.LJFF, "storageBucket");
        c0w3l.LIZ(this.LJI, "projectId");
        return c0w3l.toString();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Vkv] */
    public static C0W3K LIZ(final Context context) {
        ?? r1 = new Object(context) { // from class: X.0Vkv
            public final Resources LIZ;
            public final String LIZIZ;

            {
                C0W3J.LJIIIIZZ(context);
                Resources resources = context.getResources();
                this.LIZ = resources;
                this.LIZIZ = resources.getResourcePackageName(R.string.fq2);
            }

            public final String LIZ(String str) {
                int iN3 = C786410Ut5.n3(this.LIZ, str, "string", this.LIZIZ);
                if (iN3 == 0) {
                    return null;
                }
                return this.LIZ.getString(iN3);
            }
        };
        String strLIZ = r1.LIZ("google_app_id");
        if (TextUtils.isEmpty(strLIZ)) {
            return null;
        }
        return new C0W3K(strLIZ, r1.LIZ("google_api_key"), r1.LIZ("firebase_database_url"), r1.LIZ("ga_trackingId"), r1.LIZ("gcm_defaultSenderId"), r1.LIZ("google_storage_bucket"), r1.LIZ("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0W3K)) {
            return false;
        }
        C0W3K c0w3k = (C0W3K) obj;
        if (!C0W0T.LIZIZ(this.LIZIZ, c0w3k.LIZIZ) || !C0W0T.LIZIZ(this.LIZ, c0w3k.LIZ) || !C0W0T.LIZIZ(this.LIZJ, c0w3k.LIZJ) || !C0W0T.LIZIZ(this.LIZLLL, c0w3k.LIZLLL) || !C0W0T.LIZIZ(this.LJ, c0w3k.LJ) || !C0W0T.LIZIZ(this.LJFF, c0w3k.LJFF) || !C0W0T.LIZIZ(this.LJI, c0w3k.LJI)) {
            return false;
        }
        return true;
    }

    public C0W3K(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C0W3J.LJIIJ("ApplicationId must be set.", !C812240Vte.LIZ(str));
        this.LIZIZ = str;
        this.LIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
    }
}
