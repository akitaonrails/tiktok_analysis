package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Bdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C292830Bdp {
    public final InterfaceC307670C4f LIZ;
    public volatile String LIZJ;
    public volatile C293230BeT LIZLLL;
    public final String LIZIZ = "__extra_exposed_vids";
    public final C293230BeT LJ = new C293230BeT(new C292840Bdq(this, "__extra_exposed_vids"));

    public final C293230BeT LIZ() {
        String strLJI = C292560BdO.LJI();
        if (!Intrinsics.LJFF(this.LIZJ, strLJI)) {
            this.LIZJ = strLJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("}_{");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append('}');
            this.LIZLLL = new C293230BeT(new C292840Bdq(this, C2188811AlT.LIZIZ(sbLIZ)));
        }
        return this.LIZLLL;
    }

    public C292830Bdp(InterfaceC307670C4f interfaceC307670C4f) {
        this.LIZ = interfaceC307670C4f;
    }

    public static List LIZIZ(String str) {
        List listLJJLIIIJILLIZJL;
        ArrayList arrayList = null;
        if (str != null && str.length() > 0 && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
