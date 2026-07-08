package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Za4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902020Za4 implements InterfaceC902130ZaF {
    public final Drawable LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C902020Za4) && Intrinsics.LJFF(this.LIZ, ((C902020Za4) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DrawableType(drawable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C902020Za4(TuxIconDrawable tuxIconDrawable) {
        this.LIZ = tuxIconDrawable;
    }
}
