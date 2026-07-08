package X;

import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: X.0kZz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324810kZz implements InterfaceC1325590kbF {
    public static C1324810kZz LIZLLL;
    public boolean LIZ;
    public boolean LIZIZ;
    public String[] LIZJ;

    public static synchronized C1324810kZz LJI() {
        if (LIZLLL == null) {
            LIZLLL = new C1324810kZz();
        }
        return LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0jhw] */
    @Override // X.InterfaceC1325590kbF
    public final C1291300jhw LIZLLL(C1325710kbR c1325710kbR) {
        final String string = c1325710kbR.LIZIZ.toString();
        final C1324630kZh c1324630kZh = c1325710kbR.LJIIJJI;
        final File fileLIZJ = c1325710kbR.LIZJ();
        return new InterfaceC1324680kZm(string, c1324630kZh, fileLIZJ) { // from class: X.0jhw
            public final String LIZ;
            public final C1324630kZh LIZIZ;
            public final String LIZJ;
            public final int LIZLLL;

            @Override // X.InterfaceC1324680kZm
            public final String toString() {
                return C786410Ut5.k4(null, "%s_%s_%s_%d", new Object[]{this.LIZ, this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL)});
            }

            @Override // X.InterfaceC1324680kZm
            public final String LIZ() {
                return toString();
            }

            @Override // X.InterfaceC1324680kZm
            public final int hashCode() {
                return this.LIZLLL;
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
                if (!(obj instanceof C1291300jhw)) {
                    return false;
                }
                C1291300jhw c1291300jhw = (C1291300jhw) obj;
                if (this.LIZLLL == c1291300jhw.LIZLLL && this.LIZ.equals(c1291300jhw.LIZ) && this.LIZIZ.equals(c1291300jhw.LIZIZ) && this.LIZJ.equals(c1291300jhw.LIZJ)) {
                    return true;
                }
                return false;
            }

            {
                string.getClass();
                this.LIZ = string;
                c1324630kZh.getClass();
                this.LIZIZ = c1324630kZh;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                fileLIZJ.getClass();
                sbLIZ.append(Long.toString(fileLIZJ.lastModified()));
                sbLIZ.append(Long.toString(fileLIZJ.length()));
                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                int iHashCode = string.hashCode();
                this.LIZLLL = ((((iHashCode + 31) * 31) + c1324630kZh.hashCode()) * 31) + string.hashCode();
            }
        };
    }

    @Override // X.InterfaceC1325590kbF
    public final C592490NLr LJ(Uri uri) {
        return new C592490NLr(LJFF(uri));
    }

    public final String LJFF(Uri uri) {
        if (this.LIZ) {
            if (uri == null) {
                return "";
            }
            if (!"http".equals(uri.getScheme()) && !"https".equals(uri.getScheme())) {
                return uri.toString();
            }
            String[] strArr = this.LIZJ;
            if (strArr != null && strArr.length > 0) {
                String host = uri.getHost();
                if (host != null) {
                    for (String str : this.LIZJ) {
                        if (str != null && host.endsWith(str)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(uri.getScheme());
                            sb.append(":");
                            if (uri.getEncodedAuthority() != null) {
                                sb.append("//");
                            }
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath != null) {
                                sb.append(encodedPath);
                            }
                            if (this.LIZIZ) {
                                return sb.toString();
                            }
                            String encodedQuery = uri.getEncodedQuery();
                            if (encodedQuery != null) {
                                sb.append("?");
                                sb.append(encodedQuery);
                            }
                            String encodedFragment = uri.getEncodedFragment();
                            if (encodedFragment != null) {
                                sb.append("#");
                                sb.append(encodedFragment);
                            }
                            return sb.toString();
                        }
                    }
                }
                return uri.toString();
            }
            return uri.toString();
        }
        return uri.toString();
    }

    @Override // X.InterfaceC1325590kbF
    public final C592490NLr LIZ(C1325710kbR c1325710kbR, Object obj) {
        return LJ(c1325710kbR.LIZIZ);
    }

    @Override // X.InterfaceC1325590kbF
    public final C1324660kZk LIZIZ(C1325710kbR c1325710kbR, Object obj) {
        InterfaceC1324680kZm postprocessorCacheKey;
        String name;
        InterfaceC1291910jiv interfaceC1291910jiv = c1325710kbR.LJIJJ;
        if (interfaceC1291910jiv != null) {
            postprocessorCacheKey = interfaceC1291910jiv.getPostprocessorCacheKey();
            name = interfaceC1291910jiv.getClass().getName();
        } else {
            postprocessorCacheKey = null;
            name = null;
        }
        return new C1324660kZk(LJFF(c1325710kbR.LIZIZ), c1325710kbR.LJIIJJI, c1325710kbR.LJIILIIL, c1325710kbR.LJIIJ, postprocessorCacheKey, name, obj);
    }

    @Override // X.InterfaceC1325590kbF
    public final C1324660kZk LIZJ(C1325710kbR c1325710kbR, Object obj) {
        return new C1324660kZk(LJFF(c1325710kbR.LIZIZ), c1325710kbR.LJIIJJI, c1325710kbR.LJIILIIL, c1325710kbR.LJIIJ, null, null, obj);
    }
}
