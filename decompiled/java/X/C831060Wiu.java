package X;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0Wiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831060Wiu {
    public final C831420WjU<?> LIZ;
    public final Feature LIZIZ;

    public /* synthetic */ C831060Wiu(C831420WjU c831420WjU, Feature feature) {
        this.LIZ = c831420WjU;
        this.LIZIZ = feature;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public final String toString() {
        C0W3L c0w3l = new C0W3L(this);
        c0w3l.LIZ(this.LIZ, "key");
        c0w3l.LIZ(this.LIZIZ, "feature");
        return c0w3l.toString();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C831060Wiu)) {
            C831060Wiu c831060Wiu = (C831060Wiu) obj;
            if (C0W0T.LIZIZ(this.LIZ, c831060Wiu.LIZ) && C0W0T.LIZIZ(this.LIZIZ, c831060Wiu.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
}
