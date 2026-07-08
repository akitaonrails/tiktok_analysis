package X;

import android.net.Uri;

/* JADX INFO: renamed from: X.0kZo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324700kZo implements InterfaceC1324680kZm {
    public final InterfaceC1324680kZm LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC1324680kZm
    public final String LIZ() {
        return null;
    }

    @Override // X.InterfaceC1324680kZm
    public final int hashCode() {
        return (this.LIZ.hashCode() * 1013) + this.LIZIZ;
    }

    @Override // X.InterfaceC1324680kZm
    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(this.LIZ, "imageCacheKey");
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(this.LIZIZ), "frameIndex");
        return c1320100kSOLIZIZ.toString();
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean LIZIZ(Uri uri) {
        return this.LIZ.LIZIZ(uri);
    }

    @Override // X.InterfaceC1324680kZm
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1324700kZo)) {
            return false;
        }
        C1324700kZo c1324700kZo = (C1324700kZo) obj;
        if (this.LIZIZ == c1324700kZo.LIZIZ && this.LIZ.equals(c1324700kZo.LIZ)) {
            return true;
        }
        return false;
    }

    public C1324700kZo(InterfaceC1324680kZm interfaceC1324680kZm, int i) {
        this.LIZ = interfaceC1324680kZm;
        this.LIZIZ = i;
    }
}
