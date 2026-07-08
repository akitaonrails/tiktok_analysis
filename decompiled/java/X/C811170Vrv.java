package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Vrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C811170Vrv {
    public final Uri LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        Uri uri = this.LIZ;
        if (uri != null) {
            C786410Ut5.LJJIJL(bundle, "A", uri);
        }
        bundle.putInt("B", this.LIZIZ);
        bundle.putInt("C", this.LIZJ);
        bundle.putInt("E", 0);
        bundle.putInt("F", 0);
        if (!TextUtils.isEmpty(null)) {
            C786410Ut5.LJJJI("D", null, bundle);
        }
        return bundle;
    }

    public /* synthetic */ C811170Vrv(C811120Vrq c811120Vrq) {
        this.LIZ = c811120Vrq.LIZ;
        this.LIZIZ = c811120Vrq.LIZIZ;
        this.LIZJ = c811120Vrq.LIZJ;
    }
}
