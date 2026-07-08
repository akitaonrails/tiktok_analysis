package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0XHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846160XHi implements Cloneable {
    public List LL = new ArrayList(16);

    public final Object clone() {
        C846160XHi c846160XHi = (C846160XHi) super.clone();
        c846160XHi.LL = new ArrayList(this.LL);
        return c846160XHi;
    }

    public final InterfaceC846210XHn LIZ(String str) {
        for (int i = 0; i < ((ArrayList) this.LL).size(); i++) {
            InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) ListProtector.get(this.LL, i);
            if (interfaceC846210XHn.getName().equalsIgnoreCase(str)) {
                return interfaceC846210XHn;
            }
        }
        return null;
    }
}
