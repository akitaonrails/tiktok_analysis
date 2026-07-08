package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BOW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1BOW {
    public C2204051BNz LIZJ;
    public InterfaceC1530550pvp<n> LIZLLL;
    public boolean LJ;
    public Map<String, ?> LJII;
    public String LIZ = "";
    public String LIZIZ = "";
    public boolean LJFF = true;
    public String LJI = "";

    public final C1BP9 LIZ() {
        Uri uri;
        String scheme;
        String encodedAuthority;
        List<String> listLJJJJJ;
        String path;
        if (!C2203961BNq.LIZ().isWorkerEnabled || TextUtils.isEmpty(this.LIZIZ)) {
            return null;
        }
        Uri uri2 = !TextUtils.isEmpty(this.LIZ) ? UriProtector.parse(this.LIZ) : this.LIZJ.LJ;
        if (!this.LIZIZ.startsWith("javascript:")) {
            String str = this.LIZIZ;
            if (str != null && (uri = UriProtector.parse(str)) != null) {
                List<String> pathSegments = uri.getPathSegments();
                if (!(!pathSegments.isEmpty()) || (((scheme = uri.getScheme()) == null && (uri2 == null || (scheme = uri2.getScheme()) == null)) || ((encodedAuthority = uri.getEncodedAuthority()) == null && (uri2 == null || (encodedAuthority = uri2.getEncodedAuthority()) == null)))) {
                    return null;
                }
                if (Intrinsics.LJFF(C13LP.LJJJJZI(pathSegments), e3.d)) {
                    if (uri2 == null || (listLJJJJJ = uri2.getPathSegments()) == null) {
                        listLJJJJJ = C13BV.INSTANCE;
                    }
                    if (uri2 == null || (path = uri2.getPath()) == null) {
                        path = "";
                    }
                    if (!a0.LJJIJIIJIL(path, '/')) {
                        listLJJJJJ = C13LP.LJJJJJ(1, listLJJJJJ);
                    }
                    pathSegments = C13LP.LJLIL(C13LP.LJJJJIZL(pathSegments, 1), listLJJJJJ);
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(pathSegments, "/", null, null, 0, null, null, 62);
                Uri.Builder builder = new Uri.Builder();
                builder.scheme(scheme);
                builder.encodedAuthority(encodedAuthority);
                builder.encodedQuery(uri.getEncodedQuery());
                builder.path(strLJJLIIIJ);
                Uri uriBuild = builder.build();
                if (uriBuild != null) {
                    this.LIZIZ = uriBuild.toString();
                }
            }
            return null;
        }
        C2204051BNz c2204051BNz = this.LIZJ;
        if (c2204051BNz == null) {
            return null;
        }
        InterfaceC1535500q3o interfaceC1535500q3o = c2204051BNz.LJIIIIZZ;
        C1BP6 c1bp6 = new C1BP6(C1BP0.Worker, c2204051BNz, c2204051BNz.LJI);
        C2204051BNz c2204051BNz2 = this.LIZJ;
        try {
            return new C1BP9(c2204051BNz2, this.LJI, this.LIZIZ, uri2, interfaceC1535500q3o, c1bp6, c2204051BNz2.LJIIIZ, this.LIZLLL, this.LJ, this.LJFF, this.LJII);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
