package X;

import android.util.Base64;

/* JADX INFO: renamed from: X.0W9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC818550W9d {
    public abstract String LIZIZ();

    public abstract byte[] LIZJ();

    public abstract EnumC816340W0q LIZLLL();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = LIZIZ();
        objArr[1] = LIZLLL();
        objArr[2] = LIZJ() == null ? "" : Base64.encodeToString(LIZJ(), 2);
        return C786410Ut5.j4("TransportContext(%s, %s, %s)", objArr);
    }

    public static C818570W9f LIZ() {
        C818570W9f c818570W9f = new C818570W9f();
        c818570W9f.LIZJ(EnumC816340W0q.DEFAULT);
        return c818570W9f;
    }
}
