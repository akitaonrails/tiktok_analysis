package X;

import com.bytedance.android.btm.api.PageProp;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18EY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EY {
    static {
        new ConcurrentHashMap();
    }

    public static PageProp LIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        C18IP.LIZ.getClass();
        for (C18GZ c18gz : C18IP.LJJI) {
            if (Intrinsics.LJFF(c18gz.LIZ, obj.getClass()) || obj.getClass().getName().equals(c18gz.LIZIZ)) {
                return new PageProp(c18gz.LIZJ, c18gz.LIZLLL, c18gz.LJ, c18gz.LJFF, null, false);
            }
        }
        C18IP.LIZ.getClass();
        for (C18EW c18ew : C18IP.LJJIFFI) {
            if (Intrinsics.LJFF(c18ew.LIZ.get(), obj)) {
                return new PageProp(c18ew.LIZIZ, c18ew.LIZJ, c18ew.LIZLLL, c18ew.LJ, null, false);
            }
        }
        return null;
    }
}
