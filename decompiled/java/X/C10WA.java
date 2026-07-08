package X;

import android.os.Bundle;
import java.util.Date;

/* JADX INFO: renamed from: X.10WA, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10WA {
    public abstract Integer LIZ();

    public abstract Integer LIZIZ();

    public abstract String LIZJ();

    public abstract Date LIZLLL();

    public abstract Integer LJ();

    public static Integer LJFF(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }
}
