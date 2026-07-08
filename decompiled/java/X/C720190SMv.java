package X;

import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0SMv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720190SMv {
    public static final Map<String, WeakReference<InterfaceC1336190ksL>> LIZ = new HashMap();
    public static boolean LIZIZ = false;

    public static WeakReference<InterfaceC1336190ksL> LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (WeakReference) ((HashMap) LIZ).get(uri.toString());
    }

    public static void LIZIZ(Uri uri) {
        if (LIZIZ && uri != null) {
            ((HashMap) LIZ).remove(uri.toString());
        }
    }
}
