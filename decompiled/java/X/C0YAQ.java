package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.UrlStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YAQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAQ {
    public final ModifyPropertyContent LIZ;
    public final UrlStruct LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YAQ)) {
            return false;
        }
        C0YAQ c0yaq = (C0YAQ) obj;
        return Intrinsics.LJFF(this.LIZ, c0yaq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0yaq.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        UrlStruct urlStruct = this.LIZIZ;
        return iHashCode + (urlStruct == null ? 0 : urlStruct.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalModifyPropertyContent(modifyPropertyContent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YAQ(ModifyPropertyContent modifyPropertyContent, UrlStruct urlStruct) {
        this.LIZ = modifyPropertyContent;
        this.LIZIZ = urlStruct;
    }
}
