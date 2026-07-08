package X;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0y6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844480y6A implements InterfaceC21538819Ra {
    public final float LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.LIZ)});
    }

    public C1844480y6A(float f) {
        this.LIZ = f;
    }

    @Override // X.InterfaceC21538819Ra
    public final float LIZ(RectF rectF) {
        return this.LIZ * rectF.height();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1844480y6A) && this.LIZ == ((C1844480y6A) obj).LIZ) {
            return true;
        }
        return false;
    }
}
