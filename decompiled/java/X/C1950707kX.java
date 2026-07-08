package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1950707kX {
    public final Activity LIZ;
    public Uri LIZIZ;
    public final Intent LIZJ;
    public final Uri LIZLLL;
    public final HashMap<String, Object> LJ;
    public final C19261610Xe LJFF;
    public Integer LJI;
    public String LJII;
    public AbstractC1950207kS<?> LJIIIIZZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeepLinkData(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalUri=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appendedIntent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deeplinkSchemeInnerUri=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1950707kX(Activity activity, Uri uri, Intent intent, Uri uri2) {
        this.LIZ = activity;
        this.LIZIZ = uri;
        this.LIZJ = intent;
        this.LIZLLL = uri2;
        new HashMap();
        this.LJ = new HashMap<>();
        this.LJFF = new C19261610Xe();
    }
}
