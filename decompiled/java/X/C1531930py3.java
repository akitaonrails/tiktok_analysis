package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0py3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531930py3 {
    public C1532720pzK LIZ;
    public Uri.Builder LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;

    public final C1532720pzK LIZIZ() {
        Uri uriBuild;
        if (!this.LIZJ) {
            return this.LIZ;
        }
        Uri.Builder builder = this.LIZIZ;
        if (builder == null || (uriBuild = builder.build()) == null) {
            C1532760pzO.LIZJ(C1532920pze.LIZJ, "NetUrlDelegate", "getUrlBundle", "uriBuilder is null", null, null, 48);
            return this.LIZ;
        }
        C1532720pzK c1532720pzKLIZ = C1532730pzL.LIZ(uriBuild.toString(), uriBuild, this.LIZ);
        this.LIZ = c1532720pzKLIZ;
        return c1532720pzKLIZ;
    }

    public C1531930py3(C1532720pzK c1532720pzK) {
        String path;
        this.LIZ = c1532720pzK;
        Uri uriLIZLLL = c1532720pzK.LIZLLL();
        if (uriLIZLLL != null) {
            uriLIZLLL.getHost();
        }
        Uri uriLIZLLL2 = this.LIZ.LIZLLL();
        this.LIZLLL = (uriLIZLLL2 == null || (path = uriLIZLLL2.getPath()) == null) ? "" : path;
    }

    public final void LIZJ(String str) {
        this.LIZJ = true;
        Uri.Builder builderBuildUpon = this.LIZIZ;
        if (builderBuildUpon == null) {
            Uri uriLIZLLL = this.LIZ.LIZLLL();
            if (uriLIZLLL != null) {
                builderBuildUpon = uriLIZLLL.buildUpon();
            } else {
                builderBuildUpon = null;
            }
        }
        this.LIZIZ = builderBuildUpon;
        if (builderBuildUpon != null) {
            builderBuildUpon.authority(str);
        }
    }

    public final void LIZLLL(String str) {
        this.LIZJ = true;
        this.LIZLLL = str;
        Uri.Builder builderBuildUpon = this.LIZIZ;
        if (builderBuildUpon == null) {
            Uri uriLIZLLL = this.LIZ.LIZLLL();
            if (uriLIZLLL != null) {
                builderBuildUpon = uriLIZLLL.buildUpon();
            } else {
                builderBuildUpon = null;
            }
        }
        this.LIZIZ = builderBuildUpon;
        if (builderBuildUpon != null) {
            builderBuildUpon.path(str);
        }
    }

    public final void LIZ(String str, String str2) {
        this.LIZJ = true;
        Uri.Builder builderBuildUpon = this.LIZIZ;
        if (builderBuildUpon == null) {
            Uri uriLIZLLL = this.LIZ.LIZLLL();
            if (uriLIZLLL != null) {
                builderBuildUpon = uriLIZLLL.buildUpon();
            } else {
                builderBuildUpon = null;
            }
        }
        this.LIZIZ = builderBuildUpon;
        if (builderBuildUpon != null) {
            builderBuildUpon.appendQueryParameter(str, str2);
        }
    }
}
