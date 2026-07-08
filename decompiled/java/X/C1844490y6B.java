package X;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0y6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844490y6B implements InterfaceC21538819Ra {
    public final float LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.LIZ)});
    }

    public C1844490y6B(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC21538819Ra
    public final float LIZ(RectF rectF) {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1844490y6B) && this.LIZ == ((C1844490y6B) obj).LIZ) {
            return true;
        }
        return false;
    }
}
