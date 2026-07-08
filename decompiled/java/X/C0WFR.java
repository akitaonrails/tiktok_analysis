package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0WFR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WFR {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final Uri LIZ(Uri uri) {
        return uri.buildUpon().appendPath(this.LIZ).appendPath(this.LIZIZ).appendPath(this.LIZJ).appendPath(this.LIZLLL).build();
    }

    public C0WFR(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
