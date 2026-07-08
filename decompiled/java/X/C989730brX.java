package X;

import java.util.List;

/* JADX INFO: renamed from: X.0brX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989730brX {
    public final int LIZ;
    public final List<Integer> LIZIZ;

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UiComponentInfo(component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", animTypeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989730brX(int i, List<Integer> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
