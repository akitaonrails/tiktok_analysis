package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0NLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C592490NLr implements InterfaceC1324680kZm {
    public final String LIZ;

    @Override // X.InterfaceC1324680kZm
    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.InterfaceC1324680kZm
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1324680kZm
    public final String toString() {
        return this.LIZ;
    }

    public C592490NLr(String str) {
        str.getClass();
        this.LIZ = str;
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean LIZIZ(Uri uri) {
        return this.LIZ.contains(uri.toString());
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C592490NLr) {
            return this.LIZ.equals(((C592490NLr) obj).LIZ);
        }
        return false;
    }
}
