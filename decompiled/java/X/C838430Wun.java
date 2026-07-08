package X;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: X.0Wun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838430Wun {
    public final Resources LIZ;
    public final Resources.Theme LIZIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C838430Wun.class != obj.getClass()) {
            return false;
        }
        C838430Wun c838430Wun = (C838430Wun) obj;
        if (this.LIZ.equals(c838430Wun.LIZ) && Objects.equals(this.LIZIZ, c838430Wun.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C838430Wun(Resources resources, Resources.Theme theme) {
        this.LIZ = resources;
        this.LIZIZ = theme;
    }
}
