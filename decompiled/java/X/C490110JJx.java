package X;

import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: X.0JJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490110JJx {
    public static final C490110JJx LIZ = new C490110JJx();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C490100JJw());

    public static final InterfaceC490020JJo LIZ(Uri uri) {
        for (InterfaceC490020JJo interfaceC490020JJo : (List) LIZIZ.getValue()) {
            if (interfaceC490020JJo.canHandle(uri)) {
                return interfaceC490020JJo;
            }
        }
        C0K74.LIZ(EnumC490130JJz.INVALID_PATH, uri, null, "");
        return null;
    }
}
