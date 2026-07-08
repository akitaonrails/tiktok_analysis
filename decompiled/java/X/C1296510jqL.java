package X;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: X.0jqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296510jqL implements InterfaceC1324680kZm {
    public final List<InterfaceC1324680kZm> LIZ;

    @Override // X.InterfaceC1324680kZm
    public final String LIZ() {
        return this.LIZ.get(0).LIZ();
    }

    @Override // X.InterfaceC1324680kZm
    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.InterfaceC1324680kZm
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiCacheKey:");
        sbLIZ.append(this.LIZ.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1296510jqL(List<InterfaceC1324680kZm> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean LIZIZ(Uri uri) {
        for (int i = 0; i < this.LIZ.size(); i++) {
            if (this.LIZ.get(i).LIZIZ(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1296510jqL) {
            return this.LIZ.equals(((C1296510jqL) obj).LIZ);
        }
        return false;
    }
}
