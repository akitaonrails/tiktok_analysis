package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.12eT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19806312eT {
    public final C19804712eD LIZ;

    public final boolean LIZIZ() {
        return this.LIZ.LJIIJJI().LJJI.LIZ() > 0;
    }

    public final boolean LIZJ() {
        if (!LIZIZ()) {
            return false;
        }
        this.LIZ.LJIILIIL.getClass();
        return System.currentTimeMillis() - this.LIZ.LJIIJJI().LJJI.LIZ() > this.LIZ.LJI.LJIIJJI(null, C19817012gC.LJJJJJ);
    }

    public C19806312eT(C19804712eD c19804712eD) {
        this.LIZ = c19804712eD;
    }

    public final void LIZ(Bundle bundle, String str) {
        String string;
        this.LIZ.LJIIL().LJ();
        if (!this.LIZ.LJFF()) {
            if (bundle.isEmpty()) {
                string = null;
            } else {
                if (str == null || str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                string = builder.build().toString();
            }
            if (!TextUtils.isEmpty(string)) {
                this.LIZ.LJIIJJI().LJJ.LIZIZ(string);
                C19811012fE c19811012fE = this.LIZ.LJIIJJI().LJJI;
                this.LIZ.LJIILIIL.getClass();
                c19811012fE.LIZIZ(System.currentTimeMillis());
            }
        }
    }
}
