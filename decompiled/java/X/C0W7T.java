package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0W7T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7T {
    public static final Uri LJ = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ, null, Integer.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL)});
    }

    public final String toString() {
        String str = this.LIZ;
        if (str != null) {
            return str;
        }
        C0W3J.LJIIIIZZ(null);
        throw null;
    }

    public final Intent LIZ(Context context) throws Throwable {
        Bundle bundleLJJIJL;
        Intent intent = null;
        if (this.LIZ != null) {
            if (this.LIZLLL) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("serviceActionBundleKey", this.LIZ, bundle);
                try {
                    bundleLJJIJL = C2204961BRm.LJJIJL(context.getContentResolver(), LJ, "serviceIntentCall", null, bundle, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCOLFl82r4DBRtwtJR", new String[]{"016a9"}));
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    bundleLJJIJL = null;
                }
                if (bundleLJJIJL != null) {
                    intent = (Intent) bundleLJJIJL.getParcelable("serviceResponseIntentKey");
                }
            }
            if (intent == null) {
                return new Intent(this.LIZ).setPackage(this.LIZIZ);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0W7T)) {
            return false;
        }
        C0W7T c0w7t = (C0W7T) obj;
        if (C0W0T.LIZIZ(this.LIZ, c0w7t.LIZ) && C0W0T.LIZIZ(this.LIZIZ, c0w7t.LIZIZ) && C0W0T.LIZIZ(null, null) && this.LIZJ == c0w7t.LIZJ && this.LIZLLL == c0w7t.LIZLLL) {
            return true;
        }
        return false;
    }

    public C0W7T(int i, String str, String str2, boolean z) {
        C0W3J.LJI(str);
        this.LIZ = str;
        C0W3J.LJI(str2);
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
