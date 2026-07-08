package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FO3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FO3 {
    public final ResourceItem LIZ;
    public C389150FNp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FO3)) {
            return false;
        }
        C0FO3 c0fo3 = (C0FO3) obj;
        return Intrinsics.LJFF(this.LIZ, c0fo3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fo3.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LyricEffectDataWrapper(resData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FO3(ResourceItem resourceItem, C389150FNp c389150FNp) {
        this.LIZ = resourceItem;
        this.LIZIZ = c389150FNp;
    }
}
