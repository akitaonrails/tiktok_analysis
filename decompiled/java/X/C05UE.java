package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.05UE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05UE {
    public static final AtomicReference<String> LIZ = new AtomicReference<>(null);

    public static String LIZ(Context context) {
        if (C0LJ5.LIZIZ() && C0LJ5.LIZ().enableAsyncAllAlbumKey) {
            AtomicReference<String> atomicReference = LIZ;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            String strLIZJ = C540060LGa.LIZJ(context);
            atomicReference.set(strLIZJ);
            return strLIZJ;
        }
        return C540060LGa.LIZJ(context);
    }
}
