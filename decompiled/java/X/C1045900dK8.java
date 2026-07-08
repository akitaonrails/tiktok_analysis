package X;

import java.net.URL;

/* JADX INFO: renamed from: X.0dK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045900dK8 {
    public final String LIZ;
    public final URL LIZIZ;
    public final String LIZJ;

    public C1045900dK8(String str, URL url, String str2) {
        this.LIZ = str;
        this.LIZIZ = url;
        this.LIZJ = str2;
    }

    public static C1045900dK8 LIZ(String str, URL url, String str2) {
        C1045780dJw.LIZIZ(str, "VendorKey is null or empty");
        C1045780dJw.LIZIZ(str2, "VerificationParameters is null or empty");
        return new C1045900dK8(str, url, str2);
    }
}
