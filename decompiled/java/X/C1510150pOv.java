package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0pOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510150pOv {
    public static final Aweme LIZ(C1510130pOt c1510130pOt) {
        Object objLIZ = c1510130pOt.LIZ("aweme");
        if (objLIZ instanceof Aweme) {
            return (Aweme) objLIZ;
        }
        return null;
    }

    public static final C1510130pOt LIZIZ(Aweme aweme, String str) {
        C1510130pOt c1510130pOt = new C1510130pOt();
        c1510130pOt.LJ(aweme, "aweme");
        c1510130pOt.LJ(str, "enterType");
        return c1510130pOt;
    }
}
