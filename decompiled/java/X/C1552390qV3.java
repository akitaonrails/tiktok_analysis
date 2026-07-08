package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0qV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552390qV3 {
    public static C1552230qUn LIZ(List list) {
        return new C1552230qUn(Collections.unmodifiableList(new ArrayList(list)), 0, new C1553450qWl(), null);
    }

    public static C1552230qUn LIZIZ(List list, InterfaceC1552320qUw interfaceC1552320qUw, AbstractC1552240qUo abstractC1552240qUo) {
        if (list != null) {
            C1552230qUn c1552230qUn = (C1552230qUn) interfaceC1552320qUw;
            InterfaceC1553480qWo c1553450qWl = c1552230qUn.LL;
            if (c1553450qWl == null) {
                c1553450qWl = new C1553450qWl();
            }
            C1552230qUn c1552230qUn2 = new C1552230qUn(Collections.unmodifiableList(new ArrayList(list)), 0, c1553450qWl, abstractC1552240qUo);
            c1552230qUn2.mBundleData = c1552230qUn.mBundleData;
            return c1552230qUn2;
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}
