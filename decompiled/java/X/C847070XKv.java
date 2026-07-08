package X;

import java.util.Locale;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847070XKv {
    public static final C847070XKv LIZJ = new C847070XKv("", "");
    public static final String[] LIZLLL = {"did", "uid"};
    public final String LIZ;
    public final String LIZIZ;

    public final boolean LIZ() {
        if (this.LIZ.length() > 0) {
            return C13LQ.LJJIJIIJI(this.LIZIZ.toLowerCase(Locale.getDefault()), LIZLLL) >= 0;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C847070XKv)) {
            return false;
        }
        C847070XKv c847070XKv = (C847070XKv) obj;
        if (!u.LJIJI(this.LIZ, c847070XKv.LIZ, true) || !u.LJIJI(this.LIZIZ, c847070XKv.LIZIZ, true)) {
            return false;
        }
        return true;
    }

    public C847070XKv(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
