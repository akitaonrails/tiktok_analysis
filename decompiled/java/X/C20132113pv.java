package X;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: X.13pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20132113pv {
    public final Uri LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        if (this.LIZ != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(this.LIZ));
        }
        if (this.LIZIZ != null) {
            sb.append(" action=");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append(" mimetype=");
            sb.append(this.LIZJ);
        }
        sb.append(" }");
        return sb.toString();
    }

    public C20132113pv(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    public C20132113pv(Uri uri, String str, String str2) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
