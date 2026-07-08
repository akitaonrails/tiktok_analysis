package X;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: X.0JJD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJD {
    public static final C0JJD LIZ = new C0JJD();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0JJ2());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0JJC());

    public static final List<InterfaceC490020JJo> LIZ() {
        return (List) LIZJ.getValue();
    }

    public static final InterfaceC490020JJo LIZIZ(Uri uri) {
        for (InterfaceC490020JJo interfaceC490020JJo : (List) LIZIZ.getValue()) {
            if (interfaceC490020JJo.canHandle(uri)) {
                return interfaceC490020JJo;
            }
        }
        C0JKC.LIZ(C0JJR.INVALID_PATH, uri);
        return null;
    }
}
