package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0WWF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWF {
    public final Intent LIZ;
    public final Bundle LIZIZ;

    public C0WWF(Intent intent, Bundle bundle) {
        this.LIZ = intent;
        this.LIZIZ = bundle;
    }

    public final void LIZ(Context context, Uri uri) throws Throwable {
        this.LIZ.setData(uri);
        C838410Wul.LJIIIIZZ(context, this.LIZ, this.LIZIZ);
    }
}
