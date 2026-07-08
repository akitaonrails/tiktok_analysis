package X;

import java.io.File;

/* JADX INFO: renamed from: X.0krc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335740krc implements InterfaceC1317730kOZ {
    public final File LIZ;

    public final long LIZ() {
        return this.LIZ.length();
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1335740krc(File file) {
        this.LIZ = file;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1335740krc)) {
            return this.LIZ.equals(((C1335740krc) obj).LIZ);
        }
        return false;
    }
}
