package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161060gJs {
    public final C1161140gK0 LIZ;
    public final String LIZIZ;
    public final C1161060gJs LIZJ;
    public final List<C1161060gJs> LIZLLL;

    public C1161060gJs() {
        throw null;
    }

    public final boolean LIZ(String str) {
        if (this.LIZ.LIZJ == EnumC1161160gK2.GROUP && Intrinsics.LJFF(this.LIZIZ, "feed")) {
            return true;
        }
        C1161200gK6 c1161200gK6LIZ = C1161190gK5.LIZ(str);
        if (c1161200gK6LIZ != null) {
            InterfaceC1161120gJy interfaceC1161120gJy = c1161200gK6LIZ.LIZIZ.get(this.LIZ.LIZIZ);
            if (interfaceC1161120gJy != null) {
                interfaceC1161120gJy.LIZ();
            }
        }
        C1161060gJs c1161060gJs = this.LIZJ;
        if (c1161060gJs == null) {
            return false;
        }
        return c1161060gJs.LIZ(str);
    }

    public C1161060gJs(C1161140gK0 c1161140gK0, String str, C1161060gJs c1161060gJs) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = c1161140gK0;
        this.LIZIZ = str;
        this.LIZJ = c1161060gJs;
        this.LIZLLL = arrayList;
    }
}
