package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0kWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1322470kWD implements InterfaceC1324680kZm {
    public final String LIZ;

    @Override // X.InterfaceC1324680kZm
    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC1324680kZm
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1324680kZm
    public final String toString() {
        return this.LIZ;
    }

    public C1322470kWD(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("anim://");
        sbLIZ.append(i);
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean LIZIZ(Uri uri) {
        return uri.toString().startsWith(this.LIZ);
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1322470kWD.class != obj.getClass()) {
            return false;
        }
        String str = this.LIZ;
        String str2 = ((C1322470kWD) obj).LIZ;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }
}
