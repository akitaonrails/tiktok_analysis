package X;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0pss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528720pss extends AbstractC1533800q14 {
    public final byte[] LL;

    @Override // X.AbstractC1533800q14
    public final boolean LJI() {
        return true;
    }

    @Override // X.AbstractC1533800q14
    public final File LJIILL() {
        return null;
    }

    @Override // X.AbstractC1533800q14
    public final String toString() {
        return "BytesDataProvider";
    }

    @Override // X.AbstractC1533800q14
    public final Integer LIZIZ() {
        return Integer.valueOf(this.LL.length);
    }

    @Override // X.AbstractC1533800q14
    public final InputStream LJIILLIIL() {
        return new ByteArrayInputStream(this.LL);
    }

    @Override // X.AbstractC1533800q14
    public final byte[] LJII() {
        return this.LL;
    }

    public C1528720pss(byte[] bArr) {
        this.LL = bArr;
    }
}
