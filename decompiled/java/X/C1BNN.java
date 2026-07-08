package X;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1BNN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNN implements InterfaceC1532650pzD {
    public static final String LJII = Charset.defaultCharset().name();
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final EnumC1535440q3i LJFF;
    public final InputStream LJI;

    @Override // X.InterfaceC1532650pzD
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1532650pzD
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1532650pzD
    public final EnumC1535440q3i LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1532650pzD
    public final InputStream getData() {
        return this.LJI;
    }

    @Override // X.InterfaceC1532650pzD
    public final Map<String, String> getHeaders() {
        return this.LJ;
    }

    @Override // X.InterfaceC1532650pzD
    public final String getMimeType() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1532650pzD
    public final int getStatusCode() {
        return this.LIZJ;
    }

    public C1BNN(String str, String str2, int i, String str3, Map<String, String> map, EnumC1535440q3i enumC1535440q3i, InputStream inputStream) {
        this.LIZ = (str == null || str.isEmpty()) ? "text/html" : str;
        this.LIZIZ = (str2 == null || str2.isEmpty()) ? LJII : str2;
        this.LIZJ = i;
        this.LIZLLL = (str3 == null || str3.isEmpty()) ? "" : str3;
        if (map == null) {
            this.LJ = new HashMap();
        } else {
            this.LJ = map;
        }
        this.LJFF = enumC1535440q3i;
        this.LJI = inputStream;
    }
}
